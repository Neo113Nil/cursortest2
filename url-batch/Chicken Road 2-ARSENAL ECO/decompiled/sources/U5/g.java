package U5;

import T5.C0187c;
import java.util.List;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class g implements Q5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2642a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f2643b = f.f2639b;

    @Override // Q5.a
    public final void a(V5.s sVar, Object obj) {
        e value = (e) obj;
        kotlin.jvm.internal.i.e(value, "value");
        AbstractC0521b.a(sVar);
        o oVar = o.f2662a;
        new C0187c().a(sVar, value);
    }

    @Override // Q5.a
    public final Object b(S5.b bVar) {
        AbstractC0521b.b(bVar);
        o oVar = o.f2662a;
        return new e((List) new C0187c().b(bVar));
    }

    @Override // Q5.a
    public final R5.e c() {
        return f2643b;
    }
}
