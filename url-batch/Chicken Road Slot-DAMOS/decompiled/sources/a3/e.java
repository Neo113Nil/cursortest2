package a3;

import a2.f1;
import a2.g1;
import a2.h1;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import c2.b2;
import c2.g0;
import c2.h0;
import c2.i1;
import c2.l0;
import c2.o0;
import com.appsflyer.attribution.RequestError;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k1.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.z0;
import s.i0;
import te.a1;
import x3.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d9.c cVar, g1.e eVar, wd.z zVar) {
        super(1);
        this.f207d = 11;
        this.f208e = zVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [a2.o0, c2.a] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MeasurementManager measurementManager;
        int i3 = this.f207d;
        int i10 = 1;
        ld.a aVar = null;
        int i11 = 0;
        Object obj2 = this.f208e;
        switch (i3) {
            case 0:
                ((g0) obj2).V((x2.c) obj);
                return Unit.f5554a;
            case 1:
                j1.c cVar = (j1.c) obj;
                u uVar = (u) obj2;
                if (uVar.B) {
                    ge.a0.s(uVar.w(), null, new t(uVar, cVar, aVar, i11), 3);
                }
                return Unit.f5554a;
            case 2:
                c2.a aVar2 = (c2.a) obj;
                h0 h0Var = (h0) obj2;
                if (aVar2.P() != Integer.MAX_VALUE) {
                    if (aVar2.a().f1571b) {
                        aVar2.B();
                    }
                    for (Map.Entry entry : aVar2.a().g.entrySet()) {
                        h0.a(h0Var, (a2.a) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar2.v());
                    }
                    i1 i1Var = aVar2.v().D;
                    i1Var.getClass();
                    while (!i1Var.equals(h0Var.f1570a.v())) {
                        for (a2.a aVar3 : h0Var.b(i1Var).keySet()) {
                            h0.a(h0Var, aVar3, h0Var.c(i1Var, aVar3), i1Var);
                        }
                        i1Var = i1Var.D;
                        i1Var.getClass();
                    }
                }
                return Unit.f5554a;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((o0.e) obj2).b((d1.j) obj);
                return Boolean.TRUE;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return Boolean.valueOf(((i1.t) obj).O(((i1.c) obj2).f4589a));
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                l0 l0Var = (l0) obj;
                d2.v vVar = ((d2.l) obj2).D;
                if (vVar.getInsetsListener().f126u.h() > 0) {
                    s.w wVar = h1.f99a;
                    l0Var.f1608d = true;
                    o0 o0Var = l0Var.f1611r;
                    a2.n i02 = o0Var.i0();
                    if (x2.i.a(l0Var.f1609e, 9223372034707292159L)) {
                        l0Var.f1609e = j0.c(i02.b(0L));
                        l0Var.f1610i = i02.J();
                    }
                    o0Var.k0().T.b();
                    long J = i02.J();
                    s.h0 h0Var2 = vVar.getInsetsListener().f125t;
                    int i12 = (int) (J >> 32);
                    int i13 = (int) (J & 4294967295L);
                    f1[] f1VarArr = h1.f100b;
                    int length = f1VarArr.length;
                    int i14 = 0;
                    while (i14 < length) {
                        f1 f1Var = f1VarArr[i14];
                        Object g = h0Var2.g(f1Var);
                        g.getClass();
                        a2.i1 i1Var2 = (a2.i1) g;
                        g1 g1Var = (g1) f1Var;
                        l0 l0Var2 = l0Var;
                        h1.a(l0Var2, g1Var.f93c, i1Var2.f107h, i12, i13);
                        if (((Boolean) i1Var2.f102b.getValue()).booleanValue()) {
                            h1.a(l0Var2, i1Var2.f106f, i1Var2.j, i12, i13);
                            h1.a(l0Var2, i1Var2.g, i1Var2.f109k, i12, i13);
                        }
                        h1.a(l0Var2, g1Var.f94d, i1Var2.f108i, i12, i13);
                        i14++;
                        l0Var = l0Var2;
                    }
                    l0 l0Var3 = l0Var;
                    s.d0 d0Var = vVar.getInsetsListener().f127v;
                    if (d0Var.i()) {
                        b1.w wVar2 = vVar.getInsetsListener().f128w;
                        Object[] objArr = d0Var.f8284a;
                        int i15 = d0Var.f8285b;
                        while (i11 < i15) {
                            z0 z0Var = (z0) objArr[i11];
                            a2.l lVar = (a2.l) wVar2.get(i11);
                            Rect rect = (Rect) z0Var.getValue();
                            l0Var3.a(lVar.b(), rect.left);
                            l0Var3.a(lVar.d(), rect.top);
                            l0Var3.a(lVar.c(), rect.right);
                            l0Var3.a(lVar.a(), rect.bottom);
                            i11++;
                        }
                    }
                }
                return Unit.f5554a;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.valueOf(((s.k) obj2).a(((j2.m) obj).f4985f));
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(d2.h0.c((j2.m) obj, (Resources) obj2));
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new b3.a(i10, (d2.f1) obj2);
            case 9:
                if (d2.h1.f3418b.compareAndSet(false, true)) {
                    ((ie.c) obj2).b(Unit.f5554a);
                }
                return Unit.f5554a;
            case 10:
                m1.d dVar = (m1.d) obj;
                k1.n p4 = dVar.s().p();
                Function2 function2 = ((d2.i1) obj2).f3434r;
                if (function2 != null) {
                    function2.invoke(p4, (n1.b) dVar.s().f40e);
                }
                return Unit.f5554a;
            case RequestError.STOP_TRACKING /* 11 */:
                g1.e eVar = (g1.e) obj;
                if (!eVar.B) {
                    return b2.f1500e;
                }
                if (eVar.D != null) {
                    z1.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                eVar.D = null;
                wd.z zVar = (wd.z) obj2;
                zVar.f10164d = zVar.f10164d;
                return b2.f1499d;
            case 12:
                g1.e eVar2 = (g1.e) obj;
                if (!eVar2.f3305d.B) {
                    return b2.f1500e;
                }
                g1.e eVar3 = eVar2.D;
                if (eVar3 != null) {
                    e eVar4 = new e(12, (d9.c) obj2);
                    if (eVar4.invoke(eVar3) == b2.f1499d) {
                        c2.k.y(eVar3, eVar4);
                    }
                }
                eVar2.D = null;
                eVar2.C = null;
                return b2.f1499d;
            case 13:
                j2.s.a((j2.u) obj, ((j2.g) obj2).f4938a);
                return Unit.f5554a;
            case 14:
                wd.y[] yVarArr = j2.s.f5019a;
                ((j2.u) obj).b(j2.q.f4993a, kotlin.collections.x.c((String) obj2));
                return Unit.f5554a;
            case 15:
                k1.d0 d0Var2 = (k1.d0) obj;
                k1.g0 g0Var = (k1.g0) obj2;
                d0Var2.c(g0Var.C);
                d0Var2.e(g0Var.D);
                d0Var2.b(g0Var.E);
                float f3 = g0Var.F;
                if (d0Var2.f5308u != f3) {
                    d0Var2.f5302d |= 2048;
                    d0Var2.f5308u = f3;
                }
                d0Var2.h(g0Var.G);
                f0 f0Var = g0Var.H;
                if (!Intrinsics.a(d0Var2.f5310w, f0Var)) {
                    d0Var2.f5302d |= 8192;
                    d0Var2.f5310w = f0Var;
                }
                boolean z10 = g0Var.I;
                if (d0Var2.f5311x != z10) {
                    d0Var2.f5302d |= 16384;
                    d0Var2.f5311x = z10;
                }
                long j = g0Var.J;
                if (!k1.p.c(d0Var2.f5306s, j)) {
                    d0Var2.f5302d |= 64;
                    d0Var2.f5306s = j;
                }
                long j3 = g0Var.K;
                if (!k1.p.c(d0Var2.f5307t, j3)) {
                    d0Var2.f5302d |= 128;
                    d0Var2.f5307t = j3;
                }
                int i16 = g0Var.L;
                if (d0Var2.B != i16) {
                    d0Var2.f5302d |= 524288;
                    d0Var2.B = i16;
                }
                return Unit.f5554a;
            case 16:
                m1.d dVar2 = (m1.d) obj;
                n1.b bVar = (n1.b) obj2;
                k1.g gVar = bVar.f6909l;
                if (bVar.f6911n && bVar.f6920w && gVar != null) {
                    a1.n s3 = dVar2.s();
                    long u2 = s3.u();
                    s3.p().h();
                    try {
                        ((a1.n) ((l.d) s3.f41i).f5643e).p().n(gVar);
                        bVar.c(dVar2);
                    } finally {
                        s3.p().f();
                        s3.K(u2);
                    }
                } else {
                    bVar.c(dVar2);
                }
                return Unit.f5554a;
            case 17:
                q1.c0 c0Var = (q1.c0) obj;
                q1.c cVar2 = (q1.c) obj2;
                cVar2.g(c0Var);
                Function1 function1 = cVar2.f7806i;
                if (function1 != null) {
                    function1.invoke(c0Var);
                }
                return Unit.f5554a;
            case 18:
                return obj == ((s.d0) obj2) ? "(this)" : String.valueOf(obj);
            case 19:
                return obj == ((s.e0) obj2) ? "(this)" : String.valueOf(obj);
            case 20:
                return obj == ((i0) obj2) ? "(this)" : String.valueOf(obj);
            case 21:
                Throwable th = (Throwable) obj;
                e6.j jVar = ((t5.i) obj2).f9309d;
                if (th == null) {
                    if (!jVar.isDone()) {
                        a1.e("Failed requirement.");
                        return null;
                    }
                } else if (th instanceof CancellationException) {
                    jVar.cancel(true);
                } else {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    jVar.j(th);
                }
                return Unit.f5554a;
            case 22:
                ((ListenableFuture) obj2).cancel(false);
                return Unit.f5554a;
            case 23:
                return Boolean.valueOf(Intrinsics.a(obj, obj2));
            default:
                ((Context) obj).getClass();
                Context context = (Context) obj2;
                context.getClass();
                measurementManager = MeasurementManager.get(context);
                measurementManager.getClass();
                return new x4.b(measurementManager);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i3, Object obj) {
        super(1);
        this.f207d = i3;
        this.f208e = obj;
    }
}
