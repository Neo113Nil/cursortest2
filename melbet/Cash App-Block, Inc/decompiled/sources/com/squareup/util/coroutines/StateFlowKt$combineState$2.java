package com.squareup.util.coroutines;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.squareup.cash.blockers.presenters.StatusResultPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.db2.BlockersConfig;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.Money;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.SignUpParams;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.document.DocumentInstructionsView;
import com.withpersona.sdk2.inquiry.integration.IntegrationView;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepScreenBinding;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.ComponentView;
import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda13;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class StateFlowKt$combineState$2 extends FunctionReferenceImpl implements Function3 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowKt$combineState$2(BufferedChannel bufferedChannel, int i) {
        super(3, 0, BufferedChannel.class, bufferedChannel, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
        this.$r8$classId = i;
        switch (i) {
            case 10:
                super(3, 0, BufferedChannel.class, bufferedChannel, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Money money;
        switch (this.$r8$classId) {
            case 0:
                break;
            case 1:
                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
                BlockersConfig blockersConfig = (BlockersConfig) obj2;
                StatusResultPresenter statusResultPresenter = (StatusResultPresenter) this.receiver;
                BlockersDataNavigator blockersDataNavigator = statusResultPresenter.blockersNavigator;
                BlockersScreens.StatusResultScreen statusResultScreen = statusResultPresenter.args;
                if (balanceSnapshot != null && (money = blockersConfig.target_balance_amount) != null && blockersConfig.add_cash_header_text != null) {
                    if (Moneys.compareTo(balanceSnapshot.balance, money) >= 0) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                Object m4062mobileSignUp0E7RQCE = ((ConsumersApiServiceImpl) this.receiver).m4062mobileSignUp0E7RQCE((SignUpParams) obj, (ApiRequest.Options) obj2, (Continuation) obj3);
                if (m4062mobileSignUp0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object m4064signUp0E7RQCE = ((ConsumersApiServiceImpl) this.receiver).m4064signUp0E7RQCE((SignUpParams) obj, (ApiRequest.Options) obj2, (Continuation) obj3);
                if (m4064signUp0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding = (Pi2GenericUiStepScreenBinding) obj;
                DocumentInstructionsView documentInstructionsView = (DocumentInstructionsView) obj2;
                Map map = (Map) obj3;
                pi2GenericUiStepScreenBinding.getClass();
                documentInstructionsView.getClass();
                map.getClass();
                ((DocumentInstructionsView) this.receiver).showRendering$document_release(pi2GenericUiStepScreenBinding, documentInstructionsView, map);
                break;
            case 7:
                Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding2 = (Pi2GenericUiStepScreenBinding) obj;
                DocumentInstructionsView documentInstructionsView2 = (DocumentInstructionsView) obj2;
                Map map2 = (Map) obj3;
                pi2GenericUiStepScreenBinding2.getClass();
                documentInstructionsView2.getClass();
                map2.getClass();
                ((DocumentInstructionsView) this.receiver).showRendering$document_release(pi2GenericUiStepScreenBinding2, documentInstructionsView2, map2);
                break;
            case 8:
                Pi2GenericUiStepScreenBinding pi2GenericUiStepScreenBinding3 = (Pi2GenericUiStepScreenBinding) obj;
                final IntegrationView integrationView = (IntegrationView) obj2;
                Map map3 = (Map) obj3;
                pi2GenericUiStepScreenBinding3.getClass();
                integrationView.getClass();
                map3.getClass();
                for (Pair pair : ((IntegrationView) this.receiver).componentNameToAction) {
                    String str = (String) pair.first;
                    Function1 function1 = (Function1) pair.second;
                    ComponentView componentView = (ComponentView) map3.get(str);
                    if (componentView != null) {
                        View view = componentView.view;
                        view.setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda13(function1, componentView, 2));
                        if (componentView.component instanceof ActionButtonComponent) {
                            ((ButtonWithLoadingIndicator) view).setIsLoading(integrationView.isLoading);
                        }
                    }
                }
                NavigationState navigationState = integrationView.navigationState;
                final int i = 0;
                Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.integration.IntegrationView$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2 = i;
                        IntegrationView integrationView2 = integrationView;
                        switch (i2) {
                            case 0:
                                integrationView2.onBack.invoke();
                                break;
                            default:
                                integrationView2.onCancel.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i2 = 1;
                Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.integration.IntegrationView$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i22 = i2;
                        IntegrationView integrationView2 = integrationView;
                        switch (i22) {
                            case 0:
                                integrationView2.onBack.invoke();
                                break;
                            default:
                                integrationView2.onCancel.invoke();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                Pi2NavigationBar pi2NavigationBar = pi2GenericUiStepScreenBinding3.navigationBar;
                ConstraintLayout constraintLayout = pi2GenericUiStepScreenBinding3.rootView;
                constraintLayout.getClass();
                zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, constraintLayout);
                break;
            case 9:
                Function1 function12 = ((BufferedChannel) this.receiver).onUndeliveredElement;
                function12.getClass();
                OnUndeliveredElementKt.callUndeliveredElement(function12, obj2, (CoroutineContext) obj3);
                break;
            default:
                Object obj4 = ((ChannelResult) obj2).holder;
                Function1 function13 = ((BufferedChannel) this.receiver).onUndeliveredElement;
                function13.getClass();
                Object m4191getOrNullimpl = ChannelResult.m4191getOrNullimpl(obj4);
                m4191getOrNullimpl.getClass();
                OnUndeliveredElementKt.callUndeliveredElement(function13, m4191getOrNullimpl, (CoroutineContext) obj3);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateFlowKt$combineState$2(Function2 function2) {
        super(3, 0, ArrayIteratorKt.class, function2, "suspendConversion0", "combineState$suspendConversion0(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        this.$r8$classId = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StateFlowKt$combineState$2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }
}
