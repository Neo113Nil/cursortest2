package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgk extends jkp implements jlm {
    public static final lgk a;
    public int b;
    public boolean c;
    public lfz d;
    public int g;
    public hrm i;
    public lgj j;
    public lgh k;
    private byte l = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        lgk lgkVar = new lgk();
        a = lgkVar;
        jkp.I(lgk.class, lgkVar);
    }

    private lgk() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", lgb.e, "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new lgk();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgk.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
