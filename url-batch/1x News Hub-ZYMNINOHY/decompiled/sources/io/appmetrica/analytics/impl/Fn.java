package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class Fn {

    /* renamed from: a, reason: collision with root package name */
    public final En f6018a;

    /* renamed from: b, reason: collision with root package name */
    public final BiFunction f6019b;

    /* renamed from: c, reason: collision with root package name */
    public final Hf f6020c;

    public Fn() {
        this(new Cn(), new C0824sa(), C0585j4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Dn());
        try {
            map = this.f6018a.c();
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
                arrayList.add((C0992yn) this.f6019b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public Fn(En en, C0824sa c0824sa, C0975y6 c0975y6) {
        this.f6018a = en;
        this.f6019b = c0824sa;
        this.f6020c = c0975y6;
    }
}
