package com.anythink.network.admob;

import E2.a;
import E2.b;
import J6.h;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.anythink.core.common.u.g;
import com.google.android.gms.ads.MobileAds;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import k2.C4635f;
import k2.C4636g;
import k2.C4637h;
import k2.C4638i;
import k2.EnumC4631b;
import k2.r;
import l2.C4686a;
import m2.AbstractC4777a;
import m2.AbstractC4778b;
import org.json.JSONArray;
import q2.E0;
import q2.J0;

/* loaded from: classes.dex */
public class AdMobATInitManager extends ATInitMediation {

    /* renamed from: h, reason: collision with root package name */
    private static final String f22903h = "AdMobATInitManager";

    /* renamed from: j, reason: collision with root package name */
    private static volatile AdMobATInitManager f22904j;

    /* renamed from: a, reason: collision with root package name */
    Context f22905a;

    /* renamed from: b, reason: collision with root package name */
    long f22906b;

    /* renamed from: c, reason: collision with root package name */
    long f22907c;

    /* renamed from: d, reason: collision with root package name */
    long f22908d;

    /* renamed from: e, reason: collision with root package name */
    long f22909e;

    /* renamed from: f, reason: collision with root package name */
    String f22910f;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22912k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22913l;

    /* renamed from: m, reason: collision with root package name */
    private int f22914m = 0;

    /* renamed from: n, reason: collision with root package name */
    private Map<String, Object> f22915n = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    volatile int f22911g = 0;
    private boolean i = false;

    private AdMobATInitManager() {
    }

    private void a(MediationInitCallback mediationInitCallback, Map<String, Object> map, Context context) {
        try {
            synchronized (this) {
                try {
                    if (this.i) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                        return;
                    }
                    try {
                        Object obj = map.get(j.w.f12783n);
                        if (obj != null && !((Boolean) obj).booleanValue()) {
                            if (ATSDK.isNetworkLogDebug()) {
                                Log.i(f22903h, "disableMediationAdapterInitialization");
                            }
                            MobileAds.a(context);
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        this.f22911g = PreferenceManager.getDefaultSharedPreferences(context).getInt("gad_rdp", 0);
                    } catch (Throwable unused2) {
                    }
                    J0.c().d(context, null);
                    int i = this.f22914m;
                    if (i != 0) {
                        MobileAds.c(i == 1);
                    }
                    if (this.f22907c == 0) {
                        this.f22907c = System.currentTimeMillis();
                        HashMap hashMap = new HashMap();
                        hashMap.put("init_st", Long.valueOf(this.f22906b));
                        hashMap.put("init_et", Long.valueOf(this.f22907c));
                        hashMap.put("token_st", Long.valueOf(this.f22908d));
                        hashMap.put("token_et", Long.valueOf(this.f22909e));
                        hashMap.put(j.w.f12767G, Integer.valueOf(ATInitMediation.getIntFromMap(map, j.w.f12767G, 1)));
                        hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, ATInitMediation.getStringFromMap(map, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "-1"));
                        hashMap.put("admob_init_adsource_id", ATInitMediation.getStringFromMap(map, j.w.f12768H, ""));
                        hashMap.put("admob_token_adsource_id", this.f22910f);
                        sendNetworkEvent(2, g.f16708a, hashMap);
                    }
                    this.i = true;
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            this.i = false;
            if (mediationInitCallback != null) {
                mediationInitCallback.onFail(th.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bundle b(Context context, Map<String, Object> map, Map<String, Object> map2, EnumC4631b enumC4631b, boolean z8) {
        EnumC4631b enumC4631b2;
        String stringFromMap;
        C4637h a9;
        Context context2;
        Context context3;
        Bundle bundle = new Bundle();
        try {
            if (map.containsKey(j.w.f12776f)) {
                if (((Boolean) map.get(j.w.f12776f)).booleanValue()) {
                    bundle.putString("npa", "0");
                } else {
                    bundle.putString("npa", "1");
                }
            }
        } catch (Throwable unused) {
        }
        if (!this.f22912k) {
            if (this.f22911g == 1 && (context2 = this.f22905a) != null) {
                PreferenceManager.getDefaultSharedPreferences(context2).edit().remove("gad_rdp").apply();
                this.f22911g = 0;
            }
            enumC4631b2 = EnumC4631b.BANNER;
            if (z8) {
            }
            int intFromMap = ATInitMediation.getIntFromMap(map, "admob_clbn_sw", 1);
            if (enumC4631b == enumC4631b2) {
            }
            if (map.containsKey(j.w.f12789t)) {
            }
            stringFromMap = ATInitMediation.getStringFromMap(map, j.w.f12788s, "");
            if (!TextUtils.isEmpty(stringFromMap)) {
            }
            return bundle;
        }
        bundle.putString("rdp", "1");
        if (this.f22911g != 1 && (context3 = this.f22905a) != null) {
            PreferenceManager.getDefaultSharedPreferences(context3).edit().putInt("gad_rdp", 1).apply();
            this.f22911g = 1;
        }
        enumC4631b2 = EnumC4631b.BANNER;
        if (z8) {
            bundle.putString("query_info_type", "requester_type_2");
            if (enumC4631b == enumC4631b2 && (a9 = AdmobATConst.a(context, map2, map)) != null) {
                bundle.putInt("adaptive_banner_w", a9.f38711a);
                bundle.putInt("adaptive_banner_h", a9.f38712b);
            }
        }
        int intFromMap2 = ATInitMediation.getIntFromMap(map, "admob_clbn_sw", 1);
        if (enumC4631b == enumC4631b2) {
            if (intFromMap2 == 2) {
                bundle.putString("collapsible", "bottom");
            } else if (intFromMap2 == 3) {
                bundle.putString("collapsible", "top");
            }
        }
        if (map.containsKey(j.w.f12789t)) {
            bundle.putBoolean("is_hybrid_setup", ATInitMediation.getBooleanFromMap(map, j.w.f12789t, false));
        }
        stringFromMap = ATInitMediation.getStringFromMap(map, j.w.f12788s, "");
        if (!TextUtils.isEmpty(stringFromMap)) {
            bundle.putString("placement_req_id", stringFromMap);
        }
        return bundle;
        enumC4631b2 = EnumC4631b.BANNER;
        if (z8) {
        }
        int intFromMap22 = ATInitMediation.getIntFromMap(map, "admob_clbn_sw", 1);
        if (enumC4631b == enumC4631b2) {
        }
        if (map.containsKey(j.w.f12789t)) {
        }
        stringFromMap = ATInitMediation.getStringFromMap(map, j.w.f12788s, "");
        if (!TextUtils.isEmpty(stringFromMap)) {
        }
        return bundle;
    }

    public static AdMobATInitManager getInstance() {
        if (f22904j == null) {
            synchronized (AdMobATInitManager.class) {
                try {
                    if (f22904j == null) {
                        f22904j = new AdMobATInitManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22904j;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getAdapterVersion() {
        return "UA_6.5.13";
    }

    public Method getAppOpenLoadMethod() {
        if (!isLowestFor2400()) {
            return null;
        }
        try {
            return AbstractC4778b.class.getDeclaredMethod("load", Context.class, String.class, C4636g.class, Integer.TYPE, AbstractC4777a.class);
        } catch (Throwable th) {
            Log.e(f22903h, "startLoadSplashAd() >>> network version: +" + getNetworkVersion() + ", reflect method error: " + th.getMessage());
            return null;
        }
    }

    public String getGoogleAdManagerName() {
        return "Google Ad Manager";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public List getMetaValutStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.google.android.gms.ads.APPLICATION_ID");
        return arrayList;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return "Admob";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.google.android.gms.ads.MobileAdsInitProvider";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return AdmobATConst.getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATInitMediation
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        hashMap.put("play-services-ads-*.aar", bool);
        hashMap.put("play-services-ads-base-*.aar", bool);
        hashMap.put("play-services-ads-lite-*.aar", bool);
        hashMap.put("play-services-ads-identifier-*.aar", bool);
        hashMap.put("play-services-basement-*.aar", bool);
        hashMap.put("play-services-measurement-sdk-api-*.aar", bool);
        hashMap.put("play-services-tasks-*.aar", bool);
        try {
            hashMap.put("play-services-tasks-*.aar", Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-*.aar", Boolean.TRUE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-base-*.aar", Boolean.TRUE);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-lite-*.aar", Boolean.TRUE);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-identifier-*.aar", Boolean.TRUE);
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            hashMap.put("play-services-basement-*.aar", Boolean.TRUE);
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        try {
            hashMap.put("play-services-measurement-sdk-api-*.aar", Boolean.TRUE);
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        return hashMap;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public void initSDK(Context context, final Map<String, Object> map, final MediationInitCallback mediationInitCallback) {
        if (this.f22906b == 0) {
            this.f22906b = System.currentTimeMillis();
        }
        if (this.i) {
            if (mediationInitCallback != null) {
                mediationInitCallback.onSuccess();
                return;
            }
            return;
        }
        this.f22912k = ATInitMediation.getBooleanFromMap(map, j.w.f12774d);
        try {
            this.f22913l = ATInitMediation.getBooleanFromMap(map, j.w.f12775e);
            r rVar = J0.c().f39969j;
            if (rVar == null) {
                rVar = new r(new ArrayList(), -1, 1);
            }
            if (this.f22913l) {
                h hVar = new h();
                ArrayList arrayList = hVar.f1418b;
                hVar.b(rVar.f38727a);
                arrayList.clear();
                ArrayList arrayList2 = rVar.f38728b;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                hVar.f1419c = rVar.f38729c;
                hVar.b(1);
                MobileAds.d(new r(arrayList, hVar.f1417a, hVar.f1419c));
            }
        } catch (Throwable unused) {
        }
        this.f22905a = context.getApplicationContext();
        runOnThreadPool(new Runnable() { // from class: com.anythink.network.admob.AdMobATInitManager.1
            @Override // java.lang.Runnable
            public final void run() {
                AdMobATInitManager adMobATInitManager = AdMobATInitManager.this;
                AdMobATInitManager.a(adMobATInitManager, mediationInitCallback, map, adMobATInitManager.f22905a);
            }
        });
    }

    public boolean isLowestFor2400() {
        try {
            return Integer.parseInt(getNetworkVersion().replace(j.f12535z, "")) < 2400;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setAdmobAppMuted(boolean z8) {
        if (this.i) {
            MobileAds.c(z8);
        } else {
            this.f22914m = z8 ? 1 : 2;
        }
    }

    @Override // com.anythink.core.api.ATInitMediation
    public boolean setUserDataConsent(Context context, boolean z8, boolean z9) {
        return false;
    }

    public final void a(String str, Object obj) {
        this.f22915n.put(str, new WeakReference(obj));
    }

    public final void a(String str) {
        this.f22915n.remove(str);
    }

    public static void a(Map<String, Object> map, C4638i c4638i) {
        if (c4638i == null || map == null) {
            return;
        }
        map.put("value_micros", Long.valueOf(c4638i.f38721c));
        map.put("currency_code", c4638i.f38720b);
        map.put("precision_type", Integer.valueOf(c4638i.f38719a));
    }

    private static void a(Map<String, Object> map, Map<String, Object> map2, C4635f c4635f) {
        try {
            List<String> b9 = b(map2);
            if (b9 == null || b9.size() == 0) {
                b9 = a(map);
            }
            if (b9 != null && b9.size() > 0) {
                if (ATSDK.isNetworkLogDebug()) {
                    b9.size();
                    for (int i = 0; i < b9.size(); i++) {
                        b9.get(i);
                    }
                }
                if (b9.size() == 1) {
                    c4635f.h(b9.get(0));
                } else {
                    c4635f.j(b9);
                }
            }
            Object obj = map2.get(AdmobATConst.CONTENT_KEYWORDS);
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    return;
                }
                for (Object obj2 : list) {
                    if (ATSDK.isNetworkLogDebug()) {
                        Objects.toString(obj2);
                    }
                    if (obj2 instanceof String) {
                        ((E0) c4635f.f37200u).f39918a.add((String) obj2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static List<String> b(Map<String, Object> map) {
        if (!map.containsKey(AdmobATConst.CONTENT_URLS)) {
            return null;
        }
        try {
            Object obj = map.get(AdmobATConst.CONTENT_URLS);
            if (!(obj instanceof List)) {
                return null;
            }
            Iterator it = ((List) obj).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static List<String> a(Map<String, Object> map) {
        if (!map.containsKey("web_content_urls")) {
            return null;
        }
        try {
            Object obj = map.get("web_content_urls");
            if (!(obj instanceof JSONArray)) {
                return null;
            }
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public final C4635f a(Context context, Map<String, Object> map, Map<String, Object> map2, EnumC4631b enumC4631b, boolean z8) {
        C4635f c4635f = new C4635f(1);
        a(map, map2, c4635f);
        try {
            String stringFromMap = ATInitMediation.getStringFromMap(map, j.w.f12787r, "");
            if (!TextUtils.isEmpty(stringFromMap)) {
                ((E0) c4635f.f37200u).f39926j = stringFromMap;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        c4635f.e(b(context, map, map2, enumC4631b, z8));
        return c4635f;
    }

    public final C4686a a(Context context, Map<String, Object> map, Map<String, Object> map2, EnumC4631b enumC4631b) {
        C4686a c4686a = new C4686a(1);
        c4686a.e(b(context, map, map2, enumC4631b, false));
        return c4686a;
    }

    public final void a(final Context context, final Map<String, Object> map, final Map<String, Object> map2, final EnumC4631b enumC4631b, final ATBidRequestInfoListener aTBidRequestInfoListener) {
        if (this.f22908d == 0) {
            this.f22908d = System.currentTimeMillis();
            this.f22910f = ATInitMediation.getStringFromMap(map, j.w.f12768H, "");
        }
        runOnThreadPool(new Runnable() { // from class: com.anythink.network.admob.AdMobATInitManager.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C4635f a9 = AdMobATInitManager.this.a(context, map, map2, enumC4631b, true);
                    Context context2 = context;
                    EnumC4631b enumC4631b2 = enumC4631b;
                    a9.getClass();
                    a.a(context2, enumC4631b2, new C4636g(a9), new b() { // from class: com.anythink.network.admob.AdMobATInitManager.2.1
                        @Override // E2.b
                        public final void onFailure(String str) {
                            ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                            if (aTBidRequestInfoListener2 != null) {
                                aTBidRequestInfoListener2.onFailed(str);
                            }
                        }

                        @Override // E2.b
                        public final void onSuccess(a aVar) {
                            String str = aVar != null ? aVar.f810a.f289a : "";
                            if (TextUtils.isEmpty(str)) {
                                ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                                if (aTBidRequestInfoListener2 != null) {
                                    aTBidRequestInfoListener2.onFailed("Admob QueryInfo is empty.");
                                    return;
                                }
                                return;
                            }
                            AdMobATInitManager adMobATInitManager = AdMobATInitManager.this;
                            if (adMobATInitManager.f22909e == 0) {
                                adMobATInitManager.f22909e = System.currentTimeMillis();
                            }
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            AdmobBidRequestInfo admobBidRequestInfo = new AdmobBidRequestInfo(context, str, map, map2, enumC4631b);
                            ATBidRequestInfoListener aTBidRequestInfoListener3 = aTBidRequestInfoListener;
                            if (aTBidRequestInfoListener3 != null) {
                                aTBidRequestInfoListener3.onSuccess(admobBidRequestInfo);
                            }
                            if (ATInitMediation.getIntFromMap(map, j.w.f12767G, 1) == 2) {
                                AdMobATInitManager adMobATInitManager2 = AdMobATInitManager.getInstance();
                                AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                adMobATInitManager2.initSDK(context, map, null);
                            }
                        }
                    });
                } catch (Throwable th) {
                    ATBidRequestInfoListener aTBidRequestInfoListener2 = aTBidRequestInfoListener;
                    if (aTBidRequestInfoListener2 != null) {
                        aTBidRequestInfoListener2.onFailed("Admob QueryInfo.generate() error: " + th.getMessage());
                    }
                }
            }
        });
    }

    public static void a(AdMobATInitManager adMobATInitManager, MediationInitCallback mediationInitCallback, Map map, Context context) {
        try {
            synchronized (adMobATInitManager) {
                try {
                    if (adMobATInitManager.i) {
                        if (mediationInitCallback != null) {
                            mediationInitCallback.onSuccess();
                        }
                        return;
                    }
                    try {
                        Object obj = map.get(j.w.f12783n);
                        if (obj != null && !((Boolean) obj).booleanValue()) {
                            if (ATSDK.isNetworkLogDebug()) {
                                Log.i(f22903h, "disableMediationAdapterInitialization");
                            }
                            MobileAds.a(context);
                        }
                    } catch (Throwable unused) {
                    }
                    try {
                        adMobATInitManager.f22911g = PreferenceManager.getDefaultSharedPreferences(context).getInt("gad_rdp", 0);
                    } catch (Throwable unused2) {
                    }
                    J0.c().d(context, null);
                    int i = adMobATInitManager.f22914m;
                    if (i != 0) {
                        MobileAds.c(i == 1);
                    }
                    if (adMobATInitManager.f22907c == 0) {
                        adMobATInitManager.f22907c = System.currentTimeMillis();
                        HashMap hashMap = new HashMap();
                        hashMap.put("init_st", Long.valueOf(adMobATInitManager.f22906b));
                        hashMap.put("init_et", Long.valueOf(adMobATInitManager.f22907c));
                        hashMap.put("token_st", Long.valueOf(adMobATInitManager.f22908d));
                        hashMap.put("token_et", Long.valueOf(adMobATInitManager.f22909e));
                        hashMap.put(j.w.f12767G, Integer.valueOf(ATInitMediation.getIntFromMap(map, j.w.f12767G, 1)));
                        hashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, ATInitMediation.getStringFromMap(map, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "-1"));
                        hashMap.put("admob_init_adsource_id", ATInitMediation.getStringFromMap(map, j.w.f12768H, ""));
                        hashMap.put("admob_token_adsource_id", adMobATInitManager.f22910f);
                        adMobATInitManager.sendNetworkEvent(2, g.f16708a, hashMap);
                    }
                    adMobATInitManager.i = true;
                    if (mediationInitCallback != null) {
                        mediationInitCallback.onSuccess();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            adMobATInitManager.i = false;
            if (mediationInitCallback != null) {
                mediationInitCallback.onFail(th.getMessage());
            }
        }
    }
}
