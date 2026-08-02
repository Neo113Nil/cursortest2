package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2370a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f2371b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2372c = new LinkedHashMap();

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public void b() {
    }
}
