package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import cn.hutool.core.text.l;

/* loaded from: classes.dex */
public class h {

    @Nullable
    Object first;

    @Nullable
    Object second;

    private static boolean objectsEqual(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return objectsEqual(pair.first, this.first) && objectsEqual(pair.second, this.second);
    }

    public int hashCode() {
        Object obj = this.first;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.second;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public void set(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public String toString() {
        return "Pair{" + this.first + l.SPACE + this.second + "}";
    }
}
