package com.aiming.mdt.mediation;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class InitModel {
    protected String mAppKey;

    public static boolean isDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17) {
            if (activity == null || activity.isDestroyed()) {
                return true;
            }
        } else if (activity == null || activity.isFinishing()) {
            return true;
        }
        return false;
    }

    public void init(Activity activity, Map<String, Object> map, InitListener initListener) {
        if (initListener == null) {
            return;
        }
        if (isDestroyed(activity)) {
            throw new IllegalArgumentException("Activity Destroy");
        }
        if (!map.containsKey("AppKey") || TextUtils.isEmpty((CharSequence) map.get("AppKey"))) {
            throw new IllegalArgumentException("AppKey is empty");
        }
        this.mAppKey = (String) map.get("AppKey");
    }

    public abstract String mediation();
}
