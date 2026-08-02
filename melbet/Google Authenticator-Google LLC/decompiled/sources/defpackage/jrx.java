package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jrx implements jrw, jpt {
    private static final jrx b = new jrx(null);
    public final Object a;

    private jrx(Object obj) {
        this.a = obj;
    }

    public static jrw a(Object obj) {
        obj.getClass();
        return new jrx(obj);
    }

    public static jrw c(Object obj) {
        return obj == null ? b : new jrx(obj);
    }

    @Override // defpackage.koe, defpackage.kod
    public final Object b() {
        return this.a;
    }
}
