package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iiu extends jkp implements jlm {
    public static final iiu a;
    public int b;
    public int c;

    static {
        iiu iiuVar = new iiu();
        a = iiuVar;
        jkp.I(iiu.class, iiuVar);
    }

    private iiu() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", hrn.h});
        }
        if (i2 == 3) {
            return new iiu();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iiu.class);
        }
        throw null;
    }
}
