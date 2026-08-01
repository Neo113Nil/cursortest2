package a3;

import a2.n0;
import a2.o0;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import c2.g0;
import d2.c1;
import d2.l0;
import d2.m0;
import d2.r2;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f205e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, Object obj, Object obj2) {
        super(1);
        this.f204d = i3;
        this.f205e = obj;
        this.f206i = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f204d) {
            case 0:
                ((g0) this.f205e).Z(((d1.l) obj).c((d1.l) this.f206i));
                return Unit.f5554a;
            case 1:
                ((n0) obj).h((o0) this.f205e, 0, 0, ((d1.p) this.f206i).C);
                return Unit.f5554a;
            case 2:
                l0 l0Var = (l0) this.f205e;
                m0 m0Var = (m0) this.f206i;
                synchronized (l0Var.f3458s) {
                    l0Var.f3460u.remove(m0Var);
                }
                return Unit.f5554a;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                ((d2.n0) this.f205e).f3485d.removeFrameCallback((m0) this.f206i);
                return Unit.f5554a;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                c1 c1Var = (c1) obj;
                Function2 function2 = (Function2) this.f206i;
                r2 r2Var = (r2) this.f205e;
                if (!r2Var.f3525i) {
                    androidx.lifecycle.u uVar = c1Var.f3355c;
                    View view = c1Var.f3353a;
                    androidx.lifecycle.w g = uVar.g();
                    r2Var.f3527s = function2;
                    if (r2Var.f3526r == null) {
                        if (Intrinsics.a(Looper.myLooper(), view.getHandler().getLooper())) {
                            r2Var.f3526r = g;
                            g.a(r2Var);
                        } else {
                            view.post(new a6.f(5, r2Var, g));
                        }
                    } else if (g.f737c.compareTo(androidx.lifecycle.p.f709i) >= 0) {
                        r2Var.f3524e.z(new x0.d(-1723985096, true, new p(r2Var, c1Var, function2)));
                    }
                }
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                n0.v((n0) obj, (o0) this.f205e, ((k1.l) this.f206i).C);
                return Unit.f5554a;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                n0.v((n0) obj, (o0) this.f205e, ((k1.g0) this.f206i).M);
                return Unit.f5554a;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ((n0) obj).h((o0) this.f205e, 0, 0, ((u.v) this.f206i).f9553c.h());
                return Unit.f5554a;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                Throwable th = (Throwable) obj;
                c3.i iVar = (c3.i) this.f205e;
                if (th == null) {
                    Object E = ((ge.e0) this.f206i).E();
                    iVar.f1739d = true;
                    c3.k kVar = iVar.f1737b;
                    if (kVar != null && kVar.f1742e.j(E)) {
                        iVar.f1736a = null;
                        iVar.f1737b = null;
                        iVar.f1738c = null;
                    }
                } else if (th instanceof CancellationException) {
                    iVar.f1739d = true;
                    c3.k kVar2 = iVar.f1737b;
                    if (kVar2 != null && kVar2.f1742e.cancel(true)) {
                        iVar.f1736a = null;
                        iVar.f1737b = null;
                        iVar.f1738c = null;
                    }
                } else {
                    iVar.f1739d = true;
                    c3.k kVar3 = iVar.f1737b;
                    if (kVar3 != null && kVar3.f1742e.k(th)) {
                        iVar.f1736a = null;
                        iVar.f1737b = null;
                        iVar.f1738c = null;
                    }
                }
                return Unit.f5554a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                x1.q qVar = (x1.q) this.f206i;
                if (motionEvent.getActionMasked() == 0) {
                    c6.i iVar2 = (c6.i) this.f205e;
                    g gVar = qVar.f10311a;
                    if (gVar == null) {
                        Intrinsics.f("onTouchEvent");
                        throw null;
                    }
                    iVar2.f1821b = ((Boolean) gVar.invoke(motionEvent)).booleanValue() ? x1.o.f10306e : x1.o.f10307i;
                } else {
                    g gVar2 = qVar.f10311a;
                    if (gVar2 == null) {
                        Intrinsics.f("onTouchEvent");
                        throw null;
                    }
                    gVar2.invoke(motionEvent);
                }
                return Unit.f5554a;
        }
    }
}
