package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnh extends jkp implements jlm {
    public static final jnh a;
    public jmh b;
    private int c;

    static {
        jnh jnhVar = new jnh();
        a = jnhVar;
        jkp.I(jnh.class, jnhVar);
    }

    private jnh() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new jnh();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnh.class);
        }
        throw null;
    }
}
