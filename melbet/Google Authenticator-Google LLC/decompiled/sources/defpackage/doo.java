package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class doo extends jkp implements jlm {
    public static final doo a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    private int h;

    static {
        doo dooVar = new doo();
        a = dooVar;
        jkp.I(doo.class, dooVar);
    }

    private doo() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"h", "b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new doo();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(doo.class);
        }
        throw null;
    }
}
