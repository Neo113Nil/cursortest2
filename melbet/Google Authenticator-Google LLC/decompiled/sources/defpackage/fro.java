package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fro extends jkp implements jlm {
    public static final fro a;
    public int b = 1;
    private int c;

    static {
        fro froVar = new fro();
        a = froVar;
        jkp.I(fro.class, froVar);
    }

    private fro() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0003", new Object[]{"c", "b", bmw.j});
        }
        if (i2 == 3) {
            return new fro();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(fro.class);
        }
        throw null;
    }
}
