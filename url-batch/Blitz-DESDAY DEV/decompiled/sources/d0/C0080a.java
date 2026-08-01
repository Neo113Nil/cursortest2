package d0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080a {

    /* renamed from: a, reason: collision with root package name */
    public final C0081b f2121a = new C0081b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2122b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2123c = new LinkedHashSet();
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
