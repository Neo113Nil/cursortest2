package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class len extends jkp implements jlm {
    public static final len a;
    public int b;
    public jkx c;
    public jkx d;
    public lem e;

    static {
        len lenVar = new len();
        a = lenVar;
        jkp.I(len.class, lenVar);
    }

    private len() {
        jlu jluVar = jlu.a;
        this.c = jluVar;
        this.d = jluVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", leq.class, "d", lel.class, "e"});
        }
        if (i2 == 3) {
            return new len();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(len.class);
        }
        throw null;
    }
}
