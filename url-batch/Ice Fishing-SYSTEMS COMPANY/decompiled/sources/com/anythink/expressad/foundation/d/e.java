package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e implements com.anythink.expressad.g.b, Serializable {

    /* renamed from: A, reason: collision with root package name */
    public static final String f18802A = "ia_all_ext2";

    /* renamed from: B, reason: collision with root package name */
    public static final String f18803B = "cam_tpl_url";

    /* renamed from: C, reason: collision with root package name */
    public static final String f18804C = "cam_html";

    /* renamed from: D, reason: collision with root package name */
    public static final String f18805D = "cam_tpl_url";

    /* renamed from: E, reason: collision with root package name */
    public static final String f18806E = "cam_html";

    /* renamed from: F, reason: collision with root package name */
    public static final String f18807F = "nscpt";

    /* renamed from: G, reason: collision with root package name */
    public static final String f18808G = "mof_template_url";

    /* renamed from: H, reason: collision with root package name */
    public static final String f18809H = "mof_tplid";

    /* renamed from: I, reason: collision with root package name */
    public static final String f18810I = "req_ext_data";
    public static final String J = "replace_tmp";

    /* renamed from: L, reason: collision with root package name */
    private static final String f18811L = "e";

    /* renamed from: M, reason: collision with root package name */
    private static final long f18812M = 1;

    /* renamed from: a, reason: collision with root package name */
    public static final String f18813a = "a";

    /* renamed from: b, reason: collision with root package name */
    public static final String f18814b = "pv_urls";

    /* renamed from: c, reason: collision with root package name */
    public static final String f18815c = "parent_session_id";

    /* renamed from: d, reason: collision with root package name */
    public static final String f18816d = "ad_type";

    /* renamed from: e, reason: collision with root package name */
    public static final String f18817e = "unit_size";

    /* renamed from: f, reason: collision with root package name */
    public static final String f18818f = "html_url";

    /* renamed from: g, reason: collision with root package name */
    public static final String f18819g = "only_impression_url";

    /* renamed from: h, reason: collision with root package name */
    public static final String f18820h = "ads";
    public static final String i = "template";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18821j = "frames";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18822k = "end_screen_url";

    /* renamed from: l, reason: collision with root package name */
    public static final String f18823l = "jm_do";

    /* renamed from: m, reason: collision with root package name */
    public static final String f18824m = "rks";

    /* renamed from: n, reason: collision with root package name */
    public static final String f18825n = "vcn";

    /* renamed from: o, reason: collision with root package name */
    public static final String f18826o = "token_r";

    /* renamed from: p, reason: collision with root package name */
    public static final String f18827p = "encrypt_p";

    /* renamed from: q, reason: collision with root package name */
    public static final String f18828q = "irlfa";

    /* renamed from: r, reason: collision with root package name */
    public static final String f18829r = "tk_tcp_port";

    /* renamed from: s, reason: collision with root package name */
    public static final String f18830s = "csp";

    /* renamed from: t, reason: collision with root package name */
    public static final String f18831t = "do";

    /* renamed from: u, reason: collision with root package name */
    public static final String f18832u = "sh";

    /* renamed from: v, reason: collision with root package name */
    public static final String f18833v = "ia_icon";

    /* renamed from: w, reason: collision with root package name */
    public static final String f18834w = "ia_rst";

    /* renamed from: x, reason: collision with root package name */
    public static final String f18835x = "ia_url";

    /* renamed from: y, reason: collision with root package name */
    public static final String f18836y = "ia_ori";

    /* renamed from: z, reason: collision with root package name */
    public static final String f18837z = "ia_all_ext1";

    /* renamed from: K, reason: collision with root package name */
    public ArrayList<d> f18838K;

    /* renamed from: O, reason: collision with root package name */
    private String f18840O;

    /* renamed from: P, reason: collision with root package name */
    private String f18841P;

    /* renamed from: Q, reason: collision with root package name */
    private String f18842Q;

    /* renamed from: R, reason: collision with root package name */
    private String f18843R;

    /* renamed from: S, reason: collision with root package name */
    private String f18844S;

    /* renamed from: T, reason: collision with root package name */
    private int f18845T;

    /* renamed from: U, reason: collision with root package name */
    private String f18846U;

    /* renamed from: V, reason: collision with root package name */
    private int f18847V;

    /* renamed from: W, reason: collision with root package name */
    private String f18848W;

    /* renamed from: X, reason: collision with root package name */
    private String f18849X;
    private String Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f18850Z;
    private int aa;
    private String ab;
    private String ac;
    private String ad;
    private int ae;
    private List<com.anythink.expressad.out.m> af;
    private HashMap<String, String> ah;
    private HashMap<String, String> ai;
    private String aj;
    private String ak;
    private String al;
    private int am;
    private int an;
    private int ap;
    private String aq;

    /* renamed from: N, reason: collision with root package name */
    private String f18839N = "";
    private StringBuffer ag = new StringBuffer();
    private String ao = "";

    private String A() {
        return this.ab;
    }

    private String B() {
        return this.ac;
    }

    private String C() {
        return this.ad;
    }

    private ArrayList<d> D() {
        return this.f18838K;
    }

    private int E() {
        return this.ae;
    }

    private void a(int i4) {
        this.f18845T = i4;
    }

    private void b(String str) {
        this.f18839N = str;
    }

    private void c(String str) {
        this.f18840O = str;
    }

    private void d(String str) {
        this.f18841P = str;
    }

    private void e(String str) {
        this.f18842Q = str;
    }

    private void f(String str) {
        this.f18843R = str;
    }

    private String g() {
        return this.f18839N;
    }

    private String h() {
        return this.f18840O;
    }

    private String i() {
        return this.f18841P;
    }

    private String j() {
        return this.f18842Q;
    }

    private String k() {
        return this.f18843R;
    }

    private String l() {
        return this.f18844S;
    }

    private int m() {
        return this.f18845T;
    }

    private String n() {
        return this.f18846U;
    }

    private int o() {
        return this.f18847V;
    }

    private String p() {
        return this.f18848W;
    }

    private String q() {
        return this.f18849X;
    }

    private String r() {
        return this.ao;
    }

    private int s() {
        int i4 = this.am;
        if (i4 > 1) {
            return i4;
        }
        return 1;
    }

    private int t() {
        int i4 = this.an;
        if (i4 == 1) {
            return i4;
        }
        return 0;
    }

    private String u() {
        return this.aj;
    }

    private String v() {
        return this.ak;
    }

    private String w() {
        return this.al;
    }

    private int x() {
        return this.ap;
    }

    private List<com.anythink.expressad.out.m> y() {
        return this.af;
    }

    private String z() {
        return this.f18850Z;
    }

    private void b(int i4) {
        this.f18847V = i4;
    }

    private void c(int i4) {
        this.am = i4;
    }

    private void d(int i4) {
        this.an = i4;
    }

    private void e(int i4) {
        this.ap = i4;
    }

    private void f(int i4) {
        this.aa = i4;
    }

    private void g(String str) {
        this.f18844S = str;
    }

    private void h(String str) {
        this.f18846U = str;
    }

    private void i(String str) {
        this.f18848W = str;
    }

    private void j(String str) {
        this.f18849X = str;
    }

    private void k(String str) {
        this.ao = str;
    }

    private void l(String str) {
        this.aj = str;
    }

    private void m(String str) {
        this.ak = str;
    }

    private void n(String str) {
        this.al = str;
    }

    private void o(String str) {
        this.Y = str;
    }

    private void p(String str) {
        this.f18850Z = str;
    }

    private void q(String str) {
        this.ab = str;
    }

    private void r(String str) {
        this.ac = str;
    }

    private void s(String str) {
        this.ad = str;
    }

    public final HashMap<String, String> a() {
        return this.ah;
    }

    private void a(HashMap<String, String> hashMap) {
        this.ah = hashMap;
    }

    private void g(int i4) {
        this.ae = i4;
    }

    public final HashMap<String, String> b() {
        return this.ai;
    }

    public final String c() {
        return this.Y;
    }

    public final int d() {
        return this.aa;
    }

    public final String e() {
        StringBuffer stringBuffer = this.ag;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.ag.toString();
        }
        try {
            String f6 = com.anythink.core.common.v.m.f();
            String c4 = com.anythink.core.common.v.m.c(com.anythink.core.common.d.t.b().g());
            String b9 = com.anythink.core.common.v.m.b(com.anythink.core.common.d.t.b().g());
            com.anythink.core.common.d.t.b().g();
            String valueOf = String.valueOf(com.anythink.expressad.foundation.h.n.b());
            String str = com.anythink.expressad.foundation.h.n.f(com.anythink.core.common.d.t.b().g()) + "x" + com.anythink.expressad.foundation.h.n.g(com.anythink.core.common.d.t.b().g());
            StringBuffer stringBuffer2 = this.ag;
            stringBuffer2.append(this.aa);
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) "1"));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) Build.VERSION.RELEASE));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) com.anythink.expressad.out.b.f20180a));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) com.anythink.core.common.v.m.a()));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) str));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a(Integer.valueOf(com.anythink.expressad.foundation.h.n.c(com.anythink.expressad.foundation.b.a.c().e()))));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) com.anythink.core.common.v.m.e(com.anythink.expressad.foundation.b.a.c().e())));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) valueOf));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) b9));
            stringBuffer2.append(a((Object) c4));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) "at_device1"));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) "at_device2"));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) com.anythink.core.common.v.m.d(com.anythink.core.common.d.t.b().g())));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) f6));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) ""));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) com.anythink.core.common.v.m.b()));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) ""));
            stringBuffer2.append("||");
            stringBuffer2.append(a((Object) ""));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            stringBuffer2.append(a((Object) (com.anythink.core.common.d.t.b().C() + "," + com.anythink.core.common.d.t.b().D())));
            stringBuffer2.append(com.anythink.expressad.foundation.g.a.bU);
            this.ag = stringBuffer2;
            com.anythink.core.common.d.s c9 = com.anythink.core.common.d.t.b().c();
            if (c9 != null) {
                return c9.fillCDataParam(this.ag.toString());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        String stringBuffer3 = this.ag.toString();
        stringBuffer3.replaceAll("at_device1", "");
        stringBuffer3.replaceAll("at_device2", "");
        return stringBuffer3;
    }

    public final String f() {
        try {
            if (!TextUtils.isEmpty(this.aq)) {
                return this.aq;
            }
            if (!TextUtils.isEmpty(this.ad)) {
                Uri parse = Uri.parse(this.ad);
                if (parse != null) {
                    this.aq = parse.getQueryParameter("k");
                }
                return this.aq;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    private void a(List<com.anythink.expressad.out.m> list) {
        this.af = list;
    }

    private void b(HashMap<String, String> hashMap) {
        this.ai = hashMap;
    }

    private void a(ArrayList<d> arrayList) {
        this.f18838K = arrayList;
    }

    private static e b(JSONObject jSONObject) {
        return b(jSONObject, "");
    }

    private static Object a(Object obj) {
        return obj == null ? "" : obj;
    }

    private static e b(JSONObject jSONObject, String str) {
        String str2;
        int i4;
        ArrayList arrayList;
        String str3 = f18820h;
        String str4 = "template";
        String str5 = "parent_session_id";
        String str6 = "a";
        String str7 = f18819g;
        String str8 = f18818f;
        if (jSONObject == null) {
            return null;
        }
        try {
            e eVar = new e();
            try {
                String optString = jSONObject.optString(f18824m);
                if (!TextUtils.isEmpty(optString)) {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap<String, String> hashMap = new HashMap<>();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    eVar.ah = hashMap;
                }
                if (!TextUtils.isEmpty(str)) {
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.put("encrypt_p", "");
                    hashMap2.put(f18828q, "");
                    eVar.ai = hashMap2;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject(f18810I);
                int optInt = jSONObject.optInt(f18807F, 1);
                String optString2 = jSONObject.optString(f18808G, "");
                int optInt2 = jSONObject.optInt(f18809H, 0);
                String jSONObject3 = optJSONObject != null ? optJSONObject.toString() : "";
                new JSONArray();
                JSONArray optJSONArray = jSONObject.optJSONArray("pv_urls");
                if (optJSONArray == null || optJSONArray.length() <= 0) {
                    str2 = jSONObject3;
                    i4 = optInt;
                    arrayList = null;
                } else {
                    str2 = jSONObject3;
                    arrayList = new ArrayList(optJSONArray.length());
                    i4 = optInt;
                    for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                        arrayList.add(optJSONArray.getString(i9));
                    }
                }
                com.anythink.expressad.foundation.c.a.a.a().a(jSONObject.optJSONObject(J));
                eVar.Y = jSONObject.optString("a");
                eVar.f18850Z = jSONObject.optString("parent_session_id");
                eVar.aa = jSONObject.optInt("ad_type");
                eVar.ab = jSONObject.optString(f18817e);
                eVar.ac = jSONObject.optString(f18818f);
                eVar.ad = jSONObject.optString(f18819g);
                eVar.ae = jSONObject.optInt("template");
                eVar.ap = jSONObject.optInt(f18823l);
                eVar.f18844S = jSONObject.optString("ia_icon");
                eVar.f18845T = jSONObject.optInt("ia_rst");
                eVar.f18846U = jSONObject.optString("ia_url");
                eVar.f18847V = jSONObject.optInt("ia_ori");
                eVar.f18848W = jSONObject.optString(f18837z);
                eVar.f18849X = jSONObject.optString(f18802A);
                eVar.am = jSONObject.optInt("vcn");
                eVar.an = jSONObject.optInt("token_r");
                eVar.ao = jSONObject.optString("encrypt_p");
                JSONArray optJSONArray2 = jSONObject.optJSONArray(f18820h);
                JSONArray optJSONArray3 = jSONObject.optJSONArray(f18821j);
                String str9 = "parse campaign error ,campaign is null";
                String str10 = f18822k;
                if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    String str11 = optString2;
                    int i10 = 0;
                    while (i10 < optJSONArray3.length()) {
                        JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i10);
                        int i11 = i10;
                        JSONArray jSONArray = optJSONObject2.getJSONArray(str3);
                        String str12 = str3;
                        ArrayList arrayList3 = new ArrayList();
                        String str13 = str4;
                        JSONObject jSONObject4 = optJSONObject2;
                        int i12 = 0;
                        while (i12 < jSONArray.length()) {
                            JSONObject optJSONObject3 = jSONArray.optJSONObject(i12);
                            JSONArray jSONArray2 = optJSONArray3;
                            String optString3 = jSONObject.optString(str7);
                            String str14 = str9;
                            String optString4 = jSONObject.optString(str8);
                            int i13 = i12;
                            String str15 = str10;
                            String optString5 = jSONObject.optString(str15);
                            JSONArray jSONArray3 = jSONArray;
                            String str16 = str11;
                            String str17 = str6;
                            String str18 = str2;
                            String str19 = str8;
                            ArrayList arrayList4 = arrayList2;
                            int i14 = i4;
                            int i15 = i11;
                            JSONObject jSONObject5 = jSONObject4;
                            String str20 = str5;
                            String str21 = str7;
                            int i16 = optInt2;
                            d a9 = d.a(optJSONObject3, optString3, optString4, optString5, false, eVar, str);
                            if (a9 != null) {
                                a9.i(eVar.f18846U);
                                a9.j(eVar.f18847V);
                                a9.i(eVar.f18845T);
                                a9.h(eVar.f18844S);
                                a9.h(jSONObject.optInt("ad_type"));
                                a9.f(jSONObject.optString(d.bd));
                                a9.g(jSONObject.optString(d.be));
                                a9.f(eVar.s());
                                a9.e(eVar.t());
                                a9.c(eVar.ao);
                                a9.m(i16);
                                a9.s(str16);
                                a9.l(i14);
                                a9.a((List<String>) arrayList);
                                a9.t(str18);
                                arrayList3.add(a9);
                            } else {
                                eVar.f18839N = str14;
                            }
                            str2 = str18;
                            str6 = str17;
                            str11 = str16;
                            str8 = str19;
                            str9 = str14;
                            optInt2 = i16;
                            str7 = str21;
                            str5 = str20;
                            optJSONArray3 = jSONArray2;
                            jSONArray = jSONArray3;
                            str10 = str15;
                            jSONObject4 = jSONObject5;
                            i4 = i14;
                            i12 = i13 + 1;
                            i11 = i15;
                            arrayList2 = arrayList4;
                        }
                        String str22 = str11;
                        String str23 = str6;
                        ArrayList arrayList5 = arrayList2;
                        int i17 = i11;
                        String str24 = str5;
                        com.anythink.expressad.out.m mVar = new com.anythink.expressad.out.m();
                        mVar.b(jSONObject.optString(str24));
                        mVar.a(jSONObject.optString(str23));
                        mVar.a(arrayList3);
                        mVar.a(jSONObject4.optInt(str13));
                        arrayList5.add(mVar);
                        i10 = i17 + 1;
                        optInt2 = optInt2;
                        str11 = str22;
                        arrayList2 = arrayList5;
                        str8 = str8;
                        str7 = str7;
                        str10 = str10;
                        i4 = i4;
                        str2 = str2;
                        str6 = str23;
                        str4 = str13;
                        str9 = str9;
                        str5 = str24;
                        str3 = str12;
                        optJSONArray3 = optJSONArray3;
                    }
                    eVar.af = arrayList2;
                    return eVar;
                }
                String str25 = f18822k;
                String str26 = str2;
                int i18 = i4;
                String str27 = f18819g;
                String str28 = f18818f;
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    ArrayList<d> arrayList6 = new ArrayList<>();
                    int i19 = 0;
                    while (i19 < optJSONArray2.length()) {
                        JSONArray jSONArray4 = optJSONArray2;
                        String str29 = str27;
                        str27 = str29;
                        String str30 = str28;
                        String str31 = str25;
                        str28 = str30;
                        str25 = str31;
                        d a10 = d.a(jSONArray4.optJSONObject(i19), jSONObject.optString(str29), jSONObject.optString(str30), jSONObject.optString(str31), false, eVar, str);
                        if (a10 != null) {
                            a10.m(optInt2);
                            a10.s(optString2);
                            a10.l(i18);
                            a10.a((List<String>) arrayList);
                            a10.t(str26);
                            a10.f(eVar.s());
                            a10.e(eVar.t());
                            a10.c(eVar.ao);
                            arrayList6.add(a10);
                        } else {
                            eVar.f18839N = "parse campaign error ,campaign is null";
                        }
                        i19++;
                        optJSONArray2 = jSONArray4;
                    }
                    eVar.f18838K = arrayList6;
                }
                return eVar;
            } catch (Exception unused) {
                return eVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private static e a(JSONObject jSONObject) {
        return b(jSONObject, "");
    }

    private static e a(JSONObject jSONObject, String str) {
        return b(jSONObject, str);
    }

    public static e a(String str) {
        try {
            return b(new JSONObject(str), "");
        } catch (Throwable unused) {
            return null;
        }
    }
}
