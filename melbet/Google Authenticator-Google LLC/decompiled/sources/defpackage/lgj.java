package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgj extends jkp implements jlm {
    public static final lgj a;
    public int b;
    public jkx c = jlu.a;
    public lgi d;

    static {
        lgj lgjVar = new lgj();
        a = lgjVar;
        jkp.I(lgj.class, lgjVar);
    }

    private lgj() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new lgj();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgj.class);
        }
        throw null;
    }
}
