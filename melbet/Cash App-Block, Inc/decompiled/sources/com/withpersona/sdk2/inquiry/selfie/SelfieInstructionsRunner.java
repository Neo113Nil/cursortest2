package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.ColorUtils;
import androidx.lifecycle.ViewModelKt;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieInstructionsBinding;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import io.noties.markwon.MarkwonImpl;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;

/* loaded from: classes9.dex */
public final class SelfieInstructionsRunner implements LayoutRunner {
    public static final SandboxScreenRunner.Companion Companion = new SandboxScreenRunner.Companion(5);
    public final Pi2SelfieInstructionsBinding binding;
    public View currentInstructionAssetView;

    public SelfieInstructionsRunner(Pi2SelfieInstructionsBinding pi2SelfieInstructionsBinding) {
        pi2SelfieInstructionsBinding.getClass();
        this.binding = pi2SelfieInstructionsBinding;
        ScrollView scrollView = pi2SelfieInstructionsBinding.rootView;
        scrollView.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(scrollView, 15);
    }

    public final void showRendering(final SelfieWorkflow.Screen.InstructionsScreen instructionsScreen, SystemUiController systemUiController) {
        AppCompatActivity activity;
        int i;
        instructionsScreen.getClass();
        Pi2SelfieInstructionsBinding pi2SelfieInstructionsBinding = this.binding;
        ScrollView scrollView = pi2SelfieInstructionsBinding.rootView;
        Pi2NavigationBar pi2NavigationBar = pi2SelfieInstructionsBinding.navigationBar;
        TextView textView = pi2SelfieInstructionsBinding.textviewSelfieStartBody;
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2SelfieInstructionsBinding.instructionAnimation;
        TextView textView2 = pi2SelfieInstructionsBinding.textviewSelfieDisclosure;
        PersonaMaterialButton personaMaterialButton = pi2SelfieInstructionsBinding.startButton;
        TextView textView3 = pi2SelfieInstructionsBinding.textviewSelfieStartTitle;
        ImageView imageView = pi2SelfieInstructionsBinding.imageviewSelfieHeaderImage;
        ScrollView scrollView2 = pi2SelfieInstructionsBinding.rootView;
        Context context = scrollView.getContext();
        context.getClass();
        Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaStartSelfieHeaderImage);
        final int i2 = 0;
        if (resourceIdFromAttr$default != null) {
            imageView.setImageResource(resourceIdFromAttr$default.intValue());
            imageView.setVisibility(0);
        }
        String str = instructionsScreen.title;
        StepStyles.SelfieStepStyle selfieStepStyle = instructionsScreen.styles;
        textView3.setText(str);
        textView.setText(instructionsScreen.prompt);
        MarkwonImpl create = MarkwonImpl.create(textView2.getContext());
        create.setParsedMarkdown(textView2, create.toMarkdown(instructionsScreen.disclosure));
        personaMaterialButton.setText(instructionsScreen.start);
        personaMaterialButton.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(instructionsScreen, 24));
        NavigationState navigationState = instructionsScreen.navigationState;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SelfieWorkflow.Screen.InstructionsScreen instructionsScreen2 = instructionsScreen;
                switch (i3) {
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
        final int i3 = 1;
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieInstructionsRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                SelfieWorkflow.Screen.InstructionsScreen instructionsScreen2 = instructionsScreen;
                switch (i32) {
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
        scrollView2.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, scrollView2);
        Context context2 = scrollView2.getContext();
        context2.getClass();
        Integer resourceIdFromAttr$default2 = ResToolsKt.resourceIdFromAttr$default(context2, R.attr.personaInquirySelfieLottieRaw);
        RemoteImage remoteImage = instructionsScreen.instructionAsset;
        if (remoteImage != null) {
            if (this.currentInstructionAssetView == null) {
                this.currentInstructionAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, pi2SelfieInstructionsBinding.nestedUiContainer, false);
                themeableLottieAnimationView.setVisibility(8);
            }
        } else if (resourceIdFromAttr$default2 != null) {
            themeableLottieAnimationView.setAnimation(resourceIdFromAttr$default2.intValue());
            themeableLottieAnimationView.removeAllUpdateListeners();
        } else {
            SelfieType selfieType = instructionsScreen.selfieType;
            List list = instructionsScreen.orderedPoses;
            Pair pair = (Intrinsics.areEqual(selfieType, SelfieType.CenterOnly.INSTANCE) || list.size() == 1) ? new Pair(Integer.valueOf(R.raw.pi2_head_turning_center), "pi2_head_turning_center") : CollectionsKt.getOrNull(1, list) == Selfie.Pose.Right ? new Pair(Integer.valueOf(R.raw.pi2_head_turning_reversed), "pi2_head_turning_reversed") : new Pair(Integer.valueOf(R.raw.pi2_head_turning), "pi2_head_turning");
            int intValue = ((Number) pair.first).intValue();
            String str2 = (String) pair.second;
            Context context3 = themeableLottieAnimationView.getContext();
            if (context3 != null && (activity = ContextUtilsKt.getActivity(context3)) != null) {
                JobKt.launch$default(ViewModelKt.getCoroutineScope(activity.getLifecycle()), null, null, new SelfieInstructionsRunner$showRendering$1$4(pi2SelfieInstructionsBinding, intValue, instructionsScreen, str2, null), 3);
            }
            if (selfieStepStyle == null) {
                int parseColor = Color.parseColor("#022050");
                Context context4 = scrollView2.getContext();
                context4.getClass();
                themeableLottieAnimationView.addColorReplacement(parseColor, ResToolsKt.getColorFromAttr$default(context4, R.attr.colorPrimaryVariant));
                int parseColor2 = Color.parseColor("#AA85FF");
                Context context5 = scrollView2.getContext();
                context5.getClass();
                themeableLottieAnimationView.addColorReplacement(parseColor2, ResToolsKt.getColorFromAttr$default(context5, R.attr.colorSecondary));
                Context context6 = scrollView2.getContext();
                context6.getClass();
                int colorFromAttr$default = ResToolsKt.getColorFromAttr$default(context6, R.attr.colorSecondary);
                Context context7 = scrollView2.getContext();
                context7.getClass();
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#DBCCFF"), ColorUtils.blendARGB(0.66f, colorFromAttr$default, ResToolsKt.getColorFromAttr$default(context7, R.attr.colorSurface)));
            }
        }
        if (selfieStepStyle != null) {
            TextBasedComponentStyle titleStyleValue = selfieStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                i = 0;
                textView3.setPadding(textView3.getPaddingLeft(), 0, textView3.getPaddingRight(), 0);
                TextStylingKt.style(textView3, titleStyleValue, EmptySet.INSTANCE);
            } else {
                i = 0;
            }
            TextBasedComponentStyle textStyleValue = selfieStepStyle.getTextStyleValue();
            if (textStyleValue != null) {
                textView.setPadding(textView.getPaddingLeft(), i, textView.getPaddingRight(), i);
                TextStylingKt.style(textView, textStyleValue, EmptySet.INSTANCE);
            }
            TextBasedComponentStyle disclaimerStyleValue = selfieStepStyle.getDisclaimerStyleValue();
            if (disclaimerStyleValue != null) {
                textView2.setPadding(textView2.getPaddingLeft(), i, textView2.getPaddingRight(), i);
                TextStylingKt.style(textView2, disclaimerStyleValue, EmptySet.INSTANCE);
            }
            Integer backgroundColorValue = selfieStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int intValue2 = backgroundColorValue.intValue();
                scrollView2.setBackgroundColor(intValue2);
                if (systemUiController != null) {
                    Context context8 = scrollView2.getContext();
                    context8.getClass();
                    systemUiController.updateSystemUiColor(context8, intValue2);
                }
            }
            Context context9 = scrollView2.getContext();
            context9.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(selfieStepStyle, context9);
            if (backgroundImageDrawable != null) {
                scrollView2.setBackground(backgroundImageDrawable);
            }
            Integer headerButtonColorValue = selfieStepStyle.getHeaderButtonColorValue();
            if (headerButtonColorValue != null) {
                pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
            }
            ButtonSubmitComponentStyle buttonPrimaryStyleValue = selfieStepStyle.getButtonPrimaryStyleValue();
            if (buttonPrimaryStyleValue != null) {
                ButtonStylingKt.style$default(personaMaterialButton, buttonPrimaryStyleValue, false, false, 14);
            }
        }
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(Object obj, ViewEnvironment viewEnvironment) {
        viewEnvironment.getClass();
        showRendering((SelfieWorkflow.Screen.InstructionsScreen) obj, zzat.getSystemUiController(viewEnvironment));
    }
}
