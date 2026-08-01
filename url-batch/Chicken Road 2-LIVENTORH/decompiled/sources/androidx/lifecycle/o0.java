package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f625a = new LinkedHashMap();

    public final void a() {
        for (l0 l0Var : this.f625a.values()) {
            l0Var.getClass();
            HashMap hashMap = l0Var.f615a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = l0Var.f615a.values().iterator();
                        while (it.hasNext()) {
                            l0.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = l0Var.f616b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = l0Var.f616b.iterator();
                        while (it2.hasNext()) {
                            l0.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            l0Var.b();
        }
        this.f625a.clear();
    }
}
