package com.aiming.mdt.adt.video;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.aiming.mdt.a.C0033;
import com.aiming.mdt.a.C0042;
import com.aiming.mdt.a.C0045;
import com.aiming.mdt.a.C0054;
import com.aiming.mdt.a.C0076;
import com.aiming.mdt.a.C0095;
import com.aiming.mdt.a.C0128;
import com.aiming.mdt.a.C0131;
import com.aiming.mdt.a.C0139;
import com.aiming.mdt.a.C0162;
import com.aiming.mdt.adt.ActivityC0232;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0285;
import com.aiming.mdt.utils.webview.AdJSInterface;
import com.aiming.mdt.utils.webview.InterfaceC0267;
import com.aiming.mdt.utils.webview.ViewOnAttachStateChangeListenerC0269;
import com.tapjoy.TapjoyConstants;
import java.util.Locale;

/* loaded from: classes.dex */
public class VideoActivity extends ActivityC0232 implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, View.OnClickListener, InterfaceC0267 {
    private static final String EVENT_VIDEO_FINISH = "video_finish";
    private static final String EVENT_VIDEO_START = "video_start";
    private C0033 mDrawCrossMarkView;
    private C0285.HandlerC0287 mHandler;
    private AdJSInterface mJsInterface;
    private InterfaceC0221 mListener;
    private C0095 mPrgVideo;
    private RunnableC0220 mRunnable;
    private TextView mTxtSkip;
    private C0054 mVideoView;
    private boolean isVideoCompletion = false;
    private boolean isFullyWatched = true;
    private boolean isBackEnable = true;
    private int mVideoDuration = 0;
    private int mVideoProgress = 360;
    private int mVideoSkip = 0;
    private boolean isPause = false;
    private int mVideoStopPosition = 0;

    /* renamed from: com.aiming.mdt.adt.video.VideoActivity$ʻʼ, reason: contains not printable characters */
    private class RunnableC0220 implements Runnable {
        private RunnableC0220() {
        }

        /* synthetic */ RunnableC0220(VideoActivity videoActivity, byte b2) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoActivity.this.mHandler.postDelayed(this, 1000L);
            if (((ActivityC0232) VideoActivity.this).mAdView == null || ((ActivityC0232) VideoActivity.this).mAdView.getVisibility() == 0) {
                return;
            }
            VideoActivity.this.updateTxt();
        }
    }

    private void setVideoCompletion() {
        C0128.m479(this, EVENT_VIDEO_FINISH, this.mAdBean.getAdUrl());
        this.isVideoCompletion = true;
        this.mAdView.setVisibility(0);
        this.mTxtSkip.setVisibility(8);
        this.mVideoView.setVisibility(8);
        this.mPrgVideo.setVisibility(8);
        this.mAdView.loadUrl("javascript:sdk_show()");
        updateCloseBtnStatus();
    }

    private void updateCloseBtnStatus() {
        RunnableC0225 runnableC0225 = new RunnableC0225(this);
        if (this.mLytAd != null) {
            this.mLytAd.postDelayed(runnableC0225, 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTxt() {
        if (this.isPause) {
            return;
        }
        if (this.mVideoSkip != 0) {
            if (this.mPrgVideo != null) {
                this.mPrgVideo.m365(this.mVideoProgress);
                if (this.mVideoProgress != 0) {
                    this.mVideoProgress = this.mPrgVideo.m364() - 72;
                    return;
                }
                return;
            }
            return;
        }
        if (this.mVideoDuration == 0) {
            this.mTxtSkip.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf((this.mVideoView.getDuration() - this.mVideoView.getCurrentPosition()) / 1000)));
        } else {
            if (TextUtils.isEmpty(this.mTxtSkip.getText().toString())) {
                this.mTxtSkip.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(this.mVideoDuration)));
                return;
            }
            int parseInt = Integer.parseInt(this.mTxtSkip.getText().toString());
            if (parseInt != 0) {
                this.mTxtSkip.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(parseInt - 1)));
            } else {
                this.mVideoView.stopPlayback();
                setVideoCompletion();
            }
        }
    }

    @Override // com.aiming.mdt.adt.ActivityC0232
    protected void callbackWhenClose() {
        super.callbackWhenClose();
        if (this.mListener == null) {
            return;
        }
        if (this.isFullyWatched) {
            this.mListener.onAdRewarded();
        }
        this.mListener.onAdClose(this.isFullyWatched);
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    public void click() {
        callbackAdClickOnUIThread();
        C0128.m478(this, this.mAdBean);
        C0042.m99(this, this.mPlacementId, this.mAdBean);
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    public void close() {
        finish();
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    public void hideClose() {
        this.isBackEnable = false;
        updateCloseBtnStatus();
    }

    @Override // com.aiming.mdt.adt.ActivityC0232
    protected void initViewAndLoad(String str) {
        super.initViewAndLoad(str);
        this.mVideoView = new C0054(this);
        MediaController mediaController = new MediaController(this);
        mediaController.setVisibility(8);
        this.mVideoView.setMediaController(mediaController);
        this.mVideoView.setOnPreparedListener(this);
        this.mVideoView.setOnCompletionListener(this);
        if (this.mAdBean.getVpc() == 1) {
            this.mLytAd.setOnClickListener(this);
        }
        this.mLytAd.addView(this.mVideoView);
        if ("H".equals(getResources().getConfiguration().orientation == 2 ? "H" : "V")) {
            this.mVideoView.getLayoutParams().height = -1;
            this.mVideoView.getLayoutParams().width = -2;
            setRequestedOrientation(0);
        } else {
            this.mVideoView.getLayoutParams().height = -2;
            this.mVideoView.getLayoutParams().width = -1;
            setRequestedOrientation(1);
        }
        ((RelativeLayout.LayoutParams) this.mVideoView.getLayoutParams()).addRule(13);
        String absolutePath = C0139.m530(this, this.mAdBean.getVideoUrl(), null).getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            callbackAdErrorOnUIThread("Cann't find video path to display");
            finish();
        }
        this.mVideoView.setVideoPath(absolutePath);
        this.mVideoView.start();
        C0128.m479(this, EVENT_VIDEO_START, this.mAdBean.getAdUrl());
        this.mTxtSkip = new TextView(this);
        this.mTxtSkip.setTextColor(-1);
        this.mTxtSkip.setTextSize(2, 18.0f);
        this.mTxtSkip.setPadding(0, 30, 30, 0);
        this.mLytAd.addView(this.mTxtSkip);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mTxtSkip.getLayoutParams();
        layoutParams.addRule(11);
        this.mTxtSkip.setLayoutParams(layoutParams);
        this.mPrgVideo = new C0095(this);
        int i = (int) (((getResources().getDisplayMetrics().densityDpi / 160.0f) * 30.0f) + 0.5f);
        this.mPrgVideo.m365(360);
        this.mLytAd.addView(this.mPrgVideo);
        this.mPrgVideo.getLayoutParams().width = i;
        this.mPrgVideo.getLayoutParams().height = i;
        ((RelativeLayout.LayoutParams) this.mPrgVideo.getLayoutParams()).addRule(11);
        ((RelativeLayout.LayoutParams) this.mPrgVideo.getLayoutParams()).addRule(10);
        ((RelativeLayout.LayoutParams) this.mPrgVideo.getLayoutParams()).setMargins(0, 30, 30, 0);
        this.mPrgVideo.bringToFront();
        this.mPrgVideo.setOnClickListener(this);
        if (this.mVideoSkip == 1) {
            this.mTxtSkip.setVisibility(8);
            this.mPrgVideo.setVisibility(0);
        } else {
            this.mTxtSkip.setVisibility(0);
            this.mPrgVideo.setVisibility(8);
        }
        this.mAdView.setVisibility(8);
        this.mDrawCrossMarkView = new C0033(this, -7829368);
        this.mDrawCrossMarkView.setOnClickListener(this);
        int i2 = (int) (((getResources().getDisplayMetrics().densityDpi / 160.0f) * 20.0f) + 0.5f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams2.addRule(10);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(30, 30, 30, 30);
        this.mDrawCrossMarkView.setLayoutParams(layoutParams2);
        this.mDrawCrossMarkView.setVisibility(8);
        this.mLytAd.addView(this.mDrawCrossMarkView);
        if (this.mJsInterface == null) {
            this.mJsInterface = new AdJSInterface(this.mPlacementId, this.mAdBean.getOriData(), this);
        }
        ViewOnAttachStateChangeListenerC0269.m920();
        ViewOnAttachStateChangeListenerC0269.m921(this.mAdView, this.mJsInterface, TapjoyConstants.TJC_SDK_PLACEMENT);
        this.mAdView.loadUrl(str);
        C0128.m477(this, this.mPlacementId, this.mAdBean, false);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.isVideoCompletion) {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.mPrgVideo) {
            if (this.mPrgVideo.m364() == 0) {
                this.mVideoView.stopPlayback();
                this.isFullyWatched = false;
                setVideoCompletion();
                return;
            }
            return;
        }
        if (view == this.mDrawCrossMarkView) {
            onBackPressed();
        } else if (view == this.mLytAd) {
            callbackAdClickOnUIThread();
            C0128.m478(this, this.mAdBean);
            C0042.m99(this, this.mPlacementId, this.mAdBean);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        this.isFullyWatched = true;
        setVideoCompletion();
    }

    @Override // com.aiming.mdt.adt.ActivityC0232, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (this.mAdListener.get() != null) {
                this.mListener = (InterfaceC0221) this.mAdListener.get();
            }
            C0045 c0045 = ((C0131) C0162.m619().m622("Config", C0131.class)).m492().get(this.mPlacementId);
            byte b2 = 0;
            this.mVideoDuration = c0045 != null ? c0045.m128() : 0;
            this.mVideoSkip = c0045 != null ? c0045.m126() : 0;
            this.mHandler = new C0285.HandlerC0287(null);
            this.mRunnable = new RunnableC0220(this, b2);
            if (this.mListener != null) {
                this.mListener.onAdShowed();
            }
        } catch (Throwable th) {
            callbackAdErrorOnUIThread(th.getMessage());
            C0282.m972("VideoActivity", th);
            C0076.m232().m236(th);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        callbackAdCloseOnUIThread();
        if (this.mVideoView != null) {
            this.mVideoView.setOnCompletionListener(null);
            this.mVideoView.setOnPreparedListener(null);
            this.mVideoView.setMediaController(null);
            this.mVideoView = null;
        }
        if (this.mLytAd != null) {
            this.mLytAd.removeView(this.mVideoView);
            this.mLytAd.removeView(this.mDrawCrossMarkView);
            this.mLytAd.removeView(this.mTxtSkip);
            this.mLytAd.removeView(this.mPrgVideo);
            this.mLytAd.removeView(this.mAdView);
        }
        if (this.mJsInterface != null) {
            this.mJsInterface.onDestroy();
            this.mJsInterface = null;
        }
        if (this.mAdView != null) {
            this.mAdView.clearHistory();
            ViewOnAttachStateChangeListenerC0269.m920();
            ViewOnAttachStateChangeListenerC0269.m919(this.mAdView, TapjoyConstants.TJC_SDK_PLACEMENT);
        }
        if (this.mHandler != null) {
            this.mHandler.removeCallbacks(this.mRunnable);
            this.mRunnable = null;
            this.mHandler = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.mVideoView != null) {
            this.mVideoStopPosition = this.mVideoView.getCurrentPosition();
            this.mVideoView.pause();
            this.isPause = true;
        }
        super.onPause();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        int duration = (this.mVideoView.getDuration() - this.mVideoView.getCurrentPosition()) / 1000;
        if (this.mVideoDuration > duration) {
            this.mVideoDuration = duration;
        }
        if (TextUtils.isEmpty(this.mTxtSkip.getText())) {
            updateTxt();
            this.mHandler.post(this.mRunnable);
        }
        mediaPlayer.setOnSeekCompleteListener(new C0223(this));
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.mVideoView == null || this.isVideoCompletion || this.mVideoStopPosition == 0) {
            return;
        }
        this.mVideoView.resume();
        this.mVideoView.seekTo(this.mVideoStopPosition);
    }

    @Override // com.aiming.mdt.utils.webview.InterfaceC0267
    public void showClose() {
        this.isBackEnable = true;
        updateCloseBtnStatus();
    }
}
