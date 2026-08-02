package com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.zzai;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.widget.recycler.CashRecyclerView$observer$1;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import com.stripe.hcaptcha.task.Task$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationHelpBottomSheetBinding;
import com.withpersona.sdk2.inquiry.shared.ui.BottomSheetUtilsKt$setup$1;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda3;
import com.withpersona.sdk2.inquiry.steps.ui.styling.BottomSheetStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStyleElements;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex$$ExternalSyntheticLambda1;
import okhttp3.FormBody;
import okio.ForwardingFileSystem$$ExternalSyntheticLambda0;
import papa.Choreographers$$ExternalSyntheticLambda1;
import sqip.internal.BaseCardEntryActivity$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class HelpBottomSheetController {
    public final ViewGroup contentView;
    public boolean isShowing;
    public final Lazy lazyBinding;
    public boolean setup;

    public HelpBottomSheetController(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.contentView = viewGroup;
        this.lazyBinding = LazyKt.lazy(new Choreographers$$ExternalSyntheticLambda1(this, 7));
    }

    public final boolean close(Function0 function0) {
        if (!this.lazyBinding.isInitialized()) {
            return false;
        }
        BottomSheetBehavior from = BottomSheetBehavior.from(getBinding().bottomSheet);
        from.addBottomSheetCallback(new BottomSheetUtilsKt$setup$1(1, function0, from));
        if (from.state == 5) {
            return false;
        }
        from.setState(5);
        return true;
    }

    public final Pi2NavigationHelpBottomSheetBinding getBinding() {
        return (Pi2NavigationHelpBottomSheetBinding) this.lazyBinding.getValue();
    }

    public final void setShowing(boolean z) {
        this.isShowing = z;
        Pi2NavigationHelpBottomSheetBinding binding = getBinding();
        if (binding == null) {
            return;
        }
        boolean z2 = this.isShowing;
        FrameLayout frameLayout = binding.rootView;
        if (z2) {
            frameLayout.getClass();
            BackPressHandlerKt.setBackPressedHandler(frameLayout, new Choreographers$$ExternalSyntheticLambda1(binding, 8));
        } else {
            frameLayout.getClass();
            BackPressHandlerKt.setBackPressedHandler(frameLayout, null);
        }
    }

    public final void show(StepStyles.UiStepStyle uiStepStyle, HelpBottomSheetViewModel helpBottomSheetViewModel, Function0 function0, final Function0 function02, final Function0 function03) {
        ButtonSubmitComponentStyle secondaryButtonStyle;
        ButtonSubmitComponentStyle launchButtonStyle;
        StepStyles.UiStepTitleComponentStyle titleStyle;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        Integer fillColorValue;
        Integer strokeColorValue;
        helpBottomSheetViewModel.getClass();
        final int i = 0;
        final int i2 = 1;
        if (!this.setup) {
            this.setup = true;
            BottomSheetBehavior from = BottomSheetBehavior.from(getBinding().bottomSheet);
            from.updateImportantForAccessibilityOnSiblings = true;
            zzbk.setup(from, new Regex$$ExternalSyntheticLambda1(19, this, function0), getBinding().bottomSheet, getBinding().bottomSheetContent, getBinding().tintScreen);
            getBinding().actionButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetController$$ExternalSyntheticLambda7
                public final /* synthetic */ HelpBottomSheetController f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    Function0 function04 = function02;
                    HelpBottomSheetController helpBottomSheetController = this.f$0;
                    switch (i3) {
                        case 0:
                            helpBottomSheetController.close(new AlertBannerKt$$ExternalSyntheticLambda2(25, function04));
                            break;
                        default:
                            helpBottomSheetController.close(new AlertBannerKt$$ExternalSyntheticLambda2(26, function04));
                            break;
                    }
                }
            });
            getBinding().secondaryActionButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet.HelpBottomSheetController$$ExternalSyntheticLambda7
                public final /* synthetic */ HelpBottomSheetController f$0;

                {
                    this.f$0 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    Function0 function04 = function03;
                    HelpBottomSheetController helpBottomSheetController = this.f$0;
                    switch (i3) {
                        case 0:
                            helpBottomSheetController.close(new AlertBannerKt$$ExternalSyntheticLambda2(25, function04));
                            break;
                        default:
                            helpBottomSheetController.close(new AlertBannerKt$$ExternalSyntheticLambda2(26, function04));
                            break;
                    }
                }
            });
            getBinding().tintScreen.setOnClickListener(new UiStepBottomSheet$$ExternalSyntheticLambda3(from, 6));
        }
        setShowing(true);
        HelpBottomSheetComponentStyle helpBottomSheetComponentStyle = helpBottomSheetViewModel.componentStyle;
        HelpPagerAdapter helpPagerAdapter = new HelpPagerAdapter(helpBottomSheetComponentStyle);
        ArrayList arrayList = helpBottomSheetViewModel.tips;
        zzai zzaiVar = helpPagerAdapter.adapterHelper;
        zzai.setItems$default(zzaiVar, arrayList, helpPagerAdapter);
        getBinding().viewPager.setAdapter(helpPagerAdapter);
        Pi2DotsTabIndicator pi2DotsTabIndicator = getBinding().dotsIndicator;
        if (((AsyncListDiffer) zzaiVar.zza).mReadOnlyList.size() > 1) {
            pi2DotsTabIndicator.setVisibility(0);
        } else {
            pi2DotsTabIndicator.setVisibility(8);
        }
        if (uiStepStyle != null && (strokeColorValue = uiStepStyle.getStrokeColorValue()) != null) {
            pi2DotsTabIndicator.setSelectedDotColor(strokeColorValue.intValue());
        }
        if (uiStepStyle != null && (fillColorValue = uiStepStyle.getFillColorValue()) != null) {
            pi2DotsTabIndicator.setDotsColor(fillColorValue.intValue());
        }
        ViewPager2 viewPager2 = getBinding().viewPager;
        RecyclerView.Adapter adapter = viewPager2.mRecyclerView.mAdapter;
        if (adapter == null) {
            a$$ExternalSyntheticBUOutline0.m$1("View pager has no adapter. Please set the adapter on the view pager before calling attach.");
            return;
        }
        adapter.registerAdapterDataObserver(new CashRecyclerView$observer$1(new Choreographers$$ExternalSyntheticLambda1(pi2DotsTabIndicator, 2), 4));
        FormBody.Builder builder = new FormBody.Builder();
        builder.names = viewPager2;
        pi2DotsTabIndicator.pager = builder;
        pi2DotsTabIndicator.refreshDots();
        if (uiStepStyle != null && (titleStyle = uiStepStyle.getTitleStyle()) != null && (base = titleStyle.getBase()) != null && (base2 = base.getBase()) != null) {
            TextStylingKt.style(getBinding().title, base2, ArraysKt___ArraysKt.toSet(new TextStyleElements[]{TextStyleElements.Margin, TextStyleElements.LineHeight}));
        }
        String str = helpBottomSheetViewModel.buttonText;
        if (str != null) {
            getBinding().actionButton.setText(str);
        }
        if (helpBottomSheetComponentStyle != null && (launchButtonStyle = helpBottomSheetComponentStyle.getLaunchButtonStyle()) != null) {
            ButtonStylingKt.style$default(getBinding().actionButton, launchButtonStyle, false, true, 6);
        }
        getBinding().actionButton.setVisibility(0);
        if (helpBottomSheetViewModel.secondaryButtonActionComponentName != null) {
            String str2 = helpBottomSheetViewModel.secondaryButtonText;
            if (str2 != null) {
                getBinding().secondaryActionButton.setText(str2);
            }
            if (helpBottomSheetComponentStyle != null && (secondaryButtonStyle = helpBottomSheetComponentStyle.getSecondaryButtonStyle()) != null) {
                ButtonStylingKt.style$default(getBinding().secondaryActionButton, secondaryButtonStyle, false, true, 6);
            }
            getBinding().secondaryActionButton.setVisibility(0);
        } else {
            getBinding().secondaryActionButton.setVisibility(8);
        }
        getBinding().closeButton.setOnClickListener(new BaseCardEntryActivity$$ExternalSyntheticLambda1(this, 3));
        BottomSheetStylingKt.applyBottomSheetStyles$default(getBinding().bottomSheetContent, uiStepStyle, null, null, 6);
        InsetsUtilsKt.onInsetsChanged(getBinding().bottomInset, new ForwardingFileSystem$$ExternalSyntheticLambda0(this, 8));
        getBinding().rootView.postDelayed(new Task$$ExternalSyntheticLambda0(this, 13), 100L);
    }
}
