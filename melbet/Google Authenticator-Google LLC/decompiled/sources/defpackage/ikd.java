package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikd extends jkp implements jlm {
    public static final ikd a;
    public frq b;
    private int c;
    private byte d = 2;

    static {
        ikd ikdVar = new ikd();
        a = ikdVar;
        jkp.I(ikd.class, ikdVar);
    }

    private ikd() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new ikd();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(ikd.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
