package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* loaded from: classes.dex */
public abstract class Q9 {
    public final R9 a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i4 = featureInfo.reqGlEsVersion;
        if (i4 == 0) {
            return b(featureInfo);
        }
        return new R9("openGlFeature", i4, (featureInfo.flags & 1) != 0);
    }

    public abstract R9 b(FeatureInfo featureInfo);
}
