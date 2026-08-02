package defpackage;

import java.io.OutputStream;
import java.nio.InvalidMarkException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kkd extends kek {
    int a;
    final int b;
    final byte[] c;
    int d = -1;

    public kkd(byte[] bArr, int i, int i2) {
        hoq.y(i >= 0, "offset must be >= 0");
        hoq.y(i2 >= 0, "length must be >= 0");
        int i3 = i2 + i;
        hoq.y(i3 <= 0, "offset + length exceeds array boundary");
        this.c = bArr;
        this.a = i;
        this.b = i3;
    }

    @Override // defpackage.kek, defpackage.kkb
    public final void b() {
        this.d = this.a;
    }

    @Override // defpackage.kek, defpackage.kkb
    public final void c() {
        int i = this.d;
        if (i == -1) {
            throw new InvalidMarkException();
        }
        this.a = i;
    }

    @Override // defpackage.kek, defpackage.kkb
    public final boolean d() {
        return true;
    }

    @Override // defpackage.kkb
    public final int e() {
        a(1);
        int i = this.a;
        this.a = i + 1;
        return this.c[i] & 255;
    }

    @Override // defpackage.kkb
    public final int f() {
        return this.b - this.a;
    }

    @Override // defpackage.kkb
    public final /* bridge */ /* synthetic */ kkb g(int i) {
        a(i);
        int i2 = this.a;
        this.a = i2 + i;
        return new kkd(this.c, i2, i);
    }

    @Override // defpackage.kkb
    public final void i(OutputStream outputStream, int i) {
        a(i);
        outputStream.write(this.c, this.a, i);
        this.a += i;
    }

    @Override // defpackage.kkb
    public final void j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.c, this.a, bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.kkb
    public final void k(int i) {
        a(i);
        this.a += i;
    }
}
