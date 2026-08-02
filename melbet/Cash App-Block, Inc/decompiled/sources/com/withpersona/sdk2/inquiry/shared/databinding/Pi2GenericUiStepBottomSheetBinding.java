package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;

/* loaded from: classes9.dex */
public final class Pi2GenericUiStepBottomSheetBinding implements ViewBinding {
    public final ConstraintLayout bottomSheet;
    public final FrameLayout contentContainer;
    public final NestedScrollView contentScrollView;
    public final CoordinatorLayout rootView;
    public final View tintScreen;

    public Pi2GenericUiStepBottomSheetBinding(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView, View view) {
        this.rootView = coordinatorLayout;
        this.bottomSheet = constraintLayout;
        this.contentContainer = frameLayout;
        this.contentScrollView = nestedScrollView;
        this.tintScreen = view;
    }

    public static Pi2GenericUiStepBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_generic_ui_step_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.bottom_sheet;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.bottom_sheet);
        if (constraintLayout != null) {
            i = R.id.content_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.content_container);
            if (frameLayout != null) {
                i = R.id.content_scroll_view;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(inflate, R.id.content_scroll_view);
                if (nestedScrollView != null) {
                    i = R.id.tint_screen;
                    View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.tint_screen);
                    if (findChildViewById != null) {
                        return new Pi2GenericUiStepBottomSheetBinding((CoordinatorLayout) inflate, constraintLayout, frameLayout, nestedScrollView, findChildViewById);
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
