package J;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f332c;

    public c() {
        super(12);
        this.f332c = new Object();
    }

    @Override // J.b
    public final Object a() {
        Object a2;
        synchronized (this.f332c) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // J.b
    public final boolean c(Object obj) {
        boolean c2;
        synchronized (this.f332c) {
            c2 = super.c(obj);
        }
        return c2;
    }
}
