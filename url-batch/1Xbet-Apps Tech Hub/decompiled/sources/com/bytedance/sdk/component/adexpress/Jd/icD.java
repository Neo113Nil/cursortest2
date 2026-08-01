package com.bytedance.sdk.component.adexpress.Jd;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: DeviceUtil.java */
/* loaded from: classes.dex */
public class icD {
    public static boolean pvs(Context context) {
        if (context == null) {
            return false;
        }
        return (TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1) && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
