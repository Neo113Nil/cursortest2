package com.withpersona.sdk2.inquiry.selfie.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2SelfieInstructionsBinding implements ViewBinding {
    public final ImageView imageviewSelfieHeaderImage;
    public final ThemeableLottieAnimationView instructionAnimation;
    public final Pi2NavigationBar navigationBar;
    public final ConstraintLayout nestedUiContainer;
    public final ScrollView rootView;
    public final PersonaMaterialButton startButton;
    public final TextView textviewSelfieDisclosure;
    public final TextView textviewSelfieStartBody;
    public final TextView textviewSelfieStartTitle;

    public Pi2SelfieInstructionsBinding(ScrollView scrollView, ImageView imageView, ThemeableLottieAnimationView themeableLottieAnimationView, Pi2NavigationBar pi2NavigationBar, ConstraintLayout constraintLayout, PersonaMaterialButton personaMaterialButton, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.imageviewSelfieHeaderImage = imageView;
        this.instructionAnimation = themeableLottieAnimationView;
        this.navigationBar = pi2NavigationBar;
        this.nestedUiContainer = constraintLayout;
        this.startButton = personaMaterialButton;
        this.textviewSelfieDisclosure = textView;
        this.textviewSelfieStartBody = textView2;
        this.textviewSelfieStartTitle = textView3;
    }

    public static Pi2SelfieInstructionsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.pi2_selfie_instructions, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = R.id.bottom_guideline;
        if (((Guideline) ViewBindings.findChildViewById(inflate, R.id.bottom_guideline)) != null) {
            i = R.id.content_view;
            if (((ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.content_view)) != null) {
                i = R.id.imageview_selfie_header_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(inflate, R.id.imageview_selfie_header_image);
                if (imageView != null) {
                    i = R.id.instruction_animation;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) ViewBindings.findChildViewById(inflate, R.id.instruction_animation);
                    if (themeableLottieAnimationView != null) {
                        i = R.id.left_guideline;
                        if (((Guideline) ViewBindings.findChildViewById(inflate, R.id.left_guideline)) != null) {
                            i = R.id.navigation_bar;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) ViewBindings.findChildViewById(inflate, R.id.navigation_bar);
                            if (pi2NavigationBar != null) {
                                i = R.id.nested_ui_container;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.nested_ui_container);
                                if (constraintLayout != null) {
                                    i = R.id.right_guideline;
                                    if (((Guideline) ViewBindings.findChildViewById(inflate, R.id.right_guideline)) != null) {
                                        i = R.id.start_button;
                                        PersonaMaterialButton personaMaterialButton = (PersonaMaterialButton) ViewBindings.findChildViewById(inflate, R.id.start_button);
                                        if (personaMaterialButton != null) {
                                            i = R.id.textview_selfie_disclosure;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(inflate, R.id.textview_selfie_disclosure);
                                            if (textView != null) {
                                                i = R.id.textview_selfie_start_body;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, R.id.textview_selfie_start_body);
                                                if (textView2 != null) {
                                                    i = R.id.textview_selfie_start_title;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(inflate, R.id.textview_selfie_start_title);
                                                    if (textView3 != null) {
                                                        return new Pi2SelfieInstructionsBinding((ScrollView) inflate, imageView, themeableLottieAnimationView, pi2NavigationBar, constraintLayout, personaMaterialButton, textView, textView2, textView3);
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
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
