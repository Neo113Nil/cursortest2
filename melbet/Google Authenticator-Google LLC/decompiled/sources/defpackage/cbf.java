package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbf extends jkp implements jlm {
    public static final cbf a;
    public int b;
    public boolean c;

    static {
        cbf cbfVar = new cbf();
        a = cbfVar;
        jkp.I(cbf.class, cbfVar);
    }

    private cbf() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new cbf();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(cbf.class);
        }
        throw null;
    }
}
