package com.squareup.protos.cash.security.mri.api.v1;

import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSdkWarning;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ThreeDsSdkWarning$Severity$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ThreeDsSdkWarning.Severity.Companion.getClass();
        if (i == 0) {
            return ThreeDsSdkWarning.Severity.SEVERITY_UNSPECIFIED;
        }
        if (i == 1) {
            return ThreeDsSdkWarning.Severity.SEVERITY_LOW;
        }
        if (i == 2) {
            return ThreeDsSdkWarning.Severity.SEVERITY_MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return ThreeDsSdkWarning.Severity.SEVERITY_HIGH;
    }
}
