package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class V {
    private final Map<String, Object> mBagOfTags = new HashMap();
    private final Set<Closeable> mCloseables = new LinkedHashSet();
    private volatile boolean mCleared = false;

    private static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public void addCloseable(Closeable closeable) {
        if (this.mCleared) {
            a(closeable);
            return;
        }
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                this.mCloseables.add(closeable);
            }
        }
    }

    final void clear() {
        this.mCleared = true;
        Map<String, Object> map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator<Object> it = this.mBagOfTags.values().iterator();
                    while (it.hasNext()) {
                        a(it.next());
                    }
                } finally {
                }
            }
        }
        Set<Closeable> set = this.mCloseables;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator<Closeable> it2 = this.mCloseables.iterator();
                    while (it2.hasNext()) {
                        a(it2.next());
                    }
                } finally {
                }
            }
            this.mCloseables.clear();
        }
        onCleared();
    }

    <T> T getTag(String str) {
        T t4;
        Map<String, Object> map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t4 = (T) this.mBagOfTags.get(str);
        }
        return t4;
    }

    protected void onCleared() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T setTagIfAbsent(String str, T t4) {
        Object obj;
        synchronized (this.mBagOfTags) {
            try {
                obj = this.mBagOfTags.get(str);
                if (obj == 0) {
                    this.mBagOfTags.put(str, t4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            t4 = obj;
        }
        if (this.mCleared) {
            a(t4);
        }
        return t4;
    }
}
