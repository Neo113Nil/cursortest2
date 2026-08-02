package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exc extends jkp implements jlm {
    public static final exc a;
    public int b;
    public int c;
    public int d;
    private jli e;
    private jli f;

    static {
        exc excVar = new exc();
        a = excVar;
        jkp.I(exc.class, excVar);
    }

    private exc() {
        jli jliVar = jli.a;
        this.e = jliVar;
        this.f = jliVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            jmr jmrVar = jmr.STRING;
            jmr jmrVar2 = jmr.INT32;
            return new jlv(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0002\u0000\u0000\u0001င\u0000\u0002င\u0001\u00042\u00052", new Object[]{"b", "c", "d", "e", new ikk(jmrVar, "", jmrVar2, 0), "f", new ikk(jmrVar, "", jmrVar2, 0)});
        }
        if (i2 == 3) {
            return new exc();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(exc.class);
        }
        throw null;
    }
}
