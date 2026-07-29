package com.mopub.common.privacy;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mopub.common.Constants;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.ConsentDialogRequest;
import com.mopub.mobileads.MoPubErrorCode;
import com.mopub.network.MoPubNetworkError;
import com.mopub.network.Networking;
import com.mopub.volley.VolleyError;

/* loaded from: classes2.dex */
public class ConsentDialogController implements ConsentDialogRequest.Listener {
    private final Context mAppContext;
    private ConsentDialogListener mExtListener;
    private final Handler mHandler;
    private String mHtmlBody;
    private boolean mReady;
    private boolean mRequestInFlight;

    ConsentDialogController(Context context) {
        Preconditions.checkNotNull(context);
        this.mAppContext = context.getApplicationContext();
        this.mHandler = new Handler();
    }

    @Override // com.mopub.common.privacy.ConsentDialogRequest.Listener
    public void onSuccess(ConsentDialogResponse consentDialogResponse) {
        this.mRequestInFlight = false;
        this.mHtmlBody = consentDialogResponse.getHtml();
        if (TextUtils.isEmpty(this.mHtmlBody)) {
            this.mReady = false;
            if (this.mExtListener != null) {
                this.mExtListener.onConsentDialogLoadFailed(MoPubErrorCode.INTERNAL_ERROR);
                return;
            }
            return;
        }
        this.mReady = true;
        if (this.mExtListener != null) {
            this.mExtListener.onConsentDialogLoaded();
        }
    }

    @Override // com.mopub.volley.Response.ErrorListener
    public void onErrorResponse(VolleyError volleyError) {
        ConsentDialogListener consentDialogListener = this.mExtListener;
        resetState();
        if (consentDialogListener != null && (volleyError instanceof MoPubNetworkError)) {
            if (AnonymousClass2.$SwitchMap$com$mopub$network$MoPubNetworkError$Reason[((MoPubNetworkError) volleyError).getReason().ordinal()] == 1) {
                consentDialogListener.onConsentDialogLoadFailed(MoPubErrorCode.INTERNAL_ERROR);
            } else {
                consentDialogListener.onConsentDialogLoadFailed(MoPubErrorCode.UNSPECIFIED);
            }
        }
    }

    /* renamed from: com.mopub.common.privacy.ConsentDialogController$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$mopub$network$MoPubNetworkError$Reason = new int[MoPubNetworkError.Reason.values().length];

        static {
            try {
                $SwitchMap$com$mopub$network$MoPubNetworkError$Reason[MoPubNetworkError.Reason.BAD_BODY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    void loadConsentDialog(final ConsentDialogListener consentDialogListener, String str) {
        Preconditions.checkNotNull(str);
        if (this.mReady) {
            if (consentDialogListener != null) {
                this.mHandler.post(new Runnable() { // from class: com.mopub.common.privacy.ConsentDialogController.1
                    @Override // java.lang.Runnable
                    public void run() {
                        consentDialogListener.onConsentDialogLoaded();
                    }
                });
            }
        } else {
            if (this.mRequestInFlight) {
                MoPubLog.d("Already making a consent dialog load request.");
                return;
            }
            this.mExtListener = consentDialogListener;
            this.mRequestInFlight = true;
            Networking.getRequestQueue(this.mAppContext).add(new ConsentDialogRequest(this.mAppContext, new ConsentDialogUrlGenerator(this.mAppContext, str).generateUrlString(Constants.HOST), this));
        }
    }

    boolean showConsentDialog() {
        if (!this.mReady || TextUtils.isEmpty(this.mHtmlBody)) {
            return false;
        }
        ConsentDialogActivity.start(this.mAppContext, this.mHtmlBody);
        resetState();
        return true;
    }

    boolean isReady() {
        return this.mReady;
    }

    private void resetState() {
        this.mRequestInFlight = false;
        this.mReady = false;
        this.mExtListener = null;
        this.mHtmlBody = null;
    }
}
