package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.widgets.NestedViewPager;

/* loaded from: classes2.dex */
public final class ActivityNewCustomWatchFaceBinding implements ViewBinding {

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final RelativeLayout rlTitle;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TabLayout tab;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final NestedViewPager vpClass;

    private ActivityNewCustomWatchFaceBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull NestedViewPager nestedViewPager) {
        this.rootView = relativeLayout;
        this.ivTitleBack = imageView;
        this.rlTitle = relativeLayout2;
        this.tab = tabLayout;
        this.tvTitle = textView;
        this.vpClass = nestedViewPager;
    }

    @NonNull
    public static ActivityNewCustomWatchFaceBinding bind(@NonNull View view) {
        int i8 = R.id.iv_title_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
        if (imageView != null) {
            i8 = R.id.rl_title;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title);
            if (relativeLayout != null) {
                i8 = R.id.tab;
                TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tab);
                if (tabLayout != null) {
                    i8 = R.id.tv_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                    if (textView != null) {
                        i8 = R.id.vp_class;
                        NestedViewPager nestedViewPager = (NestedViewPager) ViewBindings.findChildViewById(view, R.id.vp_class);
                        if (nestedViewPager != null) {
                            return new ActivityNewCustomWatchFaceBinding((RelativeLayout) view, imageView, relativeLayout, tabLayout, textView, nestedViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityNewCustomWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityNewCustomWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_new_custom_watch_face, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
