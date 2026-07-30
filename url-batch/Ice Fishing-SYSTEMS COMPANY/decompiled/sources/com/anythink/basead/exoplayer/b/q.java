package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class q implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final long f6775b = 150000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f6776c = 20000;

    /* renamed from: d, reason: collision with root package name */
    private static final short f6777d = 1024;

    /* renamed from: e, reason: collision with root package name */
    private static final byte f6778e = 4;

    /* renamed from: f, reason: collision with root package name */
    private static final int f6779f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f6780g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final int f6781h = 2;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f6782j;

    /* renamed from: k, reason: collision with root package name */
    private int f6783k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6784l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f6785m;

    /* renamed from: n, reason: collision with root package name */
    private ByteBuffer f6786n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6787o;

    /* renamed from: p, reason: collision with root package name */
    private byte[] f6788p;

    /* renamed from: q, reason: collision with root package name */
    private byte[] f6789q;

    /* renamed from: r, reason: collision with root package name */
    private int f6790r;

    /* renamed from: s, reason: collision with root package name */
    private int f6791s;

    /* renamed from: t, reason: collision with root package name */
    private int f6792t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6793u;

    /* renamed from: v, reason: collision with root package name */
    private long f6794v;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public q() {
        ByteBuffer byteBuffer = f.f6597a;
        this.f6785m = byteBuffer;
        this.f6786n = byteBuffer;
        this.i = -1;
        this.f6782j = -1;
        this.f6788p = new byte[0];
        this.f6789q = new byte[0];
    }

    public final void a(boolean z8) {
        this.f6784l = z8;
        h();
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.i;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6782j;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.f6787o = true;
        int i = this.f6791s;
        if (i > 0) {
            a(this.f6788p, i);
        }
        if (this.f6793u) {
            return;
        }
        this.f6794v += this.f6792t / this.f6783k;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6786n;
        this.f6786n = f.f6597a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.f6787o && this.f6786n == f.f6597a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        if (a()) {
            int a9 = a(f6775b) * this.f6783k;
            if (this.f6788p.length != a9) {
                this.f6788p = new byte[a9];
            }
            int a10 = a(f6776c) * this.f6783k;
            this.f6792t = a10;
            if (this.f6789q.length != a10) {
                this.f6789q = new byte[a10];
            }
        }
        this.f6790r = 0;
        this.f6786n = f.f6597a;
        this.f6787o = false;
        this.f6794v = 0L;
        this.f6791s = 0;
        this.f6793u = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        this.f6784l = false;
        h();
        this.f6785m = f.f6597a;
        this.i = -1;
        this.f6782j = -1;
        this.f6792t = 0;
        this.f6788p = new byte[0];
        this.f6789q = new byte[0];
    }

    public final long j() {
        return this.f6794v;
    }

    private void b(ByteBuffer byteBuffer) {
        int position;
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f6788p.length));
        int limit2 = byteBuffer.limit() - 1;
        while (true) {
            if (limit2 < byteBuffer.position()) {
                position = byteBuffer.position();
                break;
            } else {
                if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                    int i = this.f6783k;
                    position = ((limit2 / i) * i) + i;
                    break;
                }
                limit2 -= 2;
            }
        }
        if (position == byteBuffer.position()) {
            this.f6790r = 1;
        } else {
            byteBuffer.limit(position);
            a(byteBuffer.remaining());
            this.f6785m.put(byteBuffer);
            this.f6785m.flip();
            this.f6786n = this.f6785m;
        }
        byteBuffer.limit(limit);
    }

    private void c(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f6 = f(byteBuffer);
        int position = f6 - byteBuffer.position();
        byte[] bArr = this.f6788p;
        int length = bArr.length;
        int i = this.f6791s;
        int i4 = length - i;
        if (f6 < limit && position < i4) {
            a(bArr, i);
            this.f6791s = 0;
            this.f6790r = 0;
            return;
        }
        int min = Math.min(position, i4);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f6788p, this.f6791s, min);
        int i9 = this.f6791s + min;
        this.f6791s = i9;
        byte[] bArr2 = this.f6788p;
        if (i9 == bArr2.length) {
            if (this.f6793u) {
                a(bArr2, this.f6792t);
                this.f6794v += (this.f6791s - (this.f6792t * 2)) / this.f6783k;
            } else {
                this.f6794v += (i9 - this.f6792t) / this.f6783k;
            }
            a(byteBuffer, this.f6788p, this.f6791s);
            this.f6791s = 0;
            this.f6790r = 2;
        }
        byteBuffer.limit(limit);
    }

    private void d(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int f6 = f(byteBuffer);
        byteBuffer.limit(f6);
        this.f6794v += byteBuffer.remaining() / this.f6783k;
        a(byteBuffer, this.f6789q, this.f6792t);
        if (f6 < limit) {
            a(this.f6789q, this.f6792t);
            this.f6790r = 0;
            byteBuffer.limit(limit);
        }
    }

    private int g(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.get(limit)) > 4) {
                int i = this.f6783k;
                return ((limit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    private int f(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i = this.f6783k;
                return (position / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i9) {
        if (i9 == 2) {
            if (this.f6782j == i && this.i == i4) {
                return false;
            }
            this.f6782j = i;
            this.i = i4;
            this.f6783k = i4 * 2;
            return true;
        }
        throw new f.a(i, i4, i9);
    }

    private void e(ByteBuffer byteBuffer) {
        a(byteBuffer.remaining());
        this.f6785m.put(byteBuffer);
        this.f6785m.flip();
        this.f6786n = this.f6785m;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return this.f6782j != -1 && this.f6784l;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f6786n.hasRemaining()) {
            int i = this.f6790r;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f6788p.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.get(limit2)) > 4) {
                            int i4 = this.f6783k;
                            position = ((limit2 / i4) * i4) + i4;
                            break;
                        }
                        limit2 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f6790r = 1;
                } else {
                    byteBuffer.limit(position);
                    a(byteBuffer.remaining());
                    this.f6785m.put(byteBuffer);
                    this.f6785m.flip();
                    this.f6786n = this.f6785m;
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int f6 = f(byteBuffer);
                int position2 = f6 - byteBuffer.position();
                byte[] bArr = this.f6788p;
                int length = bArr.length;
                int i9 = this.f6791s;
                int i10 = length - i9;
                if (f6 < limit3 && position2 < i10) {
                    a(bArr, i9);
                    this.f6791s = 0;
                    this.f6790r = 0;
                } else {
                    int min = Math.min(position2, i10);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f6788p, this.f6791s, min);
                    int i11 = this.f6791s + min;
                    this.f6791s = i11;
                    byte[] bArr2 = this.f6788p;
                    if (i11 == bArr2.length) {
                        if (this.f6793u) {
                            a(bArr2, this.f6792t);
                            this.f6794v += (this.f6791s - (this.f6792t * 2)) / this.f6783k;
                        } else {
                            this.f6794v += (i11 - this.f6792t) / this.f6783k;
                        }
                        a(byteBuffer, this.f6788p, this.f6791s);
                        this.f6791s = 0;
                        this.f6790r = 2;
                    }
                    byteBuffer.limit(limit3);
                }
            } else if (i == 2) {
                int limit4 = byteBuffer.limit();
                int f9 = f(byteBuffer);
                byteBuffer.limit(f9);
                this.f6794v += byteBuffer.remaining() / this.f6783k;
                a(byteBuffer, this.f6789q, this.f6792t);
                if (f9 < limit4) {
                    a(this.f6789q, this.f6792t);
                    this.f6790r = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void a(byte[] bArr, int i) {
        a(i);
        this.f6785m.put(bArr, 0, i);
        this.f6785m.flip();
        this.f6786n = this.f6785m;
    }

    private void a(int i) {
        if (this.f6785m.capacity() < i) {
            this.f6785m = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f6785m.clear();
        }
        if (i > 0) {
            this.f6793u = true;
        }
    }

    private void a(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f6792t);
        int i4 = this.f6792t - min;
        System.arraycopy(bArr, i - i4, this.f6789q, 0, i4);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f6789q, i4, min);
    }

    private int a(long j9) {
        return (int) ((j9 * this.f6782j) / 1000000);
    }
}
