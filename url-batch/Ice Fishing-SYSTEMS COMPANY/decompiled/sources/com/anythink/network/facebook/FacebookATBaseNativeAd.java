package com.anythink.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class FacebookATBaseNativeAd<T extends NativeAdBase> extends CustomNativeAd implements NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    T f23220a;

    /* renamed from: b, reason: collision with root package name */
    Context f23221b;

    /* renamed from: c, reason: collision with root package name */
    boolean f23222c;

    /* renamed from: d, reason: collision with root package name */
    a f23223d;

    /* renamed from: e, reason: collision with root package name */
    Map<String, Object> f23224e;

    /* renamed from: f, reason: collision with root package name */
    NativeAdLayout f23225f;

    /* renamed from: g, reason: collision with root package name */
    MediaView f23226g;

    /* renamed from: h, reason: collision with root package name */
    MediaView f23227h;
    private final String i = "FacebookATBaseNativeAd";

    public interface a {
        void onLoadFail(String str, String str2);

        void onLoadSuccess();
    }

    public FacebookATBaseNativeAd(Context context, T t9, boolean z8) {
        this.f23221b = context.getApplicationContext();
        this.f23220a = t9;
        this.f23222c = z8;
    }

    private void a(View view, FrameLayout.LayoutParams layoutParams) {
        AdOptionsView adOptionsView = new AdOptionsView(view.getContext(), this.f23220a, this.f23225f);
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 53;
        }
        if (layoutParams.height > 0) {
            adOptionsView.setIconSizeDp((int) ((layoutParams.height / this.f23221b.getResources().getDisplayMetrics().density) + 0.5f));
        }
        this.f23225f.addView(adOptionsView, layoutParams);
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void clear(View view) {
        T t9 = this.f23220a;
        if (t9 != null) {
            t9.unregisterView();
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public void destroy() {
        T t9 = this.f23220a;
        if (t9 != null) {
            t9.unregisterView();
            this.f23220a.destroy();
            this.f23220a = null;
        }
        MediaView mediaView = this.f23226g;
        if (mediaView != null) {
            mediaView.setListener(null);
            this.f23226g.destroy();
            this.f23226g = null;
        }
        this.f23221b = null;
        MediaView mediaView2 = this.f23227h;
        if (mediaView2 != null) {
            mediaView2.destroy();
            this.f23227h = null;
        }
        this.f23225f = null;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getAdFrom() {
        T t9;
        return (this.f23222c || (t9 = this.f23220a) == null) ? "" : t9.getSponsoredTranslation();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdIconView() {
        if (this.f23222c) {
            return null;
        }
        try {
            MediaView mediaView = this.f23227h;
            if (mediaView != null) {
                mediaView.destroy();
                this.f23227h = null;
            }
            MediaView mediaView2 = new MediaView(this.f23221b);
            this.f23227h = mediaView2;
            return mediaView2;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        try {
            if (this.f23226g == null) {
                MediaView mediaView = new MediaView(this.f23221b);
                this.f23226g = mediaView;
                mediaView.setListener(new MediaViewListener() { // from class: com.anythink.network.facebook.FacebookATBaseNativeAd.1
                    @Override // com.facebook.ads.MediaViewListener
                    public final void onComplete(MediaView mediaView2) {
                        FacebookATBaseNativeAd.this.notifyAdVideoEnd();
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onEnterFullscreen(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onExitFullscreen(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onFullscreenBackground(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onFullscreenForeground(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onPause(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onPlay(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onVolumeChange(MediaView mediaView2, float f6) {
                    }
                });
            }
            return this.f23226g;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getAdvertiserName() {
        T t9;
        return (this.f23222c || (t9 = this.f23220a) == null) ? "" : t9.getAdvertiserName();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getCallToActionText() {
        T t9;
        return (this.f23222c || (t9 = this.f23220a) == null) ? "" : t9.getAdCallToAction();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f23222c) {
            return null;
        }
        NativeAdLayout nativeAdLayout = new NativeAdLayout(this.f23221b);
        this.f23225f = nativeAdLayout;
        return nativeAdLayout;
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getDescriptionText() {
        T t9;
        return (this.f23222c || (t9 = this.f23220a) == null) ? "" : t9.getAdBodyText();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public int getMainImageHeight() {
        T t9;
        NativeAdBase.Image adCoverImage;
        if (this.f23222c || (t9 = this.f23220a) == null || (adCoverImage = t9.getAdCoverImage()) == null) {
            return 0;
        }
        return adCoverImage.getHeight();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public int getMainImageWidth() {
        T t9;
        NativeAdBase.Image adCoverImage;
        if (this.f23222c || (t9 = this.f23220a) == null || (adCoverImage = t9.getAdCoverImage()) == null) {
            return 0;
        }
        return adCoverImage.getWidth();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.IATThirdPartyMaterial
    public String getTitle() {
        T t9;
        return (this.f23222c || (t9 = this.f23220a) == null) ? "" : t9.getAdHeadline();
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.core.api.BaseAd
    public boolean isNativeExpress() {
        return this.f23222c;
    }

    public void loadAd(String str, a aVar) {
        this.f23223d = aVar;
        if (TextUtils.isEmpty(str)) {
            this.f23220a.loadAd(this.f23220a.buildLoadAdConfig().withAdListener(this).build());
            return;
        }
        HashMap hashMap = new HashMap();
        this.f23224e = hashMap;
        FacebookATInitManager.getInstance();
        hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(str));
        setNetworkInfoMap(this.f23224e);
        this.f23220a.loadAd(this.f23220a.buildLoadAdConfig().withAdListener(this).withBid(str).build());
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        notifyAdClicked();
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        a aVar = this.f23223d;
        if (aVar != null) {
            aVar.onLoadSuccess();
        }
        this.f23223d = null;
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        a aVar = this.f23223d;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(adError.getErrorCode());
            aVar.onLoadFail(sb.toString(), adError.getErrorMessage());
        }
        this.f23223d = null;
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        notifyAdImpression();
    }

    @Override // com.facebook.ads.NativeAdListener
    public void onMediaDownloaded(Ad ad) {
    }

    @Override // com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a
    public void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo) {
        if (this.f23222c || view == null) {
            return;
        }
        try {
            List<View> clickViewList = aTNativePrepareInfo.getClickViewList();
            FrameLayout.LayoutParams choiceViewLayoutParams = aTNativePrepareInfo.getChoiceViewLayoutParams();
            T t9 = this.f23220a;
            if (t9 instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) t9;
                if (clickViewList == null || clickViewList.size() <= 0) {
                    NativeAdLayout nativeAdLayout = this.f23225f;
                    if (nativeAdLayout != null) {
                        nativeAd.registerViewForInteraction(nativeAdLayout, this.f23226g, this.f23227h);
                    } else {
                        nativeAd.registerViewForInteraction(view, this.f23226g, this.f23227h);
                    }
                } else {
                    NativeAdLayout nativeAdLayout2 = this.f23225f;
                    if (nativeAdLayout2 != null) {
                        nativeAd.registerViewForInteraction(nativeAdLayout2, this.f23226g, this.f23227h, clickViewList);
                    } else {
                        nativeAd.registerViewForInteraction(view, this.f23226g, this.f23227h, clickViewList);
                    }
                }
            } else if (t9 instanceof NativeBannerAd) {
                NativeBannerAd nativeBannerAd = (NativeBannerAd) t9;
                if (clickViewList == null || clickViewList.size() <= 0) {
                    NativeAdLayout nativeAdLayout3 = this.f23225f;
                    if (nativeAdLayout3 != null) {
                        nativeBannerAd.registerViewForInteraction(nativeAdLayout3, this.f23227h);
                    } else {
                        nativeBannerAd.registerViewForInteraction(view, this.f23227h);
                    }
                } else {
                    NativeAdLayout nativeAdLayout4 = this.f23225f;
                    if (nativeAdLayout4 != null) {
                        nativeBannerAd.registerViewForInteraction(nativeAdLayout4, this.f23227h, clickViewList);
                    } else {
                        nativeBannerAd.registerViewForInteraction(view, this.f23227h, clickViewList);
                    }
                }
            }
            AdOptionsView adOptionsView = new AdOptionsView(view.getContext(), this.f23220a, this.f23225f);
            if (choiceViewLayoutParams == null) {
                choiceViewLayoutParams = new FrameLayout.LayoutParams(-2, -2);
                choiceViewLayoutParams.gravity = 53;
            }
            if (choiceViewLayoutParams.height > 0) {
                adOptionsView.setIconSizeDp((int) ((choiceViewLayoutParams.height / this.f23221b.getResources().getDisplayMetrics().density) + 0.5f));
            }
            this.f23225f.addView(adOptionsView, choiceViewLayoutParams);
        } catch (Throwable unused) {
        }
    }
}
