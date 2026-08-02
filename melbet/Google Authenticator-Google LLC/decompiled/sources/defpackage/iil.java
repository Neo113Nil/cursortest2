package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iil extends jkp implements jlm {
    public static final iil a;
    public jkt b = jkq.a;

    static {
        iil iilVar = new iil();
        a = iilVar;
        jkp.I(iil.class, iilVar);
    }

    private iil() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new iil();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iil.class);
        }
        throw null;
    }
}
