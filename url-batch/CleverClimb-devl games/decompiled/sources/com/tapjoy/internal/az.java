package com.tapjoy.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class az extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f7842a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final bx f7843b = new bx();

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        b();
        return this.f7842a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f7842a.clear();
        while (this.f7843b.a() != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        b();
        return this.f7842a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        b();
        Iterator it = this.f7842a.values().iterator();
        while (it.hasNext()) {
            if (obj.equals(((bw) it.next()).get())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        b();
        return a((bw) this.f7842a.get(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        return a((bw) this.f7842a.put(obj, new bw(obj, obj2, this.f7843b)));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        return a((bw) this.f7842a.remove(obj));
    }

    private static Object a(bw bwVar) {
        if (bwVar != null) {
            return bwVar.get();
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        b();
        return this.f7842a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        b();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        b();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        b();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        b();
        throw new UnsupportedOperationException();
    }

    private void b() {
        while (true) {
            bw a2 = this.f7843b.a();
            if (a2 == null) {
                return;
            } else {
                this.f7842a.remove(a2.f7875a);
            }
        }
    }

    public static az a() {
        return new az();
    }
}
