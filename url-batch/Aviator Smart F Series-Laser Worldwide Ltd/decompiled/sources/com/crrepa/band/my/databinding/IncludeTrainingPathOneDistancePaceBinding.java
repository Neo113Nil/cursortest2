package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class IncludeTrainingPathOneDistancePaceBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llOneDistancePaceChart;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvPace;

    @NonNull
    public final TextView tvDistanceUnit;

    @NonNull
    public final TextView tvFastestPace;

    @NonNull
    public final TextView tvLowestPace;

    @NonNull
    public final TextView tvTitle;

    private IncludeTrainingPathOneDistancePaceBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.llOneDistancePaceChart = linearLayout2;
        this.rvPace = recyclerView;
        this.tvDistanceUnit = textView;
        this.tvFastestPace = textView2;
        this.tvLowestPace = textView3;
        this.tvTitle = textView4;
    }

    @NonNull
    public static IncludeTrainingPathOneDistancePaceBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.rv_pace;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_pace);
        if (recyclerView != null) {
            i8 = R.id.tv_distance_unit;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_distance_unit);
            if (textView != null) {
                i8 = R.id.tv_fastest_pace;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fastest_pace);
                if (textView2 != null) {
                    i8 = R.id.tv_lowest_pace;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_lowest_pace);
                    if (textView3 != null) {
                        i8 = R.id.tv_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView4 != null) {
                            return new IncludeTrainingPathOneDistancePaceBinding(linearLayout, linearLayout, recyclerView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static IncludeTrainingPathOneDistancePaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeTrainingPathOneDistancePaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_training_path_one_distance_pace, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
