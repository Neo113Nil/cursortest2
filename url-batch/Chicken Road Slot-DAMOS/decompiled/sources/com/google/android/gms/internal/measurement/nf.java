package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class nf {

    /* renamed from: c, reason: collision with root package name */
    public static final nf f2582c;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f2583a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f2584b;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f2582c = new nf(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public nf(UUID uuid, long j) {
        this.f2583a = uuid;
        this.f2584b = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    public final long a() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.f2584b;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, ((25214903917L * (((j * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
    }

    public final UUID b() {
        long a9 = a() & (-61441);
        long a10 = a() >>> 2;
        UUID uuid = this.f2583a;
        return new UUID(a9 ^ uuid.getMostSignificantBits(), a10 ^ uuid.getLeastSignificantBits());
    }
}
