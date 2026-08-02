package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kjh extends OutputStream {
    final /* synthetic */ kjj a;

    public kjh(kjj kjjVar) {
        this.a = kjjVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.c(bArr, i, i2);
    }
}
