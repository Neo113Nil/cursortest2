package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnr extends jkp implements jlm {
    public static final jnr a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        jnr jnrVar = new jnr();
        a = jnrVar;
        jkp.I(jnr.class, jnrVar);
    }

    private jnr() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new jnr();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnr.class);
        }
        throw null;
    }
}
