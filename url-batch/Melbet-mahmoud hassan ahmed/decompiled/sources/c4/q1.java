package c4;

/* loaded from: classes.dex */
public final class q1<T> implements s1<T> {

    /* renamed from: a, reason: collision with root package name */
    private v1<T> f2088a;

    public static <T> void a(v1<T> v1Var, v1<T> v1Var2) {
        w1.a(v1Var2);
        q1 q1Var = (q1) v1Var;
        if (q1Var.f2088a != null) {
            throw new IllegalStateException();
        }
        q1Var.f2088a = v1Var2;
    }

    @Override // c4.v1
    public final T zza() {
        v1<T> v1Var = this.f2088a;
        if (v1Var != null) {
            return v1Var.zza();
        }
        throw new IllegalStateException();
    }
}
