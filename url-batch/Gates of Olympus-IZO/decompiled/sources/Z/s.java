package Z;

import L1.z;

/* loaded from: classes.dex */
public final class s extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f3457f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(q qVar, int i3) {
        super(0);
        this.f3456e = i3;
        this.f3457f = qVar;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f3456e) {
            case 0:
                this.f3457f.v0();
                break;
            default:
                q qVar = this.f3457f;
                if (qVar.f3303d.p) {
                    c.A(qVar);
                }
                break;
        }
        return z.f2729a;
    }
}
