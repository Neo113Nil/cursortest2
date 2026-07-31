package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
final class hg implements mf {

    /* renamed from: b, reason: collision with root package name */
    private int f6229b;

    /* renamed from: c, reason: collision with root package name */
    private int f6230c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f6231d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6232e;

    /* renamed from: f, reason: collision with root package name */
    private int[] f6233f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f6234g;

    /* renamed from: h, reason: collision with root package name */
    private ByteBuffer f6235h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6236i;

    public hg() {
        ByteBuffer byteBuffer = mf.f8510a;
        this.f6234g = byteBuffer;
        this.f6235h = byteBuffer;
        this.f6229b = -1;
        this.f6230c = -1;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final int a() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void b() {
        this.f6236i = true;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.f6235h;
        this.f6235h = mf.f8510a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = this.f6229b;
        int length = ((limit - position) / (i7 + i7)) * this.f6233f.length;
        int i8 = length + length;
        if (this.f6234g.capacity() < i8) {
            this.f6234g = ByteBuffer.allocateDirect(i8).order(ByteOrder.nativeOrder());
        } else {
            this.f6234g.clear();
        }
        while (position < limit) {
            for (int i9 : this.f6233f) {
                this.f6234g.putShort(byteBuffer.getShort(i9 + i9 + position));
            }
            int i10 = this.f6229b;
            position += i10 + i10;
        }
        byteBuffer.position(limit);
        this.f6234g.flip();
        this.f6235h = this.f6234g;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void e() {
        g();
        this.f6234g = mf.f8510a;
        this.f6229b = -1;
        this.f6230c = -1;
        this.f6233f = null;
        this.f6232e = false;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final boolean f(int i7, int i8, int i9) {
        boolean z6 = !Arrays.equals(this.f6231d, this.f6233f);
        int[] iArr = this.f6231d;
        this.f6233f = iArr;
        if (iArr == null) {
            this.f6232e = false;
            return z6;
        }
        if (i9 != 2) {
            throw new lf(i7, i8, i9);
        }
        if (!z6 && this.f6230c == i7 && this.f6229b == i8) {
            return false;
        }
        this.f6230c = i7;
        this.f6229b = i8;
        this.f6232e = i8 != iArr.length;
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f6233f;
            if (i10 >= iArr2.length) {
                return true;
            }
            int i11 = iArr2[i10];
            if (i11 >= i8) {
                throw new lf(i7, i8, 2);
            }
            this.f6232e = (i11 != i10) | this.f6232e;
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void g() {
        this.f6235h = mf.f8510a;
        this.f6236i = false;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final boolean h() {
        return this.f6232e;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final boolean i() {
        return this.f6236i && this.f6235h == mf.f8510a;
    }

    public final void j(int[] iArr) {
        this.f6231d = iArr;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final int zza() {
        int[] iArr = this.f6233f;
        return iArr == null ? this.f6229b : iArr.length;
    }
}
