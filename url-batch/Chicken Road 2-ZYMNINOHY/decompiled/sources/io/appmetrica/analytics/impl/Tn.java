package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Tn {
    public static final Qn a(Throwable th, V v, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        Gn a3 = th != null ? Hn.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(d3.k.Y(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Dl((StackTraceElement) it.next()));
            }
        }
        return new Qn(a3, v, arrayList, null, null, null, str, bool);
    }
}
