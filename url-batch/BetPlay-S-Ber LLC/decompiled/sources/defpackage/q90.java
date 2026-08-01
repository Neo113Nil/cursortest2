package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class q90 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        for (m90 m90Var : this.a.values()) {
            m90Var.c = true;
            HashMap hashMap = m90Var.a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = m90Var.a.values().iterator();
                        while (it.hasNext()) {
                            m90.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = m90Var.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = m90Var.b.iterator();
                        while (it2.hasNext()) {
                            m90.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            m90Var.b();
        }
        this.a.clear();
    }
}
