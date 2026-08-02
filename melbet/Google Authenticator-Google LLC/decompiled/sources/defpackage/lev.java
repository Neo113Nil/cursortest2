package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lev extends jkp implements jlm {
    public static final lev a;
    public int b;
    public int c;
    public jkb d;
    public long e;
    public int f;
    public int g;

    static {
        lev levVar = new lev();
        a = levVar;
        jkp.I(lev.class, levVar);
    }

    private lev() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003စ\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", jnw.k, "g", jnw.j});
        }
        if (i2 == 3) {
            return new lev();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lev.class);
        }
        throw null;
    }
}
