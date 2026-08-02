package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvc extends jkp implements cve {
    public static final cvc a;
    public int b;
    public ijx c;

    static {
        cvc cvcVar = new cvc();
        a = cvcVar;
        jkp.I(cvc.class, cvcVar);
    }

    private cvc() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new cvc();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(cvc.class);
        }
        throw null;
    }
}
