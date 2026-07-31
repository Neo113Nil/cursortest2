package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* loaded from: classes3.dex */
public abstract class R9 {
    public final S9 a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return b(featureInfo);
        }
        return new S9("openGlFeature", i, (featureInfo.flags & 1) != 0);
    }

    public abstract S9 b(FeatureInfo featureInfo);
}
