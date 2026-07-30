package com.anythink.expressad.videocommon.e;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f22578a = 2;
    private static com.anythink.expressad.foundation.c.c ak = null;

    /* renamed from: b, reason: collision with root package name */
    public static final int f22579b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final int f22580c = 5;

    /* renamed from: d, reason: collision with root package name */
    public static final int f22581d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f22582e = 7;

    /* renamed from: f, reason: collision with root package name */
    public static final int f22583f = -2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f22584g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f22585h = 0;
    public static final int i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f22586j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f22587k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f22588l = -1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f22589m = 5;

    /* renamed from: n, reason: collision with root package name */
    public static final int f22590n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f22591o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static final int f22592p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f22593q = -1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f22594r = -2;

    /* renamed from: s, reason: collision with root package name */
    public static final int f22595s = -3;

    /* renamed from: t, reason: collision with root package name */
    public static final int f22596t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f22597u = -1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f22598v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f22599w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static String f22600x;

    /* renamed from: A, reason: collision with root package name */
    private List<com.anythink.expressad.videocommon.c.b> f22601A;

    /* renamed from: B, reason: collision with root package name */
    private long f22602B;

    /* renamed from: V, reason: collision with root package name */
    private ArrayList<Integer> f22621V;
    private int ai;
    private int al;
    private JSONArray aw;
    private JSONObject ax;

    /* renamed from: y, reason: collision with root package name */
    private String f22625y;

    /* renamed from: z, reason: collision with root package name */
    private String f22626z;

    /* renamed from: C, reason: collision with root package name */
    private int f22603C = -1;

    /* renamed from: D, reason: collision with root package name */
    private int f22604D = 0;

    /* renamed from: E, reason: collision with root package name */
    private int f22605E = 0;

    /* renamed from: F, reason: collision with root package name */
    private int f22606F = 1;

    /* renamed from: G, reason: collision with root package name */
    private int f22607G = 1;

    /* renamed from: H, reason: collision with root package name */
    private int f22608H = 1;

    /* renamed from: I, reason: collision with root package name */
    private int f22609I = 1;
    private double J = 1.0d;

    /* renamed from: K, reason: collision with root package name */
    private int f22610K = 2;

    /* renamed from: L, reason: collision with root package name */
    private int f22611L = 5;

    /* renamed from: M, reason: collision with root package name */
    private int f22612M = 1;

    /* renamed from: N, reason: collision with root package name */
    private int f22613N = 3;

    /* renamed from: O, reason: collision with root package name */
    private int f22614O = 80;

    /* renamed from: P, reason: collision with root package name */
    private int f22615P = 100;

    /* renamed from: Q, reason: collision with root package name */
    private int f22616Q = 0;

    /* renamed from: R, reason: collision with root package name */
    private double f22617R = 1.0d;

    /* renamed from: S, reason: collision with root package name */
    private int f22618S = -1;

    /* renamed from: T, reason: collision with root package name */
    private int f22619T = 2;

    /* renamed from: U, reason: collision with root package name */
    private double f22620U = 1.0d;

    /* renamed from: W, reason: collision with root package name */
    private int f22622W = 3;

    /* renamed from: X, reason: collision with root package name */
    private int f22623X = 1;
    private int Y = 0;

    /* renamed from: Z, reason: collision with root package name */
    private int f22624Z = 100;
    private int aa = 60;
    private String ab = "";
    private int ac = 0;
    private int ad = 70;
    private int ae = 0;
    private int af = -1;
    private int ag = -1;
    private int ah = -1;
    private int aj = 20;
    private int am = 0;
    private int an = 1;
    private String ao = "";
    private int ap = 1;
    private String aq = "";
    private int ar = 1;
    private String as = "Virtual Item";
    private int at = 0;
    private int au = 1;
    private int av = 60;

    public static String J() {
        return f22600x;
    }

    private String W() {
        return this.ab;
    }

    private int X() {
        return this.f22624Z;
    }

    private int Y() {
        return this.aa;
    }

    private ArrayList<Integer> Z() {
        return this.f22621V;
    }

    private int aa() {
        return this.ae;
    }

    private int ab() {
        return this.f22604D;
    }

    private int ac() {
        return this.am;
    }

    private int ad() {
        return this.an;
    }

    private String ae() {
        return this.ao;
    }

    private String af() {
        return this.aq;
    }

    private int ag() {
        return this.ar;
    }

    private int ah() {
        return this.f22613N;
    }

    private int ai() {
        return this.f22614O;
    }

    private int aj() {
        return this.f22607G;
    }

    private int ak() {
        return this.f22609I;
    }

    private double al() {
        return this.J;
    }

    private int am() {
        return this.f22610K;
    }

    private int an() {
        return this.f22606F;
    }

    private long ao() {
        return this.f22602B;
    }

    private String ap() {
        return this.f22625y;
    }

    private double aq() {
        return this.f22617R;
    }

    private int ar() {
        return this.f22622W;
    }

    private Queue<Integer> as() {
        LinkedList linkedList;
        Exception e6;
        try {
            List<com.anythink.expressad.videocommon.c.b> list = this.f22601A;
            if (list == null || list.size() <= 0) {
                return null;
            }
            linkedList = new LinkedList();
            for (int i4 = 0; i4 < this.f22601A.size(); i4++) {
                try {
                    linkedList.add(Integer.valueOf(this.f22601A.get(i4).a()));
                } catch (Exception e9) {
                    e6 = e9;
                    if (com.anythink.expressad.a.f17776a) {
                        e6.printStackTrace();
                    }
                    return linkedList;
                }
            }
            return linkedList;
        } catch (Exception e10) {
            linkedList = null;
            e6 = e10;
        }
    }

    private int at() {
        return this.at;
    }

    private JSONArray au() {
        return this.aw;
    }

    private JSONObject av() {
        return this.ax;
    }

    private void b(int i4) {
        this.f22624Z = i4;
    }

    private void c(int i4) {
        this.aa = i4;
    }

    private void d(String str) {
        this.ab = str;
    }

    public final int A() {
        return this.f22608H;
    }

    public final void B() {
        this.f22608H = 1;
    }

    public final void C() {
        this.f22609I = 1;
    }

    public final int D() {
        return this.f22611L;
    }

    public final void E() {
        this.f22611L = 1;
    }

    public final int F() {
        return this.f22612M;
    }

    public final void G() {
        this.f22612M = 1;
    }

    public final void H() {
        this.f22606F = 1;
    }

    public final List<com.anythink.expressad.videocommon.c.b> I() {
        return this.f22601A;
    }

    public final int K() {
        return this.f22619T;
    }

    public final double L() {
        return this.f22620U;
    }

    public final int M() {
        return this.f22623X;
    }

    public final void N() {
        this.f22623X = 1;
    }

    public final String O() {
        return this.f22626z;
    }

    public final void P() {
        this.f22622W = 3;
    }

    public final Queue<Integer> Q() {
        LinkedList linkedList;
        Exception e6;
        try {
            List<com.anythink.expressad.videocommon.c.b> list = this.f22601A;
            if (list == null || list.size() <= 0) {
                return null;
            }
            linkedList = new LinkedList();
            for (int i4 = 0; i4 < this.f22601A.size(); i4++) {
                try {
                    linkedList.add(Integer.valueOf(this.f22601A.get(i4).b()));
                } catch (Exception e9) {
                    e6 = e9;
                    e6.printStackTrace();
                    return linkedList;
                }
            }
            return linkedList;
        } catch (Exception e10) {
            linkedList = null;
            e6 = e10;
        }
    }

    public final JSONObject R() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unitId", this.f22625y);
            jSONObject.put(b.f22552g, this.f22606F);
            List<com.anythink.expressad.videocommon.c.b> list = this.f22601A;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.anythink.expressad.videocommon.c.b bVar : this.f22601A) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", bVar.a());
                    jSONObject2.put("timeout", bVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            jSONObject.put("aqn", this.f22607G);
            jSONObject.put("acn", this.f22608H);
            jSONObject.put("vcn", this.f22609I);
            jSONObject.put("cbp", this.J);
            jSONObject.put("ttc_type", this.f22610K);
            jSONObject.put("offset", this.f22611L);
            jSONObject.put("dlnet", this.f22612M);
            jSONObject.put(b.J, this.f22613N);
            jSONObject.put(b.f22531K, this.f22614O);
            jSONObject.put("ready_rate", this.f22615P);
            jSONObject.put("endscreen_type", this.al);
            jSONObject.put(b.f22535O, this.ae);
            jSONObject.put(b.f22536P, this.af);
            jSONObject.put(b.f22537Q, this.ag);
            jSONObject.put(b.f22538R, this.ah);
            jSONObject.put("orientation", this.ac);
            jSONObject.put(b.f22539S, this.ai);
            jSONObject.put("playclosebtn_tm", this.f22603C);
            jSONObject.put("play_ctdown", this.f22604D);
            jSONObject.put("close_alert", this.f22605E);
            jSONObject.put(b.ac, this.f22618S);
            jSONObject.put(b.aa, this.f22617R);
            jSONObject.put(b.ar, this.f22619T);
            jSONObject.put(b.as, this.f22620U);
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<Integer> arrayList = this.f22621V;
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    Iterator<Integer> it = this.f22621V.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                }
                jSONObject.put(b.ao, jSONArray2);
            }
            jSONObject.put(b.ap, this.f22622W);
            jSONObject.put("tmorl", this.f22623X);
            jSONObject.put(b.ax, this.Y);
            jSONObject.put("placementid", this.f22626z);
            jSONObject.put("ltafemty", this.f22624Z);
            jSONObject.put("ltorwc", this.aa);
            jSONObject.put("amount_max", this.am);
            jSONObject.put("callback_rule", this.an);
            jSONObject.put("virtual_currency", this.ao);
            jSONObject.put("amount", this.ap);
            jSONObject.put("icon", this.aq);
            jSONObject.put("currency_id", this.ar);
            jSONObject.put("name", this.as);
            jSONObject.put("isDefault", this.at);
            jSONObject.put(b.aN, this.au);
            jSONObject.put(b.aO, this.av);
            return jSONObject;
        } catch (Exception e6) {
            e6.printStackTrace();
            return jSONObject;
        }
    }

    public final int S() {
        return this.ad;
    }

    public final void T() {
        this.ad = 70;
    }

    public final int U() {
        return this.au;
    }

    public final int V() {
        return this.av;
    }

    public final int a() {
        return this.Y;
    }

    public final int e() {
        return this.af;
    }

    public final int f() {
        return this.ag;
    }

    public final void g() {
        this.ag = 2;
    }

    public final int h() {
        return this.ah;
    }

    public final void i() {
        this.ah = -1;
    }

    public final int j() {
        return this.f22603C;
    }

    public final int k() {
        return this.f22605E;
    }

    public final void l() {
        this.f22605E = 1;
    }

    public final int m() {
        return this.ap;
    }

    public final String n() {
        return this.as;
    }

    public final int o() {
        return this.aj;
    }

    public final int p() {
        return this.ai;
    }

    public final void q() {
        this.ai = 1;
    }

    public final int r() {
        return this.al;
    }

    public final void s() {
        this.al = 2;
    }

    public final void t() {
        this.f22613N = 3;
    }

    public final void u() {
        this.f22614O = 80;
    }

    public final int v() {
        return this.f22615P;
    }

    public final void w() {
        this.f22615P = 100;
    }

    public final int x() {
        return this.f22616Q;
    }

    public final void y() {
        this.f22616Q = 0;
    }

    public final void z() {
        this.f22607G = 1;
    }

    private void d(int i4) {
        this.Y = i4;
    }

    private void e(int i4) {
        this.f22603C = i4;
    }

    private void f(int i4) {
        this.f22604D = i4;
    }

    private void g(int i4) {
        this.am = i4;
    }

    private void h(int i4) {
        this.an = i4;
    }

    private void i(int i4) {
        if (i4 <= 0) {
            this.ap = 1;
        } else {
            this.ap = i4;
        }
    }

    private void j(int i4) {
        this.ar = i4;
    }

    private void k(int i4) {
        this.aj = i4;
    }

    private void l(int i4) {
        this.f22610K = i4;
    }

    private int m(int i4) {
        int i9 = this.f22618S;
        if (i9 == -1) {
            if (i4 == 94) {
                return 2;
            }
            if (i4 == 287) {
                return 3;
            }
        }
        return i9;
    }

    private void n(int i4) {
        this.f22619T = i4;
    }

    private boolean o(int i4) {
        ArrayList<Integer> arrayList = this.f22621V;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        return this.f22621V.contains(Integer.valueOf(i4));
    }

    private void p(int i4) {
        this.f22618S = i4;
    }

    private void q(int i4) {
        this.at = i4;
    }

    private void r(int i4) {
        this.au = i4;
    }

    private void s(int i4) {
        this.av = i4;
    }

    public final void a(ArrayList<Integer> arrayList) {
        this.f22621V = arrayList;
    }

    public final int b() {
        return this.ac;
    }

    public final void c() {
        this.ac = 0;
    }

    private void b(double d2) {
        this.f22617R = d2;
    }

    private void c(double d2) {
        this.f22620U = d2;
    }

    private void e(String str) {
        this.ao = str;
    }

    private void f(String str) {
        this.aq = str;
    }

    private void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.as = this.ao;
        } else {
            this.as = str;
        }
    }

    private static void h(String str) {
        f22600x = str;
    }

    public final void a(int i4) {
        this.af = i4;
    }

    public final void d() {
        this.ae = 0;
    }

    private void a(double d2) {
        this.J = d2;
    }

    public static d c(String str) {
        JSONObject optJSONObject;
        int i4;
        if (ak == null) {
            ak = com.anythink.expressad.foundation.c.c.a(t.b().g());
        }
        d dVar = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                if (optJSONArray != null && (optJSONObject = optJSONArray.optJSONObject(0)) != null) {
                    String optString = optJSONObject.optString("unitId");
                    if (!TextUtils.isEmpty(optString)) {
                        d dVar2 = new d();
                        try {
                            List<com.anythink.expressad.videocommon.c.b> a9 = com.anythink.expressad.videocommon.c.b.a(optJSONObject.optJSONArray("adSourceList"));
                            dVar2.f22625y = optString;
                            dVar2.f22601A = a9;
                            dVar2.f22606F = optJSONObject.optInt(b.f22552g);
                            int optInt = optJSONObject.optInt("aqn", 1);
                            if (optInt <= 0) {
                                optInt = 1;
                            }
                            dVar2.f22607G = optInt;
                            int optInt2 = optJSONObject.optInt("acn", 1);
                            if (optInt2 < 0) {
                                optInt2 = 1;
                            }
                            dVar2.f22608H = optInt2;
                            dVar2.f22609I = optJSONObject.optInt("vcn", 5);
                            dVar2.J = optJSONObject.optDouble("cbp", 1.0d);
                            dVar2.f22610K = optJSONObject.optInt("ttc_type", 2);
                            dVar2.f22611L = optJSONObject.optInt("offset", 5);
                            dVar2.f22612M = optJSONObject.optInt("dlnet", 1);
                            dVar2.al = optJSONObject.optInt("endscreen_type", 2);
                            dVar2.f22613N = optJSONObject.optInt(b.J, 3);
                            dVar2.f22614O = optJSONObject.optInt(b.f22531K, 80);
                            dVar2.f22615P = optJSONObject.optInt("ready_rate", 100);
                            dVar2.f22616Q = optJSONObject.optInt("cd_rate", 0);
                            dVar2.f22602B = jSONObject.optLong("current_time");
                            dVar2.ac = optJSONObject.optInt("orientation", 0);
                            dVar2.ae = optJSONObject.optInt(b.f22535O, 0);
                            dVar2.af = optJSONObject.optInt(b.f22536P, -1);
                            dVar2.ag = optJSONObject.optInt(b.f22537Q, 2);
                            dVar2.ah = optJSONObject.optInt(b.f22538R, -1);
                            dVar2.ai = optJSONObject.optInt(b.f22539S, 1);
                            dVar2.f22603C = optJSONObject.optInt("playclosebtn_tm", -1);
                            dVar2.f22604D = optJSONObject.optInt("play_ctdown", 0);
                            dVar2.f22605E = optJSONObject.optInt("close_alert", 0);
                            dVar2.aj = optJSONObject.optInt(b.f22530I, 20);
                            dVar2.ad = optJSONObject.optInt(b.aC, 70);
                            dVar2.f22618S = optJSONObject.optInt(b.ac, -1);
                            dVar2.f22617R = optJSONObject.optDouble(b.aa, 1.0d);
                            dVar2.f22619T = optJSONObject.optInt(b.ar, 2);
                            dVar2.f22620U = optJSONObject.optDouble(b.as, 1.0d);
                            f22600x = optJSONObject.optString("atzu");
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray(b.ao);
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            try {
                                if (optJSONArray2 != null) {
                                    for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                                        arrayList.add(Integer.valueOf(optJSONArray2.getInt(i9)));
                                    }
                                } else {
                                    arrayList.add(4);
                                    arrayList.add(6);
                                }
                                dVar2.f22621V = arrayList;
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                            int optInt3 = optJSONObject.optInt(b.ap, 0);
                            dVar2.f22622W = optInt3 > 0 ? optInt3 : 3;
                            int optInt4 = optJSONObject.optInt("tmorl", 1);
                            if (optInt4 > 2 || optInt4 <= 0) {
                                optInt4 = 1;
                            }
                            dVar2.f22623X = optInt4;
                            if (dVar2.J != 1.0d && new Random().nextDouble() > dVar2.J) {
                                i4 = 1;
                                dVar2.Y = i4;
                                dVar2.f22626z = optJSONObject.optString("placementid");
                                dVar2.f22624Z = optJSONObject.optInt("ltafemty", 10);
                                dVar2.aa = optJSONObject.optInt("ltorwc", 60);
                                dVar2.ab = optJSONObject.optString(com.anythink.expressad.f.a.b.dJ);
                                dVar2.am = optJSONObject.optInt("amount_max", 0);
                                dVar2.an = optJSONObject.optInt("callback_rule", 1);
                                dVar2.ao = optJSONObject.optString("virtual_currency", "");
                                dVar2.i(optJSONObject.optInt("amount", 1));
                                dVar2.aq = optJSONObject.optString("icon", "");
                                dVar2.ar = optJSONObject.optInt("currency_id", 1);
                                dVar2.g(optJSONObject.optString("name", "Virtual Item"));
                                dVar2.au = optJSONObject.optInt(b.aN, 1);
                                dVar2.av = optJSONObject.optInt(b.aO, 60);
                                return dVar2;
                            }
                            i4 = 0;
                            dVar2.Y = i4;
                            dVar2.f22626z = optJSONObject.optString("placementid");
                            dVar2.f22624Z = optJSONObject.optInt("ltafemty", 10);
                            dVar2.aa = optJSONObject.optInt("ltorwc", 60);
                            dVar2.ab = optJSONObject.optString(com.anythink.expressad.f.a.b.dJ);
                            dVar2.am = optJSONObject.optInt("amount_max", 0);
                            dVar2.an = optJSONObject.optInt("callback_rule", 1);
                            dVar2.ao = optJSONObject.optString("virtual_currency", "");
                            dVar2.i(optJSONObject.optInt("amount", 1));
                            dVar2.aq = optJSONObject.optString("icon", "");
                            dVar2.ar = optJSONObject.optInt("currency_id", 1);
                            dVar2.g(optJSONObject.optString("name", "Virtual Item"));
                            dVar2.au = optJSONObject.optInt(b.aN, 1);
                            dVar2.av = optJSONObject.optInt(b.aO, 60);
                            return dVar2;
                        } catch (Exception e9) {
                            e = e9;
                            dVar = dVar2;
                            e.printStackTrace();
                            return dVar;
                        }
                    }
                }
            } catch (Exception e10) {
                e = e10;
            }
        }
        return dVar;
    }

    public final void b(String str) {
        this.f22626z = str;
    }

    private void a(long j9) {
        this.f22602B = j9;
    }

    private void b(JSONObject jSONObject) {
        this.ax = jSONObject;
    }

    public final void a(String str) {
        this.f22625y = str;
    }

    public final void a(List<com.anythink.expressad.videocommon.c.b> list) {
        this.f22601A = list;
    }

    public static d a(JSONObject jSONObject) {
        d dVar;
        int i4;
        d dVar2 = null;
        if (jSONObject != null) {
            try {
                dVar = new d();
            } catch (Exception e6) {
                e = e6;
            }
            try {
                dVar.f22601A = com.anythink.expressad.videocommon.c.b.a(jSONObject.optJSONArray("adSourceList"));
                dVar.f22606F = jSONObject.optInt(b.f22552g);
                int optInt = jSONObject.optInt("aqn", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                dVar.f22607G = optInt;
                int optInt2 = jSONObject.optInt("acn", 1);
                if (optInt2 < 0) {
                    optInt2 = 1;
                }
                dVar.f22608H = optInt2;
                dVar.f22609I = jSONObject.optInt("vcn", 5);
                dVar.J = jSONObject.optDouble("cbp", 1.0d);
                dVar.f22610K = jSONObject.optInt("ttc_type", 2);
                dVar.f22611L = jSONObject.optInt("offset", 5);
                dVar.f22612M = jSONObject.optInt("dlnet", 1);
                dVar.al = jSONObject.optInt("endscreen_type", 2);
                dVar.f22613N = jSONObject.optInt(b.J, 3);
                dVar.f22614O = jSONObject.optInt(b.f22531K, 80);
                dVar.f22615P = jSONObject.optInt("ready_rate", 100);
                dVar.f22602B = jSONObject.optLong("current_time");
                dVar.ac = jSONObject.optInt("orientation", 0);
                dVar.ae = jSONObject.optInt(b.f22535O, 0);
                dVar.af = jSONObject.optInt(b.f22536P, -1);
                dVar.ag = jSONObject.optInt(b.f22537Q, 2);
                dVar.ah = jSONObject.optInt(b.f22538R, -1);
                dVar.ai = jSONObject.optInt(b.f22539S, 1);
                dVar.f22603C = jSONObject.optInt("playclosebtn_tm", -1);
                dVar.f22604D = jSONObject.optInt("play_ctdown", 0);
                dVar.f22605E = jSONObject.optInt("close_alert", 0);
                dVar.aj = jSONObject.optInt(b.f22530I, 20);
                dVar.f22618S = jSONObject.optInt(b.ac, -1);
                dVar.f22617R = jSONObject.optDouble(b.aa, 1.0d);
                dVar.f22619T = jSONObject.optInt(b.ar, 2);
                dVar.f22620U = jSONObject.optDouble(b.as, 1.0d);
                dVar.ad = jSONObject.optInt(b.aC, 70);
                JSONArray optJSONArray = jSONObject.optJSONArray(b.ao);
                ArrayList<Integer> arrayList = new ArrayList<>();
                try {
                    if (optJSONArray != null) {
                        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                            arrayList.add(Integer.valueOf(optJSONArray.getInt(i9)));
                        }
                    } else {
                        arrayList.add(4);
                        arrayList.add(6);
                    }
                    dVar.f22621V = arrayList;
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                dVar.f22622W = jSONObject.optInt(b.ap, 3);
                int optInt3 = jSONObject.optInt("tmorl", 1);
                if (optInt3 > 2 || optInt3 <= 0) {
                    optInt3 = 1;
                }
                dVar.f22623X = optInt3;
                if (dVar.J != 1.0d && new Random().nextDouble() > dVar.J) {
                    i4 = 1;
                    dVar.Y = i4;
                    dVar.f22626z = jSONObject.optString("placementid");
                    dVar.f22624Z = jSONObject.optInt("ltafemty", 10);
                    dVar.aa = jSONObject.optInt("ltorwc", 60);
                    dVar.ab = jSONObject.optString(com.anythink.expressad.f.a.b.dJ);
                    dVar.am = jSONObject.optInt("amount_max", 0);
                    dVar.an = jSONObject.optInt("callback_rule", 1);
                    dVar.ao = jSONObject.optString("virtual_currency", "");
                    dVar.i(jSONObject.optInt("amount", 1));
                    dVar.aq = jSONObject.optString("icon", "");
                    dVar.ar = jSONObject.optInt("currency_id", 1);
                    dVar.g(jSONObject.optString("name", "Virtual Item"));
                    dVar.au = jSONObject.optInt(b.aN, 1);
                    dVar.av = jSONObject.optInt(b.aO, 60);
                    return dVar;
                }
                i4 = 0;
                dVar.Y = i4;
                dVar.f22626z = jSONObject.optString("placementid");
                dVar.f22624Z = jSONObject.optInt("ltafemty", 10);
                dVar.aa = jSONObject.optInt("ltorwc", 60);
                dVar.ab = jSONObject.optString(com.anythink.expressad.f.a.b.dJ);
                dVar.am = jSONObject.optInt("amount_max", 0);
                dVar.an = jSONObject.optInt("callback_rule", 1);
                dVar.ao = jSONObject.optString("virtual_currency", "");
                dVar.i(jSONObject.optInt("amount", 1));
                dVar.aq = jSONObject.optString("icon", "");
                dVar.ar = jSONObject.optInt("currency_id", 1);
                dVar.g(jSONObject.optString("name", "Virtual Item"));
                dVar.au = jSONObject.optInt(b.aN, 1);
                dVar.av = jSONObject.optInt(b.aO, 60);
                return dVar;
            } catch (Exception e10) {
                e = e10;
                dVar2 = dVar;
                e.printStackTrace();
                return dVar2;
            }
        }
        return dVar2;
    }

    private void a(JSONArray jSONArray) {
        this.aw = jSONArray;
    }
}
