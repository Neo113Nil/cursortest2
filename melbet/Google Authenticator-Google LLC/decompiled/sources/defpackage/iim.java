package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iim extends jkp implements jlm {
    public static final iim a;
    public int b;
    public iip c;
    public iip d;
    public iiq e;
    public iiv f;

    static {
        iim iimVar = new iim();
        a = iimVar;
        jkp.I(iim.class, iimVar);
    }

    private iim() {
        jlu jluVar = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"b", "e", "f", "c", "d"});
        }
        if (i2 == 3) {
            return new iim();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iim.class);
        }
        throw null;
    }
}
