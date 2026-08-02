package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lem extends jkp implements jlm {
    public static final lem a;
    public int b;
    public long c;
    public String d = "";

    static {
        lem lemVar = new lem();
        a = lemVar;
        jkp.I(lem.class, lemVar);
    }

    private lem() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new lem();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lem.class);
        }
        throw null;
    }
}
