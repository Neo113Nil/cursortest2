package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class euc extends jkp implements jlm {
    public static final euc a;
    public boolean b;
    private int c;

    static {
        euc eucVar = new euc();
        a = eucVar;
        jkp.I(euc.class, eucVar);
    }

    private euc() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new euc();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(euc.class);
        }
        throw null;
    }
}
