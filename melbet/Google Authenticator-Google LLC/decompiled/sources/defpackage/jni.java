package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jni extends jkp implements jlm {
    public static final jni a;
    public int b;
    public jnl d;
    public boolean e;
    public String c = "";
    public String f = "";

    static {
        jni jniVar = new jni();
        a = jniVar;
        jkp.I(jni.class, jniVar);
    }

    private jni() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jlv(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new jni();
        }
        if (i2 == 4) {
            return new jkj(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jni.class);
        }
        throw null;
    }
}
