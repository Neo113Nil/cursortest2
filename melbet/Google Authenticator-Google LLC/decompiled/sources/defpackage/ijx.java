package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijx extends jkp implements jlm {
    public static final ijx a;
    public ijd b;
    public jkx c = jlu.a;
    public ijs d;
    private int e;

    static {
        ijx ijxVar = new ijx();
        a = ijxVar;
        jkp.I(ijx.class, ijxVar);
    }

    private ijx() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\bဉ\u0001", new Object[]{"e", "b", "c", ijp.class, "d"});
        }
        if (i2 == 3) {
            return new ijx();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ijx.class);
        }
        throw null;
    }
}
