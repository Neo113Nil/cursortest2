package com.bytedance.adsdk.lottie;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class Ju<K, V> {
    private int Jd;
    private int NB;
    private int icD;
    private final LinkedHashMap<K, V> pvs;
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

    public Ju(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.vG = i;
        this.pvs = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V pvs(K k) {
        V put;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.pvs.get(k);
            if (v != null) {
                this.yiw++;
                return v;
            }
            this.so++;
            V icD = icD(k);
            if (icD == null) {
                return null;
            }
            synchronized (this) {
                this.NB++;
                put = this.pvs.put(k, icD);
                if (put != null) {
                    this.pvs.put(k, put);
                } else {
                    this.icD += vG(k, icD);
                }
            }
            if (put != null) {
                return put;
            }
            pvs(this.vG);
            return icD;
        }
    }

    public final V pvs(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.Jd++;
            this.icD += vG(k, v);
            put = this.pvs.put(k, v);
            if (put != null) {
                this.icD -= vG(k, put);
            }
        }
        pvs(this.vG);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x006e, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs(int i) {
        while (true) {
            synchronized (this) {
                if (this.icD >= 0 && (!this.pvs.isEmpty() || this.icD == 0)) {
                    if (this.icD <= i || this.pvs.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.pvs.entrySet().iterator().next();
                    K key = next.getKey();
                    V value = next.getValue();
                    this.pvs.remove(key);
                    this.icD -= vG(key, value);
                    this.sUS++;
                } else {
                    break;
                }
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
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.vG), Integer.valueOf(this.yiw), Integer.valueOf(this.so), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
