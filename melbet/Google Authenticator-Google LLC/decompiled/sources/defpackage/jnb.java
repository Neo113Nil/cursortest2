package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnb extends jkp implements jlm {
    public static final jnb a;
    public jkx b = jlu.a;

    static {
        jnb jnbVar = new jnb();
        a = jnbVar;
        jkp.I(jnb.class, jnbVar);
    }

    private jnb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", jnd.class});
        }
        if (i2 == 3) {
            return new jnb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnb.class);
        }
        throw null;
    }
}
