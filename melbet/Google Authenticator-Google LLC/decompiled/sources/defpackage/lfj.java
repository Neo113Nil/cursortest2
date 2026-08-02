package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfj extends jkp implements jlm {
    public static final lfj a;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public long f;

    static {
        lfj lfjVar = new lfj();
        a = lfjVar;
        jkp.I(lfj.class, lfjVar);
    }

    private lfj() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new lfj();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfj.class);
        }
        throw null;
    }
}
