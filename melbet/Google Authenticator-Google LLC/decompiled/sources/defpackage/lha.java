package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lha extends jkp implements jlm {
    public static final lha a;
    public int b;
    public jkb d;
    public boolean e;
    private byte f = 2;
    public jkx c = jlu.a;

    static {
        lha lhaVar = new lha();
        a = lhaVar;
        jkp.I(lha.class, lhaVar);
    }

    private lha() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"b", "c", lgz.class, "d", "e"});
        }
        if (i2 == 3) {
            return new lha();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lha.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
