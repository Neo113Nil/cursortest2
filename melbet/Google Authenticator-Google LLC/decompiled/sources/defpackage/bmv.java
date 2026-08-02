package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmv extends jkp implements jlm {
    public static final bmv a;
    public int b;
    public int f;
    public int g;
    public int h;
    public long i;
    public jjq c = jjq.d;
    public String d = "";
    public String e = "";
    public String j = "";

    static {
        bmv bmvVar = new bmv();
        a = bmvVar;
        jkp.I(bmv.class, bmvVar);
    }

    private bmv() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဃ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "e", "f", bmw.b, "g", bmw.a, "h", bmw.c, "i", "j"});
        }
        if (i2 == 3) {
            return new bmv();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(bmv.class);
        }
        throw null;
    }
}
