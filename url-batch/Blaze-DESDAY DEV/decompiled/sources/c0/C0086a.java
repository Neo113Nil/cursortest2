package c0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086a {

    /* renamed from: a, reason: collision with root package name */
    public final b f1668a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1669b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f1670c = new LinkedHashSet();
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
