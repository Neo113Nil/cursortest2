package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2SelfieSubmittingScreenBinding implements ViewBinding {
    public final ConstraintLayout animationContainer;
    public final TextView body;
    public final ConstraintLayout contentContainer;
    public final Pi2NavigationBar navigationBar;
    public final ThemeableLottieAnimationView pendingAnimation;
    public final ConstraintLayout rootView;
    public final TextView title;

    public Pi2SelfieSubmittingScreenBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, ConstraintLayout constraintLayout3, Pi2NavigationBar pi2NavigationBar, ThemeableLottieAnimationView themeableLottieAnimationView, TextView textView2) {
        this.rootView = constraintLayout;
        this.animationContainer = constraintLayout2;
        this.body = textView;
        this.contentContainer = constraintLayout3;
        this.navigationBar = pi2NavigationBar;
        this.pendingAnimation = themeableLottieAnimationView;
        this.title = textView2;
    }

    public static Pi2SelfieSubmittingScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_selfie_submitting_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.animation_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.animation_container);
        if (constraintLayout != null) {
            i = R.id.body;
            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.body);
            if (textView != null) {
                i = R.id.content_container;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.content_container);
                if (constraintLayout2 != null) {
                    i = R.id.navigation_bar;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                    if (pi2NavigationBar != null) {
                        i = R.id.pending_animation;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.pending_animation);
                        if (themeableLottieAnimationView != null) {
                            i = R.id.title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                            if (textView2 != null) {
                                return new Pi2SelfieSubmittingScreenBinding((ConstraintLayout) inflate, constraintLayout, textView, constraintLayout2, pi2NavigationBar, themeableLottieAnimationView, textView2);
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
