package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacementListener;

@fu
/* loaded from: classes2.dex */
public class TapjoyNative {
    @fu
    public static Object createPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        return gd.a().a(context, str, tJPlacementListener);
    }
}
