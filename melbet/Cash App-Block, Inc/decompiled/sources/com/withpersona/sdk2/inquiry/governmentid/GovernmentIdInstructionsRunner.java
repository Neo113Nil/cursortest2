package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.we$$ExternalSyntheticLambda0;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.integrity.internal.ah;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidInstructionsBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class GovernmentIdInstructionsRunner implements LayoutRunner {
    public static final SandboxScreenRunner.Companion Companion = new SandboxScreenRunner.Companion(3);
    public final Pi2GovernmentidInstructionsBinding binding;
    public final DividerItemDecoration dividerItemDecoration;
    public final RecyclerView recyclerView;
    public final boolean shouldHideSeparators;

    public GovernmentIdInstructionsRunner(Pi2GovernmentidInstructionsBinding pi2GovernmentidInstructionsBinding) {
        pi2GovernmentidInstructionsBinding.getClass();
        this.binding = pi2GovernmentidInstructionsBinding;
        CoordinatorLayout coordinatorLayout = pi2GovernmentidInstructionsBinding.rootView;
        Context context = coordinatorLayout.getContext();
        context.getClass();
        boolean boolFromAttr$default = ResToolsKt.boolFromAttr$default(context, R.attr.personaHideSeparators);
        this.shouldHideSeparators = boolFromAttr$default;
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(coordinatorLayout.getContext());
        this.dividerItemDecoration = dividerItemDecoration;
        RecyclerView recyclerView = pi2GovernmentidInstructionsBinding.recyclerviewGovernmentidIdlist;
        recyclerView.setLayoutManager(new LinearLayoutManager(coordinatorLayout.getContext()));
        if (!boolFromAttr$default) {
            recyclerView.addItemDecoration(dividerItemDecoration);
        }
        this.recyclerView = recyclerView;
        coordinatorLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(coordinatorLayout, 15);
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(final Screen.InstructionsScreen instructionsScreen, ViewEnvironment viewEnvironment) {
        GovernmentIdListAdapter governmentIdListAdapter;
        instructionsScreen.getClass();
        viewEnvironment.getClass();
        Pi2GovernmentidInstructionsBinding pi2GovernmentidInstructionsBinding = this.binding;
        CoordinatorLayout coordinatorLayout = pi2GovernmentidInstructionsBinding.rootView;
        View view = pi2GovernmentidInstructionsBinding.listDivider;
        TextView textView = pi2GovernmentidInstructionsBinding.textviewGovernmentidInstructionsDisclaimer;
        TextView textView2 = pi2GovernmentidInstructionsBinding.textviewGovernmentidInstructionslistheader;
        TextView textView3 = pi2GovernmentidInstructionsBinding.textviewGovernmentidInstructionsBody;
        Pi2NavigationBar pi2NavigationBar = pi2GovernmentidInstructionsBinding.navigationBar;
        ConstraintLayout constraintLayout = pi2GovernmentidInstructionsBinding.governmentidHeaderImageContainer;
        TextView textView4 = pi2GovernmentidInstructionsBinding.textviewGovernmentidInstructionsTitle;
        ImageView imageView = pi2GovernmentidInstructionsBinding.imageviewGovernmentidHeaderImage;
        CoordinatorLayout coordinatorLayout2 = pi2GovernmentidInstructionsBinding.rootView;
        Context context = coordinatorLayout.getContext();
        context.getClass();
        Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaGovIdSelectHeaderImage);
        NextStep.GovernmentId.AssetConfig.SelectPage selectPage = instructionsScreen.assetConfig;
        String str = instructionsScreen.disclaimer;
        RemoteImage headerPictograph = selectPage != null ? selectPage.getHeaderPictograph() : null;
        if (resourceIdFromAttr$default != null) {
            imageView.setImageResource(resourceIdFromAttr$default.intValue());
            ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
            if (layoutParams == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            textView4.setLayoutParams(marginLayoutParams);
            constraintLayout.setVisibility(8);
            imageView.setVisibility(0);
        } else if (headerPictograph != null) {
            RemoteImageUtilsKt.renderToContainer(headerPictograph, constraintLayout, false);
            constraintLayout.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            constraintLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        textView4.setText(instructionsScreen.title);
        String str2 = instructionsScreen.prompt;
        if (StringsKt.isBlank(str2)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(str2);
        }
        String str3 = instructionsScreen.chooseText;
        if (StringsKt.isBlank(str3)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str3);
        }
        if (StringsKt.isBlank(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        if (!StringsKt.isBlank(str)) {
            pi2NavigationBar.setAccessibilityTraversalAfter(R.id.textview_governmentid_instructions_disclaimer);
        }
        view.setVisibility(this.shouldHideSeparators ? 8 : 0);
        RecyclerView recyclerView = this.recyclerView;
        RecyclerView.Adapter adapter = recyclerView.mAdapter;
        GovernmentIdListAdapter governmentIdListAdapter2 = adapter instanceof GovernmentIdListAdapter ? (GovernmentIdListAdapter) adapter : null;
        if (governmentIdListAdapter2 == null) {
            Context context2 = coordinatorLayout2.getContext();
            context2.getClass();
            governmentIdListAdapter = new GovernmentIdListAdapter(context2, instructionsScreen.enabledIdClasses, instructionsScreen.styles, instructionsScreen.assetConfig, instructionsScreen.iconStyle, new HCaptcha$$ExternalSyntheticLambda2(instructionsScreen, 15));
        } else {
            governmentIdListAdapter = governmentIdListAdapter2;
        }
        if (recyclerView.mAdapter == null) {
            recyclerView.setAdapter(governmentIdListAdapter);
        }
        boolean z = instructionsScreen.isEnabled;
        if (governmentIdListAdapter.isEnabled != z) {
            governmentIdListAdapter.isEnabled = z;
            governmentIdListAdapter.notifyDataSetChanged();
        }
        NavigationState navigationState = instructionsScreen.navigationState;
        final int i = 0;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Screen.InstructionsScreen instructionsScreen2 = instructionsScreen;
                switch (i2) {
                    case 0:
                        instructionsScreen2.onBack.invoke();
                        break;
                    default:
                        instructionsScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i2 = 1;
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdInstructionsRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Screen.InstructionsScreen instructionsScreen2 = instructionsScreen;
                switch (i22) {
                    case 0:
                        instructionsScreen2.onBack.invoke();
                        break;
                    default:
                        instructionsScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        coordinatorLayout2.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout2);
        coordinatorLayout2.getClass();
        LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout2, instructionsScreen.error, instructionsScreen.onErrorDismissed, null, 2, 0);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = instructionsScreen.styles;
        if (governmentIdStepStyle != null) {
            Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int intValue = backgroundColorValue.intValue();
                coordinatorLayout2.setBackgroundColor(intValue);
                Context context3 = coordinatorLayout2.getContext();
                context3.getClass();
                zzat.updateSystemUiColor(viewEnvironment, context3, intValue);
            }
            Context context4 = coordinatorLayout2.getContext();
            context4.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle, context4);
            if (backgroundImageDrawable != null) {
                coordinatorLayout2.setBackground(backgroundImageDrawable);
            }
            Integer headerButtonColorValue = governmentIdStepStyle.getHeaderButtonColorValue();
            if (headerButtonColorValue != null) {
                pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
            }
            TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                TextStylingKt.style(textView4, titleStyleValue, EmptySet.INSTANCE);
            }
            TextBasedComponentStyle textStyleValue = governmentIdStepStyle.getTextStyleValue();
            if (textStyleValue != null) {
                EmptySet emptySet = EmptySet.INSTANCE;
                TextStylingKt.style(textView3, textStyleValue, emptySet);
                TextStylingKt.style(textView2, textStyleValue, emptySet);
            }
            TextBasedComponentStyle disclaimerStyleValue = governmentIdStepStyle.getDisclaimerStyleValue();
            if (disclaimerStyleValue != null) {
                TextStylingKt.style(textView, disclaimerStyleValue, EmptySet.INSTANCE);
            }
            Integer governmentIdSelectOptionBorderColorValue = governmentIdStepStyle.getGovernmentIdSelectOptionBorderColorValue();
            DividerItemDecoration dividerItemDecoration = this.dividerItemDecoration;
            if (governmentIdSelectOptionBorderColorValue != null) {
                int intValue2 = governmentIdSelectOptionBorderColorValue.intValue();
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{intValue2, intValue2});
                gradientDrawable.setSize((int) Math.ceil(ExtensionsKt.getDpToPx(1.0d)), (int) Math.ceil(ExtensionsKt.getDpToPx(1.0d)));
                dividerItemDecoration.mDivider = gradientDrawable;
                view.setBackgroundColor(intValue2);
            }
            Double governmentIdOptionBorderWidthValue = governmentIdStepStyle.getGovernmentIdOptionBorderWidthValue();
            if (governmentIdOptionBorderWidthValue != null) {
                double doubleValue = governmentIdOptionBorderWidthValue.doubleValue();
                GradientDrawable gradientDrawable2 = (GradientDrawable) dividerItemDecoration.mDivider;
                if (gradientDrawable2 != null) {
                    gradientDrawable2.setSize((int) Math.ceil(ExtensionsKt.getDpToPx(doubleValue)), (int) Math.ceil(ExtensionsKt.getDpToPx(doubleValue)));
                }
                ah.addOneShotPreDrawListenerAndDiscardFrame(view, new we$$ExternalSyntheticLambda0(this, doubleValue));
            }
        }
    }
}
