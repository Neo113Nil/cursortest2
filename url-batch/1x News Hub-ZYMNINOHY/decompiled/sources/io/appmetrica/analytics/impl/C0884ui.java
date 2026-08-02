package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;

/* renamed from: io.appmetrica.analytics.impl.ui, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884ui implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final DataSendingRestrictionController f8463a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8464b = "data restriction based";

    public C0884ui(DataSendingRestrictionController dataSendingRestrictionController) {
        this.f8463a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        return !this.f8463a.isRestrictedForSdk();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.f8464b;
    }
}
