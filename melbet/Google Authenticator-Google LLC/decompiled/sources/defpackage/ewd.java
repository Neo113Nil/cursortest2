package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewd extends jkp implements jlm {
    public static final ewd a;
    public int b;
    public long f;
    public String c = "";
    public jjq d = jjq.d;
    public String e = "";
    public jkx g = jlu.a;

    static {
        ewd ewdVar = new ewd();
        a = ewdVar;
        jkp.I(ewd.class, ewdVar);
    }

    private ewd() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", ewe.class});
        }
        if (i2 == 3) {
            return new ewd();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ewd.class);
        }
        throw null;
    }
}
