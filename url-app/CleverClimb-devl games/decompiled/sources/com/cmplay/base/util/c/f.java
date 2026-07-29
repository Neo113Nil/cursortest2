package com.cmplay.base.util.c;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class f<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f3991a;

    /* renamed from: b, reason: collision with root package name */
    private int f3992b;

    /* renamed from: c, reason: collision with root package name */
    private int f3993c;

    /* renamed from: d, reason: collision with root package name */
    private int f3994d;
    private int e;
    private int f;
    private int g;
    private int h;

    protected int a(K k, V v) {
        return 1;
    }

    protected void a(boolean z, K k, V v, V v2) {
    }

    protected V b(K k) {
        return null;
    }

    public f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3993c = i;
        this.f3991a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V a(K k) {
        V v;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v2 = this.f3991a.get(k);
            if (v2 != null) {
                this.g++;
                return v2;
            }
            this.h++;
            V b2 = b(k);
            if (b2 == null) {
                return null;
            }
            synchronized (this) {
                this.e++;
                v = (V) this.f3991a.put(k, b2);
                if (v != null) {
                    this.f3991a.put(k, v);
                } else {
                    this.f3992b += c(k, b2);
                }
            }
            if (v != null) {
                a(false, k, b2, v);
                return v;
            }
            a(this.f3993c);
            return b2;
        }
    }

    public final V b(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f3994d++;
            this.f3992b += c(k, v);
            put = this.f3991a.put(k, v);
            if (put != null) {
                this.f3992b -= c(k, put);
            }
        }
        if (put != null) {
            a(false, k, put, v);
        }
        a(this.f3993c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.f3992b >= 0 && (!this.f3991a.isEmpty() || this.f3992b == 0)) {
                    if (this.f3992b <= i || this.f3991a.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.f3991a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.f3991a.remove(key);
                    this.f3992b -= c(key, value);
                    this.f++;
                } else {
                    break;
                }
            }
            a(true, key, value, null);
        }
    }

    private int c(K k, V v) {
        int a2 = a(k, v);
        if (a2 >= 0) {
            return a2;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public final synchronized String toString() {
        int i;
        i = this.g + this.h;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f3993c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i != 0 ? (this.g * 100) / i : 0));
    }
}
