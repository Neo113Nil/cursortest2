package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.crrepa.band.aviator.R;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class ActivityCricketBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding includedTitle;

    @NonNull
    public final LinearLayout llCricketContent;

    @NonNull
    public final ViewPager pagerCricket;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TabLayout tabCricketType;

    private ActivityCricketBinding(@NonNull RelativeLayout relativeLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull LinearLayout linearLayout, @NonNull ViewPager viewPager, @NonNull TabLayout tabLayout) {
        this.rootView = relativeLayout;
        this.includedTitle = bandDataAppbarBinding;
        this.llCricketContent = linearLayout;
        this.pagerCricket = viewPager;
        this.tabCricketType = tabLayout;
    }

    @NonNull
    public static ActivityCricketBinding bind(@NonNull View view) {
        int i8 = R.id.includedTitle;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.includedTitle);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            i8 = R.id.ll_cricket_content;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_cricket_content);
            if (linearLayout != null) {
                i8 = R.id.pager_cricket;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.pager_cricket);
                if (viewPager != null) {
                    i8 = R.id.tab_cricket_type;
                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab_cricket_type);
                    if (tabLayout != null) {
                        return new ActivityCricketBinding((RelativeLayout) view, bind, linearLayout, viewPager, tabLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityCricketBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCricketBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_cricket, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
