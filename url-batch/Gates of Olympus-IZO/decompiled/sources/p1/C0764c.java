package p1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: p1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764c {

    /* renamed from: a, reason: collision with root package name */
    public final C0765d f6756a = new C0765d();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6757b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f6758c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f6759d;

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
