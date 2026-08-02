package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dop extends jkp implements jlm {
    public static final dop a;
    public ikc b;
    public doo c;
    private int d;
    private byte e = 2;

    static {
        dop dopVar = new dop();
        a = dopVar;
        jkp.I(dop.class, dopVar);
    }

    private dop() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new dop();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(dop.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
