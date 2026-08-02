package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnv extends jkp implements jlm {
    public static final jnv a;
    public int b;
    public jnu c;
    private byte d = 2;

    static {
        jnv jnvVar = new jnv();
        a = jnvVar;
        jkp.I(jnv.class, jnvVar);
    }

    private jnv() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new jnv();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnv.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
