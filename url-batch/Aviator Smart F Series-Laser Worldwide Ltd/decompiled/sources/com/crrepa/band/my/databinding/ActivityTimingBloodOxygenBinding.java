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
import com.crrepa.band.my.health.widgets.NoScrollViewPager;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class ActivityTimingBloodOxygenBinding implements ViewBinding {

    @NonNull
    public final AppToolbarBinding includeTitleBar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TabLayout tlBloodOxygenTab;

    @NonNull
    public final NoScrollViewPager vpBloodOxygenContent;

    private ActivityTimingBloodOxygenBinding(@NonNull LinearLayout linearLayout, @NonNull AppToolbarBinding appToolbarBinding, @NonNull TabLayout tabLayout, @NonNull NoScrollViewPager noScrollViewPager) {
        this.rootView = linearLayout;
        this.includeTitleBar = appToolbarBinding;
        this.tlBloodOxygenTab = tabLayout;
        this.vpBloodOxygenContent = noScrollViewPager;
    }

    @NonNull
    public static ActivityTimingBloodOxygenBinding bind(@NonNull View view) {
        int i8 = R.id.include_title_bar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title_bar);
        if (findChildViewById != null) {
            AppToolbarBinding bind = AppToolbarBinding.bind(findChildViewById);
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tl_blood_oxygen_tab);
            if (tabLayout != null) {
                NoScrollViewPager noScrollViewPager = (NoScrollViewPager) ViewBindings.findChildViewById(view, R.id.vp_blood_oxygen_content);
                if (noScrollViewPager != null) {
                    return new ActivityTimingBloodOxygenBinding((LinearLayout) view, bind, tabLayout, noScrollViewPager);
                }
                i8 = R.id.vp_blood_oxygen_content;
            } else {
                i8 = R.id.tl_blood_oxygen_tab;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityTimingBloodOxygenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTimingBloodOxygenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_timing_blood_oxygen, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
