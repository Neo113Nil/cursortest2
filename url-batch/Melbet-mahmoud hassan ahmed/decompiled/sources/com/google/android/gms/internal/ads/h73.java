package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h73<K, V> {

    /* renamed from: a, reason: collision with root package name */
    Object[] f6101a;

    /* renamed from: b, reason: collision with root package name */
    int f6102b;

    public h73() {
        this(4);
    }

    h73(int i7) {
        this.f6101a = new Object[i7 + i7];
        this.f6102b = 0;
    }

    private final void d(int i7) {
        int i8 = i7 + i7;
        Object[] objArr = this.f6101a;
        int length = objArr.length;
        if (i8 > length) {
            this.f6101a = Arrays.copyOf(objArr, y63.b(length, i8));
        }
    }

    public final h73<K, V> a(K k7, V v6) {
        d(this.f6102b + 1);
        c63.b(k7, v6);
        Object[] objArr = this.f6101a;
        int i7 = this.f6102b;
        int i8 = i7 + i7;
        objArr[i8] = k7;
        objArr[i8 + 1] = v6;
        this.f6102b = i7 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h73<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            d(this.f6102b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final i73<K, V> c() {
        return y83.h(this.f6102b, this.f6101a);
    }
}
