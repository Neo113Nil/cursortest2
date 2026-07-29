package com.youappi.sdk.ui.views;

import android.content.Context;
import android.util.Log;
import android.widget.FrameLayout;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.ads.YAInterstitialAd;
import com.youappi.sdk.ads.YAInterstitialVideoAd;
import com.youappi.sdk.logic.IAdEventListener;
import com.youappi.sdk.logic.IAssetResolver;
import com.youappi.sdk.trackers.b;
import com.youappi.sdk.ui.model.VideoCardViewModel;

/* loaded from: classes2.dex */
public class InterstitialVideoAdView extends FrameLayout implements BaseAd.AdStateListener, IAdView<VideoCardViewModel, YAInterstitialVideoAd.InterstitialVideoAdListener> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9491a = "InterstitialVideoAdView";

    /* renamed from: b, reason: collision with root package name */
    private CardAdView f9492b;

    /* renamed from: c, reason: collision with root package name */
    private VideoAdView f9493c;

    /* renamed from: d, reason: collision with root package name */
    private YAInterstitialVideoAd.InterstitialVideoAdListener f9494d;
    private VideoCardViewModel e;
    private BaseAd.AdStateListener f;

    public InterstitialVideoAdView(Context context) {
        super(context);
        b();
    }

    private void b() {
        this.f9492b = new CardAdView(getContext());
        this.f9493c = new VideoAdView(getContext());
        addView(this.f9493c, new FrameLayout.LayoutParams(-1, -1));
    }

    public void a() {
        Log.w(f9491a, "switchToEndCard");
        removeView(this.f9493c);
        if (this.e.getCardViewModel() == null || this.f9492b.getParent() != null) {
            return;
        }
        addView(this.f9492b, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public InterstitialVideoAdView getView() {
        return this;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void loadAd() {
        if (this.e.getCardViewModel() != null) {
            this.f9492b.loadAd();
        }
        this.f9493c.loadAd();
    }

    @Override // com.youappi.sdk.BaseAd.AdStateListener
    public void onAdClosed(IAdView iAdView) {
        if ((this.f9493c != null && iAdView.getClass().equals(this.f9493c.getClass())) || VideoAdView.class.isAssignableFrom(iAdView.getClass())) {
            if (this.f != null) {
                this.f.requestOrientationChange(4);
            }
            b.a().c();
            if (this.e.getCardViewModel() != null) {
                a();
                return;
            }
            if (this.f9494d != null) {
                this.f9494d.onAdEnded(null);
            }
            if (this.f == null) {
                return;
            }
        } else if (((this.f9492b == null || !iAdView.getClass().equals(this.f9492b.getClass())) && !CardAdView.class.isAssignableFrom(iAdView.getClass())) || this.f == null) {
            return;
        }
        this.f.onAdClosed(iAdView);
    }

    @Override // com.youappi.sdk.BaseAd.AdStateListener
    public void onAdError(IAdView iAdView, int i, Throwable th) {
        if (this.f != null) {
            this.f.onAdError(iAdView, i, th);
            if (iAdView.getClass().equals(this.f9493c.getClass())) {
                this.f.onAdClosed(iAdView);
            }
        }
    }

    @Override // com.youappi.sdk.BaseAd.AdStateListener
    public void onAdSkipped(IAdView iAdView) {
        if (iAdView.getClass().equals(this.f9493c.getClass())) {
            onAdClosed(iAdView);
        }
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onPause() {
        if (this.f9493c != null) {
            this.f9493c.onPause();
        }
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onResume() {
        if (this.f9493c != null) {
            this.f9493c.onResume();
        }
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onStart() {
        this.f9493c.onStart();
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onUserInteraction() {
        if (getView() == null || getView().getChildCount() <= 0 || getView().getChildAt(0) != this.f9492b) {
            return;
        }
        this.f9492b.onUserInteraction();
    }

    @Override // com.youappi.sdk.BaseAd.AdStateListener
    public void requestOrientationChange(int i) {
        this.f.requestOrientationChange(i);
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setAdItem(VideoCardViewModel videoCardViewModel) {
        this.e = videoCardViewModel;
        if (videoCardViewModel.getCardViewModel() != null) {
            this.f9492b.setAdItem(videoCardViewModel.getCardViewModel());
        }
        this.f9493c.setAdItem(videoCardViewModel.getVideoViewModel());
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setAssetResolver(IAssetResolver iAssetResolver) {
        this.f9493c.setAssetResolver(iAssetResolver);
        this.f9492b.setAssetResolver(iAssetResolver);
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setDeviceId(String str) {
        if (this.f9493c != null) {
            this.f9493c.setDeviceId(str);
        }
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setInternalEventListener(IAdEventListener iAdEventListener) {
        this.f9493c.setInternalEventListener(iAdEventListener);
        this.f9492b.setInternalEventListener(iAdEventListener);
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setListener(YAInterstitialVideoAd.InterstitialVideoAdListener interstitialVideoAdListener) {
        this.f9494d = interstitialVideoAdListener;
        this.f9493c.setListener(interstitialVideoAdListener);
        this.f9492b.setListener((YAInterstitialAd.InterstitialAdListener) interstitialVideoAdListener);
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setStateListener(BaseAd.AdStateListener adStateListener) {
        this.f = adStateListener;
        this.f9492b.setStateListener(this);
        this.f9493c.setStateListener(this);
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void show() {
        this.f9493c.start();
    }
}
