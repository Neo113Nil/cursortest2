package L1;

import t2.InterfaceC1053f;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class y implements InterfaceC1053f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1053f f3403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f3404f;

    public /* synthetic */ y(InterfaceC1053f interfaceC1053f, A a3, int i3) {
        this.f3402d = i3;
        this.f3403e = interfaceC1053f;
        this.f3404f = a3;
    }

    @Override // t2.InterfaceC1053f
    public final Object d(InterfaceC1054g interfaceC1054g, V1.d dVar) {
        switch (this.f3402d) {
            case 0:
                Object d3 = this.f3403e.d(new x(interfaceC1054g, this.f3404f, 0), dVar);
                if (d3 != W1.a.f4608d) {
                    break;
                }
                break;
            default:
                Object d4 = this.f3403e.d(new x(interfaceC1054g, this.f3404f, 1), dVar);
                if (d4 != W1.a.f4608d) {
                    break;
                }
                break;
        }
        return R1.y.f4171a;
    }
}
