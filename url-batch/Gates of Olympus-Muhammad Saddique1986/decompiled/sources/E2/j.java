package E2;

import R1.y;
import e2.InterfaceC0427f;

/* loaded from: classes.dex */
public final class j extends X1.h implements InterfaceC0427f {

    /* renamed from: f, reason: collision with root package name */
    public int f1056f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ R1.b f1057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f1058h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, V1.d dVar) {
        super(3, dVar);
        this.f1058h = lVar;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        j jVar = new j(this.f1058h, (V1.d) obj3);
        jVar.f1057g = (R1.b) obj;
        return jVar.q(y.f4171a);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f1056f;
        if (i3 == 0) {
            R1.a.e(obj);
            R1.b bVar = this.f1057g;
            l lVar = this.f1058h;
            byte r3 = ((o) lVar.f1069d).r();
            if (r3 == 1) {
                return lVar.e(true);
            }
            if (r3 == 0) {
                return lVar.e(false);
            }
            if (r3 != 6) {
                if (r3 == 8) {
                    return lVar.d();
                }
                o.n((o) lVar.f1069d, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f1056f = 1;
            obj = l.a(lVar, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return (D2.k) obj;
    }
}
