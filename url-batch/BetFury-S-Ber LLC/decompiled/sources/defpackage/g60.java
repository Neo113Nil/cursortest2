package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class g60 extends f60 {
    public final Object c;

    public g60() {
        super(12);
        this.c = new Object();
    }

    @Override // defpackage.f60
    public final Object a() {
        Object a;
        synchronized (this.c) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.f60
    public final boolean c(Object obj) {
        boolean c;
        synchronized (this.c) {
            c = super.c(obj);
        }
        return c;
    }
}
