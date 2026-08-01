package n4;

import c2.w1;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.r7;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import s7.l4;
import s7.v0;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f7118a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7119b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7120c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f7121d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f7122e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f7123f;

    public t(h0 h0Var, wd.h hVar, Map map) {
        map.getClass();
        int b10 = hVar != null ? r4.d.b(cf.c.G(hVar)) : -1;
        int i3 = 0;
        if (hVar != null) {
            pe.a G = cf.c.G(hVar);
            if (G instanceof pe.d) {
                StringBuilder sb2 = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                ce.b v10 = cf.c.v(((pe.d) G).d());
                throw new IllegalArgumentException(v4.a.o(sb2, v10 != null ? ((wd.h) v10).c() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            com.google.firebase.messaging.v vVar = new com.google.firebase.messaging.v(G);
            ge.g gVar = new ge.g(3, vVar);
            int c10 = G.d().c();
            for (int i10 = 0; i10 < c10; i10++) {
                String d10 = G.d().d(i10);
                f0 a9 = r4.d.a(G.d().h(i10), map);
                if (a9 == null) {
                    a1.e(r4.d.g(d10, G.d().h(i10).a(), G.d().a(), map.toString()));
                    throw null;
                }
                gVar.a(Integer.valueOf(i10), d10, a9);
            }
            r1 = ((String) vVar.f3175d) + ((String) vVar.f3177i) + ((String) vVar.f3178r);
        }
        this.f7120c = h0Var;
        this.f7119b = b10;
        this.f7118a = r1;
        this.f7121d = new LinkedHashMap();
        this.f7123f = new ArrayList();
        this.f7122e = new LinkedHashMap();
        if (hVar != null) {
            pe.a G2 = cf.c.G(hVar);
            if (G2 instanceof pe.d) {
                a1.g(G2, ". Arguments can only be generated from concrete classes or objects.", "Cannot generate NavArguments for polymorphic serializer ");
                throw null;
            }
            int c11 = G2.d().c();
            ArrayList arrayList = new ArrayList(c11);
            for (int i11 = 0; i11 < c11; i11++) {
                String d11 = G2.d().d(i11);
                d11.getClass();
                re.e h10 = G2.d().h(i11);
                boolean g = h10.g();
                f0 a10 = r4.d.a(h10, map);
                if (a10 == null) {
                    a1.e(r4.d.g(d11, h10.a(), G2.d().a(), map.toString()));
                    throw null;
                }
                arrayList.add(new f(d11, new g(a10, g, G2.d().i(i11))));
            }
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                f fVar = (f) obj;
                ((LinkedHashMap) this.f7121d).put(fVar.f7042a, fVar.f7043b);
            }
        }
    }

    public static Boolean f(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean g(String str, r7 r7Var, v0 v0Var) {
        List y3;
        c7.c0.g(r7Var);
        if (str != null && r7Var.t() && r7Var.B() != 1 && (r7Var.B() != 7 ? r7Var.u() : r7Var.z() != 0)) {
            int B = r7Var.B();
            boolean x10 = r7Var.x();
            String v10 = (x10 || B == 2 || B == 7) ? r7Var.v() : r7Var.v().toUpperCase(Locale.ENGLISH);
            if (r7Var.z() == 0) {
                y3 = null;
            } else {
                y3 = r7Var.y();
                if (!x10) {
                    ArrayList arrayList = new ArrayList(y3.size());
                    Iterator it = y3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    y3 = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = B == 2 ? v10 : null;
            if (B != 7 ? v10 != null : y3 != null && !y3.isEmpty()) {
                if (!x10 && B != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (B - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != x10 ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (v0Var != null) {
                                    v0Var.f9053w.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(v10));
                    case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                        return Boolean.valueOf(str.endsWith(v10));
                    case a4.j.LONG_FIELD_NUMBER /* 4 */:
                        return Boolean.valueOf(str.contains(v10));
                    case a4.j.STRING_FIELD_NUMBER /* 5 */:
                        return Boolean.valueOf(str.equals(v10));
                    case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (y3 != null) {
                            return Boolean.valueOf(y3.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean h(BigDecimal bigDecimal, o7 o7Var, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        c7.c0.g(o7Var);
        if (o7Var.t()) {
            if (o7Var.D() != 1 && (o7Var.D() != 5 ? o7Var.w() : o7Var.y() && o7Var.A())) {
                int D = o7Var.D();
                try {
                    if (o7Var.D() == 5) {
                        if (l4.W(o7Var.z()) && l4.W(o7Var.B())) {
                            BigDecimal bigDecimal5 = new BigDecimal(o7Var.z());
                            bigDecimal4 = new BigDecimal(o7Var.B());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (l4.W(o7Var.x())) {
                        bigDecimal2 = new BigDecimal(o7Var.x());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (D != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i3 = D - 1;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d10 != 0.0d) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
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

    public s a() {
        s b10 = b();
        b10.getClass();
        w1 w1Var = b10.f7115e;
        for (Map.Entry entry : ((LinkedHashMap) this.f7121d).entrySet()) {
            String str = (String) entry.getKey();
            g gVar = (g) entry.getValue();
            str.getClass();
            gVar.getClass();
            w1Var.getClass();
            ((LinkedHashMap) w1Var.f1697d).put(str, gVar);
        }
        ArrayList arrayList = (ArrayList) this.f7123f;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            final q qVar = (q) obj;
            qVar.getClass();
            w1Var.getClass();
            final int i10 = 0;
            ArrayList z10 = k7.e.z((LinkedHashMap) w1Var.f1697d, new Function1() { // from class: q4.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean contains;
                    String str2 = (String) obj2;
                    switch (i10) {
                        case 0:
                            str2.getClass();
                            contains = qVar.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            contains = qVar.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!z10.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + qVar.f7098a + " can't be used to open destination " + ((s) w1Var.f1695b) + ".\nFollowing required arguments are missing: " + z10).toString());
            }
            ((ArrayList) w1Var.f1696c).add(qVar);
        }
        Iterator it = ((LinkedHashMap) this.f7122e).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            kotlin.collections.i0.j();
            return null;
        }
        String str2 = this.f7118a;
        if (str2 != null) {
            w1Var.getClass();
            if (StringsKt.r(str2)) {
                a1.e("Cannot have an empty route");
                return null;
            }
            String concat = "android-app://androidx.navigation/".concat(str2);
            final q qVar2 = new q(concat);
            final int i11 = 1;
            ArrayList z11 = k7.e.z((LinkedHashMap) w1Var.f1697d, new Function1() { // from class: q4.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    boolean contains;
                    String str22 = (String) obj2;
                    switch (i11) {
                        case 0:
                            str22.getClass();
                            contains = qVar2.c().contains(str22);
                            break;
                        default:
                            str22.getClass();
                            contains = qVar2.c().contains(str22);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (!z11.isEmpty()) {
                StringBuilder q3 = v4.a.q("Cannot set route \"", str2, "\" for destination ");
                q3.append((s) w1Var.f1695b);
                q3.append(". Following required arguments are missing: ");
                q3.append(z11);
                throw new IllegalArgumentException(q3.toString().toString());
            }
            w1Var.f1699f = hd.h.b(new a1.b(21, concat));
            w1Var.f1694a = concat.hashCode();
            w1Var.f1698e = str2;
        }
        int i12 = this.f7119b;
        if (i12 != -1) {
            w1Var.f1694a = i12;
        }
        return b10;
    }

    public s b() {
        return ((h0) this.f7120c).a();
    }

    public abstract int c();

    public abstract boolean d();

    public abstract boolean e();

    public t(String str, int i3) {
        this.f7118a = str;
        this.f7119b = i3;
    }
}
