package com.withpersona.sdk2.inquiry.shared.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.dotsIndicator.Pi2DotsTabIndicator;

/* loaded from: classes9.dex */
public final class Pi2NavigationHelpBottomSheetBinding implements ViewBinding {
    public final MaterialButton actionButton;
    public final Space bottomInset;
    public final FrameLayout bottomSheet;
    public final LinearLayout bottomSheetContent;
    public final ImageView closeButton;
    public final Pi2DotsTabIndicator dotsIndicator;
    public final View listContentSeparator;
    public final FrameLayout rootView;
    public final MaterialButton secondaryActionButton;
    public final View tintScreen;
    public final TextView title;
    public final ViewPager2 viewPager;

    public Pi2NavigationHelpBottomSheetBinding(FrameLayout frameLayout, MaterialButton materialButton, Space space, FrameLayout frameLayout2, LinearLayout linearLayout, ImageView imageView, Pi2DotsTabIndicator pi2DotsTabIndicator, View view, MaterialButton materialButton2, View view2, TextView textView, ViewPager2 viewPager2) {
        this.rootView = frameLayout;
        this.actionButton = materialButton;
        this.bottomInset = space;
        this.bottomSheet = frameLayout2;
        this.bottomSheetContent = linearLayout;
        this.closeButton = imageView;
        this.dotsIndicator = pi2DotsTabIndicator;
        this.listContentSeparator = view;
        this.secondaryActionButton = materialButton2;
        this.tintScreen = view2;
        this.title = textView;
        this.viewPager = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
