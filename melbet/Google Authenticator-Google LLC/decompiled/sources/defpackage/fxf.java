package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fxf extends jkp implements jlm {
    public static final fxf a;
    public int b;
    public int c;
    public ful d;
    public int e;
    private byte f = 2;

    static {
        fxf fxfVar = new fxf();
        a = fxfVar;
        jkp.I(fxf.class, fxfVar);
    }

    private fxf() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", bmw.m});
        }
        if (i2 == 3) {
            return new fxf();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(fxf.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
