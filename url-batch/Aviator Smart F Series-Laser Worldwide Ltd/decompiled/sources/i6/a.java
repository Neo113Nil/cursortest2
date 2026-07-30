package i6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class a extends kotlin.random.a {
    @Override // kotlin.random.a
    public Random getImpl() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        s.checkNotNullExpressionValue(current, "current()");
        return current;
    }

    @Override // kotlin.random.Random
    public double nextDouble(double d8) {
        return ThreadLocalRandom.current().nextDouble(d8);
    }

    @Override // kotlin.random.Random
    public int nextInt(int i8, int i9) {
        return ThreadLocalRandom.current().nextInt(i8, i9);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j8) {
        return ThreadLocalRandom.current().nextLong(j8);
    }

    @Override // kotlin.random.Random
    public long nextLong(long j8, long j9) {
        return ThreadLocalRandom.current().nextLong(j8, j9);
    }
}
