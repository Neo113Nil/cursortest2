package B1;

import j1.C0708b;
import j1.C0710d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class C extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f945k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f946l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(I i2, C2.a aVar) {
        super(2, aVar);
        this.f946l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C) j((C2.a) obj2, (C0708b) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C c4 = new C(this.f946l, aVar);
        c4.f945k = obj;
        return c4;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        C0708b c0708b = (C0708b) this.f945k;
        I i2 = this.f946l;
        Boolean bool = Boolean.TRUE;
        c0708b.getClass();
        C0710d key = i2.f966d;
        Intrinsics.checkNotNullParameter(key, "key");
        c0708b.c(key, bool);
        return Unit.f7487a;
    }
}
