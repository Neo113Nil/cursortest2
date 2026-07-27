package M1;

import A.AbstractC0017m;
import A.C0005a;
import A.C0008d;
import A.C0009e;
import A.C0010f;
import A.C0011g;
import A.C0014j;
import A.C0018n;
import A.G;
import A.InterfaceC0019o;
import A1.A;
import A1.C0048c;
import A1.C0050d;
import A1.C0054f;
import A1.C0056g;
import A1.C0058h;
import A1.C0063j0;
import A1.C0073o0;
import A1.C0079s;
import A1.E;
import A1.E0;
import A1.G0;
import A1.J;
import A1.K0;
import A1.O;
import A1.v0;
import D.AbstractC0151m0;
import D.AbstractC0159p;
import D.C0156o;
import D.I1;
import D.N1;
import F0.r;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0222s0;
import G.InterfaceC0191c0;
import G.InterfaceC0213n0;
import G.W;
import G.W0;
import L0.h;
import P.i;
import P.k;
import P.m;
import P0.F;
import Y.d;
import Z.C0306c;
import Z.C0310g;
import Z.C0323u;
import Z.K;
import Z.S;
import a.AbstractC0345a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.FillElement;
import b0.C0493a;
import b0.C0494b;
import b0.C0499g;
import b0.InterfaceC0496d;
import e.C0550a;
import f0.AbstractC0576G;
import f0.C0584e;
import f0.C0585f;
import f1.C0607a;
import g2.C0639b;
import g2.e;
import g2.x;
import j2.AbstractC0720j;
import j2.C0715e;
import j2.InterfaceC0711a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import n.AbstractC0864b;
import o.N;
import o2.C0922a;
import o2.C0924c;
import o2.f;
import o2.j;
import o2.o;
import o2.p;
import o2.q;
import o2.s;
import o2.v;
import p0.AbstractC0960V;
import p0.InterfaceC0945F;
import p0.InterfaceC0980p;
import q.AbstractC1024c;
import q.AbstractC1031j;
import q.AbstractC1035n;
import q.AbstractC1039r;
import q.C1025d;
import q.C1028g;
import q.C1041t;
import q.C1042u;
import q.a0;
import q.e0;
import q.f0;
import r0.AbstractC1065f;
import r0.B;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.C1078t;
import r0.InterfaceC1070k;
import s0.AbstractC1144g0;
import s0.C1157n;
import s0.P0;
import u3.l;
import y.t;
import z1.AbstractC1365I;
import z1.AbstractC1366J;
import z1.C1372P;
import z1.C1377c;
import z2.C1403G;
import z2.C1405I;
import z2.C1436t;
import z2.C1439w;
import z2.C1441y;

/* loaded from: classes.dex */
public abstract class a implements Encoder, h3.b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f3564a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f3565b;

    /* renamed from: c, reason: collision with root package name */
    public static C0585f f3566c;

    /* renamed from: d, reason: collision with root package name */
    public static C0585f f3567d;

    /* renamed from: e, reason: collision with root package name */
    public static C0585f f3568e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f3569f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f3570g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f3571h;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f3572i;

    public static long A(o oVar) {
        long j4 = 8;
        if (!(oVar instanceof j) && !(oVar instanceof p)) {
            if (oVar instanceof C0922a) {
                j4 = 4;
            } else {
                if (!(oVar instanceof v)) {
                    throw new IllegalArgumentException("Unknown leaf node type: " + oVar.getClass());
                }
                j4 = ((v) oVar).f8957i.length() + 2;
            }
        }
        if (oVar.f8945d.isEmpty()) {
            return j4;
        }
        return A((o) oVar.f8945d) + j4 + 24;
    }

    public static long B(s sVar) {
        if (sVar.isEmpty()) {
            return 4L;
        }
        if (sVar.y()) {
            return A((o) sVar);
        }
        AbstractC0720j.b("Unexpected node type: " + sVar.getClass(), sVar instanceof f);
        Iterator it = sVar.iterator();
        long j4 = 1;
        while (it.hasNext()) {
            j4 = j4 + r5.f8950a.f8920d.length() + 4 + B(((q) it.next()).f8951b);
        }
        return !sVar.k().isEmpty() ? j4 + 12 + A((o) sVar.k()) : j4;
    }

    public static HashMap C(InterfaceC0711a interfaceC0711a) {
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(interfaceC0711a.d()));
        return hashMap;
    }

    public static final C0585f D() {
        C0585f c0585f = f3566c;
        if (c0585f != null) {
            return c0585f;
        }
        C0584e c0584e = new C0584e("Outlined.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        C1405I c1405i = AbstractC0576G.f6305a;
        S s4 = new S(C0323u.f4542b);
        W0 w02 = new W0(1);
        w02.j(16.0f, 9.0f);
        w02.o(10.0f);
        w02.f(8.0f);
        w02.n(9.0f);
        w02.g(8.0f);
        ArrayList arrayList = w02.f2781d;
        arrayList.add(new f0.v(-1.5f, -6.0f));
        w02.g(-5.0f);
        w02.i(-1.0f, 1.0f);
        w02.f(5.0f);
        w02.o(2.0f);
        w02.g(14.0f);
        w02.n(4.0f);
        w02.g(-3.5f);
        w02.i(-1.0f, -1.0f);
        w02.c();
        w02.j(18.0f, 7.0f);
        w02.f(6.0f);
        w02.o(12.0f);
        w02.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        w02.g(8.0f);
        w02.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        w02.n(7.0f);
        w02.c();
        C0584e.a(c0584e, arrayList, s4);
        C0585f b4 = c0584e.b();
        f3566c = b4;
        return b4;
    }

    public static Object E(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return X0.b.a(bundle, str, C0550a.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0550a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static void F(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new AssertionError("hardAssert failed: ".concat(String.format(str, objArr)));
        }
    }

    public static int G(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC0017m.g(i2, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final int H(int i2, int i4) {
        return (i2 >> i4) & 31;
    }

    public static boolean I(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static boolean J(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3569f == null) {
            f3569f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f3569f.booleanValue();
        if (f3570g == null) {
            f3570g = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f3570g.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static String M(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z4) {
                sb.append("/");
            }
            sb.append(str);
            z4 = false;
        }
        return sb.toString();
    }

    public static boolean N(Parcel parcel, int i2) {
        Z(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static int O(Parcel parcel, int i2) {
        Z(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int P(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static final i Q(C0216p c0216p) {
        c0216p.S(-796080049);
        i iVar = (i) l.s0(new Object[0], i.f3664d, P.j.f3668e, c0216p, 3072, 4);
        iVar.f3667c = (k) c0216p.k(m.f3674a);
        c0216p.q(false);
        return iVar;
    }

    public static Object R(Object obj, t tVar, HashMap hashMap) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map = (Map) obj;
        if (!map.containsKey(".sv")) {
            return obj;
        }
        Object obj2 = map.get(".sv");
        Object obj3 = null;
        obj3 = null;
        obj3 = null;
        obj3 = null;
        obj3 = null;
        if (obj2 instanceof String) {
            String str = (String) obj2;
            if ("timestamp".equals(str) && hashMap.containsKey(str)) {
                obj3 = hashMap.get(str);
            }
        } else if (obj2 instanceof Map) {
            Map map2 = (Map) obj2;
            if (map2.containsKey("increment")) {
                Object obj4 = map2.get("increment");
                if (obj4 instanceof Number) {
                    Number number = (Number) obj4;
                    tVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    e eVar = (e) tVar.f11495i;
                    g2.s sVar = (g2.s) tVar.f11494e;
                    C0715e c0715e = (C0715e) sVar.f6752b;
                    e eVar2 = e.f6694j;
                    s sVar2 = null;
                    e eVar3 = eVar;
                    do {
                        C0924c C3 = eVar3.C();
                        eVar3 = eVar3.F();
                        eVar2 = eVar2.j(C3);
                        e E3 = e.E(eVar2, eVar);
                        c0715e = C3 != null ? c0715e.s(C3) : C0715e.f7158j;
                        g2.l lVar = (g2.l) c0715e.f7159d;
                        if (lVar != null) {
                            sVar2 = lVar.c(E3);
                        }
                        if (eVar3.isEmpty()) {
                            break;
                        }
                    } while (sVar2 == null);
                    s a4 = ((x) sVar.f6753c).a(eVar, sVar2, arrayList, true);
                    obj3 = number;
                    if (a4.y()) {
                        obj3 = number;
                        if (a4.getValue() instanceof Number) {
                            Number number2 = (Number) a4.getValue();
                            if (!(number instanceof Double) && !(number instanceof Float) && !(number2 instanceof Double) && !(number2 instanceof Float)) {
                                long longValue = number.longValue();
                                long longValue2 = number2.longValue();
                                long j4 = longValue + longValue2;
                                if (((longValue ^ j4) & (longValue2 ^ j4)) >= 0) {
                                    obj3 = Long.valueOf(j4);
                                }
                            }
                            obj3 = Double.valueOf(number2.doubleValue() + number.doubleValue());
                        }
                    }
                }
            }
        }
        return obj3 == null ? obj : obj3;
    }

    public static C0639b S(C0639b c0639b, g2.s sVar, e eVar, HashMap hashMap) {
        C0639b c0639b2 = C0639b.f6677e;
        Iterator it = c0639b.f6678d.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0639b2 = c0639b2.e((e) entry.getKey(), T((s) entry.getValue(), new t(sVar, 23, eVar.h((e) entry.getKey())), hashMap));
        }
        return c0639b2;
    }

    public static s T(s sVar, t tVar, HashMap hashMap) {
        Object value = sVar.k().getValue();
        Object R3 = R(value, tVar.p(C0924c.c(".priority")), hashMap);
        boolean z4 = false;
        if (!sVar.y()) {
            if (sVar.isEmpty()) {
                return sVar;
            }
            f fVar = (f) sVar;
            C0607a c0607a = new C0607a(3, false);
            c0607a.f6561e = fVar;
            fVar.h(new g2.k(tVar, hashMap, c0607a), false);
            return !((s) c0607a.f6561e).k().equals(R3) ? ((s) c0607a.f6561e).f(m3.s.o(R3)) : (s) c0607a.f6561e;
        }
        Object R4 = R(sVar.getValue(), tVar, hashMap);
        if (R4.equals(sVar.getValue())) {
            if (R3 == value) {
                z4 = true;
            } else if (R3 != null && value != null) {
                z4 = R3.equals(value);
            }
            if (z4) {
                return sVar;
            }
        }
        return m3.o.c(R4, m3.s.o(R3));
    }

    public static void U(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + P(parcel, i2));
    }

    public static ArrayList V(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!split[i2].isEmpty()) {
                arrayList.add(split[i2]);
            }
        }
        return arrayList;
    }

    public static final String W(float f4) {
        if (Float.isNaN(f4)) {
            return "NaN";
        }
        if (Float.isInfinite(f4)) {
            return f4 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f5 = f4 * pow;
        int i2 = (int) f5;
        if (f5 - i2 >= 0.5f) {
            i2++;
        }
        float f6 = i2 / pow;
        return max > 0 ? String.valueOf(f6) : String.valueOf((int) f6);
    }

    public static int X(Parcel parcel) {
        int readInt = parcel.readInt();
        int P3 = P(parcel, readInt);
        char c4 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c4 != 20293) {
            throw new I1.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i2 = P3 + dataPosition;
        if (i2 < dataPosition || i2 > parcel.dataSize()) {
            throw new I1.b(B.b(dataPosition, i2, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static final d Y(InterfaceC0980p interfaceC0980p) {
        d e4 = AbstractC0960V.e(interfaceC0980p);
        long c4 = interfaceC0980p.c(AbstractC0345a.c(e4.f4374a, e4.f4375b));
        long c5 = interfaceC0980p.c(AbstractC0345a.c(e4.f4376c, e4.f4377d));
        return new d(Y.c.d(c4), Y.c.e(c4), Y.c.d(c5), Y.c.e(c5));
    }

    public static void Z(Parcel parcel, int i2, int i4) {
        int P3 = P(parcel, i2);
        if (P3 == i4) {
            return;
        }
        String hexString = Integer.toHexString(P3);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(P3);
        sb.append(" (0x");
        throw new I1.b(AbstractC0017m.n(sb, hexString, ")"), parcel);
    }

    public static final void b(Function0 function0, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-595104375);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(-2007802400);
            Object I3 = c0216p.I();
            W w4 = C0208l.f2826a;
            W w5 = W.f2779l;
            if (I3 == w4) {
                I3 = C0192d.K("", w5);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            Object f4 = AbstractC0017m.f(c0216p, false, -2007800896);
            if (f4 == w4) {
                f4 = C0192d.K("", w5);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, -2007799360);
            if (f5 == w4) {
                f5 = C0192d.K("", w5);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) f5;
            Object f6 = AbstractC0017m.f(c0216p, false, -2007797660);
            if (f6 == w4) {
                f6 = C0192d.K("2012", w5);
                c0216p.c0(f6);
            }
            InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) f6;
            Object f7 = AbstractC0017m.f(c0216p, false, -2007795933);
            if (f7 == w4) {
                f7 = C0192d.K(Boolean.FALSE, w5);
                c0216p.c0(f7);
            }
            InterfaceC0191c0 interfaceC0191c05 = (InterfaceC0191c0) f7;
            c0216p.q(false);
            D.W0.a(function0, O.f.b(-1948406831, new O(function0, interfaceC0191c02, interfaceC0191c04, interfaceC0191c0, interfaceC0191c03, interfaceC0191c05), c0216p), null, O.f.b(-221261869, new C0056g(function0, 7), c0216p), null, A.f421h, O.f.b(221971926, new C0054f(interfaceC0191c0, interfaceC0191c02, interfaceC0191c04, interfaceC0191c03, interfaceC0191c05), c0216p), null, AbstractC1365I.f11801b, 0L, 0L, 0L, 0.0f, null, c0216p, (i4 & 14) | 1772592, 0, 16020);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new J(function0, i2, 3);
        }
    }

    public static final void c(Function0 function0, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(-2078683475);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
        } else {
            c0216p.S(1400809194);
            Object I3 = c0216p.I();
            W w4 = C0208l.f2826a;
            W w5 = W.f2779l;
            if (I3 == w4) {
                I3 = C0192d.K("", w5);
                c0216p.c0(I3);
            }
            InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
            Object f4 = AbstractC0017m.f(c0216p, false, 1400810826);
            if (f4 == w4) {
                f4 = C0192d.K("", w5);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c02 = (InterfaceC0191c0) f4;
            c0216p.q(false);
            List e4 = C1441y.e(4289747756L, 4285235002L, 4282347149L, 4292454234L, 4286204447L, 4287315741L);
            c0216p.S(1400815506);
            Object I4 = c0216p.I();
            if (I4 == w4) {
                I4 = C0192d.K(e4.get(0), w5);
                c0216p.c0(I4);
            }
            InterfaceC0191c0 interfaceC0191c03 = (InterfaceC0191c0) I4;
            c0216p.q(false);
            D.W0.a(function0, O.f.b(-1817348763, new E0(function0, interfaceC0191c0, interfaceC0191c02, interfaceC0191c03), c0216p), null, O.f.b(346267811, new C0056g(function0, 8), c0216p), null, A.f424k, O.f.b(-703274624, new E0(interfaceC0191c0, interfaceC0191c02, e4, interfaceC0191c03), c0216p), null, AbstractC1365I.f11801b, 0L, 0L, 0L, 0.0f, null, c0216p, (i4 & 14) | 1772592, 0, 16020);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new J(function0, i2, 2);
        }
    }

    public static final long d(float f4, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public static final void e(InterfaceC0019o interfaceC0019o, S.c cVar, O.a aVar, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(476043083);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c0216p.f(interfaceC0019o) : c0216p.h(interfaceC0019o) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.f(cVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            boolean z4 = false;
            boolean z5 = (i4 & 112) == 32;
            if ((i4 & 14) == 4 || ((i4 & 8) != 0 && c0216p.f(interfaceC0019o))) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object I3 = c0216p.I();
            if (z6 || I3 == C0208l.f2826a) {
                I3 = new C0018n(cVar, interfaceC0019o);
                c0216p.c0(I3);
            }
            P0.o.a((C0018n) I3, null, new F(false, true, true, 1, true, false), aVar, c0216p, ((i4 << 3) & 7168) | 384, 2);
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0005a(interfaceC0019o, cVar, aVar, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r45.I(), java.lang.Integer.valueOf(r13)) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0394  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(Function0 onBack, C0216p c0216p, int i2) {
        int i4;
        InterfaceC0191c0 interfaceC0191c0;
        InterfaceC0191c0 interfaceC0191c02;
        boolean z4;
        boolean h4;
        Object I3;
        Function0 function0;
        Q.v vVar;
        int i5;
        Integer num;
        A2.b bVar;
        Object obj;
        final InterfaceC0191c0 interfaceC0191c03;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        c0216p.U(-2012498407);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(onBack) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 3) == 2 && c0216p.z()) {
            c0216p.N();
            function0 = onBack;
            i5 = 4;
        } else {
            c0216p.S(849815120);
            Object I4 = c0216p.I();
            Object obj2 = C0208l.f2826a;
            W w4 = W.f2779l;
            if (I4 == obj2) {
                I4 = C0192d.K("", w4);
                c0216p.c0(I4);
            }
            InterfaceC0191c0 interfaceC0191c04 = (InterfaceC0191c0) I4;
            Object f4 = AbstractC0017m.f(c0216p, false, 849816657);
            if (f4 == obj2) {
                Q.v vVar2 = new Q.v();
                vVar2.addAll(C1439w.z(new String[]{null, null, null, null}));
                c0216p.c0(vVar2);
                f4 = vVar2;
            }
            Q.v vVar3 = (Q.v) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, 849819416);
            if (f5 == obj2) {
                f5 = C0192d.K(null, w4);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c05 = (InterfaceC0191c0) f5;
            c0216p.q(false);
            C1372P c1372p = (C1372P) C1403G.r(AbstractC1366J.f11816b);
            S.l lVar = S.l.f3977a;
            S.o b4 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.f5082b, AbstractC1365I.f11800a, K.f4461a);
            C1025d c1025d = AbstractC1031j.f9267c;
            S.e eVar = S.b.f3963r;
            C1041t a4 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i6 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            Function0 function02 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function02);
            } else {
                c0216p.f0();
            }
            C1067h c1067h = C1069j.f9820f;
            C0192d.R(c0216p, a4, c1067h);
            C1067h c1067h2 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h2);
            C1067h c1067h3 = C1069j.f9821g;
            if (c0216p.f2860O) {
                interfaceC0191c0 = interfaceC0191c05;
            } else {
                interfaceC0191c0 = interfaceC0191c05;
            }
            AbstractC0017m.r(i6, c0216p, i6, c1067h3);
            C1067h c1067h4 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h4);
            S.o i7 = androidx.compose.foundation.layout.b.i(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.f5081a, H1.f.q(new Pair[]{new Pair(Float.valueOf(0.0f), new C0323u(AbstractC1365I.f11804e)), new Pair(Float.valueOf(1.0f), new C0323u(AbstractC1365I.f11805f))})), 8, 12);
            f0 b5 = e0.b(AbstractC1031j.f9265a, S.b.f3962q, c0216p, 48);
            int i8 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d5 = S.a.d(c0216p, i7);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function02);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, b5, c1067h);
            C0192d.R(c0216p, m5, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i8))) {
                AbstractC0017m.r(i8, c0216p, i8, c1067h3);
            }
            C0192d.R(c0216p, d5, c1067h4);
            int i9 = i4 & 14;
            InterfaceC0191c0 interfaceC0191c06 = interfaceC0191c0;
            D.W0.f(onBack, null, false, null, null, A.f425l, c0216p, i9 | 196608);
            N1.b("Relay Builder", null, AbstractC1365I.f11801b, l.k0(20), null, F0.k.f2617l, r.f2625c, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 199686, 0, 130962);
            c0216p.q(true);
            S.o h5 = androidx.compose.foundation.layout.b.h(lVar, 14);
            C1041t a5 = AbstractC1039r.a(new C1028g(10), eVar, c0216p, 6);
            int i10 = c0216p.f2861P;
            InterfaceC0213n0 m6 = c0216p.m();
            S.o d6 = S.a.d(c0216p, h5);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(function02);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, a5, c1067h);
            C0192d.R(c0216p, m6, c1067h2);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i10))) {
                AbstractC0017m.r(i10, c0216p, i10, c1067h3);
            }
            C0192d.R(c0216p, d6, c1067h4);
            String str = (String) interfaceC0191c04.getValue();
            c0216p.S(-546056004);
            Object I5 = c0216p.I();
            if (I5 == obj2) {
                interfaceC0191c02 = interfaceC0191c04;
                I5 = new C0058h(16, interfaceC0191c02);
                c0216p.c0(I5);
            } else {
                interfaceC0191c02 = interfaceC0191c04;
            }
            c0216p.q(false);
            AbstractC0864b.i(str, (Function1) I5, "Squad name (e.g. Greenfield A)", null, c0216p, 432, 8);
            Object obj3 = obj2;
            int i11 = 4;
            boolean z5 = false;
            C0216p c0216p2 = c0216p;
            N1.b("4 × 100 m", null, AbstractC1365I.f11806g, 0L, null, F0.k.f2616k, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 196614, 0, 131034);
            c0216p2.S(-546049639);
            ListIterator listIterator = vVar3.listIterator();
            final int i12 = 0;
            while (true) {
                A2.b bVar2 = (A2.b) listIterator;
                if (bVar2.hasNext()) {
                    Object next = bVar2.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C1441y.g();
                        throw null;
                    }
                    String str2 = (String) next;
                    ListIterator listIterator2 = AbstractC1366J.f11818d.listIterator();
                    while (true) {
                        A2.b bVar3 = (A2.b) listIterator2;
                        if (!bVar3.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = bVar3.next();
                            if (Intrinsics.a(((C1377c) obj).f11851a, str2)) {
                                break;
                            }
                        }
                    }
                    C1377c c1377c = (C1377c) obj;
                    FillElement fillElement = androidx.compose.foundation.layout.c.f5081a;
                    c0216p2.S(1120941122);
                    boolean d7 = c0216p2.d(i12);
                    Object I6 = c0216p.I();
                    if (d7 || I6 == obj3) {
                        interfaceC0191c03 = interfaceC0191c06;
                        I6 = new Function0() { // from class: A1.D0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                interfaceC0191c03.setValue(Integer.valueOf(i12));
                                return Unit.f7487a;
                            }
                        };
                        c0216p2.c0(I6);
                    } else {
                        interfaceC0191c03 = interfaceC0191c06;
                    }
                    c0216p2.q(z5);
                    interfaceC0191c06 = interfaceC0191c03;
                    AbstractC0864b.f(androidx.compose.foundation.a.e(fillElement, z5, null, (Function0) I6, 7), 0L, O.f.b(1404162408, new G0(i12, c1377c), c0216p2), c0216p, 384, 2);
                    z5 = z5;
                    i12 = i13;
                    c0216p2 = c0216p2;
                    obj3 = obj3;
                    i11 = i11;
                } else {
                    boolean z6 = z5;
                    C0216p c0216p3 = c0216p2;
                    int i14 = i11;
                    Object obj4 = obj3;
                    c0216p3.q(z6);
                    if (!y.x((String) interfaceC0191c02.getValue())) {
                        if (!vVar3.isEmpty()) {
                            ListIterator listIterator3 = vVar3.listIterator();
                            do {
                                bVar = (A2.b) listIterator3;
                                if (bVar.hasNext()) {
                                }
                            } while (((String) bVar.next()) != null);
                        }
                        z4 = true;
                        a0 a0Var = AbstractC0159p.f1957a;
                        long j4 = AbstractC1365I.f11805f;
                        long j5 = AbstractC1365I.f11801b;
                        C0156o a6 = AbstractC0159p.a(j4, j5, c0216p, 12);
                        FillElement fillElement2 = androidx.compose.foundation.layout.c.f5081a;
                        c0216p3.S(-546000721);
                        h4 = c0216p3.h(c1372p) | (i9 != i14 ? true : z6);
                        I3 = c0216p.I();
                        if (!h4 || I3 == obj4) {
                            function0 = onBack;
                            vVar = vVar3;
                            I3 = new C0073o0(vVar, c1372p, function0, interfaceC0191c02);
                            c0216p3.c0(I3);
                        } else {
                            function0 = onBack;
                            vVar = vVar3;
                        }
                        c0216p3.q(z6);
                        boolean z7 = z4;
                        i5 = i14;
                        InterfaceC0191c0 interfaceC0191c07 = interfaceC0191c06;
                        D.W0.b((Function0) I3, fillElement2, z7, null, a6, null, null, null, null, A.f426m, c0216p, 805306416, 488);
                        c0216p3.q(true);
                        c0216p3.q(true);
                        num = (Integer) interfaceC0191c07.getValue();
                        if (num != null) {
                            int intValue = num.intValue();
                            c0216p3.S(1410261861);
                            Object I7 = c0216p.I();
                            if (I7 == obj4) {
                                I7 = new C0048c(21, interfaceC0191c07);
                                c0216p3.c0(I7);
                            }
                            c0216p3.q(z6);
                            int i15 = 2;
                            D.W0.a((Function0) I7, O.f.b(-291522217, new C0079s(i15, interfaceC0191c07), c0216p3), null, null, null, O.f.b(156944219, new C0063j0(intValue, i15), c0216p3), O.f.b(-804680996, new K0(intValue, interfaceC0191c07, vVar), c0216p3), null, j5, 0L, 0L, 0L, 0.0f, null, c0216p, 1769526, 0, 16028);
                            Unit unit = Unit.f7487a;
                        }
                    }
                    z4 = z6;
                    a0 a0Var2 = AbstractC0159p.f1957a;
                    long j42 = AbstractC1365I.f11805f;
                    long j52 = AbstractC1365I.f11801b;
                    C0156o a62 = AbstractC0159p.a(j42, j52, c0216p, 12);
                    FillElement fillElement22 = androidx.compose.foundation.layout.c.f5081a;
                    c0216p3.S(-546000721);
                    h4 = c0216p3.h(c1372p) | (i9 != i14 ? true : z6);
                    I3 = c0216p.I();
                    if (h4) {
                    }
                    function0 = onBack;
                    vVar = vVar3;
                    I3 = new C0073o0(vVar, c1372p, function0, interfaceC0191c02);
                    c0216p3.c0(I3);
                    c0216p3.q(z6);
                    boolean z72 = z4;
                    i5 = i14;
                    InterfaceC0191c0 interfaceC0191c072 = interfaceC0191c06;
                    D.W0.b((Function0) I3, fillElement22, z72, null, a62, null, null, null, null, A.f426m, c0216p, 805306416, 488);
                    c0216p3.q(true);
                    c0216p3.q(true);
                    num = (Integer) interfaceC0191c072.getValue();
                    if (num != null) {
                    }
                }
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new J(function0, i2, i5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r63.I(), java.lang.Integer.valueOf(r4)) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(Function0 onRelay, Function1 function1, C0216p c0216p, int i2) {
        int i4;
        S.l lVar;
        S.o a4;
        C1067h c1067h;
        C1067h c1067h2;
        C1067h c1067h3;
        InterfaceC0191c0 interfaceC0191c0;
        C1067h c1067h4;
        C1068i c1068i;
        C0216p c0216p2;
        boolean z4;
        InterfaceC0191c0 interfaceC0191c02;
        W w4;
        InterfaceC0191c0 interfaceC0191c03;
        boolean z5;
        int i5;
        Object I3;
        W w5;
        InterfaceC0191c0 interfaceC0191c04;
        InterfaceC0191c0 interfaceC0191c05;
        InterfaceC0191c0 interfaceC0191c06;
        InterfaceC0191c0 interfaceC0191c07;
        boolean z6;
        int i6;
        W w6;
        InterfaceC0191c0 interfaceC0191c08;
        W w7;
        boolean z7;
        Intrinsics.checkNotNullParameter(onRelay, "onRelay");
        c0216p.U(239431591);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.h(onRelay) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function1) ? 32 : 16;
        }
        int i7 = i4;
        if ((i7 & 19) == 18 && c0216p.z()) {
            c0216p.N();
        } else {
            W w8 = C0208l.f2826a;
            c0216p.S(355158480);
            Object I4 = c0216p.I();
            W w9 = W.f2779l;
            if (I4 == w8) {
                I4 = C0192d.K(0, w9);
                c0216p.c0(I4);
            }
            InterfaceC0191c0 interfaceC0191c09 = (InterfaceC0191c0) I4;
            Object f4 = AbstractC0017m.f(c0216p, false, 355160116);
            if (f4 == w8) {
                f4 = C0192d.K(Boolean.FALSE, w9);
                c0216p.c0(f4);
            }
            InterfaceC0191c0 interfaceC0191c010 = (InterfaceC0191c0) f4;
            Object f5 = AbstractC0017m.f(c0216p, false, 355161876);
            if (f5 == w8) {
                f5 = C0192d.K(Boolean.FALSE, w9);
                c0216p.c0(f5);
            }
            InterfaceC0191c0 interfaceC0191c011 = (InterfaceC0191c0) f5;
            c0216p.q(false);
            S.l lVar2 = S.l.f3977a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f5082b;
            S.o b4 = androidx.compose.foundation.a.b(fillElement, AbstractC1365I.f11800a, K.f4461a);
            C1025d c1025d = AbstractC1031j.f9267c;
            S.e eVar = S.b.f3963r;
            C1041t a5 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
            int i8 = c0216p.f2861P;
            InterfaceC0213n0 m4 = c0216p.m();
            S.o d4 = S.a.d(c0216p, b4);
            InterfaceC1070k.f9822h.getClass();
            C1068i c1068i2 = C1069j.f9816b;
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i2);
            } else {
                c0216p.f0();
            }
            C1067h c1067h5 = C1069j.f9820f;
            C0192d.R(c0216p, a5, c1067h5);
            C1067h c1067h6 = C1069j.f9819e;
            C0192d.R(c0216p, m4, c1067h6);
            C1067h c1067h7 = C1069j.f9821g;
            if (c0216p.f2860O) {
                lVar = lVar2;
            } else {
                lVar = lVar2;
            }
            AbstractC0017m.r(i8, c0216p, i8, c1067h7);
            C1067h c1067h8 = C1069j.f9818d;
            C0192d.R(c0216p, d4, c1067h8);
            AbstractC0864b.j("Roster", "Athletes, teams and relay squads", c0216p, 54);
            int intValue = ((Number) interfaceC0191c09.getValue()).intValue();
            long j4 = AbstractC1365I.f11802c;
            long j5 = AbstractC1365I.f11805f;
            S.l lVar3 = lVar;
            I1.a(intValue, null, j4, j5, null, null, O.f.b(1474003929, new C0079s(3, interfaceC0191c09), c0216p), c0216p, 1572864);
            a4 = C1042u.f9344a.a(true);
            InterfaceC0945F e4 = AbstractC1035n.e(S.b.f3952d, false);
            int i9 = c0216p.f2861P;
            InterfaceC0213n0 m5 = c0216p.m();
            S.o d5 = S.a.d(c0216p, a4);
            c0216p.W();
            if (c0216p.f2860O) {
                c0216p.l(c1068i2);
            } else {
                c0216p.f0();
            }
            C0192d.R(c0216p, e4, c1067h5);
            C0192d.R(c0216p, m5, c1067h6);
            if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i9))) {
                AbstractC0017m.r(i9, c0216p, i9, c1067h7);
            }
            C0192d.R(c0216p, d5, c1067h8);
            int intValue2 = ((Number) interfaceC0191c09.getValue()).intValue();
            if (intValue2 == 0) {
                c1067h = c1067h8;
                c1067h2 = c1067h5;
                c1067h3 = c1067h7;
                interfaceC0191c0 = interfaceC0191c011;
                int i10 = 2;
                c1067h4 = c1067h6;
                c1068i = c1068i2;
                c0216p2 = c0216p;
                z4 = false;
                c0216p2.S(-183906988);
                if (AbstractC1366J.f11818d.isEmpty()) {
                    c0216p2.S(-183910739);
                    c0216p2.S(1656643331);
                    Object I5 = c0216p.I();
                    if (I5 == w8) {
                        interfaceC0191c03 = interfaceC0191c010;
                        I5 = new C0048c(22, interfaceC0191c03);
                        c0216p2.c0(I5);
                    } else {
                        interfaceC0191c03 = interfaceC0191c010;
                    }
                    c0216p2.q(false);
                    AbstractC0864b.e("No athletes yet", "Add the kids running today — bib number, name, team.", "Add athlete", (Function0) I5, c0216p, 3510, 0);
                    c0216p2.q(false);
                    interfaceC0191c02 = interfaceC0191c03;
                    w4 = w8;
                } else {
                    c0216p2.S(-183539483);
                    S.o h4 = androidx.compose.foundation.layout.b.h(fillElement, 14);
                    C1028g c1028g = new C1028g(8);
                    c0216p2.S(1656653783);
                    boolean z8 = (i7 & 112) == 32;
                    Object I6 = c0216p.I();
                    if (z8 || I6 == w8) {
                        I6 = new E(i10, function1);
                        c0216p2.c0(I6);
                    }
                    c0216p2.q(false);
                    interfaceC0191c02 = interfaceC0191c010;
                    w4 = w8;
                    m3.s.a(h4, null, null, false, c1028g, null, null, false, (Function1) I6, c0216p, 24582, 238);
                    c0216p2.q(false);
                }
                c0216p2.q(false);
                Unit unit = Unit.f7487a;
            } else if (intValue2 == 1) {
                c1067h = c1067h8;
                c1067h2 = c1067h5;
                c1067h3 = c1067h7;
                c1067h4 = c1067h6;
                c1068i = c1068i2;
                c0216p2 = c0216p;
                z4 = false;
                c0216p2.S(-181805653);
                if (AbstractC1366J.f11819e.isEmpty()) {
                    c0216p2.S(-181799174);
                    c0216p2.S(1656711043);
                    Object I7 = c0216p.I();
                    if (I7 == w8) {
                        interfaceC0191c08 = interfaceC0191c011;
                        I7 = new C0048c(23, interfaceC0191c08);
                        c0216p2.c0(I7);
                    } else {
                        interfaceC0191c08 = interfaceC0191c011;
                    }
                    c0216p2.q(false);
                    AbstractC0864b.e("No teams yet", "Schools or villages — each team gets a color.", "Add team", (Function0) I7, c0216p, 3510, 0);
                    c0216p2.q(false);
                    interfaceC0191c0 = interfaceC0191c08;
                    w6 = w8;
                } else {
                    c0216p2.S(-181453524);
                    S.o h5 = androidx.compose.foundation.layout.b.h(fillElement, 14);
                    C1028g c1028g2 = new C1028g(8);
                    c0216p2.S(1656721072);
                    Object I8 = c0216p.I();
                    if (I8 == w8) {
                        I8 = new v0(1);
                        c0216p2.c0(I8);
                    }
                    c0216p2.q(false);
                    interfaceC0191c0 = interfaceC0191c011;
                    w6 = w8;
                    m3.s.a(h5, null, null, false, c1028g2, null, null, false, (Function1) I8, c0216p, 100687878, 238);
                    c0216p2.q(false);
                }
                c0216p2.q(false);
                Unit unit2 = Unit.f7487a;
                interfaceC0191c02 = interfaceC0191c010;
                w4 = w6;
            } else if (intValue2 != 2) {
                c0216p.S(-177938062);
                c0216p.q(false);
                Unit unit3 = Unit.f7487a;
                z5 = true;
                c1067h = c1067h8;
                c1067h2 = c1067h5;
                c1067h3 = c1067h7;
                c1067h4 = c1067h6;
                interfaceC0191c02 = interfaceC0191c010;
                interfaceC0191c0 = interfaceC0191c011;
                w4 = w8;
                c1068i = c1068i2;
                c0216p2 = c0216p;
                z4 = false;
                c0216p2.q(z5);
                c0216p2.S(1872933915);
                if (((Number) interfaceC0191c09.getValue()).intValue() != 0 || ((Number) interfaceC0191c09.getValue()).intValue() == 1) {
                    S.o h6 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5081a, 14);
                    InterfaceC0945F e5 = AbstractC1035n.e(S.b.f3957l, z4);
                    i5 = c0216p2.f2861P;
                    InterfaceC0213n0 m6 = c0216p.m();
                    S.o d6 = S.a.d(c0216p2, h6);
                    c0216p.W();
                    if (c0216p2.f2860O) {
                        c0216p.f0();
                    } else {
                        c0216p2.l(c1068i);
                    }
                    C0192d.R(c0216p2, e5, c1067h2);
                    C0192d.R(c0216p2, m6, c1067h4);
                    if (!c0216p2.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i5))) {
                        AbstractC0017m.r(i5, c0216p2, i5, c1067h3);
                    }
                    C0192d.R(c0216p2, d6, c1067h);
                    c0216p2.S(1656834918);
                    I3 = c0216p.I();
                    w5 = w4;
                    if (I3 != w5) {
                        interfaceC0191c04 = interfaceC0191c0;
                        interfaceC0191c05 = interfaceC0191c02;
                        I3 = new A1.r(interfaceC0191c09, interfaceC0191c05, interfaceC0191c04);
                        c0216p2.c0(I3);
                    } else {
                        interfaceC0191c04 = interfaceC0191c0;
                        interfaceC0191c05 = interfaceC0191c02;
                    }
                    c0216p2.q(z4);
                    interfaceC0191c06 = interfaceC0191c04;
                    interfaceC0191c07 = interfaceC0191c05;
                    AbstractC0151m0.a((Function0) I3, null, null, j5, AbstractC1365I.f11801b, null, null, A.f418e, c0216p, 12582918);
                    z6 = true;
                    c0216p2.q(true);
                } else {
                    z6 = true;
                    interfaceC0191c06 = interfaceC0191c0;
                    interfaceC0191c07 = interfaceC0191c02;
                    w5 = w4;
                }
                c0216p2.q(z4);
                c0216p2.q(z6);
                c0216p2.S(355394130);
                if (((Boolean) interfaceC0191c07.getValue()).booleanValue()) {
                    i6 = 6;
                } else {
                    c0216p2.S(355395462);
                    Object I9 = c0216p.I();
                    if (I9 == w5) {
                        I9 = new C0048c(19, interfaceC0191c07);
                        c0216p2.c0(I9);
                    }
                    c0216p2.q(z4);
                    i6 = 6;
                    b((Function0) I9, c0216p2, 6);
                }
                c0216p2.q(z4);
                if (((Boolean) interfaceC0191c06.getValue()).booleanValue()) {
                    c0216p2.S(355397574);
                    Object I10 = c0216p.I();
                    if (I10 == w5) {
                        I10 = new C0048c(20, interfaceC0191c06);
                        c0216p2.c0(I10);
                    }
                    c0216p2.q(z4);
                    c((Function0) I10, c0216p2, i6);
                }
            } else {
                c0216p.S(-180108434);
                float f6 = 14;
                S.o h7 = androidx.compose.foundation.layout.b.h(fillElement, f6);
                C1041t a6 = AbstractC1039r.a(c1025d, eVar, c0216p, 0);
                int i11 = c0216p.f2861P;
                InterfaceC0213n0 m7 = c0216p.m();
                S.o d7 = S.a.d(c0216p, h7);
                c0216p.W();
                if (c0216p.f2860O) {
                    c0216p.l(c1068i2);
                } else {
                    c0216p.f0();
                }
                C0192d.R(c0216p, a6, c1067h5);
                C0192d.R(c0216p, m7, c1067h6);
                if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i11))) {
                    AbstractC0017m.r(i11, c0216p, i11, c1067h7);
                }
                C0192d.R(c0216p, d7, c1067h8);
                a0 a0Var = AbstractC0159p.f1957a;
                c1067h = c1067h8;
                c1067h2 = c1067h5;
                c1067h3 = c1067h7;
                c1067h4 = c1067h6;
                c1068i = c1068i2;
                D.W0.b(onRelay, androidx.compose.foundation.layout.c.f5081a, false, null, AbstractC0159p.a(j5, AbstractC1365I.f11801b, c0216p, 12), null, null, null, null, A.f417d, c0216p, (i7 & 14) | 805306416, 492);
                AbstractC1024c.a(c0216p, androidx.compose.foundation.layout.c.b(lVar3, f6));
                if (AbstractC1366J.f11822h.isEmpty()) {
                    c0216p.S(1959161417);
                    N1.b("No relays configured yet.", null, AbstractC1365I.f11806g, 0L, new F0.i(1), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0216p, 6, 0, 131050);
                    z4 = false;
                    c0216p.q(false);
                    z7 = true;
                    w7 = w8;
                    c0216p2 = c0216p;
                } else {
                    z4 = false;
                    c0216p.S(1959370822);
                    C1028g c1028g3 = new C1028g(8);
                    c0216p.S(1864323623);
                    Object I11 = c0216p.I();
                    if (I11 == w8) {
                        I11 = new v0(2);
                        c0216p.c0(I11);
                    }
                    c0216p.q(false);
                    w7 = w8;
                    c0216p2 = c0216p;
                    m3.s.a(null, null, null, false, c1028g3, null, null, false, (Function1) I11, c0216p, 100687872, 239);
                    c0216p2.q(false);
                    z7 = true;
                }
                c0216p2.q(z7);
                c0216p2.q(z4);
                Unit unit4 = Unit.f7487a;
                interfaceC0191c02 = interfaceC0191c010;
                interfaceC0191c0 = interfaceC0191c011;
                w4 = w7;
            }
            z5 = true;
            c0216p2.q(z5);
            c0216p2.S(1872933915);
            if (((Number) interfaceC0191c09.getValue()).intValue() != 0) {
            }
            S.o h62 = androidx.compose.foundation.layout.b.h(androidx.compose.foundation.layout.c.f5081a, 14);
            InterfaceC0945F e52 = AbstractC1035n.e(S.b.f3957l, z4);
            i5 = c0216p2.f2861P;
            InterfaceC0213n0 m62 = c0216p.m();
            S.o d62 = S.a.d(c0216p2, h62);
            c0216p.W();
            if (c0216p2.f2860O) {
            }
            C0192d.R(c0216p2, e52, c1067h2);
            C0192d.R(c0216p2, m62, c1067h4);
            if (!c0216p2.f2860O) {
            }
            AbstractC0017m.r(i5, c0216p2, i5, c1067h3);
            C0192d.R(c0216p2, d62, c1067h);
            c0216p2.S(1656834918);
            I3 = c0216p.I();
            w5 = w4;
            if (I3 != w5) {
            }
            c0216p2.q(z4);
            interfaceC0191c06 = interfaceC0191c04;
            interfaceC0191c07 = interfaceC0191c05;
            AbstractC0151m0.a((Function0) I3, null, null, j5, AbstractC1365I.f11801b, null, null, A.f418e, c0216p, 12582918);
            z6 = true;
            c0216p2.q(true);
            c0216p2.q(z4);
            c0216p2.q(z6);
            c0216p2.S(355394130);
            if (((Boolean) interfaceC0191c07.getValue()).booleanValue()) {
            }
            c0216p2.q(z4);
            if (((Boolean) interfaceC0191c06.getValue()).booleanValue()) {
            }
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0050d(onRelay, function1, i2);
        }
    }

    public static final void h(InterfaceC0019o interfaceC0019o, boolean z4, h hVar, boolean z5, long j4, S.o oVar, C0216p c0216p, int i2) {
        int i4;
        int i5;
        long j5;
        boolean z6;
        long j6;
        c0216p.U(-843755800);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? c0216p.f(interfaceC0019o) : c0216p.h(interfaceC0019o) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.g(z4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.f(hVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c0216p.g(z5) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= c0216p.f(oVar) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && c0216p.z()) {
            c0216p.N();
            j6 = j4;
        } else {
            c0216p.P();
            if ((i2 & 1) == 0 || c0216p.y()) {
                i5 = i4 & (-57345);
                j5 = 9205357640488583168L;
            } else {
                c0216p.N();
                i5 = i4 & (-57345);
                j5 = j4;
            }
            c0216p.r();
            h hVar2 = h.f3507e;
            h hVar3 = h.f3506d;
            if (z4) {
                float f4 = G.f21a;
                z6 = (hVar == hVar3 && !z5) || (hVar == hVar2 && z5);
            } else {
                float f5 = G.f21a;
                z6 = !((hVar == hVar3 && !z5) || (hVar == hVar2 && z5));
            }
            S.d dVar = z6 ? S.a.f3950b : S.a.f3949a;
            int i6 = i5 & 14;
            boolean g4 = ((i5 & 112) == 32) | (i6 == 4 || ((i5 & 8) != 0 && c0216p.h(interfaceC0019o))) | c0216p.g(z6);
            Object I3 = c0216p.I();
            if (g4 || I3 == C0208l.f2826a) {
                I3 = new C0010f(interfaceC0019o, z4, z6);
                c0216p.c0(I3);
            }
            e(interfaceC0019o, dVar, O.f.b(280174801, new C0008d((P0) c0216p.k(AbstractC1144g0.f10229q), j5, z6, y0.k.a(oVar, (Function1) I3), interfaceC0019o), c0216p), c0216p, i6 | 384);
            j6 = j5;
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0009e(interfaceC0019o, z4, hVar, z5, j6, oVar, i2);
        }
    }

    public static final void i(S.o oVar, Function0 function0, boolean z4, C0216p c0216p, int i2) {
        int i4;
        c0216p.U(2111672474);
        if ((i2 & 6) == 0) {
            i4 = (c0216p.f(oVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c0216p.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c0216p.g(z4) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0216p.z()) {
            c0216p.N();
        } else {
            AbstractC1024c.a(c0216p, S.a.b(androidx.compose.foundation.layout.c.h(oVar, G.f21a, G.f22b), C1157n.f10272m, new C0014j(function0, z4)));
        }
        C0222s0 s4 = c0216p.s();
        if (s4 != null) {
            s4.f2903d = new C0011g(oVar, function0, z4, i2);
        }
    }

    public static final long j(int i2, int i4) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i2 + ", end: " + i4 + ']').toString());
        }
        if (i4 >= 0) {
            long j4 = (i4 & 4294967295L) | (i2 << 32);
            int i5 = A0.K.f300c;
            return j4;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i2 + ", end: " + i4 + ']').toString());
    }

    public static final long k(float f4, float f5) {
        return (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    public static final boolean l(V.e eVar, long j4) {
        if (!eVar.f3978d.f3990s) {
            return false;
        }
        C1078t c1078t = (C1078t) AbstractC1065f.v(eVar).B.f2909c;
        if (!c1078t.f9841P.f3990s) {
            return false;
        }
        long j5 = c1078t.f9007i;
        long Q3 = c1078t.Q(0L);
        float d4 = Y.c.d(Q3);
        float e4 = Y.c.e(Q3);
        float f4 = ((int) (j5 >> 32)) + d4;
        float f5 = ((int) (j5 & 4294967295L)) + e4;
        float d5 = Y.c.d(j4);
        if (d4 > d5 || d5 > f4) {
            return false;
        }
        float e5 = Y.c.e(j4);
        return e4 <= e5 && e5 <= f5;
    }

    public static final Object[] m(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        C1436t.h(objArr, objArr2, 0, i2, 6);
        C1436t.f(objArr, objArr2, i2 + 2, i2, objArr.length);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] n(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[objArr.length - 2];
        C1436t.h(objArr, objArr2, 0, i2, 6);
        C1436t.f(objArr, objArr2, i2, i2 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] o(Object[] objArr, int i2) {
        Object[] objArr2 = new Object[objArr.length - 1];
        C1436t.h(objArr, objArr2, 0, i2, 6);
        C1436t.f(objArr, objArr2, i2, i2 + 1, objArr.length);
        return objArr2;
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void q(long j4, N n2) {
        if (n2 == N.f8665d) {
            if (M0.a.h(j4) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (M0.a.i(j4) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final long r(long j4, int i2) {
        int i4 = A0.K.f300c;
        int i5 = (int) (j4 >> 32);
        int e4 = kotlin.ranges.b.e(i5, 0, i2);
        int i6 = (int) (4294967295L & j4);
        int e5 = kotlin.ranges.b.e(i6, 0, i2);
        return (e4 == i5 && e5 == i6) ? j4 : j(e4, e5);
    }

    public static final boolean s(d dVar, float f4, float f5) {
        return f4 <= dVar.f4376c && dVar.f4374a <= f4 && f5 <= dVar.f4377d && dVar.f4375b <= f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0310g t(W.c cVar, float f4) {
        C0494b c0494b;
        int ceil = ((int) Math.ceil(f4)) * 2;
        C0310g c0310g = AbstractC0345a.f4743a;
        C0306c c0306c = AbstractC0345a.f4744b;
        C0494b c0494b2 = AbstractC0345a.f4745c;
        if (c0310g != null && c0306c != null) {
            Bitmap bitmap = c0310g.f4523a;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        c0310g = K.f(ceil, ceil, 1);
        AbstractC0345a.f4743a = c0310g;
        c0306c = K.a(c0310g);
        AbstractC0345a.f4744b = c0306c;
        C0310g c0310g2 = c0310g;
        C0306c c0306c2 = c0306c;
        if (c0494b2 == null) {
            c0494b = new C0494b();
            AbstractC0345a.f4745c = c0494b;
        } else {
            c0494b = c0494b2;
        }
        M0.k layoutDirection = cVar.f4193d.getLayoutDirection();
        Bitmap bitmap2 = c0310g2.f4523a;
        long N3 = l.N(bitmap2.getWidth(), bitmap2.getHeight());
        C0493a c0493a = c0494b.f5602d;
        M0.b bVar = c0493a.f5598a;
        M0.k kVar = c0493a.f5599b;
        Z.r rVar = c0493a.f5600c;
        long j4 = c0493a.f5601d;
        c0493a.f5598a = cVar;
        c0493a.f5599b = layoutDirection;
        c0493a.f5600c = c0306c2;
        c0493a.f5601d = N3;
        c0306c2.g();
        C0494b c0494b3 = c0494b;
        c0494b3.B(C0323u.f4542b, 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(c0494b3.h(), 0L) : c0494b.h(), 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
        c0494b3.B(K.d(4278190080L), 0L, (r17 & 4) != 0 ? InterfaceC0496d.o0(c0494b3.h(), 0L) : l.N(f4, f4), 1.0f, C0499g.f5607a, null, (r17 & 64) != 0 ? 3 : 0);
        r0.V(K.d(4278190080L), f4, (r18 & 4) != 0 ? c0494b.w() : AbstractC0345a.c(f4, f4), 1.0f, C0499g.f5607a, null, 3);
        c0306c2.b();
        c0493a.f5598a = bVar;
        c0493a.f5599b = kVar;
        c0493a.f5600c = rVar;
        c0493a.f5601d = j4;
        return c0310g2;
    }

    public static Parcelable u(Parcel parcel, int i2, Parcelable.Creator creator) {
        int P3 = P(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (P3 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + P3);
        return parcelable;
    }

    public static String v(Parcel parcel, int i2) {
        int P3 = P(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (P3 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + P3);
        return readString;
    }

    public static Object[] w(Parcel parcel, int i2, Parcelable.Creator creator) {
        int P3 = P(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (P3 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + P3);
        return createTypedArray;
    }

    public static void y(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new I1.b(AbstractC0017m.g(i2, "Overread allowed size end="), parcel);
        }
    }

    public static final boolean z(int i2, int i4) {
        return i2 == i4;
    }

    public abstract void K(Throwable th);

    public abstract void L(Y0.b bVar);

    public abstract void x(SerialDescriptor serialDescriptor, int i2, Object obj);
}
