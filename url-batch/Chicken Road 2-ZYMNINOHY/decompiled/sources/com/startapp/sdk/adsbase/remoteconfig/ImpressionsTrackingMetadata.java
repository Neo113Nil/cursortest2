package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.ji;
import com.startapp.sdk.internal.si;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ImpressionsTrackingMetadata implements Serializable {
    private static final long serialVersionUID = -8908841983322302421L;

    @TypeInfo(parser = ji.class)
    private double enabled = 0.0d;
    private int types = 3;

    public final double a() {
        return this.enabled;
    }

    public final int b() {
        return this.types;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ImpressionsTrackingMetadata impressionsTrackingMetadata = (ImpressionsTrackingMetadata) obj;
            if (Double.compare(this.enabled, impressionsTrackingMetadata.enabled) == 0 && this.types == impressionsTrackingMetadata.types) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Double.valueOf(this.enabled), Integer.valueOf(this.types)};
        WeakHashMap weakHashMap = si.f7575a;
        return Arrays.deepHashCode(objArr);
    }
}
