package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijv extends jkp implements jlm {
    public static final ijv a;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        ijv ijvVar = new ijv();
        a = ijvVar;
        jkp.I(ijv.class, ijvVar);
    }

    private ijv() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"d", "c", "b", ijt.class, iju.class, "e", hrn.t});
        }
        if (i2 == 3) {
            return new ijv();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijv.class);
        }
        throw null;
    }
}
