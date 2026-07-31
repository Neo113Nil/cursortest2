package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class ys0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<yl> f14796a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private long f14797b;

    ys0() {
    }

    final long a() {
        Iterator<yl> it = this.f14796a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> b7 = it.next().b();
            if (b7 != null) {
                for (Map.Entry<String, List<String>> entry : b7.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.f14797b = Math.max(this.f14797b, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f14797b;
    }

    final void b(yl ylVar) {
        this.f14796a.add(ylVar);
    }
}
