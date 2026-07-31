package e2;

import A2.g;
import B0.C;
import B0.C0007d;
import D1.C0014b;
import E.w;
import F.C0060q;
import F.V0;
import H2.AbstractC0080b;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0116q0;
import I.C0119s0;
import I.C0125v0;
import I.C0130y;
import I.InterfaceC0088c0;
import I.InterfaceC0110n0;
import I.O0;
import I.R0;
import I.U;
import I.X;
import I.X0;
import I2.l;
import L1.z;
import M0.j;
import M1.A;
import M1.B;
import Q.f;
import U.k;
import U.m;
import Z1.i;
import Z1.u;
import a.AbstractC0157a;
import android.database.Cursor;
import android.os.Build;
import android.view.View;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C0238x;
import androidx.lifecycle.EnumC0230o;
import androidx.lifecycle.InterfaceC0225j;
import androidx.lifecycle.InterfaceC0236v;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import b0.C0281n;
import b0.InterfaceC0251B;
import f.AbstractC0382a;
import f2.InterfaceC0388c;
import g0.AbstractC0393b;
import h.AbstractC0416e;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import i2.AbstractC0473b;
import i2.C0472a;
import i2.EnumC0474c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import m1.AbstractC0625e;
import m1.C0623c;
import n.C0644O;
import n.C0645P;
import n0.C0672b;
import n0.s;
import n1.C0674a;
import n2.C0676A;
import o.C0737m;
import o.J;
import o1.AbstractC0751b;
import q1.C0784h;
import q1.F;
import q1.G;
import q1.H;
import r.C0797I;
import r.C0817n;
import r.InterfaceC0796H;
import r.InterfaceC0808e;
import r.InterfaceC0811h;
import r0.C0836i;
import r1.C0849a;
import s.AbstractC0883z;
import s.C0859b;
import s.C0880w;
import t.C0890A;
import t.y;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.C0900h;
import t0.C0901i;
import t0.C0906n;
import t0.D;
import t0.InterfaceC0902j;
import t0.n0;
import u.C0921C;
import u.C0922D;
import u.C0941i;
import u.InterfaceC0953v;
import u0.AbstractC0963b0;
import v1.InterfaceC1018a;
import y.C1058a;
import y.C1060c;
import z.C1066b;
import z0.n;

/* renamed from: e2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0381e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4776a = 18;

    public static final int A(int i3, Object obj, InterfaceC0953v interfaceC0953v) {
        if (obj != null && interfaceC0953v.a() != 0) {
            if (i3 < interfaceC0953v.a() && obj.equals(interfaceC0953v.c(i3))) {
                return i3;
            }
            int b2 = interfaceC0953v.b(obj);
            if (b2 != -1) {
                return b2;
            }
        }
        return i3;
    }

    public static C1066b B(C1066b c1066b, j jVar, C c3, M0.b bVar, F0.e eVar) {
        if (c1066b != null && jVar == c1066b.f8868a && i.a(c3, c1066b.f8869b) && bVar.a() == c1066b.f8870c.f2761d && eVar == c1066b.f8871d) {
            return c1066b;
        }
        C1066b c1066b2 = C1066b.f8867h;
        if (c1066b2 != null && jVar == c1066b2.f8868a && i.a(c3, c1066b2.f8869b) && bVar.a() == c1066b2.f8870c.f2761d && eVar == c1066b2.f8871d) {
            return c1066b2;
        }
        C1066b c1066b3 = new C1066b(jVar, l.O(c3, jVar), new M0.c(bVar.a(), bVar.p()), eVar);
        C1066b.f8867h = c1066b3;
        return c1066b3;
    }

    public static M.e C(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new M.e(w0.e.a(view));
        }
        return null;
    }

    public static Set D() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final n0 E(D d3) {
        k kVar = (k) d3.f7735x.f2356f;
        Object obj = null;
        if ((kVar.f3306g & 8) != 0) {
            loop0: while (true) {
                if (kVar == null) {
                    break;
                }
                if ((kVar.f3305f & 8) != 0) {
                    k kVar2 = kVar;
                    K.d dVar = null;
                    while (kVar2 != null) {
                        if (kVar2 instanceof n0) {
                            if (((n0) kVar2).O()) {
                                obj = kVar2;
                                break loop0;
                            }
                        } else if ((kVar2.f3305f & 8) != 0 && (kVar2 instanceof AbstractC0905m)) {
                            int i3 = 0;
                            for (k kVar3 = ((AbstractC0905m) kVar2).f7937r; kVar3 != null; kVar3 = kVar3.f3308i) {
                                if ((kVar3.f3305f & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        kVar2 = kVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new K.d(new k[16]);
                                        }
                                        if (kVar2 != null) {
                                            dVar.b(kVar2);
                                            kVar2 = null;
                                        }
                                        dVar.b(kVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        kVar2 = AbstractC0898f.f(dVar);
                    }
                }
                if ((kVar.f3306g & 8) == 0) {
                    break;
                }
                kVar = kVar.f3308i;
            }
        }
        return (n0) obj;
    }

    public static boolean F(char c3) {
        return Character.isWhitespace(c3) || Character.isSpaceChar(c3);
    }

    public static final G G(Y1.c cVar) {
        H h3 = new H();
        cVar.j(h3);
        boolean z3 = h3.f6868b;
        F f3 = h3.f6867a;
        f3.f6853a = z3;
        f3.f6854b = h3.f6869c;
        int i3 = h3.f6870d;
        boolean z4 = h3.f6871e;
        f3.f6855c = i3;
        f3.f6856d = false;
        f3.f6857e = z4;
        return new G(f3.f6853a, f3.f6854b, f3.f6855c, f3.f6856d, f3.f6857e, f3.f6858f, f3.f6859g);
    }

    public static final long H(String str) {
        int length = str.length();
        int i3 = (length <= 0 || !AbstractC0447i.k0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i3 > 16) {
            Iterable c0380d = new C0380d(i3, AbstractC0447i.o0(str), 1);
            if (!(c0380d instanceof Collection) || !((Collection) c0380d).isEmpty()) {
                Iterator it = c0380d.iterator();
                while (((C0379c) it).f4773f) {
                    char charAt = str.charAt(((A) it).a());
                    if ('0' <= charAt && charAt < ':') {
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (AbstractC0454p.i0(str, "+")) {
            str = AbstractC0447i.m0(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final void I(float[] fArr, float[] fArr2, int i3, float[] fArr3) {
        if (i3 == 0) {
            M("At least one point must be provided");
            throw null;
        }
        int i4 = 2 >= i3 ? i3 - 1 : 2;
        int i5 = i4 + 1;
        float[][] fArr4 = new float[i5][];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr4[i6] = new float[i3];
        }
        for (int i7 = 0; i7 < i3; i7++) {
            fArr4[0][i7] = 1.0f;
            for (int i8 = 1; i8 < i5; i8++) {
                fArr4[i8][i7] = fArr4[i8 - 1][i7] * fArr[i7];
            }
        }
        float[][] fArr5 = new float[i5][];
        for (int i9 = 0; i9 < i5; i9++) {
            fArr5[i9] = new float[i3];
        }
        float[][] fArr6 = new float[i5][];
        for (int i10 = 0; i10 < i5; i10++) {
            fArr6[i10] = new float[i5];
        }
        int i11 = 0;
        while (i11 < i5) {
            float[] fArr7 = fArr5[i11];
            float[] fArr8 = fArr4[i11];
            i.f(fArr8, "<this>");
            i.f(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i3);
            for (int i12 = 0; i12 < i11; i12++) {
                float[] fArr9 = fArr5[i12];
                float w3 = w(fArr7, fArr9);
                for (int i13 = 0; i13 < i3; i13++) {
                    fArr7[i13] = fArr7[i13] - (fArr9[i13] * w3);
                }
            }
            float sqrt = (float) Math.sqrt(w(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f3 = 1.0f / sqrt;
            for (int i14 = 0; i14 < i3; i14++) {
                fArr7[i14] = fArr7[i14] * f3;
            }
            float[] fArr10 = fArr6[i11];
            int i15 = 0;
            while (i15 < i5) {
                fArr10[i15] = i15 < i11 ? 0.0f : w(fArr7, fArr4[i15]);
                i15++;
            }
            i11++;
        }
        for (int i16 = i4; -1 < i16; i16--) {
            float w4 = w(fArr5[i16], fArr2);
            float[] fArr11 = fArr6[i16];
            int i17 = i16 + 1;
            if (i17 <= i4) {
                int i18 = i4;
                while (true) {
                    w4 -= fArr11[i18] * fArr3[i18];
                    if (i18 != i17) {
                        i18--;
                    }
                }
            }
            fArr3[i16] = w4 / fArr11[i16];
        }
    }

    public static final List J(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        N1.c cVar = new N1.c(10);
        while (cursor.moveToNext()) {
            int i3 = cursor.getInt(columnIndex);
            int i4 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            i.e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            i.e(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new t1.c(i3, i4, string, string2));
        }
        N1.c k3 = AbstractC0157a.k(cVar);
        i.f(k3, "<this>");
        if (k3.b() <= 1) {
            return M1.l.C0(k3);
        }
        Object[] array = k3.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return M1.k.T(array);
    }

    public static final t1.d K(InterfaceC1018a interfaceC1018a, String str, boolean z3) {
        Cursor K3 = interfaceC1018a.K("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = K3.getColumnIndex("seqno");
            int columnIndex2 = K3.getColumnIndex("cid");
            int columnIndex3 = K3.getColumnIndex("name");
            int columnIndex4 = K3.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (K3.moveToNext()) {
                    if (K3.getInt(columnIndex2) >= 0) {
                        int i3 = K3.getInt(columnIndex);
                        String string = K3.getString(columnIndex3);
                        String str2 = K3.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i3);
                        i.e(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i3), str2);
                    }
                }
                Collection values = treeMap.values();
                i.e(values, "columnsMap.values");
                List C02 = M1.l.C0(values);
                Collection values2 = treeMap2.values();
                i.e(values2, "ordersMap.values");
                t1.d dVar = new t1.d(str, z3, C02, M1.l.C0(values2));
                I2.d.u(K3, null);
                return dVar;
            }
            I2.d.u(K3, null);
            return null;
        } finally {
        }
    }

    public static C0378b L(C0380d c0380d, int i3) {
        i.f(c0380d, "<this>");
        boolean z3 = i3 > 0;
        Integer valueOf = Integer.valueOf(i3);
        if (z3) {
            if (c0380d.f4770f <= 0) {
                i3 = -i3;
            }
            return new C0378b(c0380d.f4768d, c0380d.f4769e, i3);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final void M(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void N(String str) {
        throw new IllegalStateException(str);
    }

    public static final void O(String str) {
        throw new IllegalStateException(str);
    }

    public static final long P(long j3, EnumC0474c enumC0474c) {
        i.f(enumC0474c, "unit");
        EnumC0474c enumC0474c2 = EnumC0474c.f5121e;
        i.f(enumC0474c2, "sourceUnit");
        TimeUnit timeUnit = enumC0474c.f5128d;
        TimeUnit timeUnit2 = enumC0474c2.f5128d;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) > j3 || j3 > convert) {
            EnumC0474c enumC0474c3 = EnumC0474c.f5122f;
            i.f(enumC0474c3, "targetUnit");
            return x(s(enumC0474c3.f5128d.convert(j3, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long convert2 = timeUnit2.convert(j3, timeUnit) << 1;
        int i3 = C0472a.f5118g;
        int i4 = AbstractC0473b.f5120a;
        return convert2;
    }

    public static C0380d Q(int i3, int i4) {
        if (i4 > Integer.MIN_VALUE) {
            return new C0380d(i3, i4 - 1, 1);
        }
        C0380d c0380d = C0380d.f4775g;
        return C0380d.f4775g;
    }

    public static final void a(String str, U.l lVar, C c3, Y1.c cVar, int i3, boolean z3, int i4, int i5, g gVar, C0113p c0113p, int i6) {
        int i7;
        g gVar2;
        C0113p c0113p2;
        U.l e3;
        c0113p.S(-1186827822);
        if ((i6 & 6) == 0) {
            i7 = (c0113p.f(str) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0113p.f(lVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0113p.f(c3) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0113p.h(cVar) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0113p.d(i3) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0113p.g(z3) ? 131072 : 65536;
        }
        if ((1572864 & i6) == 0) {
            i7 |= c0113p.d(i4) ? 1048576 : 524288;
        }
        if ((12582912 & i6) == 0) {
            i7 |= c0113p.d(i5) ? 8388608 : 4194304;
        }
        if (((i7 | 100663296) & 38347923) == 38347922 && c0113p.x()) {
            c0113p.L();
            gVar2 = gVar;
        } else {
            if (i5 <= 0 || i4 <= 0) {
                throw new IllegalArgumentException(("both minLines " + i5 + " and maxLines " + i4 + " must be greater than zero").toString());
            }
            if (i5 > i4) {
                throw new IllegalArgumentException(AbstractC0080b.g(i5, i4, "minLines ", " must be less than or equal to maxLines ").toString());
            }
            if (c0113p.k(A.b.f3a) != null) {
                throw new ClassCastException();
            }
            c0113p.Q(-1588686502);
            c0113p.p(false);
            gVar2 = null;
            if (cVar != null) {
                c0113p.Q(-1588564052);
                e3 = androidx.compose.ui.graphics.a.b(lVar, 0.0f, 0.0f, null, false, 131071).e(U.i.f3302a).e(new TextAnnotatedStringElement(new C0007d(str, null, null, null), c3, (F0.e) c0113p.k(AbstractC0963b0.f8299i), cVar, i3, z3, i4, i5, null));
                c0113p.p(false);
                c0113p2 = c0113p;
            } else {
                c0113p.Q(-1587866335);
                c0113p2 = c0113p;
                e3 = androidx.compose.ui.graphics.a.b(lVar, 0.0f, 0.0f, null, false, 131071).e(new TextStringSimpleElement(str, c3, (F0.e) c0113p.k(AbstractC0963b0.f8299i), i3, z3, i4, i5, null));
                c0113p2.p(false);
            }
            C1060c c1060c = C1060c.f8781a;
            int i8 = c0113p2.f2306P;
            U.l c4 = m.c(c0113p2, e3);
            InterfaceC0110n0 m3 = c0113p.m();
            InterfaceC0902j.f7933c.getClass();
            C0906n c0906n = C0901i.f7920b;
            c0113p.U();
            if (c0113p2.f2305O) {
                c0113p2.l(c0906n);
            } else {
                c0113p.d0();
            }
            C0089d.Q(c0113p2, C0901i.f7923e, c1060c);
            C0089d.Q(c0113p2, C0901i.f7922d, m3);
            C0089d.Q(c0113p2, C0901i.f7921c, c4);
            C0900h c0900h = C0901i.f7924f;
            if (c0113p2.f2305O || !i.a(c0113p.G(), Integer.valueOf(i8))) {
                AbstractC0080b.p(i8, c0113p2, i8, c0900h);
            }
            c0113p2.p(true);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C1058a(str, lVar, c3, cVar, i3, z3, i4, i5, gVar2, i6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(AbstractC0393b abstractC0393b, U.l lVar, U.d dVar, r0.D d3, float f3, C0281n c0281n, C0113p c0113p, int i3, int i4) {
        int i5;
        r0.D d4;
        float f4;
        C0281n c0281n2;
        int i6;
        r0.D d5;
        U.d dVar2;
        C0119s0 r3;
        c0113p.S(1142754848);
        if ((i3 & 6) == 0) {
            i5 = (c0113p.h(abstractC0393b) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0113p.f(null) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0113p.f(lVar) ? 256 : 128;
        }
        int i7 = i5 | 3072;
        int i8 = i4 & 16;
        if (i8 != 0) {
            i7 = i5 | 27648;
        } else if ((i3 & 24576) == 0) {
            d4 = d3;
            i7 |= c0113p.f(d4) ? 16384 : 8192;
            if (((i7 | 1769472) & 599187) == 599186 || !c0113p.x()) {
                U.d dVar3 = U.a.f3284h;
                if (i8 != 0) {
                    d4 = C0836i.f7147b;
                }
                c0113p.Q(1040398089);
                c0113p.p(false);
                f4 = 1.0f;
                c0281n2 = null;
                U.l b2 = androidx.compose.ui.draw.a.b(l.n(lVar.e(U.i.f3302a)), abstractC0393b, dVar3, d4, 1.0f, null, 2);
                C0644O c0644o = C0644O.f6022a;
                i6 = c0113p.f2306P;
                U.l c3 = m.c(c0113p, b2);
                InterfaceC0110n0 m3 = c0113p.m();
                InterfaceC0902j.f7933c.getClass();
                C0906n c0906n = C0901i.f7920b;
                c0113p.U();
                if (c0113p.f2305O) {
                    c0113p.d0();
                } else {
                    c0113p.l(c0906n);
                }
                C0089d.Q(c0113p, C0901i.f7923e, c0644o);
                C0089d.Q(c0113p, C0901i.f7922d, m3);
                C0089d.Q(c0113p, C0901i.f7921c, c3);
                C0900h c0900h = C0901i.f7924f;
                if (!c0113p.f2305O || !i.a(c0113p.G(), Integer.valueOf(i6))) {
                    AbstractC0080b.p(i6, c0113p, i6, c0900h);
                }
                c0113p.p(true);
                d5 = d4;
                dVar2 = dVar3;
            } else {
                c0113p.L();
                f4 = f3;
                c0281n2 = c0281n;
                d5 = d4;
                dVar2 = dVar;
            }
            r3 = c0113p.r();
            if (r3 == null) {
                r3.f2347d = new C0645P(abstractC0393b, lVar, dVar2, d5, f4, c0281n2, i3, i4);
                return;
            }
            return;
        }
        d4 = d3;
        if (((i7 | 1769472) & 599187) == 599186) {
        }
        U.d dVar32 = U.a.f3284h;
        if (i8 != 0) {
        }
        c0113p.Q(1040398089);
        c0113p.p(false);
        f4 = 1.0f;
        c0281n2 = null;
        U.l b22 = androidx.compose.ui.draw.a.b(l.n(lVar.e(U.i.f3302a)), abstractC0393b, dVar32, d4, 1.0f, null, 2);
        C0644O c0644o2 = C0644O.f6022a;
        i6 = c0113p.f2306P;
        U.l c32 = m.c(c0113p, b22);
        InterfaceC0110n0 m32 = c0113p.m();
        InterfaceC0902j.f7933c.getClass();
        C0906n c0906n2 = C0901i.f7920b;
        c0113p.U();
        if (c0113p.f2305O) {
        }
        C0089d.Q(c0113p, C0901i.f7923e, c0644o2);
        C0089d.Q(c0113p, C0901i.f7922d, m32);
        C0089d.Q(c0113p, C0901i.f7921c, c32);
        C0900h c0900h2 = C0901i.f7924f;
        if (!c0113p.f2305O) {
        }
        AbstractC0080b.p(i6, c0113p, i6, c0900h2);
        c0113p.p(true);
        d5 = d4;
        dVar2 = dVar32;
        r3 = c0113p.r();
        if (r3 == null) {
        }
    }

    public static final void c(U.l lVar, C0880w c0880w, InterfaceC0796H interfaceC0796H, boolean z3, InterfaceC0811h interfaceC0811h, U.b bVar, C0737m c0737m, boolean z4, Y1.c cVar, C0113p c0113p, int i3) {
        int i4;
        U.l lVar2;
        boolean z5;
        C0880w a3;
        U.b bVar2;
        C0737m t3;
        boolean z6;
        U.l lVar3;
        C0880w c0880w2;
        boolean z7;
        U.b bVar3;
        C0737m c0737m2;
        boolean z8;
        c0113p.S(-740714857);
        int i5 = i3 | 6;
        if ((i3 & 48) == 0) {
            i5 = i3 | 22;
        }
        if ((i3 & 384) == 0) {
            i5 |= c0113p.f(interfaceC0796H) ? 256 : 128;
        }
        int i6 = i5 | 3072;
        if ((i3 & 24576) == 0) {
            i6 |= c0113p.f(interfaceC0811h) ? 16384 : 8192;
        }
        int i7 = 196608 | i6;
        if ((1572864 & i3) == 0) {
            i7 = 720896 | i6;
        }
        int i8 = 12582912 | i7;
        if ((100663296 & i3) == 0) {
            i8 |= c0113p.h(cVar) ? 67108864 : 33554432;
        }
        if ((38347923 & i8) == 38347922 && c0113p.x()) {
            c0113p.L();
            lVar3 = lVar;
            c0880w2 = c0880w;
            z7 = z3;
            bVar3 = bVar;
            c0737m2 = c0737m;
            z8 = z4;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                i4 = i8 & (-3670129);
                lVar2 = U.i.f3302a;
                z5 = true;
                a3 = AbstractC0883z.a(c0113p);
                bVar2 = U.a.f3291o;
                t3 = AbstractC0416e.t(c0113p);
                z6 = false;
            } else {
                c0113p.L();
                i4 = i8 & (-3670129);
                lVar2 = lVar;
                a3 = c0880w;
                z6 = z3;
                bVar2 = bVar;
                t3 = c0737m;
                z5 = z4;
            }
            c0113p.q();
            AbstractC0382a.b(lVar2, a3, interfaceC0796H, z6, true, t3, z5, 0, bVar2, interfaceC0811h, null, null, cVar, c0113p, (i4 & 14) | 24576 | (i4 & 896) | (i4 & 7168) | ((i4 >> 3) & 3670016) | ((i4 << 9) & 234881024) | ((i4 << 15) & 1879048192), (i4 >> 18) & 896, 3200);
            lVar3 = lVar2;
            c0880w2 = a3;
            z7 = z6;
            bVar3 = bVar2;
            c0737m2 = t3;
            z8 = z5;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0859b(lVar3, c0880w2, interfaceC0796H, z7, interfaceC0811h, bVar3, c0737m2, z8, cVar, i3, 0);
        }
    }

    public static final void d(U.l lVar, y yVar, t.c cVar, InterfaceC0796H interfaceC0796H, boolean z3, C0737m c0737m, boolean z4, InterfaceC0811h interfaceC0811h, InterfaceC0808e interfaceC0808e, Y1.c cVar2, C0113p c0113p, int i3, int i4) {
        int i5;
        int i6;
        boolean z5;
        X x3;
        int i7;
        int i8;
        C0113p c0113p2;
        int i9;
        boolean z6;
        Object G3;
        c0113p.S(-649686062);
        if ((i3 & 6) == 0) {
            i5 = (c0113p.f(lVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= c0113p.f(yVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= (i3 & 512) == 0 ? c0113p.f(cVar) : c0113p.h(cVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= c0113p.f(interfaceC0796H) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= c0113p.g(z3) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= c0113p.g(true) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= c0113p.f(c0737m) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= c0113p.g(z4) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= c0113p.f(interfaceC0811h) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= c0113p.f(interfaceC0808e) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (c0113p.h(cVar2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 3) == 2 && c0113p.x()) {
            c0113p.L();
        } else {
            c0113p.N();
            if ((i3 & 1) != 0 && !c0113p.w()) {
                c0113p.L();
            }
            c0113p.q();
            int i10 = i5 >> 3;
            int i11 = i10 & 14;
            int i12 = i11 | ((i6 << 3) & 112);
            InterfaceC0088c0 M3 = C0089d.M(cVar2, c0113p);
            boolean z7 = (((i12 & 14) ^ 6) > 4 && c0113p.f(yVar)) || (i12 & 6) == 4;
            Object G4 = c0113p.G();
            X x4 = C0105l.f2272a;
            if (z7 || G4 == x4) {
                w wVar = new w(M3, 3);
                X x5 = X.f2226g;
                C0014b c0014b = O0.f2172a;
                p2.i iVar = new p2.i(0, 2, X0.class, new I.G(new C0125v0(new I.G(wVar, x5), 7, yVar), x5), "value", "getValue()Ljava/lang/Object;");
                c0113p.a0(iVar);
                G4 = iVar;
            }
            InterfaceC0388c interfaceC0388c = (InterfaceC0388c) G4;
            int i13 = i5 >> 9;
            int i14 = i11 | (i13 & 112);
            boolean z8 = ((((i14 & 112) ^ 48) > 32 && c0113p.g(z3)) || (i14 & 48) == 32) | ((((i14 & 14) ^ 6) > 4 && c0113p.f(yVar)) || (i14 & 6) == 4);
            Object G5 = c0113p.G();
            if (z8 || G5 == x4) {
                G5 = new C0890A(yVar);
                c0113p.a0(G5);
            }
            C0890A c0890a = (C0890A) G5;
            Object G6 = c0113p.G();
            if (G6 == x4) {
                C0130y c0130y = new C0130y(C0089d.z(c0113p));
                c0113p.a0(c0130y);
                G6 = c0130y;
            }
            p2.c cVar3 = ((C0130y) G6).f2402d;
            InterfaceC0251B interfaceC0251B = (InterfaceC0251B) c0113p.k(AbstractC0963b0.f8295e);
            int i15 = (i13 & 3670016) | (i5 & 524272) | (i10 & 29360128);
            boolean f3 = ((((i15 & 896) ^ 384) > 256 && c0113p.f(cVar)) || (i15 & 384) == 256) | ((((i15 & 112) ^ 48) > 32 && c0113p.f(yVar)) || (i15 & 48) == 32) | ((((i15 & 7168) ^ 3072) > 2048 && c0113p.f(interfaceC0796H)) || (i15 & 3072) == 2048) | ((((57344 & i15) ^ 24576) > 16384 && c0113p.g(z3)) || (i15 & 24576) == 16384) | ((((458752 & i15) ^ 196608) > 131072 && c0113p.g(true)) || (i15 & 196608) == 131072) | ((((i15 & 3670016) ^ 1572864) > 1048576 && c0113p.f(interfaceC0808e)) || (i15 & 1572864) == 1048576) | ((((29360128 & i15) ^ 12582912) > 8388608 && c0113p.f(interfaceC0811h)) || (i15 & 12582912) == 8388608) | c0113p.f(interfaceC0251B);
            Object G7 = c0113p.G();
            if (f3 || G7 == x4) {
                z5 = true;
                x3 = x4;
                i7 = 512;
                i8 = i10;
                c0113p2 = c0113p;
                t.m mVar = new t.m(yVar, interfaceC0796H, z3, interfaceC0388c, cVar, interfaceC0811h, interfaceC0808e, cVar3, interfaceC0251B);
                c0113p2.a0(mVar);
                G7 = mVar;
            } else {
                x3 = x4;
                i8 = i10;
                c0113p2 = c0113p;
                z5 = true;
                i7 = 512;
            }
            Y1.e eVar = (Y1.e) G7;
            J j3 = J.f6443d;
            U.l a3 = androidx.compose.foundation.lazy.layout.c.a(lVar.e(yVar.f7696i).e(yVar.f7697j), interfaceC0388c, c0890a, j3, z4, z3);
            if ((i11 ^ 6) <= 4 || !c0113p2.f(yVar)) {
                i9 = i8;
                if ((i9 & 6) != 4) {
                    z6 = false;
                    G3 = c0113p.G();
                    if (!z6 || G3 == x3) {
                        G3 = new t.d(yVar);
                        c0113p2.a0(G3);
                    }
                    AbstractC0382a.a(interfaceC0388c, AbstractC0382a.w(AbstractC0416e.v(a3, (t.d) G3, yVar.f7699l, z3, (j) c0113p2.k(AbstractC0963b0.f8302l), j3, z4, c0113p, i7 | (i9 & 7168) | (i9 & 3670016)).e(yVar.f7698k.f3662i), yVar, j3, z4, z3, c0737m, yVar.f7691d, c0113p), yVar.f7700m, eVar, c0113p, 0);
                }
            } else {
                i9 = i8;
            }
            z6 = z5;
            G3 = c0113p.G();
            if (!z6) {
            }
            G3 = new t.d(yVar);
            c0113p2.a0(G3);
            AbstractC0382a.a(interfaceC0388c, AbstractC0382a.w(AbstractC0416e.v(a3, (t.d) G3, yVar.f7699l, z3, (j) c0113p2.k(AbstractC0963b0.f8302l), j3, z4, c0113p, i7 | (i9 & 7168) | (i9 & 3670016)).e(yVar.f7698k.f3662i), yVar, j3, z4, z3, c0737m, yVar.f7691d, c0113p), yVar.f7700m, eVar, c0113p, 0);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new t.j(lVar, yVar, cVar, interfaceC0796H, z3, c0737m, z4, interfaceC0811h, interfaceC0808e, cVar2, i3, i4);
        }
    }

    public static final void e(U.l lVar, C0880w c0880w, InterfaceC0796H interfaceC0796H, boolean z3, InterfaceC0808e interfaceC0808e, U.c cVar, C0737m c0737m, boolean z4, Y1.c cVar2, C0113p c0113p, int i3) {
        int i4;
        U.l lVar2;
        boolean z5;
        C0880w c0880w2;
        boolean z6;
        U.c cVar3;
        InterfaceC0796H interfaceC0796H2;
        C0737m t3;
        U.l lVar3;
        C0880w c0880w3;
        InterfaceC0796H interfaceC0796H3;
        boolean z7;
        U.c cVar4;
        C0737m c0737m2;
        boolean z8;
        c0113p.S(-1724297413);
        int i5 = i3 | 6;
        if ((i3 & 48) == 0) {
            i5 = i3 | 22;
        }
        int i6 = i5 | 3456;
        if ((i3 & 24576) == 0) {
            i6 |= c0113p.f(interfaceC0808e) ? 16384 : 8192;
        }
        int i7 = 196608 | i6;
        if ((1572864 & i3) == 0) {
            i7 = 720896 | i6;
        }
        int i8 = 12582912 | i7;
        if ((100663296 & i3) == 0) {
            i8 |= c0113p.h(cVar2) ? 67108864 : 33554432;
        }
        if ((38347923 & i8) == 38347922 && c0113p.x()) {
            c0113p.L();
            lVar3 = lVar;
            c0880w3 = c0880w;
            interfaceC0796H3 = interfaceC0796H;
            z7 = z3;
            cVar4 = cVar;
            c0737m2 = c0737m;
            z8 = z4;
        } else {
            c0113p.N();
            if ((i3 & 1) == 0 || c0113p.w()) {
                U.i iVar = U.i.f3302a;
                C0880w a3 = AbstractC0883z.a(c0113p);
                float f3 = 0;
                C0797I c0797i = new C0797I(f3, f3, f3, f3);
                i4 = i8 & (-3670129);
                lVar2 = iVar;
                z5 = true;
                c0880w2 = a3;
                z6 = false;
                cVar3 = U.a.f3289m;
                interfaceC0796H2 = c0797i;
                t3 = AbstractC0416e.t(c0113p);
            } else {
                c0113p.L();
                i4 = i8 & (-3670129);
                lVar2 = lVar;
                c0880w2 = c0880w;
                interfaceC0796H2 = interfaceC0796H;
                z6 = z3;
                cVar3 = cVar;
                t3 = c0737m;
                z5 = z4;
            }
            c0113p.q();
            AbstractC0382a.b(lVar2, c0880w2, interfaceC0796H2, z6, false, t3, z5, 0, null, null, cVar3, interfaceC0808e, cVar2, c0113p, (i4 & 14) | 24576 | (i4 & 896) | (i4 & 7168) | ((i4 >> 3) & 3670016), ((i4 >> 15) & 14) | ((i4 >> 9) & 112) | ((i4 >> 18) & 896), 896);
            lVar3 = lVar2;
            c0880w3 = c0880w2;
            interfaceC0796H3 = interfaceC0796H2;
            z7 = z6;
            cVar4 = cVar3;
            c0737m2 = t3;
            z8 = z5;
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new C0859b(lVar3, c0880w3, interfaceC0796H3, z7, interfaceC0808e, cVar4, c0737m2, z8, cVar2, i3, 1);
        }
    }

    public static final void f(C0784h c0784h, R.i iVar, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(-1579360880);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(c0784h) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(iVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= c0113p.h(aVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && c0113p.x()) {
            c0113p.L();
        } else {
            C0089d.b(new C0116q0[]{AbstractC0751b.f6692a.a(c0784h), AbstractC0625e.f5928a.a(c0784h), AndroidCompositionLocals_androidKt.f3741e.a(c0784h)}, f.b(-52928304, new C0060q(iVar, 7, aVar), c0113p), c0113p, 56);
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new P0.d(c0784h, iVar, aVar, i3, 4);
        }
    }

    public static final n g(D d3, boolean z3) {
        k kVar = (k) d3.f7735x.f2356f;
        Object obj = null;
        if ((kVar.f3306g & 8) != 0) {
            loop0: while (true) {
                if (kVar == null) {
                    break;
                }
                if ((kVar.f3305f & 8) != 0) {
                    k kVar2 = kVar;
                    K.d dVar = null;
                    while (kVar2 != null) {
                        if (kVar2 instanceof n0) {
                            obj = kVar2;
                            break loop0;
                        }
                        if ((kVar2.f3305f & 8) != 0 && (kVar2 instanceof AbstractC0905m)) {
                            int i3 = 0;
                            for (k kVar3 = ((AbstractC0905m) kVar2).f7937r; kVar3 != null; kVar3 = kVar3.f3308i) {
                                if ((kVar3.f3305f & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        kVar2 = kVar3;
                                    } else {
                                        if (dVar == null) {
                                            dVar = new K.d(new k[16]);
                                        }
                                        if (kVar2 != null) {
                                            dVar.b(kVar2);
                                            kVar2 = null;
                                        }
                                        dVar.b(kVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        kVar2 = AbstractC0898f.f(dVar);
                    }
                }
                if ((kVar.f3306g & 8) == 0) {
                    break;
                }
                kVar = kVar.f3308i;
            }
        }
        i.c(obj);
        k kVar4 = ((k) ((n0) obj)).f3303d;
        z0.i n3 = d3.n();
        i.c(n3);
        return new n(kVar4, z3, d3, n3);
    }

    public static final void h(C0113p c0113p, U.l lVar) {
        C0817n c0817n = C0817n.f7074c;
        int i3 = c0113p.f2306P;
        U.l c3 = m.c(c0113p, lVar);
        InterfaceC0110n0 m3 = c0113p.m();
        InterfaceC0902j.f7933c.getClass();
        C0906n c0906n = C0901i.f7920b;
        C0014b c0014b = c0113p.f2307a;
        c0113p.U();
        if (c0113p.f2305O) {
            c0113p.l(c0906n);
        } else {
            c0113p.d0();
        }
        C0089d.Q(c0113p, C0901i.f7923e, c0817n);
        C0089d.Q(c0113p, C0901i.f7922d, m3);
        C0089d.Q(c0113p, C0901i.f7921c, c3);
        C0900h c0900h = C0901i.f7924f;
        if (c0113p.f2305O || !i.a(c0113p.G(), Integer.valueOf(i3))) {
            AbstractC0080b.p(i3, c0113p, i3, c0900h);
        }
        c0113p.p(true);
    }

    public static final void i(R.i iVar, Q.a aVar, C0113p c0113p, int i3) {
        int i4;
        c0113p.S(1211832233);
        if ((i3 & 6) == 0) {
            i4 = (c0113p.h(iVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0113p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0113p.x()) {
            c0113p.L();
        } else {
            c0113p.R(1729797275);
            b0 a3 = AbstractC0751b.a(c0113p);
            if (a3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            V A3 = AbstractC0382a.A(u.a(C0849a.class), a3, null, a3 instanceof InterfaceC0225j ? ((InterfaceC0225j) a3).a() : C0674a.f6271b, c0113p);
            c0113p.p(false);
            C0849a c0849a = (C0849a) A3;
            c0849a.f7213d = new WeakReference(iVar);
            iVar.e(c0849a.f7212c, aVar, c0113p, ((i4 << 6) & 896) | (i4 & 112));
        }
        C0119s0 r3 = c0113p.r();
        if (r3 != null) {
            r3.f2347d = new V0(i3, 9, iVar, aVar);
        }
    }

    public static final long j(String str) {
        EnumC0474c enumC0474c;
        long y3;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i3 = C0472a.f5118g;
        char charAt2 = str.charAt(0);
        int i4 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z3 = i4 > 0 && str.length() > 0 && z(str.charAt(0), '-', false);
        if (length <= i4) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i4) != 'P') {
            throw new IllegalArgumentException();
        }
        int i5 = i4 + 1;
        if (i5 == length) {
            throw new IllegalArgumentException();
        }
        EnumC0474c enumC0474c2 = null;
        long j3 = 0;
        boolean z4 = false;
        while (i5 < length) {
            if (str.charAt(i5) != 'T') {
                int i6 = i5;
                while (i6 < str.length() && (('0' <= (charAt = str.charAt(i6)) && charAt < ':') || AbstractC0447i.k0("+-.", charAt))) {
                    i6++;
                }
                String substring = str.substring(i5, i6);
                i.e(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i5;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i7 = length2 + 1;
                if (z4) {
                    if (charAt3 == 'H') {
                        enumC0474c = EnumC0474c.f5125i;
                    } else if (charAt3 == 'M') {
                        enumC0474c = EnumC0474c.f5124h;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        enumC0474c = EnumC0474c.f5123g;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    enumC0474c = EnumC0474c.f5126j;
                }
                if (enumC0474c2 != null && enumC0474c2.compareTo(enumC0474c) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int q0 = AbstractC0447i.q0(substring, '.', 0, false, 6);
                if (enumC0474c != EnumC0474c.f5123g || q0 <= 0) {
                    j3 = C0472a.d(j3, P(H(substring), enumC0474c));
                } else {
                    String substring2 = substring.substring(0, q0);
                    i.e(substring2, "substring(...)");
                    long d3 = C0472a.d(j3, P(H(substring2), enumC0474c));
                    String substring3 = substring.substring(q0);
                    i.e(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    double g3 = AbstractC0382a.g(parseDouble, enumC0474c, EnumC0474c.f5121e);
                    if (Double.isNaN(g3)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long N3 = B.N(g3);
                    if (-4611686018426999999L > N3 || N3 >= 4611686018427000000L) {
                        y3 = y(B.N(AbstractC0382a.g(parseDouble, enumC0474c, EnumC0474c.f5122f)));
                    } else {
                        y3 = N3 << 1;
                        int i8 = C0472a.f5118g;
                        int i9 = AbstractC0473b.f5120a;
                    }
                    j3 = C0472a.d(d3, y3);
                }
                enumC0474c2 = enumC0474c;
                i5 = i7;
            } else {
                if (z4 || (i5 = i5 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z4 = true;
            }
        }
        if (!z3) {
            return j3;
        }
        long j4 = ((-(j3 >> 1)) << 1) + (((int) j3) & 1);
        int i10 = AbstractC0473b.f5120a;
        return j4;
    }

    public static final void k(o0.c cVar, n0.m mVar) {
        boolean a3 = s.a(mVar);
        o0.b bVar = cVar.f6689b;
        o0.b bVar2 = cVar.f6688a;
        if (a3) {
            M1.k.c0(r2, 0, bVar2.f6683d.length);
            bVar2.f6684e = 0;
            M1.k.c0(r2, 0, bVar.f6683d.length);
            bVar.f6684e = 0;
            cVar.f6690c = 0L;
        }
        boolean b2 = s.b(mVar);
        long j3 = mVar.f6224b;
        if (!b2) {
            List list = mVar.f6233k;
            if (list == null) {
                list = M1.u.f2803d;
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0672b c0672b = (C0672b) list.get(i3);
                long j4 = c0672b.f6195a;
                long j5 = c0672b.f6197c;
                bVar2.a(j4, a0.c.d(j5));
                bVar.a(j4, a0.c.e(j5));
            }
            long j6 = mVar.f6234l;
            bVar2.a(j3, a0.c.d(j6));
            bVar.a(j3, a0.c.e(j6));
        }
        if (s.b(mVar) && j3 - cVar.f6690c > 40) {
            M1.k.c0(r1, 0, bVar2.f6683d.length);
            bVar2.f6684e = 0;
            M1.k.c0(r1, 0, bVar.f6683d.length);
            bVar.f6684e = 0;
            cVar.f6690c = 0L;
        }
        cVar.f6690c = j3;
    }

    public static final List l(InterfaceC0953v interfaceC0953v, C0922D c0922d, n0.f fVar) {
        C0380d c0380d;
        if (!fVar.f6213a.m() && c0922d.f8005d.isEmpty()) {
            return M1.u.f2803d;
        }
        ArrayList arrayList = new ArrayList();
        K.d dVar = fVar.f6213a;
        if (!dVar.m()) {
            c0380d = C0380d.f4775g;
        } else {
            if (dVar.l()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = dVar.f2640d;
            int i3 = ((C0941i) objArr[0]).f8069a;
            int i4 = dVar.f2642f;
            if (i4 > 0) {
                int i5 = 0;
                do {
                    int i6 = ((C0941i) objArr[i5]).f8069a;
                    if (i6 < i3) {
                        i3 = i6;
                    }
                    i5++;
                } while (i5 < i4);
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("negative minIndex");
            }
            if (dVar.l()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = dVar.f2640d;
            int i7 = ((C0941i) objArr2[0]).f8070b;
            int i8 = dVar.f2642f;
            if (i8 > 0) {
                int i9 = 0;
                do {
                    int i10 = ((C0941i) objArr2[i9]).f8070b;
                    if (i10 > i7) {
                        i7 = i10;
                    }
                    i9++;
                } while (i9 < i8);
            }
            c0380d = new C0380d(i3, Math.min(i7, interfaceC0953v.a() - 1), 1);
        }
        int size = c0922d.f8005d.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0921C c0921c = (C0921C) c0922d.get(i11);
            int A3 = A(c0921c.f8001c.g(), c0921c.f7999a, interfaceC0953v);
            int i12 = c0380d.f4768d;
            if ((A3 > c0380d.f4769e || i12 > A3) && A3 >= 0 && A3 < interfaceC0953v.a()) {
                arrayList.add(Integer.valueOf(A3));
            }
        }
        int i13 = c0380d.f4768d;
        int i14 = c0380d.f4769e;
        if (i13 <= i14) {
            while (true) {
                arrayList.add(Integer.valueOf(i13));
                if (i13 == i14) {
                    break;
                }
                i13++;
            }
        }
        return arrayList;
    }

    public static void m(int i3) {
        if (2 > i3 || i3 >= 37) {
            StringBuilder l3 = AbstractC0080b.l("radix ", i3, " was not in valid range ");
            l3.append(new C0380d(2, 36, 1));
            throw new IllegalArgumentException(l3.toString());
        }
    }

    public static float n(float f3, float f4) {
        return f3 < f4 ? f4 : f3;
    }

    public static float o(float f3, float f4) {
        return f3 > f4 ? f4 : f3;
    }

    public static double p(double d3, double d4, double d5) {
        if (d4 <= d5) {
            return d3 < d4 ? d4 : d3 > d5 ? d5 : d3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d5 + " is less than minimum " + d4 + '.');
    }

    public static float q(float f3, float f4, float f5) {
        if (f4 <= f5) {
            return f3 < f4 ? f4 : f3 > f5 ? f5 : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f5 + " is less than minimum " + f4 + '.');
    }

    public static int r(int i3, int i4, int i5) {
        if (i4 <= i5) {
            return i3 < i4 ? i4 : i3 > i5 ? i5 : i3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i5 + " is less than minimum " + i4 + '.');
    }

    public static long s(long j3, long j4, long j5) {
        if (j4 <= j5) {
            return j3 < j4 ? j4 : j3 > j5 ? j5 : j3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j5 + " is less than minimum " + j4 + '.');
    }

    public static Comparable t(Float f3, C0377a c0377a) {
        if (c0377a.a()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c0377a + '.');
        }
        float f4 = c0377a.f4766a;
        if (C0377a.b(f3, Float.valueOf(f4)) && !C0377a.b(Float.valueOf(f4), f3)) {
            return Float.valueOf(f4);
        }
        float f5 = c0377a.f4767b;
        return (!C0377a.b(Float.valueOf(f5), f3) || C0377a.b(f3, Float.valueOf(f5))) ? f3 : Float.valueOf(f5);
    }

    public static final InterfaceC0088c0 u(C0676A c0676a, C0113p c0113p) {
        InterfaceC0236v interfaceC0236v = (InterfaceC0236v) c0113p.k(AbstractC0625e.f5928a);
        EnumC0230o enumC0230o = EnumC0230o.f4028g;
        P1.j jVar = P1.j.f3073d;
        Object value = c0676a.getValue();
        C0238x e3 = interfaceC0236v.e();
        Object[] objArr = {c0676a, e3, enumC0230o, jVar};
        boolean h3 = c0113p.h(e3) | c0113p.f(enumC0230o) | c0113p.h(jVar) | c0113p.h(c0676a);
        Object G3 = c0113p.G();
        Object obj = C0105l.f2272a;
        if (h3 || G3 == obj) {
            Object c0623c = new C0623c(e3, enumC0230o, jVar, c0676a, null);
            c0113p.a0(c0623c);
            G3 = c0623c;
        }
        Y1.e eVar = (Y1.e) G3;
        Object G4 = c0113p.G();
        if (G4 == obj) {
            G4 = C0089d.J(value, X.f2228i);
            c0113p.a0(G4);
        }
        InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G4;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h4 = c0113p.h(eVar);
        Object G5 = c0113p.G();
        if (h4 || G5 == obj) {
            G5 = new R0(eVar, interfaceC0088c0, null);
            c0113p.a0(G5);
        }
        Y1.e eVar2 = (Y1.e) G5;
        P1.i h5 = c0113p.f2308b.h();
        boolean z3 = false;
        for (Object obj2 : Arrays.copyOf(copyOf, copyOf.length)) {
            z3 |= c0113p.f(obj2);
        }
        Object G6 = c0113p.G();
        if (z3 || G6 == obj) {
            c0113p.a0(new U(h5, eVar2));
        }
        return interfaceC0088c0;
    }

    public static InterfaceC0088c0 v() {
        return C0089d.J(z.f2729a, X.f2225f);
    }

    public static final float w(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < length; i3++) {
            f3 += fArr[i3] * fArr2[i3];
        }
        return f3;
    }

    public static final long x(long j3) {
        long j4 = (j3 << 1) + 1;
        int i3 = C0472a.f5118g;
        int i4 = AbstractC0473b.f5120a;
        return j4;
    }

    public static final long y(long j3) {
        if (-4611686018426L > j3 || j3 >= 4611686018427L) {
            return x(s(j3, -4611686018427387903L, 4611686018427387903L));
        }
        long j4 = (j3 * 1000000) << 1;
        int i3 = C0472a.f5118g;
        int i4 = AbstractC0473b.f5120a;
        return j4;
    }

    public static final boolean z(char c3, char c4, boolean z3) {
        if (c3 == c4) {
            return true;
        }
        if (!z3) {
            return false;
        }
        char upperCase = Character.toUpperCase(c3);
        char upperCase2 = Character.toUpperCase(c4);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public int hashCode() {
        switch (this.f4776a) {
            case 18:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f4776a) {
            case 18:
                String b2 = u.a(getClass()).b();
                i.c(b2);
                return b2;
            default:
                return super.toString();
        }
    }
}
