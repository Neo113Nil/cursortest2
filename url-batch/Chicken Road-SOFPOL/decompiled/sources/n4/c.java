package n4;

import a0.q;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f5371a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5372b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f5373c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f5374d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                q.p(autoCloseable);
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
    }
}
