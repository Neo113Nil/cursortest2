package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class cs0 implements wu3 {

    /* renamed from: f, reason: collision with root package name */
    private final ByteBuffer f3931f;

    cs0(ByteBuffer byteBuffer) {
        this.f3931f = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.wu3
    public final int G(ByteBuffer byteBuffer) {
        if (this.f3931f.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f3931f.remaining());
        byte[] bArr = new byte[min];
        this.f3931f.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.wu3
    public final ByteBuffer J(long j7, long j8) {
        int position = this.f3931f.position();
        this.f3931f.position((int) j7);
        ByteBuffer slice = this.f3931f.slice();
        slice.limit((int) j8);
        this.f3931f.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.wu3
    public final long a() {
        return this.f3931f.position();
    }

    @Override // com.google.android.gms.internal.ads.wu3
    public final long c() {
        return this.f3931f.limit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.wu3
    public final void e(long j7) {
        this.f3931f.position((int) j7);
    }
}
