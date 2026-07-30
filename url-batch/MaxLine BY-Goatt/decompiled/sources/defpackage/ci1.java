package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ci1 extends LinkedHashMap {
    public static final ci1 n;
    public boolean m = true;

    static {
        ci1 ci1Var = new ci1();
        n = ci1Var;
        ci1Var.m = false;
    }

    public final void a() {
        if (!this.m) {
            throw new UnsupportedOperationException();
        }
    }

    public final ci1 b() {
        if (isEmpty()) {
            return new ci1();
        }
        ci1 ci1Var = new ci1(this);
        ci1Var.m = true;
        return ci1Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
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
        int hashCode;
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int i2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                int length = bArr.length;
                Charset charset = f41.a;
                hashCode = length;
                for (byte b : bArr) {
                    hashCode = (hashCode * 31) + b;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length2 = bArr2.length;
                Charset charset2 = f41.a;
                int i3 = length2;
                for (byte b2 : bArr2) {
                    i3 = (i3 * 31) + b2;
                }
                if (i3 != 0) {
                    i2 = i3;
                }
            } else {
                i2 = value.hashCode();
            }
            i += hashCode ^ i2;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = f41.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = f41.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}
