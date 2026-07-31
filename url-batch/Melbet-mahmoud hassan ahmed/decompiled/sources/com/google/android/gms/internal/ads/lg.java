package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
final class lg implements mf {

    /* renamed from: b, reason: collision with root package name */
    private int f7960b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f7961c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f7962d = 0;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f7963e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f7964f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7965g;

    public lg() {
        ByteBuffer byteBuffer = mf.f8510a;
        this.f7963e = byteBuffer;
        this.f7964f = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final int a() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void b() {
        this.f7965g = true;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final ByteBuffer c() {
        ByteBuffer byteBuffer = this.f7964f;
        this.f7964f = mf.f8510a;
        return byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080 A[ADDED_TO_REGION, LOOP:2: B:24:0x0080->B:25:0x0082, LOOP_START, PHI: r0
      0x0080: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:10:0x0040, B:25:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.google.android.gms.internal.ads.mf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ByteBuffer byteBuffer) {
        int i7;
        int i8;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        int i10 = this.f7962d;
        if (i10 == Integer.MIN_VALUE) {
            i9 /= 3;
        } else if (i10 != 3) {
            if (i10 != 1073741824) {
                throw new IllegalStateException();
            }
            i7 = i9 / 2;
            if (this.f7963e.capacity() >= i7) {
                this.f7963e = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
            } else {
                this.f7963e.clear();
            }
            i8 = this.f7962d;
            if (i8 != Integer.MIN_VALUE) {
                while (position < limit) {
                    this.f7963e.put(byteBuffer.get(position + 1));
                    this.f7963e.put(byteBuffer.get(position + 2));
                    position += 3;
                }
            } else if (i8 == 3) {
                while (position < limit) {
                    this.f7963e.put((byte) 0);
                    this.f7963e.put((byte) ((byteBuffer.get(position) & 255) - 128));
                    position++;
                }
            } else {
                if (i8 != 1073741824) {
                    throw new IllegalStateException();
                }
                while (position < limit) {
                    this.f7963e.put(byteBuffer.get(position + 2));
                    this.f7963e.put(byteBuffer.get(position + 3));
                    position += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f7963e.flip();
            this.f7964f = this.f7963e;
        }
        i7 = i9 + i9;
        if (this.f7963e.capacity() >= i7) {
        }
        i8 = this.f7962d;
        if (i8 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.f7963e.flip();
        this.f7964f = this.f7963e;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void e() {
        g();
        this.f7963e = mf.f8510a;
        this.f7960b = -1;
        this.f7961c = -1;
        this.f7962d = 0;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final boolean f(int i7, int i8, int i9) {
        if (i9 != 3 && i9 != 2 && i9 != Integer.MIN_VALUE && i9 != 1073741824) {
            throw new lf(i7, i8, i9);
        }
        if (this.f7960b == i7 && this.f7961c == i8 && this.f7962d == i9) {
            return false;
        }
        this.f7960b = i7;
        this.f7961c = i8;
        this.f7962d = i9;
        if (i9 != 2) {
            return true;
        }
        this.f7963e = mf.f8510a;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final void g() {
        this.f7964f = mf.f8510a;
        this.f7965g = false;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final boolean h() {
        int i7 = this.f7962d;
        return (i7 == 0 || i7 == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final boolean i() {
        return this.f7965g && this.f7964f == mf.f8510a;
    }

    @Override // com.google.android.gms.internal.ads.mf
    public final int zza() {
        return this.f7961c;
    }
}
