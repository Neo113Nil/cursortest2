package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class knj extends InputStream implements InputStreamRetargetInterface, jxw, jyw {
    public jll a;
    public final jlr b;
    private ByteArrayInputStream c;

    public knj(jll jllVar, jlr jlrVar) {
        this.a = jllVar;
        this.b = jlrVar;
    }

    @Override // defpackage.jxw
    public final int a(OutputStream outputStream) {
        jll jllVar = this.a;
        if (jllVar != null) {
            int j = jllVar.j();
            this.a.e(outputStream);
            this.a = null;
            return j;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        jkd jkdVar = knl.a;
        outputStream.getClass();
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i = (int) j2;
                this.c = null;
                return i;
            }
            outputStream.write(bArr, 0, read);
            j2 += read;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        jll jllVar = this.a;
        if (jllVar != null) {
            return jllVar.j();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        jll jllVar = this.a;
        if (jllVar != null) {
            int j = jllVar.j();
            if (j == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= j) {
                jjw jjwVar = new jjw(bArr, i, j);
                this.a.K(jjwVar);
                jjwVar.T();
                this.a = null;
                this.c = null;
                return j;
            }
            this.c = new ByteArrayInputStream(this.a.f());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        jll jllVar = this.a;
        if (jllVar != null) {
            this.c = new ByteArrayInputStream(jllVar.f());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
