package com.anythink.expressad.video.dynview.d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a<K, V> extends HashMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private ReferenceQueue<V> f21336a = new ReferenceQueue<>();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<K, a<K, V>.C0134a<K, V>> f21337b = new HashMap<>();

    /* renamed from: com.anythink.expressad.video.dynview.d.a$a, reason: collision with other inner class name */
    public class C0134a<K, V> extends SoftReference<V> {

        /* renamed from: a, reason: collision with root package name */
        K f21338a;

        public C0134a(K k6, V v6, ReferenceQueue referenceQueue) {
            super(v6, referenceQueue);
            this.f21338a = k6;
        }
    }

    private void a() {
        while (true) {
            C0134a c0134a = (C0134a) this.f21336a.poll();
            if (c0134a == null) {
                return;
            } else {
                this.f21337b.remove(c0134a.f21338a);
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        a();
        return this.f21337b.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        a();
        a<K, V>.C0134a<K, V> c0134a = this.f21337b.get(obj);
        if (c0134a == null) {
            return null;
        }
        return c0134a.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k6, V v6) {
        a();
        a<K, V>.C0134a<K, V> put = this.f21337b.put(k6, new C0134a<>(k6, v6, this.f21336a));
        if (put == null) {
            return null;
        }
        return put.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        a();
        a<K, V>.C0134a<K, V> remove = this.f21337b.remove(obj);
        if (remove == null) {
            return null;
        }
        return remove.get();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        a();
        return this.f21337b.size();
    }
}
