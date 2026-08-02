package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihr extends jkp implements jlm {
    public static final ihr a;
    public int b;
    public long c;
    public jkw d;
    public jkx e;

    static {
        ihr ihrVar = new ihr();
        a = ihrVar;
        jkp.I(ihr.class, ihrVar);
    }

    private ihr() {
        jlu jluVar = jlu.a;
        this.d = jlh.a;
        this.e = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"b", "e", ihq.class, "c", "d"});
        }
        if (i2 == 3) {
            return new ihr();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ihr.class);
        }
        throw null;
    }
}
