package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihq extends jkp implements jlm {
    public static final ihq a;
    public int b;
    public jkx c = jlu.a;
    public ihp d;

    static {
        ihq ihqVar = new ihq();
        a = ihqVar;
        jkp.I(ihq.class, ihqVar);
    }

    private ihq() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", iho.class, "d"});
        }
        if (i2 == 3) {
            return new ihq();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ihq.class);
        }
        throw null;
    }
}
