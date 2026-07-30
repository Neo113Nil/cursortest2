package r6;

import c7.z;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends n implements x6.d, x6.e {
    public m(String str, String str2) {
        super(a.f7947f, y1.r.class, str, str2, 1);
    }

    @Override // x6.d
    public final void e() {
        if (this.f7963l) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        x6.a i7 = i();
        if (i7 == this) {
            throw new z("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((m) ((x6.e) i7)).e();
    }

    @Override // q6.c
    public final Object f(Object obj) {
        e();
        throw null;
    }

    @Override // r6.b
    public final x6.a g() {
        w.f7969a.getClass();
        return this;
    }

    @Override // x6.d
    public final Object get(Object obj) {
        throw null;
    }
}
