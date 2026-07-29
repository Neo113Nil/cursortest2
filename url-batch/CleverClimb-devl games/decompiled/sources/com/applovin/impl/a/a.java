package com.applovin.impl.a;

import android.net.Uri;
import com.applovin.impl.a.j;
import com.applovin.impl.sdk.e.l;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.ad.g {

    /* renamed from: a, reason: collision with root package name */
    private final String f2379a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2380b;

    /* renamed from: c, reason: collision with root package name */
    private final f f2381c;

    /* renamed from: d, reason: collision with root package name */
    private final long f2382d;
    private final j e;
    private final com.applovin.impl.a.b f;
    private final Set<g> g;
    private final Set<g> h;

    /* renamed from: com.applovin.impl.a.a$a, reason: collision with other inner class name */
    public static class C0299a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f2383a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f2384b;

        /* renamed from: c, reason: collision with root package name */
        private com.applovin.impl.sdk.ad.b f2385c;

        /* renamed from: d, reason: collision with root package name */
        private com.applovin.impl.sdk.j f2386d;
        private long e;
        private String f;
        private String g;
        private f h;
        private j i;
        private com.applovin.impl.a.b j;
        private Set<g> k;
        private Set<g> l;

        private C0299a() {
        }

        public C0299a a(long j) {
            this.e = j;
            return this;
        }

        public C0299a a(com.applovin.impl.a.b bVar) {
            this.j = bVar;
            return this;
        }

        public C0299a a(f fVar) {
            this.h = fVar;
            return this;
        }

        public C0299a a(j jVar) {
            this.i = jVar;
            return this;
        }

        public C0299a a(com.applovin.impl.sdk.ad.b bVar) {
            this.f2385c = bVar;
            return this;
        }

        public C0299a a(com.applovin.impl.sdk.j jVar) {
            if (jVar == null) {
                throw new IllegalArgumentException("No sdk specified.");
            }
            this.f2386d = jVar;
            return this;
        }

        public C0299a a(String str) {
            this.f = str;
            return this;
        }

        public C0299a a(Set<g> set) {
            this.k = set;
            return this;
        }

        public C0299a a(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No ad object specified.");
            }
            this.f2383a = jSONObject;
            return this;
        }

        public a a() {
            return new a(this);
        }

        public C0299a b(String str) {
            this.g = str;
            return this;
        }

        public C0299a b(Set<g> set) {
            this.l = set;
            return this;
        }

        public C0299a b(JSONObject jSONObject) {
            if (jSONObject == null) {
                throw new IllegalArgumentException("No full ad response specified.");
            }
            this.f2384b = jSONObject;
            return this;
        }
    }

    private enum b {
        VIDEO,
        COMPANION_AD
    }

    public enum c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        ERROR
    }

    private a(C0299a c0299a) {
        super(c0299a.f2383a, c0299a.f2384b, c0299a.f2385c, c0299a.f2386d);
        this.f2379a = c0299a.f;
        this.f2381c = c0299a.h;
        this.f2380b = c0299a.g;
        this.e = c0299a.i;
        this.f = c0299a.j;
        this.g = c0299a.k;
        this.h = c0299a.l;
        this.f2382d = c0299a.e;
    }

    private Set<g> a(b bVar, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<g>> map = null;
        if (bVar == b.VIDEO && this.e != null) {
            map = this.e.e();
        } else if (bVar == b.COMPANION_AD && this.f != null) {
            map = this.f.d();
        }
        HashSet hashSet = new HashSet();
        if (map != null && !map.isEmpty()) {
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    hashSet.addAll(map.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private j.a aA() {
        j.a[] values = j.a.values();
        int intValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.b.b.eQ)).intValue();
        return (intValue < 0 || intValue >= values.length) ? j.a.UNSPECIFIED : values[intValue];
    }

    private Set<g> aB() {
        return this.e != null ? this.e.d() : Collections.emptySet();
    }

    private Set<g> aC() {
        return this.f != null ? this.f.c() : Collections.emptySet();
    }

    public static C0299a ay() {
        return new C0299a();
    }

    private String az() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    public j a() {
        return this.e;
    }

    public Set<g> a(c cVar, String str) {
        return a(cVar, new String[]{str});
    }

    public Set<g> a(c cVar, String[] strArr) {
        this.sdk.u().a("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        if (cVar == c.IMPRESSION) {
            return this.g;
        }
        if (cVar == c.VIDEO_CLICK) {
            return aB();
        }
        if (cVar == c.COMPANION_CLICK) {
            return aC();
        }
        if (cVar == c.VIDEO) {
            return a(b.VIDEO, strArr);
        }
        if (cVar == c.COMPANION) {
            return a(b.COMPANION_AD, strArr);
        }
        if (cVar == c.ERROR) {
            return this.h;
        }
        this.sdk.u().d("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
        return Collections.emptySet();
    }

    public void a(String str) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_template", str);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.applovin.impl.sdk.ad.g
    public List<com.applovin.impl.sdk.c.a> ak() {
        return l.a("vimp_urls", this.adObject, getClCode(), az(), this.sdk);
    }

    public boolean ax() {
        return getBooleanFromAdObject("cache_video", true);
    }

    @Override // com.applovin.impl.sdk.ad.g
    public boolean b() {
        k c2 = c();
        return c2 != null && c2.c();
    }

    public k c() {
        if (this.e != null) {
            return this.e.a(aA());
        }
        return null;
    }

    public com.applovin.impl.a.b d() {
        return this.f;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public Uri e() {
        k c2 = c();
        if (c2 != null) {
            return c2.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2379a == null ? aVar.f2379a != null : !this.f2379a.equals(aVar.f2379a)) {
            return false;
        }
        if (this.f2380b == null ? aVar.f2380b != null : !this.f2380b.equals(aVar.f2380b)) {
            return false;
        }
        if (this.f2381c == null ? aVar.f2381c != null : !this.f2381c.equals(aVar.f2381c)) {
            return false;
        }
        if (this.e == null ? aVar.e != null : !this.e.equals(aVar.e)) {
            return false;
        }
        if (this.f == null ? aVar.f != null : !this.f.equals(aVar.f)) {
            return false;
        }
        if (this.g == null ? aVar.g == null : this.g.equals(aVar.g)) {
            return this.h != null ? this.h.equals(aVar.h) : aVar.h == null;
        }
        return false;
    }

    public List<String> f() {
        return com.applovin.impl.sdk.e.c.a(getStringFromAdObject("vast_resource_cache_prefix", null));
    }

    @Override // com.applovin.impl.sdk.ad.g
    public Uri g() {
        if (this.e != null) {
            return this.e.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f2382d;
    }

    @Override // com.applovin.impl.sdk.ad.g
    public Uri h() {
        return g();
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public boolean hasVideoUrl() {
        List<k> a2;
        return (this.e == null || (a2 = this.e.a()) == null || a2.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public int hashCode() {
        return (((((((((((((super.hashCode() * 31) + (this.f2379a != null ? this.f2379a.hashCode() : 0)) * 31) + (this.f2380b != null ? this.f2380b.hashCode() : 0)) * 31) + (this.f2381c != null ? this.f2381c.hashCode() : 0)) * 31) + (this.e != null ? this.e.hashCode() : 0)) * 31) + (this.f != null ? this.f.hashCode() : 0)) * 31) + (this.g != null ? this.g.hashCode() : 0)) * 31) + (this.h != null ? this.h.hashCode() : 0);
    }

    public boolean i() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", false);
    }

    public String j() {
        return getStringFromAdObject("html_template", "");
    }

    public Uri k() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (com.applovin.impl.sdk.e.i.b(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean l() {
        return getBooleanFromAdObject("cache_companion_ad", true);
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public String toString() {
        return "VastAd{title='" + this.f2379a + "', adDescription='" + this.f2380b + "', systemInfo=" + this.f2381c + ", videoCreative=" + this.e + ", companionAd=" + this.f + ", impressionTrackers=" + this.g + ", errorTrackers=" + this.h + '}';
    }

    @Override // com.applovin.impl.sdk.ad.g
    public boolean v() {
        return g() != null;
    }
}
