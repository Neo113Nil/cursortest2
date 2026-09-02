package R1;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class e {
    private final Set<Class<?>> services = new LinkedHashSet();

    public final Set<Class<?>> getServices() {
        return this.services;
    }

    public final /* synthetic */ <TService> e provides() {
        i.i();
        throw null;
    }

    public abstract Object resolve(b bVar);

    public final <TService> e provides(Class<TService> c7) {
        i.e(c7, "c");
        this.services.add(c7);
        return this;
    }
}
