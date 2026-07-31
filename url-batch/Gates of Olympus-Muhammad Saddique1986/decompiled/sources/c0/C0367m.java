package c0;

/* renamed from: c0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0367m implements InterfaceC0363i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5513a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0371q f5514b;

    public /* synthetic */ C0367m(C0371q c0371q, int i3) {
        this.f5513a = i3;
        this.f5514b = c0371q;
    }

    @Override // c0.InterfaceC0363i
    public final double b(double d3) {
        switch (this.f5513a) {
            case 0:
                return O2.d.w(this.f5514b.f5529k.b(d3), r0.f5523e, r0.f5524f);
            default:
                return this.f5514b.f5532n.b(O2.d.w(d3, r0.f5523e, r0.f5524f));
        }
    }
}
