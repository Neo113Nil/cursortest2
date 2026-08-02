package com.squareup.cash.transfers.presenters;

import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RecurringReloadOptionPresenter$models$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PoolsListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecurringReloadOptionPresenter$models$1$2(PoolsListPresenter poolsListPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = poolsListPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PoolsListPresenter poolsListPresenter = this.this$0;
        switch (i) {
            case 0:
                return new RecurringReloadOptionPresenter$models$1$2(poolsListPresenter, continuation, 0);
            case 1:
                return new RecurringReloadOptionPresenter$models$1$2(poolsListPresenter, continuation, 1);
            default:
                return new RecurringReloadOptionPresenter$models$1$2(poolsListPresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RecurringReloadOptionPresenter$models$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PoolsListPresenter poolsListPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BlockersHelper.launchClientScenario$default((RealBlockersHelper) poolsListPresenter.args, BlockersData.Flow.PROFILE_BLOCKERS, ClientScenario.UPDATE_SCHEDULED_RELOAD_FREQUENCY, (RecurringReloadOptionScreen) poolsListPresenter.localeAssetProvider, null, null, null, true, null, null, false, 3816);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BlockersHelper.launchClientScenario$default((RealBlockersHelper) poolsListPresenter.args, BlockersData.Flow.PROFILE_BLOCKERS, ClientScenario.UPDATE_SCHEDULED_RELOAD_FREQUENCY, (RecurringReloadOptionScreen) poolsListPresenter.localeAssetProvider, null, null, null, true, null, null, false, 3816);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BlockersHelper.launchClientScenario$default((RealBlockersHelper) poolsListPresenter.args, BlockersData.Flow.PROFILE_BLOCKERS, ClientScenario.UPDATE_SCHEDULED_RELOAD_AMOUNT, (RecurringReloadOptionScreen) poolsListPresenter.localeAssetProvider, null, null, null, true, null, null, false, 3816);
                break;
        }
        return Unit.INSTANCE;
    }
}
