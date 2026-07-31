package D2;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Map f429a = new LinkedHashMap();

    public final w a() {
        return new w(this.f429a);
    }

    public final i b(String key, i element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return (i) this.f429a.put(key, element);
    }
}
