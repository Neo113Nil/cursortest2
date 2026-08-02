package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jzy extends jzw {
    private final jzz e;

    public jzy(String str, boolean z, jzz jzzVar) {
        super(str, z, jzzVar);
        hoq.F(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        jzzVar.getClass();
        this.e = jzzVar;
    }

    @Override // defpackage.jzw
    public final Object a(byte[] bArr) {
        return this.e.a(bArr);
    }

    @Override // defpackage.jzw
    public final byte[] b(Object obj) {
        byte[] b = this.e.b(obj);
        b.getClass();
        return b;
    }
}
