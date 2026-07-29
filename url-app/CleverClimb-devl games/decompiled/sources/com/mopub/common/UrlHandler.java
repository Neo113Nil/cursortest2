package com.mopub.common;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mopub.common.UrlResolutionTask;
import com.mopub.common.logging.MoPubLog;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.network.TrackingRequest;
import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class UrlHandler {
    private static final ResultActions EMPTY_CLICK_LISTENER = new ResultActions() { // from class: com.mopub.common.UrlHandler.1
        @Override // com.mopub.common.UrlHandler.ResultActions
        public void urlHandlingFailed(String str, UrlAction urlAction) {
        }

        @Override // com.mopub.common.UrlHandler.ResultActions
        public void urlHandlingSucceeded(String str, UrlAction urlAction) {
        }
    };
    private static final MoPubSchemeListener EMPTY_MOPUB_SCHEME_LISTENER = new MoPubSchemeListener() { // from class: com.mopub.common.UrlHandler.2
        @Override // com.mopub.common.UrlHandler.MoPubSchemeListener
        public void onClose() {
        }

        @Override // com.mopub.common.UrlHandler.MoPubSchemeListener
        public void onFailLoad() {
        }

        @Override // com.mopub.common.UrlHandler.MoPubSchemeListener
        public void onFinishLoad() {
        }
    };
    private boolean mAlreadySucceeded;
    private String mDspCreativeId;
    private MoPubSchemeListener mMoPubSchemeListener;
    private ResultActions mResultActions;
    private boolean mSkipShowMoPubBrowser;
    private EnumSet<UrlAction> mSupportedUrlActions;
    private boolean mTaskPending;

    public interface MoPubSchemeListener {
        void onClose();

        void onFailLoad();

        void onFinishLoad();
    }

    public interface ResultActions {
        void urlHandlingFailed(String str, UrlAction urlAction);

        void urlHandlingSucceeded(String str, UrlAction urlAction);
    }

    public static class Builder {
        private String creativeId;
        private EnumSet<UrlAction> supportedUrlActions = EnumSet.of(UrlAction.NOOP);
        private ResultActions resultActions = UrlHandler.EMPTY_CLICK_LISTENER;
        private MoPubSchemeListener moPubSchemeListener = UrlHandler.EMPTY_MOPUB_SCHEME_LISTENER;
        private boolean skipShowMoPubBrowser = false;

        public Builder withSupportedUrlActions(UrlAction urlAction, UrlAction... urlActionArr) {
            this.supportedUrlActions = EnumSet.of(urlAction, urlActionArr);
            return this;
        }

        public Builder withSupportedUrlActions(EnumSet<UrlAction> enumSet) {
            this.supportedUrlActions = EnumSet.copyOf((EnumSet) enumSet);
            return this;
        }

        public Builder withResultActions(ResultActions resultActions) {
            this.resultActions = resultActions;
            return this;
        }

        public Builder withMoPubSchemeListener(MoPubSchemeListener moPubSchemeListener) {
            this.moPubSchemeListener = moPubSchemeListener;
            return this;
        }

        public Builder withoutMoPubBrowser() {
            this.skipShowMoPubBrowser = true;
            return this;
        }

        public Builder withDspCreativeId(String str) {
            this.creativeId = str;
            return this;
        }

        public UrlHandler build() {
            return new UrlHandler(this.supportedUrlActions, this.resultActions, this.moPubSchemeListener, this.skipShowMoPubBrowser, this.creativeId);
        }
    }

    private UrlHandler(EnumSet<UrlAction> enumSet, ResultActions resultActions, MoPubSchemeListener moPubSchemeListener, boolean z, String str) {
        this.mSupportedUrlActions = EnumSet.copyOf((EnumSet) enumSet);
        this.mResultActions = resultActions;
        this.mMoPubSchemeListener = moPubSchemeListener;
        this.mSkipShowMoPubBrowser = z;
        this.mDspCreativeId = str;
        this.mAlreadySucceeded = false;
        this.mTaskPending = false;
    }

    EnumSet<UrlAction> getSupportedUrlActions() {
        return EnumSet.copyOf((EnumSet) this.mSupportedUrlActions);
    }

    ResultActions getResultActions() {
        return this.mResultActions;
    }

    MoPubSchemeListener getMoPubSchemeListener() {
        return this.mMoPubSchemeListener;
    }

    boolean shouldSkipShowMoPubBrowser() {
        return this.mSkipShowMoPubBrowser;
    }

    public void handleUrl(Context context, String str) {
        Preconditions.checkNotNull(context);
        handleUrl(context, str, true);
    }

    public void handleUrl(Context context, String str, boolean z) {
        Preconditions.checkNotNull(context);
        handleUrl(context, str, z, null);
    }

    public void handleUrl(final Context context, final String str, final boolean z, final Iterable<String> iterable) {
        Preconditions.checkNotNull(context);
        if (TextUtils.isEmpty(str)) {
            failUrlHandling(str, null, "Attempted to handle empty url.", null);
        } else {
            UrlResolutionTask.getResolvedUrl(str, new UrlResolutionTask.UrlResolutionListener() { // from class: com.mopub.common.UrlHandler.3
                @Override // com.mopub.common.UrlResolutionTask.UrlResolutionListener
                public void onSuccess(String str2) {
                    UrlHandler.this.mTaskPending = false;
                    UrlHandler.this.handleResolvedUrl(context, str2, z, iterable);
                }

                @Override // com.mopub.common.UrlResolutionTask.UrlResolutionListener
                public void onFailure(String str2, Throwable th) {
                    UrlHandler.this.mTaskPending = false;
                    UrlHandler.this.failUrlHandling(str, null, str2, th);
                }
            });
            this.mTaskPending = true;
        }
    }

    public boolean handleResolvedUrl(Context context, String str, boolean z, Iterable<String> iterable) {
        if (TextUtils.isEmpty(str)) {
            failUrlHandling(str, null, "Attempted to handle empty url.", null);
            return false;
        }
        UrlAction urlAction = UrlAction.NOOP;
        Uri parse = Uri.parse(str);
        Iterator it = this.mSupportedUrlActions.iterator();
        while (it.hasNext()) {
            UrlAction urlAction2 = (UrlAction) it.next();
            if (urlAction2.shouldTryHandlingUrl(parse)) {
                try {
                    urlAction2.handleUrl(this, context, parse, z, this.mDspCreativeId);
                    if (!this.mAlreadySucceeded && !this.mTaskPending && !UrlAction.IGNORE_ABOUT_SCHEME.equals(urlAction2)) {
                        if (!UrlAction.HANDLE_MOPUB_SCHEME.equals(urlAction2)) {
                            try {
                                TrackingRequest.makeTrackingHttpRequest(iterable, context);
                                this.mResultActions.urlHandlingSucceeded(parse.toString(), urlAction2);
                                this.mAlreadySucceeded = true;
                            } catch (IntentNotResolvableException e) {
                                e = e;
                                MoPubLog.d(e.getMessage(), e);
                                urlAction = urlAction2;
                            }
                        }
                    }
                    return true;
                } catch (IntentNotResolvableException e2) {
                    e = e2;
                }
            }
        }
        failUrlHandling(str, urlAction, "Link ignored. Unable to handle url: " + str, null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failUrlHandling(String str, UrlAction urlAction, String str2, Throwable th) {
        Preconditions.checkNotNull(str2);
        if (urlAction == null) {
            urlAction = UrlAction.NOOP;
        }
        MoPubLog.d(str2, th);
        this.mResultActions.urlHandlingFailed(str, urlAction);
    }
}
