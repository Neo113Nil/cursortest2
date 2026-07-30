package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class f {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(yt.b);
        bytes.getClass();
        a = bytes;
    }

    public static final String a(long j, fq fqVar) {
        if (j > 0) {
            long j2 = j - 1;
            if (fqVar.n(j2) == 13) {
                String y = fqVar.y(j2, yt.b);
                fqVar.skip(2L);
                return y;
            }
        }
        String y2 = fqVar.y(j, yt.b);
        fqVar.skip(1L);
        return y2;
    }
}
