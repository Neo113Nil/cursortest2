package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsb extends jkp implements jlm {
    public static final gsb a;
    public int b;
    public String c = "";

    static {
        gsb gsbVar = new gsb();
        a = gsbVar;
        jkp.I(gsb.class, gsbVar);
    }

    private gsb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new gsb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(gsb.class);
        }
        throw null;
    }
}
