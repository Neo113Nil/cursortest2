package kotlin.random;

/* loaded from: classes9.dex */
public final class FallbackThreadLocalRandom extends AbstractPlatformRandom {
    public final FallbackThreadLocalRandom$implStorage$1 implStorage = new FallbackThreadLocalRandom$implStorage$1();

    @Override // kotlin.random.AbstractPlatformRandom
    public final java.util.Random getImpl() {
        Object obj = this.implStorage.get();
        obj.getClass();
        return (java.util.Random) obj;
    }
}
