package com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.material.sidesheet.LeftSheetDelegate;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidReviewSelectedImageBinding;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import java.io.File;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class ReviewSelectedImageScreenRunner implements LayoutRunner {
    public final Pi2GovernmentidReviewSelectedImageBinding binding;

    static {
        int i = ReviewSelectedImageScreenRunner$Companion$1.$r8$clinit;
        int i2 = ReviewSelectedImageScreenRunner$Companion$2.$r8$clinit;
        Reflection.factory.getOrCreateKotlinClass(Screen.ReviewSelectedImageScreen.class);
    }

    public ReviewSelectedImageScreenRunner(Pi2GovernmentidReviewSelectedImageBinding pi2GovernmentidReviewSelectedImageBinding) {
        pi2GovernmentidReviewSelectedImageBinding.getClass();
        this.binding = pi2GovernmentidReviewSelectedImageBinding;
        CoordinatorLayout coordinatorLayout = pi2GovernmentidReviewSelectedImageBinding.rootView;
        coordinatorLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(coordinatorLayout, 15);
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(final Screen.ReviewSelectedImageScreen reviewSelectedImageScreen, ViewEnvironment viewEnvironment) {
        reviewSelectedImageScreen.getClass();
        viewEnvironment.getClass();
        Pi2GovernmentidReviewSelectedImageBinding pi2GovernmentidReviewSelectedImageBinding = this.binding;
        TextView textView = pi2GovernmentidReviewSelectedImageBinding.title;
        Pi2NavigationBar pi2NavigationBar = pi2GovernmentidReviewSelectedImageBinding.navigationBar;
        CoordinatorLayout coordinatorLayout = pi2GovernmentidReviewSelectedImageBinding.rootView;
        TextView textView2 = pi2GovernmentidReviewSelectedImageBinding.fileNameTextview;
        textView.setText(reviewSelectedImageScreen.title);
        TextView textView3 = pi2GovernmentidReviewSelectedImageBinding.body;
        textView3.setText(reviewSelectedImageScreen.body);
        ButtonWithLoadingIndicator buttonWithLoadingIndicator = pi2GovernmentidReviewSelectedImageBinding.usePhotoButton;
        buttonWithLoadingIndicator.setText(reviewSelectedImageScreen.confirmButtonText);
        final int i = 0;
        buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ReviewSelectedImageScreenRunner$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                Screen.ReviewSelectedImageScreen reviewSelectedImageScreen2 = reviewSelectedImageScreen;
                switch (i2) {
                    case 0:
                        reviewSelectedImageScreen2.onUsePhotoClick.invoke();
                        break;
                    default:
                        reviewSelectedImageScreen2.onChooseNewPhotoClick.invoke();
                        break;
                }
            }
        });
        PersonaMaterialButton personaMaterialButton = pi2GovernmentidReviewSelectedImageBinding.chooseNewPhotoButton;
        personaMaterialButton.setText(reviewSelectedImageScreen.chooseNewPhotoText);
        final int i2 = 1;
        personaMaterialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ReviewSelectedImageScreenRunner$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                Screen.ReviewSelectedImageScreen reviewSelectedImageScreen2 = reviewSelectedImageScreen;
                switch (i22) {
                    case 0:
                        reviewSelectedImageScreen2.onUsePhotoClick.invoke();
                        break;
                    default:
                        reviewSelectedImageScreen2.onChooseNewPhotoClick.invoke();
                        break;
                }
            }
        });
        String str = reviewSelectedImageScreen.fileToReviewPath;
        File file = new File(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        boolean startsWith = StringsKt__StringsJVMKt.startsWith(reviewSelectedImageScreen.fileMimeType, "image/", false);
        ImageView imageView = pi2GovernmentidReviewSelectedImageBinding.imageView;
        if (startsWith) {
            RealImageLoader realImageLoader = reviewSelectedImageScreen.imageLoader;
            ImageRequest.Builder builder = new ImageRequest.Builder(imageView.getContext());
            builder.data = file;
            ImageRequests_androidKt.target(builder, imageView);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setSize(options.outWidth, options.outHeight);
            gradientDrawable.setColor(0);
            builder.placeholder(Image_androidKt.asImage(gradientDrawable));
            realImageLoader.enqueue(builder.build());
        } else {
            imageView.setVisibility(8);
            pi2GovernmentidReviewSelectedImageBinding.fileIcon.setVisibility(0);
            textView2.setVisibility(0);
            textView2.setText(reviewSelectedImageScreen.fileName);
        }
        NavigationState navigationState = reviewSelectedImageScreen.navigationState;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ReviewSelectedImageScreenRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                Screen.ReviewSelectedImageScreen reviewSelectedImageScreen2 = reviewSelectedImageScreen;
                switch (i3) {
                    case 0:
                        reviewSelectedImageScreen2.onBack.invoke();
                        break;
                    default:
                        reviewSelectedImageScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ReviewSelectedImageScreenRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                Screen.ReviewSelectedImageScreen reviewSelectedImageScreen2 = reviewSelectedImageScreen;
                switch (i3) {
                    case 0:
                        reviewSelectedImageScreen2.onBack.invoke();
                        break;
                    default:
                        reviewSelectedImageScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        coordinatorLayout.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout);
        buttonWithLoadingIndicator.setIsLoading(reviewSelectedImageScreen.isAutoClassifying);
        coordinatorLayout.getClass();
        LeftSheetDelegate.renderErrorSnackbarIfNeeded(coordinatorLayout, reviewSelectedImageScreen.error, reviewSelectedImageScreen.onErrorDismissed, null, 2, 0);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = reviewSelectedImageScreen.styles;
        if (governmentIdStepStyle != null) {
            coordinatorLayout.getClass();
            TextView textView4 = pi2GovernmentidReviewSelectedImageBinding.title;
            Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int intValue = backgroundColorValue.intValue();
                coordinatorLayout.setBackgroundColor(intValue);
                Context context = coordinatorLayout.getContext();
                context.getClass();
                zzat.updateSystemUiColor(viewEnvironment, context, intValue);
            }
            Context context2 = coordinatorLayout.getContext();
            context2.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle, context2);
            if (backgroundImageDrawable != null) {
                coordinatorLayout.setBackground(backgroundImageDrawable);
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
                TextStylingKt.style(textView3, textStyleValue, EmptySet.INSTANCE);
            }
            ButtonSubmitComponentStyle buttonPrimaryStyleValue = governmentIdStepStyle.getButtonPrimaryStyleValue();
            if (buttonPrimaryStyleValue != null) {
                ButtonStylingKt.style$default(buttonWithLoadingIndicator, buttonPrimaryStyleValue);
            }
            ButtonCancelComponentStyle buttonSecondaryStyleValue = governmentIdStepStyle.getButtonSecondaryStyleValue();
            if (buttonSecondaryStyleValue != null) {
                ButtonStylingKt.style$default(personaMaterialButton, buttonSecondaryStyleValue, false, false, 14);
            }
        }
    }
}
