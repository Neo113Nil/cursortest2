package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihh extends jkp implements jlm {
    public static final ihh a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        ihh ihhVar = new ihh();
        a = ihhVar;
        jkp.I(ihh.class, ihhVar);
    }

    private ihh() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ihh();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ihh.class);
        }
        throw null;
    }
}
