package com.bytedance.sdk.component.btk.fs.zn.zmn;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class zn<K, V> {
    private int fs;
    private final LinkedHashMap<K, SoftReference<V>> zmn = new LinkedHashMap<>(0, 0.75f, true);

    public zn(int i) {
        this.fs = i;
    }

    public synchronized V zmn(K k) {
        V v = null;
        if (k == null) {
            return null;
        }
        if (this.fs <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.zmn.get(k);
        if (softReference != null) {
            v = softReference.get();
            if (v != null) {
                return v;
            }
            this.zmn.remove(k);
        }
        return v;
    }

    public synchronized void zmn(K k, V v) {
        if (this.fs <= 0) {
            return;
        }
        if (k == null || v == null) {
            return;
        }
        this.zmn.put(k, new SoftReference<>(v));
        int size = this.zmn.size();
        int i = this.fs;
        if (size > i) {
            zmn((int) (i * 0.7d));
        }
    }

    public synchronized void zmn(int i) {
        int size = this.zmn.size() - i;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.zmn.entrySet().iterator();
            for (int i2 = 0; i2 < size; i2++) {
                it.next();
                it.remove();
            }
        }
        if (i == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.zmn.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.fs), Integer.valueOf(this.zmn.size()));
    }
}
