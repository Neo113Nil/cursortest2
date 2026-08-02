package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iaa extends jkp implements jlm {
    public static final iaa a;
    public long b = -1;
    private int c;

    static {
        iaa iaaVar = new iaa();
        a = iaaVar;
        jkp.I(iaa.class, iaaVar);
    }

    private iaa() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဂ\u0003", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new iaa();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iaa.class);
        }
        throw null;
    }
}
