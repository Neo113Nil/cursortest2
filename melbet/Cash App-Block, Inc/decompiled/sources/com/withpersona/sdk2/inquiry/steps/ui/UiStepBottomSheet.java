package com.withpersona.sdk2.inquiry.steps.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import com.squareup.workflow1.ui.AndroidViewRendering;
import com.squareup.workflow1.ui.BackPressHandlerKt;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewFactory;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2GenericUiStepBottomSheetBinding;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.BottomSheetStylingKt;
import com.withpersona.sdk2.inquiry.ui.UiScreenRunner$$ExternalSyntheticLambda13;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.MarkwonImpl;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.o0;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class UiStepBottomSheet implements AndroidViewRendering {
    public BottomSheetBehavior bottomSheetBehavior;
    public final String cancelButtonName;
    public final List componentNamesToActions;
    public final boolean hideWhenTappedOutside;
    public final Function0 onCancelled;
    public final UiComponentScreen uiScreen;
    public MarkwonImpl uiScreenGenerationResult;
    public final DecorativeViewFactory viewFactory;

    public UiStepBottomSheet(UiComponentScreen uiComponentScreen, List list, Function0 function0, String str, boolean z) {
        uiComponentScreen.getClass();
        list.getClass();
        this.uiScreen = uiComponentScreen;
        this.componentNamesToActions = list;
        this.onCancelled = function0;
        this.cancelButtonName = str;
        this.hideWhenTappedOutside = z;
        this.viewFactory = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(UiStepBottomSheet.class), UiStepBottomSheet$viewFactory$1.INSTANCE, new InterceptedRenderContext$send$1(this, 8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiStepBottomSheet)) {
            return false;
        }
        UiStepBottomSheet uiStepBottomSheet = (UiStepBottomSheet) obj;
        return Intrinsics.areEqual(this.uiScreen, uiStepBottomSheet.uiScreen) && Intrinsics.areEqual(this.componentNamesToActions, uiStepBottomSheet.componentNamesToActions) && this.onCancelled.equals(uiStepBottomSheet.onCancelled) && Intrinsics.areEqual(this.cancelButtonName, uiStepBottomSheet.cancelButtonName) && this.hideWhenTappedOutside == uiStepBottomSheet.hideWhenTappedOutside;
    }

    @Override // com.squareup.workflow1.ui.AndroidViewRendering
    public final ViewFactory getViewFactory() {
        return this.viewFactory;
    }

    public final int hashCode() {
        int hashCode = (this.onCancelled.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.uiScreen.hashCode() * 31, 31, this.componentNamesToActions)) * 31;
        String str = this.cancelButtonName;
        return Boolean.hashCode(this.hideWhenTappedOutside) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void showRendering(Pi2GenericUiStepBottomSheetBinding pi2GenericUiStepBottomSheetBinding, UiStepBottomSheet uiStepBottomSheet) {
        pi2GenericUiStepBottomSheetBinding.getClass();
        FrameLayout frameLayout = pi2GenericUiStepBottomSheetBinding.contentContainer;
        NestedScrollView nestedScrollView = pi2GenericUiStepBottomSheetBinding.contentScrollView;
        ConstraintLayout constraintLayout = pi2GenericUiStepBottomSheetBinding.bottomSheet;
        View view = pi2GenericUiStepBottomSheetBinding.tintScreen;
        CoordinatorLayout coordinatorLayout = pi2GenericUiStepBottomSheetBinding.rootView;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        layoutParams.getClass();
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).mBehavior;
        behavior.getClass();
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) behavior;
        if (!InsetsUtilsKt.supportsCustomNavigationBar) {
            coordinatorLayout.getClass();
            InsetsUtilsKt.applyInsetsAsPadding$default(coordinatorLayout, 14);
        }
        zzbk.setup(bottomSheetBehavior, new Choreographers$$ExternalSyntheticLambda1(uiStepBottomSheet, 3), constraintLayout, nestedScrollView, view);
        this.bottomSheetBehavior = bottomSheetBehavior;
        int i = 12;
        if (coordinatorLayout.isAttachedToWindow()) {
            Context context = coordinatorLayout.getContext();
            context.getClass();
            ContextUtilsKt.hideKeyboard(context);
            coordinatorLayout.postDelayed(new UiStepBottomSheet$$ExternalSyntheticLambda1(bottomSheetBehavior, 0), 100L);
        } else {
            coordinatorLayout.addOnAttachStateChangeListener(new SystemBarStateMonitor.AnonymousClass3(i, pi2GenericUiStepBottomSheetBinding, bottomSheetBehavior));
        }
        Context context2 = coordinatorLayout.getContext();
        context2.getClass();
        UiStepUtils uiStepUtils = UiStepUtils.INSTANCE;
        UiComponentScreen uiComponentScreen = this.uiScreen;
        MarkwonImpl generateViewsFromUiScreen$default = UiStepUtils.generateViewsFromUiScreen$default(uiStepUtils, context2, uiComponentScreen, true);
        this.uiScreenGenerationResult = generateViewsFromUiScreen$default;
        frameLayout.addView((ConstraintLayout) generateViewsFromUiScreen$default.visitorFactory);
        LinkedHashMap linkedHashMap = (LinkedHashMap) ((o0) generateViewsFromUiScreen$default.parser).a;
        for (Pair pair : this.componentNamesToActions) {
            String str = (String) pair.first;
            Function1 function1 = (Function1) pair.second;
            ComponentView componentView = (ComponentView) linkedHashMap.get(str);
            if (componentView != null) {
                componentView.view.setOnClickListener(new UiScreenRunner$$ExternalSyntheticLambda13(function1, componentView, 3));
            }
        }
        ComponentView componentView2 = (ComponentView) linkedHashMap.get(this.cancelButtonName);
        if (componentView2 != null) {
            componentView2.view.setOnClickListener(new UiStepBottomSheet$$ExternalSyntheticLambda3(bottomSheetBehavior, 0));
        }
        BackPressHandlerKt.setBackPressedHandler(constraintLayout, new UiStepBottomSheet$$ExternalSyntheticLambda4(bottomSheetBehavior, 0));
        if (uiStepBottomSheet.hideWhenTappedOutside) {
            view.setOnClickListener(new UiStepBottomSheet$$ExternalSyntheticLambda3(bottomSheetBehavior, 5));
        } else {
            view.setOnClickListener(null);
        }
        BottomSheetStylingKt.applyBottomSheetStyles$default(nestedScrollView, uiComponentScreen.styles, frameLayout, null, 12);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiStepBottomSheet(uiScreen=");
        sb.append(this.uiScreen);
        sb.append(", componentNamesToActions=");
        sb.append(this.componentNamesToActions);
        sb.append(", onCancelled=");
        sb.append(this.onCancelled);
        sb.append(", cancelButtonName=");
        sb.append(this.cancelButtonName);
        sb.append(", hideWhenTappedOutside=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hideWhenTappedOutside, ")");
    }
}
