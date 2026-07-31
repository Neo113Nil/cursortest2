package c;

import B.U;
import R1.y;
import X1.i;
import e2.InterfaceC0426e;
import f2.q;
import q2.InterfaceC0835w;
import t2.C1049b;
import t2.C1058k;

/* loaded from: classes.dex */
public final class e extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public q f5450h;

    /* renamed from: i, reason: collision with root package name */
    public int f5451i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f5452j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f5453k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f5454l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC0426e interfaceC0426e, U u3, V1.d dVar) {
        super(2, dVar);
        this.f5452j = fVar;
        this.f5453k = interfaceC0426e;
        this.f5454l = u3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((e) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new e(this.f5452j, this.f5453k, this.f5454l, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        q qVar;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f5451i;
        boolean z3 = true;
        if (i3 == 0) {
            R1.a.e(obj);
            if (this.f5452j.f5337a) {
                q qVar2 = new q();
                C1058k c1058k = new C1058k(new C1049b((s2.g) this.f5454l.f319c, z3), new d(qVar2, null, 0));
                this.f5450h = qVar2;
                this.f5451i = 1;
                if (this.f5453k.h(c1058k, this) == aVar) {
                    return aVar;
                }
                qVar = qVar2;
            }
            return y.f4171a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qVar = this.f5450h;
        R1.a.e(obj);
        if (!qVar.f5828d) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return y.f4171a;
    }
}
