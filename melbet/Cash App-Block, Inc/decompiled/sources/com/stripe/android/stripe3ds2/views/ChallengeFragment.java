package com.stripe.android.stripe3ds2.views;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.checks.CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.stripe.android.networking.StripeApiRepository$$ExternalSyntheticLambda5;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization$ButtonType;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler$Default;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.android.stripe3ds2.views.ChallengeFragment;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationBarBinding;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import kotlin.text.StringsKt;

/* loaded from: classes8.dex */
public final class ChallengeFragment extends Fragment {
    public Pi2NavigationBarBinding _viewBinding;
    public final Lazy brandZoneView$delegate;
    public final ChallengeActionHandler$Default challengeActionHandler;
    public final Lazy challengeEntryViewFactory$delegate;
    public final Lazy challengeZoneSelectView$delegate;
    public final Lazy challengeZoneTextView$delegate;
    public final Lazy challengeZoneView$delegate;
    public final Lazy challengeZoneWebView$delegate;
    public ChallengeResponseData cresData;
    public final DefaultErrorReporter errorReporter;
    public final StripeErrorRequestExecutor errorRequestExecutor;
    public final Lazy informationZoneView$delegate;
    public final UiType initialUiType;
    public final IntentData intentData;
    public final DefaultTransactionTimer transactionTimer;
    public final StripeUiCustomization uiCustomization;
    public final Lazy uiTypeCode$delegate;
    public final ViewModelLazy viewModel$delegate;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiType.values().length];
            try {
                KClasses$$Lambda$1 kClasses$$Lambda$1 = UiType.Companion;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KClasses$$Lambda$1 kClasses$$Lambda$12 = UiType.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KClasses$$Lambda$1 kClasses$$Lambda$13 = UiType.Companion;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                KClasses$$Lambda$1 kClasses$$Lambda$14 = UiType.Companion;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                KClasses$$Lambda$1 kClasses$$Lambda$15 = UiType.Companion;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment(StripeUiCustomization stripeUiCustomization, DefaultTransactionTimer defaultTransactionTimer, StripeErrorRequestExecutor stripeErrorRequestExecutor, DefaultErrorReporter defaultErrorReporter, ChallengeActionHandler$Default challengeActionHandler$Default, UiType uiType, IntentData intentData) {
        super(R.layout.stripe_challenge_fragment);
        stripeUiCustomization.getClass();
        defaultTransactionTimer.getClass();
        stripeErrorRequestExecutor.getClass();
        defaultErrorReporter.getClass();
        challengeActionHandler$Default.getClass();
        intentData.getClass();
        this.uiCustomization = stripeUiCustomization;
        this.transactionTimer = defaultTransactionTimer;
        this.errorRequestExecutor = stripeErrorRequestExecutor;
        this.errorReporter = defaultErrorReporter;
        this.challengeActionHandler = challengeActionHandler$Default;
        this.initialUiType = uiType;
        this.intentData = intentData;
        final int i = 0;
        this.uiTypeCode$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ ChallengeFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChallengeFragment challengeFragment = this.f$0;
                switch (i2) {
                    case 0:
                        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
                        if (challengeResponseData == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        UiType uiType2 = challengeResponseData.uiType;
                        String str = uiType2 != null ? uiType2.code : null;
                        return str == null ? "" : str;
                    case 1:
                        ChallengeEntryViewFactory challengeEntryViewFactory = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                        if (challengeResponseData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeEntryViewFactory.getClass();
                        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(challengeEntryViewFactory.context, null, 6, 0);
                        challengeZoneWebView.loadHtml(challengeResponseData2.acsHtml);
                        return challengeZoneWebView;
                    case 2:
                        return (InformationZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarHelpButton;
                    case 3:
                        return new PaymentAuthWebViewActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter);
                    case 4:
                        FragmentActivity requireActivity = challengeFragment.requireActivity();
                        requireActivity.getClass();
                        return new ChallengeEntryViewFactory(requireActivity);
                    case 5:
                        return (ChallengeZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarCancelButton;
                    case 6:
                        return (BrandZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarBackButton;
                    case 7:
                        ChallengeEntryViewFactory challengeEntryViewFactory2 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                        if (challengeResponseData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization2 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory2.getClass();
                        stripeUiCustomization2.getClass();
                        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(challengeEntryViewFactory2.context, null, 6, 0);
                        challengeZoneTextView.setTextEntryLabel(challengeResponseData3.challengeInfoLabel);
                        challengeZoneTextView.setTextBoxCustomization(stripeUiCustomization2.mTextBoxCustomization);
                        return challengeZoneTextView;
                    default:
                        ChallengeEntryViewFactory challengeEntryViewFactory3 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization3 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory3.getClass();
                        stripeUiCustomization3.getClass();
                        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(challengeEntryViewFactory3.context, null, 0, challengeResponseData4.uiType == UiType.SingleSelect, 6);
                        challengeZoneSelectView.setTextEntryLabel(challengeResponseData4.challengeInfoLabel, stripeUiCustomization3.mLabelCustomization);
                        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData4.challengeSelectOptions, stripeUiCustomization3.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                        return challengeZoneSelectView;
                }
            }
        });
        final int i2 = 3;
        final int i3 = 1;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(ChallengeActivityViewModel.class), new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$special$$inlined$activityViewModels$default$1
            public final /* synthetic */ ChallengeFragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                ChallengeFragment challengeFragment = this.$this_activityViewModels;
                switch (i4) {
                    case 0:
                        return challengeFragment.requireActivity().getViewModelStore();
                    default:
                        return challengeFragment.requireActivity().getDefaultViewModelCreationExtras();
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ ChallengeFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChallengeFragment challengeFragment = this.f$0;
                switch (i22) {
                    case 0:
                        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
                        if (challengeResponseData == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        UiType uiType2 = challengeResponseData.uiType;
                        String str = uiType2 != null ? uiType2.code : null;
                        return str == null ? "" : str;
                    case 1:
                        ChallengeEntryViewFactory challengeEntryViewFactory = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                        if (challengeResponseData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeEntryViewFactory.getClass();
                        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(challengeEntryViewFactory.context, null, 6, 0);
                        challengeZoneWebView.loadHtml(challengeResponseData2.acsHtml);
                        return challengeZoneWebView;
                    case 2:
                        return (InformationZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarHelpButton;
                    case 3:
                        return new PaymentAuthWebViewActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter);
                    case 4:
                        FragmentActivity requireActivity = challengeFragment.requireActivity();
                        requireActivity.getClass();
                        return new ChallengeEntryViewFactory(requireActivity);
                    case 5:
                        return (ChallengeZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarCancelButton;
                    case 6:
                        return (BrandZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarBackButton;
                    case 7:
                        ChallengeEntryViewFactory challengeEntryViewFactory2 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                        if (challengeResponseData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization2 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory2.getClass();
                        stripeUiCustomization2.getClass();
                        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(challengeEntryViewFactory2.context, null, 6, 0);
                        challengeZoneTextView.setTextEntryLabel(challengeResponseData3.challengeInfoLabel);
                        challengeZoneTextView.setTextBoxCustomization(stripeUiCustomization2.mTextBoxCustomization);
                        return challengeZoneTextView;
                    default:
                        ChallengeEntryViewFactory challengeEntryViewFactory3 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization3 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory3.getClass();
                        stripeUiCustomization3.getClass();
                        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(challengeEntryViewFactory3.context, null, 0, challengeResponseData4.uiType == UiType.SingleSelect, 6);
                        challengeZoneSelectView.setTextEntryLabel(challengeResponseData4.challengeInfoLabel, stripeUiCustomization3.mLabelCustomization);
                        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData4.challengeSelectOptions, stripeUiCustomization3.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                        return challengeZoneSelectView;
                }
            }
        }, new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$special$$inlined$activityViewModels$default$1
            public final /* synthetic */ ChallengeFragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                ChallengeFragment challengeFragment = this.$this_activityViewModels;
                switch (i4) {
                    case 0:
                        return challengeFragment.requireActivity().getViewModelStore();
                    default:
                        return challengeFragment.requireActivity().getDefaultViewModelCreationExtras();
                }
            }
        });
        final int i4 = 4;
        this.challengeEntryViewFactory$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ ChallengeFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                ChallengeFragment challengeFragment = this.f$0;
                switch (i22) {
                    case 0:
                        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
                        if (challengeResponseData == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        UiType uiType2 = challengeResponseData.uiType;
                        String str = uiType2 != null ? uiType2.code : null;
                        return str == null ? "" : str;
                    case 1:
                        ChallengeEntryViewFactory challengeEntryViewFactory = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                        if (challengeResponseData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeEntryViewFactory.getClass();
                        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(challengeEntryViewFactory.context, null, 6, 0);
                        challengeZoneWebView.loadHtml(challengeResponseData2.acsHtml);
                        return challengeZoneWebView;
                    case 2:
                        return (InformationZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarHelpButton;
                    case 3:
                        return new PaymentAuthWebViewActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter);
                    case 4:
                        FragmentActivity requireActivity = challengeFragment.requireActivity();
                        requireActivity.getClass();
                        return new ChallengeEntryViewFactory(requireActivity);
                    case 5:
                        return (ChallengeZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarCancelButton;
                    case 6:
                        return (BrandZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarBackButton;
                    case 7:
                        ChallengeEntryViewFactory challengeEntryViewFactory2 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                        if (challengeResponseData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization2 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory2.getClass();
                        stripeUiCustomization2.getClass();
                        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(challengeEntryViewFactory2.context, null, 6, 0);
                        challengeZoneTextView.setTextEntryLabel(challengeResponseData3.challengeInfoLabel);
                        challengeZoneTextView.setTextBoxCustomization(stripeUiCustomization2.mTextBoxCustomization);
                        return challengeZoneTextView;
                    default:
                        ChallengeEntryViewFactory challengeEntryViewFactory3 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization3 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory3.getClass();
                        stripeUiCustomization3.getClass();
                        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(challengeEntryViewFactory3.context, null, 0, challengeResponseData4.uiType == UiType.SingleSelect, 6);
                        challengeZoneSelectView.setTextEntryLabel(challengeResponseData4.challengeInfoLabel, stripeUiCustomization3.mLabelCustomization);
                        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData4.challengeSelectOptions, stripeUiCustomization3.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                        return challengeZoneSelectView;
                }
            }
        });
        final int i5 = 5;
        this.challengeZoneView$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ ChallengeFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ChallengeFragment challengeFragment = this.f$0;
                switch (i22) {
                    case 0:
                        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
                        if (challengeResponseData == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        UiType uiType2 = challengeResponseData.uiType;
                        String str = uiType2 != null ? uiType2.code : null;
                        return str == null ? "" : str;
                    case 1:
                        ChallengeEntryViewFactory challengeEntryViewFactory = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                        if (challengeResponseData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeEntryViewFactory.getClass();
                        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(challengeEntryViewFactory.context, null, 6, 0);
                        challengeZoneWebView.loadHtml(challengeResponseData2.acsHtml);
                        return challengeZoneWebView;
                    case 2:
                        return (InformationZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarHelpButton;
                    case 3:
                        return new PaymentAuthWebViewActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter);
                    case 4:
                        FragmentActivity requireActivity = challengeFragment.requireActivity();
                        requireActivity.getClass();
                        return new ChallengeEntryViewFactory(requireActivity);
                    case 5:
                        return (ChallengeZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarCancelButton;
                    case 6:
                        return (BrandZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarBackButton;
                    case 7:
                        ChallengeEntryViewFactory challengeEntryViewFactory2 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                        if (challengeResponseData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization2 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory2.getClass();
                        stripeUiCustomization2.getClass();
                        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(challengeEntryViewFactory2.context, null, 6, 0);
                        challengeZoneTextView.setTextEntryLabel(challengeResponseData3.challengeInfoLabel);
                        challengeZoneTextView.setTextBoxCustomization(stripeUiCustomization2.mTextBoxCustomization);
                        return challengeZoneTextView;
                    default:
                        ChallengeEntryViewFactory challengeEntryViewFactory3 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization3 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory3.getClass();
                        stripeUiCustomization3.getClass();
                        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(challengeEntryViewFactory3.context, null, 0, challengeResponseData4.uiType == UiType.SingleSelect, 6);
                        challengeZoneSelectView.setTextEntryLabel(challengeResponseData4.challengeInfoLabel, stripeUiCustomization3.mLabelCustomization);
                        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData4.challengeSelectOptions, stripeUiCustomization3.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                        return challengeZoneSelectView;
                }
            }
        });
        final int i6 = 6;
        this.brandZoneView$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ ChallengeFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                ChallengeFragment challengeFragment = this.f$0;
                switch (i22) {
                    case 0:
                        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
                        if (challengeResponseData == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        UiType uiType2 = challengeResponseData.uiType;
                        String str = uiType2 != null ? uiType2.code : null;
                        return str == null ? "" : str;
                    case 1:
                        ChallengeEntryViewFactory challengeEntryViewFactory = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                        if (challengeResponseData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeEntryViewFactory.getClass();
                        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(challengeEntryViewFactory.context, null, 6, 0);
                        challengeZoneWebView.loadHtml(challengeResponseData2.acsHtml);
                        return challengeZoneWebView;
                    case 2:
                        return (InformationZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarHelpButton;
                    case 3:
                        return new PaymentAuthWebViewActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter);
                    case 4:
                        FragmentActivity requireActivity = challengeFragment.requireActivity();
                        requireActivity.getClass();
                        return new ChallengeEntryViewFactory(requireActivity);
                    case 5:
                        return (ChallengeZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarCancelButton;
                    case 6:
                        return (BrandZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarBackButton;
                    case 7:
                        ChallengeEntryViewFactory challengeEntryViewFactory2 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                        if (challengeResponseData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization2 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory2.getClass();
                        stripeUiCustomization2.getClass();
                        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(challengeEntryViewFactory2.context, null, 6, 0);
                        challengeZoneTextView.setTextEntryLabel(challengeResponseData3.challengeInfoLabel);
                        challengeZoneTextView.setTextBoxCustomization(stripeUiCustomization2.mTextBoxCustomization);
                        return challengeZoneTextView;
                    default:
                        ChallengeEntryViewFactory challengeEntryViewFactory3 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization3 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory3.getClass();
                        stripeUiCustomization3.getClass();
                        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(challengeEntryViewFactory3.context, null, 0, challengeResponseData4.uiType == UiType.SingleSelect, 6);
                        challengeZoneSelectView.setTextEntryLabel(challengeResponseData4.challengeInfoLabel, stripeUiCustomization3.mLabelCustomization);
                        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData4.challengeSelectOptions, stripeUiCustomization3.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                        return challengeZoneSelectView;
                }
            }
        });
        final int i7 = 7;
        this.challengeZoneTextView$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ ChallengeFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                ChallengeFragment challengeFragment = this.f$0;
                switch (i22) {
                    case 0:
                        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
                        if (challengeResponseData == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        UiType uiType2 = challengeResponseData.uiType;
                        String str = uiType2 != null ? uiType2.code : null;
                        return str == null ? "" : str;
                    case 1:
                        ChallengeEntryViewFactory challengeEntryViewFactory = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                        if (challengeResponseData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeEntryViewFactory.getClass();
                        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(challengeEntryViewFactory.context, null, 6, 0);
                        challengeZoneWebView.loadHtml(challengeResponseData2.acsHtml);
                        return challengeZoneWebView;
                    case 2:
                        return (InformationZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarHelpButton;
                    case 3:
                        return new PaymentAuthWebViewActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter);
                    case 4:
                        FragmentActivity requireActivity = challengeFragment.requireActivity();
                        requireActivity.getClass();
                        return new ChallengeEntryViewFactory(requireActivity);
                    case 5:
                        return (ChallengeZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarCancelButton;
                    case 6:
                        return (BrandZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarBackButton;
                    case 7:
                        ChallengeEntryViewFactory challengeEntryViewFactory2 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                        if (challengeResponseData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization2 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory2.getClass();
                        stripeUiCustomization2.getClass();
                        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(challengeEntryViewFactory2.context, null, 6, 0);
                        challengeZoneTextView.setTextEntryLabel(challengeResponseData3.challengeInfoLabel);
                        challengeZoneTextView.setTextBoxCustomization(stripeUiCustomization2.mTextBoxCustomization);
                        return challengeZoneTextView;
                    default:
                        ChallengeEntryViewFactory challengeEntryViewFactory3 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization3 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory3.getClass();
                        stripeUiCustomization3.getClass();
                        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(challengeEntryViewFactory3.context, null, 0, challengeResponseData4.uiType == UiType.SingleSelect, 6);
                        challengeZoneSelectView.setTextEntryLabel(challengeResponseData4.challengeInfoLabel, stripeUiCustomization3.mLabelCustomization);
                        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData4.challengeSelectOptions, stripeUiCustomization3.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                        return challengeZoneSelectView;
                }
            }
        });
        final int i8 = 8;
        this.challengeZoneSelectView$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ ChallengeFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                ChallengeFragment challengeFragment = this.f$0;
                switch (i22) {
                    case 0:
                        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
                        if (challengeResponseData == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        UiType uiType2 = challengeResponseData.uiType;
                        String str = uiType2 != null ? uiType2.code : null;
                        return str == null ? "" : str;
                    case 1:
                        ChallengeEntryViewFactory challengeEntryViewFactory = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                        if (challengeResponseData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeEntryViewFactory.getClass();
                        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(challengeEntryViewFactory.context, null, 6, 0);
                        challengeZoneWebView.loadHtml(challengeResponseData2.acsHtml);
                        return challengeZoneWebView;
                    case 2:
                        return (InformationZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarHelpButton;
                    case 3:
                        return new PaymentAuthWebViewActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter);
                    case 4:
                        FragmentActivity requireActivity = challengeFragment.requireActivity();
                        requireActivity.getClass();
                        return new ChallengeEntryViewFactory(requireActivity);
                    case 5:
                        return (ChallengeZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarCancelButton;
                    case 6:
                        return (BrandZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarBackButton;
                    case 7:
                        ChallengeEntryViewFactory challengeEntryViewFactory2 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                        if (challengeResponseData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization2 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory2.getClass();
                        stripeUiCustomization2.getClass();
                        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(challengeEntryViewFactory2.context, null, 6, 0);
                        challengeZoneTextView.setTextEntryLabel(challengeResponseData3.challengeInfoLabel);
                        challengeZoneTextView.setTextBoxCustomization(stripeUiCustomization2.mTextBoxCustomization);
                        return challengeZoneTextView;
                    default:
                        ChallengeEntryViewFactory challengeEntryViewFactory3 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization3 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory3.getClass();
                        stripeUiCustomization3.getClass();
                        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(challengeEntryViewFactory3.context, null, 0, challengeResponseData4.uiType == UiType.SingleSelect, 6);
                        challengeZoneSelectView.setTextEntryLabel(challengeResponseData4.challengeInfoLabel, stripeUiCustomization3.mLabelCustomization);
                        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData4.challengeSelectOptions, stripeUiCustomization3.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                        return challengeZoneSelectView;
                }
            }
        });
        this.challengeZoneWebView$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ ChallengeFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChallengeFragment challengeFragment = this.f$0;
                switch (i22) {
                    case 0:
                        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
                        if (challengeResponseData == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        UiType uiType2 = challengeResponseData.uiType;
                        String str = uiType2 != null ? uiType2.code : null;
                        return str == null ? "" : str;
                    case 1:
                        ChallengeEntryViewFactory challengeEntryViewFactory = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                        if (challengeResponseData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeEntryViewFactory.getClass();
                        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(challengeEntryViewFactory.context, null, 6, 0);
                        challengeZoneWebView.loadHtml(challengeResponseData2.acsHtml);
                        return challengeZoneWebView;
                    case 2:
                        return (InformationZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarHelpButton;
                    case 3:
                        return new PaymentAuthWebViewActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter);
                    case 4:
                        FragmentActivity requireActivity = challengeFragment.requireActivity();
                        requireActivity.getClass();
                        return new ChallengeEntryViewFactory(requireActivity);
                    case 5:
                        return (ChallengeZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarCancelButton;
                    case 6:
                        return (BrandZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarBackButton;
                    case 7:
                        ChallengeEntryViewFactory challengeEntryViewFactory2 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                        if (challengeResponseData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization2 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory2.getClass();
                        stripeUiCustomization2.getClass();
                        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(challengeEntryViewFactory2.context, null, 6, 0);
                        challengeZoneTextView.setTextEntryLabel(challengeResponseData3.challengeInfoLabel);
                        challengeZoneTextView.setTextBoxCustomization(stripeUiCustomization2.mTextBoxCustomization);
                        return challengeZoneTextView;
                    default:
                        ChallengeEntryViewFactory challengeEntryViewFactory3 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization3 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory3.getClass();
                        stripeUiCustomization3.getClass();
                        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(challengeEntryViewFactory3.context, null, 0, challengeResponseData4.uiType == UiType.SingleSelect, 6);
                        challengeZoneSelectView.setTextEntryLabel(challengeResponseData4.challengeInfoLabel, stripeUiCustomization3.mLabelCustomization);
                        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData4.challengeSelectOptions, stripeUiCustomization3.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                        return challengeZoneSelectView;
                }
            }
        });
        final int i9 = 2;
        this.informationZoneView$delegate = LazyKt.lazy(new Function0(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            public final /* synthetic */ ChallengeFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i9;
                ChallengeFragment challengeFragment = this.f$0;
                switch (i22) {
                    case 0:
                        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
                        if (challengeResponseData == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        UiType uiType2 = challengeResponseData.uiType;
                        String str = uiType2 != null ? uiType2.code : null;
                        return str == null ? "" : str;
                    case 1:
                        ChallengeEntryViewFactory challengeEntryViewFactory = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                        if (challengeResponseData2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeEntryViewFactory.getClass();
                        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(challengeEntryViewFactory.context, null, 6, 0);
                        challengeZoneWebView.loadHtml(challengeResponseData2.acsHtml);
                        return challengeZoneWebView;
                    case 2:
                        return (InformationZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarHelpButton;
                    case 3:
                        return new PaymentAuthWebViewActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter);
                    case 4:
                        FragmentActivity requireActivity = challengeFragment.requireActivity();
                        requireActivity.getClass();
                        return new ChallengeEntryViewFactory(requireActivity);
                    case 5:
                        return (ChallengeZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarCancelButton;
                    case 6:
                        return (BrandZoneView) challengeFragment.getViewBinding$3ds2sdk_release().navBarBackButton;
                    case 7:
                        ChallengeEntryViewFactory challengeEntryViewFactory2 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                        if (challengeResponseData3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization2 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory2.getClass();
                        stripeUiCustomization2.getClass();
                        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(challengeEntryViewFactory2.context, null, 6, 0);
                        challengeZoneTextView.setTextEntryLabel(challengeResponseData3.challengeInfoLabel);
                        challengeZoneTextView.setTextBoxCustomization(stripeUiCustomization2.mTextBoxCustomization);
                        return challengeZoneTextView;
                    default:
                        ChallengeEntryViewFactory challengeEntryViewFactory3 = (ChallengeEntryViewFactory) challengeFragment.challengeEntryViewFactory$delegate.getValue();
                        ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        StripeUiCustomization stripeUiCustomization3 = challengeFragment.uiCustomization;
                        challengeEntryViewFactory3.getClass();
                        stripeUiCustomization3.getClass();
                        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(challengeEntryViewFactory3.context, null, 0, challengeResponseData4.uiType == UiType.SingleSelect, 6);
                        challengeZoneSelectView.setTextEntryLabel(challengeResponseData4.challengeInfoLabel, stripeUiCustomization3.mLabelCustomization);
                        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData4.challengeSelectOptions, stripeUiCustomization3.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                        return challengeZoneSelectView;
                }
            }
        });
    }

    public final ChallengeAction getChallengeAction() {
        Boolean bool;
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            throw null;
        }
        String str = challengeResponseData.whitelistingInfoText;
        if (str == null || str.length() == 0) {
            bool = null;
        } else {
            bool = Boolean.valueOf(getChallengeZoneView().whitelistRadioGroup.getCheckedRadioButtonId() == R.id.czv_whitelist_yes_button);
        }
        ChallengeResponseData challengeResponseData2 = this.cresData;
        if (challengeResponseData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            throw null;
        }
        UiType uiType = challengeResponseData2.uiType;
        int i = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        return i != 4 ? i != 5 ? new ChallengeAction.NativeForm(getUserEntry$3ds2sdk_release(), bool) : new ChallengeAction.Oob(bool) : new ChallengeAction.HtmlForm(getUserEntry$3ds2sdk_release());
    }

    public final ChallengeZoneView getChallengeZoneView() {
        return (ChallengeZoneView) this.challengeZoneView$delegate.getValue();
    }

    public final String getUserEntry$3ds2sdk_release() {
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            throw null;
        }
        UiType uiType = challengeResponseData.uiType;
        int i = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        if (i == 1) {
            Editable text = ((ChallengeZoneTextView) this.challengeZoneTextView$delegate.getValue()).textEntryView.getText();
            String obj = text != null ? text.toString() : null;
            return obj == null ? "" : obj;
        }
        if (i != 2 && i != 3) {
            return i != 4 ? "" : ((ChallengeZoneWebView) this.challengeZoneWebView$delegate.getValue()).userEntry;
        }
        ChallengeZoneSelectView challengeZoneSelectView = (ChallengeZoneSelectView) this.challengeZoneSelectView$delegate.getValue();
        List selectedIndexes$3ds2sdk_release = challengeZoneSelectView.getSelectedIndexes$3ds2sdk_release();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(selectedIndexes$3ds2sdk_release, 10));
        Iterator it = selectedIndexes$3ds2sdk_release.iterator();
        while (it.hasNext()) {
            Object tag = challengeZoneSelectView.selectGroup.getChildAt(((Number) it.next()).intValue()).getTag();
            tag.getClass();
            arrayList.add((ChallengeResponseData.ChallengeSelectOption) tag);
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new StripeApiRepository$$ExternalSyntheticLambda5(25), 30);
    }

    public final Pi2NavigationBarBinding getViewBinding$3ds2sdk_release() {
        Pi2NavigationBarBinding pi2NavigationBarBinding = this._viewBinding;
        if (pi2NavigationBarBinding != null) {
            return pi2NavigationBarBinding;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        return null;
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this._viewBinding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData != null) {
            if (challengeResponseData != null) {
                KClasses$$Lambda$1 kClasses$$Lambda$1 = UiType.Companion;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData != null) {
            if (challengeResponseData != null) {
                KClasses$$Lambda$1 kClasses$$Lambda$1 = UiType.Companion;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        ChallengeResponseData challengeResponseData = arguments != null ? (ChallengeResponseData) SizeKt.getParcelable(arguments, "arg_cres", ChallengeResponseData.class) : null;
        if (challengeResponseData == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Could not start challenge screen. Challenge response data was null.");
            getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.RuntimeError(illegalArgumentException, this.initialUiType, this.intentData));
            return;
        }
        this.cresData = challengeResponseData;
        int i = R.id.ca_brand_zone;
        BrandZoneView brandZoneView = (BrandZoneView) ViewBindings.findChildViewById(view, R.id.ca_brand_zone);
        if (brandZoneView != null) {
            i = R.id.ca_challenge_zone;
            ChallengeZoneView challengeZoneView = (ChallengeZoneView) ViewBindings.findChildViewById(view, R.id.ca_challenge_zone);
            if (challengeZoneView != null) {
                i = R.id.ca_information_zone;
                InformationZoneView informationZoneView = (InformationZoneView) ViewBindings.findChildViewById(view, R.id.ca_information_zone);
                if (informationZoneView != null) {
                    this._viewBinding = new Pi2NavigationBarBinding((ScrollView) view, brandZoneView, challengeZoneView, informationZoneView, 1);
                    final int i2 = 2;
                    getViewModel$3ds2sdk_release().challengeText.observe(getViewLifecycleOwner(), new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(2, new Function1(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda0
                        public final /* synthetic */ ChallengeFragment f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str;
                            String str2;
                            Object succeeded;
                            int i3 = r2;
                            ChallengeFragment challengeFragment = this.f$0;
                            switch (i3) {
                                case 0:
                                    String str3 = (String) obj;
                                    ChallengeZoneTextView challengeZoneTextView = (ChallengeZoneTextView) challengeFragment.challengeZoneTextView$delegate.getValue();
                                    str3.getClass();
                                    challengeZoneTextView.setText(str3);
                                    return Unit.INSTANCE;
                                case 1:
                                    ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                                    if (challengeResponseData2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                        throw null;
                                    }
                                    if (challengeResponseData2.uiType != UiType.Html || (str2 = challengeResponseData2.acsHtmlRefresh) == null || StringsKt.isBlank(str2)) {
                                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                                        if (challengeResponseData3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                            throw null;
                                        }
                                        if (challengeResponseData3.uiType == UiType.OutOfBand && (str = challengeResponseData3.challengeAdditionalInfoText) != null && !StringsKt.isBlank(str)) {
                                            ChallengeZoneView challengeZoneView2 = challengeFragment.getChallengeZoneView();
                                            ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                                            if (challengeResponseData4 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                                throw null;
                                            }
                                            challengeZoneView2.setInfoText(challengeResponseData4.challengeAdditionalInfoText, challengeFragment.uiCustomization.mLabelCustomization);
                                            challengeFragment.getChallengeZoneView().setInfoTextIndicator(0);
                                        }
                                    } else {
                                        ChallengeZoneWebView challengeZoneWebView = (ChallengeZoneWebView) challengeFragment.challengeZoneWebView$delegate.getValue();
                                        ChallengeResponseData challengeResponseData5 = challengeFragment.cresData;
                                        if (challengeResponseData5 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                            throw null;
                                        }
                                        challengeZoneWebView.loadHtml(challengeResponseData5.acsHtmlRefresh);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    IntentData intentData = challengeFragment.intentData;
                                    UiType uiType = challengeFragment.initialUiType;
                                    Lazy lazy = challengeFragment.uiTypeCode$delegate;
                                    ChallengeRequestResult challengeRequestResult = (ChallengeRequestResult) obj;
                                    if (challengeRequestResult != null) {
                                        StripeErrorRequestExecutor stripeErrorRequestExecutor = challengeFragment.errorRequestExecutor;
                                        if (challengeRequestResult instanceof ChallengeRequestResult.Success) {
                                            ChallengeRequestResult.Success success = (ChallengeRequestResult.Success) challengeRequestResult;
                                            ChallengeRequestData challengeRequestData = success.creqData;
                                            ChallengeResponseData challengeResponseData6 = success.cresData;
                                            if (challengeResponseData6.isChallengeCompleted) {
                                                challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                                if (challengeRequestData.cancelReason != null) {
                                                    succeeded = new ChallengeResult.Canceled((String) lazy.getValue(), uiType, intentData);
                                                } else {
                                                    String str4 = challengeResponseData6.transStatus;
                                                    if (str4 == null) {
                                                        str4 = "";
                                                    }
                                                    succeeded = "Y".equals(str4) ? new ChallengeResult.Succeeded((String) lazy.getValue(), uiType, intentData) : new ChallengeResult.Failed((String) lazy.getValue(), uiType, intentData);
                                                }
                                                challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(succeeded);
                                            } else if (challengeRequestData.cancelReason != null) {
                                                challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                                challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.Canceled((String) lazy.getValue(), uiType, intentData));
                                            } else {
                                                challengeFragment.getViewModel$3ds2sdk_release()._nextScreen.setValue(challengeResponseData6);
                                            }
                                        } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
                                            ErrorData errorData = ((ChallengeRequestResult.ProtocolError) challengeRequestResult).data;
                                            challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.ProtocolError(errorData, uiType, intentData));
                                            challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                            stripeErrorRequestExecutor.executeAsync(errorData);
                                        } else if (challengeRequestResult instanceof ChallengeRequestResult.RuntimeError) {
                                            challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.RuntimeError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).throwable, uiType, intentData));
                                        } else {
                                            if (!(challengeRequestResult instanceof ChallengeRequestResult.Timeout)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            ErrorData errorData2 = ((ChallengeRequestResult.Timeout) challengeRequestResult).data;
                                            challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                            stripeErrorRequestExecutor.executeAsync(errorData2);
                                            challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.Timeout((String) lazy.getValue(), uiType, intentData));
                                        }
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }));
                    final int i3 = 1;
                    getViewModel$3ds2sdk_release().refreshUi.observe(getViewLifecycleOwner(), new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(2, new Function1(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda0
                        public final /* synthetic */ ChallengeFragment f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str;
                            String str2;
                            Object succeeded;
                            int i32 = i3;
                            ChallengeFragment challengeFragment = this.f$0;
                            switch (i32) {
                                case 0:
                                    String str3 = (String) obj;
                                    ChallengeZoneTextView challengeZoneTextView = (ChallengeZoneTextView) challengeFragment.challengeZoneTextView$delegate.getValue();
                                    str3.getClass();
                                    challengeZoneTextView.setText(str3);
                                    return Unit.INSTANCE;
                                case 1:
                                    ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                                    if (challengeResponseData2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                        throw null;
                                    }
                                    if (challengeResponseData2.uiType != UiType.Html || (str2 = challengeResponseData2.acsHtmlRefresh) == null || StringsKt.isBlank(str2)) {
                                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                                        if (challengeResponseData3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                            throw null;
                                        }
                                        if (challengeResponseData3.uiType == UiType.OutOfBand && (str = challengeResponseData3.challengeAdditionalInfoText) != null && !StringsKt.isBlank(str)) {
                                            ChallengeZoneView challengeZoneView2 = challengeFragment.getChallengeZoneView();
                                            ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                                            if (challengeResponseData4 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                                throw null;
                                            }
                                            challengeZoneView2.setInfoText(challengeResponseData4.challengeAdditionalInfoText, challengeFragment.uiCustomization.mLabelCustomization);
                                            challengeFragment.getChallengeZoneView().setInfoTextIndicator(0);
                                        }
                                    } else {
                                        ChallengeZoneWebView challengeZoneWebView = (ChallengeZoneWebView) challengeFragment.challengeZoneWebView$delegate.getValue();
                                        ChallengeResponseData challengeResponseData5 = challengeFragment.cresData;
                                        if (challengeResponseData5 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                            throw null;
                                        }
                                        challengeZoneWebView.loadHtml(challengeResponseData5.acsHtmlRefresh);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    IntentData intentData = challengeFragment.intentData;
                                    UiType uiType = challengeFragment.initialUiType;
                                    Lazy lazy = challengeFragment.uiTypeCode$delegate;
                                    ChallengeRequestResult challengeRequestResult = (ChallengeRequestResult) obj;
                                    if (challengeRequestResult != null) {
                                        StripeErrorRequestExecutor stripeErrorRequestExecutor = challengeFragment.errorRequestExecutor;
                                        if (challengeRequestResult instanceof ChallengeRequestResult.Success) {
                                            ChallengeRequestResult.Success success = (ChallengeRequestResult.Success) challengeRequestResult;
                                            ChallengeRequestData challengeRequestData = success.creqData;
                                            ChallengeResponseData challengeResponseData6 = success.cresData;
                                            if (challengeResponseData6.isChallengeCompleted) {
                                                challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                                if (challengeRequestData.cancelReason != null) {
                                                    succeeded = new ChallengeResult.Canceled((String) lazy.getValue(), uiType, intentData);
                                                } else {
                                                    String str4 = challengeResponseData6.transStatus;
                                                    if (str4 == null) {
                                                        str4 = "";
                                                    }
                                                    succeeded = "Y".equals(str4) ? new ChallengeResult.Succeeded((String) lazy.getValue(), uiType, intentData) : new ChallengeResult.Failed((String) lazy.getValue(), uiType, intentData);
                                                }
                                                challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(succeeded);
                                            } else if (challengeRequestData.cancelReason != null) {
                                                challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                                challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.Canceled((String) lazy.getValue(), uiType, intentData));
                                            } else {
                                                challengeFragment.getViewModel$3ds2sdk_release()._nextScreen.setValue(challengeResponseData6);
                                            }
                                        } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
                                            ErrorData errorData = ((ChallengeRequestResult.ProtocolError) challengeRequestResult).data;
                                            challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.ProtocolError(errorData, uiType, intentData));
                                            challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                            stripeErrorRequestExecutor.executeAsync(errorData);
                                        } else if (challengeRequestResult instanceof ChallengeRequestResult.RuntimeError) {
                                            challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.RuntimeError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).throwable, uiType, intentData));
                                        } else {
                                            if (!(challengeRequestResult instanceof ChallengeRequestResult.Timeout)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            ErrorData errorData2 = ((ChallengeRequestResult.Timeout) challengeRequestResult).data;
                                            challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                            stripeErrorRequestExecutor.executeAsync(errorData2);
                                            challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.Timeout((String) lazy.getValue(), uiType, intentData));
                                        }
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }));
                    getViewModel$3ds2sdk_release().challengeRequestResult.observe(getViewLifecycleOwner(), new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(2, new Function1(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda0
                        public final /* synthetic */ ChallengeFragment f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str;
                            String str2;
                            Object succeeded;
                            int i32 = i2;
                            ChallengeFragment challengeFragment = this.f$0;
                            switch (i32) {
                                case 0:
                                    String str3 = (String) obj;
                                    ChallengeZoneTextView challengeZoneTextView = (ChallengeZoneTextView) challengeFragment.challengeZoneTextView$delegate.getValue();
                                    str3.getClass();
                                    challengeZoneTextView.setText(str3);
                                    return Unit.INSTANCE;
                                case 1:
                                    ChallengeResponseData challengeResponseData2 = challengeFragment.cresData;
                                    if (challengeResponseData2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                        throw null;
                                    }
                                    if (challengeResponseData2.uiType != UiType.Html || (str2 = challengeResponseData2.acsHtmlRefresh) == null || StringsKt.isBlank(str2)) {
                                        ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                                        if (challengeResponseData3 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                            throw null;
                                        }
                                        if (challengeResponseData3.uiType == UiType.OutOfBand && (str = challengeResponseData3.challengeAdditionalInfoText) != null && !StringsKt.isBlank(str)) {
                                            ChallengeZoneView challengeZoneView2 = challengeFragment.getChallengeZoneView();
                                            ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                                            if (challengeResponseData4 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                                throw null;
                                            }
                                            challengeZoneView2.setInfoText(challengeResponseData4.challengeAdditionalInfoText, challengeFragment.uiCustomization.mLabelCustomization);
                                            challengeFragment.getChallengeZoneView().setInfoTextIndicator(0);
                                        }
                                    } else {
                                        ChallengeZoneWebView challengeZoneWebView = (ChallengeZoneWebView) challengeFragment.challengeZoneWebView$delegate.getValue();
                                        ChallengeResponseData challengeResponseData5 = challengeFragment.cresData;
                                        if (challengeResponseData5 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                            throw null;
                                        }
                                        challengeZoneWebView.loadHtml(challengeResponseData5.acsHtmlRefresh);
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    IntentData intentData = challengeFragment.intentData;
                                    UiType uiType = challengeFragment.initialUiType;
                                    Lazy lazy = challengeFragment.uiTypeCode$delegate;
                                    ChallengeRequestResult challengeRequestResult = (ChallengeRequestResult) obj;
                                    if (challengeRequestResult != null) {
                                        StripeErrorRequestExecutor stripeErrorRequestExecutor = challengeFragment.errorRequestExecutor;
                                        if (challengeRequestResult instanceof ChallengeRequestResult.Success) {
                                            ChallengeRequestResult.Success success = (ChallengeRequestResult.Success) challengeRequestResult;
                                            ChallengeRequestData challengeRequestData = success.creqData;
                                            ChallengeResponseData challengeResponseData6 = success.cresData;
                                            if (challengeResponseData6.isChallengeCompleted) {
                                                challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                                if (challengeRequestData.cancelReason != null) {
                                                    succeeded = new ChallengeResult.Canceled((String) lazy.getValue(), uiType, intentData);
                                                } else {
                                                    String str4 = challengeResponseData6.transStatus;
                                                    if (str4 == null) {
                                                        str4 = "";
                                                    }
                                                    succeeded = "Y".equals(str4) ? new ChallengeResult.Succeeded((String) lazy.getValue(), uiType, intentData) : new ChallengeResult.Failed((String) lazy.getValue(), uiType, intentData);
                                                }
                                                challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(succeeded);
                                            } else if (challengeRequestData.cancelReason != null) {
                                                challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                                challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.Canceled((String) lazy.getValue(), uiType, intentData));
                                            } else {
                                                challengeFragment.getViewModel$3ds2sdk_release()._nextScreen.setValue(challengeResponseData6);
                                            }
                                        } else if (challengeRequestResult instanceof ChallengeRequestResult.ProtocolError) {
                                            ErrorData errorData = ((ChallengeRequestResult.ProtocolError) challengeRequestResult).data;
                                            challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.ProtocolError(errorData, uiType, intentData));
                                            challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                            stripeErrorRequestExecutor.executeAsync(errorData);
                                        } else if (challengeRequestResult instanceof ChallengeRequestResult.RuntimeError) {
                                            challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.RuntimeError(((ChallengeRequestResult.RuntimeError) challengeRequestResult).throwable, uiType, intentData));
                                        } else {
                                            if (!(challengeRequestResult instanceof ChallengeRequestResult.Timeout)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            ErrorData errorData2 = ((ChallengeRequestResult.Timeout) challengeRequestResult).data;
                                            challengeFragment.getViewModel$3ds2sdk_release().transactionTimerJob.cancel(null);
                                            stripeErrorRequestExecutor.executeAsync(errorData2);
                                            challengeFragment.getViewModel$3ds2sdk_release()._shouldFinish.postValue(new ChallengeResult.Timeout((String) lazy.getValue(), uiType, intentData));
                                        }
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }));
                    BrandZoneView brandZoneView2 = (BrandZoneView) getViewBinding$3ds2sdk_release().navBarBackButton;
                    ImageView imageView = brandZoneView2.issuerImageView;
                    ChallengeResponseData challengeResponseData2 = this.cresData;
                    if (challengeResponseData2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        throw null;
                    }
                    Iterator it = MapsKt__MapsKt.mapOf(new Pair(imageView, challengeResponseData2.issuerImage), new Pair(brandZoneView2.paymentSystemImageView, challengeResponseData2.paymentSystemImage)).entrySet().iterator();
                    while (true) {
                        int i4 = 5;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        ViewModelKt.liveData$default(new BufferCountKt$bufferSkip$1(getViewModel$3ds2sdk_release(), (ChallengeResponseData.Image) entry.getValue(), getResources().getDisplayMetrics().densityDpi, (Continuation) null)).observe(getViewLifecycleOwner(), new CaptureCheckFaceKt$sam$androidx_lifecycle_Observer$0(2, new HCaptcha$$ExternalSyntheticLambda2((ImageView) entry.getKey(), i4)));
                    }
                    ChallengeZoneTextView challengeZoneTextView = (ChallengeZoneTextView) this.challengeZoneTextView$delegate.getValue();
                    ChallengeZoneSelectView challengeZoneSelectView = (ChallengeZoneSelectView) this.challengeZoneSelectView$delegate.getValue();
                    ChallengeZoneWebView challengeZoneWebView = (ChallengeZoneWebView) this.challengeZoneWebView$delegate.getValue();
                    ChallengeResponseData challengeResponseData3 = this.cresData;
                    if (challengeResponseData3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        throw null;
                    }
                    UiType uiType = challengeResponseData3.uiType;
                    int i5 = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
                    StripeUiCustomization stripeUiCustomization = this.uiCustomization;
                    if (i5 == 1) {
                        getChallengeZoneView().setChallengeEntryView(challengeZoneTextView);
                        ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
                        ChallengeResponseData challengeResponseData4 = this.cresData;
                        if (challengeResponseData4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeZoneView2.setSubmitButton(challengeResponseData4.submitAuthenticationLabel, stripeUiCustomization.getButtonCustomization(UiCustomization$ButtonType.SUBMIT));
                        ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
                        ChallengeResponseData challengeResponseData5 = this.cresData;
                        if (challengeResponseData5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeZoneView3.setResendButtonLabel(challengeResponseData5.resendInformationLabel, stripeUiCustomization.getButtonCustomization(UiCustomization$ButtonType.RESEND));
                    } else if (i5 == 2 || i5 == 3) {
                        getChallengeZoneView().setChallengeEntryView(challengeZoneSelectView);
                        ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
                        ChallengeResponseData challengeResponseData6 = this.cresData;
                        if (challengeResponseData6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeZoneView4.setSubmitButton(challengeResponseData6.submitAuthenticationLabel, stripeUiCustomization.getButtonCustomization(UiCustomization$ButtonType.NEXT));
                    } else if (i5 == 4) {
                        getChallengeZoneView().setChallengeEntryView(challengeZoneWebView);
                        getChallengeZoneView().setInfoHeaderText(null, null);
                        getChallengeZoneView().setInfoText(null, null);
                        getChallengeZoneView().setSubmitButton(null, null);
                        challengeZoneWebView.setOnClickListener(new View.OnClickListener(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda12
                            public final /* synthetic */ ChallengeFragment f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i6 = r2;
                                ChallengeFragment challengeFragment = this.f$0;
                                switch (i6) {
                                    case 0:
                                        challengeFragment.getViewModel$3ds2sdk_release()._submitClicked.postValue(challengeFragment.getChallengeAction());
                                        return;
                                    case 1:
                                        challengeFragment.getViewModel$3ds2sdk_release()._submitClicked.postValue(challengeFragment.getChallengeAction());
                                        ChallengeResponseData challengeResponseData7 = challengeFragment.cresData;
                                        if (challengeResponseData7 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                            throw null;
                                        }
                                        UiType uiType2 = challengeResponseData7.uiType;
                                        int i7 = uiType2 == null ? -1 : ChallengeFragment.WhenMappings.$EnumSwitchMapping$0[uiType2.ordinal()];
                                        if (i7 == -1 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) {
                                            return;
                                        }
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                    default:
                                        challengeFragment.getViewModel$3ds2sdk_release().submit(ChallengeAction.Resend.INSTANCE);
                                        return;
                                }
                            }
                        });
                        ((BrandZoneView) this.brandZoneView$delegate.getValue()).setVisibility(8);
                    } else if (i5 == 5) {
                        ChallengeZoneView challengeZoneView5 = getChallengeZoneView();
                        ChallengeResponseData challengeResponseData7 = this.cresData;
                        if (challengeResponseData7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeZoneView5.setSubmitButton(challengeResponseData7.oobContinueLabel, stripeUiCustomization.getButtonCustomization(UiCustomization$ButtonType.CONTINUE));
                    }
                    ChallengeZoneView challengeZoneView6 = getChallengeZoneView();
                    ChallengeResponseData challengeResponseData8 = this.cresData;
                    if (challengeResponseData8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        throw null;
                    }
                    String str = challengeResponseData8.challengeInfoHeader;
                    LabelCustomization labelCustomization = stripeUiCustomization.mLabelCustomization;
                    LabelCustomization labelCustomization2 = stripeUiCustomization.mLabelCustomization;
                    challengeZoneView6.setInfoHeaderText(str, labelCustomization);
                    ChallengeZoneView challengeZoneView7 = getChallengeZoneView();
                    ChallengeResponseData challengeResponseData9 = this.cresData;
                    if (challengeResponseData9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        throw null;
                    }
                    challengeZoneView7.setInfoText(challengeResponseData9.challengeInfoText, labelCustomization);
                    ChallengeResponseData challengeResponseData10 = this.cresData;
                    if (challengeResponseData10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        throw null;
                    }
                    if (challengeResponseData10.uiType == UiType.OutOfBand) {
                        ChallengeZoneView challengeZoneView8 = getChallengeZoneView();
                        ChallengeResponseData challengeResponseData11 = this.cresData;
                        if (challengeResponseData11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("cresData");
                            throw null;
                        }
                        challengeZoneView8.setInfoLabel(challengeResponseData11.challengeInfoLabel, labelCustomization);
                    }
                    ChallengeZoneView challengeZoneView9 = getChallengeZoneView();
                    ChallengeResponseData challengeResponseData12 = this.cresData;
                    if (challengeResponseData12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        throw null;
                    }
                    challengeZoneView9.setInfoTextIndicator(challengeResponseData12.shouldShowChallengeInfoTextIndicator ? R.drawable.stripe_3ds2_ic_indicator : 0);
                    ChallengeZoneView challengeZoneView10 = getChallengeZoneView();
                    ChallengeResponseData challengeResponseData13 = this.cresData;
                    if (challengeResponseData13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        throw null;
                    }
                    challengeZoneView10.setWhitelistingLabel(challengeResponseData13.whitelistingInfoText, labelCustomization, stripeUiCustomization.getButtonCustomization(UiCustomization$ButtonType.SELECT));
                    getChallengeZoneView().setSubmitButtonClickListener(new View.OnClickListener(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda12
                        public final /* synthetic */ ChallengeFragment f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = i3;
                            ChallengeFragment challengeFragment = this.f$0;
                            switch (i6) {
                                case 0:
                                    challengeFragment.getViewModel$3ds2sdk_release()._submitClicked.postValue(challengeFragment.getChallengeAction());
                                    return;
                                case 1:
                                    challengeFragment.getViewModel$3ds2sdk_release()._submitClicked.postValue(challengeFragment.getChallengeAction());
                                    ChallengeResponseData challengeResponseData72 = challengeFragment.cresData;
                                    if (challengeResponseData72 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                        throw null;
                                    }
                                    UiType uiType2 = challengeResponseData72.uiType;
                                    int i7 = uiType2 == null ? -1 : ChallengeFragment.WhenMappings.$EnumSwitchMapping$0[uiType2.ordinal()];
                                    if (i7 == -1 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) {
                                        return;
                                    }
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                default:
                                    challengeFragment.getViewModel$3ds2sdk_release().submit(ChallengeAction.Resend.INSTANCE);
                                    return;
                            }
                        }
                    });
                    getChallengeZoneView().setResendButtonClickListener(new View.OnClickListener(this) { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda12
                        public final /* synthetic */ ChallengeFragment f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = i2;
                            ChallengeFragment challengeFragment = this.f$0;
                            switch (i6) {
                                case 0:
                                    challengeFragment.getViewModel$3ds2sdk_release()._submitClicked.postValue(challengeFragment.getChallengeAction());
                                    return;
                                case 1:
                                    challengeFragment.getViewModel$3ds2sdk_release()._submitClicked.postValue(challengeFragment.getChallengeAction());
                                    ChallengeResponseData challengeResponseData72 = challengeFragment.cresData;
                                    if (challengeResponseData72 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                                        throw null;
                                    }
                                    UiType uiType2 = challengeResponseData72.uiType;
                                    int i7 = uiType2 == null ? -1 : ChallengeFragment.WhenMappings.$EnumSwitchMapping$0[uiType2.ordinal()];
                                    if (i7 == -1 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) {
                                        return;
                                    }
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return;
                                default:
                                    challengeFragment.getViewModel$3ds2sdk_release().submit(ChallengeAction.Resend.INSTANCE);
                                    return;
                            }
                        }
                    });
                    InformationZoneView informationZoneView2 = (InformationZoneView) getViewBinding$3ds2sdk_release().navBarHelpButton;
                    ChallengeResponseData challengeResponseData14 = this.cresData;
                    if (challengeResponseData14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        throw null;
                    }
                    informationZoneView2.setWhyInfo(challengeResponseData14.whyInfoLabel, challengeResponseData14.whyInfoText, labelCustomization2);
                    ChallengeResponseData challengeResponseData15 = this.cresData;
                    if (challengeResponseData15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                        throw null;
                    }
                    informationZoneView2.setExpandInfo(challengeResponseData15.expandInfoLabel, challengeResponseData15.expandInfoText, labelCustomization2);
                    String str2 = stripeUiCustomization.mAccentColor;
                    if (str2 != null) {
                        informationZoneView2.setToggleColor$3ds2sdk_release(Color.parseColor(str2));
                        return;
                    }
                    return;
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
