package I1;

import L1.z;
import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class k extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f2479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f2480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, P1.d dVar) {
        super(2, dVar);
        this.f2480f = mVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new k(this.f2480f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((k) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f2479e;
        if (i3 == 0) {
            I2.l.Q(obj);
            m mVar = this.f2480f;
            com.gates.olympus.miruv.data.e eVar = mVar.f2483b;
            i iVar = (i) mVar.f2484c.getValue();
            int i4 = iVar.f2471b;
            int i5 = i4 == 0 ? 0 : (iVar.f2473d * 100) / i4;
            this.f2479e = 1;
            if (eVar.recordGame("match", i5, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return z.f2729a;
    }
}
