package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.af;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class n implements f {

    /* renamed from: b, reason: collision with root package name */
    private static final int f6747b = Float.floatToIntBits(Float.NaN);

    /* renamed from: c, reason: collision with root package name */
    private static final double f6748c = 4.656612875245797E-10d;

    /* renamed from: d, reason: collision with root package name */
    private int f6749d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f6750e = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f6751f = 0;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f6752g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f6753h;
    private boolean i;

    public n() {
        ByteBuffer byteBuffer = f.f6597a;
        this.f6752g = byteBuffer;
        this.f6753h = byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i9) {
        if (!af.c(i9)) {
            throw new f.a(i, i4, i9);
        }
        if (this.f6749d == i && this.f6750e == i4 && this.f6751f == i9) {
            return false;
        }
        this.f6749d = i;
        this.f6750e = i4;
        this.f6751f = i9;
        return true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        return this.f6750e;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 4;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6749d;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.i = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6753h;
        this.f6753h = f.f6597a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.i && this.f6753h == f.f6597a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.f6753h = f.f6597a;
        this.i = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f6749d = -1;
        this.f6750e = -1;
        this.f6751f = 0;
        this.f6752g = f.f6597a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return af.c(this.f6751f);
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        boolean z8 = this.f6751f == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z8) {
            i = (i / 3) * 4;
        }
        if (this.f6752g.capacity() < i) {
            this.f6752g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f6752g.clear();
        }
        if (z8) {
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), this.f6752g);
                position += 4;
            }
        } else {
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), this.f6752g);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f6752g.flip();
        this.f6753h = this.f6752g;
    }

    private static void a(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * f6748c));
        if (floatToIntBits == f6747b) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
