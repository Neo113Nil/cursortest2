package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iji extends jkp implements jlm {
    public static final iji a;
    public jkx b = jlu.a;

    static {
        iji ijiVar = new iji();
        a = ijiVar;
        jkp.I(iji.class, ijiVar);
    }

    private iji() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", ijh.class});
        }
        if (i2 == 3) {
            return new iji();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iji.class);
        }
        throw null;
    }
}
