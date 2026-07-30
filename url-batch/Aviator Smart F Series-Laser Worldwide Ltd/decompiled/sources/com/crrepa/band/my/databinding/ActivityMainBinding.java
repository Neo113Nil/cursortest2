package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.widgets.NoScrollViewPager;

/* loaded from: classes2.dex */
public final class ActivityMainBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tlTab;

    @NonNull
    public final NoScrollViewPager vpContent;

    private ActivityMainBinding(@NonNull LinearLayout linearLayout, @NonNull TabLayout tabLayout, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.tlTab = tabLayout;
        this.vpContent = noScrollViewPager;
    }

    @NonNull
    public static ActivityMainBinding bind(@NonNull View view) {
        int i8 = R.id.tl_tab;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_tab);
        if (tabLayout != null) {
            i8 = R.id.vp_content;
            NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_content);
            if (noScrollViewPager != null) {
                return new ActivityMainBinding((LinearLayout) view, tabLayout, noScrollViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
