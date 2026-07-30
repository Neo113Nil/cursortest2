package com.moyoung.instructions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.moyoung.instructions.R$id;
import com.moyoung.instructions.R$layout;

/* loaded from: classes4.dex */
public final class VideoPagerBinding implements ViewBinding {

    @NonNull
    public final LinearLayout indicatorContainer;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final ViewPager2 viewPager;

    private VideoPagerBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.indicatorContainer = linearLayout2;
        this.viewPager = viewPager2;
    }

    @NonNull
    public static VideoPagerBinding bind(@NonNull View view) {
        int i8 = R$id.indicatorContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
        if (linearLayout != null) {
            i8 = R$id.viewPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i8);
            if (viewPager2 != null) {
                return new VideoPagerBinding((LinearLayout) view, linearLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static VideoPagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static VideoPagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.video_pager, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
