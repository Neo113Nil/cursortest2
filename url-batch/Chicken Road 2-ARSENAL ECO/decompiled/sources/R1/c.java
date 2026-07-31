package R1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class c implements a {
    private final List<e> registrations = new ArrayList();

    @Override // R1.a
    public d build() {
        return new d(this.registrations);
    }

    public final /* synthetic */ <T> e register() {
        i.i();
        throw null;
    }

    @Override // R1.a
    public <T> e register(Class<T> c7) {
        i.e(c7, "c");
        g gVar = new g(c7);
        this.registrations.add(gVar);
        return gVar;
    }

    @Override // R1.a
    public <T> e register(InterfaceC0743l create) {
        i.e(create, "create");
        f fVar = new f(create);
        this.registrations.add(fVar);
        return fVar;
    }

    @Override // R1.a
    public <T> e register(T t6) {
        h hVar = new h(t6);
        this.registrations.add(hVar);
        return hVar;
    }
}
