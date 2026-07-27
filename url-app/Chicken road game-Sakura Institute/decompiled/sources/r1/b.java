package r1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f9857a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9858b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f9859c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f9860d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e4) {
                throw new RuntimeException(e4);
            }
        }
    }
}
