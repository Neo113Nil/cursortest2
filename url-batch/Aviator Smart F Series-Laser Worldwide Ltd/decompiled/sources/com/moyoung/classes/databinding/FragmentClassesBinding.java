package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.dafit.module.common.widgets.NestedViewPager;

/* loaded from: classes4.dex */
public final class FragmentClassesBinding implements ViewBinding {

    @NonNull
    private final NestedScrollView rootView;

    @NonNull
    public final RecyclerView rvRecent;

    @NonNull
    public final TabLayout tab;

    @NonNull
    public final TextView tvRecent;

    @NonNull
    public final NestedViewPager vpClass;

    private FragmentClassesBinding(@NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull NestedViewPager nestedViewPager) {
        this.rootView = nestedScrollView;
        this.rvRecent = recyclerView;
        this.tab = tabLayout;
        this.tvRecent = textView;
        this.vpClass = nestedViewPager;
    }

    @NonNull
    public static FragmentClassesBinding bind(@NonNull View view) {
        int i8 = R$id.rv_recent;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
        if (recyclerView != null) {
            i8 = R$id.tab;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i8);
            if (tabLayout != null) {
                i8 = R$id.tv_recent;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView != null) {
                    i8 = R$id.vp_class;
                    NestedViewPager nestedViewPager = (NestedViewPager) ViewBindings.findChildViewById(view, i8);
                    if (nestedViewPager != null) {
                        return new FragmentClassesBinding((NestedScrollView) view, recyclerView, tabLayout, textView, nestedViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentClassesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentClassesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.fragment_classes, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
