package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnt extends jkp implements jlm {
    public static final jnt a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public jkx g;
    public jkx h;
    public String i;
    public jnq j;
    public jkx k;

    static {
        jnt jntVar = new jnt();
        a = jntVar;
        jkp.I(jnt.class, jntVar);
    }

    private jnt() {
        jlu jluVar = jlu.a;
        this.g = jluVar;
        this.h = jluVar;
        this.i = "";
        this.k = jluVar;
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003ဃ\u0002\u0004᠌\u0003\u0005\u001b\u0006\u001b\nဈ\u0006\u000bဉ\u0007\f\u001b", new Object[]{"b", "c", "d", "e", "f", hrn.u, "g", jns.class, "h", jnr.class, "i", "j", "k", jnp.class});
        }
        if (i2 == 3) {
            return new jnt();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jnt.class);
        }
        throw null;
    }
}
