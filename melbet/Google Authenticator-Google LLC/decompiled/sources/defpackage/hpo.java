package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpo extends jkp implements jlm {
    public static final hpo a;
    public int b;
    public String c = "";

    static {
        hpo hpoVar = new hpo();
        a = hpoVar;
        jkp.I(hpo.class, hpoVar);
    }

    private hpo() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new hpo();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hpo.class);
        }
        throw null;
    }
}
