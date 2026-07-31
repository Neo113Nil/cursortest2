package com.startapp.sdk.ads.nativead;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.mh;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.v1;
import com.startapp.sdk.internal.vc;
import com.startapp.sdk.internal.w6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class StartAppNativeAd extends Ad {
    private boolean belowMinCpm;
    private List<NativeAdDetails> listNativeAds;
    private final AtomicBoolean loading;
    private NativeAdPreferences preferences;

    public enum CampaignAction {
        LAUNCH_APP,
        OPEN_MARKET
    }

    public StartAppNativeAd(Context context) {
        this(context, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).i, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).S, com.startapp.sdk.components.a.a(context).f160a, com.startapp.sdk.components.a.a(context).m, com.startapp.sdk.components.a.a(context).A, com.startapp.sdk.components.a.a(context).w, com.startapp.sdk.components.a.a(context).b);
    }

    private List<AdDetails> getAdDetailsList() {
        ArrayList arrayList = new ArrayList();
        Iterator<NativeAdDetails> it = this.listNativeAds.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAdDetails());
        }
        return arrayList;
    }

    private AdDetails getFirstAdDetails() {
        NativeAdDetails nativeAdDetails;
        if (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) {
            return null;
        }
        return nativeAdDetails.getAdDetails();
    }

    private NativeAdPreferences getPreferences() {
        NativeAdPreferences nativeAdPreferences = this.preferences;
        if (nativeAdPreferences != null) {
            return nativeAdPreferences;
        }
        NativeAdPreferences nativeAdPreferences2 = new NativeAdPreferences();
        this.preferences = nativeAdPreferences2;
        return nativeAdPreferences2;
    }

    public static Drawable getPrivacyIcon(Context context) {
        return AdInformationMetaData.c().a(context);
    }

    @Deprecated
    public static String getPrivacyImageUrl() {
        return AdInformationMetaData.c().d();
    }

    public static String getPrivacyURL() {
        if (AdInformationMetaData.c().b() == null) {
            return "";
        }
        String b = AdInformationMetaData.c().b();
        return (b.contains("http://") || b.contains("https://")) ? AdInformationMetaData.c().b() : "https://" + AdInformationMetaData.c().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onReceiveAd(AdEventListener adEventListener) {
        setErrorMessage(null);
        ((w6) this.eventTracer.a()).c(this, mh.f);
        ((w6) this.eventTracer.a()).b(this, mh.b);
        a0.b(this.context, adEventListener, this, false);
        this.loading.set(false);
    }

    private NativeAdPreferences prepareAdPreferences() {
        String str;
        NativeAdPreferences preferences = getPreferences();
        if (preferences.getPlacementId() == null) {
            Context context = this.context;
            String packageName = context.getPackageName();
            String name = getClass().getName();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    str = null;
                    break;
                }
                if (context instanceof Activity) {
                    str = context.getClass().getName();
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            preferences.setPlacementId(e0.a(packageName, name, str, (String) null));
        }
        return preferences;
    }

    private void reset() {
        this.belowMinCpm = false;
        this.listNativeAds = Collections.EMPTY_LIST;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    protected v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public String getAdId() {
        AdDetails firstAdDetails = getFirstAdDetails();
        if (firstAdDetails != null) {
            return firstAdDetails.a();
        }
        return null;
    }

    public String getBidToken() {
        AdDetails firstAdDetails = getFirstAdDetails();
        if (firstAdDetails != null) {
            return firstAdDetails.e();
        }
        return null;
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds(null);
    }

    public int getNumberOfAds() {
        return this.listNativeAds.size();
    }

    void initNativeAdList(vc vcVar, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        int size;
        this.belowMinCpm = vcVar.isBelowMinCPM();
        List list = vcVar.f302a;
        if (list == null || (size = list.size()) <= 0) {
            onReceiveAd(adEventListener);
            return;
        }
        ArrayList arrayList = new ArrayList(size);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new NativeAdDetails((AdDetails) list.get(i2)));
        }
        this.listNativeAds = Collections.unmodifiableList(arrayList);
        if (!nativeAdPreferences.isAutoBitmapDownload()) {
            onReceiveAd(adEventListener);
            return;
        }
        i iVar = new i(this, size, adEventListener);
        ((w6) this.eventTracer.a()).c(this, mh.x);
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            ((NativeAdDetails) obj).loadImages(this.context, iVar);
        }
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public boolean isBelowMinCPM() {
        return this.belowMinCpm;
    }

    @Deprecated
    public boolean loadAd() {
        return loadAd((AdEventListener) null);
    }

    public void setPreferences(NativeAdPreferences nativeAdPreferences) {
        this.preferences = nativeAdPreferences != null ? new NativeAdPreferences(nativeAdPreferences) : null;
    }

    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        AdRulesResult a2 = AdaptMetaData.b().a().a(AdPreferences.Placement.INAPP_NATIVE, str);
        if (a2.b()) {
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                nativeAdDetails.setAdTag(str);
                arrayList.add(nativeAdDetails);
            }
            t.d.a(new s(AdPreferences.Placement.INAPP_NATIVE, str));
            return arrayList;
        }
        List<AdDetails> adDetailsList = getAdDetailsList();
        ArrayList arrayList2 = new ArrayList();
        if (adDetailsList != null) {
            Iterator<AdDetails> it = adDetailsList.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(Arrays.asList(it.next().t()));
            }
        }
        e0.a((String[]) arrayList2.toArray(new String[0]), str, 0, a2.a());
        return arrayList;
    }

    public boolean loadAd(AdEventListener adEventListener) {
        return loadAd(adEventListener, (String) null);
    }

    public boolean loadAd(AdEventListener adEventListener, String str) {
        if (!this.loading.compareAndSet(false, true)) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        reset();
        NativeAdPreferences prepareAdPreferences = prepareAdPreferences();
        vc vcVar = new vc(this.context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoDownloader, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, prepareAdPreferences);
        ((w6) this.eventTracer.a()).a((Object) this, mh.b);
        ((w6) this.eventTracer.a()).a(this, vcVar);
        vcVar.load(prepareAdPreferences, new j(this, vcVar, prepareAdPreferences, adEventListener), str);
        return true;
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        setPreferences(nativeAdPreferences);
        return loadAd((AdEventListener) null);
    }

    public StartAppNativeAd(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9) {
        super(context, AdPreferences.Placement.INAPP_NATIVE, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9);
        this.listNativeAds = Collections.EMPTY_LIST;
        this.loading = new AtomicBoolean();
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener);
    }

    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener, String str) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener, str);
    }
}
