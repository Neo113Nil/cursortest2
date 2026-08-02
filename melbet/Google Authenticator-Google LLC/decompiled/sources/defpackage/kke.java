package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kke extends kek {
    final ByteBuffer a;

    public kke(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.kek, defpackage.kkb
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.kek, defpackage.kkb
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.kek, defpackage.kkb
    public final boolean d() {
        return true;
    }

    @Override // defpackage.kkb
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.kkb
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.kkb
    public final /* bridge */ /* synthetic */ kkb g(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.limit(byteBuffer.position() + i);
        byteBuffer.position(byteBuffer.position() + i);
        return new kke(duplicate);
    }

    @Override // defpackage.kkb
    public final void i(OutputStream outputStream, int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        if (byteBuffer.hasArray()) {
            outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            outputStream.write(bArr);
        }
    }

    @Override // defpackage.kkb
    public final void j(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.kkb
    public final void k(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
