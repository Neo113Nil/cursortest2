package kotlin.random;

/* loaded from: classes9.dex */
public final class FallbackThreadLocalRandom$implStorage$1 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new java.util.Random();
    }
}
