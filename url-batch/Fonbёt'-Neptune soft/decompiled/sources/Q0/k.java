package Q0;

/* loaded from: classes.dex */
public final class k extends l implements V0.c, P0.l {
    @Override // Q0.c
    public final V0.a a() {
        p.f984a.getClass();
        return this;
    }

    public final void e() {
        if (this.f980k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        V0.a c2 = c();
        if (c2 == this) {
            throw new O0.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((k) ((V0.c) c2)).e();
    }

    @Override // P0.l
    public final Object i(Object obj) {
        e();
        throw null;
    }
}
