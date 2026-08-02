package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgy implements bdv {
    protected final Object a;

    public bgy(Object obj) {
        a.v(obj, "Argument must not be null");
        this.a = obj;
    }

    @Override // defpackage.bdv
    public final int a() {
        return 1;
    }

    @Override // defpackage.bdv
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.bdv
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.bdv
    public final void e() {
    }
}
