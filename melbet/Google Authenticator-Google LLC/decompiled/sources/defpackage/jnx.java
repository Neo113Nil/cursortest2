package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnx extends jkp implements jlm {
    public static final jnx a;
    public jli b = jli.a;

    static {
        jnx jnxVar = new jnx();
        a = jnxVar;
        jkp.I(jnx.class, jnxVar);
    }

    private jnx() {
        jlu jluVar = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            jmr jmrVar = jmr.STRING;
            return new jlv(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ikk(jmrVar, "", jmrVar, "")});
        }
        if (i2 == 3) {
            return new jnx();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnx.class);
        }
        throw null;
    }
}
