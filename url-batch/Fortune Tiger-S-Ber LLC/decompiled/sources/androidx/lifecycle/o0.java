package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f597a = new LinkedHashMap();

    public final void a() {
        for (l0 l0Var : this.f597a.values()) {
            l0Var.getClass();
            HashMap hashMap = l0Var.f588a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = l0Var.f588a.values().iterator();
                        while (it.hasNext()) {
                            l0.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = l0Var.f589b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = l0Var.f589b.iterator();
                        while (it2.hasNext()) {
                            l0.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            l0Var.b();
        }
        this.f597a.clear();
    }
}
