package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijr extends jkp implements jlm {
    public static final ijr a;
    public jkx b = jlu.a;
    public int c;
    private int d;

    static {
        ijr ijrVar = new ijr();
        a = ijrVar;
        jkp.I(ijr.class, ijrVar);
    }

    private ijr() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002᠌\u0000", new Object[]{"d", "b", ijp.class, "c", hrn.r});
        }
        if (i2 == 3) {
            return new ijr();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijr.class);
        }
        throw null;
    }
}
