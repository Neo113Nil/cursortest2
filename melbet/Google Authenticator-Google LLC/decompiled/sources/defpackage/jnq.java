package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnq extends jkp implements jlm {
    public static final jnq a;
    public int b;
    public String c = "";
    public int d;

    static {
        jnq jnqVar = new jnq();
        a = jnqVar;
        jkp.I(jnq.class, jnqVar);
    }

    private jnq() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new jnq();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnq.class);
        }
        throw null;
    }
}
