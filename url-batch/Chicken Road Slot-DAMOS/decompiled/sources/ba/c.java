package ba;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements a {
    private final List<e> registrations = new ArrayList();

    @Override // ba.a
    public d build() {
        return new d(this.registrations);
    }

    @Override // ba.a
    public <T> e register(Class<T> cls) {
        cls.getClass();
        g gVar = new g(cls);
        this.registrations.add(gVar);
        return gVar;
    }

    public final /* synthetic */ <T> e register() {
        Intrinsics.d();
        throw null;
    }

    @Override // ba.a
    public <T> e register(Function1<? super b, ? extends T> function1) {
        function1.getClass();
        f fVar = new f(function1);
        this.registrations.add(fVar);
        return fVar;
    }

    @Override // ba.a
    public <T> e register(T t6) {
        h hVar = new h(t6);
        this.registrations.add(hVar);
        return hVar;
    }
}
