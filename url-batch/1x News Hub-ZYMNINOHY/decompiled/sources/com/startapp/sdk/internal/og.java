package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class og {

    /* renamed from: a, reason: collision with root package name */
    public final AdPreferences.Placement f4266a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4267b;

    public og(AdPreferences.Placement placement) {
        this.f4266a = placement;
        this.f4267b = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && og.class == obj.getClass()) {
            og ogVar = (og) obj;
            if (this.f4267b == ogVar.f4267b && this.f4266a == ogVar.f4266a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f4266a, Integer.valueOf(this.f4267b)};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }

    public og(AdPreferences.Placement placement, int i3) {
        this.f4266a = placement;
        this.f4267b = i3;
    }
}
