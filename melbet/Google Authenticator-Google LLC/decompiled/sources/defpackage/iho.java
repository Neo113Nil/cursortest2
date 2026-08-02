package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iho extends jkp implements jlm {
    public static final iho a;
    public int b = 0;
    public Object c;

    static {
        iho ihoVar = new iho();
        a = ihoVar;
        jkp.I(iho.class, ihoVar);
    }

    private iho() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001;\u0000\u00027\u0000\u0003:\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new iho();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iho.class);
        }
        throw null;
    }
}
