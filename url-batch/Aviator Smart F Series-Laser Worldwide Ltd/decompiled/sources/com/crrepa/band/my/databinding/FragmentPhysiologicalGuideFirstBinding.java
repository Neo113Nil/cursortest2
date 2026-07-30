package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentPhysiologicalGuideFirstBinding implements ViewBinding {

    @NonNull
    public final ImageView ivPeriodCalculate;

    @NonNull
    public final ImageView ivPeriodTimeline;

    @NonNull
    public final ImageView ivPeriodWatch;

    @NonNull
    private final LinearLayout rootView;

    private FragmentPhysiologicalGuideFirstBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3) {
        this.rootView = linearLayout;
        this.ivPeriodCalculate = imageView;
        this.ivPeriodTimeline = imageView2;
        this.ivPeriodWatch = imageView3;
    }

    @NonNull
    public static FragmentPhysiologicalGuideFirstBinding bind(@NonNull View view) {
        int i8 = R.id.iv_period_calculate;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_period_calculate);
        if (imageView != null) {
            i8 = R.id.iv_period_timeline;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_period_timeline);
            if (imageView2 != null) {
                i8 = R.id.iv_period_watch;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_period_watch);
                if (imageView3 != null) {
                    return new FragmentPhysiologicalGuideFirstBinding((LinearLayout) view, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentPhysiologicalGuideFirstBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentPhysiologicalGuideFirstBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_physiological_guide_first, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
