package com.tapjoy.internal;

import com.tapjoy.internal.ei;
import java.util.List;

/* loaded from: classes2.dex */
public final class fi extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8091c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Long f8092d = 0L;
    public static final Integer e = 0;
    public static final Integer f = 0;
    public static final Integer g = 0;
    public static final Long h = 0L;
    public static final Long i = 0L;
    public static final Long j = 0L;
    public static final Integer k = 0;
    public static final Double l = Double.valueOf(0.0d);
    public static final Long m = 0L;
    public static final Double n = Double.valueOf(0.0d);
    public static final Boolean o = false;
    public static final Integer p = 0;
    public static final Integer q = 0;
    public static final Boolean r = false;
    public final Long A;
    public final String B;
    public final Integer C;
    public final Double D;
    public final Long E;
    public final Double F;
    public final String G;
    public final Boolean H;
    public final String I;
    public final Integer J;
    public final Integer K;
    public final String L;
    public final String M;
    public final String N;
    public final String O;
    public final String P;
    public final List Q;
    public final Boolean R;
    public final Long s;
    public final String t;
    public final Integer u;
    public final Integer v;
    public final List w;
    public final Integer x;
    public final Long y;
    public final Long z;

    public fi(Long l2, String str, Integer num, Integer num2, List list, Integer num3, Long l3, Long l4, Long l5, String str2, Integer num4, Double d2, Long l6, Double d3, String str3, Boolean bool, String str4, Integer num5, Integer num6, String str5, String str6, String str7, String str8, String str9, List list2, Boolean bool2, iv ivVar) {
        super(f8091c, ivVar);
        this.s = l2;
        this.t = str;
        this.u = num;
        this.v = num2;
        this.w = ep.a("pushes", list);
        this.x = num3;
        this.y = l3;
        this.z = l4;
        this.A = l5;
        this.B = str2;
        this.C = num4;
        this.D = d2;
        this.E = l6;
        this.F = d3;
        this.G = str3;
        this.H = bool;
        this.I = str4;
        this.J = num5;
        this.K = num6;
        this.L = str5;
        this.M = str6;
        this.N = str7;
        this.O = str8;
        this.P = str9;
        this.Q = ep.a("tags", list2);
        this.R = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fi)) {
            return false;
        }
        fi fiVar = (fi) obj;
        return a().equals(fiVar.a()) && ep.a(this.s, fiVar.s) && ep.a(this.t, fiVar.t) && ep.a(this.u, fiVar.u) && ep.a(this.v, fiVar.v) && this.w.equals(fiVar.w) && ep.a(this.x, fiVar.x) && ep.a(this.y, fiVar.y) && ep.a(this.z, fiVar.z) && ep.a(this.A, fiVar.A) && ep.a(this.B, fiVar.B) && ep.a(this.C, fiVar.C) && ep.a(this.D, fiVar.D) && ep.a(this.E, fiVar.E) && ep.a(this.F, fiVar.F) && ep.a(this.G, fiVar.G) && ep.a(this.H, fiVar.H) && ep.a(this.I, fiVar.I) && ep.a(this.J, fiVar.J) && ep.a(this.K, fiVar.K) && ep.a(this.L, fiVar.L) && ep.a(this.M, fiVar.M) && ep.a(this.N, fiVar.N) && ep.a(this.O, fiVar.O) && ep.a(this.P, fiVar.P) && this.Q.equals(fiVar.Q) && ep.a(this.R, fiVar.R);
    }

    public final int hashCode() {
        int i2 = this.f7997b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((((a().hashCode() * 37) + (this.s != null ? this.s.hashCode() : 0)) * 37) + (this.t != null ? this.t.hashCode() : 0)) * 37) + (this.u != null ? this.u.hashCode() : 0)) * 37) + (this.v != null ? this.v.hashCode() : 0)) * 37) + this.w.hashCode()) * 37) + (this.x != null ? this.x.hashCode() : 0)) * 37) + (this.y != null ? this.y.hashCode() : 0)) * 37) + (this.z != null ? this.z.hashCode() : 0)) * 37) + (this.A != null ? this.A.hashCode() : 0)) * 37) + (this.B != null ? this.B.hashCode() : 0)) * 37) + (this.C != null ? this.C.hashCode() : 0)) * 37) + (this.D != null ? this.D.hashCode() : 0)) * 37) + (this.E != null ? this.E.hashCode() : 0)) * 37) + (this.F != null ? this.F.hashCode() : 0)) * 37) + (this.G != null ? this.G.hashCode() : 0)) * 37) + (this.H != null ? this.H.hashCode() : 0)) * 37) + (this.I != null ? this.I.hashCode() : 0)) * 37) + (this.J != null ? this.J.hashCode() : 0)) * 37) + (this.K != null ? this.K.hashCode() : 0)) * 37) + (this.L != null ? this.L.hashCode() : 0)) * 37) + (this.M != null ? this.M.hashCode() : 0)) * 37) + (this.N != null ? this.N.hashCode() : 0)) * 37) + (this.O != null ? this.O.hashCode() : 0)) * 37) + (this.P != null ? this.P.hashCode() : 0)) * 37) + this.Q.hashCode()) * 37) + (this.R != null ? this.R.hashCode() : 0);
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.s != null) {
            sb.append(", installed=");
            sb.append(this.s);
        }
        if (this.t != null) {
            sb.append(", referrer=");
            sb.append(this.t);
        }
        if (this.u != null) {
            sb.append(", fq7=");
            sb.append(this.u);
        }
        if (this.v != null) {
            sb.append(", fq30=");
            sb.append(this.v);
        }
        if (!this.w.isEmpty()) {
            sb.append(", pushes=");
            sb.append(this.w);
        }
        if (this.x != null) {
            sb.append(", sessionTotalCount=");
            sb.append(this.x);
        }
        if (this.y != null) {
            sb.append(", sessionTotalDuration=");
            sb.append(this.y);
        }
        if (this.z != null) {
            sb.append(", sessionLastTime=");
            sb.append(this.z);
        }
        if (this.A != null) {
            sb.append(", sessionLastDuration=");
            sb.append(this.A);
        }
        if (this.B != null) {
            sb.append(", purchaseCurrency=");
            sb.append(this.B);
        }
        if (this.C != null) {
            sb.append(", purchaseTotalCount=");
            sb.append(this.C);
        }
        if (this.D != null) {
            sb.append(", purchaseTotalPrice=");
            sb.append(this.D);
        }
        if (this.E != null) {
            sb.append(", purchaseLastTime=");
            sb.append(this.E);
        }
        if (this.F != null) {
            sb.append(", purchaseLastPrice=");
            sb.append(this.F);
        }
        if (this.G != null) {
            sb.append(", idfa=");
            sb.append(this.G);
        }
        if (this.H != null) {
            sb.append(", idfaOptout=");
            sb.append(this.H);
        }
        if (this.I != null) {
            sb.append(", userId=");
            sb.append(this.I);
        }
        if (this.J != null) {
            sb.append(", userLevel=");
            sb.append(this.J);
        }
        if (this.K != null) {
            sb.append(", friendCount=");
            sb.append(this.K);
        }
        if (this.L != null) {
            sb.append(", uv1=");
            sb.append(this.L);
        }
        if (this.M != null) {
            sb.append(", uv2=");
            sb.append(this.M);
        }
        if (this.N != null) {
            sb.append(", uv3=");
            sb.append(this.N);
        }
        if (this.O != null) {
            sb.append(", uv4=");
            sb.append(this.O);
        }
        if (this.P != null) {
            sb.append(", uv5=");
            sb.append(this.P);
        }
        if (!this.Q.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.Q);
        }
        if (this.R != null) {
            sb.append(", pushOptout=");
            sb.append(this.R);
        }
        StringBuilder replace = sb.replace(0, 2, "User{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {
        public Boolean B;

        /* renamed from: c, reason: collision with root package name */
        public Long f8093c;

        /* renamed from: d, reason: collision with root package name */
        public String f8094d;
        public Integer e;
        public Integer f;
        public Integer h;
        public Long i;
        public Long j;
        public Long k;
        public String l;
        public Integer m;
        public Double n;
        public Long o;
        public Double p;
        public String q;
        public Boolean r;
        public String s;
        public Integer t;
        public Integer u;
        public String v;
        public String w;
        public String x;
        public String y;
        public String z;
        public List g = ep.a();
        public List A = ep.a();

        public final fi b() {
            return new fi(this.f8093c, this.f8094d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            fi fiVar = (fi) obj;
            return (fiVar.s != null ? ek.i.a(1, fiVar.s) : 0) + (fiVar.t != null ? ek.p.a(2, fiVar.t) : 0) + (fiVar.u != null ? ek.f8003d.a(13, fiVar.u) : 0) + (fiVar.v != null ? ek.f8003d.a(14, fiVar.v) : 0) + ff.f8081c.a().a(15, fiVar.w) + (fiVar.x != null ? ek.f8003d.a(16, fiVar.x) : 0) + (fiVar.y != null ? ek.i.a(17, fiVar.y) : 0) + (fiVar.z != null ? ek.i.a(18, fiVar.z) : 0) + (fiVar.A != null ? ek.i.a(19, fiVar.A) : 0) + (fiVar.B != null ? ek.p.a(20, fiVar.B) : 0) + (fiVar.C != null ? ek.f8003d.a(3, fiVar.C) : 0) + (fiVar.D != null ? ek.o.a(21, fiVar.D) : 0) + (fiVar.E != null ? ek.i.a(4, fiVar.E) : 0) + (fiVar.F != null ? ek.o.a(22, fiVar.F) : 0) + (fiVar.G != null ? ek.p.a(23, fiVar.G) : 0) + (fiVar.H != null ? ek.f8002c.a(24, fiVar.H) : 0) + (fiVar.I != null ? ek.p.a(5, fiVar.I) : 0) + (fiVar.J != null ? ek.f8003d.a(6, fiVar.J) : 0) + (fiVar.K != null ? ek.f8003d.a(7, fiVar.K) : 0) + (fiVar.L != null ? ek.p.a(8, fiVar.L) : 0) + (fiVar.M != null ? ek.p.a(9, fiVar.M) : 0) + (fiVar.N != null ? ek.p.a(10, fiVar.N) : 0) + (fiVar.O != null ? ek.p.a(11, fiVar.O) : 0) + (fiVar.P != null ? ek.p.a(12, fiVar.P) : 0) + ek.p.a().a(26, fiVar.Q) + (fiVar.R != null ? ek.f8002c.a(25, fiVar.R) : 0) + fiVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            fi fiVar = (fi) obj;
            if (fiVar.s != null) {
                ek.i.a(emVar, 1, fiVar.s);
            }
            if (fiVar.t != null) {
                ek.p.a(emVar, 2, fiVar.t);
            }
            if (fiVar.u != null) {
                ek.f8003d.a(emVar, 13, fiVar.u);
            }
            if (fiVar.v != null) {
                ek.f8003d.a(emVar, 14, fiVar.v);
            }
            ff.f8081c.a().a(emVar, 15, fiVar.w);
            if (fiVar.x != null) {
                ek.f8003d.a(emVar, 16, fiVar.x);
            }
            if (fiVar.y != null) {
                ek.i.a(emVar, 17, fiVar.y);
            }
            if (fiVar.z != null) {
                ek.i.a(emVar, 18, fiVar.z);
            }
            if (fiVar.A != null) {
                ek.i.a(emVar, 19, fiVar.A);
            }
            if (fiVar.B != null) {
                ek.p.a(emVar, 20, fiVar.B);
            }
            if (fiVar.C != null) {
                ek.f8003d.a(emVar, 3, fiVar.C);
            }
            if (fiVar.D != null) {
                ek.o.a(emVar, 21, fiVar.D);
            }
            if (fiVar.E != null) {
                ek.i.a(emVar, 4, fiVar.E);
            }
            if (fiVar.F != null) {
                ek.o.a(emVar, 22, fiVar.F);
            }
            if (fiVar.G != null) {
                ek.p.a(emVar, 23, fiVar.G);
            }
            if (fiVar.H != null) {
                ek.f8002c.a(emVar, 24, fiVar.H);
            }
            if (fiVar.I != null) {
                ek.p.a(emVar, 5, fiVar.I);
            }
            if (fiVar.J != null) {
                ek.f8003d.a(emVar, 6, fiVar.J);
            }
            if (fiVar.K != null) {
                ek.f8003d.a(emVar, 7, fiVar.K);
            }
            if (fiVar.L != null) {
                ek.p.a(emVar, 8, fiVar.L);
            }
            if (fiVar.M != null) {
                ek.p.a(emVar, 9, fiVar.M);
            }
            if (fiVar.N != null) {
                ek.p.a(emVar, 10, fiVar.N);
            }
            if (fiVar.O != null) {
                ek.p.a(emVar, 11, fiVar.O);
            }
            if (fiVar.P != null) {
                ek.p.a(emVar, 12, fiVar.P);
            }
            ek.p.a().a(emVar, 26, fiVar.Q);
            if (fiVar.R != null) {
                ek.f8002c.a(emVar, 25, fiVar.R);
            }
            emVar.a(fiVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, fi.class);
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ Object a(el elVar) {
            a aVar = new a();
            long a2 = elVar.a();
            while (true) {
                int b2 = elVar.b();
                if (b2 == -1) {
                    elVar.a(a2);
                    return aVar.b();
                }
                switch (b2) {
                    case 1:
                        aVar.f8093c = (Long) ek.i.a(elVar);
                        break;
                    case 2:
                        aVar.f8094d = (String) ek.p.a(elVar);
                        break;
                    case 3:
                        aVar.m = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 4:
                        aVar.o = (Long) ek.i.a(elVar);
                        break;
                    case 5:
                        aVar.s = (String) ek.p.a(elVar);
                        break;
                    case 6:
                        aVar.t = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 7:
                        aVar.u = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 8:
                        aVar.v = (String) ek.p.a(elVar);
                        break;
                    case 9:
                        aVar.w = (String) ek.p.a(elVar);
                        break;
                    case 10:
                        aVar.x = (String) ek.p.a(elVar);
                        break;
                    case 11:
                        aVar.y = (String) ek.p.a(elVar);
                        break;
                    case 12:
                        aVar.z = (String) ek.p.a(elVar);
                        break;
                    case 13:
                        aVar.e = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 14:
                        aVar.f = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 15:
                        aVar.g.add(ff.f8081c.a(elVar));
                        break;
                    case 16:
                        aVar.h = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 17:
                        aVar.i = (Long) ek.i.a(elVar);
                        break;
                    case 18:
                        aVar.j = (Long) ek.i.a(elVar);
                        break;
                    case 19:
                        aVar.k = (Long) ek.i.a(elVar);
                        break;
                    case 20:
                        aVar.l = (String) ek.p.a(elVar);
                        break;
                    case 21:
                        aVar.n = (Double) ek.o.a(elVar);
                        break;
                    case 22:
                        aVar.p = (Double) ek.o.a(elVar);
                        break;
                    case 23:
                        aVar.q = (String) ek.p.a(elVar);
                        break;
                    case 24:
                        aVar.r = (Boolean) ek.f8002c.a(elVar);
                        break;
                    case 25:
                        aVar.B = (Boolean) ek.f8002c.a(elVar);
                        break;
                    case 26:
                        aVar.A.add(ek.p.a(elVar));
                        break;
                    default:
                        eh c2 = elVar.c();
                        aVar.a(b2, c2, c2.a().a(elVar));
                        break;
                }
            }
        }
    }
}
