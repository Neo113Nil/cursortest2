package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2725ja extends AbstractC2777la {
    @Override // io.appmetrica.analytics.impl.AbstractC2777la
    @TargetApi(24)
    public final C2803ma b(@NonNull FeatureInfo featureInfo) {
        return new C2803ma(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
