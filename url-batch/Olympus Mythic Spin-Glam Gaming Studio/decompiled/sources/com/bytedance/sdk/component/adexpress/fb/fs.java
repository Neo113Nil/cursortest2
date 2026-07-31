package com.bytedance.sdk.component.adexpress.fb;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes5.dex */
public class fs {
    public static boolean zmn(Context context) {
        return context != null && TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1 && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
