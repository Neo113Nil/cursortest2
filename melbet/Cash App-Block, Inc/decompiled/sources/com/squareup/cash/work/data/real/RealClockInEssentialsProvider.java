package com.squareup.cash.work.data.real;

import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.api.GetClockInEssentialsUseCase;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes7.dex */
public final class RealClockInEssentialsProvider {
    public final GetClockInEssentialsUseCase getClockInEssentialsUseCase;
    public final CoroutineScope scope;
    public final SharedFlowImpl refreshTrigger = FlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2);
    public final Lazy essentialsState$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 21));

    public RealClockInEssentialsProvider(GetClockInEssentialsUseCase getClockInEssentialsUseCase, CoroutineScope coroutineScope) {
        this.getClockInEssentialsUseCase = getClockInEssentialsUseCase;
        this.scope = coroutineScope;
    }

    public final Object refresh(SuspendLambda suspendLambda) {
        Unit unit = Unit.INSTANCE;
        Object emit = this.refreshTrigger.emit(unit, suspendLambda);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : unit;
    }
}
