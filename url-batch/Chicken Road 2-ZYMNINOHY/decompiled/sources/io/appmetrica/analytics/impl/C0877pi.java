package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877pi implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final DataSendingRestrictionController f12587a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12588b = "data restriction based";

    public C0877pi(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f12587a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.f12587a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f12588b;
    }
}
