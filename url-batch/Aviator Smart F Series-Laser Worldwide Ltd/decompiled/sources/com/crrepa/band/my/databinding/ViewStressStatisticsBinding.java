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

/* loaded from: classes2.dex */
public final class ViewStressStatisticsBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvMaxStress;

    @NonNull
    public final TextView tvMinStress;

    private ViewStressStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.tvMaxStress = textView;
        this.tvMinStress = textView2;
    }

    @NonNull
    public static ViewStressStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.tv_max_stress;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_max_stress);
        if (textView != null) {
            i8 = R.id.tv_min_stress;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_min_stress);
            if (textView2 != null) {
                return new ViewStressStatisticsBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewStressStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewStressStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_stress_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
