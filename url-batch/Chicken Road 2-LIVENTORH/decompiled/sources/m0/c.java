package m0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f2684c;

    public c(int i) {
        super(i);
        this.f2684c = new Object();
    }

    @Override // m0.b
    public final Object a() {
        Object a2;
        synchronized (this.f2684c) {
            a2 = super.a();
        }
        return a2;
    }

    @Override // m0.b
    public final boolean c(Object obj) {
        boolean c4;
        synchronized (this.f2684c) {
            c4 = super.c(obj);
        }
        return c4;
    }
}
