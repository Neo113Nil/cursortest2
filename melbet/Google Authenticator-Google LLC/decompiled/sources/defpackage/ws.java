package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ws extends wr {
    private final Object a;

    public ws(int i) {
        super(i);
        this.a = new Object();
    }

    @Override // defpackage.wr, defpackage.wq
    public final Object a() {
        Object a;
        synchronized (this.a) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.wr, defpackage.wq
    public final boolean b(Object obj) {
        boolean b;
        obj.getClass();
        synchronized (this.a) {
            b = super.b(obj);
        }
        return b;
    }
}
