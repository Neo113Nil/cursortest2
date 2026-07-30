package com.anythink.core.common.h;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.mg.api.MgComparedResult;
import com.anythink.core.mg.api.MgPreLoadAdRequest;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cd {

    /* renamed from: a, reason: collision with root package name */
    int f14067a;

    /* renamed from: b, reason: collision with root package name */
    private n f14068b;

    /* renamed from: c, reason: collision with root package name */
    private bv f14069c;

    /* renamed from: d, reason: collision with root package name */
    private String f14070d;

    /* renamed from: e, reason: collision with root package name */
    private String f14071e;

    /* renamed from: f, reason: collision with root package name */
    private String f14072f;

    /* renamed from: g, reason: collision with root package name */
    private String f14073g;

    /* renamed from: h, reason: collision with root package name */
    private String f14074h;
    private double i;

    /* renamed from: j, reason: collision with root package name */
    private double f14075j;

    /* renamed from: k, reason: collision with root package name */
    private double f14076k;

    /* renamed from: l, reason: collision with root package name */
    private double f14077l;

    /* renamed from: m, reason: collision with root package name */
    private int f14078m;

    /* renamed from: n, reason: collision with root package name */
    private Double f14079n = null;

    /* renamed from: o, reason: collision with root package name */
    private String f14080o = null;

    /* renamed from: p, reason: collision with root package name */
    private Double f14081p;

    /* renamed from: q, reason: collision with root package name */
    private Double f14082q;

    /* renamed from: r, reason: collision with root package name */
    private int f14083r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f14084s;

    /* renamed from: t, reason: collision with root package name */
    private double f14085t;

    private String D() {
        n nVar = this.f14068b;
        return nVar != null ? nVar.aJ() : "";
    }

    private String E() {
        n nVar = this.f14068b;
        return nVar != null ? String.valueOf(nVar.Z()) : "";
    }

    private String F() {
        n nVar = this.f14068b;
        return nVar != null ? String.valueOf(nVar.aG()) : "";
    }

    private String G() {
        n nVar = this.f14068b;
        return nVar != null ? nVar.aI() : "";
    }

    private String H() {
        n nVar = this.f14068b;
        return nVar != null ? nVar.aH() : "";
    }

    public final int A() {
        n nVar = this.f14068b;
        if (nVar != null) {
            return nVar.k();
        }
        return 0;
    }

    public final String B() {
        return this.f14084s ? "1" : "0";
    }

    public final MgComparedResult C() {
        n nVar = this.f14068b;
        MgPreLoadAdRequest preLoadInfo = (nVar == null || nVar.a() == null) ? null : nVar.a().getPreLoadInfo();
        if (preLoadInfo != null) {
            return preLoadInfo.getMgComparedResult();
        }
        return null;
    }

    public final void a(Double d2, String str) {
        this.f14079n = d2;
        this.f14080o = str;
    }

    public final String b() {
        return this.f14080o;
    }

    public final Double c() {
        return this.f14081p;
    }

    public final int d() {
        return this.f14067a;
    }

    public final String e() {
        return this.f14070d;
    }

    public final String f() {
        return this.f14071e;
    }

    public final String g() {
        return this.f14072f;
    }

    public final String h() {
        return this.f14073g;
    }

    public final String i() {
        n nVar = this.f14068b;
        return nVar != null ? nVar.o() : "";
    }

    public final String j() {
        return this.f14074h;
    }

    public final int k() {
        n nVar = this.f14068b;
        if (nVar != null) {
            return nVar.Y();
        }
        return 0;
    }

    public final String l() {
        n nVar = this.f14068b;
        return nVar != null ? nVar.M() : "";
    }

    public final String m() {
        n nVar = this.f14068b;
        if (nVar != null) {
            return nVar.aK();
        }
        return null;
    }

    public final JSONObject n() {
        n nVar = this.f14068b;
        if (nVar != null) {
            return nVar.ax();
        }
        return null;
    }

    public final double o() {
        return this.i;
    }

    public final double p() {
        return this.f14075j;
    }

    public final double q() {
        return this.f14085t;
    }

    public final double r() {
        return this.f14076k;
    }

    public final void s() {
        this.f14076k = 0.0d;
    }

    public final double t() {
        return this.f14077l;
    }

    public final int u() {
        return this.f14078m;
    }

    public final boolean v() {
        return this.f14078m == 1;
    }

    public final Double w() {
        return this.f14082q;
    }

    public final int x() {
        return this.f14083r;
    }

    public final n y() {
        return this.f14068b;
    }

    public final bv z() {
        return this.f14069c;
    }

    public final void b(double d2) {
        this.f14075j = d2;
    }

    public final void c(double d2) {
        this.f14085t = d2;
    }

    public final void d(double d2) {
        this.f14077l = d2;
    }

    public final Double a() {
        return this.f14079n;
    }

    public final void b(String str) {
        this.f14073g = str;
    }

    public final void a(n nVar) {
        this.f14068b = nVar;
    }

    public final void b(Double d2) {
        this.f14082q = d2;
    }

    public final void a(Double d2) {
        this.f14081p = d2;
    }

    public final void a(bv bvVar) {
        this.f14074h = "0";
        if (bvVar == null) {
            return;
        }
        this.f14069c = bvVar;
        int q6 = bvVar.q();
        if (q6 == 2) {
            this.f14074h = "2";
        } else if (q6 != 5 && q6 != 6) {
            this.f14074h = "1";
        } else {
            this.f14074h = "3";
        }
        this.f14078m = bvVar.aG();
    }

    public final void a(Map<String, Object> map) {
        this.f14070d = a(map, "offer_id");
        this.f14071e = a(map, "dsp_id");
        if (map != null) {
            Object obj = map.get(ATAdConst.NETWORK_CUSTOM_KEY.WS_IMP_SWITCH);
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() != 0) {
                    this.f14067a = num.intValue();
                }
            }
        }
    }

    private static String a(Map<String, Object> map, String str) {
        if (map != null) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return obj.toString();
            }
            if (obj != null) {
                return obj.toString();
            }
            return "";
        }
        return "";
    }

    public final void a(double d2) {
        this.i = d2;
    }

    public final void a(String str) {
        this.f14072f = str;
    }

    public final void a(int i) {
        this.f14083r = i;
    }

    public final void a(boolean z8) {
        this.f14084s = z8;
    }
}
