package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jok extends jkp implements jlm {
    public static final jok a;
    public int b;
    public int c;
    public joi d;
    public joj e;

    static {
        jok jokVar = new jok();
        a = jokVar;
        jkp.I(jok.class, jokVar);
    }

    private jok() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new jok();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jok.class);
        }
        throw null;
    }
}
