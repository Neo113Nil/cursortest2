package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, d> f2966a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f2967b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.j f2968c;

    /* renamed from: d, reason: collision with root package name */
    private p f2969d;
    private JSONObject e;
    private final String f;
    private String g;
    private AppLovinAdSize h;
    private AppLovinAdType i;

    private d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, com.applovin.impl.sdk.j jVar) {
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f2968c = jVar;
        this.f2969d = jVar != null ? jVar.u() : null;
        this.h = appLovinAdSize;
        this.i = appLovinAdType;
        if (!TextUtils.isEmpty(str)) {
            this.f = str.toLowerCase(Locale.ENGLISH);
            this.g = str.toLowerCase(Locale.ENGLISH);
            return;
        }
        this.f = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, com.applovin.impl.sdk.j jVar) {
        return a(appLovinAdSize, appLovinAdType, null, jVar);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, com.applovin.impl.sdk.j jVar) {
        d dVar = new d(appLovinAdSize, appLovinAdType, str, jVar);
        synchronized (f2967b) {
            String str2 = dVar.f;
            if (f2966a.containsKey(str2)) {
                dVar = f2966a.get(str2);
            } else {
                f2966a.put(str2, dVar);
            }
        }
        return dVar;
    }

    public static d a(String str, com.applovin.impl.sdk.j jVar) {
        return a(null, null, str, jVar);
    }

    public static d a(String str, JSONObject jSONObject, com.applovin.impl.sdk.j jVar) {
        d a2 = a(str, jVar);
        a2.e = jSONObject;
        return a2;
    }

    private <ST> com.applovin.impl.sdk.b.b<ST> a(String str, com.applovin.impl.sdk.b.b<ST> bVar) {
        return this.f2968c.a(str + this.f, bVar);
    }

    private boolean a(com.applovin.impl.sdk.b.b<String> bVar, AppLovinAdSize appLovinAdSize) {
        return ((String) this.f2968c.a(bVar)).toUpperCase(Locale.ENGLISH).contains(appLovinAdSize.getLabel());
    }

    public static d b(String str, com.applovin.impl.sdk.j jVar) {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE, str, jVar);
    }

    public static Collection<d> b(com.applovin.impl.sdk.j jVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(8);
        Collections.addAll(linkedHashSet, c(jVar), d(jVar), e(jVar), f(jVar), g(jVar), h(jVar));
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static d c(com.applovin.impl.sdk.j jVar) {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR, jVar);
    }

    public static d c(String str, com.applovin.impl.sdk.j jVar) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str, jVar);
    }

    public static d d(com.applovin.impl.sdk.j jVar) {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR, jVar);
    }

    public static d e(com.applovin.impl.sdk.j jVar) {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR, jVar);
    }

    public static d f(com.applovin.impl.sdk.j jVar) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR, jVar);
    }

    public static d g(com.applovin.impl.sdk.j jVar) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, jVar);
    }

    public static d h(com.applovin.impl.sdk.j jVar) {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE, jVar);
    }

    private boolean m() {
        try {
            if (TextUtils.isEmpty(this.g)) {
                return AppLovinAdType.INCENTIVIZED.equals(c()) ? ((Boolean) this.f2968c.a(com.applovin.impl.sdk.b.b.aK)).booleanValue() : a(com.applovin.impl.sdk.b.b.aJ, b());
            }
            return true;
        } catch (Throwable th) {
            this.f2969d.b("AdZone", "Unable to safely test preload merge capability", th);
            return false;
        }
    }

    public String a() {
        return this.f;
    }

    void a(com.applovin.impl.sdk.j jVar) {
        this.f2968c = jVar;
        this.f2969d = jVar.u();
    }

    public AppLovinAdSize b() {
        if (this.h == null && com.applovin.impl.sdk.e.f.a(this.e, "ad_size")) {
            this.h = AppLovinAdSize.fromString(com.applovin.impl.sdk.e.f.a(this.e, "ad_size", (String) null, this.f2968c));
        }
        return this.h;
    }

    public AppLovinAdType c() {
        if (this.i == null && com.applovin.impl.sdk.e.f.a(this.e, "ad_type")) {
            this.i = new AppLovinAdType(com.applovin.impl.sdk.e.f.a(this.e, "ad_type", (String) null, this.f2968c));
        }
        return this.i;
    }

    public boolean d() {
        return AppLovinAdSize.NATIVE.equals(b()) && AppLovinAdType.NATIVE.equals(c());
    }

    public int e() {
        if (com.applovin.impl.sdk.e.f.a(this.e, "capacity")) {
            return com.applovin.impl.sdk.e.f.a(this.e, "capacity", 0, this.f2968c);
        }
        if (TextUtils.isEmpty(this.g)) {
            return ((Integer) this.f2968c.a(a("preload_capacity_", com.applovin.impl.sdk.b.b.aN))).intValue();
        }
        return d() ? ((Integer) this.f2968c.a(com.applovin.impl.sdk.b.b.aZ)).intValue() : ((Integer) this.f2968c.a(com.applovin.impl.sdk.b.b.aY)).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f.equalsIgnoreCase(((d) obj).f);
    }

    public int f() {
        if (com.applovin.impl.sdk.e.f.a(this.e, "extended_capacity")) {
            return com.applovin.impl.sdk.e.f.a(this.e, "extended_capacity", 0, this.f2968c);
        }
        if (TextUtils.isEmpty(this.g)) {
            return ((Integer) this.f2968c.a(a("extended_preload_capacity_", com.applovin.impl.sdk.b.b.aT))).intValue();
        }
        if (d()) {
            return 0;
        }
        return ((Integer) this.f2968c.a(com.applovin.impl.sdk.b.b.ba)).intValue();
    }

    public int g() {
        return com.applovin.impl.sdk.e.f.a(this.e, "preload_count", 0, this.f2968c);
    }

    public boolean h() {
        com.applovin.impl.sdk.j jVar;
        com.applovin.impl.sdk.b.b<Boolean> bVar;
        Boolean bool;
        if (com.applovin.impl.sdk.e.f.a(this.e, "refresh_enabled")) {
            bool = com.applovin.impl.sdk.e.f.a(this.e, "refresh_enabled", (Boolean) false, this.f2968c);
        } else {
            if (AppLovinAdSize.BANNER.equals(b())) {
                jVar = this.f2968c;
                bVar = com.applovin.impl.sdk.b.b.cs;
            } else if (AppLovinAdSize.MREC.equals(b())) {
                jVar = this.f2968c;
                bVar = com.applovin.impl.sdk.b.b.cu;
            } else {
                if (!AppLovinAdSize.LEADER.equals(b())) {
                    return false;
                }
                jVar = this.f2968c;
                bVar = com.applovin.impl.sdk.b.b.cw;
            }
            bool = (Boolean) jVar.a(bVar);
        }
        return bool.booleanValue();
    }

    public int hashCode() {
        return this.f.hashCode();
    }

    public long i() {
        if (com.applovin.impl.sdk.e.f.a(this.e, "refresh_seconds")) {
            return com.applovin.impl.sdk.e.f.a(this.e, "refresh_seconds", 0, this.f2968c);
        }
        if (AppLovinAdSize.BANNER.equals(b())) {
            return ((Long) this.f2968c.a(com.applovin.impl.sdk.b.b.ct)).longValue();
        }
        if (AppLovinAdSize.MREC.equals(b())) {
            return ((Long) this.f2968c.a(com.applovin.impl.sdk.b.b.cv)).longValue();
        }
        if (AppLovinAdSize.LEADER.equals(b())) {
            return ((Long) this.f2968c.a(com.applovin.impl.sdk.b.b.cx)).longValue();
        }
        return -1L;
    }

    public boolean j() {
        if (!((Boolean) this.f2968c.a(com.applovin.impl.sdk.b.b.aI)).booleanValue() || !m()) {
            return false;
        }
        if (TextUtils.isEmpty(this.g)) {
            com.applovin.impl.sdk.b.b a2 = a("preload_merge_init_tasks_", (com.applovin.impl.sdk.b.b) null);
            return a2 != null && ((Boolean) this.f2968c.a(a2)).booleanValue() && e() > 0;
        }
        if (this.e != null && g() == 0) {
            return false;
        }
        String upperCase = ((String) this.f2968c.a(com.applovin.impl.sdk.b.b.aJ)).toUpperCase(Locale.ENGLISH);
        return (upperCase.contains(AppLovinAdSize.INTERSTITIAL.getLabel()) || upperCase.contains(AppLovinAdSize.BANNER.getLabel()) || upperCase.contains(AppLovinAdSize.MREC.getLabel()) || upperCase.contains(AppLovinAdSize.LEADER.getLabel())) ? ((Boolean) this.f2968c.a(com.applovin.impl.sdk.b.b.bh)).booleanValue() : this.f2968c.O().a(this) && g() > 0 && ((Boolean) this.f2968c.a(com.applovin.impl.sdk.b.b.dX)).booleanValue();
    }

    public boolean k() {
        return com.applovin.impl.sdk.e.f.a(this.e, "wrapped_ads_enabled") ? com.applovin.impl.sdk.e.f.a(this.e, "wrapped_ads_enabled", (Boolean) false, this.f2968c).booleanValue() : b() != null ? this.f2968c.b(com.applovin.impl.sdk.b.b.bV).contains(b().getLabel()) : ((Boolean) this.f2968c.a(com.applovin.impl.sdk.b.b.bU)).booleanValue();
    }

    public boolean l() {
        return b(this.f2968c).contains(this);
    }

    public String toString() {
        return "AdZone{identifier=" + this.f + ", zoneObject=" + this.e + '}';
    }
}
