package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrl extends jkp implements jlm {
    public static final hrl a;
    public int b;
    public hrj c;
    public int d;
    private byte f = 2;
    public jkt e = jkq.a;

    static {
        hrl hrlVar = new hrl();
        a = hrlVar;
        jkp.I(hrl.class, hrlVar);
    }

    private hrl() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003'", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new hrl();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(hrl.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
