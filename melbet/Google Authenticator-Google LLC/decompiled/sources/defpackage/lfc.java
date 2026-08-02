package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfc extends jkp implements jlm {
    public static final lfc a;
    public int b;
    public int c = -1;

    static {
        lfc lfcVar = new lfc();
        a = lfcVar;
        jkp.I(lfc.class, lfcVar);
    }

    private lfc() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", jnw.m});
        }
        if (i2 == 3) {
            return new lfc();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfc.class);
        }
        throw null;
    }
}
