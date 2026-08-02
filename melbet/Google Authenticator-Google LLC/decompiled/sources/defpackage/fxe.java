package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxe extends jkp implements jlm {
    public static final fxe a;
    public jli b = jli.a;

    static {
        fxe fxeVar = new fxe();
        a = fxeVar;
        jkp.I(fxe.class, fxeVar);
    }

    private fxe() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", new ikk(jmr.STRING, "", jmr.BOOL, false)});
        }
        if (i2 == 3) {
            return new fxe();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(fxe.class);
        }
        throw null;
    }
}
