package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityBaseBandStatisticsBinding implements ViewBinding {

    @NonNull
    public final RelativeLayout bandMeasureView;

    @NonNull
    public final Button btnBandMeasure;

    @NonNull
    public final AppToolbarBinding includeTitleBar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final FrameLayout statisticsContent;

    private ActivityBaseBandStatisticsBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull AppToolbarBinding appToolbarBinding, @NonNull FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.bandMeasureView = relativeLayout;
        this.btnBandMeasure = button;
        this.includeTitleBar = appToolbarBinding;
        this.statisticsContent = frameLayout;
    }

    @NonNull
    public static ActivityBaseBandStatisticsBinding bind(@NonNull View view) {
        int i8 = R.id.band_measure_view;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.band_measure_view);
        if (relativeLayout != null) {
            i8 = R.id.btn_band_measure;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_band_measure);
            if (button != null) {
                i8 = R.id.include_title_bar;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title_bar);
                if (findChildViewById != null) {
                    AppToolbarBinding bind = AppToolbarBinding.bind(findChildViewById);
                    i8 = R.id.statistics_content;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.statistics_content);
                    if (frameLayout != null) {
                        return new ActivityBaseBandStatisticsBinding((LinearLayout) view, relativeLayout, button, bind, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityBaseBandStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBaseBandStatisticsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_base_band_statistics, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
