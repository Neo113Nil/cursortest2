package com.aiming.mdt.mobileads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.aiming.mdt.a.C0086;
import com.aiming.mdt.a.C0106;
import com.aiming.mdt.a.C0147;
import com.aiming.mdt.a.InterfaceC0085;
import com.aiming.mdt.mediation.CustomNativeEvent;
import com.aiming.mdt.nativead.AdIconView;
import com.aiming.mdt.nativead.AdInfo;
import com.aiming.mdt.nativead.MediaView;
import com.aiming.mdt.nativead.NativeAdView;
import java.util.Map;

/* loaded from: classes.dex */
public class AdtimingNative extends CustomNativeEvent implements InterfaceC0085 {
    private C0147 mAd;
    private int mAdMark;
    private C0106 mNativeAd;

    private void addAndShowAdLogo(ViewGroup viewGroup, Context context) {
        try {
            if (this.mAdMark == 1) {
                C0086 c0086 = new C0086(context);
                viewGroup.addView(c0086);
                ((RelativeLayout.LayoutParams) c0086.getLayoutParams()).addRule(11);
                ((RelativeLayout.LayoutParams) c0086.getLayoutParams()).addRule(10);
                c0086.getLayoutParams().width = -2;
                c0086.getLayoutParams().height = -2;
                c0086.bringToFront();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void destroy(Activity activity) {
        if (this.mNativeAd != null) {
            this.mNativeAd.m380();
            this.mNativeAd = null;
        }
        this.isDestroyed = true;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public int getMediation() {
        return 0;
    }

    @Override // com.aiming.mdt.mediation.CustomAdEvent
    public void loadAd(Activity activity, Map<String, String> map) {
        super.loadAd(activity, map);
        if (check(activity, map)) {
            this.mAdMark = Integer.valueOf(map.get("ad_mark")).intValue();
            if (this.mNativeAd == null) {
                this.mNativeAd = new C0106(activity, this.mInstancesKey);
                this.mNativeAd.m382(this);
            }
            this.mNativeAd.m379();
        }
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdClicked() {
        if (this.isDestroyed) {
            return;
        }
        onInsClicked();
    }

    @Override // com.aiming.mdt.adt.InterfaceC0231
    public void onAdFailed(String str) {
        if (this.isDestroyed) {
            return;
        }
        onInsError(str);
    }

    @Override // com.aiming.mdt.a.InterfaceC0085
    public void onAdReady(C0147 c0147) {
        if (this.isDestroyed) {
            return;
        }
        this.mAd = c0147;
        AdInfo adInfo = new AdInfo();
        adInfo.setDesc(c0147.m572());
        adInfo.setType(0);
        adInfo.setTitle(c0147.m569());
        adInfo.setCallToActionText(c0147.m571());
        onInsReady(adInfo);
    }

    @Override // com.aiming.mdt.mediation.CustomNativeEvent
    public void registerNativeView(NativeAdView nativeAdView) {
        try {
            if (!this.isDestroyed && this.mAd != null) {
                if (nativeAdView.getMediaView() != null) {
                    MediaView mediaView = nativeAdView.getMediaView();
                    if (this.mAd.m568() != null) {
                        mediaView.removeAllViews();
                        ImageView imageView = new ImageView(nativeAdView.getContext());
                        mediaView.addView(imageView);
                        imageView.setImageBitmap(this.mAd.m568());
                        imageView.getLayoutParams().width = -1;
                        imageView.getLayoutParams().height = -1;
                    }
                    this.mNativeAd.m381(mediaView);
                }
                if (nativeAdView.getAdIconView() != null) {
                    AdIconView adIconView = nativeAdView.getAdIconView();
                    if (this.mAd.m570() != null) {
                        adIconView.removeAllViews();
                        ImageView imageView2 = new ImageView(nativeAdView.getContext());
                        adIconView.addView(imageView2);
                        imageView2.setImageBitmap(this.mAd.m570());
                        imageView2.getLayoutParams().width = -1;
                        imageView2.getLayoutParams().height = -1;
                    }
                    this.mNativeAd.m381(adIconView);
                }
                if (nativeAdView.getTitleView() != null) {
                    this.mNativeAd.m381(nativeAdView.getTitleView());
                }
                if (nativeAdView.getDescView() != null) {
                    this.mNativeAd.m381(nativeAdView.getDescView());
                }
                if (nativeAdView.getCallToActionView() != null) {
                    this.mNativeAd.m381(nativeAdView.getCallToActionView());
                }
                addAndShowAdLogo(nativeAdView, nativeAdView.getContext());
            }
        } catch (Throwable unused) {
        }
    }
}
