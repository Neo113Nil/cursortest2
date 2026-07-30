package t2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements InterfaceC0925a {
    private final List<e> registrations = new ArrayList();

    @Override // t2.InterfaceC0925a
    public d build() {
        return new d(this.registrations);
    }

    public final /* synthetic */ <T> e register() {
        Intrinsics.f();
        throw null;
    }

    @Override // t2.InterfaceC0925a
    public <T> e register(Class<T> c7) {
        Intrinsics.checkNotNullParameter(c7, "c");
        g gVar = new g(c7);
        this.registrations.add(gVar);
        return gVar;
    }

    @Override // t2.InterfaceC0925a
    public <T> e register(Function1<? super b, ? extends T> create) {
        Intrinsics.checkNotNullParameter(create, "create");
        f fVar = new f(create);
        this.registrations.add(fVar);
        return fVar;
    }

    @Override // t2.InterfaceC0925a
    public <T> e register(T t6) {
        h hVar = new h(t6);
        this.registrations.add(hVar);
        return hVar;
    }
}
