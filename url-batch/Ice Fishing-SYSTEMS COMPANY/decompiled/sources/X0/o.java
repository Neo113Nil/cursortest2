package X0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3704c;

    public /* synthetic */ o(v vVar, int i, int i4) {
        this.f3702a = i4;
        this.f3703b = vVar;
        this.f3704c = i;
    }

    @Override // X0.u
    public final void run() {
        switch (this.f3702a) {
            case 0:
                this.f3703b.p(this.f3704c);
                break;
            case 1:
                this.f3703b.s(this.f3704c);
                break;
            default:
                this.f3703b.o(this.f3704c);
                break;
        }
    }
}
