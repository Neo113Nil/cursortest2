package f1;

import h1.C0650c;
import kotlin.Unit;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class Z extends E2.j implements L2.c {

    /* renamed from: k, reason: collision with root package name */
    public int f6558k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ C0650c f6559l;

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        Z z4 = new Z(3, (C2.a) obj3);
        z4.f6559l = (C0650c) obj;
        return z4.l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6558k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0650c c0650c = this.f6559l;
            this.f6558k = 1;
            c0650c.getClass();
            obj = C0650c.a(c0650c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return obj;
    }
}
