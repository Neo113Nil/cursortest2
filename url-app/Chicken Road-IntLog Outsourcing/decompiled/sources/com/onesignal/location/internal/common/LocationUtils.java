package com.onesignal.location.internal.common;

import E1.b;
import android.content.Context;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.common.AndroidUtils;
import kotlin.jvm.internal.i;
import v.f;

/* loaded from: classes.dex */
public final class LocationUtils {
    public static final LocationUtils INSTANCE = new LocationUtils();

    private LocationUtils() {
    }

    public final boolean hasGMSLocationLibrary() {
        try {
            return AndroidUtils.INSTANCE.opaqueHasClass(b.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean hasHMSLocationLibrary() {
        try {
            return AndroidUtils.INSTANCE.opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean hasLocationPermission(Context context) {
        i.e(context, "context");
        return f.a(context, LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING) == 0 || f.a(context, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING) == 0;
    }
}
