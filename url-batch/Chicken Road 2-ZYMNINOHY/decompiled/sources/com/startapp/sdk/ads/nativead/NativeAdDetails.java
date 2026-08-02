package com.startapp.sdk.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.b9;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.gk;
import com.startapp.sdk.internal.j2;
import com.startapp.sdk.internal.sd;
import com.startapp.sdk.internal.v6;
import com.startapp.sdk.internal.wf;
import com.startapp.sdk.internal.xf;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class NativeAdDetails implements NativeAdInterface {
    private static final float DEFAULT_RATING = 5.0f;
    private final AdDetails adDetails;
    private String adTag;
    private NativeAdDisplayListener displayListener;
    private Bitmap imgBitmap;
    private sd omAdSession;
    private Bitmap secondaryImgBitmap;
    private gk viewabilityRunner;
    private boolean impressionSent = false;
    private boolean hiddenSent = false;
    private WeakReference<View> nativeAdView = new WeakReference<>(null);
    private final View.OnAttachStateChangeListener onAttachStateChangeListener = new h(this);
    private final wf impressionListener = new b(this);

    public NativeAdDetails(AdDetails adDetails) {
        this.adDetails = adDetails;
    }

    private void associateWithImpression(View view) {
        this.nativeAdView = new WeakReference<>(view);
        view.addOnAttachStateChangeListener(this.onAttachStateChangeListener);
        if (view.isAttachedToWindow()) {
            this.onAttachStateChangeListener.onViewAttachedToWindow(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishOmAdSession() {
        sd sdVar = this.omAdSession;
        if (sdVar != null) {
            F2.b bVar = sdVar.f7564a;
            if (bVar != null) {
                bVar.c();
            }
            new Handler(Looper.getMainLooper()).postDelayed(new k(0, new Object[]{this.omAdSession, this.nativeAdView.get()}), MetaData.E().N());
            this.omAdSession = null;
        }
    }

    private long getImpressionDelayMillis() {
        AdDetails adDetails = getAdDetails();
        return (adDetails == null || adDetails.i() == null) ? TimeUnit.SECONDS.toMillis(MetaData.E().z()) : TimeUnit.SECONDS.toMillis(adDetails.i().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleClickOnView(View view) {
        sendClickImpl(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$finishOmAdSession$0(Object[] objArr) {
        if (objArr[0] != null) {
            objArr[0] = null;
        }
        if (objArr[1] != null) {
            objArr[1] = null;
        }
    }

    private void sendClickImpl(Context context) {
        int i4 = g.f6211a[getCampaignAction().ordinal()];
        if (i4 == 1) {
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
            boolean a3 = g0.a(context);
            if (!this.adDetails.D() || a3) {
                g0.a(context, this.adDetails.h(), this.adDetails.y(), new TrackingParams(this.adTag), this.adDetails.E() && !a3, false);
            } else {
                g0.a(context, this.adDetails.h(), this.adDetails.y(), this.adDetails.s(), new TrackingParams(this.adTag), AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), this.adDetails.E(), this.adDetails.F(), false, null);
            }
        } else if (i4 == 2) {
            g0.a(getPackageName(), this.adDetails.o(), this.adDetails.h(), context, new TrackingParams(this.adTag));
        }
        NativeAdDisplayListener nativeAdDisplayListener = this.displayListener;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adClicked(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCheckingVisibility() {
        if (this.viewabilityRunner != null || this.impressionSent) {
            return;
        }
        View view = this.nativeAdView.get();
        if (view == null) {
            NativeAdDisplayListener nativeAdDisplayListener = this.displayListener;
            if (nativeAdDisplayListener != null) {
                nativeAdDisplayListener.adNotDisplayed(this);
                return;
            }
            return;
        }
        xf xfVar = new xf(view.getContext(), AdPreferences.Placement.INAPP_NATIVE, getAdDetails() != null ? getAdDetails().t() : null, new TrackingParams(this.adTag), getImpressionDelayMillis(), false, this.impressionListener);
        Context context = view.getContext();
        String[] c4 = getAdDetails() != null ? getAdDetails().c() : null;
        TrackingParams trackingParams = new TrackingParams(this.adTag);
        if (context != null && c4 != null) {
            b9.a(context, Arrays.asList(c4), trackingParams);
        }
        gk gkVar = new gk(this.nativeAdView, xfVar, BannerMetaData.c().a());
        this.viewabilityRunner = gkVar;
        gkVar.f7027c = new f(this);
        if (gkVar.c()) {
            gkVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startOmAdSession() {
        View view;
        AdDetails adDetails;
        List b4;
        if (!MetaData.E().j0() || (view = this.nativeAdView.get()) == null || (adDetails = this.adDetails) == null || (b4 = adDetails.b()) == null) {
            return;
        }
        sd sdVar = new sd(view.getContext(), b4, false);
        this.omAdSession = sdVar;
        F2.b bVar = sdVar.f7564a;
        if (bVar != null) {
            bVar.e();
            F2.b bVar2 = this.omAdSession.f7564a;
            if (bVar2 != null) {
                bVar2.d(view);
            }
            sd sdVar2 = this.omAdSession;
            if (sdVar2.f7565b != null && sdVar2.f7568e.compareAndSet(false, true)) {
                sdVar2.f7565b.b();
            }
            this.omAdSession.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopCheckingVisibility() {
        gk gkVar = this.viewabilityRunner;
        if (gkVar != null) {
            gkVar.a();
            this.viewabilityRunner = null;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        unregisterView();
    }

    public AdDetails getAdDetails() {
        return this.adDetails;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getCallToAction() {
        String f4;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (f4 = adDetails.f()) == null) ? "" : f4;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public StartAppNativeAd.CampaignAction getCampaignAction() {
        StartAppNativeAd.CampaignAction campaignAction = StartAppNativeAd.CampaignAction.OPEN_MARKET;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || !adDetails.C()) ? campaignAction : StartAppNativeAd.CampaignAction.LAUNCH_APP;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getCategory() {
        String g4;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (g4 = adDetails.g()) == null) ? "" : g4;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getDescription() {
        String j4;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (j4 = adDetails.j()) == null) ? "" : j4;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getErid() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.k();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getEridUrl() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.l();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public Bitmap getImageBitmap() {
        return this.imgBitmap;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getImageUrl() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.m();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getInstalls() {
        String n;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (n = adDetails.n()) == null) ? "" : n;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getPackageName() {
        String s4;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (s4 = adDetails.s()) == null) ? "" : s4;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public float getRating() {
        AdDetails adDetails = this.adDetails;
        return adDetails != null ? adDetails.u() : DEFAULT_RATING;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public Bitmap getSecondaryImageBitmap() {
        return this.secondaryImgBitmap;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getSecondaryImageUrl() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.v();
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getTitle() {
        String x4;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (x4 = adDetails.x()) == null) ? "" : x4;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public boolean isApp() {
        AdDetails adDetails = this.adDetails;
        if (adDetails != null) {
            return adDetails.B();
        }
        return true;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public boolean isBelowMinCPM() {
        AdDetails adDetails = this.adDetails;
        return adDetails != null && adDetails.q();
    }

    public void loadImages(Context context, Runnable runnable) {
        c cVar = new c(this, runnable);
        new j2(context, getImageUrl(), cVar, 0).a();
        new j2(context, getSecondaryImageUrl(), cVar, 1).a();
    }

    public void onImpressionSent(String str) {
        this.impressionSent = true;
        v6.a("onShow", this.displayListener != null, str, null);
        NativeAdDisplayListener nativeAdDisplayListener = this.displayListener;
        if (nativeAdDisplayListener != null) {
            nativeAdDisplayListener.adDisplayed(this);
        }
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void registerViewForInteraction(View view) {
        associateWithImpression(view);
        this.nativeAdView.get().setOnClickListener(new d(this));
    }

    public void setAdTag(String str) {
        this.adTag = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.imgBitmap = bitmap;
    }

    public void setSecondaryImageBitmap(Bitmap bitmap) {
        this.secondaryImgBitmap = bitmap;
    }

    public String toString() {
        return super.toString();
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void unregisterView() {
        stopCheckingVisibility();
        finishOmAdSession();
        View view = this.nativeAdView.get();
        this.nativeAdView.clear();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.onAttachStateChangeListener);
        }
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void registerViewForInteraction(View view, List<View> list) {
        registerViewForInteraction(view, list, null);
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public void registerViewForInteraction(View view, List<View> list, NativeAdDisplayListener nativeAdDisplayListener) {
        if (list != null && !list.isEmpty() && this.nativeAdView.get() == null) {
            e eVar = new e(this);
            Iterator<View> it = list.iterator();
            while (it.hasNext()) {
                it.next().setOnClickListener(eVar);
            }
            associateWithImpression(view);
        } else {
            registerViewForInteraction(view);
        }
        this.displayListener = nativeAdDisplayListener;
    }
}
