package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jol extends jkm implements jkn {
    public static final jol a;
    public int b;
    public long c;
    public long d;
    public int e;
    public jjq f;
    public long g;
    public boolean h;
    public String i;
    public double j;
    public jok k;
    public jon m;
    private byte n = 2;

    static {
        jol jolVar = new jol();
        a = jolVar;
        jkp.I(jol.class, jolVar);
    }

    private jol() {
        jlu jluVar = jlu.a;
        jjq jjqVar = jjq.d;
        this.f = jjq.d;
        this.g = 180000L;
        jkq jkqVar = jkq.a;
        this.i = "";
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0001\n\u0000\u0001\u0001#\n\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c#ဉ\u001b", new Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j", "m", "k"});
        }
        if (i2 == 3) {
            return new jol();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(jol.class);
        }
        this.n = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
