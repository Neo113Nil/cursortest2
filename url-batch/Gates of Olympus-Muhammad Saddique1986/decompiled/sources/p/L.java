package p;

import a0.C0238c;
import e2.InterfaceC0427f;

/* loaded from: classes.dex */
public final class L extends X1.i implements InterfaceC0427f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7550h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i3, V1.d dVar, int i4) {
        super(i3, dVar);
        this.f7550h = i4;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        switch (this.f7550h) {
            case 0:
                long j3 = ((C0238c) obj2).f4722a;
                L l3 = new L(3, (V1.d) obj3, 0);
                R1.y yVar = R1.y.f4171a;
                l3.q(yVar);
                return yVar;
            case 1:
                ((Number) obj2).floatValue();
                L l4 = new L(3, (V1.d) obj3, 1);
                R1.y yVar2 = R1.y.f4171a;
                l4.q(yVar2);
                return yVar2;
            default:
                long j4 = ((C0238c) obj2).f4722a;
                L l5 = new L(3, (V1.d) obj3, 2);
                R1.y yVar3 = R1.y.f4171a;
                l5.q(yVar3);
                return yVar3;
        }
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.y yVar = R1.y.f4171a;
        switch (this.f7550h) {
            case 0:
                R1.a.e(obj);
                break;
            case 1:
                R1.a.e(obj);
                break;
            default:
                R1.a.e(obj);
                break;
        }
        return yVar;
    }
}
