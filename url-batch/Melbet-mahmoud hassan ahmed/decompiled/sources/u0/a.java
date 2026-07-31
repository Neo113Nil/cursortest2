package u0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: f, reason: collision with root package name */
    private int f22385f;

    public final void g(int i7) {
        this.f22385f = i7 | this.f22385f;
    }

    public void h() {
        this.f22385f = 0;
    }

    public final void i(int i7) {
        this.f22385f = (i7 ^ (-1)) & this.f22385f;
    }

    protected final boolean j(int i7) {
        return (this.f22385f & i7) == i7;
    }

    public final boolean k() {
        return j(268435456);
    }

    public final boolean l() {
        return j(Integer.MIN_VALUE);
    }

    public final boolean m() {
        return j(4);
    }

    public final boolean n() {
        return j(134217728);
    }

    public final boolean o() {
        return j(1);
    }

    public final void p(int i7) {
        this.f22385f = i7;
    }
}
