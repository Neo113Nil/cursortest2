package com.startapp.sdk.common.utils;

import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
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
            if (zh.a(this.first, pair.first) && zh.a(this.second, pair.second)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.first, this.second};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
