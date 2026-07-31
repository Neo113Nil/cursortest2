package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2751ka extends AbstractC2777la {
    @Override // io.appmetrica.analytics.impl.AbstractC2777la
    public final C2803ma b(@NonNull FeatureInfo featureInfo) {
        return new C2803ma(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
