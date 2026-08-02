package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2ErrorBinding implements ViewBinding {
    public final Button continueButton;
    public final ThemeableLottieAnimationView illustration;
    public final Pi2NavigationBar navigationBar;
    public final CoordinatorLayout rootView;
    public final TextView title;

    public Pi2ErrorBinding(CoordinatorLayout coordinatorLayout, Button button, ThemeableLottieAnimationView themeableLottieAnimationView, Pi2NavigationBar pi2NavigationBar, TextView textView) {
        this.rootView = coordinatorLayout;
        this.continueButton = button;
        this.illustration = themeableLottieAnimationView;
        this.navigationBar = pi2NavigationBar;
        this.title = textView;
    }

    public static Pi2ErrorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.content_view;
        if (((LinearLayout) ViewBindings.findChildViewById(inflate, R.id.content_view)) != null) {
            i = R.id.continue_button;
            Button button = (Button) ViewBindings.findChildViewById(inflate, R.id.continue_button);
            if (button != null) {
                i = R.id.illustration;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.illustration);
                if (themeableLottieAnimationView != null) {
                    i = R.id.navigation_bar;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                    if (pi2NavigationBar != null) {
                        i = R.id.title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.title);
                        if (textView != null) {
                            return new Pi2ErrorBinding((CoordinatorLayout) inflate, button, themeableLottieAnimationView, pi2NavigationBar, textView);
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
