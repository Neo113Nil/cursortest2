package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ge extends pe {

    /* renamed from: a, reason: collision with root package name */
    public final int f252a;

    public ge(int i) {
        this.f252a = i;
    }

    @Override // com.startapp.sdk.internal.pe
    public final boolean a(Object obj) {
        if (obj instanceof u1) {
            int i = ((u1) obj).Z;
            if ((this.f252a & i) == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ge.class == obj.getClass() && this.f252a == ((ge) obj).f252a;
    }

    public final int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f252a)};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }
}
