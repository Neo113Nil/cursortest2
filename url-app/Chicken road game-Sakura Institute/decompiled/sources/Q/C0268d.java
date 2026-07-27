package Q;

import G.Y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268d extends C0269e {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0268d(int i2, o oVar) {
        super(i2, oVar, null, r2);
        Function1 function1;
        synchronized (q.f3878b) {
            ?? r12 = q.f3884h;
            Intrinsics.checkNotNullParameter(r12, "<this>");
            function1 = (Function1) (r12.size() == 1 ? r12.get(0) : null);
            function1 = function1 == null ? new C0265a(0, r12) : function1;
        }
    }

    @Override // Q.C0269e
    public final C0269e B(Function1 function1, Function1 function12) {
        return (C0269e) ((AbstractC0274j) q.f(new Y(1, new C0266b(function1, function12, 0))));
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void c() {
        synchronized (q.f3878b) {
            int i2 = this.f3856d;
            if (i2 >= 0) {
                q.u(i2);
                this.f3856d = -1;
            }
            Unit unit = Unit.f7487a;
        }
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void k() {
        w.g();
        throw null;
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void l() {
        w.g();
        throw null;
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void m() {
        q.a();
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final AbstractC0274j t(Function1 function1) {
        return (AbstractC0274j) q.f(new Y(1, new C0267c(0, function1)));
    }

    @Override // Q.C0269e
    public final w v() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
