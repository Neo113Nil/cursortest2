package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iir extends jkp implements jlm {
    public static final iir a;
    public int b;
    public iis c;

    static {
        iir iirVar = new iir();
        a = iirVar;
        jkp.I(iir.class, iirVar);
    }

    private iir() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001MM\u0001\u0000\u0000\u0000Mဉ\n", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new iir();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iir.class);
        }
        throw null;
    }
}
