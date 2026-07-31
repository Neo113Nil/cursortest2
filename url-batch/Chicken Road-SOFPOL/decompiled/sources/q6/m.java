package q6;

import a7.w;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends n implements w6.c {
    @Override // q6.c
    public final w6.a a() {
        t.f6206a.getClass();
        return this;
    }

    @Override // w6.c
    public final void h() {
        if (this.f6200j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        w6.a f6 = f();
        if (f6 == this) {
            throw new w("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((w6.c) ((w6.d) f6)).h();
    }

    @Override // p6.c
    public final Object i(Object obj) {
        h();
        throw null;
    }
}
