package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnp extends jkp implements jlm {
    public static final jnp a;
    public int b;
    public jnq c;
    public jkx d = jlu.a;

    static {
        jnp jnpVar = new jnp();
        a = jnpVar;
        jkp.I(jnp.class, jnpVar);
    }

    private jnp() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", jns.class});
        }
        if (i2 == 3) {
            return new jnp();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnp.class);
        }
        throw null;
    }
}
