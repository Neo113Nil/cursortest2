package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jof extends jkp implements jlm {
    public static final jof a;
    public int b;
    public int c;
    public boolean d;
    public long e;

    static {
        jof jofVar = new jof();
        a = jofVar;
        jkp.I(jof.class, jofVar);
    }

    private jof() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0004\u0000\u0000\u0001\t\u0004\u0000\u0000\u0000\u0001\u0004\u0003\u0004\b\u0007\t\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new jof();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jof.class);
        }
        throw null;
    }
}
