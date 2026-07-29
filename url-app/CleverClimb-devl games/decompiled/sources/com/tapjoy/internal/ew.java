package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.internal.ei;
import com.tapjoy.internal.ek;
import java.util.List;

/* loaded from: classes2.dex */
public final class ew extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8044c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final ez f8045d = ez.APP;
    public static final Long e = 0L;
    public static final Long f = 0L;
    public static final Long g = 0L;
    public static final Long h = 0L;
    public static final Integer i = 0;
    public static final Integer j = 0;
    public static final Integer k = 0;
    public static final Long l = 0L;
    public static final Long m = 0L;
    public final fe A;
    public final String B;
    public final String C;
    public final fd D;
    public final String E;
    public final String F;
    public final String G;
    public final List H;
    public final String I;
    public final Integer J;
    public final Long K;
    public final Long L;
    public final ez n;
    public final String o;
    public final Long p;
    public final Long q;
    public final String r;
    public final Long s;
    public final Long t;
    public final fb u;
    public final ev v;
    public final fi w;
    public final Integer x;
    public final Integer y;
    public final ey z;

    public ew(ez ezVar, String str, Long l2, Long l3, String str2, Long l4, Long l5, fb fbVar, ev evVar, fi fiVar, Integer num, Integer num2, ey eyVar, fe feVar, String str3, String str4, fd fdVar, String str5, String str6, String str7, List list, String str8, Integer num3, Long l6, Long l7, iv ivVar) {
        super(f8044c, ivVar);
        this.n = ezVar;
        this.o = str;
        this.p = l2;
        this.q = l3;
        this.r = str2;
        this.s = l4;
        this.t = l5;
        this.u = fbVar;
        this.v = evVar;
        this.w = fiVar;
        this.x = num;
        this.y = num2;
        this.z = eyVar;
        this.A = feVar;
        this.B = str3;
        this.C = str4;
        this.D = fdVar;
        this.E = str5;
        this.F = str6;
        this.G = str7;
        this.H = ep.a(TJAdUnitConstants.String.USAGE_TRACKER_VALUES, list);
        this.I = str8;
        this.J = num3;
        this.K = l6;
        this.L = l7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ew)) {
            return false;
        }
        ew ewVar = (ew) obj;
        return a().equals(ewVar.a()) && this.n.equals(ewVar.n) && this.o.equals(ewVar.o) && this.p.equals(ewVar.p) && ep.a(this.q, ewVar.q) && ep.a(this.r, ewVar.r) && ep.a(this.s, ewVar.s) && ep.a(this.t, ewVar.t) && ep.a(this.u, ewVar.u) && ep.a(this.v, ewVar.v) && ep.a(this.w, ewVar.w) && ep.a(this.x, ewVar.x) && ep.a(this.y, ewVar.y) && ep.a(this.z, ewVar.z) && ep.a(this.A, ewVar.A) && ep.a(this.B, ewVar.B) && ep.a(this.C, ewVar.C) && ep.a(this.D, ewVar.D) && ep.a(this.E, ewVar.E) && ep.a(this.F, ewVar.F) && ep.a(this.G, ewVar.G) && this.H.equals(ewVar.H) && ep.a(this.I, ewVar.I) && ep.a(this.J, ewVar.J) && ep.a(this.K, ewVar.K) && ep.a(this.L, ewVar.L);
    }

    public final int hashCode() {
        int i2 = this.f7997b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = (((((((((((((((((((((((((((((((((((((((((((((((((a().hashCode() * 37) + this.n.hashCode()) * 37) + this.o.hashCode()) * 37) + this.p.hashCode()) * 37) + (this.q != null ? this.q.hashCode() : 0)) * 37) + (this.r != null ? this.r.hashCode() : 0)) * 37) + (this.s != null ? this.s.hashCode() : 0)) * 37) + (this.t != null ? this.t.hashCode() : 0)) * 37) + (this.u != null ? this.u.hashCode() : 0)) * 37) + (this.v != null ? this.v.hashCode() : 0)) * 37) + (this.w != null ? this.w.hashCode() : 0)) * 37) + (this.x != null ? this.x.hashCode() : 0)) * 37) + (this.y != null ? this.y.hashCode() : 0)) * 37) + (this.z != null ? this.z.hashCode() : 0)) * 37) + (this.A != null ? this.A.hashCode() : 0)) * 37) + (this.B != null ? this.B.hashCode() : 0)) * 37) + (this.C != null ? this.C.hashCode() : 0)) * 37) + (this.D != null ? this.D.hashCode() : 0)) * 37) + (this.E != null ? this.E.hashCode() : 0)) * 37) + (this.F != null ? this.F.hashCode() : 0)) * 37) + (this.G != null ? this.G.hashCode() : 0)) * 37) + this.H.hashCode()) * 37) + (this.I != null ? this.I.hashCode() : 0)) * 37) + (this.J != null ? this.J.hashCode() : 0)) * 37) + (this.K != null ? this.K.hashCode() : 0)) * 37) + (this.L != null ? this.L.hashCode() : 0);
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.n);
        sb.append(", name=");
        sb.append(this.o);
        sb.append(", time=");
        sb.append(this.p);
        if (this.q != null) {
            sb.append(", systemTime=");
            sb.append(this.q);
        }
        if (this.r != null) {
            sb.append(", instanceId=");
            sb.append(this.r);
        }
        if (this.s != null) {
            sb.append(", elapsedRealtime=");
            sb.append(this.s);
        }
        if (this.t != null) {
            sb.append(", duration=");
            sb.append(this.t);
        }
        if (this.u != null) {
            sb.append(", info=");
            sb.append(this.u);
        }
        if (this.v != null) {
            sb.append(", app=");
            sb.append(this.v);
        }
        if (this.w != null) {
            sb.append(", user=");
            sb.append(this.w);
        }
        if (this.x != null) {
            sb.append(", xxx_session_seq=");
            sb.append(this.x);
        }
        if (this.y != null) {
            sb.append(", eventSeq=");
            sb.append(this.y);
        }
        if (this.z != null) {
            sb.append(", eventPrev=");
            sb.append(this.z);
        }
        if (this.A != null) {
            sb.append(", purchase=");
            sb.append(this.A);
        }
        if (this.B != null) {
            sb.append(", exception=");
            sb.append(this.B);
        }
        if (this.C != null) {
            sb.append(", metaBase=");
            sb.append(this.C);
        }
        if (this.D != null) {
            sb.append(", meta=");
            sb.append(this.D);
        }
        if (this.E != null) {
            sb.append(", category=");
            sb.append(this.E);
        }
        if (this.F != null) {
            sb.append(", p1=");
            sb.append(this.F);
        }
        if (this.G != null) {
            sb.append(", p2=");
            sb.append(this.G);
        }
        if (!this.H.isEmpty()) {
            sb.append(", values=");
            sb.append(this.H);
        }
        if (this.I != null) {
            sb.append(", dimensions=");
            sb.append(this.I);
        }
        if (this.J != null) {
            sb.append(", count=");
            sb.append(this.J);
        }
        if (this.K != null) {
            sb.append(", firstTime=");
            sb.append(this.K);
        }
        if (this.L != null) {
            sb.append(", lastTime=");
            sb.append(this.L);
        }
        StringBuilder replace = sb.replace(0, 2, "Event{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {
        public Long A;

        /* renamed from: c, reason: collision with root package name */
        public ez f8046c;

        /* renamed from: d, reason: collision with root package name */
        public String f8047d;
        public Long e;
        public Long f;
        public String g;
        public Long h;
        public Long i;
        public fb j;
        public ev k;
        public fi l;
        public Integer m;
        public Integer n;
        public ey o;
        public fe p;
        public String q;
        public String r;
        public fd s;
        public String t;
        public String u;
        public String v;
        public List w = ep.a();
        public String x;
        public Integer y;
        public Long z;

        public final ew b() {
            if (this.f8046c == null || this.f8047d == null || this.e == null) {
                throw ep.a(this.f8046c, "type", this.f8047d, "name", this.e, "time");
            }
            return new ew(this.f8046c, this.f8047d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            ew ewVar = (ew) obj;
            return ez.ADAPTER.a(1, ewVar.n) + ek.p.a(2, ewVar.o) + ek.i.a(3, ewVar.p) + (ewVar.q != null ? ek.i.a(19, ewVar.q) : 0) + (ewVar.r != null ? ek.p.a(20, ewVar.r) : 0) + (ewVar.s != null ? ek.i.a(21, ewVar.s) : 0) + (ewVar.t != null ? ek.i.a(4, ewVar.t) : 0) + (ewVar.u != null ? fb.f8065c.a(5, ewVar.u) : 0) + (ewVar.v != null ? ev.f8040c.a(6, ewVar.v) : 0) + (ewVar.w != null ? fi.f8091c.a(7, ewVar.w) : 0) + (ewVar.x != null ? ek.f8003d.a(8, ewVar.x) : 0) + (ewVar.y != null ? ek.f8003d.a(9, ewVar.y) : 0) + (ewVar.z != null ? ey.f8051c.a(10, ewVar.z) : 0) + (ewVar.A != null ? fe.f8077c.a(11, ewVar.A) : 0) + (ewVar.B != null ? ek.p.a(12, ewVar.B) : 0) + (ewVar.C != null ? ek.p.a(13, ewVar.C) : 0) + (ewVar.D != null ? fd.f8073c.a(18, ewVar.D) : 0) + (ewVar.E != null ? ek.p.a(14, ewVar.E) : 0) + (ewVar.F != null ? ek.p.a(15, ewVar.F) : 0) + (ewVar.G != null ? ek.p.a(16, ewVar.G) : 0) + fa.f8061c.a().a(17, ewVar.H) + (ewVar.I != null ? ek.p.a(22, ewVar.I) : 0) + (ewVar.J != null ? ek.f8003d.a(23, ewVar.J) : 0) + (ewVar.K != null ? ek.i.a(24, ewVar.K) : 0) + (ewVar.L != null ? ek.i.a(25, ewVar.L) : 0) + ewVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ Object a(el elVar) {
            return b(elVar);
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            ew ewVar = (ew) obj;
            ez.ADAPTER.a(emVar, 1, ewVar.n);
            ek.p.a(emVar, 2, ewVar.o);
            ek.i.a(emVar, 3, ewVar.p);
            if (ewVar.q != null) {
                ek.i.a(emVar, 19, ewVar.q);
            }
            if (ewVar.r != null) {
                ek.p.a(emVar, 20, ewVar.r);
            }
            if (ewVar.s != null) {
                ek.i.a(emVar, 21, ewVar.s);
            }
            if (ewVar.t != null) {
                ek.i.a(emVar, 4, ewVar.t);
            }
            if (ewVar.u != null) {
                fb.f8065c.a(emVar, 5, ewVar.u);
            }
            if (ewVar.v != null) {
                ev.f8040c.a(emVar, 6, ewVar.v);
            }
            if (ewVar.w != null) {
                fi.f8091c.a(emVar, 7, ewVar.w);
            }
            if (ewVar.x != null) {
                ek.f8003d.a(emVar, 8, ewVar.x);
            }
            if (ewVar.y != null) {
                ek.f8003d.a(emVar, 9, ewVar.y);
            }
            if (ewVar.z != null) {
                ey.f8051c.a(emVar, 10, ewVar.z);
            }
            if (ewVar.A != null) {
                fe.f8077c.a(emVar, 11, ewVar.A);
            }
            if (ewVar.B != null) {
                ek.p.a(emVar, 12, ewVar.B);
            }
            if (ewVar.C != null) {
                ek.p.a(emVar, 13, ewVar.C);
            }
            if (ewVar.D != null) {
                fd.f8073c.a(emVar, 18, ewVar.D);
            }
            if (ewVar.E != null) {
                ek.p.a(emVar, 14, ewVar.E);
            }
            if (ewVar.F != null) {
                ek.p.a(emVar, 15, ewVar.F);
            }
            if (ewVar.G != null) {
                ek.p.a(emVar, 16, ewVar.G);
            }
            fa.f8061c.a().a(emVar, 17, ewVar.H);
            if (ewVar.I != null) {
                ek.p.a(emVar, 22, ewVar.I);
            }
            if (ewVar.J != null) {
                ek.f8003d.a(emVar, 23, ewVar.J);
            }
            if (ewVar.K != null) {
                ek.i.a(emVar, 24, ewVar.K);
            }
            if (ewVar.L != null) {
                ek.i.a(emVar, 25, ewVar.L);
            }
            emVar.a(ewVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, ew.class);
        }

        private static ew b(el elVar) {
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
                        try {
                            aVar.f8046c = (ez) ez.ADAPTER.a(elVar);
                            break;
                        } catch (ek.a e) {
                            aVar.a(b2, eh.VARINT, Long.valueOf(e.f8006a));
                            break;
                        }
                    case 2:
                        aVar.f8047d = (String) ek.p.a(elVar);
                        break;
                    case 3:
                        aVar.e = (Long) ek.i.a(elVar);
                        break;
                    case 4:
                        aVar.i = (Long) ek.i.a(elVar);
                        break;
                    case 5:
                        aVar.j = (fb) fb.f8065c.a(elVar);
                        break;
                    case 6:
                        aVar.k = (ev) ev.f8040c.a(elVar);
                        break;
                    case 7:
                        aVar.l = (fi) fi.f8091c.a(elVar);
                        break;
                    case 8:
                        aVar.m = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 9:
                        aVar.n = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 10:
                        aVar.o = (ey) ey.f8051c.a(elVar);
                        break;
                    case 11:
                        aVar.p = (fe) fe.f8077c.a(elVar);
                        break;
                    case 12:
                        aVar.q = (String) ek.p.a(elVar);
                        break;
                    case 13:
                        aVar.r = (String) ek.p.a(elVar);
                        break;
                    case 14:
                        aVar.t = (String) ek.p.a(elVar);
                        break;
                    case 15:
                        aVar.u = (String) ek.p.a(elVar);
                        break;
                    case 16:
                        aVar.v = (String) ek.p.a(elVar);
                        break;
                    case 17:
                        aVar.w.add(fa.f8061c.a(elVar));
                        break;
                    case 18:
                        aVar.s = (fd) fd.f8073c.a(elVar);
                        break;
                    case 19:
                        aVar.f = (Long) ek.i.a(elVar);
                        break;
                    case 20:
                        aVar.g = (String) ek.p.a(elVar);
                        break;
                    case 21:
                        aVar.h = (Long) ek.i.a(elVar);
                        break;
                    case 22:
                        aVar.x = (String) ek.p.a(elVar);
                        break;
                    case 23:
                        aVar.y = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 24:
                        aVar.z = (Long) ek.i.a(elVar);
                        break;
                    case 25:
                        aVar.A = (Long) ek.i.a(elVar);
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
