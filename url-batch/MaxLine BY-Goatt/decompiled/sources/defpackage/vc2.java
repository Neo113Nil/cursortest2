package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vc2 extends r30 implements ym0 {
    public final ym0 m;
    public final CoroutineContext n;
    public final int o;
    public CoroutineContext p;
    public o30 q;

    public vc2(ym0 ym0Var, CoroutineContext coroutineContext) {
        super(as1.m, h.m);
        this.m = ym0Var;
        this.n = coroutineContext;
        this.o = ((Number) coroutineContext.y(0, new ww(18))).intValue();
    }

    @Override // defpackage.ym0
    public final Object d(Object obj, o30 o30Var) {
        try {
            Object f = f(o30Var, obj);
            return f == b50.m ? f : Unit.a;
        } catch (Throwable th) {
            this.p = new oc0(th, o30Var.getContext());
            throw th;
        }
    }

    public final Object f(o30 o30Var, Object obj) {
        CoroutineContext context = o30Var.getContext();
        l41.C(context);
        CoroutineContext coroutineContext = this.p;
        if (coroutineContext != context) {
            if (coroutineContext instanceof oc0) {
                throw new IllegalStateException(np2.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((oc0) coroutineContext).n + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.y(0, new ia(5, this))).intValue() != this.o) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.n + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.p = context;
        }
        this.q = o30Var;
        xt0 xt0Var = xc2.a;
        ym0 ym0Var = this.m;
        ym0Var.getClass();
        Object a = xt0Var.a(ym0Var, obj, this);
        if (!Intrinsics.b(a, b50.m)) {
            this.q = null;
        }
        return a;
    }

    @Override // defpackage.hn, defpackage.c50
    public final c50 getCallerFrame() {
        o30 o30Var = this.q;
        if (o30Var instanceof c50) {
            return (c50) o30Var;
        }
        return null;
    }

    @Override // defpackage.r30, defpackage.o30
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.p;
        return coroutineContext == null ? h.m : coroutineContext;
    }

    @Override // defpackage.hn
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        Throwable a = aa2.a(obj);
        if (a != null) {
            this.p = new oc0(a, getContext());
        }
        o30 o30Var = this.q;
        if (o30Var != null) {
            o30Var.resumeWith(obj);
        }
        return b50.m;
    }
}
