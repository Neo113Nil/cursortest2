package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.widgets.NoScrollViewPager;

/* loaded from: classes2.dex */
public final class ActivityAppMarketMainBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tab;

    @NonNull
    public final TextView tvBack;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final NoScrollViewPager vpMarket;

    private ActivityAppMarketMainBinding(@NonNull LinearLayout linearLayout, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.tab = tabLayout;
        this.tvBack = textView;
        this.tvTitle = textView2;
        this.vpMarket = noScrollViewPager;
    }

    @NonNull
    public static ActivityAppMarketMainBinding bind(@NonNull View view) {
        int i8 = R.id.tab;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab);
        if (tabLayout != null) {
            i8 = R.id.tv_back;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_back);
            if (textView != null) {
                i8 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    i8 = R.id.vp_market;
                    NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_market);
                    if (noScrollViewPager != null) {
                        return new ActivityAppMarketMainBinding((LinearLayout) view, tabLayout, textView, textView2, noScrollViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityAppMarketMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAppMarketMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_app_market_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
