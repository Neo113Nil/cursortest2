package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epf extends jkp implements jlm {
    public static final epf a;
    public String b = "";
    public jkx c = jlu.a;
    public boolean d;
    private int e;

    static {
        epf epfVar = new epf();
        a = epfVar;
        jkp.I(epf.class, epfVar);
    }

    private epf() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "b", "c", epe.class, "d"});
        }
        if (i2 == 3) {
            return new epf();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(epf.class);
        }
        throw null;
    }
}
