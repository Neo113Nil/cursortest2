package com.bytedance.adsdk.fs.zn;

import android.util.Pair;

/* loaded from: classes6.dex */
public class nps<T> {
    T fs;
    T zmn;

    public void zmn(T t, T t2) {
        this.zmn = t;
        this.fs = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return fs(pair.first, this.zmn) && fs(pair.second, this.fs);
    }

    private static boolean fs(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        T t = this.zmn;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.fs;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.zmn + " " + this.fs + "}";
    }
}
