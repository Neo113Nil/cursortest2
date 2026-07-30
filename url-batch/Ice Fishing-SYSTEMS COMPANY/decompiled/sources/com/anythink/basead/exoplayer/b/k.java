package com.anythink.basead.exoplayer.b;

import com.anythink.basead.exoplayer.b.f;
import com.anythink.basead.exoplayer.k.C0544a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
final class k implements f {

    /* renamed from: b, reason: collision with root package name */
    private int f6671b;

    /* renamed from: c, reason: collision with root package name */
    private int f6672c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f6673d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6674e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f6675f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f6676g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f6677h;
    private boolean i;

    public k() {
        ByteBuffer byteBuffer = f.f6597a;
        this.f6676g = byteBuffer;
        this.f6677h = byteBuffer;
        this.f6671b = -1;
        this.f6672c = -1;
    }

    public final void a(int[] iArr) {
        this.f6673d = iArr;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int b() {
        int[] iArr = this.f6675f;
        return iArr == null ? this.f6671b : iArr.length;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int c() {
        return 2;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final int d() {
        return this.f6672c;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void e() {
        this.i = true;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f6677h;
        this.f6677h = f.f6597a;
        return byteBuffer;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean g() {
        return this.i && this.f6677h == f.f6597a;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void h() {
        this.f6677h = f.f6597a;
        this.i = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void i() {
        h();
        this.f6676g = f.f6597a;
        this.f6671b = -1;
        this.f6672c = -1;
        this.f6675f = null;
        this.f6673d = null;
        this.f6674e = false;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a(int i, int i4, int i9) {
        boolean equals = Arrays.equals(this.f6673d, this.f6675f);
        boolean z8 = !equals;
        int[] iArr = this.f6673d;
        this.f6675f = iArr;
        if (iArr == null) {
            this.f6674e = false;
            return z8;
        }
        if (i9 != 2) {
            throw new f.a(i, i4, i9);
        }
        if (equals && this.f6672c == i && this.f6671b == i4) {
            return false;
        }
        this.f6672c = i;
        this.f6671b = i4;
        this.f6674e = i4 != iArr.length;
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f6675f;
            if (i10 >= iArr2.length) {
                return true;
            }
            int i11 = iArr2[i10];
            if (i11 >= i4) {
                throw new f.a(i, i4, i9);
            }
            this.f6674e = (i11 != i10) | this.f6674e;
            i10++;
        }
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final boolean a() {
        return this.f6674e;
    }

    @Override // com.anythink.basead.exoplayer.b.f
    public final void a(ByteBuffer byteBuffer) {
        C0544a.b(this.f6675f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f6671b * 2)) * this.f6675f.length * 2;
        if (this.f6676g.capacity() < length) {
            this.f6676g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f6676g.clear();
        }
        while (position < limit) {
            for (int i : this.f6675f) {
                this.f6676g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f6671b * 2;
        }
        byteBuffer.position(limit);
        this.f6676g.flip();
        this.f6677h = this.f6676g;
    }
}
