package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnf extends jkp implements jlm {
    public static final jnf a;
    public jmh b;
    public jmh c;
    private int d;

    static {
        jnf jnfVar = new jnf();
        a = jnfVar;
        jkp.I(jnf.class, jnfVar);
    }

    private jnf() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0005ဉ\u0003", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new jnf();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnf.class);
        }
        throw null;
    }
}
