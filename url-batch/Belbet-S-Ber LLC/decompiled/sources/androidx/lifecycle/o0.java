package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f729a = new LinkedHashMap();

    public final void a() {
        for (l0 l0Var : this.f729a.values()) {
            l0Var.getClass();
            HashMap hashMap = l0Var.f720a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = l0Var.f720a.values().iterator();
                        while (it.hasNext()) {
                            l0.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = l0Var.f721b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = l0Var.f721b.iterator();
                        while (it2.hasNext()) {
                            l0.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            l0Var.b();
        }
        this.f729a.clear();
    }
}
