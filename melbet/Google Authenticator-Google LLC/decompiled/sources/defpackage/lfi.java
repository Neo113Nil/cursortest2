package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfi extends jkm implements jkn {
    public static final lfi a;
    public int b;
    public long d;
    private byte f = 2;
    public String c = "";
    public String e = "";

    static {
        lfi lfiVar = new lfi();
        a = lfiVar;
        jkp.I(lfi.class, lfiVar);
    }

    private lfi() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new lfi();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfi.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
