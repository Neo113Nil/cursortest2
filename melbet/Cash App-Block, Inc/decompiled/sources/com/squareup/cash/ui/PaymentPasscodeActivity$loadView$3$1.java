package com.squareup.cash.ui;

import android.content.Intent;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelKt;
import app.cash.broadway.ui.Ui;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.data.contacts.ContactSyncEvent;
import com.squareup.cash.formview.components.arcade.MultilineTextInputValidator$Result;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.tabprovider.api.TabInfoState;
import com.squareup.cash.tabprovider.real.RealTabPublisher;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityResult;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentPasscodeActivity$loadView$3$1 implements FlowCollector, FunctionAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $tmp0;

    public /* synthetic */ PaymentPasscodeActivity$loadView$3$1(Object obj, int i) {
        this.$r8$classId = i;
        this.$tmp0 = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Continuation continuation2 = null;
        Object obj2 = this.$tmp0;
        switch (i) {
            case 0:
                ((Ui) obj2).setModel(obj);
                Unit unit = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit;
            case 1:
                Object emit = ((FlowCollector) obj2).emit(obj, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
            case 2:
                ((Ui) ((Widget) obj2)).setModel(obj);
                Unit unit2 = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit2;
            case 3:
                ((Ui.EventReceiver) obj2).sendEvent((FormViewEvent) obj);
                Unit unit3 = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit3;
            case 4:
                Object send = ((Channel) obj2).send((ContactSyncEvent) obj, continuation);
                return send == CoroutineSingletons.COROUTINE_SUSPENDED ? send : Unit.INSTANCE;
            case 5:
                StateFlowKt.emitOrThrow((MutableStateFlow) obj2, (MultilineTextInputValidator$Result) obj);
                Unit unit4 = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit4;
            case 6:
                RealTabPublisher realTabPublisher = (RealTabPublisher) obj2;
                Object withContext = JobKt.withContext(realTabPublisher.scope.getCoroutineContext(), new PreferenceFlow$flow$1(realTabPublisher, (TabInfoState) obj, continuation2, 9), continuation);
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (withContext != coroutineSingletons5) {
                    withContext = Unit.INSTANCE;
                }
                return withContext == coroutineSingletons5 ? withContext : Unit.INSTANCE;
            case 7:
                IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = (IntentConfirmationChallengeActivity) obj2;
                int i2 = IntentConfirmationChallengeActivity.$r8$clinit;
                intentConfirmationChallengeActivity.setResult(4639, new Intent().putExtras(BundleKt.bundleOf(new Pair("com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract.extra_result", (IntentConfirmationChallengeActivityResult) obj))));
                intentConfirmationChallengeActivity.finish();
                Unit unit5 = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit5;
            default:
                FinancialConnectionsViewModel financialConnectionsViewModel = (FinancialConnectionsViewModel) obj2;
                JobKt.launch$default(ViewModelKt.getViewModelScope(financialConnectionsViewModel), null, null, new ShimmerModifierKt$shimmer$1$1(financialConnectionsViewModel, obj, continuation2, 13), 3);
                Unit unit6 = Unit.INSTANCE;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return unit6;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 3:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 4:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 5:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 6:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 7:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        int i = this.$r8$classId;
        Object obj = this.$tmp0;
        switch (i) {
            case 0:
                return new AdaptedFunctionReference(2, 4, Ui.class, (Ui) obj, "setModel", "setModel(Ljava/lang/Object;)V");
            case 1:
                return new FunctionReferenceImpl(2, 0, FlowCollector.class, (FlowCollector) obj, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            case 2:
                return new AdaptedFunctionReference(2, 4, Ui.class, (Widget) obj, "setModel", "setModel(Ljava/lang/Object;)V");
            case 3:
                return new AdaptedFunctionReference(2, 4, Ui.EventReceiver.class, (Ui.EventReceiver) obj, "sendEvent", "sendEvent(Ljava/lang/Object;)V");
            case 4:
                return new FunctionReferenceImpl(2, 0, Channel.class, (Channel) obj, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            case 5:
                return new AdaptedFunctionReference(2, 5, StateFlowKt.class, (MutableStateFlow) obj, "emitOrThrow", "emitOrThrow(Lkotlinx/coroutines/flow/MutableSharedFlow;Ljava/lang/Object;)V");
            case 6:
                return new FunctionReferenceImpl(2, 0, RealTabPublisher.class, (RealTabPublisher) obj, "publish", "publish(Lcom/squareup/cash/tabprovider/api/TabInfoState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            case 7:
                return new AdaptedFunctionReference(2, 4, IntentConfirmationChallengeActivity.class, (IntentConfirmationChallengeActivity) obj, "dismissWithResult", "dismissWithResult(Lcom/stripe/android/challenge/confirmation/IntentConfirmationChallengeActivityResult;)V");
            default:
                return new AdaptedFunctionReference(2, 4, FinancialConnectionsViewModel.class, (FinancialConnectionsViewModel) obj, "updateHostWithTopAppBarState", "updateHostWithTopAppBarState(Ljava/lang/Object;)V");
        }
    }

    public final int hashCode() {
        switch (this.$r8$classId) {
        }
        return getFunctionDelegate().hashCode();
    }
}
