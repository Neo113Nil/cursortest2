package Z;

import R1.y;
import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class u extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f4710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(t tVar, int i3) {
        super(0);
        this.f4709e = i3;
        this.f4710f = tVar;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f4709e) {
            case 0:
                this.f4710f.y0();
                break;
            default:
                t tVar = this.f4710f;
                if (tVar.f4489d.f4501p) {
                    d.A(tVar);
                }
                break;
        }
        return y.f4171a;
    }
}
