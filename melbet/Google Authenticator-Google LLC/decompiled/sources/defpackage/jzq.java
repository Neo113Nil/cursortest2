package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzq extends jzw {
    private final jzr e;

    public jzq(String str, jzr jzrVar) {
        super(str, false, jzrVar);
        hoq.F(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        jzrVar.getClass();
        this.e = jzrVar;
    }

    @Override // defpackage.jzw
    public final Object a(byte[] bArr) {
        return this.e.a(new String(bArr, StandardCharsets.US_ASCII));
    }

    @Override // defpackage.jzw
    public final byte[] b(Object obj) {
        return this.e.b(obj).getBytes(StandardCharsets.US_ASCII);
    }
}
