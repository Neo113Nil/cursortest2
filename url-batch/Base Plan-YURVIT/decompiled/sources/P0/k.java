package P0;

/* loaded from: classes.dex */
public final class k extends l implements T0.c, O0.l {
    @Override // P0.c
    public final T0.a a() {
        p.f808a.getClass();
        return this;
    }

    public final void e() {
        if (this.f804k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        T0.a d2 = d();
        if (d2 == this) {
            throw new N0.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((k) ((T0.c) d2)).e();
    }

    @Override // O0.l
    public final Object j(Object obj) {
        e();
        throw null;
    }
}
