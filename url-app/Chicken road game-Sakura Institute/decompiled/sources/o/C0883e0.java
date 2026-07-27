package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0883e0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8761k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f8762l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0883e0(long j4, C2.a aVar) {
        super(2, aVar);
        this.f8762l = j4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0883e0) j((C2.a) obj2, (C0903o0) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0883e0 c0883e0 = new C0883e0(this.f8762l, aVar);
        c0883e0.f8761k = obj;
        return c0883e0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        C0908r0 c0908r0 = ((C0903o0) this.f8761k).f8848a;
        C0908r0.a(c0908r0, c0908r0.f8872h, this.f8762l, 1);
        return Unit.f7487a;
    }
}
