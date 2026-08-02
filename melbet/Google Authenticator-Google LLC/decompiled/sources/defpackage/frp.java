package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class frp extends jkp implements jlm {
    public static final frp a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        frp frpVar = new frp();
        a = frpVar;
        jkp.I(frp.class, frpVar);
    }

    private frp() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0006\u0005ဈ\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new frp();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(frp.class);
        }
        throw null;
    }
}
