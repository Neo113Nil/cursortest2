package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfh extends jkp implements jlm {
    public static final lfh a;
    public int b;
    public long c;
    public int d;
    public lfk f;
    private byte g = 2;
    public jkx e = jlu.a;

    static {
        lfh lfhVar = new lfh();
        a = lfhVar;
        jkp.I(lfh.class, lfhVar);
    }

    private lfh() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", lfi.class, "d", jnw.s, "f"});
        }
        if (i2 == 3) {
            return new lfh();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(lfh.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
