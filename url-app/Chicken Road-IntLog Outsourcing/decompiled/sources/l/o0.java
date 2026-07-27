package l;

/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f10927b;

    public /* synthetic */ o0(p0 p0Var, int i2) {
        this.f10926a = i2;
        this.f10927b = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10926a) {
            case 0:
                this.f10927b.c(false);
                break;
            default:
                this.f10927b.a();
                break;
        }
    }
}
