package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgt extends jkp implements jlm {
    public static final lgt a;
    private int b;
    private lgk c;
    private byte d = 2;

    static {
        lgt lgtVar = new lgt();
        a = lgtVar;
        jkp.I(lgt.class, lgtVar);
    }

    private lgt() {
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
            return new lgt();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lgt.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
