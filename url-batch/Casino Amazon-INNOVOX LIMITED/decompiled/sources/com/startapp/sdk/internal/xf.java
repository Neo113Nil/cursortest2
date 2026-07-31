package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class xf {

    /* renamed from: a, reason: collision with root package name */
    public final AdPreferences.Placement f499a;
    public final int b;

    public xf(AdPreferences.Placement placement) {
        this.f499a = placement;
        this.b = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xf.class == obj.getClass()) {
            xf xfVar = (xf) obj;
            if (this.b == xfVar.b && this.f499a == xfVar.f499a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f499a, Integer.valueOf(this.b)};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public xf(AdPreferences.Placement placement, int i) {
        this.f499a = placement;
        this.b = i;
    }
}
