package com.stripe.android.payments.bankaccount.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.paging.PageFetcher$flow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zznv;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.domain.BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResultInternal;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;

/* loaded from: classes8.dex */
public final class CollectBankAccountActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public FinancialConnectionsSheetLauncher financialConnectionsLauncher;
    public final Lazy starterArgs$delegate;
    public final ViewModelLazy viewModel$delegate;

    public CollectBankAccountActivity() {
        final int i = 0;
        this.starterArgs$delegate = LazyKt.lazy(new CollectBankAccountActivity$$ExternalSyntheticLambda0(this, i));
        final int i2 = 1;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(CollectBankAccountViewModel.class), new Function0(this) { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ CollectBankAccountActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                CollectBankAccountActivity collectBankAccountActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return collectBankAccountActivity.getViewModelStore();
                    default:
                        return collectBankAccountActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new CollectBankAccountActivity$$ExternalSyntheticLambda0(this, i2), new Function0(this) { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ CollectBankAccountActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                CollectBankAccountActivity collectBankAccountActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return collectBankAccountActivity.getViewModelStore();
                    default:
                        return collectBankAccountActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FinancialConnectionsSheetLauncher customTabsLauncherModule;
        super.onCreate(bundle);
        Lazy lazy = this.starterArgs$delegate;
        CollectBankAccountContract.Args args = (CollectBankAccountContract.Args) lazy.getValue();
        Continuation continuation = null;
        if ((args != null ? args.getConfiguration() : null) == null) {
            setResult(-1, new Intent().putExtras(BundleKt.bundleOf(new Pair("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result", new CollectBankAccountContract.Result(new CollectBankAccountResultInternal.Failed(new IllegalStateException("Configuration not provided")))))));
            finish();
            return;
        }
        CollectBankAccountContract.Args args2 = (CollectBankAccountContract.Args) lazy.getValue();
        if (args2 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        FinancialConnectionsAvailability financialConnectionsAvailability = args2.getFinancialConnectionsAvailability();
        if (financialConnectionsAvailability == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        CollectBankAccountConfiguration configuration = args2.getConfiguration();
        ViewModelLazy viewModelLazy = this.viewModel$delegate;
        TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$1 = new TextFieldUIKt$TextField$4$1(1, (CollectBankAccountViewModel) viewModelLazy.getValue(), CollectBankAccountViewModel.class, "onConnectionsForInstantDebitsResult", "onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V", 0, 19);
        TextFieldUIKt$TextField$4$1 textFieldUIKt$TextField$4$12 = new TextFieldUIKt$TextField$4$1(1, (CollectBankAccountViewModel) viewModelLazy.getValue(), CollectBankAccountViewModel.class, "onConnectionsForACHResult", "onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0, 20);
        configuration.getClass();
        if (configuration instanceof CollectBankAccountConfiguration.InstantDebits) {
            customTabsLauncherModule = new DocumentSelectLauncherModule(this, zznv.getIntentBuilder(financialConnectionsAvailability, this), textFieldUIKt$TextField$4$1);
        } else {
            if (!(configuration instanceof CollectBankAccountConfiguration.USBankAccount) && !(configuration instanceof CollectBankAccountConfiguration.USBankAccountInternal)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            customTabsLauncherModule = new CustomTabsLauncherModule(this, zznv.getIntentBuilder(financialConnectionsAvailability, this), new BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0(textFieldUIKt$TextField$4$12));
        }
        this.financialConnectionsLauncher = customTabsLauncherModule;
        LifecycleCoroutineScopeImpl coroutineScope = ViewModelKt.getCoroutineScope(getLifecycle());
        JobKt.launch$default(coroutineScope, null, null, new PageFetcher$flow$1(coroutineScope, new HazeSourceNode$launchPreDraw$1(this, continuation, 4), continuation, 18), 3);
    }
}
