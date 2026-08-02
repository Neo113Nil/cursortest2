package com.stripe.android.challenge.confirmation;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.extractor.ChunkIndexMerger;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.JobKt;

/* loaded from: classes8.dex */
public final class IntentConfirmationChallengeActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ViewModelLazy viewModel$delegate;
    public final InitializerViewModelFactory viewModelFactory;

    public IntentConfirmationChallengeActivity() {
        final int i = 1;
        ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
        StripePaymentController$$ExternalSyntheticLambda1 stripePaymentController$$ExternalSyntheticLambda1 = new StripePaymentController$$ExternalSyntheticLambda1(26);
        ReflectionFactory reflectionFactory = Reflection.factory;
        chunkIndexMerger.addInitializer(reflectionFactory.getOrCreateKotlinClass(IntentConfirmationChallengeViewModel.class), stripePaymentController$$ExternalSyntheticLambda1);
        this.viewModelFactory = chunkIndexMerger.build();
        final int i2 = 0;
        this.viewModel$delegate = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(IntentConfirmationChallengeViewModel.class), new Function0(this) { // from class: com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ IntentConfirmationChallengeActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return intentConfirmationChallengeActivity.getViewModelStore();
                    default:
                        return intentConfirmationChallengeActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new IntentConfirmationChallengeActivity$$ExternalSyntheticLambda0(this, i2), new Function0(this) { // from class: com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity$special$$inlined$viewModels$default$2
            public final /* synthetic */ IntentConfirmationChallengeActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                IntentConfirmationChallengeActivity intentConfirmationChallengeActivity = this.$this_viewModels;
                switch (i3) {
                    case 0:
                        return intentConfirmationChallengeActivity.getViewModelStore();
                    default:
                        return intentConfirmationChallengeActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
    }

    public final IntentConfirmationChallengeViewModel getViewModel() {
        return (IntentConfirmationChallengeViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        EdgeToEdge.enable$default(this);
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("intent_confirmation_challenge_args")) {
            finish();
            return;
        }
        JobKt.launch$default(ViewModelKt.getCoroutineScope(getLifecycle()), null, null, new ExoPlayerVideoView.AnonymousClass2(this, null, 21), 3);
        getLifecycle().addObserver(getViewModel());
        ComponentActivityKt.setContent$default(this, new ComposableLambdaImpl(new FieldBinding$$ExternalSyntheticLambda5(this, 2), true, -1767760193));
    }
}
