package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnl extends jkp implements jlm {
    public static final jnl a;
    public int b;
    public int c;
    public jmh d;

    static {
        jnl jnlVar = new jnl();
        a = jnlVar;
        jkp.I(jnl.class, jnlVar);
    }

    private jnl() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new jnl();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnl.class);
        }
        throw null;
    }
}
