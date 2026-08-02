package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejb extends jkp implements jlm {
    public static final ejb a;
    public Object c;
    public int b = 0;
    private byte d = 2;

    static {
        ejb ejbVar = new ejb();
        a = ejbVar;
        jkp.I(ejb.class, ejbVar);
    }

    private ejb() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"c", "b", lew.class, ejc.class, ejd.class, eje.class});
        }
        if (i2 == 3) {
            return new ejb();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ejb.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
