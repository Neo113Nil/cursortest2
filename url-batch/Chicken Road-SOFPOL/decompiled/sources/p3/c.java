package p3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f5738c;

    public c() {
        super(12);
        this.f5738c = new Object();
    }

    @Override // p3.b
    public final Object a() {
        Object a8;
        synchronized (this.f5738c) {
            a8 = super.a();
        }
        return a8;
    }

    @Override // p3.b
    public final boolean c(Object obj) {
        boolean c8;
        synchronized (this.f5738c) {
            c8 = super.c(obj);
        }
        return c8;
    }
}
