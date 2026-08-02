package com.squareup.cash.verification;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/verification/AppVerificationError;", "Lcom/squareup/cash/observability/types/ReportedError;", "android"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppVerificationError extends ReportedError {
    public final Set features;
    public final String groupingDescriptor;
    public final String message;
    public final Map metadata;

    public AppVerificationError(String str, String str2, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        this.message = str;
        this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.AppSignatureVerification.INSTANCE);
        this.groupingDescriptor = str + " : " + ((Object) "no cause");
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("App Verification", Thread$State$EnumUnboxingLocalUtility.m("Package Name", str2));
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final String getGroupingDescriptor() {
        return this.groupingDescriptor;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }
}
