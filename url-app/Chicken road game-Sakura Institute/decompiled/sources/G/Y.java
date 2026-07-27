package G;

import Q.AbstractC0274j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l.C0786l;

/* loaded from: classes.dex */
public final class Y extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ M2.p f2783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y(int i2, Function1 function1) {
        super(1);
        this.f2782d = i2;
        switch (i2) {
            case 1:
                this.f2783e = (M2.p) function1;
                super(1);
                break;
            case 2:
            default:
                this.f2783e = (M2.p) function1;
                break;
            case 3:
                this.f2783e = (M2.p) function1;
                super(1);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [M2.p, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2782d) {
            case 0:
                return this.f2783e.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                AbstractC0274j abstractC0274j = (AbstractC0274j) this.f2783e.invoke((Q.o) obj);
                synchronized (Q.q.f3878b) {
                    Q.q.f3879c = Q.q.f3879c.B(abstractC0274j.d());
                    Unit unit = Unit.f7487a;
                }
                return abstractC0274j;
            case 2:
                C0786l c0786l = (C0786l) obj;
                Object value = c0786l.f7794e.getValue();
                l.v0 v0Var = l.w0.f7856a;
                this.f2783e.h(value, l.d0.f7717p.invoke(c0786l.f7795f));
                return Unit.f7487a;
            default:
                return this.f2783e.invoke(Long.valueOf(((Number) obj).longValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y(Function2 function2) {
        super(1);
        this.f2782d = 2;
        l.v0 v0Var = l.w0.f7856a;
        this.f2783e = (M2.p) function2;
    }
}
