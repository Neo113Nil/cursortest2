package s7;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2 f8870e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8871i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f8872r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q2 f8873s;

    public /* synthetic */ n2(q2 q2Var, c2 c2Var, long j, boolean z10, int i3) {
        this.f8869d = i3;
        this.f8870e = c2Var;
        this.f8871i = j;
        this.f8872r = z10;
        this.f8873s = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8869d) {
            case 0:
                q2 q2Var = this.f8873s;
                c2 c2Var = this.f8870e;
                q2Var.S(c2Var);
                q2Var.I(c2Var, this.f8871i, this.f8872r);
                break;
            default:
                q2 q2Var2 = this.f8873s;
                c2 c2Var2 = this.f8870e;
                q2Var2.S(c2Var2);
                q2Var2.I(c2Var2, this.f8871i, this.f8872r);
                break;
        }
    }
}
