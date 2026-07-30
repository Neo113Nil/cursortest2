package r4;

import E7.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c implements InterfaceC4964a {
    private final List<e> registrations = new ArrayList();

    @Override // r4.InterfaceC4964a
    public d build() {
        return new d(this.registrations);
    }

    public final /* synthetic */ <T> e register() {
        kotlin.jvm.internal.h.h();
        throw null;
    }

    @Override // r4.InterfaceC4964a
    public <T> e register(Class<T> c4) {
        kotlin.jvm.internal.h.e(c4, "c");
        g gVar = new g(c4);
        this.registrations.add(gVar);
        return gVar;
    }

    @Override // r4.InterfaceC4964a
    public <T> e register(l create) {
        kotlin.jvm.internal.h.e(create, "create");
        f fVar = new f(create);
        this.registrations.add(fVar);
        return fVar;
    }

    @Override // r4.InterfaceC4964a
    public <T> e register(T t9) {
        h hVar = new h(t9);
        this.registrations.add(hVar);
        return hVar;
    }
}
