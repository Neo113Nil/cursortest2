package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

/* loaded from: classes9.dex */
public final class Pi2GenericUiStepScreenBinding implements ViewBinding {
    public final FrameLayout contentContainer;
    public final NestedScrollView contentScrollView;
    public final FrameLayout footerContainer;
    public final Pi2NavigationBar navigationBar;
    public final ConstraintLayout rootView;

    public Pi2GenericUiStepScreenBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, NestedScrollView nestedScrollView, FrameLayout frameLayout2, Pi2NavigationBar pi2NavigationBar) {
        this.rootView = constraintLayout;
        this.contentContainer = frameLayout;
        this.contentScrollView = nestedScrollView;
        this.footerContainer = frameLayout2;
        this.navigationBar = pi2NavigationBar;
    }

    public static Pi2GenericUiStepScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_generic_ui_step_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.content_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.content_container);
        if (frameLayout != null) {
            i = R.id.content_scroll_view;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(inflate, R.id.content_scroll_view);
            if (nestedScrollView != null) {
                i = R.id.footer_container;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(inflate, R.id.footer_container);
                if (frameLayout2 != null) {
                    i = R.id.navigation_bar;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                    if (pi2NavigationBar != null) {
                        return new Pi2GenericUiStepScreenBinding((ConstraintLayout) inflate, frameLayout, nestedScrollView, frameLayout2, pi2NavigationBar);
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
