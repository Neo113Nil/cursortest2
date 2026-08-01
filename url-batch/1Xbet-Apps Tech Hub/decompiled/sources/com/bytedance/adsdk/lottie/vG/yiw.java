package com.bytedance.adsdk.lottie.vG;

import android.util.Pair;

/* compiled from: MutablePair.java */
/* loaded from: classes.dex */
public class yiw<T> {
    T icD;
    T pvs;

    public void pvs(T t, T t2) {
        this.pvs = t;
        this.icD = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return icD(pair.first, this.pvs) && icD(pair.second, this.icD);
    }

    private static boolean icD(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        T t = this.pvs;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.icD;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.pvs + " " + this.icD + "}";
    }
}
