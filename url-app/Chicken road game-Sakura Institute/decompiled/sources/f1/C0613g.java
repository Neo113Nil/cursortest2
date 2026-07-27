package f1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y2.AbstractC1343r;

/* renamed from: f1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613g extends E2.j implements Function1 {

    /* renamed from: k, reason: collision with root package name */
    public int f6575k;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C0613g(1, (C2.a) obj).l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6575k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f6575k = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1343r.b(obj);
        return Unit.f7487a;
    }
}
