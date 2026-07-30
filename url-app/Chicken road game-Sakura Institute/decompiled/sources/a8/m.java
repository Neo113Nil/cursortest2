package a8;

import a0.s0;
import a0.u;
import a2.h0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.c1;
import androidx.lifecycle.w0;
import d0.d3;
import d0.k3;
import g0.k1;
import g0.p;
import g0.p1;
import g0.t0;
import g0.z0;
import g4.b0;
import g4.d0;
import g4.g0;
import g4.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import l.i0;
import l1.t;
import p2.q;
import p2.r;
import p2.s;
import r6.w;
import r6.y;
import s1.f1;
import t5.v;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: b, reason: collision with root package name */
    public static f1.f f562b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f563c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f564d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f565e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f566f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f567a;

    public /* synthetic */ m(int i7) {
        this.f567a = i7;
    }

    public static h6.d A(h6.d dVar) {
        h6.d intercepted;
        r6.k.f(dVar, "<this>");
        j6.c cVar = dVar instanceof j6.c ? (j6.c) dVar : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? dVar : intercepted;
    }

    public static boolean B(int i7) {
        int type = Character.getType(i7);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static boolean C(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f563c == null) {
            f563c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f563c.booleanValue();
        if (f564d == null) {
            f564d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (!f564d.booleanValue()) {
            return false;
        }
        int i7 = Build.VERSION.SDK_INT;
        return i7 < 26 || i7 >= 30;
    }

    public static final float D(float f9, float f10, float f11) {
        return (f11 * f10) + ((1 - f11) * f9);
    }

    public static final int E(float f9, int i7, int i8) {
        return i7 + ((int) Math.round((i8 - i7) * f9));
    }

    public static final void H(float[] fArr, float[] fArr2, int i7, float[] fArr3) {
        if (i7 == 0) {
            a.a.L("At least one point must be provided");
            throw null;
        }
        int i8 = 2 >= i7 ? i7 - 1 : 2;
        int i9 = i8 + 1;
        float[][] fArr4 = new float[i9][];
        for (int i10 = 0; i10 < i9; i10++) {
            fArr4[i10] = new float[i7];
        }
        for (int i11 = 0; i11 < i7; i11++) {
            fArr4[0][i11] = 1.0f;
            for (int i12 = 1; i12 < i9; i12++) {
                fArr4[i12][i11] = fArr4[i12 - 1][i11] * fArr[i11];
            }
        }
        float[][] fArr5 = new float[i9][];
        for (int i13 = 0; i13 < i9; i13++) {
            fArr5[i13] = new float[i7];
        }
        float[][] fArr6 = new float[i9][];
        for (int i14 = 0; i14 < i9; i14++) {
            fArr6[i14] = new float[i9];
        }
        int i15 = 0;
        while (i15 < i9) {
            float[] fArr7 = fArr5[i15];
            float[] fArr8 = fArr4[i15];
            r6.k.f(fArr8, "<this>");
            r6.k.f(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i7);
            for (int i16 = 0; i16 < i15; i16++) {
                float[] fArr9 = fArr5[i16];
                float t2 = t(fArr7, fArr9);
                for (int i17 = 0; i17 < i7; i17++) {
                    fArr7[i17] = fArr7[i17] - (fArr9[i17] * t2);
                }
            }
            float sqrt = (float) Math.sqrt(t(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f9 = 1.0f / sqrt;
            for (int i18 = 0; i18 < i7; i18++) {
                fArr7[i18] = fArr7[i18] * f9;
            }
            float[] fArr10 = fArr6[i15];
            int i19 = 0;
            while (i19 < i9) {
                fArr10[i19] = i19 < i15 ? 0.0f : t(fArr7, fArr4[i19]);
                i19++;
            }
            i15++;
        }
        for (int i20 = i8; -1 < i20; i20--) {
            float t8 = t(fArr5[i20], fArr2);
            float[] fArr11 = fArr6[i20];
            int i21 = i20 + 1;
            if (i21 <= i8) {
                int i22 = i8;
                while (true) {
                    t8 -= fArr11[i22] * fArr3[i22];
                    if (i22 != i21) {
                        i22--;
                    }
                }
            }
            fArr3[i20] = t8 / fArr11[i20];
        }
    }

    public static final long I(long j8) {
        return (Math.round(y0.c.e(j8)) & 4294967295L) | (Math.round(y0.c.d(j8)) << 32);
    }

    public static final long L(long j8, float f9) {
        return v1.g.a(Math.max(0.0f, y0.a.b(j8) - f9), Math.max(0.0f, y0.a.c(j8) - f9));
    }

    public static String M(int i7) {
        return i7 == 0 ? "Unspecified" : i7 == 1 ? "Text" : i7 == 2 ? "Ascii" : i7 == 3 ? "Number" : i7 == 4 ? "Phone" : i7 == 5 ? "Uri" : i7 == 6 ? "Email" : i7 == 7 ? "Password" : i7 == 8 ? "NumberPassword" : i7 == 9 ? "Decimal" : "Invalid";
    }

    public static Object N(q6.e eVar, Object obj, h6.d dVar) {
        r6.k.f(eVar, "<this>");
        h6.i context = dVar.getContext();
        Object dVar2 = context == h6.j.f4661f ? new i6.d(dVar) : new i6.e(dVar, context);
        y.d(2, eVar);
        return eVar.d(obj, dVar2);
    }

    public static void O(Parcel parcel, int i7, Parcelable parcelable, int i8) {
        if (parcelable == null) {
            return;
        }
        int R = R(parcel, i7);
        parcelable.writeToParcel(parcel, i8);
        S(parcel, R);
    }

    public static void P(Parcel parcel, int i7, String str) {
        if (str == null) {
            return;
        }
        int R = R(parcel, i7);
        parcel.writeString(str);
        S(parcel, R);
    }

    public static void Q(Parcel parcel, int i7, Parcelable[] parcelableArr, int i8) {
        if (parcelableArr == null) {
            return;
        }
        int R = R(parcel, i7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i8);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        S(parcel, R);
    }

    public static int R(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void S(Parcel parcel, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }

    public static void T(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    public static final void a(q6.a aVar, r rVar, o0.a aVar2, p pVar, int i7) {
        int i8;
        int i9;
        m2.k kVar;
        pVar.S(-2032877254);
        if ((i7 & 6) == 0) {
            i8 = (pVar.h(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.f(rVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= pVar.h(aVar2) ? 256 : 128;
        }
        int i10 = i8;
        if ((i10 & 147) == 146 && pVar.x()) {
            pVar.L();
        } else {
            View view = (View) pVar.k(AndroidCompositionLocals_androidKt.f743f);
            m2.b bVar = (m2.b) pVar.k(f1.f8217f);
            m2.k kVar2 = (m2.k) pVar.k(f1.f8223l);
            g0.n L = g0.d.L(pVar);
            z0 M = g0.d.M(aVar2, pVar);
            UUID uuid = (UUID) a.a.E(new Object[0], null, p2.d.f7125h, pVar, 3072, 6);
            boolean f9 = pVar.f(view) | pVar.f(bVar);
            Object G = pVar.G();
            Object obj = g0.l.f3784a;
            if (f9 || G == obj) {
                i9 = i10;
                kVar = kVar2;
                s sVar = new s(aVar, rVar, view, kVar, bVar, uuid);
                o0.a aVar3 = new o0.a(488261145, new p2.c(M, 1), true);
                q qVar = sVar.f7169l;
                qVar.setParentCompositionContext(L);
                qVar.f7160o.setValue(aVar3);
                qVar.f7162q = true;
                if (qVar.f8122i == null && !qVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                qVar.c();
                pVar.a0(sVar);
                G = sVar;
            } else {
                i9 = i10;
                kVar = kVar2;
            }
            s sVar2 = (s) G;
            boolean h3 = pVar.h(sVar2);
            Object G2 = pVar.G();
            if (h3 || G2 == obj) {
                G2 = new p2.a(sVar2, 0);
                pVar.a0(G2);
            }
            g0.d.d(sVar2, (q6.c) G2, pVar);
            boolean h8 = pVar.h(sVar2) | ((i9 & 14) == 4) | ((i9 & 112) == 32) | pVar.f(kVar);
            Object G3 = pVar.G();
            if (h8 || G3 == obj) {
                Object i0Var = new i0(sVar2, aVar, rVar, kVar, 1);
                pVar.a0(i0Var);
                G3 = i0Var;
            }
            g0.d.g((q6.a) G3, pVar);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new a0.a(aVar, rVar, aVar2, i7, 6);
        }
    }

    public static final void b(int i7, p pVar) {
        z0 z0Var;
        t0 t0Var = t0.f3903k;
        pVar.S(-1080491263);
        if (i7 == 0 && pVar.x()) {
            pVar.L();
        } else {
            e4.a j8 = a.a.j(pVar);
            pVar.R(1729797275);
            c1 a3 = r3.b.a(pVar);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            w0 Q = a.a.Q(w.a(j0.class), a3, j8, a3 instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) a3).d() : q3.a.f7511b, pVar);
            pVar.p(false);
            j0 j0Var = (j0) Q;
            z0 P = j1.c.P(j0Var.f4323c, pVar);
            pVar.Q(445081134);
            Object G = pVar.G();
            t0 t0Var2 = g0.l.f3784a;
            if (G == t0Var2) {
                G = g0.d.J(Boolean.FALSE, t0Var);
                pVar.a0(G);
            }
            z0 z0Var2 = (z0) G;
            pVar.p(false);
            k3.a(null, o0.f.b(258167493, new g4.e(2, j0Var), pVar), null, null, o0.f.b(1642261768, new d0(z0Var2, 0), pVar), 0, 0L, 0L, null, o0.f.b(-558348336, new g4.d(P, 2, j0Var), pVar), pVar, 805330992, 493);
            if (((Boolean) z0Var2.getValue()).booleanValue()) {
                pVar.Q(445156971);
                Object G2 = pVar.G();
                if (G2 == t0Var2) {
                    G2 = g0.d.J("", t0Var);
                    pVar.a0(G2);
                }
                z0 z0Var3 = (z0) G2;
                pVar.p(false);
                pVar.Q(445159646);
                Object G3 = pVar.G();
                if (G3 == t0Var2) {
                    z0Var = z0Var2;
                    G3 = new b0(z0Var, 0);
                    pVar.a0(G3);
                } else {
                    z0Var = z0Var2;
                }
                pVar.p(false);
                d3.a((q6.a) G3, o0.f.b(1417840084, new g0(j0Var, z0Var3, z0Var), pVar), null, o0.f.b(-1487833198, new d0(z0Var, 1), pVar), g4.w.f4432h, o0.f.b(596107823, new d0(z0Var3, 2), pVar), null, 0L, 0L, 0L, 0L, 0.0f, null, pVar, 1772598);
            }
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new c7.q(i7, 5);
        }
    }

    public static final long c(int i7, int i8) {
        return (i8 & 4294967295L) | (i7 << 32);
    }

    public static t5.s d(Object obj, t5.s sVar) {
        HashMap hashMap;
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey(".priority")) {
                    sVar = j1.c.j0(map.get(".priority"));
                }
                if (map.containsKey(".value")) {
                    obj = map.get(".value");
                }
            }
            if (obj == null) {
                return t5.k.f8908j;
            }
            if (obj instanceof String) {
                return new v((String) obj, sVar);
            }
            if (obj instanceof Long) {
                return new t5.p((Long) obj, sVar);
            }
            if (obj instanceof Integer) {
                return new t5.p(Long.valueOf(((Integer) obj).intValue()), sVar);
            }
            if (obj instanceof Double) {
                return new t5.j((Double) obj, sVar);
            }
            if (obj instanceof Boolean) {
                return new t5.a((Boolean) obj, sVar);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new g5.b("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".sv")) {
                    return new t5.i(map2, sVar);
                }
                hashMap = new HashMap(map2.size());
                for (String str : map2.keySet()) {
                    if (!str.startsWith(".")) {
                        t5.s d8 = d(map2.get(str), t5.k.f8908j);
                        if (!d8.isEmpty()) {
                            hashMap.put(t5.c.e(str), d8);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                hashMap = new HashMap(list.size());
                for (int i7 = 0; i7 < list.size(); i7++) {
                    String str2 = "" + i7;
                    t5.s d9 = d(list.get(i7), t5.k.f8908j);
                    if (!d9.isEmpty()) {
                        hashMap.put(t5.c.e(str2), d9);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                return t5.k.f8908j;
            }
            g8.h hVar = t5.f.f8893i;
            return new t5.f(hashMap.size() < 25 ? i5.b.C(new ArrayList(hashMap.keySet()), hashMap, hVar) : g3.k.o(new ArrayList(hashMap.keySet()), hashMap, hVar), sVar);
        } catch (ClassCastException e9) {
            throw new g5.b("Failed to parse node", e9);
        }
    }

    public static final void e(s0.o oVar, o0.a aVar, p pVar, int i7) {
        int i8;
        pVar.S(-1177876616);
        if ((i7 & 6) == 0) {
            i8 = (pVar.f(oVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= pVar.h(aVar) ? 32 : 16;
        }
        if ((i8 & 19) == 18 && pVar.x()) {
            pVar.L();
        } else {
            p2.e eVar = p2.e.f7129b;
            int i9 = pVar.P;
            k1 m8 = pVar.m();
            s0.o c4 = s0.a.c(pVar, oVar);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            int i10 = (((((i8 << 3) & 112) | (((i8 >> 3) & 14) | 384)) << 6) & 896) | 6;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, eVar, r1.i.f7784e);
            g0.d.Q(pVar, m8, r1.i.f7783d);
            r1.h hVar = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i9))) {
                a0.m.q(i9, pVar, i9, hVar);
            }
            g0.d.Q(pVar, c4, r1.i.f7782c);
            aVar.d(pVar, Integer.valueOf((i10 >> 6) & 14));
            pVar.p(true);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new g0.v(i7, 4, oVar, aVar);
        }
    }

    public static final void f(r.h hVar, Object obj, int i7, Object obj2, p pVar, int i8) {
        int i9;
        pVar.S(1439843069);
        if ((i8 & 6) == 0) {
            i9 = (pVar.f(hVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= pVar.f(obj) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= pVar.d(i7) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i9 |= pVar.f(obj2) ? 2048 : 1024;
        }
        if ((i9 & 1171) == 1170 && pVar.x()) {
            pVar.L();
        } else {
            ((p0.c) obj).e(obj2, o0.f.b(980966366, new r.g(i7, obj2, hVar), pVar), pVar, 48);
        }
        p1 r8 = pVar.r();
        if (r8 != null) {
            r8.f3853d = new s.q(hVar, obj, i7, obj2, i8);
        }
    }

    public static final a0.r g(s0 s0Var, a0.k kVar) {
        int e9 = s0Var.e();
        a0.p pVar = (a0.p) s0Var.f138d;
        boolean z8 = e9 == 1;
        return new a0.r(j(pVar, z8, true, kVar), j(pVar, z8, false, kVar), z8);
    }

    public static final a0.q h(s0 s0Var, a0.p pVar, a0.q qVar) {
        int i7 = pVar.f119c;
        int i8 = pVar.f118b;
        boolean z8 = s0Var.f136b;
        int i9 = z8 ? i8 : i7;
        h0 h0Var = (h0) pVar.f121e;
        int i10 = pVar.f120d;
        a0.v vVar = new a0.v(pVar, i9);
        d6.h hVar = d6.h.f2616g;
        d6.g c4 = d6.a.c(hVar, vVar);
        d6.g c6 = d6.a.c(hVar, new u(pVar, i9, z8 ? i7 : i8, s0Var, c4));
        if (1 != qVar.f126c) {
            return (a0.q) c6.getValue();
        }
        if (i9 == i10) {
            return qVar;
        }
        if (((Number) c4.getValue()).intValue() != h0Var.e(i10)) {
            return (a0.q) c6.getValue();
        }
        int i11 = qVar.f125b;
        long k8 = h0Var.k(i11);
        if (i10 != -1) {
            if (i9 != i10) {
                if (!((i8 >= i7 && i8 > i7) ^ z8)) {
                }
            }
            return pVar.a(i9);
        }
        int i12 = a2.j0.f407c;
        return (i11 == ((int) (k8 >> 32)) || i11 == ((int) (4294967295L & k8))) ? (a0.q) c6.getValue() : pVar.a(i9);
    }

    public static final void i(m1.c cVar, l1.v vVar) {
        m1.b bVar = cVar.f6304b;
        m1.b bVar2 = cVar.f6303a;
        boolean a3 = t.a(vVar);
        long j8 = vVar.f5831b;
        if (a3) {
            e6.k.c0(0, r4.length, null, bVar2.f6298b);
            bVar2.f6299c = 0;
            e6.k.c0(0, r4.length, null, bVar.f6298b);
            bVar.f6299c = 0;
            cVar.f6305c = 0L;
        }
        if (!t.c(vVar)) {
            List list = vVar.f5840k;
            if (list == null) {
                list = e6.u.f2826f;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                l1.d dVar = (l1.d) list.get(i7);
                long j9 = dVar.f5785a;
                long j10 = dVar.f5787c;
                bVar2.a(j9, y0.c.d(j10));
                bVar.a(j9, y0.c.e(j10));
            }
            long j11 = vVar.f5841l;
            bVar2.a(j8, y0.c.d(j11));
            bVar.a(j8, y0.c.e(j11));
        }
        if (t.c(vVar) && j8 - cVar.f6305c > 40) {
            e6.k.c0(0, r1.length, null, bVar2.f6298b);
            bVar2.f6299c = 0;
            e6.k.c0(0, r1.length, null, bVar.f6298b);
            bVar.f6299c = 0;
            cVar.f6305c = 0L;
        }
        cVar.f6305c = j8;
    }

    public static final a0.q j(a0.p pVar, boolean z8, boolean z9, a0.k kVar) {
        long j8;
        long a3 = kVar.a(pVar, z9 ? pVar.f118b : pVar.f119c);
        if (z8 ^ z9) {
            int i7 = a2.j0.f407c;
            j8 = a3 >> 32;
        } else {
            int i8 = a2.j0.f407c;
            j8 = 4294967295L & a3;
        }
        return pVar.a((int) j8);
    }

    public static f6.j k(f6.j jVar) {
        f6.g gVar = jVar.f3436f;
        gVar.b();
        return gVar.f3426n > 0 ? jVar : f6.j.f3435g;
    }

    public static void l(long j8, f8.f fVar, int i7, ArrayList arrayList, int i8, int i9, ArrayList arrayList2) {
        int i10;
        int i11;
        ArrayList arrayList3;
        long j9;
        int i12;
        int i13 = i7;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i8 >= i9) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i14 = i8; i14 < i9; i14++) {
            if (((f8.i) arrayList4.get(i14)).e() < i13) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        f8.i iVar = (f8.i) arrayList.get(i8);
        f8.i iVar2 = (f8.i) arrayList4.get(i9 - 1);
        if (i13 == iVar.e()) {
            int intValue = ((Number) arrayList5.get(i8)).intValue();
            int i15 = i8 + 1;
            f8.i iVar3 = (f8.i) arrayList4.get(i15);
            i10 = i15;
            i11 = intValue;
            iVar = iVar3;
        } else {
            i10 = i8;
            i11 = -1;
        }
        if (iVar.p(i13) == iVar2.p(i13)) {
            int min = Math.min(iVar.e(), iVar2.e());
            int i16 = 0;
            for (int i17 = i13; i17 < min && iVar.p(i17) == iVar2.p(i17); i17++) {
                i16++;
            }
            long j10 = 4;
            long j11 = (fVar.f3598g / j10) + j8 + 2 + i16 + 1;
            fVar.U(-i16);
            fVar.U(i11);
            int i18 = i13 + i16;
            while (i13 < i18) {
                fVar.U(iVar.p(i13) & 255);
                i13++;
            }
            if (i10 + 1 == i9) {
                if (i18 != ((f8.i) arrayList4.get(i10)).e()) {
                    throw new IllegalStateException("Check failed.");
                }
                fVar.U(((Number) arrayList5.get(i10)).intValue());
                return;
            } else {
                f8.f fVar2 = new f8.f();
                fVar.U(((int) ((fVar2.f3598g / j10) + j11)) * (-1));
                l(j11, fVar2, i18, arrayList4, i10, i9, arrayList5);
                fVar.N(fVar2);
                return;
            }
        }
        int i19 = 1;
        for (int i20 = i10 + 1; i20 < i9; i20++) {
            if (((f8.i) arrayList4.get(i20 - 1)).p(i13) != ((f8.i) arrayList4.get(i20)).p(i13)) {
                i19++;
            }
        }
        long j12 = 4;
        long j13 = (fVar.f3598g / j12) + j8 + 2 + (i19 * 2);
        fVar.U(i19);
        fVar.U(i11);
        for (int i21 = i10; i21 < i9; i21++) {
            int p6 = ((f8.i) arrayList4.get(i21)).p(i13);
            if (i21 == i10 || p6 != ((f8.i) arrayList4.get(i21 - 1)).p(i13)) {
                fVar.U(p6 & 255);
            }
        }
        f8.f fVar3 = new f8.f();
        int i22 = i10;
        while (i22 < i9) {
            byte p8 = ((f8.i) arrayList4.get(i22)).p(i13);
            int i23 = i22 + 1;
            int i24 = i23;
            while (true) {
                if (i24 >= i9) {
                    i24 = i9;
                    break;
                } else if (p8 != ((f8.i) arrayList4.get(i24)).p(i13)) {
                    break;
                } else {
                    i24++;
                }
            }
            if (i23 == i24 && i13 + 1 == ((f8.i) arrayList4.get(i22)).e()) {
                fVar.U(((Number) arrayList5.get(i22)).intValue());
                arrayList3 = arrayList5;
                j9 = j13;
                i12 = i24;
            } else {
                fVar.U(((int) ((fVar3.f3598g / j12) + j13)) * (-1));
                arrayList3 = arrayList5;
                j9 = j13;
                i12 = i24;
                l(j9, fVar3, i13 + 1, arrayList, i22, i12, arrayList3);
                arrayList4 = arrayList;
            }
            j13 = j9;
            i22 = i12;
            arrayList5 = arrayList3;
        }
        fVar.N(fVar3);
    }

    public static final a0.q m(a0.q qVar, a0.p pVar, int i7) {
        return new a0.q(((h0) pVar.f121e).a(i7), i7, qVar.f126c);
    }

    public static void n(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int o(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : s2.n.a(new s2.o(context).f8519a) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static final double p(double d8, a7.c cVar, a7.c cVar2) {
        r6.k.f(cVar2, "targetUnit");
        long convert = cVar2.f536f.convert(1L, cVar.f536f);
        return convert > 0 ? d8 * convert : d8 / r8.convert(1L, r9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h6.d q(h6.d dVar, h6.d dVar2, q6.e eVar) {
        r6.k.f(eVar, "<this>");
        if (eVar instanceof j6.a) {
            return ((j6.a) eVar).create(dVar, dVar2);
        }
        h6.i context = dVar2.getContext();
        return context == h6.j.f4661f ? new i6.b(dVar2, dVar, eVar) : new i6.c(dVar2, context, eVar, dVar);
    }

    public static final f2.e r(Context context) {
        j4.i iVar = new j4.i(6);
        context.getApplicationContext();
        return new f2.e(iVar, new f2.a(Build.VERSION.SDK_INT >= 31 ? f2.l.f3281a.a(context) : 0));
    }

    public static w0 s(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            r6.k.e(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (w0) newInstance;
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        }
    }

    public static final float t(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f9 = 0.0f;
        for (int i7 = 0; i7 < length; i7++) {
            f9 += fArr[i7] * fArr2[i7];
        }
        return f9;
    }

    public static final float u(float f9) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f9) & 8589934591L) / 3)) + 709952852);
        float f10 = intBitsToFloat - ((intBitsToFloat - (f9 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f10 - ((f10 - (f9 / (f10 * f10))) * 0.33333334f);
    }

    public static final int v(int i7, List list) {
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            a2.r rVar = (a2.r) list.get(i9);
            char c4 = rVar.f441b > i7 ? (char) 1 : rVar.f442c <= i7 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i8 = i9 + 1;
            } else {
                if (c4 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final int w(int i7, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            a2.r rVar = (a2.r) arrayList.get(i9);
            char c4 = rVar.f443d > i7 ? (char) 1 : rVar.f444e <= i7 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i8 = i9 + 1;
            } else {
                if (c4 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final int x(ArrayList arrayList, float f9) {
        if (f9 <= 0.0f) {
            return 0;
        }
        if (f9 >= ((a2.r) e6.l.n0(arrayList)).f446g) {
            return e6.m.W(arrayList);
        }
        int size = arrayList.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            a2.r rVar = (a2.r) arrayList.get(i8);
            char c4 = rVar.f445f > f9 ? (char) 1 : rVar.f446g <= f9 ? (char) 65535 : (char) 0;
            if (c4 < 0) {
                i7 = i8 + 1;
            } else {
                if (c4 <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static final void y(ArrayList arrayList, long j8, q6.c cVar) {
        int size = arrayList.size();
        for (int v5 = v(a2.j0.e(j8), arrayList); v5 < size; v5++) {
            a2.r rVar = (a2.r) arrayList.get(v5);
            if (rVar.f441b >= a2.j0.d(j8)) {
                return;
            }
            if (rVar.f441b != rVar.f442c) {
                cVar.f(rVar);
            }
        }
    }

    public static s7.n z(String str) {
        r6.k.f(str, "<this>");
        Matcher matcher = s7.n.f8617c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String group = matcher.group(1);
        r6.k.e(group, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        r6.k.e(locale, "US");
        r6.k.e(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String group2 = matcher.group(2);
        r6.k.e(group2, "typeSubtype.group(2)");
        r6.k.e(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = s7.n.f8618d.matcher(str);
        int end = matcher.end();
        while (end < str.length()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(end);
                r6.k.e(substring, "this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String group3 = matcher2.group(1);
            if (group3 == null) {
                end = matcher2.end();
            } else {
                String group4 = matcher2.group(2);
                if (group4 == null) {
                    group4 = matcher2.group(3);
                } else if (z6.o.v(group4, "'") && z6.o.o(false, group4, "'") && group4.length() > 2) {
                    group4 = group4.substring(1, group4.length() - 1);
                    r6.k.e(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(group3);
                arrayList.add(group4);
                end = matcher2.end();
            }
        }
        return new s7.n(str, (String[]) arrayList.toArray(new String[0]));
    }

    public abstract void F(Throwable th);

    public abstract void G(g3.k kVar);

    public abstract void K(boolean z8);

    public int hashCode() {
        switch (this.f567a) {
            case 20:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f567a) {
            case 20:
                String b9 = w.a(getClass()).b();
                r6.k.c(b9);
                return b9;
            default:
                return super.toString();
        }
    }

    public void J(boolean z8) {
    }
}
