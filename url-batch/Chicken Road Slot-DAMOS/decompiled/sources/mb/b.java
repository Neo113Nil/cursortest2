package mb;

import android.content.Context;
import com.google.android.gms.location.LocationListener;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.common.AndroidUtils;
import k7.e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {
    public static final b INSTANCE = new b();

    private b() {
    }

    public final boolean hasGMSLocationLibrary() {
        try {
            return AndroidUtils.INSTANCE.opaqueHasClass(LocationListener.class);
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
        context.getClass();
        return e.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0 || e.i(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }
}
