package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iad extends jkm implements jkn {
    public static final iad a;
    private byte b = 2;

    static {
        iad iadVar = new iad();
        a = iadVar;
        jkp.I(iad.class, iadVar);
    }

    private iad() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new iad();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(iad.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
