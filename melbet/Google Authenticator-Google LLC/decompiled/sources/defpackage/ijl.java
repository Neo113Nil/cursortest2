package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijl extends jkp implements jlm {
    public static final ijl a;
    public int b;
    public ijk c;
    public ijc d;

    static {
        ijl ijlVar = new ijl();
        a = ijlVar;
        jkp.I(ijl.class, ijlVar);
    }

    private ijl() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ijl();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijl.class);
        }
        throw null;
    }
}
