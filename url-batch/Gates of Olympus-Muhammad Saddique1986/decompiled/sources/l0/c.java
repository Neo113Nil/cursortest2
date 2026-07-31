package l0;

import A.k;
import B.S;
import B.T;
import C0.J;
import C0.r;
import G2.l;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0173s0;
import I.InterfaceC0142c0;
import I.InterfaceC0164n0;
import I0.z;
import J.D;
import O1.t;
import R1.y;
import S1.m;
import T2.C0231f;
import T2.C0234i;
import U.n;
import U.q;
import V1.f;
import V1.i;
import a0.C0238c;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.KeyEvent;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.FillElement;
import b0.C0334c;
import b0.C0338g;
import com.gatesof.olympus.martu.marku.R;
import d0.C0401b;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import f2.j;
import f2.u;
import f2.x;
import h0.C0463f;
import h1.C0487e;
import h1.C0489g;
import h1.C0493k;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m2.C0657g;
import n.AbstractC0695v;
import n2.AbstractC0730j;
import q2.AbstractC0831s;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.C0850L;
import r.C0855b;
import r.C0861h;
import r0.C0912i;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static C0338g f6575a;

    /* renamed from: b, reason: collision with root package name */
    public static C0334c f6576b;

    /* renamed from: c, reason: collision with root package name */
    public static C0401b f6577c;

    /* renamed from: d, reason: collision with root package name */
    public static C0463f f6578d;

    /* renamed from: e, reason: collision with root package name */
    public static long f6579e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f6580f;

    public static A1.c A(A1.d dVar, SQLiteDatabase sQLiteDatabase) {
        j.f(dVar, "refHolder");
        j.f(sQLiteDatabase, "sqLiteDatabase");
        A1.c cVar = dVar.f203a;
        if (cVar != null && j.a(cVar.f202d, sQLiteDatabase)) {
            return cVar;
        }
        A1.c cVar2 = new A1.c(sQLiteDatabase);
        dVar.f203a = cVar2;
        return cVar2;
    }

    public static V1.d B(V1.d dVar) {
        j.f(dVar, "<this>");
        X1.c cVar = dVar instanceof X1.c ? (X1.c) dVar : null;
        if (cVar == null) {
            return dVar;
        }
        V1.d dVar2 = cVar.f4643f;
        if (dVar2 != null) {
            return dVar2;
        }
        f fVar = (f) cVar.t().v(V1.e.f4557d);
        V1.d fVar2 = fVar != null ? new v2.f((AbstractC0831s) fVar, cVar) : cVar;
        cVar.f4643f = fVar2;
        return fVar2;
    }

    public static boolean C() {
        boolean isEnabled;
        try {
            if (f6580f == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f6580f == null) {
                f6579e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f6580f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f6580f.invoke(null, Long.valueOf(f6579e))).booleanValue();
        } catch (Exception e3) {
            if (!(e3 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e3);
                return false;
            }
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final boolean D(long j3) {
        return (j3 & 9223372034707292159L) != 9205357640488583168L;
    }

    public static final boolean E(long j3) {
        return (j3 & 9223372034707292159L) == 9205357640488583168L;
    }

    public static C0657g F(InterfaceC0426e interfaceC0426e) {
        C0657g c0657g = new C0657g();
        c0657g.f7005f = q(c0657g, c0657g, interfaceC0426e);
        return c0657g;
    }

    public static final float G(float f3, float f4, float f5) {
        return (f5 * f4) + ((1 - f5) * f3);
    }

    public static final int H(float f3, int i3, int i4) {
        return i3 + ((int) Math.round((i4 - i3) * f3));
    }

    public static l I(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            String str = strArr2[i4];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i4] = AbstractC0730j.Y(str).toString();
        }
        int e02 = O2.l.e0(0, strArr2.length - 1, 2);
        if (e02 >= 0) {
            while (true) {
                String str2 = strArr2[i3];
                String str3 = strArr2[i3 + 1];
                l(str2);
                o(str3, str2);
                if (i3 == e02) {
                    break;
                }
                i3 += 2;
            }
        }
        return new l(strArr2);
    }

    public static final boolean J(String str) {
        j.f(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final long K(long j3) {
        return (Math.round(C0238c.e(j3)) & 4294967295L) | (Math.round(C0238c.d(j3)) << 32);
    }

    public static final void N(D d3, int i3, int i4) {
        int i5 = 1 << i3;
        int i6 = d3.f3110h;
        if ((i6 & i5) == 0) {
            d3.f3110h = i5 | i6;
            d3.f3106d[(d3.f3107e - d3.m0().f3102a) + i3] = i4;
        } else {
            C0143d.T("Already pushed argument " + d3.m0().b(i3));
            throw null;
        }
    }

    public static final void O(D d3, int i3, Object obj) {
        int i4 = 1 << i3;
        int i5 = d3.f3111i;
        if ((i5 & i4) == 0) {
            d3.f3111i = i4 | i5;
            d3.f3108f[(d3.f3109g - d3.m0().f3103b) + i3] = obj;
        } else {
            C0143d.T("Already pushed argument " + d3.m0().c(i3));
            throw null;
        }
    }

    public static final ExtractedText P(z zVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = zVar.f3097a.f596a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j3 = zVar.f3098b;
        extractedText.selectionStart = J.e(j3);
        extractedText.selectionEnd = J.d(j3);
        extractedText.flags = !AbstractC0730j.B(zVar.f3097a.f596a, '\n') ? 1 : 0;
        return extractedText;
    }

    public static Object Q(InterfaceC0426e interfaceC0426e, Object obj, V1.d dVar) {
        j.f(interfaceC0426e, "<this>");
        i t3 = dVar.t();
        Object dVar2 = t3 == V1.j.f4558d ? new W1.d(dVar) : new W1.e(dVar, t3);
        x.d(2, interfaceC0426e);
        return interfaceC0426e.h(obj, dVar2);
    }

    public static final void a(Q1.f fVar, C0167p c0167p, int i3) {
        int i4;
        int i5 = 0;
        int i6 = 3;
        c0167p.S(-307605551);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.h(fVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i4 & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            InterfaceC0142c0 i7 = AbstractC0695v.i(fVar.f3977b, c0167p);
            Object obj = ((Q1.d) i7.getValue()).f3971a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f4829b;
            float f3 = 16;
            C0850L c0850l = new C0850L(f3, f3, f3, f3);
            C0855b c0855b = AbstractC0864k.f8051a;
            C0861h c0861h = new C0861h(12);
            c0167p.Q(-1853480844);
            boolean h3 = c0167p.h(obj) | c0167p.f(i7);
            Object G3 = c0167p.G();
            if (h3 || G3 == C0159l.f2829a) {
                G3 = new t(obj, i5, i7);
                c0167p.a0(G3);
            }
            c0167p.p(false);
            AbstractC0695v.a(fillElement, null, c0850l, false, c0861h, null, null, false, (InterfaceC0424c) G3, c0167p, 24966);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new M1.c(i3, i6, fVar);
        }
    }

    public static final O0.d b(Context context) {
        float f3 = context.getResources().getConfiguration().fontScale;
        float f4 = context.getResources().getDisplayMetrics().density;
        P0.a a3 = P0.b.a(f3);
        if (a3 == null) {
            a3 = new O0.l(f3);
        }
        return new O0.d(f4, f3, a3);
    }

    public static final long c(int i3, int i4) {
        return (i4 & 4294967295L) | (i3 << 32);
    }

    public static final long d(int i3) {
        long j3 = (i3 << 32) | (0 & 4294967295L);
        int i4 = C0591a.f6572n;
        return j3;
    }

    public static final long e(float f3, float f4) {
        return (Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void f(q qVar, Q.a aVar, C0167p c0167p, int i3) {
        int i4;
        c0167p.S(-2105228848);
        if ((i3 & 6) == 0) {
            i4 = (c0167p.f(qVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c0167p.h(aVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && c0167p.x()) {
            c0167p.L();
        } else {
            S s3 = S.f312a;
            int i5 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d3 = U.a.d(c0167p, qVar);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            int i6 = (((((i4 << 3) & 112) | (((i4 >> 3) & 14) | 384)) << 6) & 896) | 6;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, s3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !j.a(c0167p.G(), Integer.valueOf(i5))) {
                k.o(i5, c0167p, i5, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            aVar.h(c0167p, Integer.valueOf((i6 >> 6) & 14));
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new T(qVar, aVar, i3, 0);
        }
    }

    public static final void g(final int i3, C0167p c0167p) {
        c0167p.S(884994113);
        if (i3 == 0 && c0167p.x()) {
            c0167p.L();
        } else {
            n nVar = n.f4488a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f4829b;
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4465h, false);
            int i4 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            q d3 = U.a.d(c0167p, fillElement);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !j.a(c0167p.G(), Integer.valueOf(i4))) {
                k.o(i4, c0167p, i4, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d3);
            n.T.a(AbstractC0695v.k(R.drawable.splash_background, c0167p), fillElement, null, C0912i.f8158a, 0.0f, null, c0167p, 25008);
            n.T.a(AbstractC0695v.k(R.drawable.splash_logo, c0167p), androidx.compose.foundation.layout.c.c(nVar, 0.55f), null, C0912i.f8159b, 0.0f, null, c0167p, 25008);
            c0167p.p(true);
        }
        C0173s0 r3 = c0167p.r();
        if (r3 != null) {
            r3.f2906d = new InterfaceC0426e() { // from class: F1.e
                @Override // e2.InterfaceC0426e
                public final Object h(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    l0.c.g(C0143d.U(i3 | 1), (C0167p) obj);
                    return y.f4171a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(List list, C0493k c0493k, X1.c cVar) {
        C0487e c0487e;
        int i3;
        List list2;
        u uVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof C0487e) {
            c0487e = (C0487e) cVar;
            int i4 = c0487e.f6145j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0487e.f6145j = i4 - Integer.MIN_VALUE;
                Object obj = c0487e.f6144i;
                Object obj2 = W1.a.f4608d;
                i3 = c0487e.f6145j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    ArrayList arrayList = new ArrayList();
                    C0489g c0489g = new C0489g(list, arrayList, null);
                    c0487e.f6142g = arrayList;
                    c0487e.f6145j = 1;
                    if (c0493k.a(c0489g, c0487e) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = c0487e.f6143h;
                        uVar = (u) c0487e.f6142g;
                        try {
                            R1.a.e(obj);
                        } catch (Throwable th2) {
                            Object obj3 = uVar.f5832d;
                            if (obj3 == null) {
                                uVar.f5832d = th2;
                            } else {
                                R1.a.a((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            InterfaceC0424c interfaceC0424c = (InterfaceC0424c) it.next();
                            c0487e.f6142g = uVar;
                            c0487e.f6143h = it;
                            c0487e.f6145j = 2;
                            if (interfaceC0424c.n(c0487e) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) uVar.f5832d;
                        if (th == null) {
                            return y.f4171a;
                        }
                        throw th;
                    }
                    list2 = (List) c0487e.f6142g;
                    R1.a.e(obj);
                }
                uVar = new u();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) uVar.f5832d;
                if (th == null) {
                }
            }
        }
        c0487e = new C0487e(cVar);
        Object obj4 = c0487e.f6144i;
        Object obj22 = W1.a.f4608d;
        i3 = c0487e.f6145j;
        if (i3 != 0) {
        }
        uVar = new u();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) uVar.f5832d;
        if (th == null) {
        }
    }

    public static void i(long j3, C0231f c0231f, int i3, ArrayList arrayList, int i4, int i5, ArrayList arrayList2) {
        int i6;
        int i7;
        int i8;
        int i9;
        C0231f c0231f2;
        int i10 = i3;
        if (i4 >= i5) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i11 = i4; i11 < i5; i11++) {
            if (((C0234i) arrayList.get(i11)).b() < i10) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C0234i c0234i = (C0234i) arrayList.get(i4);
        C0234i c0234i2 = (C0234i) arrayList.get(i5 - 1);
        int i12 = -1;
        if (i10 == c0234i.b()) {
            int intValue = ((Number) arrayList2.get(i4)).intValue();
            int i13 = i4 + 1;
            C0234i c0234i3 = (C0234i) arrayList.get(i13);
            i6 = i13;
            i7 = intValue;
            c0234i = c0234i3;
        } else {
            i6 = i4;
            i7 = -1;
        }
        if (c0234i.g(i10) == c0234i2.g(i10)) {
            int min = Math.min(c0234i.b(), c0234i2.b());
            int i14 = 0;
            for (int i15 = i10; i15 < min && c0234i.g(i15) == c0234i2.g(i15); i15++) {
                i14++;
            }
            long j4 = 4;
            long j5 = (c0231f.f4409e / j4) + j3 + 2 + i14 + 1;
            c0231f.G(-i14);
            c0231f.G(i7);
            int i16 = i14 + i10;
            while (i10 < i16) {
                c0231f.G(c0234i.g(i10) & 255);
                i10++;
            }
            if (i6 + 1 == i5) {
                if (i16 != ((C0234i) arrayList.get(i6)).b()) {
                    throw new IllegalStateException("Check failed.");
                }
                c0231f.G(((Number) arrayList2.get(i6)).intValue());
                return;
            } else {
                C0231f c0231f3 = new C0231f();
                c0231f.G(((int) ((c0231f3.f4409e / j4) + j5)) * (-1));
                i(j5, c0231f3, i16, arrayList, i6, i5, arrayList2);
                c0231f.D(c0231f3);
                return;
            }
        }
        int i17 = 1;
        for (int i18 = i6 + 1; i18 < i5; i18++) {
            if (((C0234i) arrayList.get(i18 - 1)).g(i10) != ((C0234i) arrayList.get(i18)).g(i10)) {
                i17++;
            }
        }
        long j6 = 4;
        long j7 = (c0231f.f4409e / j6) + j3 + 2 + (i17 * 2);
        c0231f.G(i17);
        c0231f.G(i7);
        for (int i19 = i6; i19 < i5; i19++) {
            int g3 = ((C0234i) arrayList.get(i19)).g(i10);
            if (i19 == i6 || g3 != ((C0234i) arrayList.get(i19 - 1)).g(i10)) {
                c0231f.G(g3 & 255);
            }
        }
        C0231f c0231f4 = new C0231f();
        int i20 = i6;
        while (i20 < i5) {
            byte g4 = ((C0234i) arrayList.get(i20)).g(i10);
            int i21 = i20 + 1;
            int i22 = i21;
            while (true) {
                if (i22 >= i5) {
                    i8 = i5;
                    break;
                } else {
                    if (g4 != ((C0234i) arrayList.get(i22)).g(i10)) {
                        i8 = i22;
                        break;
                    }
                    i22++;
                }
            }
            if (i21 == i8 && i10 + 1 == ((C0234i) arrayList.get(i20)).b()) {
                c0231f.G(((Number) arrayList2.get(i20)).intValue());
                i9 = i8;
                c0231f2 = c0231f4;
            } else {
                c0231f.G(((int) ((c0231f4.f4409e / j6) + j7)) * i12);
                i9 = i8;
                c0231f2 = c0231f4;
                i(j7, c0231f4, i10 + 1, arrayList, i20, i8, arrayList2);
            }
            c0231f4 = c0231f2;
            i20 = i9;
            i12 = -1;
        }
        c0231f.D(c0231f4);
    }

    public static final Bundle j(R1.i... iVarArr) {
        Bundle bundle = new Bundle(iVarArr.length);
        for (R1.i iVar : iVarArr) {
            String str = (String) iVar.f4150d;
            Object obj = iVar.f4151e;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                j.c(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                Z0.a.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                Z0.a.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void k(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 > i4) {
                throw new IllegalArgumentException(k.f(i3, i4, "startIndex: ", " > endIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i3 + ", endIndex: " + i4 + ", size: " + i5);
    }

    public static void l(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if ('!' > charAt || charAt >= 127) {
                throw new IllegalArgumentException(H2.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i3), str).toString());
            }
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void n(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 > i4) {
                throw new IllegalArgumentException(k.f(i3, i4, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
    }

    public static void o(String str, String str2) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(H2.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i3), str2));
                sb.append(H2.b.p(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static V1.d q(V1.d dVar, V1.d dVar2, InterfaceC0426e interfaceC0426e) {
        j.f(interfaceC0426e, "<this>");
        if (interfaceC0426e instanceof X1.a) {
            return ((X1.a) interfaceC0426e).o(dVar2, dVar);
        }
        i t3 = dVar2.t();
        return t3 == V1.j.f4558d ? new W1.b(dVar2, dVar, interfaceC0426e) : new W1.c(dVar2, t3, interfaceC0426e, dVar);
    }

    public static final boolean r(int i3, int i4) {
        return i3 == i4;
    }

    public static final float s(float f3) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f3) & 8589934591L) / 3)) + 709952852);
        float f4 = intBitsToFloat - ((intBitsToFloat - (f3 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f4 - ((f4 - (f3 / (f4 * f4))) * 0.33333334f);
    }

    public static final int t(int i3, List list) {
        int size = list.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            r rVar = (r) list.get(i5);
            char c2 = rVar.f635b > i3 ? (char) 1 : rVar.f636c <= i3 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i4 = i5 + 1;
            } else {
                if (c2 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int u(int i3, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            r rVar = (r) arrayList.get(i5);
            char c2 = rVar.f637d > i3 ? (char) 1 : rVar.f638e <= i3 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i4 = i5 + 1;
            } else {
                if (c2 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final int v(ArrayList arrayList, float f3) {
        if (f3 <= 0.0f) {
            return 0;
        }
        if (f3 >= ((r) S1.l.Q0(arrayList)).f640g) {
            return m.z0(arrayList);
        }
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            r rVar = (r) arrayList.get(i4);
            char c2 = rVar.f639f > f3 ? (char) 1 : rVar.f640g <= f3 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i3 = i4 + 1;
            } else {
                if (c2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void w(ArrayList arrayList, long j3, InterfaceC0424c interfaceC0424c) {
        int size = arrayList.size();
        for (int t3 = t(J.e(j3), arrayList); t3 < size; t3++) {
            r rVar = (r) arrayList.get(t3);
            if (rVar.f635b >= J.d(j3)) {
                return;
            }
            if (rVar.f635b != rVar.f636c) {
                interfaceC0424c.n(rVar);
            }
        }
    }

    public static final int x(H0.k kVar, int i3) {
        boolean z3 = j.g(kVar.f2601d, H0.k.f2596e.f2601d) >= 0;
        boolean a3 = H0.i.a(i3, 1);
        if (a3 && z3) {
            return 3;
        }
        if (z3) {
            return 1;
        }
        return a3 ? 2 : 0;
    }

    public static final long y(KeyEvent keyEvent) {
        return d(keyEvent.getKeyCode());
    }

    public static final int z(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public abstract void M(boolean z3);

    public abstract List p(List list, String str);

    public void L(boolean z3) {
    }
}
