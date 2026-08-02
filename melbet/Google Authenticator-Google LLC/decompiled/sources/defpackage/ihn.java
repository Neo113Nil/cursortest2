package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihn extends jkp implements jlm {
    public static final ihn a;
    public jkx b = jlu.a;

    static {
        ihn ihnVar = new ihn();
        a = ihnVar;
        jkp.I(ihn.class, ihnVar);
    }

    private ihn() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ihm.class});
        }
        if (i2 == 3) {
            return new ihn();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ihn.class);
        }
        throw null;
    }
}
