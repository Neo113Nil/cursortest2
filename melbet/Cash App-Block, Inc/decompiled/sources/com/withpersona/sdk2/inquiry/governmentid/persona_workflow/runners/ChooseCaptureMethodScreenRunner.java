package com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import coil3.size.DimensionKt;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidChooseCaptureMethodBinding;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class ChooseCaptureMethodScreenRunner implements LayoutRunner {
    public final Pi2GovernmentidChooseCaptureMethodBinding binding;
    public View currentPictographAssetView;

    static {
        int i = ChooseCaptureMethodScreenRunner$Companion$1.$r8$clinit;
        int i2 = ChooseCaptureMethodScreenRunner$Companion$2.$r8$clinit;
        Reflection.factory.getOrCreateKotlinClass(Screen.ChooseCaptureMethodScreen.class);
    }

    public ChooseCaptureMethodScreenRunner(Pi2GovernmentidChooseCaptureMethodBinding pi2GovernmentidChooseCaptureMethodBinding) {
        pi2GovernmentidChooseCaptureMethodBinding.getClass();
        this.binding = pi2GovernmentidChooseCaptureMethodBinding;
        CoordinatorLayout coordinatorLayout = pi2GovernmentidChooseCaptureMethodBinding.rootView;
        coordinatorLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(coordinatorLayout, 15);
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(final Screen.ChooseCaptureMethodScreen chooseCaptureMethodScreen, ViewEnvironment viewEnvironment) {
        chooseCaptureMethodScreen.getClass();
        viewEnvironment.getClass();
        Pi2GovernmentidChooseCaptureMethodBinding pi2GovernmentidChooseCaptureMethodBinding = this.binding;
        CoordinatorLayout coordinatorLayout = pi2GovernmentidChooseCaptureMethodBinding.rootView;
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidChooseCaptureMethodBinding.idImage;
        Pi2NavigationBar pi2NavigationBar = pi2GovernmentidChooseCaptureMethodBinding.navigationBar;
        CoordinatorLayout coordinatorLayout2 = pi2GovernmentidChooseCaptureMethodBinding.rootView;
        PersonaMaterialButton personaMaterialButton = pi2GovernmentidChooseCaptureMethodBinding.uploadButton;
        PersonaMaterialButton personaMaterialButton2 = pi2GovernmentidChooseCaptureMethodBinding.cameraButton;
        Context context = coordinatorLayout.getContext();
        TextView textView = pi2GovernmentidChooseCaptureMethodBinding.title;
        String str = chooseCaptureMethodScreen.title;
        String str2 = chooseCaptureMethodScreen.cameraText;
        textView.setText(str);
        TextView textView2 = pi2GovernmentidChooseCaptureMethodBinding.body;
        textView2.setText(chooseCaptureMethodScreen.body);
        List list = chooseCaptureMethodScreen.captureOptions;
        final int i = 0;
        if (list.contains(CaptureOptionNativeMobile.MOBILE_CAMERA)) {
            if (StringsKt.isBlank(str2)) {
                personaMaterialButton2.setText((CharSequence) null);
                personaMaterialButton2.setIcon(DimensionKt.getDrawable(context, R.drawable.pi2_governmentid_cameraicon));
            } else {
                personaMaterialButton2.setText(str2);
                personaMaterialButton2.setIcon(null);
            }
            personaMaterialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ChooseCaptureMethodScreenRunner$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    Screen.ChooseCaptureMethodScreen chooseCaptureMethodScreen2 = chooseCaptureMethodScreen;
                    switch (i2) {
                        case 0:
                            chooseCaptureMethodScreen2.onCameraCaptureClick.invoke();
                            break;
                        default:
                            chooseCaptureMethodScreen2.onUploadClick.invoke();
                            break;
                    }
                }
            });
        }
        boolean contains = list.contains(CaptureOptionNativeMobile.UPLOAD);
        final int i2 = 1;
        if (contains) {
            personaMaterialButton.setText(chooseCaptureMethodScreen.uploadButtonText);
            personaMaterialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ChooseCaptureMethodScreenRunner$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i2;
                    Screen.ChooseCaptureMethodScreen chooseCaptureMethodScreen2 = chooseCaptureMethodScreen;
                    switch (i22) {
                        case 0:
                            chooseCaptureMethodScreen2.onCameraCaptureClick.invoke();
                            break;
                        default:
                            chooseCaptureMethodScreen2.onUploadClick.invoke();
                            break;
                    }
                }
            });
        }
        NavigationState navigationState = chooseCaptureMethodScreen.navigationState;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ChooseCaptureMethodScreenRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                Screen.ChooseCaptureMethodScreen chooseCaptureMethodScreen2 = chooseCaptureMethodScreen;
                switch (i3) {
                    case 0:
                        chooseCaptureMethodScreen2.onBack.invoke();
                        break;
                    default:
                        chooseCaptureMethodScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ChooseCaptureMethodScreenRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                Screen.ChooseCaptureMethodScreen chooseCaptureMethodScreen2 = chooseCaptureMethodScreen;
                switch (i3) {
                    case 0:
                        chooseCaptureMethodScreen2.onBack.invoke();
                        break;
                    default:
                        chooseCaptureMethodScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        coordinatorLayout2.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout2);
        coordinatorLayout2.getClass();
        LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout2, chooseCaptureMethodScreen.error, chooseCaptureMethodScreen.onErrorDismissed, null, 2, 0);
        RemoteImage remoteImage = chooseCaptureMethodScreen.pictographAsset;
        if (remoteImage == null) {
            themeableLottieAnimationView.setAnimation(chooseCaptureMethodScreen.localAsset);
        } else if (this.currentPictographAssetView == null) {
            this.currentPictographAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, pi2GovernmentidChooseCaptureMethodBinding.imageViewContainer, false);
            pi2GovernmentidChooseCaptureMethodBinding.localImage.setVisibility(8);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = chooseCaptureMethodScreen.styles;
        if (governmentIdStepStyle != null) {
            coordinatorLayout2.getClass();
            View view = pi2GovernmentidChooseCaptureMethodBinding.idImageContainer;
            Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int intValue = backgroundColorValue.intValue();
                coordinatorLayout2.setBackgroundColor(intValue);
                Context context2 = coordinatorLayout2.getContext();
                context2.getClass();
                zzat.updateSystemUiColor(viewEnvironment, context2, intValue);
            }
            Context context3 = coordinatorLayout2.getContext();
            context3.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle, context3);
            if (backgroundImageDrawable != null) {
                coordinatorLayout2.setBackground(backgroundImageDrawable);
            }
            Integer headerButtonColorValue = governmentIdStepStyle.getHeaderButtonColorValue();
            if (headerButtonColorValue != null) {
                pi2NavigationBar.setControlsColor(headerButtonColorValue.intValue());
            }
            TextBasedComponentStyle titleStyleValue = governmentIdStepStyle.getTitleStyleValue();
            if (titleStyleValue != null) {
                TextStylingKt.style(textView, titleStyleValue, EmptySet.INSTANCE);
            }
            TextBasedComponentStyle textStyleValue = governmentIdStepStyle.getTextStyleValue();
            if (textStyleValue != null) {
                TextStylingKt.style(textView2, textStyleValue, EmptySet.INSTANCE);
            }
            ButtonSubmitComponentStyle buttonPrimaryStyleValue = governmentIdStepStyle.getButtonPrimaryStyleValue();
            if (buttonPrimaryStyleValue != null) {
                ButtonStylingKt.style$default(personaMaterialButton2, buttonPrimaryStyleValue, false, false, 14);
            }
            ButtonCancelComponentStyle buttonSecondaryStyleValue = governmentIdStepStyle.getButtonSecondaryStyleValue();
            if (buttonSecondaryStyleValue != null) {
                ButtonStylingKt.style$default(personaMaterialButton, buttonSecondaryStyleValue, false, false, 14);
            }
            Integer fillColorValue = governmentIdStepStyle.getFillColorValue();
            if (fillColorValue != null) {
                view.setBackground(new ColorDrawable(fillColorValue.intValue()));
            }
            ImageStylingKt.replaceColors(themeableLottieAnimationView, governmentIdStepStyle.getStrokeColorValue(), governmentIdStepStyle.getFillColorValue(), null, null, new String[]{"#000000", "#190052", "#190051"}, new String[]{"#8751FF", "#AA85FF", "#AA84FF"}, new String[0], new String[0]);
        }
    }
}
