package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fru extends jkp implements jlm {
    public static final jku a = new eue(2);
    public static final fru b;
    public String c = "";
    public jkt d = jkq.a;
    private int e;

    static {
        fru fruVar = new fru();
        b = fruVar;
        jkp.I(fru.class, fruVar);
    }

    private fru() {
        jlu jluVar = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(b, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"e", "c", "d", bmw.k});
        }
        if (i2 == 3) {
            return new fru();
        }
        if (i2 == 4) {
            return new jkj(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 == 6) {
            return jkp.D(fru.class);
        }
        throw null;
    }
}
