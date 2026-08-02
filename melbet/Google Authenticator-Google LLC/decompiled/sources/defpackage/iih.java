package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iih extends jkp implements jlm {
    public static final iih a;
    public int b;
    public iii c;

    static {
        iih iihVar = new iih();
        a = iihVar;
        jkp.I(iih.class, iihVar);
    }

    private iih() {
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
            return new iih();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iih.class);
        }
        throw null;
    }
}
