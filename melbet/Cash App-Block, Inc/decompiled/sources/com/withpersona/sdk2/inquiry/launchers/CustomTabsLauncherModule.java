package com.withpersona.sdk2.inquiry.launchers;

import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivityContract;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeNextActionStarter;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import com.stripe.android.payments.bankaccount.domain.BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class CustomTabsLauncherModule implements IntentConfirmationChallengeNextActionStarter, FinancialConnectionsSheetLauncher {
    public final ActivityResultLauncher customTabsLauncher;

    public CustomTabsLauncherModule(ReusableActivityResultLauncher reusableActivityResultLauncher, int i) {
        reusableActivityResultLauncher.getClass();
        switch (i) {
            case 3:
                this.customTabsLauncher = reusableActivityResultLauncher;
                break;
            default:
                this.customTabsLauncher = reusableActivityResultLauncher;
                break;
        }
    }

    @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher
    public void present(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext) {
        this.customTabsLauncher.launch(new FinancialConnectionsSheetActivityArgs.ForData(financialConnectionsSheetConfiguration, elementsSessionContext));
    }

    @Override // com.stripe.android.challenge.confirmation.IntentConfirmationChallengeNextActionStarter
    public void start(IntentConfirmationChallengeActivityContract.Args args) {
        this.customTabsLauncher.launch(args);
    }

    public CustomTabsLauncherModule(ActivityResultLauncher activityResultLauncher) {
        activityResultLauncher.getClass();
        this.customTabsLauncher = activityResultLauncher;
    }

    public CustomTabsLauncherModule(CollectBankAccountActivity collectBankAccountActivity, Function1 function1, BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0 buildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0) {
        ActivityResultLauncher registerForActivityResult = collectBankAccountActivity.registerForActivityResult(new FinancialConnectionsSheetForDataContract(function1), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(buildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0, 7));
        registerForActivityResult.getClass();
        this.customTabsLauncher = registerForActivityResult;
    }
}
