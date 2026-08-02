package com.squareup.cash.stripe.integration;

import android.os.Bundle;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.scannerview.ScannerView;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class StripeLinkActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public DocumentSelectLauncherModule launcher;
    public boolean presented;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(-1);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new CollectBankAccountContract(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(new ScannerView.AnonymousClass3(1, this, StripeLinkActivity.class, "onCollectBankAccountResult", "onCollectBankAccountResult(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResult;)V", 0, 4), 10));
        FinancialConnectionsAvailability financialConnectionsAvailability = FinancialConnectionsAvailability.Full;
        this.launcher = new DocumentSelectLauncherModule(registerForActivityResult, 2);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        this.presented = bundle.getBoolean("presented");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.presented) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        String string2 = extras.getString("client_secret");
        string2.getClass();
        Bundle extras2 = getIntent().getExtras();
        extras2.getClass();
        String string3 = extras2.getString("publishable_key");
        string3.getClass();
        CollectBankAccountConfiguration.USBankAccount uSBankAccount = new CollectBankAccountConfiguration.USBankAccount("Unknown", null);
        DocumentSelectLauncherModule documentSelectLauncherModule = this.launcher;
        if (documentSelectLauncherModule == null) {
            Intrinsics.throwUninitializedPropertyAccessException("launcher");
            throw null;
        }
        documentSelectLauncherModule.openDocumentResultLauncher.launch(new CollectBankAccountContract.Args.ForSetupIntent(string3, null, string2, uSBankAccount, true, FinancialConnectionsAvailability.Full, null));
        this.presented = true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("presented", this.presented);
    }
}
