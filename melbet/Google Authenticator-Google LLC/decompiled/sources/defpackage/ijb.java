package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijb extends jkp implements jlm {
    public static final ijb a;
    public int b;
    public int c;

    static {
        ijb ijbVar = new ijb();
        a = ijbVar;
        jkp.I(ijb.class, ijbVar);
    }

    private ijb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", hrn.k});
        }
        if (i2 == 3) {
            return new ijb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijb.class);
        }
        throw null;
    }
}
