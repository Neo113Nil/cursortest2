package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class uw extends pr2 implements Function2 {
    public int m;
    public final /* synthetic */ xm0[] n;
    public final /* synthetic */ int o;
    public final /* synthetic */ AtomicInteger p;
    public final /* synthetic */ lq q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(xm0[] xm0VarArr, int i, AtomicInteger atomicInteger, lq lqVar, o30 o30Var) {
        super(2, o30Var);
        this.n = xm0VarArr;
        this.o = i;
        this.p = atomicInteger;
        this.q = lqVar;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        return new uw(this.n, this.o, this.p, this.q, o30Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((uw) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.hn
    public final Object invokeSuspend(Object obj) {
        b50 b50Var = b50.m;
        int i = this.m;
        AtomicInteger atomicInteger = this.p;
        lq lqVar = this.q;
        try {
            if (i == 0) {
                ca2.b(obj);
                xm0[] xm0VarArr = this.n;
                int i2 = this.o;
                xm0 xm0Var = xm0VarArr[i2];
                tw twVar = new tw(lqVar, i2);
                this.m = 1;
                if (xm0Var.a(twVar, this) == b50Var) {
                    return b50Var;
                }
            } else {
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                ti2.d(lqVar);
            }
            return Unit.a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                ti2.d(lqVar);
            }
        }
    }
}
