package c2;

import android.content.Context;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class b {
    private b() {
    }

    public static boolean isRequestLocation(Context context) {
        boolean hasSelfPermissions = q7.b.hasSelfPermissions(context, "android.permission.ACCESS_BACKGROUND_LOCATION");
        f.d("has ACCESS_BACKGROUND_LOCATION  Permissions: " + hasSelfPermissions);
        if (hasSelfPermissions) {
            return true;
        }
        int activityCount = com.moyoung.dafit.module.common.baseui.a.getInstance().getActivityCount();
        f.d("activityCount: " + activityCount);
        return activityCount > 0;
    }
}
