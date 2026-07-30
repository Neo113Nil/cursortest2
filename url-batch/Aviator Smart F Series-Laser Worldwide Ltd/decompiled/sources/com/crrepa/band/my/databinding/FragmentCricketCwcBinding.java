package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.crrepa.band.aviator.R;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class FragmentCricketCwcBinding implements ViewBinding {

    @NonNull
    public final ViewPager pagerCricketCwc;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tabCricketCwcType;

    private FragmentCricketCwcBinding(@NonNull LinearLayout linearLayout, @NonNull ViewPager viewPager, @NonNull TabLayout tabLayout) {
        this.rootView = linearLayout;
        this.pagerCricketCwc = viewPager;
        this.tabCricketCwcType = tabLayout;
    }

    @NonNull
    public static FragmentCricketCwcBinding bind(@NonNull View view) {
        int i8 = R.id.pager_cricket_cwc;
        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.pager_cricket_cwc);
        if (viewPager != null) {
            i8 = R.id.tab_cricket_cwc_type;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab_cricket_cwc_type);
            if (tabLayout != null) {
                return new FragmentCricketCwcBinding((LinearLayout) view, viewPager, tabLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentCricketCwcBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentCricketCwcBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_cricket_cwc, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
