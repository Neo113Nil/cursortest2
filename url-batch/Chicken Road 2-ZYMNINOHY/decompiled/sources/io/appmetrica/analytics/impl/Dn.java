package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class Dn {

    /* renamed from: a, reason: collision with root package name */
    public final Cn f10224a;

    /* renamed from: b, reason: collision with root package name */
    public final BiFunction f10225b;

    /* renamed from: c, reason: collision with root package name */
    public final Cf f10226c;

    public Dn() {
        this(new An(), new C0765la(), C0501b4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Bn());
        try {
            map = this.f10224a.c();
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
                arrayList.add((C1063wn) this.f10225b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public Dn(Cn cn, C0765la c0765la, C0916r6 c0916r6) {
        this.f10224a = cn;
        this.f10225b = c0765la;
        this.f10226c = c0916r6;
    }
}
