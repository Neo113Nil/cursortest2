package com.stripe.android.financialconnections.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.State;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.ui.components.TextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import nl.dionsegijn.konfetti.emitters.RenderSystem;

/* loaded from: classes8.dex */
public final /* synthetic */ class FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FinancialConnectionsSheetNativeActivity f$0;
    public final /* synthetic */ State f$1;

    public /* synthetic */ FinancialConnectionsSheetNativeActivity$$ExternalSyntheticLambda4(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, State state, int i) {
        this.$r8$classId = i;
        this.f$0 = financialConnectionsSheetNativeActivity;
        this.f$1 = state;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        State state = this.f$1;
        FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.f$0;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    financialConnectionsSheetNativeActivity.NavHost(((FinancialConnectionsSheetNativeState) state.getValue()).initialPane, ((FinancialConnectionsSheetNativeState) state.getValue()).testMode, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                int i3 = FinancialConnectionsSheetNativeActivity.$r8$clinit;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    TopAppBarState topAppBarState = (TopAppBarState) state.getValue();
                    FinancialConnectionsSheetNativeViewModel viewModel = financialConnectionsSheetNativeActivity.getViewModel();
                    boolean changedInstance = gapComposer2.changedInstance(viewModel);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        RenderSystem.AnonymousClass1 anonymousClass1 = new RenderSystem.AnonymousClass1(0, viewModel, FinancialConnectionsSheetNativeViewModel.class, "handleOnCloseClick", "handleOnCloseClick()V", 0, 6);
                        gapComposer2.updateRememberedValue(anonymousClass1);
                        rememberedValue = anonymousClass1;
                    }
                    TextKt.FinancialConnectionsTopAppBar(topAppBarState, (Function0) ((KFunction) rememberedValue), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
