package l;

/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f9883b;

    public /* synthetic */ r0(s0 s0Var, int i3) {
        this.f9882a = i3;
        this.f9883b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9882a) {
            case 0:
                this.f9883b.c(false);
                break;
            default:
                this.f9883b.a();
                break;
        }
    }
}
