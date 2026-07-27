package a0;

/* renamed from: a0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0358m implements InterfaceC0354i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0362q f4801b;

    public /* synthetic */ C0358m(C0362q c0362q, int i2) {
        this.f4800a = i2;
        this.f4801b = c0362q;
    }

    @Override // a0.InterfaceC0354i
    public final double c(double d4) {
        switch (this.f4800a) {
            case 0:
                return kotlin.ranges.b.c(this.f4801b.f4816k.c(d4), r0.f4810e, r0.f4811f);
            default:
                return this.f4801b.f4819n.c(kotlin.ranges.b.c(d4, r0.f4810e, r0.f4811f));
        }
    }
}
