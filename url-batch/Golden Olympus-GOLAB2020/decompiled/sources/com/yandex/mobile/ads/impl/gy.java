package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class gy extends AbstractC2168pl {

    /* renamed from: c, reason: collision with root package name */
    public final tu f26355c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f26356d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26357e;

    /* renamed from: f, reason: collision with root package name */
    public long f26358f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f26359g;

    /* renamed from: h, reason: collision with root package name */
    private final int f26360h;

    /* renamed from: i, reason: collision with root package name */
    private final int f26361i;

    public static final class a extends IllegalStateException {
        public a(int i4, int i5) {
            super("Buffer too small (" + i4 + " < " + i5 + ")");
        }
    }

    static {
        k60.a("goog.exo.decoder");
    }

    public gy(int i4) {
        this(i4, 0);
    }

    public static gy j() {
        return new gy(0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2168pl
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f26356d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f26359g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f26357e = false;
    }

    public final void e(int i4) {
        ByteBuffer allocateDirect;
        ByteBuffer allocateDirect2;
        int i5 = i4 + this.f26361i;
        ByteBuffer byteBuffer = this.f26356d;
        if (byteBuffer == null) {
            int i6 = this.f26360h;
            if (i6 == 1) {
                allocateDirect2 = ByteBuffer.allocate(i5);
            } else {
                if (i6 != 2) {
                    throw new a(byteBuffer != null ? byteBuffer.capacity() : 0, i5);
                }
                allocateDirect2 = ByteBuffer.allocateDirect(i5);
            }
            this.f26356d = allocateDirect2;
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i7 = i5 + position;
        if (capacity >= i7) {
            this.f26356d = byteBuffer;
            return;
        }
        int i8 = this.f26360h;
        if (i8 == 1) {
            allocateDirect = ByteBuffer.allocate(i7);
        } else {
            if (i8 != 2) {
                ByteBuffer byteBuffer2 = this.f26356d;
                throw new a(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i7);
            }
            allocateDirect = ByteBuffer.allocateDirect(i7);
        }
        allocateDirect.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            allocateDirect.put(byteBuffer);
        }
        this.f26356d = allocateDirect;
    }

    public final void h() {
        ByteBuffer byteBuffer = this.f26356d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f26359g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean i() {
        return c(1073741824);
    }

    public gy(int i4, int i5) {
        this.f26355c = new tu();
        this.f26360h = i4;
        this.f26361i = 0;
    }
}
