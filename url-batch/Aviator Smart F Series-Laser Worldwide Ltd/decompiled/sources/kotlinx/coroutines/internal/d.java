package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
final class d extends j {
    public static final d INSTANCE = new d();
    private static final a cache = new a();

    public static final class a extends ClassValue {
        a() {
        }

        @Override // java.lang.ClassValue
        public /* bridge */ /* synthetic */ Object computeValue(Class cls) {
            return computeValue((Class<?>) cls);
        }

        @Override // java.lang.ClassValue
        protected f6.l computeValue(Class<?> cls) {
            f6.l createConstructor;
            kotlin.jvm.internal.s.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            createConstructor = ExceptionsConstructorKt.createConstructor(cls);
            return createConstructor;
        }
    }

    private d() {
    }

    @Override // kotlinx.coroutines.internal.j
    public f6.l get(Class<? extends Throwable> cls) {
        Object obj;
        obj = cache.get(cls);
        return (f6.l) obj;
    }
}
