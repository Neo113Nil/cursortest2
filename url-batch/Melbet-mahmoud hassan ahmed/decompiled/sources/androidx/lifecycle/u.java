package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f929a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f930b = false;

    private static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    final void a() {
        this.f930b = true;
        Map<String, Object> map = this.f929a;
        if (map != null) {
            synchronized (map) {
                Iterator<Object> it = this.f929a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }
        c();
    }

    protected void c() {
    }
}
