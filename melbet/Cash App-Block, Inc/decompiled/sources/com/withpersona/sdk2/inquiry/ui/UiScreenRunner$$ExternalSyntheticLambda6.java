package com.withpersona.sdk2.inquiry.ui;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetViewModel;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiScreenRunner$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ UiScreenRunner f$0;
    public final /* synthetic */ UiWorkflow.Screen.EntryScreen f$1;

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda6(UiScreenRunner uiScreenRunner, UiWorkflow.Screen.EntryScreen entryScreen) {
        this.f$0 = uiScreenRunner;
        this.f$1 = entryScreen;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        UiScreenRunner uiScreenRunner = this.f$0;
        UiWorkflow.Screen.EntryScreen entryScreen = this.f$1;
        switch (i) {
            case 0:
                if (!uiScreenRunner.inputSelectBottomSheetController.close()) {
                    SignatureBottomSheetController signatureBottomSheetController = uiScreenRunner.signatureBottomSheetController;
                    if (signatureBottomSheetController.lazyBinding.isInitialized()) {
                        BottomSheetBehavior from = BottomSheetBehavior.from(signatureBottomSheetController.getBinding().bottomSheet);
                        if (from.state != 5) {
                            from.setState(5);
                        }
                    }
                    if (!uiScreenRunner.helpBottomSheetController.close(new ShimmerThemeKt$$ExternalSyntheticLambda0(26))) {
                        if (entryScreen.navigationState.showBackButton) {
                            entryScreen.onBack.invoke();
                        } else {
                            entryScreen.onCancel.invoke();
                        }
                    }
                }
                break;
            default:
                HelpBottomSheetViewModel helpBottomSheetViewModel = entryScreen.helpBottomSheetViewModel;
                if (helpBottomSheetViewModel != null) {
                    uiScreenRunner.helpBottomSheetController.show(entryScreen.styles, helpBottomSheetViewModel, entryScreen.onHelpBottomSheetDismissed, entryScreen.launchActionFromHelpSheet, entryScreen.launchSecondaryActionFromHelpSheet);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ UiScreenRunner$$ExternalSyntheticLambda6(UiWorkflow.Screen.EntryScreen entryScreen, UiScreenRunner uiScreenRunner) {
        this.f$1 = entryScreen;
        this.f$0 = uiScreenRunner;
    }
}
