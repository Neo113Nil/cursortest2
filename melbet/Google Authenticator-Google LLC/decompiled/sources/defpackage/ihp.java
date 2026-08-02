package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihp extends jkp implements jlm {
    public static final ihp a;
    public int b = 0;
    public Object c;

    static {
        ihp ihpVar = new ihp();
        a = ihpVar;
        jkp.I(ihp.class, ihpVar);
    }

    private ihp() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003<\u0000", new Object[]{"c", "b", ihn.class});
        }
        if (i2 == 3) {
            return new ihp();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ihp.class);
        }
        throw null;
    }
}
