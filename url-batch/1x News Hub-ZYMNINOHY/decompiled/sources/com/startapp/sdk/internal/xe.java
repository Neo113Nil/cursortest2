package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xe extends hf {

    /* renamed from: a, reason: collision with root package name */
    public final int f4722a;

    public xe(int i3) {
        this.f4722a = i3;
    }

    @Override // com.startapp.sdk.internal.hf
    public final boolean a(Object obj) {
        if (obj instanceof y1) {
            int i3 = ((y1) obj).f4764Z;
            if ((this.f4722a & i3) == i3) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xe.class == obj.getClass() && this.f4722a == ((xe) obj).f4722a;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f4722a)};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }
}
