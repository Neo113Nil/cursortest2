package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes7.dex */
public final class Pi2NavigationTroubleshootingTipsPageItemBinding implements ViewBinding {
    public final TextView description;
    public final ThemeableLottieAnimationView lottieView;
    public final LinearLayout rootView;

    public Pi2NavigationTroubleshootingTipsPageItemBinding(LinearLayout linearLayout, TextView textView, ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.rootView = linearLayout;
        this.description = textView;
        this.lottieView = themeableLottieAnimationView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
