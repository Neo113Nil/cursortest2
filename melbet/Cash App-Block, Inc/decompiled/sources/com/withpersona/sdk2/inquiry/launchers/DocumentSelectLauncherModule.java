package com.withpersona.sdk2.inquiry.launchers;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForInstantDebitsContract;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionStarter;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel$register$1;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class DocumentSelectLauncherModule implements FinancialConnectionsSheetLauncher, Stripe3ds2TransactionStarter {
    public final ActivityResultLauncher openDocumentResultLauncher;

    public DocumentSelectLauncherModule(ActivityResultLauncher activityResultLauncher, int i) {
        switch (i) {
            case 3:
                activityResultLauncher.getClass();
                this.openDocumentResultLauncher = activityResultLauncher;
                break;
            default:
                FinancialConnectionsAvailability financialConnectionsAvailability = FinancialConnectionsAvailability.Full;
                activityResultLauncher.getClass();
                this.openDocumentResultLauncher = activityResultLauncher;
                break;
        }
    }

    @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher
    public void present(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext) {
        this.openDocumentResultLauncher.launch(new FinancialConnectionsSheetActivityArgs.ForInstantDebits(financialConnectionsSheetConfiguration, elementsSessionContext));
    }

    @Override // com.stripe.android.view.AuthActivityStarter
    public void start(Object obj) {
        this.openDocumentResultLauncher.launch((Stripe3ds2TransactionContract.Args) obj);
    }

    public DocumentSelectLauncherModule(ReusableActivityResultLauncher reusableActivityResultLauncher) {
        reusableActivityResultLauncher.getClass();
        this.openDocumentResultLauncher = reusableActivityResultLauncher;
    }

    public DocumentSelectLauncherModule(CollectBankAccountActivity collectBankAccountActivity, Function1 function1, TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1) {
        ActivityResultLauncher registerForActivityResult = collectBankAccountActivity.registerForActivityResult(new FinancialConnectionsSheetForInstantDebitsContract(function1), new PaymentLauncherViewModel$register$1(textFieldUIKt$TextField$4$1, 1));
        registerForActivityResult.getClass();
        this.openDocumentResultLauncher = registerForActivityResult;
    }
}
