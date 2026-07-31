package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class i1 {
    public final Context a;

    public i1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final boolean a() {
        try {
            DataUseConsent dataUseConsent = Chartboost.getDataUseConsent(this.a, "coppa");
            Object consent = dataUseConsent != null ? dataUseConsent.getConsent() : null;
            Boolean bool = consent instanceof Boolean ? (Boolean) consent : null;
            if (bool != null) {
                return bool.booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
