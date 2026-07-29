package com.mopub.mobileads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.common.Constants;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.util.Utils;
import com.mopub.network.Networking;

/* loaded from: classes2.dex */
class VastWebView extends BaseWebView {
    VastWebViewClickListener mVastWebViewClickListener;

    interface VastWebViewClickListener {
        void onVastWebViewClick();
    }

    VastWebView(Context context) {
        super(context);
        disableScrollingAndZoom();
        getSettings().setJavaScriptEnabled(true);
        enablePlugins(true);
        setBackgroundColor(0);
        setOnTouchListener(new VastWebViewOnTouchListener());
        setId((int) Utils.generateUniqueId());
    }

    void loadData(String str) {
        loadDataWithBaseURL(Networking.getBaseUrlScheme() + "://" + Constants.HOST + "/", str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, AudienceNetworkActivity.WEBVIEW_ENCODING, null);
    }

    void setVastWebViewClickListener(VastWebViewClickListener vastWebViewClickListener) {
        this.mVastWebViewClickListener = vastWebViewClickListener;
    }

    private void disableScrollingAndZoom() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setScrollBarStyle(0);
    }

    static VastWebView createView(Context context, VastResource vastResource) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(vastResource);
        VastWebView vastWebView = new VastWebView(context);
        vastResource.initializeWebView(vastWebView);
        return vastWebView;
    }

    class VastWebViewOnTouchListener implements View.OnTouchListener {
        private boolean mClickStarted;

        VastWebViewOnTouchListener() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.mClickStarted = true;
                    return false;
                case 1:
                    if (!this.mClickStarted) {
                        return false;
                    }
                    this.mClickStarted = false;
                    if (VastWebView.this.mVastWebViewClickListener != null) {
                        VastWebView.this.mVastWebViewClickListener.onVastWebViewClick();
                    }
                    return false;
                default:
                    return false;
            }
        }
    }

    @VisibleForTesting
    @Deprecated
    VastWebViewClickListener getVastWebViewClickListener() {
        return this.mVastWebViewClickListener;
    }
}
