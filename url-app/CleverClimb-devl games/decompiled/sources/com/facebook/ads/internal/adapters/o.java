package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.facebook.ads.internal.a.d;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.n.e;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o extends ab implements d.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4979a = "o";
    private com.facebook.ads.internal.n.f A;
    private String B;
    private String C;
    private com.facebook.ads.internal.n.h D;
    private List<com.facebook.ads.internal.n.e> E;
    private int G;
    private String H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private com.facebook.ads.internal.m.c P;
    private e.d Q;

    /* renamed from: b, reason: collision with root package name */
    private Context f4980b;

    /* renamed from: c, reason: collision with root package name */
    private ac f4981c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f4982d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private com.facebook.ads.internal.n.f j;
    private com.facebook.ads.internal.n.f k;
    private com.facebook.ads.internal.n.g l;
    private String m;
    private com.facebook.ads.internal.a.c n;
    private Collection<String> o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private String w;
    private String x;
    private com.facebook.ads.internal.n.j y;
    private String z;
    private int F = -1;
    private long N = 0;
    private a.EnumC0346a O = null;

    private boolean H() {
        return this.e != null && this.e.length() > 0 && (this.j != null || this.I) && this.k != null;
    }

    private void I() {
        if (this.M) {
            return;
        }
        if (this.P != null) {
            this.P.a(this.m);
        }
        this.M = true;
    }

    private void a(Context context, JSONObject jSONObject, com.facebook.ads.internal.m.c cVar, String str, int i, int i2) {
        this.I = true;
        this.f4980b = context;
        this.P = cVar;
        this.F = i;
        this.G = i2;
        a(jSONObject, str);
    }

    private void a(Map<String, String> map, final Map<String, String> map2) {
        try {
            final Map<String, String> c2 = c(map);
            new Handler().postDelayed(new Runnable() { // from class: com.facebook.ads.internal.adapters.o.1
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.isEmpty(o.this.H)) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.putAll(map2);
                    hashMap.putAll(c2);
                    if (o.this.P != null) {
                        o.this.P.e(o.this.H, hashMap);
                    }
                }
            }, this.s * 1000);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:6|(1:8)(1:55)|9|(1:11)|12|(3:50|51|(1:53)(15:54|15|(1:17)|18|19|20|21|(1:23)(2:41|(1:43)(1:44))|24|25|26|27|(4:31|(1:33)|34|35)|37|38))|14|15|(0)|18|19|20|21|(0)(0)|24|25|26|27|(5:29|31|(0)|34|35)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x018d, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018e, code lost:
    
        android.util.Log.e(com.facebook.ads.internal.adapters.o.f4979a, "Unable to parse carousel data.", r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0110, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        r0.printStackTrace();
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0167 A[Catch: JSONException -> 0x018d, LOOP:0: B:32:0x0165->B:33:0x0167, LOOP_END, TryCatch #0 {JSONException -> 0x018d, blocks: (B:27:0x014e, B:29:0x0156, B:31:0x015c, B:33:0x0167, B:35:0x018a), top: B:26:0x014e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(JSONObject jSONObject, String str) {
        com.facebook.ads.internal.n.h hVar;
        JSONArray optJSONArray;
        int length;
        if (this.J) {
            throw new IllegalStateException("Adapter already loaded data");
        }
        if (jSONObject == null) {
            return;
        }
        com.facebook.ads.internal.q.a.d.a(this.f4980b, "Audience Network Loaded");
        this.H = str;
        String a2 = com.facebook.ads.internal.q.a.j.a(jSONObject, "fbad_command");
        this.f4982d = TextUtils.isEmpty(a2) ? null : Uri.parse(a2);
        this.e = com.facebook.ads.internal.q.a.j.a(jSONObject, TJAdUnitConstants.String.TITLE);
        this.f = com.facebook.ads.internal.q.a.j.a(jSONObject, FacebookAdapter.KEY_SUBTITLE_ASSET);
        this.g = com.facebook.ads.internal.q.a.j.a(jSONObject, "body");
        this.h = com.facebook.ads.internal.q.a.j.a(jSONObject, "call_to_action");
        if (TextUtils.isEmpty(this.h)) {
            this.h = null;
        }
        this.i = com.facebook.ads.internal.q.a.j.a(jSONObject, FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET);
        this.j = com.facebook.ads.internal.n.f.a(jSONObject.optJSONObject("icon"));
        this.k = com.facebook.ads.internal.n.f.a(jSONObject.optJSONObject("image"));
        this.l = com.facebook.ads.internal.n.g.a(jSONObject.optJSONObject("star_rating"));
        this.m = com.facebook.ads.internal.q.a.j.a(jSONObject, "used_report_url");
        this.p = jSONObject.optBoolean("manual_imp");
        this.q = jSONObject.optBoolean("enable_view_log");
        this.r = jSONObject.optBoolean("enable_snapshot_log");
        this.s = jSONObject.optInt("snapshot_log_delay_second", 4);
        this.t = jSONObject.optInt("snapshot_compress_quality", 0);
        this.u = jSONObject.optInt("viewability_check_initial_delay", 0);
        this.v = jSONObject.optInt("viewability_check_interval", 1000);
        JSONObject optJSONObject = jSONObject.optJSONObject("ad_choices_icon");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("native_ui_config");
        if (optJSONObject2 != null) {
            try {
            } catch (JSONException unused) {
                this.D = null;
            }
            if (optJSONObject2.length() != 0) {
                hVar = new com.facebook.ads.internal.n.h(optJSONObject2);
                this.D = hVar;
                if (optJSONObject != null) {
                    this.A = com.facebook.ads.internal.n.f.a(optJSONObject);
                }
                this.B = com.facebook.ads.internal.q.a.j.a(jSONObject, "ad_choices_link_url");
                this.C = com.facebook.ads.internal.q.a.j.a(jSONObject, "request_id");
                this.n = com.facebook.ads.internal.a.c.a(jSONObject.optString("invalidation_behavior"));
                JSONArray jSONArray = new JSONArray(jSONObject.optString("detection_strings"));
                this.o = com.facebook.ads.internal.a.d.a(jSONArray);
                this.w = com.facebook.ads.internal.q.a.j.a(jSONObject, "video_url");
                this.x = com.facebook.ads.internal.q.a.j.a(jSONObject, "video_mpd");
                this.y = jSONObject.has("video_autoplay_enabled") ? com.facebook.ads.internal.n.j.DEFAULT : jSONObject.optBoolean("video_autoplay_enabled") ? com.facebook.ads.internal.n.j.ON : com.facebook.ads.internal.n.j.OFF;
                this.z = com.facebook.ads.internal.q.a.j.a(jSONObject, "video_report_url");
                optJSONArray = jSONObject.optJSONArray("carousel");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    length = optJSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        o oVar = new o();
                        oVar.a(this.f4980b, optJSONArray.getJSONObject(i), this.P, str, i, length);
                        arrayList.add(new com.facebook.ads.internal.n.e(this.f4980b, oVar, null, this.Q));
                    }
                    this.E = arrayList;
                }
                this.J = true;
                this.K = H();
            }
        }
        hVar = null;
        this.D = hVar;
        if (optJSONObject != null) {
        }
        this.B = com.facebook.ads.internal.q.a.j.a(jSONObject, "ad_choices_link_url");
        this.C = com.facebook.ads.internal.q.a.j.a(jSONObject, "request_id");
        this.n = com.facebook.ads.internal.a.c.a(jSONObject.optString("invalidation_behavior"));
        JSONArray jSONArray2 = new JSONArray(jSONObject.optString("detection_strings"));
        this.o = com.facebook.ads.internal.a.d.a(jSONArray2);
        this.w = com.facebook.ads.internal.q.a.j.a(jSONObject, "video_url");
        this.x = com.facebook.ads.internal.q.a.j.a(jSONObject, "video_mpd");
        this.y = jSONObject.has("video_autoplay_enabled") ? com.facebook.ads.internal.n.j.DEFAULT : jSONObject.optBoolean("video_autoplay_enabled") ? com.facebook.ads.internal.n.j.ON : com.facebook.ads.internal.n.j.OFF;
        this.z = com.facebook.ads.internal.q.a.j.a(jSONObject, "video_report_url");
        optJSONArray = jSONObject.optJSONArray("carousel");
        if (optJSONArray != null) {
            length = optJSONArray.length();
            ArrayList arrayList2 = new ArrayList(length);
            while (i < length) {
            }
            this.E = arrayList2;
        }
        this.J = true;
        this.K = H();
    }

    private Map<String, String> c(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map.containsKey(Promotion.ACTION_VIEW)) {
            hashMap.put(Promotion.ACTION_VIEW, map.get(Promotion.ACTION_VIEW));
        }
        if (map.containsKey("snapshot")) {
            hashMap.put("snapshot", map.get("snapshot"));
        }
        return hashMap;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String A() {
        return this.z;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public List<com.facebook.ads.internal.n.e> B() {
        if (c_()) {
            return this.E;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int C() {
        return this.F;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int D() {
        return this.G;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.c E() {
        return com.facebook.ads.internal.n.c.AN;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String G() {
        if (!c_()) {
            return null;
        }
        I();
        return this.g;
    }

    @Override // com.facebook.ads.internal.a.d.a
    public com.facebook.ads.internal.a.c a() {
        return this.n;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(int i) {
        if (c_() && i == 0 && this.N > 0 && this.O != null) {
            com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(this.N, this.O, this.C));
            this.N = 0L;
            this.O = null;
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(Context context, ac acVar, com.facebook.ads.internal.m.c cVar, Map<String, Object> map, e.d dVar) {
        this.f4980b = context;
        this.f4981c = acVar;
        this.P = cVar;
        this.Q = dVar;
        JSONObject jSONObject = (JSONObject) map.get("data");
        a(jSONObject, com.facebook.ads.internal.q.a.j.a(jSONObject, "ct"));
        if (com.facebook.ads.internal.a.d.a(context, this, cVar)) {
            acVar.a(this, new com.facebook.ads.internal.protocol.a(AdErrorType.NO_FILL, "No Fill"));
            return;
        }
        if (acVar != null) {
            acVar.a(this);
        }
        com.facebook.ads.internal.j.a.f5160a = this.C;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(View view, List<View> list) {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(ac acVar) {
        this.f4981c = acVar;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void a(Map<String, String> map) {
        if (c_() && !this.L) {
            if (this.f4981c != null) {
                this.f4981c.b(this);
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (this.I) {
                hashMap.put("cardind", String.valueOf(this.F));
                hashMap.put("cardcnt", String.valueOf(this.G));
            }
            if (!TextUtils.isEmpty(c()) && this.P != null) {
                this.P.a(c(), hashMap);
            }
            if (f() || e()) {
                a(map, hashMap);
            }
            this.L = true;
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean a_() {
        return c_() && this.f4982d != null;
    }

    @Override // com.facebook.ads.internal.a.d.a
    public Collection<String> b() {
        return this.o;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b(Map<String, String> map) {
        if (c_()) {
            if (com.facebook.ads.internal.l.a.c(this.f4980b) && com.facebook.ads.internal.q.a.x.a(map)) {
                Log.e(f4979a, "Click happened on lockscreen ad");
                return;
            }
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            com.facebook.ads.internal.q.a.d.a(this.f4980b, "Click logged");
            if (this.f4981c != null) {
                this.f4981c.c(this);
            }
            if (this.I) {
                hashMap.put("cardind", String.valueOf(this.F));
                hashMap.put("cardcnt", String.valueOf(this.G));
            }
            com.facebook.ads.internal.a.a a2 = com.facebook.ads.internal.a.b.a(this.f4980b, this.P, this.H, this.f4982d, hashMap);
            if (a2 != null) {
                try {
                    this.N = System.currentTimeMillis();
                    this.O = a2.a();
                    a2.b();
                } catch (Exception e) {
                    Log.e(f4979a, "Error executing action", e);
                }
            }
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public void b_() {
        if (this.E == null || this.E.isEmpty()) {
            return;
        }
        Iterator<com.facebook.ads.internal.n.e> it = this.E.iterator();
        while (it.hasNext()) {
            it.next().D();
        }
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String c() {
        return this.H;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean c_() {
        return this.J && this.K;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean d() {
        return c_() && this.p;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean e() {
        return c_() && this.r;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean f() {
        return c_() && this.q;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean g() {
        return c_() && this.D != null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public boolean h() {
        return true;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int i() {
        if (this.t < 0 || this.t > 100) {
            return 0;
        }
        return this.t;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int j() {
        return this.u;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public int k() {
        return this.v;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f l() {
        if (c_()) {
            return this.j;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f m() {
        if (c_()) {
            return this.k;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.h n() {
        if (c_()) {
            return this.D;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String o() {
        if (!c_()) {
            return null;
        }
        I();
        return this.e;
    }

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public void onDestroy() {
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String p() {
        if (!c_()) {
            return null;
        }
        I();
        return this.f;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String q() {
        if (!c_()) {
            return null;
        }
        I();
        return com.facebook.ads.internal.q.a.p.a(this.g);
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String r() {
        if (!c_()) {
            return null;
        }
        I();
        return this.h;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String s() {
        if (!c_()) {
            return null;
        }
        I();
        return this.i;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.g t() {
        if (!c_()) {
            return null;
        }
        I();
        return this.l;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.f u() {
        if (c_()) {
            return this.A;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String v() {
        if (c_()) {
            return this.B;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String w() {
        if (c_()) {
            return "AdChoices";
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String x() {
        if (c_()) {
            return this.w;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public String y() {
        if (c_()) {
            return this.x;
        }
        return null;
    }

    @Override // com.facebook.ads.internal.adapters.ab
    public com.facebook.ads.internal.n.j z() {
        return !c_() ? com.facebook.ads.internal.n.j.DEFAULT : this.y;
    }
}
