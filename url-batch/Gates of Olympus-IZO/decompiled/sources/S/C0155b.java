package S;

/* renamed from: S.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155b extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y1.c f3189f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Y1.c f3190g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0155b(Y1.c cVar, Y1.c cVar2, int i3) {
        super(1);
        this.f3188e = i3;
        this.f3189f = cVar;
        this.f3190g = cVar2;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        int i3;
        switch (this.f3188e) {
            case 0:
                n nVar = (n) obj;
                synchronized (q.f3235b) {
                    i3 = q.f3237d;
                    q.f3237d = i3 + 1;
                }
                return new e(i3, nVar, this.f3189f, this.f3190g);
            case 1:
                this.f3189f.j(obj);
                this.f3190g.j(obj);
                return L1.z.f2729a;
            default:
                this.f3189f.j(obj);
                this.f3190g.j(obj);
                return L1.z.f2729a;
        }
    }
}
