package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class etm extends jkp implements jlm {
    public static final etm a;
    public int b;
    public etl d;
    public String c = "";
    public String e = "";

    static {
        etm etmVar = new etm();
        a = etmVar;
        jkp.I(etm.class, etmVar);
    }

    private etm() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new etm();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(etm.class);
        }
        throw null;
    }
}
