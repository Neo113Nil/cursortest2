package kotlin.random;

/* loaded from: classes3.dex */
public abstract class AbstractPlatformRandom extends Random {
    public abstract java.util.Random getImpl();

    @Override // kotlin.random.Random
    public final int nextBits(int i) {
        return RandomKt.takeUpperBits(getImpl().nextInt(), i);
    }

    @Override // kotlin.random.Random
    public final double nextDouble() {
        return getImpl().nextDouble();
    }

    @Override // kotlin.random.Random
    public final float nextFloat() {
        return getImpl().nextFloat();
    }

    @Override // kotlin.random.Random
    public final int nextInt() {
        return getImpl().nextInt();
    }

    @Override // kotlin.random.Random
    public final long nextLong() {
        return getImpl().nextLong();
    }

    @Override // kotlin.random.Random
    public final int nextInt(int i) {
        return getImpl().nextInt(i);
    }
}
