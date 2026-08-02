package c0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class O extends U.o {

    /* renamed from: i, reason: collision with root package name */
    public int f5533i;

    /* renamed from: j, reason: collision with root package name */
    public int f5534j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5535k;

    /* renamed from: l, reason: collision with root package name */
    public int f5536l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f5537m;
    public int n;
    public long o;

    @Override // U.o, U.n
    public final boolean b() {
        return super.b() && this.n == 0;
    }

    @Override // U.o, U.n
    public final ByteBuffer c() {
        int i4;
        if (super.b() && (i4 = this.n) > 0) {
            l(i4).put(this.f5537m, 0, this.n).flip();
            this.n = 0;
        }
        return super.c();
    }

    @Override // U.n
    public final void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i4 = limit - position;
        if (i4 == 0) {
            return;
        }
        int min = Math.min(i4, this.f5536l);
        this.o += min / this.f3062b.f3058d;
        this.f5536l -= min;
        byteBuffer.position(position + min);
        if (this.f5536l > 0) {
            return;
        }
        int i5 = i4 - min;
        int length = (this.n + i5) - this.f5537m.length;
        ByteBuffer l4 = l(length);
        int j4 = W.J.j(length, 0, this.n);
        l4.put(this.f5537m, 0, j4);
        int j5 = W.J.j(length - j4, 0, i5);
        byteBuffer.limit(byteBuffer.position() + j5);
        l4.put(byteBuffer);
        byteBuffer.limit(limit);
        int i6 = i5 - j5;
        int i7 = this.n - j4;
        this.n = i7;
        byte[] bArr = this.f5537m;
        System.arraycopy(bArr, j4, bArr, 0, i7);
        byteBuffer.get(this.f5537m, this.n, i6);
        this.n += i6;
        l4.flip();
    }

    @Override // U.n
    public final long g(long j4) {
        return Math.max(0L, j4 - W.J.S(this.f3062b.f3055a, this.f5534j + this.f5533i));
    }

    @Override // U.o
    public final U.k h(U.k kVar) {
        if (!W.J.H(kVar.f3057c)) {
            throw new U.m(kVar);
        }
        this.f5535k = true;
        return (this.f5533i == 0 && this.f5534j == 0) ? U.k.f3054e : kVar;
    }

    @Override // U.o
    public final void i() {
        if (this.f5535k) {
            this.f5535k = false;
            int i4 = this.f5534j;
            int i5 = this.f3062b.f3058d;
            this.f5537m = new byte[i4 * i5];
            this.f5536l = this.f5533i * i5;
        }
        this.n = 0;
    }

    @Override // U.o
    public final void j() {
        if (this.f5535k) {
            if (this.n > 0) {
                this.o += r0 / this.f3062b.f3058d;
            }
            this.n = 0;
        }
    }

    @Override // U.o
    public final void k() {
        this.f5537m = W.J.f3264b;
    }
}
