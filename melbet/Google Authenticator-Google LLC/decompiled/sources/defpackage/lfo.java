package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfo extends jkp implements jlm {
    public static final lfo a;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public jkx f = jlu.a;

    static {
        lfo lfoVar = new lfo();
        a = lfoVar;
        jkp.I(lfo.class, lfoVar);
    }

    private lfo() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u00028\u0000\u0003<\u0000\u0004\u001b", new Object[]{"d", "c", "b", "e", jnw.u, lfm.class, "f", lfn.class});
        }
        if (i2 == 3) {
            return new lfo();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfo.class);
        }
        throw null;
    }
}
