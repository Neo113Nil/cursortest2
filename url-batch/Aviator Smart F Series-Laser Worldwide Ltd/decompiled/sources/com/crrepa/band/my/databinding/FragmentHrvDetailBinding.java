package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentHrvDetailBinding implements ViewBinding {

    @NonNull
    public final ViewAboutHrvBinding includeAboutHrv;

    @NonNull
    public final Last7TimesTrendViewBinding includeLast7TimesTrend;

    @NonNull
    public final BandLastStatisticsBinding includeLastStatistics;

    @NonNull
    private final NestedScrollView rootView;

    private FragmentHrvDetailBinding(@NonNull NestedScrollView nestedScrollView, @NonNull ViewAboutHrvBinding viewAboutHrvBinding, @NonNull Last7TimesTrendViewBinding last7TimesTrendViewBinding, @NonNull BandLastStatisticsBinding bandLastStatisticsBinding) {
        this.rootView = nestedScrollView;
        this.includeAboutHrv = viewAboutHrvBinding;
        this.includeLast7TimesTrend = last7TimesTrendViewBinding;
        this.includeLastStatistics = bandLastStatisticsBinding;
    }

    @NonNull
    public static FragmentHrvDetailBinding bind(@NonNull View view) {
        int i8 = R.id.include_about_hrv;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_about_hrv);
        if (findChildViewById != null) {
            ViewAboutHrvBinding bind = ViewAboutHrvBinding.bind(findChildViewById);
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_last_7_times_trend);
            if (findChildViewById2 != null) {
                Last7TimesTrendViewBinding bind2 = Last7TimesTrendViewBinding.bind(findChildViewById2);
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_last_statistics);
                if (findChildViewById3 != null) {
                    return new FragmentHrvDetailBinding((NestedScrollView) view, bind, bind2, BandLastStatisticsBinding.bind(findChildViewById3));
                }
                i8 = R.id.include_last_statistics;
            } else {
                i8 = R.id.include_last_7_times_trend;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentHrvDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentHrvDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_hrv_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
