package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfp extends jkp implements jlm {
    public static final lfp a;
    public jkx b = jlu.a;

    static {
        lfp lfpVar = new lfp();
        a = lfpVar;
        jkp.I(lfp.class, lfpVar);
    }

    private lfp() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", let.class});
        }
        if (i2 == 3) {
            return new lfp();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfp.class);
        }
        throw null;
    }
}
