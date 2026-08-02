package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lek extends jkp implements jlm {
    public static final lek a;
    public int b;
    public lej c;
    private byte d = 2;

    static {
        lek lekVar = new lek();
        a = lekVar;
        jkp.I(lek.class, lekVar);
    }

    private lek() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new lek();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lek.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
