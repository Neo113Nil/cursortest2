package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzs extends jzw {
    public jzs(String str, ixc ixcVar) {
        super(str, false, ixcVar);
        hoq.F(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        hoq.y(str.length() > 4, "empty key name");
        ixcVar.getClass();
    }

    @Override // defpackage.jzw
    public final byte[] b(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.jzw
    public final Object a(byte[] bArr) {
        return bArr;
    }
}
