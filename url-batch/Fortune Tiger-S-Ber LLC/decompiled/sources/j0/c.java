package j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c extends b {
    public final Object c;

    public c() {
        super(12);
        this.c = new Object();
    }

    @Override // j0.b
    public final Object a() {
        Object a4;
        synchronized (this.c) {
            a4 = super.a();
        }
        return a4;
    }

    @Override // j0.b
    public final boolean c(Object obj) {
        boolean c;
        synchronized (this.c) {
            c = super.c(obj);
        }
        return c;
    }
}
