package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ggj extends jkp implements jlm {
    public static final ggj a;
    public int b;
    public String c = "";
    public String d = "";
    public jjq e = jjq.d;
    public jkx f;
    public jkx g;
    public int h;
    public long i;

    static {
        ggj ggjVar = new ggj();
        a = ggjVar;
        jkp.I(ggj.class, ggjVar);
    }

    private ggj() {
        jlu jluVar = jlu.a;
        this.f = jluVar;
        this.g = jluVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004\u001b\u0005\u001a\u0006ဆ\u0003\u0007စ\u0004", new Object[]{"b", "c", "d", "e", "f", ggk.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new ggj();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ggj.class);
        }
        throw null;
    }
}
