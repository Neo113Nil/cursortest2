package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class z51 extends sz0 {

    /* renamed from: b, reason: collision with root package name */
    public final v21 f14951b = new v21();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f14952c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14953d;

    /* renamed from: e, reason: collision with root package name */
    public long f14954e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f14955f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14956g;

    public z51(int i7, int i8) {
        this.f14956g = i7;
    }

    private final ByteBuffer l(int i7) {
        int i8 = this.f14956g;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f14952c;
        throw new x41(byteBuffer == null ? 0 : byteBuffer.capacity(), i7);
    }

    @Override // com.google.android.gms.internal.ads.sz0
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f14952c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f14955f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f14953d = false;
    }

    public final void i(int i7) {
        ByteBuffer byteBuffer = this.f14952c;
        if (byteBuffer == null) {
            this.f14952c = l(i7);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i8 = i7 + position;
        if (capacity >= i8) {
            this.f14952c = byteBuffer;
            return;
        }
        ByteBuffer l7 = l(i8);
        l7.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l7.put(byteBuffer);
        }
        this.f14952c = l7;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f14952c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f14955f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean k() {
        return d(1073741824);
    }
}
