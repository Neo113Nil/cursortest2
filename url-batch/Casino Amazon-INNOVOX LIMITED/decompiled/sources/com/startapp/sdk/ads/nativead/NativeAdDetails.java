package com.startapp.sdk.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.startio.adsession.AdSession;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.d2;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.ed;
import com.startapp.sdk.internal.ef;
import com.startapp.sdk.internal.ff;
import com.startapp.sdk.internal.jj;
import com.startapp.sdk.internal.m8;
import com.startapp.sdk.internal.u6;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class NativeAdDetails implements NativeAdInterface {
    private static final float DEFAULT_RATING = 5.0f;
    private final AdDetails adDetails;
    private String adTag;
    private NativeAdDisplayListener displayListener;
    private Bitmap imgBitmap;
    private ed omAdSession;
    private Bitmap secondaryImgBitmap;
    private jj viewabilityRunner;
    private boolean impressionSent = false;
    private boolean hiddenSent = false;
    private WeakReference<View> nativeAdView = new WeakReference<>(null);
    private final View.OnAttachStateChangeListener onAttachStateChangeListener = new h(this);
    private final ef impressionListener = new b(this);

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
        ed edVar = this.omAdSession;
        if (edVar != null) {
            AdSession adSession = edVar.f228a;
            if (adSession != null) {
                adSession.finish();
            }
            final Object[] objArr = {this.omAdSession, this.nativeAdView.get()};
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.startapp.sdk.ads.nativead.NativeAdDetails$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    NativeAdDetails.lambda$finishOmAdSession$0(objArr);
                }
            }, MetaData.A().I());
            this.omAdSession = null;
        }
    }

    private long getImpressionDelayMillis() {
        AdDetails adDetails = getAdDetails();
        return (adDetails == null || adDetails.i() == null) ? TimeUnit.SECONDS.toMillis(MetaData.A().w()) : TimeUnit.SECONDS.toMillis(adDetails.i().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleClickOnView(View view) {
        sendClickImpl(view.getContext());
    }

    static /* synthetic */ void lambda$finishOmAdSession$0(Object[] objArr) {
        if (objArr[0] != null) {
            objArr[0] = null;
        }
        if (objArr[1] != null) {
            objArr[1] = null;
        }
    }

    private void sendClickImpl(Context context) {
        int i = g.f99a[getCampaignAction().ordinal()];
        if (i == 1) {
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
            boolean a2 = e0.a(context);
            if (!this.adDetails.D() || a2) {
                e0.a(context, this.adDetails.h(), this.adDetails.y(), new TrackingParams(this.adTag), this.adDetails.E() && !a2, false);
            } else {
                e0.a(context, this.adDetails.h(), this.adDetails.y(), this.adDetails.s(), new TrackingParams(this.adTag), AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), this.adDetails.E(), this.adDetails.F(), false, null);
            }
        } else if (i == 2) {
            e0.a(getPackageName(), this.adDetails.o(), this.adDetails.h(), context, new TrackingParams(this.adTag));
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
        ff ffVar = new ff(view.getContext(), AdPreferences.Placement.INAPP_NATIVE, getAdDetails() != null ? getAdDetails().t() : null, new TrackingParams(this.adTag), getImpressionDelayMillis(), false, this.impressionListener);
        Context context = view.getContext();
        String[] c = getAdDetails() != null ? getAdDetails().c() : null;
        TrackingParams trackingParams = new TrackingParams(this.adTag);
        if (context != null && c != null) {
            m8.a(context, Arrays.asList(c), trackingParams);
        }
        jj jjVar = new jj(this.nativeAdView, ffVar, BannerMetaData.c().a());
        this.viewabilityRunner = jjVar;
        jjVar.c = new f(this);
        if (jjVar.c()) {
            jjVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startOmAdSession() {
        View view;
        AdDetails adDetails;
        List b;
        if (!MetaData.A().d0() || (view = this.nativeAdView.get()) == null || (adDetails = this.adDetails) == null || (b = adDetails.b()) == null) {
            return;
        }
        ed edVar = new ed(view.getContext(), b, false);
        this.omAdSession = edVar;
        AdSession adSession = edVar.f228a;
        if (adSession != null) {
            if (adSession != null) {
                adSession.start();
            }
            AdSession adSession2 = this.omAdSession.f228a;
            if (adSession2 != null) {
                adSession2.registerAdView(view);
            }
            ed edVar2 = this.omAdSession;
            if (edVar2.b != null && edVar2.e.compareAndSet(false, true)) {
                edVar2.b.loaded();
            }
            this.omAdSession.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopCheckingVisibility() {
        jj jjVar = this.viewabilityRunner;
        if (jjVar != null) {
            jjVar.a();
            this.viewabilityRunner = null;
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        unregisterView();
    }

    protected AdDetails getAdDetails() {
        return this.adDetails;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getCallToAction() {
        String f;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (f = adDetails.f()) == null) ? "" : f;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public StartAppNativeAd.CampaignAction getCampaignAction() {
        StartAppNativeAd.CampaignAction campaignAction = StartAppNativeAd.CampaignAction.OPEN_MARKET;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || !adDetails.C()) ? campaignAction : StartAppNativeAd.CampaignAction.LAUNCH_APP;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getCategory() {
        String g;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (g = adDetails.g()) == null) ? "" : g;
    }

    @Override // com.startapp.sdk.ads.nativead.NativeAdInterface
    public String getDescription() {
        String j;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (j = adDetails.j()) == null) ? "" : j;
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
        String s;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (s = adDetails.s()) == null) ? "" : s;
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
        String x;
        AdDetails adDetails = this.adDetails;
        return (adDetails == null || (x = adDetails.x()) == null) ? "" : x;
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
        new d2(context, getImageUrl(), cVar, 0).a();
        new d2(context, getSecondaryImageUrl(), cVar, 1).a();
    }

    protected void onImpressionSent(String str) {
        this.impressionSent = true;
        u6.a("onShow", this.displayListener != null, str, null);
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

    protected void setAdTag(String str) {
        this.adTag = str;
    }

    protected void setImageBitmap(Bitmap bitmap) {
        this.imgBitmap = bitmap;
    }

    protected void setSecondaryImageBitmap(Bitmap bitmap) {
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
