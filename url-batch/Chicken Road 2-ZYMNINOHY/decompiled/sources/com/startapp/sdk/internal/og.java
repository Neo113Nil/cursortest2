package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class og {

    /* renamed from: a, reason: collision with root package name */
    public final AdPreferences.Placement f7401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7402b;

    public og(AdPreferences.Placement placement) {
        this.f7401a = placement;
        this.f7402b = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && og.class == obj.getClass()) {
            og ogVar = (og) obj;
            if (this.f7402b == ogVar.f7402b && this.f7401a == ogVar.f7401a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f7401a, Integer.valueOf(this.f7402b)};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    public og(AdPreferences.Placement placement, int i4) {
        this.f7401a = placement;
        this.f7402b = i4;
    }
}
