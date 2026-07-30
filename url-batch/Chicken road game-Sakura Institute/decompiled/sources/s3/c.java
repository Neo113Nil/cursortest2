package s3;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import r6.i;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f8523a = new d();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8524b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f8525c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f8526d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                i.d(autoCloseable);
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        }
    }
}
