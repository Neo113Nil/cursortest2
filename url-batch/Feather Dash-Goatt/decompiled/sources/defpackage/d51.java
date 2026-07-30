package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d51 extends fn implements d00 {
    public final d00 h;
    public final CoroutineContext i;
    public final int j;
    public CoroutineContext k;
    public dn l;

    public d51(d00 d00Var, CoroutineContext coroutineContext) {
        super(hp0.d, g.d);
        this.h = d00Var;
        this.i = coroutineContext;
        this.j = ((Number) coroutineContext.p(0, new e9(12, (byte) 0))).intValue();
    }

    @Override // defpackage.yc, defpackage.un
    public final un c() {
        dn dnVar = this.l;
        if (dnVar instanceof un) {
            return (un) dnVar;
        }
        return null;
    }

    @Override // defpackage.d00
    public final Object e(Object obj, dn dnVar) {
        try {
            Object o = o(dnVar, obj);
            return o == tn.d ? o : Unit.a;
        } catch (Throwable th) {
            this.k = new at(th, dnVar.g());
            throw th;
        }
    }

    @Override // defpackage.fn, defpackage.dn
    public final CoroutineContext g() {
        CoroutineContext coroutineContext = this.k;
        return coroutineContext == null ? g.d : coroutineContext;
    }

    @Override // defpackage.yc
    public final StackTraceElement j() {
        return null;
    }

    @Override // defpackage.yc
    public final Object k(Object obj) {
        Throwable a = k31.a(obj);
        if (a != null) {
            this.k = new at(a, g());
        }
        dn dnVar = this.l;
        if (dnVar != null) {
            dnVar.l(obj);
        }
        return tn.d;
    }

    public final Object o(dn dnVar, Object obj) {
        CoroutineContext g = dnVar.g();
        t80.l(g);
        CoroutineContext coroutineContext = this.k;
        if (coroutineContext != g) {
            if (coroutineContext instanceof at) {
                throw new IllegalStateException(b.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((at) coroutineContext).e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) g.p(0, new jl(7, this))).intValue() != this.j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.i + ",\n\t\tbut emission happened in " + g + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.k = g;
        }
        this.l = dnVar;
        s30 s30Var = f51.a;
        d00 d00Var = this.h;
        d00Var.getClass();
        Object a = s30Var.a(d00Var, obj, this);
        if (!Intrinsics.a(a, tn.d)) {
            this.l = null;
        }
        return a;
    }
}
