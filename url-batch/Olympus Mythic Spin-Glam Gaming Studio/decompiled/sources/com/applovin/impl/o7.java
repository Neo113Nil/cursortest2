package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import com.applovin.impl.sdk.utils.JsonUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o7 extends com.applovin.impl.sdk.ad.b implements q4 {
    private final String n;
    private final String o;
    private final x7 p;
    private final long q;
    private final b8 r;
    private final r7 s;
    private final String t;
    private final q7 u;
    private final l4 v;
    private final Set w;
    private final Set x;

    public static class b {
        private JSONObject a;
        private JSONObject b;
        private com.applovin.impl.sdk.k c;
        private long d;
        private String e;
        private String f;
        private x7 g;
        private b8 h;
        private r7 i;
        private q7 j;
        private Set k;
        private Set l;

        public b b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b b(Set set) {
            this.k = set;
            return this;
        }

        public b a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public b a(com.applovin.impl.sdk.k kVar) {
            if (kVar != null) {
                this.c = kVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public b a(String str) {
            this.f = str;
            return this;
        }

        public b a(x7 x7Var) {
            this.g = x7Var;
            return this;
        }

        public b a(b8 b8Var) {
            this.h = b8Var;
            return this;
        }

        public b a(r7 r7Var) {
            this.i = r7Var;
            return this;
        }

        public b a(q7 q7Var) {
            this.j = q7Var;
            return this;
        }

        public b a(Set set) {
            this.l = set;
            return this;
        }

        public b a(long j) {
            this.d = j;
            return this;
        }

        public o7 a() {
            return new o7(this);
        }
    }

    public enum c {
        COMPANION_AD,
        VIDEO
    }

    public enum d {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        INDUSTRY_ICON_IMPRESSION,
        INDUSTRY_ICON_CLICK,
        ERROR
    }

    private Set h1() {
        r7 r7Var = this.s;
        return r7Var != null ? r7Var.b() : Collections.emptySet();
    }

    private String k1() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    private Set o1() {
        b8 b8Var = this.r;
        return b8Var != null ? b8Var.b() : Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List s(h5 h5Var) {
        return n7.a(h5Var.a("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public List A() {
        List a2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return (List) h5Var.a(new Function() { // from class: com.applovin.impl.o7$$ExternalSyntheticLambda0
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    List s;
                    s = o7.this.s((h5) obj);
                    return s;
                }
            });
        }
        synchronized (this.adObjectLock) {
            a2 = n7.a(getJsonObjectFromAdObject("vimp_urls", new JSONObject()), getClCode(), null, k1(), J(), N0(), this.sdk);
        }
        return a2;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean B0() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && f1() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean C0() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void E0() {
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String I() {
        return this.t;
    }

    public Set a(d dVar, String str) {
        return a(dVar, new String[]{str});
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri c0() {
        return f1();
    }

    public void d(String str) {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.b("html_template", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public q7 e1() {
        return this.u;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7) || !super.equals(obj)) {
            return false;
        }
        o7 o7Var = (o7) obj;
        String str = this.n;
        if (str == null ? o7Var.n != null : !str.equals(o7Var.n)) {
            return false;
        }
        String str2 = this.o;
        if (str2 == null ? o7Var.o != null : !str2.equals(o7Var.o)) {
            return false;
        }
        x7 x7Var = this.p;
        if (x7Var == null ? o7Var.p != null : !x7Var.equals(o7Var.p)) {
            return false;
        }
        b8 b8Var = this.r;
        if (b8Var == null ? o7Var.r != null : !b8Var.equals(o7Var.r)) {
            return false;
        }
        r7 r7Var = this.s;
        if (r7Var == null ? o7Var.s != null : !r7Var.equals(o7Var.s)) {
            return false;
        }
        q7 q7Var = this.u;
        if (q7Var == null ? o7Var.u != null : !q7Var.equals(o7Var.u)) {
            return false;
        }
        Set set = this.w;
        if (set == null ? o7Var.w != null : !set.equals(o7Var.w)) {
            return false;
        }
        Set set2 = this.x;
        Set set3 = o7Var.x;
        return set2 != null ? set2.equals(set3) : set3 == null;
    }

    public Uri f1() {
        b8 b8Var = this.r;
        if (b8Var != null) {
            return b8Var.c();
        }
        return null;
    }

    public r7 g1() {
        return this.s;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.q;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List g;
        b8 b8Var = this.r;
        return (b8Var == null || (g = b8Var.g()) == null || g.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.n;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.o;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        x7 x7Var = this.p;
        int hashCode4 = (hashCode3 + (x7Var != null ? x7Var.hashCode() : 0)) * 31;
        b8 b8Var = this.r;
        int hashCode5 = (hashCode4 + (b8Var != null ? b8Var.hashCode() : 0)) * 31;
        r7 r7Var = this.s;
        int hashCode6 = (hashCode5 + (r7Var != null ? r7Var.hashCode() : 0)) * 31;
        q7 q7Var = this.u;
        int hashCode7 = (hashCode6 + (q7Var != null ? q7Var.hashCode() : 0)) * 31;
        Set set = this.w;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set set2 = this.x;
        return hashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public String i1() {
        return getStringFromAdObject("html_template", "");
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject(UnifiedMediationParams.KEY_OM_SDK_ENABLED, Boolean.TRUE) && this.u != null;
    }

    public c j1() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? c.COMPANION_AD : c.VIDEO;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri l0() {
        c8 q1 = q1();
        if (q1 != null) {
            return q1.e();
        }
        return null;
    }

    public u7 l1() {
        b8 b8Var = this.r;
        if (b8Var != null) {
            return b8Var.f();
        }
        return null;
    }

    public long m1() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    public x7 n1() {
        return this.p;
    }

    public b8 p1() {
        return this.r;
    }

    public c8 q1() {
        Long f = r0.f(this.sdk);
        return this.r.a(f != null ? f.longValue() : 0L);
    }

    public boolean r1() {
        return l1() != null;
    }

    public boolean s1() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    public void t1() {
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            h5Var.c("vast_is_streaming");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.n + "', adDescription='" + this.o + "', systemInfo=" + this.p + ", videoCreative=" + this.r + ", companionAd=" + this.s + ", adVerifications=" + this.u + ", impressionTrackers=" + this.w + ", errorTrackers=" + this.x + '}';
    }

    public boolean u1() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean v1() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public boolean w1() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public boolean x1() {
        return getBooleanFromAdObject("iopms", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean y0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    public boolean y1() {
        return getBooleanFromAdObject("iopmsfsr", Boolean.TRUE);
    }

    private o7(b bVar) {
        super(bVar.a, bVar.b, bVar.c);
        this.n = bVar.e;
        this.p = bVar.g;
        this.o = bVar.f;
        this.r = bVar.h;
        this.s = bVar.i;
        this.u = bVar.j;
        this.w = bVar.k;
        this.x = bVar.l;
        this.v = new l4(this);
        Uri l0 = l0();
        if (l0 != null) {
            this.t = l0.toString();
        } else {
            this.t = "";
        }
        this.q = bVar.d;
    }

    public Set a(d dVar, String[] strArr) {
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().a("VastAd", "Retrieving trackers of type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'...");
        }
        if (dVar == d.IMPRESSION) {
            return this.w;
        }
        if (dVar == d.VIDEO_CLICK) {
            return o1();
        }
        if (dVar == d.COMPANION_CLICK) {
            return h1();
        }
        if (dVar == d.VIDEO) {
            return a(c.VIDEO, strArr);
        }
        if (dVar == d.COMPANION) {
            return a(c.COMPANION_AD, strArr);
        }
        if (dVar == d.INDUSTRY_ICON_CLICK) {
            return l1().b();
        }
        if (dVar == d.INDUSTRY_ICON_IMPRESSION) {
            return l1().f();
        }
        if (dVar == d.ERROR) {
            return this.x;
        }
        this.sdk.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.sdk.O().b("VastAd", "Failed to retrieve trackers of invalid type '" + dVar + "' and events '" + Arrays.toString(strArr) + "'");
        }
        return Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.e4
    public l4 getAdEventTracker() {
        return this.v;
    }

    private Set a(c cVar, String[] strArr) {
        Map d2;
        r7 r7Var;
        b8 b8Var;
        if (strArr != null && strArr.length > 0) {
            if (cVar == c.VIDEO && (b8Var = this.r) != null) {
                d2 = b8Var.e();
            } else {
                d2 = (cVar != c.COMPANION_AD || (r7Var = this.s) == null) ? null : r7Var.d();
            }
            HashSet hashSet = new HashSet();
            if (d2 != null && !d2.isEmpty()) {
                for (String str : strArr) {
                    if (d2.containsKey(str)) {
                        hashSet.addAll((Collection) d2.get(str));
                    }
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return Collections.emptySet();
    }

    public static o7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b bVar = new b();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null);
        if (jSONObject2 == null) {
            return null;
        }
        bVar.b = jSONObject2;
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, "ads", new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        bVar.a = jSONObject3;
        bVar.c = kVar;
        bVar.d = JsonUtils.getLong(jSONObject, "created_at_millis", 0L);
        bVar.e = JsonUtils.getString(jSONObject, "title", "");
        bVar.f = JsonUtils.getString(jSONObject, "ad_description", "");
        bVar.g = x7.a(JsonUtils.getJSONObject(jSONObject, "system_info", (JSONObject) null), kVar);
        bVar.h = b8.a(JsonUtils.getJSONObject(jSONObject, "video_creative", (JSONObject) null), kVar);
        bVar.i = r7.a(JsonUtils.getJSONObject(jSONObject, "companion_ad", (JSONObject) null), kVar);
        bVar.j = q7.a(JsonUtils.getJSONObject(jSONObject, "ad_verifications", (JSONObject) null), kVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "impression_trackers", new JSONArray());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            y7 a2 = y7.a(JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), kVar);
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        bVar.k = hashSet;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "error_trackers", new JSONArray());
        HashSet hashSet2 = new HashSet();
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            y7 a3 = y7.a(JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null), kVar);
            if (a3 != null) {
                hashSet2.add(a3);
            }
        }
        bVar.l = hashSet2;
        o7 o7Var = new o7(bVar);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject, "cached_ad_html_resources_urls", new JSONObject());
        Iterator<String> keys = jSONObject4.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = JsonUtils.getString(jSONObject4, next, null);
            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                o7Var.a(next, string);
            }
        }
        return o7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "created_at_millis", this.q);
        JsonUtils.putString(jSONObject, "title", this.n);
        JsonUtils.putString(jSONObject, "ad_description", this.o);
        x7 x7Var = this.p;
        if (x7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "system_info", x7Var.a());
        }
        b8 b8Var = this.r;
        if (b8Var != null) {
            JsonUtils.putJSONObject(jSONObject, "video_creative", b8Var.a());
        }
        r7 r7Var = this.s;
        if (r7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "companion_ad", r7Var.a());
        }
        q7 q7Var = this.u;
        if (q7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "ad_verifications", q7Var.a());
        }
        if (this.w != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                jSONArray.put(((y7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "impression_trackers", jSONArray);
        }
        if (this.x != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.x.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((y7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_trackers", jSONArray2);
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : l().entrySet()) {
            JsonUtils.putString(jSONObject2, (String) entry.getKey(), (String) entry.getValue());
        }
        JsonUtils.putJSONObject(jSONObject, "cached_ad_html_resources_urls", jSONObject2);
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", h5Var.a());
        } else {
            synchronized (this.fullResponseLock) {
                JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
            }
        }
        return jSONObject;
    }
}
