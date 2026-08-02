package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iix extends jkp implements jlm {
    public static final iix a;
    public iiw b;
    private int c;

    static {
        iix iixVar = new iix();
        a = iixVar;
        jkp.I(iix.class, iixVar);
    }

    private iix() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new iix();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iix.class);
        }
        throw null;
    }
}
