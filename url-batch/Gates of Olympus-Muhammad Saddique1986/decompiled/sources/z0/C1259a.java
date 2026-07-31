package z0;

import D0.q;
import R1.y;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259a extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10507h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f10508i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Runnable f10509j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1259a(f fVar, Runnable runnable, V1.d dVar) {
        super(2, dVar);
        this.f10508i = fVar;
        this.f10509j = runnable;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1259a) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1259a(this.f10508i, this.f10509j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10507h;
        y yVar = y.f4171a;
        f fVar = this.f10508i;
        if (i3 == 0) {
            R1.a.e(obj);
            q qVar = fVar.f10535e;
            this.f10507h = 1;
            Object b3 = qVar.b(0.0f - qVar.f852b, this);
            if (b3 != aVar) {
                b3 = yVar;
            }
            if (b3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        j jVar = fVar.f10533c;
        jVar.f10542a.setValue(Boolean.FALSE);
        this.f10509j.run();
        return yVar;
    }
}
