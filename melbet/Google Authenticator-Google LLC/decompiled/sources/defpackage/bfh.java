package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bfh implements bff {
    private final /* synthetic */ int a;

    public bfh(int i) {
        this.a = i;
    }

    @Override // defpackage.bff
    public final Class a() {
        return this.a != 0 ? ByteBuffer.class : InputStream.class;
    }

    @Override // defpackage.bff
    public final /* synthetic */ Object b(byte[] bArr) {
        return this.a != 0 ? ByteBuffer.wrap(bArr) : new ByteArrayInputStream(bArr);
    }
}
