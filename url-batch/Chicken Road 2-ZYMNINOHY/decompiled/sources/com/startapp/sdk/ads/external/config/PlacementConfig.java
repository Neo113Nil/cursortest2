package com.startapp.sdk.ads.external.config;

import com.startapp.sdk.internal.he;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public final class PlacementConfig implements Serializable {
    public static final he Companion = new he();
    public static final int DELEGATION_BY_CHANCE = 1;
    public static final int FALLBACK_DELEGATION = 2;
    private static final long serialVersionUID = 6500975630965743999L;
    private int options;
    private double ratio;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !q.a(PlacementConfig.class).equals(q.a(obj.getClass()))) {
            return false;
        }
        PlacementConfig placementConfig = (PlacementConfig) obj;
        return Double.compare(this.ratio, placementConfig.ratio) == 0 && i.f(this.options, placementConfig.options) == 0;
    }

    public final int getOptions() {
        return this.options;
    }

    public final double getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        Object[] objArr = {Double.valueOf(this.ratio), Integer.valueOf(this.options)};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }

    public final boolean isFallbackActive() {
        return (this.options & 2) == 2;
    }

    public final void setOptions(int i4) {
        this.options = i4;
    }

    public final void setRatio(double d4) {
        this.ratio = d4;
    }
}
