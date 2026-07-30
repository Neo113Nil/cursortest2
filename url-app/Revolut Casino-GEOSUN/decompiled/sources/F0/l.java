package F0;

/* loaded from: classes.dex */
public final class l extends m implements J0.c, E0.l {
    @Override // F0.c
    public final J0.a a() {
        q.f325a.getClass();
        return this;
    }

    public final void e() {
        if (this.f321k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        J0.a c2 = c();
        if (c2 == this) {
            throw new D0.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((l) ((J0.c) c2)).e();
    }

    @Override // E0.l
    public final Object i(Object obj) {
        e();
        throw null;
    }
}
