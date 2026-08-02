package com.withpersona.sdk2.inquiry.featureflag;

import dagger.internal.Factory;

/* loaded from: classes9.dex */
public final class FeatureFlagModule_TipsFeatureFlagFactory implements Factory {
    public final /* synthetic */ int $r8$classId;

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return TipsFeatureFlag.INSTANCE;
            case 1:
                return TipsFeatureFlag.INSTANCE$1;
            case 2:
                return TipsFeatureFlag.INSTANCE$2;
            case 3:
                return TipsFeatureFlag.INSTANCE$4;
            case 4:
                return TipsFeatureFlag.INSTANCE$3;
            case 5:
                return TipsFeatureFlag.INSTANCE$5;
            default:
                return TipsFeatureFlag.INSTANCE$6;
        }
    }
}
