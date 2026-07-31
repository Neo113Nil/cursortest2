package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class fi {
    public static final q4 a(String adType, String location, Mediation mediation, q7 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        return new r4(adType, location, mediation, eventTracker);
    }

    public static final q7 a() {
        return f4.b.b().a();
    }
}
