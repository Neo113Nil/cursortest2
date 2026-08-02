package defpackage;

import java.io.ByteArrayInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzx extends jzw {
    private final jzt e;

    public jzx(String str, jzt jztVar) {
        super(str, false, jztVar);
        hoq.F(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        this.e = jztVar;
    }

    @Override // defpackage.jzw
    public final Object a(byte[] bArr) {
        return this.e.b(new ByteArrayInputStream(bArr));
    }

    @Override // defpackage.jzw
    public final byte[] b(Object obj) {
        return kaa.l(this.e.a(obj));
    }

    @Override // defpackage.jzw
    public final boolean c() {
        return true;
    }
}
