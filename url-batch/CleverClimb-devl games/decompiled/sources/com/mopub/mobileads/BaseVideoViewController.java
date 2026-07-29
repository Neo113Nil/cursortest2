package com.mopub.mobileads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import com.mopub.common.IntentActions;
import com.mopub.common.Preconditions;
import com.mopub.common.logging.MoPubLog;

/* loaded from: classes2.dex */
public abstract class BaseVideoViewController {
    private final BaseVideoViewControllerListener mBaseVideoViewControllerListener;
    private Long mBroadcastIdentifier;
    private final Context mContext;
    private final RelativeLayout mLayout;

    public interface BaseVideoViewControllerListener {
        void onFinish();

        void onSetContentView(View view);

        void onSetRequestedOrientation(int i);

        void onStartActivityForResult(Class<? extends Activity> cls, int i, Bundle bundle);
    }

    public boolean backButtonEnabled() {
        return true;
    }

    protected abstract VideoView getVideoView();

    void onActivityResult(int i, int i2, Intent intent) {
    }

    protected abstract void onBackPressed();

    protected abstract void onConfigurationChanged(Configuration configuration);

    protected abstract void onDestroy();

    protected abstract void onPause();

    protected abstract void onResume();

    protected abstract void onSaveInstanceState(Bundle bundle);

    protected BaseVideoViewController(Context context, Long l, BaseVideoViewControllerListener baseVideoViewControllerListener) {
        Preconditions.checkNotNull(baseVideoViewControllerListener);
        this.mContext = context;
        this.mBroadcastIdentifier = l;
        this.mBaseVideoViewControllerListener = baseVideoViewControllerListener;
        this.mLayout = new RelativeLayout(this.mContext);
    }

    protected void onCreate() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.mLayout.addView(getVideoView(), 0, layoutParams);
        this.mBaseVideoViewControllerListener.onSetContentView(this.mLayout);
    }

    protected BaseVideoViewControllerListener getBaseVideoViewControllerListener() {
        return this.mBaseVideoViewControllerListener;
    }

    protected Context getContext() {
        return this.mContext;
    }

    public ViewGroup getLayout() {
        return this.mLayout;
    }

    protected void videoError(boolean z) {
        MoPubLog.e("Video cannot be played.");
        broadcastAction(IntentActions.ACTION_INTERSTITIAL_FAIL);
        if (z) {
            this.mBaseVideoViewControllerListener.onFinish();
        }
    }

    protected void videoCompleted(boolean z) {
        if (z) {
            this.mBaseVideoViewControllerListener.onFinish();
        }
    }

    void broadcastAction(String str) {
        if (this.mBroadcastIdentifier != null) {
            BaseBroadcastReceiver.broadcastAction(this.mContext, this.mBroadcastIdentifier.longValue(), str);
        } else {
            MoPubLog.w("Tried to broadcast a video event without a broadcast identifier to send to.");
        }
    }
}
