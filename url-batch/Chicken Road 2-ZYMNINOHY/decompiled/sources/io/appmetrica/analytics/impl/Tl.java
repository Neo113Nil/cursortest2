package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes.dex */
public final class Tl {

    /* renamed from: a, reason: collision with root package name */
    public final Vl f11014a = new Vl();

    public final StartupParamsItem a(IdentifiersResult identifiersResult) {
        String str = identifiersResult.id;
        Vl vl = this.f11014a;
        IdentifierStatus identifierStatus = identifiersResult.status;
        vl.getClass();
        int i4 = Ul.f11070a[identifierStatus.ordinal()];
        return new StartupParamsItem(str, i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? StartupParamsItemStatus.UNKNOWN_ERROR : StartupParamsItemStatus.FORBIDDEN_BY_CLIENT_CONFIG : StartupParamsItemStatus.FEATURE_DISABLED : StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER : StartupParamsItemStatus.PROVIDER_UNAVAILABLE : StartupParamsItemStatus.OK, identifiersResult.errorExplanation);
    }
}
