package t0;

import java.nio.ByteBuffer;
import o2.m0;
import t0.g;

/* loaded from: classes.dex */
public final class h0 extends x {

    /* renamed from: i, reason: collision with root package name */
    private final long f21746i;

    /* renamed from: j, reason: collision with root package name */
    private final long f21747j;

    /* renamed from: k, reason: collision with root package name */
    private final short f21748k;

    /* renamed from: l, reason: collision with root package name */
    private int f21749l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21750m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f21751n;

    /* renamed from: o, reason: collision with root package name */
    private byte[] f21752o;

    /* renamed from: p, reason: collision with root package name */
    private int f21753p;

    /* renamed from: q, reason: collision with root package name */
    private int f21754q;

    /* renamed from: r, reason: collision with root package name */
    private int f21755r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21756s;

    /* renamed from: t, reason: collision with root package name */
    private long f21757t;

    public h0() {
        this(150000L, 20000L, (short) 1024);
    }

    public h0(long j7, long j8, short s7) {
        o2.a.a(j8 <= j7);
        this.f21746i = j7;
        this.f21747j = j8;
        this.f21748k = s7;
        byte[] bArr = m0.f19757f;
        this.f21751n = bArr;
        this.f21752o = bArr;
    }

    private int n(long j7) {
        return (int) ((j7 * this.f21877b.f21742a) / 1000000);
    }

    private int o(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        do {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(limit)) <= this.f21748k);
        int i7 = this.f21749l;
        return ((limit / i7) * i7) + i7;
    }

    private int p(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f21748k) {
                int i7 = this.f21749l;
                return i7 * (position / i7);
            }
        }
        return byteBuffer.limit();
    }

    private void r(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f21756s = true;
        }
    }

    private void s(byte[] bArr, int i7) {
        m(i7).put(bArr, 0, i7).flip();
        if (i7 > 0) {
            this.f21756s = true;
        }
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p7 = p(byteBuffer);
        int position = p7 - byteBuffer.position();
        byte[] bArr = this.f21751n;
        int length = bArr.length;
        int i7 = this.f21754q;
        int i8 = length - i7;
        if (p7 < limit && position < i8) {
            s(bArr, i7);
            this.f21754q = 0;
            this.f21753p = 0;
            return;
        }
        int min = Math.min(position, i8);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f21751n, this.f21754q, min);
        int i9 = this.f21754q + min;
        this.f21754q = i9;
        byte[] bArr2 = this.f21751n;
        if (i9 == bArr2.length) {
            if (this.f21756s) {
                s(bArr2, this.f21755r);
                this.f21757t += (this.f21754q - (this.f21755r * 2)) / this.f21749l;
            } else {
                this.f21757t += (i9 - this.f21755r) / this.f21749l;
            }
            x(byteBuffer, this.f21751n, this.f21754q);
            this.f21754q = 0;
            this.f21753p = 2;
        }
        byteBuffer.limit(limit);
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f21751n.length));
        int o7 = o(byteBuffer);
        if (o7 == byteBuffer.position()) {
            this.f21753p = 1;
        } else {
            byteBuffer.limit(o7);
            r(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void v(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int p7 = p(byteBuffer);
        byteBuffer.limit(p7);
        this.f21757t += byteBuffer.remaining() / this.f21749l;
        x(byteBuffer, this.f21752o, this.f21755r);
        if (p7 < limit) {
            s(this.f21752o, this.f21755r);
            this.f21753p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void x(ByteBuffer byteBuffer, byte[] bArr, int i7) {
        int min = Math.min(byteBuffer.remaining(), this.f21755r);
        int i8 = this.f21755r - min;
        System.arraycopy(bArr, i7 - i8, this.f21752o, 0, i8);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f21752o, i8, min);
    }

    @Override // t0.x, t0.g
    public boolean b() {
        return this.f21750m;
    }

    @Override // t0.g
    public void f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !h()) {
            int i7 = this.f21753p;
            if (i7 == 0) {
                u(byteBuffer);
            } else if (i7 == 1) {
                t(byteBuffer);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException();
                }
                v(byteBuffer);
            }
        }
    }

    @Override // t0.x
    public g.a i(g.a aVar) {
        if (aVar.f21744c == 2) {
            return this.f21750m ? aVar : g.a.f21741e;
        }
        throw new g.b(aVar);
    }

    @Override // t0.x
    protected void j() {
        if (this.f21750m) {
            this.f21749l = this.f21877b.f21745d;
            int n7 = n(this.f21746i) * this.f21749l;
            if (this.f21751n.length != n7) {
                this.f21751n = new byte[n7];
            }
            int n8 = n(this.f21747j) * this.f21749l;
            this.f21755r = n8;
            if (this.f21752o.length != n8) {
                this.f21752o = new byte[n8];
            }
        }
        this.f21753p = 0;
        this.f21757t = 0L;
        this.f21754q = 0;
        this.f21756s = false;
    }

    @Override // t0.x
    protected void k() {
        int i7 = this.f21754q;
        if (i7 > 0) {
            s(this.f21751n, i7);
        }
        if (this.f21756s) {
            return;
        }
        this.f21757t += this.f21755r / this.f21749l;
    }

    @Override // t0.x
    protected void l() {
        this.f21750m = false;
        this.f21755r = 0;
        byte[] bArr = m0.f19757f;
        this.f21751n = bArr;
        this.f21752o = bArr;
    }

    public long q() {
        return this.f21757t;
    }

    public void w(boolean z6) {
        this.f21750m = z6;
    }
}
