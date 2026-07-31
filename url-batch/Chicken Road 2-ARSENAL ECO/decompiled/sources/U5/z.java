package U5;

import T5.U;
import java.util.Map;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class z implements Q5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final z f2676a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final y f2677b = y.f2673b;

    @Override // Q5.a
    public final void a(V5.s sVar, Object obj) {
        x value = (x) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC0521b.a(sVar);
        U u6 = U.f2407a;
        o oVar = o.f2662a;
        new T5.B().a(sVar, value);
    }

    @Override // Q5.a
    public final Object b(S5.b bVar) {
        AbstractC0521b.b(bVar);
        U u6 = U.f2407a;
        o oVar = o.f2662a;
        return new x((Map) new T5.B().b(bVar));
    }

    @Override // Q5.a
    public final R5.e c() {
        return f2677b;
    }
}
