package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 extends w0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f254h;
    public final Object i;

    public /* synthetic */ f0(int i, Object obj) {
        this.f254h = i;
        this.i = obj;
    }

    @Override // a7.w0
    public final boolean k() {
        switch (this.f254h) {
        }
        return false;
    }

    @Override // a7.w0
    public final void l(Throwable th) {
        switch (this.f254h) {
            case 0:
                ((e0) this.i).a();
                break;
            case 1:
                ((p6.c) this.i).i(th);
                break;
            default:
                x0 x0Var = (x0) this.i;
                Object obj = a1.f240d.get(j());
                if (!(obj instanceof o)) {
                    x0Var.k(x.s(obj));
                    break;
                } else {
                    x0Var.k(s6.a.l(((o) obj).f286a));
                    break;
                }
        }
    }
}
