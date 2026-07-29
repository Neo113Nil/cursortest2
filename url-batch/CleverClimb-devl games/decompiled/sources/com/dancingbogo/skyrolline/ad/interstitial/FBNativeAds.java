package com.dancingbogo.skyrolline.ad.interstitial;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.cmplay.a.d;
import com.cmplay.base.util.h;
import com.cmplay.base.util.m;
import com.dancingbogo.skyrolline.GameApp;
import com.dancingbogo.skyrolline.R;
import com.facebook.ads.Ad;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.customevent.CustomEventInterstitial;
import com.google.ads.mediation.customevent.CustomEventInterstitialListener;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class FBNativeAds implements CustomEventInterstitial {
    private static final String TAG = "zzb_fb";
    private View mAdView;
    private ImageView mBigImageView;
    private ImageView mIconImageView;
    private CustomEventInterstitialListener mListener;
    private MediaView mMediaView;
    private PopupWindow mWindowManager;
    private NativeAd nativeAd;

    @Override // com.google.ads.mediation.customevent.CustomEventInterstitial
    public void requestInterstitialAd(CustomEventInterstitialListener customEventInterstitialListener, final Activity activity, String str, String str2, MediationAdRequest mediationAdRequest, Object obj) {
        h.a(TAG, "requestInterstitialAd = " + str2);
        this.mListener = customEventInterstitialListener;
        this.nativeAd = new NativeAd(activity, str2);
        this.nativeAd.setAdListener(new AdListener() { // from class: com.dancingbogo.skyrolline.ad.interstitial.FBNativeAds.1
            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad ad, AdError adError) {
                h.a(FBNativeAds.TAG, "onError =" + adError.getErrorMessage());
                if (FBNativeAds.this.mListener != null) {
                    FBNativeAds.this.mListener.onFailedToReceiveAd();
                }
                new d().a(1, 3, adError.getErrorCode(), 108, 99);
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                if (ad != FBNativeAds.this.nativeAd) {
                    if (FBNativeAds.this.mListener != null) {
                        FBNativeAds.this.mListener.onFailedToReceiveAd();
                        return;
                    }
                    return;
                }
                h.a(FBNativeAds.TAG, "onAdLoaded =" + FBNativeAds.this.nativeAd.getAdTitle());
                if (FBNativeAds.this.mAdView == null) {
                    FBNativeAds.this.mAdView = LayoutInflater.from(activity).inflate(R.layout.fb_ad_layout, (ViewGroup) null);
                }
                LinearLayout linearLayout = (LinearLayout) FBNativeAds.this.mAdView.findViewById(R.id.ad_choices_container);
                FBNativeAds.this.mMediaView = (MediaView) FBNativeAds.this.mAdView.findViewById(R.id.native_ad_media);
                FBNativeAds.this.mIconImageView = (ImageView) FBNativeAds.this.mAdView.findViewById(R.id.iv_ad_icon);
                TextView textView = (TextView) FBNativeAds.this.mAdView.findViewById(R.id.tv_title);
                TextView textView2 = (TextView) FBNativeAds.this.mAdView.findViewById(R.id.native_ad_social_context);
                TextView textView3 = (TextView) FBNativeAds.this.mAdView.findViewById(R.id.tv_des);
                Button button = (Button) FBNativeAds.this.mAdView.findViewById(R.id.btn_calltoaction);
                textView.setText(FBNativeAds.this.nativeAd.getAdTitle());
                textView2.setText(FBNativeAds.this.nativeAd.getAdSocialContext());
                textView3.setText(FBNativeAds.this.nativeAd.getAdBody());
                button.setText(FBNativeAds.this.nativeAd.getAdCallToAction());
                NativeAd.downloadAndDisplayImage(FBNativeAds.this.nativeAd.getAdIcon(), FBNativeAds.this.mIconImageView);
                FBNativeAds.this.mMediaView.setNativeAd(FBNativeAds.this.nativeAd);
                linearLayout.addView(new AdChoicesView(activity, FBNativeAds.this.nativeAd, true));
                ArrayList arrayList = new ArrayList();
                arrayList.add(FBNativeAds.this.mMediaView);
                arrayList.add(FBNativeAds.this.mIconImageView);
                arrayList.add(button);
                FBNativeAds.this.nativeAd.registerViewForInteraction(FBNativeAds.this.mAdView, arrayList);
                if (FBNativeAds.this.mListener != null) {
                    FBNativeAds.this.mListener.onReceivedAd();
                }
                new d().a(1, 2, 0, 108, 99);
            }
        });
        this.nativeAd.loadAd(NativeAd.MediaCacheFlag.ALL);
        new d().a(1, 1, 0, 108, 99);
    }

    @Override // com.google.ads.mediation.customevent.CustomEventInterstitial
    public void showInterstitial() {
        if (this.mAdView == null) {
            h.a(TAG, "adView == null");
            return;
        }
        this.mAdView.findViewById(R.id.iv_close).setOnClickListener(new View.OnClickListener() { // from class: com.dancingbogo.skyrolline.ad.interstitial.FBNativeAds.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                h.a(FBNativeAds.TAG, "onClick close ------");
                FBNativeAds.this.dismissWindow();
            }
        });
        if (this.mWindowManager != null) {
            this.mWindowManager.dismiss();
            this.mWindowManager = null;
        }
        this.mWindowManager = new PopupWindow(this.mAdView, m.f(GameApp.f4485a), (m.d(GameApp.f4485a) - getStatusBarHeight()) - 10);
        this.mWindowManager.setFocusable(true);
        this.mWindowManager.setBackgroundDrawable(new BitmapDrawable());
        this.mWindowManager.showAtLocation(this.mAdView, 17, 0, 0);
        this.mWindowManager.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.dancingbogo.skyrolline.ad.interstitial.FBNativeAds.3
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                FBNativeAds.this.adRelease();
            }
        });
        if (this.mListener != null) {
            this.mListener.onPresentScreen();
        }
        new d().a(1, 4, 0, 108, 99);
    }

    public int getStatusBarHeight() {
        try {
            int identifier = GameApp.f4485a.getResources().getIdentifier("status_bar_height", "dimen", TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE);
            if (identifier > 0) {
                return GameApp.f4485a.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.google.ads.mediation.customevent.CustomEvent
    public void destroy() {
        if (this.nativeAd != null) {
            this.nativeAd.unregisterView();
            adRelease();
            this.nativeAd = null;
        }
        this.mAdView = null;
    }

    public void dismissWindow() {
        h.a(TAG, "dismissWindow ------");
        if (this.mWindowManager != null) {
            this.mWindowManager.dismiss();
            this.mWindowManager = null;
        }
    }

    public void adRelease() {
        h.a(TAG, "adRelease() ------");
        if (this.mListener != null) {
            this.mListener.onDismissScreen();
        }
        if (this.mMediaView != null) {
            this.mMediaView.clearAnimation();
            Bitmap drawingCache = this.mMediaView.getDrawingCache();
            if (drawingCache != null) {
                drawingCache.recycle();
            }
            this.mMediaView.destroyDrawingCache();
            this.mMediaView = null;
        }
        if (this.mIconImageView != null) {
            releaseImageViewResouce(this.mIconImageView);
        }
        this.mAdView = null;
    }

    public static void releaseImageViewResouce(ImageView imageView) {
        Drawable drawable;
        Bitmap bitmap;
        if (imageView == null || (drawable = imageView.getDrawable()) == null || !(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }
}
