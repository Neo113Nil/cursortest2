package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes.dex */
public final class P {
    public static AdvIdentifiersResult.AdvId a(IdentifiersResult identifiersResult) {
        AdvIdentifiersResult.Details details;
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (identifiersResult == null) {
            details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        } else {
            int i4 = O.f10731a[identifiersResult.status.ordinal()];
            details = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? AdvIdentifiersResult.Details.INTERNAL_ERROR : AdvIdentifiersResult.Details.FORBIDDEN_BY_CLIENT_CONFIG : AdvIdentifiersResult.Details.INVALID_ADV_ID : AdvIdentifiersResult.Details.IDENTIFIER_PROVIDER_UNAVAILABLE : AdvIdentifiersResult.Details.FEATURE_DISABLED : AdvIdentifiersResult.Details.OK;
        }
        return new AdvIdentifiersResult.AdvId(str, details, identifiersResult != null ? identifiersResult.errorExplanation : null);
    }
}
