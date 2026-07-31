package t0;

import java.nio.ByteBuffer;
import o2.m0;
import t0.g;

/* loaded from: classes.dex */
final class k0 extends x {

    /* renamed from: i, reason: collision with root package name */
    private int f21803i;

    /* renamed from: j, reason: collision with root package name */
    private int f21804j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21805k;

    /* renamed from: l, reason: collision with root package name */
    private int f21806l;

    /* renamed from: m, reason: collision with root package name */
    private byte[] f21807m = m0.f19757f;

    /* renamed from: n, reason: collision with root package name */
    private int f21808n;

    /* renamed from: o, reason: collision with root package name */
    private long f21809o;

    @Override // t0.x, t0.g
    public boolean c() {
        return super.c() && this.f21808n == 0;
    }

    @Override // t0.x, t0.g
    public ByteBuffer d() {
        int i7;
        if (super.c() && (i7 = this.f21808n) > 0) {
            m(i7).put(this.f21807m, 0, this.f21808n).flip();
            this.f21808n = 0;
        }
        return super.d();
    }

    @Override // t0.g
    public void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.f21806l);
        this.f21809o += min / this.f21877b.f21745d;
        this.f21806l -= min;
        byteBuffer.position(position + min);
        if (this.f21806l > 0) {
            return;
        }
        int i8 = i7 - min;
        int length = (this.f21808n + i8) - this.f21807m.length;
        ByteBuffer m7 = m(length);
        int q7 = m0.q(length, 0, this.f21808n);
        m7.put(this.f21807m, 0, q7);
        int q8 = m0.q(length - q7, 0, i8);
        byteBuffer.limit(byteBuffer.position() + q8);
        m7.put(byteBuffer);
        byteBuffer.limit(limit);
        int i9 = i8 - q8;
        int i10 = this.f21808n - q7;
        this.f21808n = i10;
        byte[] bArr = this.f21807m;
        System.arraycopy(bArr, q7, bArr, 0, i10);
        byteBuffer.get(this.f21807m, this.f21808n, i9);
        this.f21808n += i9;
        m7.flip();
    }

    @Override // t0.x
    public g.a i(g.a aVar) {
        if (aVar.f21744c != 2) {
            throw new g.b(aVar);
        }
        this.f21805k = true;
        return (this.f21803i == 0 && this.f21804j == 0) ? g.a.f21741e : aVar;
    }

    @Override // t0.x
    protected void j() {
        if (this.f21805k) {
            this.f21805k = false;
            int i7 = this.f21804j;
            int i8 = this.f21877b.f21745d;
            this.f21807m = new byte[i7 * i8];
            this.f21806l = this.f21803i * i8;
        }
        this.f21808n = 0;
    }

    @Override // t0.x
    protected void k() {
        if (this.f21805k) {
            if (this.f21808n > 0) {
                this.f21809o += r0 / this.f21877b.f21745d;
            }
            this.f21808n = 0;
        }
    }

    @Override // t0.x
    protected void l() {
        this.f21807m = m0.f19757f;
    }

    public long n() {
        return this.f21809o;
    }

    public void o() {
        this.f21809o = 0L;
    }

    public void p(int i7, int i8) {
        this.f21803i = i7;
        this.f21804j = i8;
    }
}
