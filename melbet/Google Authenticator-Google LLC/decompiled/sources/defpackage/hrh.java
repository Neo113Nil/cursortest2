package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrh extends jkp implements jlm {
    public static final hrh a;
    public int b;
    public hrg c;
    public int e;
    public int h;
    public hrm k;
    private byte l = 2;
    public String d = "";
    public String f = "";
    public String g = "";
    public String i = "";
    public String j = "";

    static {
        hrh hrhVar = new hrh();
        a = hrhVar;
        jkp.I(hrh.class, hrhVar);
    }

    private hrh() {
        jlu jluVar = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\bᐉ\n\rင\u0005\u000eဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "j", "k", "h", "i"});
        }
        if (i2 == 3) {
            return new hrh();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hrh.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
