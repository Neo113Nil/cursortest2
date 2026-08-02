package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnu extends jkp implements jlm {
    public static final jnu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";

    static {
        jnu jnuVar = new jnu();
        a = jnuVar;
        jkp.I(jnu.class, jnuVar);
    }

    private jnu() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004᠌\u0003\u0006᠌\u0005\u0007ဈ\u0006", new Object[]{"b", "c", jnw.d, "d", jnw.a, "e", jnw.c, "f", jnw.b, "g"});
        }
        if (i2 == 3) {
            return new jnu();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnu.class);
        }
        throw null;
    }
}
