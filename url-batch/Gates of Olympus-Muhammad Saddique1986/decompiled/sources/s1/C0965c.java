package s1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965c {

    /* renamed from: a, reason: collision with root package name */
    public final C0966d f8354a = new C0966d();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8355b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f8356c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f8357d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }
}
