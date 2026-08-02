package com.withpersona.sdk2.inquiry.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.divider.MaterialDivider;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;

/* loaded from: classes9.dex */
public final class Pi2InquiryUiBinding implements ViewBinding {
    public final ConstraintLayout container;
    public final FrameLayout footerContainer;
    public final MaterialDivider footerDivider;
    public final LinearLayout footerSheet;
    public final CoordinatorLayout footerSheetCoordinatorLayout;
    public final View footerSheetGrabber;
    public final NestedScrollView footerSheetScrollView;
    public final Pi2NavigationBar navigationBar;
    public final ShadowedNestedScrollView nestedScroll;
    public final ConstraintLayout rootLayout;
    public final CoordinatorLayout rootView;
    public final FrameLayout uiStepContainer;

    public Pi2InquiryUiBinding(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, MaterialDivider materialDivider, LinearLayout linearLayout, CoordinatorLayout coordinatorLayout2, View view, NestedScrollView nestedScrollView, Pi2NavigationBar pi2NavigationBar, ShadowedNestedScrollView shadowedNestedScrollView, ConstraintLayout constraintLayout2, FrameLayout frameLayout2) {
        this.rootView = coordinatorLayout;
        this.container = constraintLayout;
        this.footerContainer = frameLayout;
        this.footerDivider = materialDivider;
        this.footerSheet = linearLayout;
        this.footerSheetCoordinatorLayout = coordinatorLayout2;
        this.footerSheetGrabber = view;
        this.footerSheetScrollView = nestedScrollView;
        this.navigationBar = pi2NavigationBar;
        this.nestedScroll = shadowedNestedScrollView;
        this.rootLayout = constraintLayout2;
        this.uiStepContainer = frameLayout2;
    }

    public static Pi2InquiryUiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_inquiry_ui, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.container);
        if (constraintLayout != null) {
            i = R.id.footer_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.footer_container);
            if (frameLayout != null) {
                i = R.id.footer_divider;
                MaterialDivider materialDivider = (MaterialDivider) ViewBindings.findChildViewById(inflate, R.id.footer_divider);
                if (materialDivider != null) {
                    i = R.id.footer_sheet;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(inflate, R.id.footer_sheet);
                    if (linearLayout != null) {
                        i = R.id.footer_sheet_coordinator_layout;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(inflate, R.id.footer_sheet_coordinator_layout);
                        if (coordinatorLayout != null) {
                            i = R.id.footer_sheet_grabber;
                            View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.footer_sheet_grabber);
                            if (findChildViewById != null) {
                                i = R.id.footer_sheet_scroll_view;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(inflate, R.id.footer_sheet_scroll_view);
                                if (nestedScrollView != null) {
                                    i = R.id.navigation_bar;
                                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                                    if (pi2NavigationBar != null) {
                                        i = R.id.nestedScroll;
                                        ShadowedNestedScrollView shadowedNestedScrollView = (ShadowedNestedScrollView) ViewBindings.findChildViewById(inflate, R.id.nestedScroll);
                                        if (shadowedNestedScrollView != null) {
                                            i = R.id.root_layout;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.root_layout);
                                            if (constraintLayout2 != null) {
                                                i = R.id.ui_step_container;
                                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.ui_step_container);
                                                if (frameLayout2 != null) {
                                                    return new Pi2InquiryUiBinding((CoordinatorLayout) inflate, constraintLayout, frameLayout, materialDivider, linearLayout, coordinatorLayout, findChildViewById, nestedScrollView, pi2NavigationBar, shadowedNestedScrollView, constraintLayout2, frameLayout2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
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
