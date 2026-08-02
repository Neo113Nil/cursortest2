package com.squareup.cash.support.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewIncidentAlerts;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.screens.SupportScreens;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SupportHomePresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $incidents$delegate;
    public final /* synthetic */ MutableState $isLoading$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SupportHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SupportHomePresenter$models$3$1(SupportHomePresenter supportHomePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = supportHomePresenter;
        this.$isLoading$delegate = mutableState;
        this.$incidents$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new SupportHomePresenter$models$3$1(this.this$0, this.$isLoading$delegate, this.$incidents$delegate, continuation, 0);
            default:
                return new SupportHomePresenter$models$3$1(this.this$0, this.$isLoading$delegate, this.$incidents$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SupportHomePresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        SupportHomePresenter supportHomePresenter = this.this$0;
        MutableState mutableState = this.$incidents$delegate;
        MutableState mutableState2 = this.$isLoading$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) mutableState2.getValue()).booleanValue() && !((List) mutableState.getValue()).isEmpty()) {
                    Analytics analytics = supportHomePresenter.analytics;
                    SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = supportHomePresenter.args;
                    List list = (List) mutableState.getValue();
                    supportHomeScreen.getClass();
                    list.getClass();
                    analytics.track(new CustomerSupportAccessViewIncidentAlerts(supportHomeScreen.data.flowToken, Integer.valueOf(list.size()), CustomerSupportAccessViewIncidentAlerts.Trigger.HOME), null);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((Boolean) mutableState2.getValue()).booleanValue() && !((Boolean) mutableState.getValue()).booleanValue()) {
                    supportHomePresenter.observabilityManager.addTiming("finish_loading");
                    mutableState2.setValue(Boolean.TRUE);
                    break;
                } else {
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
