package T5;

import java.util.Iterator;

/* renamed from: T5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0197m extends AbstractC0185a {

    /* renamed from: a, reason: collision with root package name */
    public final Q5.a f2447a;

    public AbstractC0197m(Q5.a aVar) {
        this.f2447a = aVar;
    }

    @Override // Q5.a
    public void a(V5.s sVar, Object obj) {
        int g7 = g(obj);
        R5.e descriptor = c();
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        V5.s a7 = sVar.a(descriptor);
        Iterator f7 = f(obj);
        for (int i7 = 0; i7 < g7; i7++) {
            a7.l(c(), i7, this.f2447a, f7.next());
        }
        a7.p(descriptor);
    }

    @Override // T5.AbstractC0185a
    public void i(S5.a aVar, int i7, Object obj) {
        l(obj, i7, aVar.k(c(), i7, this.f2447a, null));
    }

    public abstract void l(Object obj, int i7, Object obj2);
}
