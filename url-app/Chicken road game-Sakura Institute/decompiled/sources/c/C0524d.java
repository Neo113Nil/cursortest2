package c;

import E2.j;
import M2.A;
import W2.r0;
import kotlin.Unit;
import y2.AbstractC1343r;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524d extends j implements L2.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5703k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5704l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0524d(Object obj, C2.a aVar, int i2) {
        super(3, aVar);
        this.f5703k = i2;
        this.f5704l = obj;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        C2.a aVar = (C2.a) obj3;
        switch (this.f5703k) {
            case 0:
                return new C0524d((A) this.f5704l, aVar, 0).l(Unit.f7487a);
            default:
                return new C0524d((r0) this.f5704l, aVar, 1).l(Unit.f7487a);
        }
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = this.f5704l;
        switch (this.f5703k) {
            case 0:
                D2.a aVar = D2.a.f2163d;
                AbstractC1343r.b(obj);
                ((A) obj2).f3576d = true;
                break;
            default:
                D2.a aVar2 = D2.a.f2163d;
                AbstractC1343r.b(obj);
                ((r0) obj2).a(null);
                break;
        }
        return Unit.f7487a;
    }
}
