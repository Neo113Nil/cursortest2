package c4;

/* loaded from: classes.dex */
public final class u1<T> implements s1<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final u1<Object> f2129b = new u1<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f2130a;

    private u1(T t6) {
        this.f2130a = t6;
    }

    public static <T> s1<T> a(T t6) {
        return new u1(w1.b(t6, "instance cannot be null"));
    }

    @Override // c4.v1
    public final T zza() {
        return this.f2130a;
    }
}
