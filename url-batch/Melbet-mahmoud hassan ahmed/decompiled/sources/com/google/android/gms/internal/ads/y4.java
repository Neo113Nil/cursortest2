package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class y4 implements z4 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f14536a;

    public y4(ByteBuffer byteBuffer) {
        this.f14536a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.z4
    public final void a(MessageDigest[] messageDigestArr, long j7, int i7) {
        ByteBuffer slice;
        synchronized (this.f14536a) {
            int i8 = (int) j7;
            this.f14536a.position(i8);
            this.f14536a.limit(i8 + i7);
            slice = this.f14536a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.google.android.gms.internal.ads.z4
    public final long zza() {
        return this.f14536a.capacity();
    }
}
