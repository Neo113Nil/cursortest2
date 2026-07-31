package Z1;

import f2.InterfaceC0386a;
import f2.InterfaceC0389d;
import f2.InterfaceC0390e;

/* loaded from: classes.dex */
public final class k extends l implements InterfaceC0389d, InterfaceC0390e {
    public k(String str, String str2) {
        super(a.f3459d, z0.s.class, str, str2, 1);
    }

    @Override // Z1.b
    public final InterfaceC0386a a() {
        u.f3481a.getClass();
        return this;
    }

    @Override // f2.InterfaceC0389d
    public final void h() {
        if (this.f3475j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC0386a i3 = i();
        if (i3 == this) {
            throw new X1.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((k) ((InterfaceC0390e) i3)).h();
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        h();
        throw null;
    }
}
