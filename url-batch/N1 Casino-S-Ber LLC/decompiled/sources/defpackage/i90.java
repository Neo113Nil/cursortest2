package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i90 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        for (f90 f90Var : this.a.values()) {
            f90Var.getClass();
            HashMap hashMap = f90Var.a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        Iterator it = f90Var.a.values().iterator();
                        while (it.hasNext()) {
                            f90.a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = f90Var.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = f90Var.b.iterator();
                        while (it2.hasNext()) {
                            f90.a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            f90Var.b();
        }
        this.a.clear();
    }
}
