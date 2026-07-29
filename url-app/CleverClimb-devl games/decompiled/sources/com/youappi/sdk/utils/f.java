package com.youappi.sdk.utils;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public class f {
    public static int a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }
}
