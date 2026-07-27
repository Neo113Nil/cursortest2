package l;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y2.AbstractC1343r;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776c extends E2.j implements Function1 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0778d f7691k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f7692l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0776c(C0778d c0778d, Object obj, C2.a aVar) {
        super(1, aVar);
        this.f7691k = c0778d;
        this.f7692l = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C0776c(this.f7691k, this.f7692l, (C2.a) obj).l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        C0778d c0778d = this.f7691k;
        C0778d.b(c0778d);
        Object a4 = C0778d.a(c0778d, this.f7692l);
        c0778d.f7700c.f7813e.setValue(a4);
        c0778d.f7702e.setValue(a4);
        return Unit.f7487a;
    }
}
