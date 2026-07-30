package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.lK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3521lK extends PA implements Map {

    /* renamed from: U, reason: collision with root package name */
    public final Map f32565U;

    public C3521lK(Map map) {
        super(27);
        this.f32565U = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f32565U.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f32565U.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((C4160xC) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC3194fG.q(this.f32565U.entrySet(), W0.f28341x);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC3217fl.A(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f32565U.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC3194fG.s(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f32565U;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC3194fG.q(this.f32565U.keySet(), W0.f28342y);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f32565U.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f32565U.putAll(map);
    }

    @Override // com.google.android.gms.internal.ads.PA
    public final /* synthetic */ Object q() {
        return this.f32565U;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f32565U.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f32565U;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f32565U.values();
    }
}
