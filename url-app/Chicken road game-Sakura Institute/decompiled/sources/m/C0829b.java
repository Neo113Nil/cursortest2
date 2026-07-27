package m;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0932h;
import p.C0935k;
import y2.AbstractC1343r;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0829b extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8076k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0935k f8077l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0932h f8078m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0829b(C0935k c0935k, C0932h c0932h, C2.a aVar) {
        super(2, aVar);
        this.f8077l = c0935k;
        this.f8078m = c0932h;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0829b) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0829b(this.f8077l, this.f8078m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8076k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f8076k = 1;
            if (this.f8077l.b(this.f8078m, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
