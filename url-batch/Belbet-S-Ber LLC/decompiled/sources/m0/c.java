package m0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f2724c;

    public c() {
        super(12);
        this.f2724c = new Object();
    }

    @Override // m0.b
    public final Object a() {
        Object a5;
        synchronized (this.f2724c) {
            a5 = super.a();
        }
        return a5;
    }

    @Override // m0.b
    public final boolean c(Object obj) {
        boolean c5;
        synchronized (this.f2724c) {
            c5 = super.c(obj);
        }
        return c5;
    }
}
