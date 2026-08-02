package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iis extends jkp implements jlm {
    public static final iis a;
    public int b;
    public iiu c;

    static {
        iis iisVar = new iis();
        a = iisVar;
        jkp.I(iis.class, iisVar);
    }

    private iis() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new iis();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iis.class);
        }
        throw null;
    }
}
