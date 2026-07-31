package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.Intent;
import com.chartboost.sdk.view.CBImpressionActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class y9 {
    public final Context a;

    public y9(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.c);
        p0.startActivity(p1);
    }

    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
        } catch (Exception e) {
            xb.b("Cannot start the activity", e);
        }
    }

    public final Intent a() {
        Intent addFlags = new Intent(this.a, (Class<?>) CBImpressionActivity.class).putExtra("isChartboost", true).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
        return addFlags;
    }
}
