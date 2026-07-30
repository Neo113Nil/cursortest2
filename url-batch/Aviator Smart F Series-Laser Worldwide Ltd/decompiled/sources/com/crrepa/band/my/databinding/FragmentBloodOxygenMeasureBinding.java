package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.BoDisplayView;

/* loaded from: classes2.dex */
public final class FragmentBloodOxygenMeasureBinding implements ViewBinding {

    @NonNull
    public final BoDisplayView boDisplayView;

    @NonNull
    public final ViewAboutBoBinding includeAboutBo;

    @NonNull
    public final Last7TimesTrendViewBinding includeLast7TimesTrend;

    @NonNull
    private final NestedScrollView rootView;

    @NonNull
    public final TextView tvBo;

    @NonNull
    public final TextView tvStatisticsDate;

    private FragmentBloodOxygenMeasureBinding(@NonNull NestedScrollView nestedScrollView, @NonNull BoDisplayView boDisplayView, @NonNull ViewAboutBoBinding viewAboutBoBinding, @NonNull Last7TimesTrendViewBinding last7TimesTrendViewBinding, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = nestedScrollView;
        this.boDisplayView = boDisplayView;
        this.includeAboutBo = viewAboutBoBinding;
        this.includeLast7TimesTrend = last7TimesTrendViewBinding;
        this.tvBo = textView;
        this.tvStatisticsDate = textView2;
    }

    @NonNull
    public static FragmentBloodOxygenMeasureBinding bind(@NonNull View view) {
        int i8 = R.id.bo_display_view;
        BoDisplayView boDisplayView = (BoDisplayView) ViewBindings.findChildViewById(view, R.id.bo_display_view);
        if (boDisplayView != null) {
            i8 = R.id.include_about_bo;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_about_bo);
            if (findChildViewById != null) {
                ViewAboutBoBinding bind = ViewAboutBoBinding.bind(findChildViewById);
                i8 = R.id.include_last_7_times_trend;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_last_7_times_trend);
                if (findChildViewById2 != null) {
                    Last7TimesTrendViewBinding bind2 = Last7TimesTrendViewBinding.bind(findChildViewById2);
                    i8 = R.id.tv_bo;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_bo);
                    if (textView != null) {
                        i8 = R.id.tv_statistics_date;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_statistics_date);
                        if (textView2 != null) {
                            return new FragmentBloodOxygenMeasureBinding((NestedScrollView) view, boDisplayView, bind, bind2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentBloodOxygenMeasureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentBloodOxygenMeasureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_blood_oxygen_measure, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
