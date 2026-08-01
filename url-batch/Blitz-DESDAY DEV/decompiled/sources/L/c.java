package L;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f413c;

    public c() {
        super(12);
        this.f413c = new Object();
    }

    @Override // L.b
    public final Object a() {
        Object a2;
        synchronized (this.f413c) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // L.b
    public final boolean c(Object obj) {
        boolean c2;
        synchronized (this.f413c) {
            c2 = super.c(obj);
        }
        return c2;
    }
}
