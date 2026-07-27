package A;

import A0.C0036g;
import G.C0223t;
import G.C0225u;
import G.InterfaceC0191c0;
import a.AbstractC0345a;
import android.content.Context;
import android.view.KeyEvent;
import b1.C0508h;
import com.appsflyer.attribution.RequestError;
import i.C0661B;
import i1.C0679b;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0952M;
import p0.AbstractC0953N;
import q.AbstractC1024c;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.n0;
import s0.C1118D;
import s0.C1166s;
import s0.I0;
import s0.K0;
import s1.C1193i;
import w.EnumC1256E;
import w.o0;
import y2.C1338m;

/* loaded from: classes.dex */
public final class f0 extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f136e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f137i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(Object obj, int i2, Object obj2) {
        super(0);
        this.f135d = i2;
        this.f136e = obj;
        this.f137i = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r10.f3095c, ((G0.y) r9.getValue()).f3095c) == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v50, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r1v53, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r3v20, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v21, types: [M2.p, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        long j4;
        long j5;
        o0 d4;
        w.P p4;
        C0036g c0036g;
        AbstractC0953N placementScope;
        boolean dispatchKeyEvent;
        y0.n nVar;
        r0.E e4;
        Object obj = this.f137i;
        Object obj2 = this.f136e;
        switch (this.f135d) {
            case 0:
                long j6 = ((M0.j) ((InterfaceC0191c0) obj).getValue()).f3554a;
                a0 a0Var = (a0) obj2;
                Y.c g4 = a0Var.g();
                if (g4 != null) {
                    w.P p5 = a0Var.f87d;
                    C0036g c0036g2 = p5 != null ? p5.f11054a.f11118a : null;
                    if (c0036g2 != null && c0036g2.f328a.length() != 0) {
                        EnumC1256E enumC1256E = (EnumC1256E) a0Var.f98o.getValue();
                        int i2 = enumC1256E == null ? -1 : d0.f121a[enumC1256E.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1 || i2 == 2) {
                                long j7 = a0Var.j().f3094b;
                                int i4 = A0.K.f300c;
                                j5 = j7 >> 32;
                            } else {
                                if (i2 != 3) {
                                    throw new C1338m();
                                }
                                long j8 = a0Var.j().f3094b;
                                int i5 = A0.K.f300c;
                                j5 = j8 & 4294967295L;
                            }
                            int i6 = (int) j5;
                            w.P p6 = a0Var.f87d;
                            if (p6 != null && (d4 = p6.d()) != null && (p4 = a0Var.f87d) != null && (c0036g = p4.f11054a.f11118a) != null) {
                                int e5 = kotlin.ranges.b.e(a0Var.f85b.b(i6), 0, c0036g.f328a.length());
                                float d5 = Y.c.d(d4.d(g4.f4372a));
                                A0.I i7 = d4.f11290a;
                                int e6 = i7.e(e5);
                                float f4 = i7.f(e6);
                                float g5 = i7.g(e6);
                                float d6 = kotlin.ranges.b.d(d5, Math.min(f4, g5), Math.max(f4, g5));
                                if (M0.j.a(j6, 0L) || Math.abs(d5 - d6) <= ((int) (j6 >> 32)) / 2) {
                                    A0.o oVar = i7.f290b;
                                    float d7 = oVar.d(e6);
                                    j4 = AbstractC0345a.c(d6, ((oVar.b(e6) - d7) / 2) + d7);
                                    return new Y.c(j4);
                                }
                            }
                        }
                    }
                }
                j4 = 9205357640488583168L;
                return new Y.c(j4);
            case 1:
                C0661B c0661b = (C0661B) obj2;
                Object[] objArr = c0661b.f6885b;
                long[] jArr = c0661b.f6884a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j9 = jArr[i8];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j9) < 128) {
                                    ((C0225u) obj).x(objArr[(i8 << 3) + i10]);
                                }
                                j9 >>= 8;
                            }
                            if (i9 != 8) {
                            }
                        }
                        if (i8 != length) {
                            i8++;
                        }
                    }
                }
                return Unit.f7487a;
            case 2:
                ((W.b) obj2).f4192w.invoke((W.c) obj);
                return Unit.f7487a;
            case 3:
                ((M2.E) obj2).f3580d = ((X.t) obj).B0();
                return Unit.f7487a;
            case 4:
                Context applicationContext = (Context) obj2;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                ((C0679b) obj).getClass();
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter("app_state", "name");
                Intrinsics.checkNotNullParameter(applicationContext, "<this>");
                Intrinsics.checkNotNullParameter("app_state.preferences_pb", "fileName");
                return new File(applicationContext.getApplicationContext().getFilesDir(), "datastore/app_state.preferences_pb");
            case 5:
                ((Y2.i) obj2).o(obj);
                return Unit.f7487a;
            case 6:
                ((M2.E) obj2).f3580d = AbstractC1065f.i((m.K) obj, AbstractC0952M.f9003a);
                return Unit.f7487a;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                C0223t c0223t = ((r0.E) obj2).B;
                if ((((S.n) c0223t.f2912f).f3981j & 8) != 0) {
                    for (S.n nVar2 = (r0.o0) c0223t.f2911e; nVar2 != null; nVar2 = nVar2.f3982k) {
                        if ((nVar2.f3980i & 8) != 0) {
                            AbstractC1073n abstractC1073n = nVar2;
                            ?? r4 = 0;
                            while (abstractC1073n != 0) {
                                if (abstractC1073n instanceof n0) {
                                    n0 n0Var = (n0) abstractC1073n;
                                    M2.E e7 = (M2.E) obj;
                                    if (n0Var.T()) {
                                        y0.i iVar = new y0.i();
                                        e7.f3580d = iVar;
                                        iVar.f11578i = true;
                                    }
                                    if (n0Var.X()) {
                                        ((y0.i) e7.f3580d).f11577e = true;
                                    }
                                    n0Var.p((y0.i) e7.f3580d);
                                } else if ((abstractC1073n.f3980i & 8) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                    S.n nVar3 = abstractC1073n.f9826u;
                                    int i11 = 0;
                                    abstractC1073n = abstractC1073n;
                                    r4 = r4;
                                    while (nVar3 != null) {
                                        if ((nVar3.f3980i & 8) != 0) {
                                            i11++;
                                            r4 = r4;
                                            if (i11 == 1) {
                                                abstractC1073n = nVar3;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new I.d(new S.n[16]);
                                                }
                                                if (abstractC1073n != 0) {
                                                    r4.b(abstractC1073n);
                                                    abstractC1073n = 0;
                                                }
                                                r4.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f3983l;
                                        abstractC1073n = abstractC1073n;
                                        r4 = r4;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC1073n = AbstractC1065f.f(r4);
                            }
                        }
                    }
                }
                return Unit.f7487a;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                r0.L l4 = (r0.L) obj2;
                r0.a0 a0Var2 = l4.a().f9764t;
                if (a0Var2 == null || (placementScope = a0Var2.f9704o) == null) {
                    placementScope = ((C1166s) r0.H.a(l4.f9674a)).getPlacementScope();
                }
                r0.K k4 = (r0.K) obj;
                Function1 function1 = k4.f9653G;
                if (function1 == null) {
                    r0.a0 a4 = l4.a();
                    long j10 = k4.f9654H;
                    float f5 = k4.f9655I;
                    placementScope.getClass();
                    AbstractC0953N.a(placementScope, a4);
                    a4.n0(M0.h.c(j10, a4.f9009k), f5, null);
                } else {
                    r0.a0 a5 = l4.a();
                    long j11 = k4.f9654H;
                    float f6 = k4.f9655I;
                    placementScope.getClass();
                    AbstractC0953N.a(placementScope, a5);
                    a5.n0(M0.h.c(j11, a5.f9009k), f6, function1);
                }
                return Unit.f7487a;
            case AbstractC1024c.f9242c /* 9 */:
                Function1 m4 = ((r0.k0) obj2).f9823d.m();
                if (m4 != null) {
                    r0.O o4 = (r0.O) obj;
                    o4.getClass();
                    m4.invoke(new r0.N(o4));
                }
                return Unit.f7487a;
            case 10:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case RequestError.STOP_TRACKING /* 11 */:
                I0 i02 = (I0) obj2;
                y0.g gVar = i02.f10060k;
                y0.g gVar2 = i02.f10061l;
                Float f7 = i02.f10058i;
                Float f8 = i02.f10059j;
                float floatValue = (gVar == null || f7 == null) ? 0.0f : ((Number) gVar.f11546a.invoke()).floatValue() - f7.floatValue();
                float floatValue2 = (gVar2 == null || f8 == null) ? 0.0f : ((Number) gVar2.f11546a.invoke()).floatValue() - f8.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    C1118D c1118d = (C1118D) obj;
                    int w4 = c1118d.w(i02.f10056d);
                    K0 k02 = (K0) c1118d.l().f(c1118d.f10021n);
                    if (k02 != null) {
                        try {
                            C0508h c0508h = c1118d.f10022o;
                            if (c0508h != null) {
                                c0508h.f5625a.setBoundsInScreen(c1118d.c(k02));
                                Unit unit = Unit.f7487a;
                            }
                        } catch (IllegalStateException unused) {
                            Unit unit2 = Unit.f7487a;
                        }
                    }
                    c1118d.f10011d.invalidate();
                    K0 k03 = (K0) c1118d.l().f(w4);
                    if (k03 != null && (nVar = k03.f10067a) != null && (e4 = nVar.f11586c) != null) {
                        if (gVar != null) {
                            c1118d.f10024q.i(w4, gVar);
                        }
                        if (gVar2 != null) {
                            c1118d.f10025r.i(w4, gVar2);
                        }
                        c1118d.s(e4);
                    }
                }
                if (gVar != null) {
                    i02.f10058i = (Float) gVar.f11546a.invoke();
                }
                if (gVar2 != null) {
                    i02.f10059j = (Float) gVar2.f11546a.invoke();
                }
                return Unit.f7487a;
            case 12:
                ((s1.l) obj2).d((C1193i) obj);
                return Unit.f7487a;
            case 13:
                Y.d dVar = (Y.d) obj2;
                if (dVar != null) {
                    return dVar;
                }
                r0.a0 a0Var3 = (r0.a0) obj;
                if (!a0Var3.O0().f3990s) {
                    a0Var3 = null;
                }
                if (a0Var3 != null) {
                    return j0.c.h(0L, u3.d.U(a0Var3.f9007i));
                }
                return null;
            case 14:
                ((t1.p) obj2).e((C1193i) obj, false);
                return Unit.f7487a;
            case AbstractC1024c.f9246g /* 15 */:
                G0.y yVar = (G0.y) obj2;
                InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) obj;
                if (A0.K.a(yVar.f3094b, ((G0.y) interfaceC0191c0.getValue()).f3094b)) {
                    break;
                }
                interfaceC0191c0.setValue(yVar);
                return Unit.f7487a;
            default:
                ((w.P) obj2).f11074u.invoke(new G0.l(((G0.m) obj).f3072e));
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(s1.l lVar, C1193i c1193i, boolean z4) {
        super(0);
        this.f135d = 12;
        this.f136e = lVar;
        this.f137i = c1193i;
    }
}
