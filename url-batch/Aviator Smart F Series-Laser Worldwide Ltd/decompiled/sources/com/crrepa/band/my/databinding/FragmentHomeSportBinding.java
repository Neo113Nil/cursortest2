package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.widgets.NoScrollViewPager;

/* loaded from: classes2.dex */
public final class FragmentHomeSportBinding implements ViewBinding {

    @NonNull
    public final ImageView ivHistory;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TabLayout tab;

    @NonNull
    public final NoScrollViewPager vpClass;

    private FragmentHomeSportBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TabLayout tabLayout, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = relativeLayout;
        this.ivHistory = imageView;
        this.tab = tabLayout;
        this.vpClass = noScrollViewPager;
    }

    @NonNull
    public static FragmentHomeSportBinding bind(@NonNull View view) {
        int i8 = R.id.iv_history;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_history);
        if (imageView != null) {
            i8 = R.id.tab;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab);
            if (tabLayout != null) {
                i8 = R.id.vp_class;
                NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_class);
                if (noScrollViewPager != null) {
                    return new FragmentHomeSportBinding((RelativeLayout) view, imageView, tabLayout, noScrollViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentHomeSportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentHomeSportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_home_sport, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
