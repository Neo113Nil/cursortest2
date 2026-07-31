package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class An {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3153zn f37192a;

    /* renamed from: b, reason: collision with root package name */
    public final BiFunction f37193b;

    /* renamed from: c, reason: collision with root package name */
    public final M6 f37194c;

    public An() {
        this(new C3101xn(), new Ga(), C3082x4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C3127yn());
        try {
            map = this.f37192a.c();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C2997tn) this.f37193b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public An(InterfaceC3153zn interfaceC3153zn, Ga ga, M6 m6) {
        this.f37192a = interfaceC3153zn;
        this.f37193b = ga;
        this.f37194c = m6;
    }
}
