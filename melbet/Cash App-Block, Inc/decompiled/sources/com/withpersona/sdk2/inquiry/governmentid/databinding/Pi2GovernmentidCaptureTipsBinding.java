package com.withpersona.sdk2.inquiry.governmentid.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class Pi2GovernmentidCaptureTipsBinding implements ViewBinding {
    public final Space bottomInset;
    public final FrameLayout bottomSheet;
    public final LinearLayout bottomSheetContent;
    public final PersonaMaterialButton continueButton;
    public final ThemeableLottieAnimationView illustration;
    public final ConstraintLayout illustrationContainer;
    public final TextView prompt;
    public final FrameLayout rootView;
    public final View shadow;
    public final LinearLayout tipsContainer;
    public final TextView title;

    public Pi2GovernmentidCaptureTipsBinding(FrameLayout frameLayout, Space space, FrameLayout frameLayout2, LinearLayout linearLayout, PersonaMaterialButton personaMaterialButton, ThemeableLottieAnimationView themeableLottieAnimationView, ConstraintLayout constraintLayout, TextView textView, View view, LinearLayout linearLayout2, TextView textView2) {
        this.rootView = frameLayout;
        this.bottomInset = space;
        this.bottomSheet = frameLayout2;
        this.bottomSheetContent = linearLayout;
        this.continueButton = personaMaterialButton;
        this.illustration = themeableLottieAnimationView;
        this.illustrationContainer = constraintLayout;
        this.prompt = textView;
        this.shadow = view;
        this.tipsContainer = linearLayout2;
        this.title = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
