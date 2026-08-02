package defpackage;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gtb {
    public static final gtb a;
    private final UUID b;
    private final AtomicLong c;

    static {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            a = new gtb(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public gtb(UUID uuid, long j) {
        this.b = uuid;
        this.c = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    final long a() {
        AtomicLong atomicLong;
        long j;
        do {
            atomicLong = this.c;
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, ((25214903917L * (((j * 25214903917L) + 11) & 281474976710655L)) + 11) & 281474976710655L));
        return (((int) (r5 >>> 16)) << 32) + ((int) (r3 >>> 16));
    }

    public final UUID b() {
        long a2 = a() & (-61441);
        long a3 = a() >>> 2;
        UUID uuid = this.b;
        return new UUID(a2 ^ uuid.getMostSignificantBits(), a3 ^ uuid.getLeastSignificantBits());
    }
}
