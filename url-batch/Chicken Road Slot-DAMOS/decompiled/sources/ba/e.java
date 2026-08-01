package ba;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {
    private final Set<Class<?>> services = new LinkedHashSet();

    public final Set<Class<?>> getServices() {
        return this.services;
    }

    public final <TService> e provides(Class<TService> cls) {
        cls.getClass();
        this.services.add(cls);
        return this;
    }

    public abstract Object resolve(b bVar);

    public final /* synthetic */ <TService> e provides() {
        Intrinsics.d();
        throw null;
    }
}
