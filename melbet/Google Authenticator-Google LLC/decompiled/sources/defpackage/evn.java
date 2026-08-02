package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evn extends jkp implements jlm {
    public static final evn a;
    public String b = "";
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int h;

    static {
        evn evnVar = new evn();
        a = evnVar;
        jkp.I(evn.class, evnVar);
    }

    private evn() {
        jlu jluVar = jlu.a;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"h", "b", "c", "d", hrn.c, "e", "g", "f"});
        }
        if (i2 == 3) {
            return new evn();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(evn.class);
        }
        throw null;
    }
}
