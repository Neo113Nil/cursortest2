package com.bytedance.sdk.component.NB.vG.pvs;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: SoftLruCache.java */
/* loaded from: classes.dex */
public class vG<K, V> {
    private int Jd;
    private int NB;
    private int icD;
    private final LinkedHashMap<K, SoftReference<V>> pvs;
    private int sUS;
    private int so;
    private int vG;
    private int yiw;

    protected int icD(K k, V v) {
        return 1;
    }

    protected V icD(K k) {
        return null;
    }

    public vG(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.vG = i;
        this.pvs = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V pvs(K k) {
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            SoftReference<V> softReference = this.pvs.get(k);
            if (softReference != null) {
                v = softReference.get();
                if (v != null) {
                    this.yiw++;
                    return v;
                }
                this.pvs.remove(k);
            } else {
                v = null;
            }
            this.so++;
            V icD = icD(k);
            if (icD == null) {
                return null;
            }
            synchronized (this) {
                this.NB++;
                SoftReference<V> put = this.pvs.put(k, new SoftReference<>(icD));
                if (put != null) {
                    v = put.get();
                }
                if (v != null) {
                    this.pvs.put(k, put);
                } else {
                    this.icD += vG(k, icD);
                }
            }
            if (v != null) {
                return v;
            }
            pvs(this.vG);
            return icD;
        }
    }

    public final V pvs(K k, V v) {
        V v2;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.Jd++;
            this.icD += vG(k, v);
            SoftReference<V> put = this.pvs.put(k, new SoftReference<>(v));
            if (put != null) {
                v2 = put.get();
                if (v2 != null) {
                    this.icD -= vG(k, v2);
                }
            } else {
                v2 = null;
            }
        }
        pvs(this.vG);
        return v2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.icD + ", maxSize: " + r4);
        r3.icD = 0;
        r3.pvs.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(int i) {
        while (true) {
            synchronized (this) {
                if (this.icD < 0 || (this.pvs.isEmpty() && this.icD != 0)) {
                    break;
                }
                if (this.icD <= i) {
                    return;
                }
                Map.Entry<K, SoftReference<V>> next = this.pvs.entrySet().iterator().next();
                if (next == null) {
                    return;
                }
                K key = next.getKey();
                SoftReference<V> value = next.getValue();
                this.pvs.remove(key);
                if (value != null) {
                    this.icD -= vG(key, value.get());
                }
                this.sUS++;
            }
        }
    }

    private int vG(K k, V v) {
        int icD = icD(k, v);
        if (icD >= 0) {
            return icD;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.yiw;
        i2 = this.so + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.vG), Integer.valueOf(this.yiw), Integer.valueOf(this.so), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
