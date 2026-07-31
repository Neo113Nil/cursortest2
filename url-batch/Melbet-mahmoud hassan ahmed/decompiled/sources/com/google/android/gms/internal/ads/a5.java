package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* loaded from: classes.dex */
final class a5 implements z4 {

    /* renamed from: a, reason: collision with root package name */
    private final FileChannel f2605a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2606b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2607c;

    public a5(FileChannel fileChannel, long j7, long j8) {
        this.f2605a = fileChannel;
        this.f2606b = j7;
        this.f2607c = j8;
    }

    @Override // com.google.android.gms.internal.ads.z4
    public final void a(MessageDigest[] messageDigestArr, long j7, int i7) {
        MappedByteBuffer map = this.f2605a.map(FileChannel.MapMode.READ_ONLY, this.f2606b + j7, i7);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.z4
    public final long zza() {
        return this.f2607c;
    }
}
