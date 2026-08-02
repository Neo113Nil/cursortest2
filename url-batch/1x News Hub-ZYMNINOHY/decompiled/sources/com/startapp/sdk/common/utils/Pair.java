package com.startapp.sdk.common.utils;

import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Pair<F, S> implements Serializable {
    private static final long serialVersionUID = 1680587643219848112L;
    public final F first;
    public final S second;

    /* JADX WARN: Multi-variable type inference failed */
    public Pair(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Pair pair = (Pair) obj;
            if (si.a(this.first, pair.first) && si.a(this.second, pair.second)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.first, this.second};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }
}
