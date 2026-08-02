package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frq extends jkp implements jlm {
    public static final frq a;
    public jkx b;
    public jkx c;
    public jkx d;
    public jkx e;
    private byte f = 2;

    static {
        frq frqVar = new frq();
        a = frqVar;
        jkp.I(frq.class, frqVar);
    }

    private frq() {
        jlu jluVar = jlu.a;
        this.b = jluVar;
        this.c = jluVar;
        this.d = jluVar;
        this.e = jluVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0004\u0000\u0000\u00032\u0004\u0000\u0004\u0000\u0003\u001b\u0004\u001b0\u001b2\u001b", new Object[]{"c", frp.class, "d", frt.class, "b", fru.class, "e", fro.class});
        }
        if (i2 == 3) {
            return new frq();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(frq.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
