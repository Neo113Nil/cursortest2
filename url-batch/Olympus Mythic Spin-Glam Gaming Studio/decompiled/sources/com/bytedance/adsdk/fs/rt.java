package com.bytedance.adsdk.fs;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes13.dex */
public class rt<K, V> {
    private int btk;
    private int fb;
    private int fs;
    private int hhw;
    private int nps;
    private int zg;
    private final LinkedHashMap<K, V> zmn;
    private int zn;

    protected int fs(K k, V v) {
        return 1;
    }

    protected V fs(K k) {
        return null;
    }

    public rt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.zn = i;
        this.zmn = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V zmn(K k) {
        V put;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.zmn.get(k);
                if (v != null) {
                    this.nps++;
                    return v;
                }
                this.zg++;
                V fs = fs(k);
                if (fs == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.btk++;
                        put = this.zmn.put(k, fs);
                        if (put != null) {
                            this.zmn.put(k, put);
                        } else {
                            this.fs += zn(k, fs);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (put != null) {
                    return put;
                }
                zmn(this.zn);
                return fs;
            } finally {
            }
        }
    }

    public final V zmn(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.fb++;
                this.fs += zn(k, v);
                put = this.zmn.put(k, v);
                if (put != null) {
                    this.fs -= zn(k, put);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zmn(this.zn);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zmn(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.fs < 0 || (this.zmn.isEmpty() && this.fs != 0)) {
                        break;
                    }
                    if (this.fs <= i || this.zmn.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.zmn.entrySet().iterator().next();
                    K key = next.getKey();
                    V value = next.getValue();
                    this.zmn.remove(key);
                    this.fs -= zn(key, value);
                    this.hhw++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private int zn(K k, V v) {
        int fs = fs(k, v);
        if (fs >= 0) {
            return fs;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.nps;
            i2 = this.zg + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.zn), Integer.valueOf(this.nps), Integer.valueOf(this.zg), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
