package W;

/* loaded from: classes.dex */
public final /* synthetic */ class K implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f3276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3278d;

    public /* synthetic */ K(Object obj, boolean z, boolean z4, int i4) {
        this.f3275a = i4;
        this.f3278d = obj;
        this.f3276b = z;
        this.f3277c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3275a) {
            case 0:
                l2.e.i((l2.e) ((M) this.f3278d).f3289f, this.f3276b, this.f3277c);
                break;
            default:
                ((l2.e) ((M) this.f3278d).f3289f).t(this.f3276b, this.f3277c);
                break;
        }
    }
}
