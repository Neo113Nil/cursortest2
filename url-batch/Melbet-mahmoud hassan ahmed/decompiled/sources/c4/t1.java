package c4;

/* loaded from: classes.dex */
public final class t1<T> implements v1<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f2106c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile v1<T> f2107a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f2108b = f2106c;

    private t1(v1<T> v1Var) {
        this.f2107a = v1Var;
    }

    public static <P extends v1<T>, T> v1<T> a(P p7) {
        w1.a(p7);
        return p7 instanceof t1 ? p7 : new t1(p7);
    }

    @Override // c4.v1
    public final T zza() {
        T t6 = (T) this.f2108b;
        Object obj = f2106c;
        if (t6 == obj) {
            synchronized (this) {
                t6 = (T) this.f2108b;
                if (t6 == obj) {
                    t6 = this.f2107a.zza();
                    Object obj2 = this.f2108b;
                    if ((obj2 != obj) && obj2 != t6) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t6);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f2108b = t6;
                    this.f2107a = null;
                }
            }
        }
        return t6;
    }
}
