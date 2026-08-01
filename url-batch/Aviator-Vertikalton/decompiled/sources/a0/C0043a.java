package a0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043a {

    /* renamed from: a, reason: collision with root package name */
    public final b f948a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f949b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f950c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f951d;

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
