package defpackage;

import android.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kb3 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ nb3 h;
    public final in3 i;

    public kb3(nb3 nb3Var, String str, int i, in3 in3Var, int i2) {
        this.g = i2;
        this.h = nb3Var;
        this.a = str;
        this.b = i;
        this.i = in3Var;
    }

    public static Boolean c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, qg3 qg3Var, vh3 vh3Var) {
        List u;
        ll3.v(qg3Var);
        if (str != null && qg3Var.p() && qg3Var.x() != 1 && (qg3Var.x() != 7 ? qg3Var.q() : qg3Var.v() != 0)) {
            int x = qg3Var.x();
            boolean t = qg3Var.t();
            String r = (t || x == 2 || x == 7) ? qg3Var.r() : qg3Var.r().toUpperCase(Locale.ENGLISH);
            if (qg3Var.v() == 0) {
                u = null;
            } else {
                u = qg3Var.u();
                if (!t) {
                    ArrayList arrayList = new ArrayList(u.size());
                    Iterator it = u.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    u = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = x == 2 ? r : null;
            if (x != 7 ? r != null : u != null && !u.isEmpty()) {
                if (!t && x != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (x - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != t ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (vh3Var != null) {
                                    vh3Var.u.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(r));
                    case 3:
                        return Boolean.valueOf(str.endsWith(r));
                    case 4:
                        return Boolean.valueOf(str.contains(r));
                    case 5:
                        return Boolean.valueOf(str.equals(r));
                    case 6:
                        if (u != null) {
                            return Boolean.valueOf(u.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(BigDecimal bigDecimal, ng3 ng3Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        ll3.v(ng3Var);
        if (ng3Var.p()) {
            if (ng3Var.z() != 1 && (ng3Var.z() != 5 ? ng3Var.s() : ng3Var.u() && ng3Var.w())) {
                int z = ng3Var.z();
                try {
                    if (ng3Var.z() == 5) {
                        if (bi3.c0(ng3Var.v()) && bi3.c0(ng3Var.x())) {
                            BigDecimal bigDecimal5 = new BigDecimal(ng3Var.v());
                            bigDecimal4 = new BigDecimal(ng3Var.x());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (bi3.c0(ng3Var.t())) {
                        bigDecimal2 = new BigDecimal(ng3Var.t());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (z != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i = z - 1;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d != 0.0d) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                    }
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                            }
                        } else if (bigDecimal2 != null) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
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
    public boolean a(Long l, Long l2, cj3 cj3Var, long j, gd3 gd3Var, boolean z) {
        boolean z2;
        vh3 vh3Var;
        Boolean bool;
        Boolean bool2;
        long j2;
        Boolean bool3;
        Boolean bool4;
        int i;
        dr3.a();
        nb3 nb3Var = this.h;
        pj3 pj3Var = (pj3) nb3Var.m;
        ec3 ec3Var = pj3Var.p;
        vh3 vh3Var2 = pj3Var.r;
        nh3 nh3Var = pj3Var.v;
        tg3 tg3Var = ug3.F0;
        String str = this.a;
        boolean G = ec3Var.G(str, tg3Var);
        ig3 ig3Var = (ig3) this.i;
        long j3 = ig3Var.A() ? gd3Var.e : j;
        pj3.m(vh3Var2);
        g10 g10Var = vh3Var2.z;
        g10 g10Var2 = vh3Var2.u;
        boolean isLoggable = Log.isLoggable(vh3Var2.G(), 2);
        int i2 = this.b;
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
            pj3.m(vh3Var2);
            g10Var.e("Evaluating filter. audience, filter, event", Integer.valueOf(i2), ig3Var.p() ? Integer.valueOf(ig3Var.q()) : null, nh3Var.a(ig3Var.r()));
            pj3.m(vh3Var2);
            bi3 bi3Var = nb3Var.n.s;
            oq3.U(bi3Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (ig3Var.p()) {
                i = 0;
                bi3.O(sb, 0, "filter_id", Integer.valueOf(ig3Var.q()));
            } else {
                i = 0;
            }
            bi3.O(sb, i, "event_name", ((pj3) bi3Var.m).v.a(ig3Var.r()));
            String K = bi3.K(ig3Var.x(), ig3Var.y(), ig3Var.A());
            if (!K.isEmpty()) {
                bi3.O(sb, 0, "filter_type", K);
            }
            if (ig3Var.v()) {
                bi3.P(sb, 1, "event_count_filter", ig3Var.w());
            }
            if (ig3Var.t() > 0) {
                sb.append("  filters {\n");
                Iterator it = ig3Var.s().iterator();
                while (it.hasNext()) {
                    bi3Var.H(sb, 2, (kg3) it.next());
                }
            }
            bi3.I(1, sb);
            sb.append("}\n}\n");
            g10Var.c(sb.toString(), "Filter definition");
        }
        if (!ig3Var.p() || ig3Var.q() > 256) {
            pj3.m(vh3Var2);
            g10Var2.d(vh3.E(str), String.valueOf(ig3Var.p() ? Integer.valueOf(ig3Var.q()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = ig3Var.x() || ig3Var.y() || ig3Var.A();
        if (z && !z3) {
            pj3.m(vh3Var2);
            g10Var.d(Integer.valueOf(i2), ig3Var.p() ? Integer.valueOf(ig3Var.q()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String s = cj3Var.s();
        if (ig3Var.v()) {
            try {
                bool4 = e(new BigDecimal(j3), ig3Var.w(), 0.0d);
            } catch (NumberFormatException unused) {
                bool4 = null;
            }
            if (bool4 != null) {
                if (!bool4.booleanValue()) {
                    bool5 = Boolean.FALSE;
                }
            }
            z2 = G;
            vh3Var = vh3Var2;
            pj3.m(vh3Var);
            g10Var.c(bool5 == null ? "null" : bool5, "Event filter result");
            if (bool5 == null) {
                return false;
            }
            Boolean bool6 = Boolean.TRUE;
            this.c = bool6;
            if (!bool5.booleanValue()) {
                return true;
            }
            this.d = bool6;
            if (!z3 || !cj3Var.t()) {
                return true;
            }
            Long valueOf = Long.valueOf(cj3Var.u());
            if (ig3Var.y()) {
                if (z2 && ig3Var.v()) {
                    valueOf = l;
                }
                this.f = valueOf;
                return true;
            }
            if (z2 && ig3Var.v()) {
                valueOf = l2;
            }
            this.e = valueOf;
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = ig3Var.s().iterator();
        while (true) {
            if (!it2.hasNext()) {
                hi hiVar = new hi(0);
                Iterator it3 = cj3Var.p().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator it4 = ig3Var.s().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z2 = G;
                                vh3Var = vh3Var2;
                                bool5 = Boolean.TRUE;
                                break;
                            }
                            kg3 kg3Var = (kg3) it4.next();
                            boolean z4 = kg3Var.t() && kg3Var.u();
                            String w = kg3Var.w();
                            if (w.isEmpty()) {
                                pj3.m(vh3Var2);
                                g10Var2.c(nh3Var.a(s), "Event has empty param name. event");
                                break;
                            }
                            Object obj = hiVar.get(w);
                            if (obj instanceof Long) {
                                if (!kg3Var.r()) {
                                    pj3.m(vh3Var2);
                                    g10Var2.d(nh3Var.a(s), nh3Var.b(w), "No number filter for long param. event, param");
                                    break;
                                }
                                try {
                                    bool = e(new BigDecimal(((Long) obj).longValue()), kg3Var.s(), 0.0d);
                                } catch (NumberFormatException unused2) {
                                    bool = null;
                                }
                                if (bool == null) {
                                    break;
                                }
                                if (bool.booleanValue() == z4) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!kg3Var.r()) {
                                    pj3.m(vh3Var2);
                                    g10Var2.d(nh3Var.a(s), nh3Var.b(w), "No number filter for double param. event, param");
                                    break;
                                }
                                double doubleValue = ((Double) obj).doubleValue();
                                try {
                                    bool2 = e(new BigDecimal(doubleValue), kg3Var.s(), Math.ulp(doubleValue));
                                } catch (NumberFormatException unused3) {
                                    bool2 = null;
                                }
                                if (bool2 == null) {
                                    break;
                                }
                                if (bool2.booleanValue() == z4) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!kg3Var.p()) {
                                    if (!kg3Var.r()) {
                                        z2 = G;
                                        vh3Var = vh3Var2;
                                        pj3.m(vh3Var);
                                        g10Var2.d(nh3Var.a(s), nh3Var.b(w), "No filter for String param. event, param");
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!bi3.c0(str2)) {
                                        z2 = G;
                                        vh3Var = vh3Var2;
                                        pj3.m(vh3Var);
                                        g10Var2.d(nh3Var.a(s), nh3Var.b(w), "Invalid param value for number filter. event, param");
                                        break;
                                    }
                                    ng3 s2 = kg3Var.s();
                                    if (bi3.c0(str2)) {
                                        try {
                                            z2 = G;
                                            vh3Var = vh3Var2;
                                            j2 = 0;
                                        } catch (NumberFormatException unused4) {
                                            z2 = G;
                                            vh3Var = vh3Var2;
                                            j2 = 0;
                                        }
                                        try {
                                            bool3 = e(new BigDecimal(str2), s2, 0.0d);
                                        } catch (NumberFormatException unused5) {
                                            bool3 = null;
                                            if (bool3 == null) {
                                            }
                                            pj3.m(vh3Var);
                                            g10Var.c(bool5 == null ? "null" : bool5, "Event filter result");
                                            if (bool5 == null) {
                                            }
                                        }
                                        if (bool3 == null) {
                                            break;
                                        }
                                        if (bool3.booleanValue() == z4) {
                                            bool5 = Boolean.FALSE;
                                            break;
                                        }
                                        vh3Var2 = vh3Var;
                                        G = z2;
                                    } else {
                                        z2 = G;
                                        vh3Var = vh3Var2;
                                        bool3 = null;
                                    }
                                } else {
                                    qg3 q = kg3Var.q();
                                    pj3.m(vh3Var2);
                                    bool3 = d((String) obj, q, vh3Var2);
                                    z2 = G;
                                    vh3Var = vh3Var2;
                                }
                                j2 = 0;
                                if (bool3 == null) {
                                }
                            } else {
                                z2 = G;
                                vh3Var = vh3Var2;
                                if (obj == null) {
                                    pj3.m(vh3Var);
                                    g10Var.d(nh3Var.a(s), nh3Var.b(w), "Missing param for filter. event, param");
                                    bool5 = Boolean.FALSE;
                                } else {
                                    pj3.m(vh3Var);
                                    g10Var2.d(nh3Var.a(s), nh3Var.b(w), "Unknown param type. event, param");
                                }
                            }
                        }
                    } else {
                        hj3 hj3Var = (hj3) it3.next();
                        if (hashSet.contains(hj3Var.q())) {
                            if (!hj3Var.t()) {
                                if (!hj3Var.x()) {
                                    if (!hj3Var.r()) {
                                        pj3.m(vh3Var2);
                                        g10Var2.d(nh3Var.a(s), nh3Var.b(hj3Var.q()), "Unknown value for param. event, param");
                                        break;
                                    }
                                    hiVar.put(hj3Var.q(), hj3Var.s());
                                } else {
                                    hiVar.put(hj3Var.q(), hj3Var.x() ? Double.valueOf(hj3Var.y()) : null);
                                }
                            } else {
                                hiVar.put(hj3Var.q(), hj3Var.t() ? Long.valueOf(hj3Var.u()) : null);
                            }
                        }
                    }
                }
            } else {
                kg3 kg3Var2 = (kg3) it2.next();
                if (kg3Var2.w().isEmpty()) {
                    pj3.m(vh3Var2);
                    g10Var2.c(nh3Var.a(s), "null or empty param name in filter. event");
                    break;
                }
                hashSet.add(kg3Var2.w());
            }
        }
        pj3.m(vh3Var);
        g10Var.c(bool5 == null ? "null" : bool5, "Event filter result");
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
    public boolean b(Long l, Long l2, ek3 ek3Var, boolean z) {
        boolean z2;
        Boolean c;
        Boolean e;
        Boolean bool;
        Boolean bool2;
        dr3.a();
        pj3 pj3Var = (pj3) this.h.m;
        ec3 ec3Var = pj3Var.p;
        nh3 nh3Var = pj3Var.v;
        vh3 vh3Var = pj3Var.r;
        boolean G = ec3Var.G(this.a, ug3.D0);
        pg3 pg3Var = (pg3) this.i;
        boolean t = pg3Var.t();
        boolean u = pg3Var.u();
        boolean w = pg3Var.w();
        boolean z3 = t || u || w;
        if (z && !z3) {
            pj3.m(vh3Var);
            vh3Var.z.d(Integer.valueOf(this.b), pg3Var.p() ? Integer.valueOf(pg3Var.q()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        kg3 s = pg3Var.s();
        boolean u2 = s.u();
        if (!ek3Var.u()) {
            z2 = w;
            if (!ek3Var.y()) {
                if (ek3Var.s()) {
                    if (s.p()) {
                        String t2 = ek3Var.t();
                        qg3 q = s.q();
                        pj3.m(vh3Var);
                        c = c(d(t2, q, vh3Var), u2);
                    } else if (!s.r()) {
                        pj3.m(vh3Var);
                        vh3Var.u.c(nh3Var.c(ek3Var.r()), "No string or number filter defined. property");
                    } else if (bi3.c0(ek3Var.t())) {
                        String t3 = ek3Var.t();
                        ng3 s2 = s.s();
                        if (bi3.c0(t3)) {
                            try {
                                e = e(new BigDecimal(t3), s2, 0.0d);
                            } catch (NumberFormatException unused) {
                            }
                            c = c(e, u2);
                        }
                        e = null;
                        c = c(e, u2);
                    } else {
                        pj3.m(vh3Var);
                        vh3Var.u.d(nh3Var.c(ek3Var.r()), ek3Var.t(), "Invalid user property value for Numeric number filter. property, value");
                    }
                    pj3.m(vh3Var);
                    vh3Var.z.c(c != null ? "null" : c, "Property filter result");
                    if (c != null) {
                    }
                } else {
                    pj3.m(vh3Var);
                    vh3Var.u.c(nh3Var.c(ek3Var.r()), "User property has no value, property");
                }
                c = null;
                pj3.m(vh3Var);
                vh3Var.z.c(c != null ? "null" : c, "Property filter result");
                if (c != null) {
                }
            } else if (s.r()) {
                double z4 = ek3Var.z();
                try {
                    bool = e(new BigDecimal(z4), s.s(), Math.ulp(z4));
                } catch (NumberFormatException unused2) {
                    bool = null;
                }
                c = c(bool, u2);
                pj3.m(vh3Var);
                vh3Var.z.c(c != null ? "null" : c, "Property filter result");
                if (c != null) {
                }
            } else {
                pj3.m(vh3Var);
                vh3Var.u.c(nh3Var.c(ek3Var.r()), "No number filter for double property. property");
                c = null;
                pj3.m(vh3Var);
                vh3Var.z.c(c != null ? "null" : c, "Property filter result");
                if (c != null) {
                }
            }
        } else {
            if (!s.r()) {
                pj3.m(vh3Var);
                vh3Var.u.c(nh3Var.c(ek3Var.r()), "No number filter for long property. property");
                z2 = w;
                c = null;
                pj3.m(vh3Var);
                vh3Var.z.c(c != null ? "null" : c, "Property filter result");
                if (c != null) {
                    return false;
                }
                this.c = Boolean.TRUE;
                if (!z2 || c.booleanValue()) {
                    if (!z || pg3Var.t()) {
                        this.d = c;
                    }
                    if (c.booleanValue() && z3 && ek3Var.p()) {
                        long q2 = ek3Var.q();
                        if (l != null) {
                            q2 = l.longValue();
                        }
                        if (G && pg3Var.t() && !pg3Var.u() && l2 != null) {
                            q2 = l2.longValue();
                        }
                        if (pg3Var.u()) {
                            this.f = Long.valueOf(q2);
                        } else {
                            this.e = Long.valueOf(q2);
                        }
                    }
                }
                return true;
            }
            z2 = w;
            try {
                bool2 = e(new BigDecimal(ek3Var.v()), s.s(), 0.0d);
            } catch (NumberFormatException unused3) {
                bool2 = null;
            }
            c = c(bool2, u2);
            pj3.m(vh3Var);
            vh3Var.z.c(c != null ? "null" : c, "Property filter result");
            if (c != null) {
            }
        }
    }
}
