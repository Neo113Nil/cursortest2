package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xe extends hf {

    /* renamed from: a, reason: collision with root package name */
    public final int f7868a;

    public xe(int i4) {
        this.f7868a = i4;
    }

    @Override // com.startapp.sdk.internal.hf
    public final boolean a(Object obj) {
        if (obj instanceof y1) {
            int i4 = ((y1) obj).f7910Z;
            if ((this.f7868a & i4) == i4) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xe.class == obj.getClass() && this.f7868a == ((xe) obj).f7868a;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f7868a)};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }
}
