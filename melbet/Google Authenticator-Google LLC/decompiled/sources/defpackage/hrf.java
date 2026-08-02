package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrf extends jkp implements jlm {
    public static final hrf a;
    public int b;
    public hrg c;
    public long d;
    private byte e = 2;

    static {
        hrf hrfVar = new hrf();
        a = hrfVar;
        jkp.I(hrf.class, hrfVar);
    }

    private hrf() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new hrf();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hrf.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
