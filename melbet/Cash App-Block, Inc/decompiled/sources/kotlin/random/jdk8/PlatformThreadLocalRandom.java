package kotlin.random.jdk8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.random.AbstractPlatformRandom;

/* loaded from: classes3.dex */
public final class PlatformThreadLocalRandom extends AbstractPlatformRandom {
    @Override // kotlin.random.AbstractPlatformRandom
    public final Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }

    @Override // kotlin.random.Random
    public final int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.random.Random
    public final long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
