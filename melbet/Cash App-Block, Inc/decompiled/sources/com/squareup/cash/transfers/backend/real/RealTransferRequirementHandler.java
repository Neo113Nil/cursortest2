package com.squareup.cash.transfers.backend.real;

import com.squareup.cash.moneta.api.v1_0.EnqueueCashInRequirementsRequest;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okio.ByteString;
import squareup.cash.moneta.api.v1_0.MonetaService;

/* loaded from: classes6.dex */
public final class RealTransferRequirementHandler {
    public final MonetaService monetaService;

    public RealTransferRequirementHandler(MonetaService monetaService) {
        this.monetaService = monetaService;
    }

    public final Object enqueueTransferRequirements(SuspendLambda suspendLambda) {
        Object enqueueCashInRequirements = this.monetaService.enqueueCashInRequirements(new EnqueueCashInRequirementsRequest(null, ByteString.EMPTY), suspendLambda);
        return enqueueCashInRequirements == CoroutineSingletons.COROUTINE_SUSPENDED ? enqueueCashInRequirements : Unit.INSTANCE;
    }
}
