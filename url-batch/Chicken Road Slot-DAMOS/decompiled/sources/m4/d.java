package m4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f6555a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6556b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f6557c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f6558d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                v4.a.v(autoCloseable);
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
