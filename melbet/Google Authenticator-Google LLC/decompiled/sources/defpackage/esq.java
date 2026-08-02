package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esq extends jkp implements jlm {
    public static final esq a;
    public int b;
    public les c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public lew j;
    public int k;
    private byte l = 2;
    public String i = "";

    static {
        esq esqVar = new esq();
        a = esqVar;
        jkp.I(esq.class, esqVar);
    }

    private esq() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new esq();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(esq.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
