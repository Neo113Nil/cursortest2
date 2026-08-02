package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ful extends jkm implements jkn {
    public static final ful a;
    public int b;
    public boolean i;
    private byte m = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";

    static {
        ful fulVar = new ful();
        a = fulVar;
        jkp.I(ful.class, fulVar);
    }

    private ful() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006ဈ\u0007\u0007ဈ\b\bဈ\u0002\tဈ\u0003", new Object[]{"b", "c", "d", "g", "h", "i", "j", "k", "e", "f"});
        }
        if (i2 == 3) {
            return new ful();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ful.class);
        }
        this.m = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
