package w;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l0.C0802C;
import y2.AbstractC1343r;

/* renamed from: w.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1284y extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11366k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0802C f11367l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f11368m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1284y(C0802C c0802c, Y y4, C2.a aVar) {
        super(2, aVar);
        this.f11367l = c0802c;
        this.f11368m = y4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1284y) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1284y(this.f11367l, this.f11368m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2 = D2.a.f2163d;
        int i2 = this.f11366k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f11366k = 1;
            Object d4 = W2.B.d(new T(this.f11367l, this.f11368m, null), this);
            if (d4 != obj2) {
                d4 = Unit.f7487a;
            }
            if (d4 == obj2) {
                return obj2;
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
