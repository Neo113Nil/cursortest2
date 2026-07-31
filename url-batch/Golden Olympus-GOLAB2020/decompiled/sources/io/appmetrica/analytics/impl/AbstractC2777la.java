package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2777la {
    public final C2803ma a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i4 = featureInfo.reqGlEsVersion;
        if (i4 == 0) {
            return b(featureInfo);
        }
        return new C2803ma("openGlFeature", i4, (featureInfo.flags & 1) != 0);
    }

    public abstract C2803ma b(FeatureInfo featureInfo);
}
