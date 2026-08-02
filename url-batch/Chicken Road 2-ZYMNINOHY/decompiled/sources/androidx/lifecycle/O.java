package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5037a = new LinkedHashMap();

    public final void a() {
        for (J j4 : this.f5037a.values()) {
            j4.f5031c = true;
            HashMap hashMap = j4.f5029a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = j4.f5029a.values().iterator();
                        while (it.hasNext()) {
                            J.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = j4.f5030b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = j4.f5030b.iterator();
                        while (it2.hasNext()) {
                            J.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
                j4.f5030b.clear();
            }
            j4.b();
        }
        this.f5037a.clear();
    }
}
