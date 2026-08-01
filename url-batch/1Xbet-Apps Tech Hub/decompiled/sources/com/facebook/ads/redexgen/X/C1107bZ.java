package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.redexgen.X.bZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1107bZ {
    public final Map<View, C1114bg> A00 = new WeakHashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized C1114bg A00(View view) {
        C1114bg c1114bg = this.A00.get(view);
        if (c1114bg != null) {
            return c1114bg;
        }
        return C1114bg.A08;
    }

    public final synchronized void A01(View view) {
        this.A00.remove(view);
    }

    public final synchronized void A02(View view, C1114bg c1114bg) {
        this.A00.put(view, c1114bg);
    }

    public final synchronized void A03(Collection<View> result) {
        Iterator<View> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            result.add(it.next());
        }
    }
}
