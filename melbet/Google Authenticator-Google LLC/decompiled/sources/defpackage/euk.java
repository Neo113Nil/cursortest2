package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class euk extends jkp implements jlm {
    public static final euk a;
    public jli b = jli.a;

    static {
        euk eukVar = new euk();
        a = eukVar;
        jkp.I(euk.class, eukVar);
    }

    private euk() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", new ikk(jmr.STRING, "", jmr.MESSAGE, euj.a)});
        }
        if (i2 == 3) {
            return new euk();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(euk.class);
        }
        throw null;
    }
}
