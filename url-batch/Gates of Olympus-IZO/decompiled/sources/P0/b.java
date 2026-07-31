package P0;

import L1.z;

/* loaded from: classes.dex */
public final class b extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f3024f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q qVar, int i3) {
        super(1);
        this.f3023e = i3;
        this.f3024f = qVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f3023e) {
            case 0:
                q qVar = this.f3024f;
                qVar.show();
                return new a(0, qVar);
            default:
                q qVar2 = this.f3024f;
                if (qVar2.f3062h.f3054a) {
                    qVar2.f3061g.b();
                }
                return z.f2729a;
        }
    }
}
