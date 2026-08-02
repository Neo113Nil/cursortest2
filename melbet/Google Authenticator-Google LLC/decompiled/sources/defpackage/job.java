package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class job extends jkm implements jkn {
    public static final job a;
    private byte b = 2;

    static {
        job jobVar = new job();
        a = jobVar;
        jkp.I(job.class, jobVar);
    }

    private job() {
    }

    @Override // defpackage.jkp
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new jlv(a, "\u0003\u0000", null);
        }
        if (i2 == 3) {
            return new job();
        }
        if (i2 == 4) {
            return new jkl(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return jkp.D(job.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
