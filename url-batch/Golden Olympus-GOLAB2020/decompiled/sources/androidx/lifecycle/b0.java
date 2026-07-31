package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12635a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f12635a.values().iterator();
        while (it.hasNext()) {
            ((V) it.next()).clear();
        }
        this.f12635a.clear();
    }

    public final V b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (V) this.f12635a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f12635a.keySet());
    }

    public final void d(String key, V viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        V v4 = (V) this.f12635a.put(key, viewModel);
        if (v4 != null) {
            v4.onCleared();
        }
    }
}
