package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fillr.home.adapter.FProfileHomeListViewAdapter;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieReviewCapturesBinding;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class SelfieReviewCapturesRunner implements LayoutRunner {
    public static final SandboxScreenRunner.Companion Companion = new SandboxScreenRunner.Companion(7);
    public final FProfileHomeListViewAdapter adapter;
    public final Pi2SelfieReviewCapturesBinding binding;
    public final GridAutoFitLayoutManager multiItemLayoutManager;
    public final LinearLayoutManager singleItemLayoutManager;

    public SelfieReviewCapturesRunner(Pi2SelfieReviewCapturesBinding pi2SelfieReviewCapturesBinding) {
        pi2SelfieReviewCapturesBinding.getClass();
        this.binding = pi2SelfieReviewCapturesBinding;
        FProfileHomeListViewAdapter fProfileHomeListViewAdapter = new FProfileHomeListViewAdapter(1);
        this.adapter = fProfileHomeListViewAdapter;
        ConstraintLayout constraintLayout = pi2SelfieReviewCapturesBinding.rootView;
        this.singleItemLayoutManager = new LinearLayoutManager(constraintLayout.getContext());
        Context context = constraintLayout.getContext();
        context.getClass();
        this.multiItemLayoutManager = new GridAutoFitLayoutManager(context, constraintLayout.getContext().getResources().getDimensionPixelSize(R.dimen.pi2_review_captures_min_column_width));
        RecyclerView recyclerView = pi2SelfieReviewCapturesBinding.recyclerView;
        recyclerView.setAdapter(fProfileHomeListViewAdapter);
        recyclerView.setHasFixedSize(true);
        constraintLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(constraintLayout, 15);
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(final SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen, ViewEnvironment viewEnvironment) {
        StepStyles.StepCancelButtonComponentStyleContainer base;
        ButtonCancelComponentStyle base2;
        reviewCapturesScreen.getClass();
        viewEnvironment.getClass();
        ArrayList arrayList = reviewCapturesScreen.selfies;
        SelfieWorkflow.Screen.ReviewCapturesScreen.Strings strings = reviewCapturesScreen.strings;
        int size = arrayList.size();
        Pi2SelfieReviewCapturesBinding pi2SelfieReviewCapturesBinding = this.binding;
        final int i = 1;
        if (size <= 1) {
            pi2SelfieReviewCapturesBinding.recyclerView.setLayoutManager(this.singleItemLayoutManager);
        } else {
            pi2SelfieReviewCapturesBinding.recyclerView.setLayoutManager(this.multiItemLayoutManager);
        }
        TextView textView = pi2SelfieReviewCapturesBinding.title;
        Pi2NavigationBar pi2NavigationBar = pi2SelfieReviewCapturesBinding.navigationBar;
        TextView textView2 = pi2SelfieReviewCapturesBinding.body;
        PersonaMaterialButton personaMaterialButton = pi2SelfieReviewCapturesBinding.usePhotosButton;
        PersonaMaterialButton personaMaterialButton2 = pi2SelfieReviewCapturesBinding.retakeButton;
        ConstraintLayout constraintLayout = pi2SelfieReviewCapturesBinding.rootView;
        ExtensionsKt.setMarkdown(textView, strings.title);
        ExtensionsKt.setMarkdown(textView2, strings.description);
        personaMaterialButton.setText(strings.submitButton);
        final int i2 = 0;
        personaMaterialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen2 = reviewCapturesScreen;
                switch (i3) {
                    case 0:
                        reviewCapturesScreen2.onUsePhotos.invoke();
                        break;
                    default:
                        reviewCapturesScreen2.onRetakePhotos.invoke();
                        break;
                }
            }
        });
        personaMaterialButton2.setText(strings.retakeButton);
        personaMaterialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen2 = reviewCapturesScreen;
                switch (i3) {
                    case 0:
                        reviewCapturesScreen2.onUsePhotos.invoke();
                        break;
                    default:
                        reviewCapturesScreen2.onRetakePhotos.invoke();
                        break;
                }
            }
        });
        StepStyles.SelfieStepStyle selfieStepStyle = reviewCapturesScreen.styles;
        FProfileHomeListViewAdapter fProfileHomeListViewAdapter = this.adapter;
        if (selfieStepStyle != null) {
            TextBasedComponentStyle titleStyleValue = selfieStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                TextView textView3 = pi2SelfieReviewCapturesBinding.title;
                textView3.setPadding(textView3.getPaddingLeft(), 0, textView3.getPaddingRight(), 0);
                TextStylingKt.style(textView3, titleStyleValue, EmptySet.INSTANCE);
            }
            TextBasedComponentStyle textStyleValue = selfieStepStyle.getTextStyleValue();
            if (textStyleValue != null) {
                textView2.setPadding(textView2.getPaddingLeft(), 0, textView2.getPaddingRight(), 0);
                TextStylingKt.style(textView2, textStyleValue, EmptySet.INSTANCE);
                fProfileHomeListViewAdapter.getClass();
                fProfileHomeListViewAdapter.inflater = textStyleValue;
                fProfileHomeListViewAdapter.refreshItems();
            }
            Integer backgroundColorValue = selfieStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int intValue = backgroundColorValue.intValue();
                constraintLayout.setBackgroundColor(intValue);
                Context context = constraintLayout.getContext();
                context.getClass();
                zzat.updateSystemUiColor(viewEnvironment, context, intValue);
            }
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(selfieStepStyle, context2);
            if (backgroundImageDrawable != null) {
                constraintLayout.setBackground(backgroundImageDrawable);
            }
            Integer headerButtonColorValue = selfieStepStyle.getHeaderButtonColorValue();
            if (headerButtonColorValue != null) {
                pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
            }
            ButtonSubmitComponentStyle buttonPrimaryStyleValue = selfieStepStyle.getButtonPrimaryStyleValue();
            if (buttonPrimaryStyleValue != null) {
                ButtonStylingKt.style$default(personaMaterialButton, buttonPrimaryStyleValue, false, false, 14);
            }
            StepStyles.StepSecondaryButtonComponentStyle buttonSecondaryStyle = selfieStepStyle.getButtonSecondaryStyle();
            if (buttonSecondaryStyle != null && (base = buttonSecondaryStyle.getBase()) != null && (base2 = base.getBase()) != null) {
                ButtonStylingKt.style$default(personaMaterialButton2, base2, false, false, 14);
            }
            Integer headerButtonColorValue2 = selfieStepStyle.getHeaderButtonColorValue();
            if (headerButtonColorValue2 != null) {
                pi2NavigationBar.setControlsColor(headerButtonColorValue2.intValue());
            }
        }
        fProfileHomeListViewAdapter.getClass();
        fProfileHomeListViewAdapter.mContext = strings;
        fProfileHomeListViewAdapter.refreshItems();
        fProfileHomeListViewAdapter.elements = arrayList;
        fProfileHomeListViewAdapter.refreshItems();
        NavigationState navigationState = reviewCapturesScreen.navigationState;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen2 = reviewCapturesScreen;
                switch (i3) {
                    case 0:
                        reviewCapturesScreen2.onBack.invoke();
                        break;
                    default:
                        reviewCapturesScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                SelfieWorkflow.Screen.ReviewCapturesScreen reviewCapturesScreen2 = reviewCapturesScreen;
                switch (i3) {
                    case 0:
                        reviewCapturesScreen2.onBack.invoke();
                        break;
                    default:
                        reviewCapturesScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        constraintLayout.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, constraintLayout);
    }
}
