package com.stripe.android.challenge.passive.warmer.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;

/* loaded from: classes8.dex */
public final class PassiveChallengeWarmerActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ViewModelLazy viewModel$delegate;
    public final InitializerViewModelFactory viewModelFactory = PassiveChallengeWarmerViewModel.Factory;

    public PassiveChallengeWarmerActivity() {
        final int i = 0;
        final int i2 = 1;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(PassiveChallengeWarmerViewModel.class), new Function0(this) { // from class: com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ PassiveChallengeWarmerActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                PassiveChallengeWarmerActivity passiveChallengeWarmerActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return passiveChallengeWarmerActivity.getViewModelStore();
                    default:
                        return passiveChallengeWarmerActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new HCaptcha$$ExternalSyntheticLambda0(this, 11), new Function0(this) { // from class: com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ PassiveChallengeWarmerActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                PassiveChallengeWarmerActivity passiveChallengeWarmerActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return passiveChallengeWarmerActivity.getViewModelStore();
                    default:
                        return passiveChallengeWarmerActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            int i = 1;
            if (extras.containsKey("passive_challenge_warmer_args")) {
                Continuation continuation = null;
                JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new PassiveChallengeWarmerActivity$onCreate$1(this, continuation, 0), 3);
                JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new PassiveChallengeWarmerActivity$onCreate$1(this, continuation, i), 3);
                return;
            }
        }
        finish();
    }
}
