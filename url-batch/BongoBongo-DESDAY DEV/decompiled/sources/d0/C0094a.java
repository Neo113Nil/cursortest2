package d0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094a {

    /* renamed from: a, reason: collision with root package name */
    public final b f2128a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2129b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2130c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
