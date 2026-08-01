package s7;

import android.util.Log;
import com.google.android.gms.internal.measurement.k7;
import com.google.android.gms.internal.measurement.m7;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.w8;
import com.google.android.gms.internal.measurement.z8;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends n4.t {
    public final /* synthetic */ int g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f8511h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.k1 f8512i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, int i3, com.google.android.gms.internal.measurement.k1 k1Var, int i10) {
        super(str, i3);
        this.g = i10;
        this.f8511h = cVar;
        this.f8512i = k1Var;
    }

    @Override // n4.t
    public final int c() {
        switch (this.g) {
            case 0:
                return ((k7) this.f8512i).u();
            default:
                return ((q7) this.f8512i).u();
        }
    }

    @Override // n4.t
    public final boolean d() {
        switch (this.g) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // n4.t
    public final boolean e() {
        switch (this.g) {
            case 0:
                return ((k7) this.f8512i).z();
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c9 A[EDGE_INSN: B:160:0x03c9->B:52:0x03c9 BREAK  A[LOOP:3: B:132:0x0246->B:157:0x0246], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(Long l10, Long l11, w8 w8Var, long j, r rVar, boolean z10) {
        boolean z11;
        v0 v0Var;
        Boolean bool;
        Boolean bool2;
        long j3;
        Boolean bool3;
        Boolean bool4;
        int i3;
        com.google.android.gms.internal.measurement.v3.a();
        c cVar = this.f8511h;
        q1 q1Var = (q1) cVar.f1478d;
        g gVar = q1Var.f8935r;
        v0 v0Var2 = q1Var.f8937t;
        p0 p0Var = q1Var.f8941x;
        d0 d0Var = e0.F0;
        String str = this.f7118a;
        boolean D = gVar.D(str, d0Var);
        k7 k7Var = (k7) this.f8512i;
        long j10 = k7Var.E() ? rVar.f8963e : j;
        q1.l(v0Var2);
        t0 t0Var = v0Var2.B;
        t0 t0Var2 = v0Var2.f9053w;
        boolean isLoggable = Log.isLoggable(v0Var2.C(), 2);
        int i10 = this.f7119b;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        Boolean bool5 = null;
        if (isLoggable) {
            q1.l(v0Var2);
            t0Var.d("Evaluating filter. audience, filter, event", Integer.valueOf(i10), k7Var.t() ? Integer.valueOf(k7Var.u()) : null, p0Var.a(k7Var.v()));
            q1.l(v0Var2);
            l4 l4Var = cVar.f9150e.f8766u;
            j4.T(l4Var);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nevent_filter {\n");
            if (k7Var.t()) {
                i3 = 0;
                l4.N(sb2, 0, "filter_id", Integer.valueOf(k7Var.u()));
            } else {
                i3 = 0;
            }
            l4.N(sb2, i3, "event_name", ((q1) l4Var.f1478d).f8941x.a(k7Var.v()));
            String J = l4.J(k7Var.B(), k7Var.C(), k7Var.E());
            if (!J.isEmpty()) {
                l4.N(sb2, 0, "filter_type", J);
            }
            if (k7Var.z()) {
                l4.O(sb2, 1, "event_count_filter", k7Var.A());
            }
            if (k7Var.x() > 0) {
                sb2.append("  filters {\n");
                Iterator it = k7Var.w().iterator();
                while (it.hasNext()) {
                    l4Var.G(sb2, 2, (m7) it.next());
                }
            }
            l4.H(1, sb2);
            sb2.append("}\n}\n");
            t0Var.b(sb2.toString(), "Filter definition");
        }
        if (!k7Var.t() || k7Var.u() > 256) {
            q1.l(v0Var2);
            t0Var2.c(v0.A(str), String.valueOf(k7Var.t() ? Integer.valueOf(k7Var.u()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z12 = k7Var.B() || k7Var.C() || k7Var.E();
        if (z10 && !z12) {
            q1.l(v0Var2);
            t0Var.c(Integer.valueOf(i10), k7Var.t() ? Integer.valueOf(k7Var.u()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String y3 = w8Var.y();
        if (k7Var.z()) {
            try {
                bool4 = n4.t.h(new BigDecimal(j10), k7Var.A(), 0.0d);
            } catch (NumberFormatException unused) {
                bool4 = null;
            }
            if (bool4 != null) {
                if (!bool4.booleanValue()) {
                    bool5 = Boolean.FALSE;
                }
            }
            z11 = D;
            v0Var = v0Var2;
            q1.l(v0Var);
            t0Var.b(bool5 == null ? "null" : bool5, "Event filter result");
            if (bool5 == null) {
                return false;
            }
            Boolean bool6 = Boolean.TRUE;
            this.f7120c = bool6;
            if (!bool5.booleanValue()) {
                return true;
            }
            this.f7121d = bool6;
            if (!z12 || !w8Var.z()) {
                return true;
            }
            Long valueOf = Long.valueOf(w8Var.A());
            if (k7Var.C()) {
                if (z11 && k7Var.z()) {
                    valueOf = l10;
                }
                this.f7123f = valueOf;
                return true;
            }
            if (z11 && k7Var.z()) {
                valueOf = l11;
            }
            this.f7122e = valueOf;
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = k7Var.w().iterator();
        while (true) {
            if (!it2.hasNext()) {
                s.e eVar = new s.e(0);
                Iterator it3 = w8Var.v().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator it4 = k7Var.w().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z11 = D;
                                v0Var = v0Var2;
                                bool5 = Boolean.TRUE;
                                break;
                            }
                            m7 m7Var = (m7) it4.next();
                            boolean z13 = m7Var.x() && m7Var.y();
                            String A = m7Var.A();
                            if (A.isEmpty()) {
                                q1.l(v0Var2);
                                t0Var2.b(p0Var.a(y3), "Event has empty param name. event");
                                break;
                            }
                            Object obj = eVar.get(A);
                            if (obj instanceof Long) {
                                if (!m7Var.v()) {
                                    q1.l(v0Var2);
                                    t0Var2.c(p0Var.a(y3), p0Var.b(A), "No number filter for long param. event, param");
                                    break;
                                }
                                try {
                                    bool = n4.t.h(new BigDecimal(((Long) obj).longValue()), m7Var.w(), 0.0d);
                                } catch (NumberFormatException unused2) {
                                    bool = null;
                                }
                                if (bool == null) {
                                    break;
                                }
                                if (bool.booleanValue() == z13) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!m7Var.v()) {
                                    q1.l(v0Var2);
                                    t0Var2.c(p0Var.a(y3), p0Var.b(A), "No number filter for double param. event, param");
                                    break;
                                }
                                double doubleValue = ((Double) obj).doubleValue();
                                try {
                                    bool2 = n4.t.h(new BigDecimal(doubleValue), m7Var.w(), Math.ulp(doubleValue));
                                } catch (NumberFormatException unused3) {
                                    bool2 = null;
                                }
                                if (bool2 == null) {
                                    break;
                                }
                                if (bool2.booleanValue() == z13) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!m7Var.t()) {
                                    if (!m7Var.v()) {
                                        z11 = D;
                                        v0Var = v0Var2;
                                        q1.l(v0Var);
                                        t0Var2.c(p0Var.a(y3), p0Var.b(A), "No filter for String param. event, param");
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!l4.W(str2)) {
                                        z11 = D;
                                        v0Var = v0Var2;
                                        q1.l(v0Var);
                                        t0Var2.c(p0Var.a(y3), p0Var.b(A), "Invalid param value for number filter. event, param");
                                        break;
                                    }
                                    o7 w6 = m7Var.w();
                                    if (l4.W(str2)) {
                                        try {
                                            z11 = D;
                                            v0Var = v0Var2;
                                            j3 = 0;
                                        } catch (NumberFormatException unused4) {
                                            z11 = D;
                                            v0Var = v0Var2;
                                            j3 = 0;
                                        }
                                        try {
                                            bool3 = n4.t.h(new BigDecimal(str2), w6, 0.0d);
                                        } catch (NumberFormatException unused5) {
                                            bool3 = null;
                                            if (bool3 == null) {
                                            }
                                            q1.l(v0Var);
                                            t0Var.b(bool5 == null ? "null" : bool5, "Event filter result");
                                            if (bool5 == null) {
                                            }
                                        }
                                        if (bool3 == null) {
                                            break;
                                        }
                                        if (bool3.booleanValue() == z13) {
                                            bool5 = Boolean.FALSE;
                                            break;
                                        }
                                        v0Var2 = v0Var;
                                        D = z11;
                                    } else {
                                        z11 = D;
                                        v0Var = v0Var2;
                                        bool3 = null;
                                    }
                                } else {
                                    r7 u2 = m7Var.u();
                                    q1.l(v0Var2);
                                    bool3 = n4.t.g((String) obj, u2, v0Var2);
                                    z11 = D;
                                    v0Var = v0Var2;
                                }
                                j3 = 0;
                                if (bool3 == null) {
                                }
                            } else {
                                z11 = D;
                                v0Var = v0Var2;
                                if (obj == null) {
                                    q1.l(v0Var);
                                    t0Var.c(p0Var.a(y3), p0Var.b(A), "Missing param for filter. event, param");
                                    bool5 = Boolean.FALSE;
                                } else {
                                    q1.l(v0Var);
                                    t0Var2.c(p0Var.a(y3), p0Var.b(A), "Unknown param type. event, param");
                                }
                            }
                        }
                    } else {
                        z8 z8Var = (z8) it3.next();
                        if (hashSet.contains(z8Var.u())) {
                            if (!z8Var.x()) {
                                if (!z8Var.B()) {
                                    if (!z8Var.v()) {
                                        q1.l(v0Var2);
                                        t0Var2.c(p0Var.a(y3), p0Var.b(z8Var.u()), "Unknown value for param. event, param");
                                        break;
                                    }
                                    eVar.put(z8Var.u(), z8Var.w());
                                } else {
                                    eVar.put(z8Var.u(), z8Var.B() ? Double.valueOf(z8Var.C()) : null);
                                }
                            } else {
                                eVar.put(z8Var.u(), z8Var.x() ? Long.valueOf(z8Var.y()) : null);
                            }
                        }
                    }
                }
            } else {
                m7 m7Var2 = (m7) it2.next();
                if (m7Var2.A().isEmpty()) {
                    q1.l(v0Var2);
                    t0Var2.b(p0Var.a(y3), "null or empty param name in filter. event");
                    break;
                }
                hashSet.add(m7Var2.A());
            }
        }
        q1.l(v0Var);
        t0Var.b(bool5 == null ? "null" : bool5, "Event filter result");
        if (bool5 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j(Long l10, Long l11, n9 n9Var, boolean z10) {
        boolean z11;
        Boolean f3;
        Boolean h10;
        Boolean bool;
        Boolean bool2;
        com.google.android.gms.internal.measurement.v3.a();
        q1 q1Var = (q1) this.f8511h.f1478d;
        g gVar = q1Var.f8935r;
        p0 p0Var = q1Var.f8941x;
        v0 v0Var = q1Var.f8937t;
        boolean D = gVar.D(this.f7118a, e0.D0);
        q7 q7Var = (q7) this.f8512i;
        boolean x10 = q7Var.x();
        boolean y3 = q7Var.y();
        boolean A = q7Var.A();
        boolean z12 = x10 || y3 || A;
        if (z10 && !z12) {
            q1.l(v0Var);
            v0Var.B.c(Integer.valueOf(this.f7119b), q7Var.t() ? Integer.valueOf(q7Var.u()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        m7 w6 = q7Var.w();
        boolean y10 = w6.y();
        if (!n9Var.y()) {
            z11 = A;
            if (!n9Var.C()) {
                if (n9Var.w()) {
                    if (w6.t()) {
                        String x11 = n9Var.x();
                        r7 u2 = w6.u();
                        q1.l(v0Var);
                        f3 = n4.t.f(n4.t.g(x11, u2, v0Var), y10);
                    } else if (!w6.v()) {
                        q1.l(v0Var);
                        v0Var.f9053w.b(p0Var.c(n9Var.v()), "No string or number filter defined. property");
                    } else if (l4.W(n9Var.x())) {
                        String x12 = n9Var.x();
                        o7 w10 = w6.w();
                        if (l4.W(x12)) {
                            try {
                                h10 = n4.t.h(new BigDecimal(x12), w10, 0.0d);
                            } catch (NumberFormatException unused) {
                            }
                            f3 = n4.t.f(h10, y10);
                        }
                        h10 = null;
                        f3 = n4.t.f(h10, y10);
                    } else {
                        q1.l(v0Var);
                        v0Var.f9053w.c(p0Var.c(n9Var.v()), n9Var.x(), "Invalid user property value for Numeric number filter. property, value");
                    }
                    q1.l(v0Var);
                    v0Var.B.b(f3 != null ? "null" : f3, "Property filter result");
                    if (f3 != null) {
                    }
                } else {
                    q1.l(v0Var);
                    v0Var.f9053w.b(p0Var.c(n9Var.v()), "User property has no value, property");
                }
                f3 = null;
                q1.l(v0Var);
                v0Var.B.b(f3 != null ? "null" : f3, "Property filter result");
                if (f3 != null) {
                }
            } else if (w6.v()) {
                double D2 = n9Var.D();
                try {
                    bool = n4.t.h(new BigDecimal(D2), w6.w(), Math.ulp(D2));
                } catch (NumberFormatException unused2) {
                    bool = null;
                }
                f3 = n4.t.f(bool, y10);
                q1.l(v0Var);
                v0Var.B.b(f3 != null ? "null" : f3, "Property filter result");
                if (f3 != null) {
                }
            } else {
                q1.l(v0Var);
                v0Var.f9053w.b(p0Var.c(n9Var.v()), "No number filter for double property. property");
                f3 = null;
                q1.l(v0Var);
                v0Var.B.b(f3 != null ? "null" : f3, "Property filter result");
                if (f3 != null) {
                }
            }
        } else {
            if (!w6.v()) {
                q1.l(v0Var);
                v0Var.f9053w.b(p0Var.c(n9Var.v()), "No number filter for long property. property");
                z11 = A;
                f3 = null;
                q1.l(v0Var);
                v0Var.B.b(f3 != null ? "null" : f3, "Property filter result");
                if (f3 != null) {
                    return false;
                }
                this.f7120c = Boolean.TRUE;
                if (!z11 || f3.booleanValue()) {
                    if (!z10 || q7Var.x()) {
                        this.f7121d = f3;
                    }
                    if (f3.booleanValue() && z12 && n9Var.t()) {
                        long u10 = n9Var.u();
                        if (l10 != null) {
                            u10 = l10.longValue();
                        }
                        if (D && q7Var.x() && !q7Var.y() && l11 != null) {
                            u10 = l11.longValue();
                        }
                        if (q7Var.y()) {
                            this.f7123f = Long.valueOf(u10);
                        } else {
                            this.f7122e = Long.valueOf(u10);
                        }
                    }
                }
                return true;
            }
            z11 = A;
            try {
                bool2 = n4.t.h(new BigDecimal(n9Var.z()), w6.w(), 0.0d);
            } catch (NumberFormatException unused3) {
                bool2 = null;
            }
            f3 = n4.t.f(bool2, y10);
            q1.l(v0Var);
            v0Var.B.b(f3 != null ? "null" : f3, "Property filter result");
            if (f3 != null) {
            }
        }
    }
}
