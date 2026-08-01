package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b2 extends LinkedHashMap {

    /* renamed from: e, reason: collision with root package name */
    public static final b2 f2159e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2160d = true;

    static {
        b2 b2Var = new b2();
        f2159e = b2Var;
        b2Var.f2160d = false;
    }

    public static int b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof m1)) {
                return obj.hashCode();
            }
            a2.r.a();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int a9 = r1.a(length, bArr, 0, length);
        if (a9 == 0) {
            return 1;
        }
        return a9;
    }

    public final b2 a() {
        if (isEmpty()) {
            return new b2();
        }
        b2 b2Var = new b2(this);
        b2Var.f2160d = true;
        return b2Var;
    }

    public final void c() {
        if (this.f2160d) {
            return;
        }
        a2.r.a();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i3 = 0;
        for (Map.Entry entry : entrySet()) {
            i3 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i3;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }
}
