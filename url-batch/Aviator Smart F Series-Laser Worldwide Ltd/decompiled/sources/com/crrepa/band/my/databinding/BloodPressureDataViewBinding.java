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
import com.crrepa.band.my.health.widgets.BloodPressureDisplayView;

/* loaded from: classes2.dex */
public final class BloodPressureDataViewBinding implements ViewBinding {

    @NonNull
    public final BloodPressureDisplayView bloodPressureDisplayView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDbp;

    @NonNull
    public final TextView tvSbp;

    @NonNull
    public final TextView tvStatisticsDate;

    private BloodPressureDataViewBinding(@NonNull LinearLayout linearLayout, @NonNull BloodPressureDisplayView bloodPressureDisplayView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.bloodPressureDisplayView = bloodPressureDisplayView;
        this.tvDbp = textView;
        this.tvSbp = textView2;
        this.tvStatisticsDate = textView3;
    }

    @NonNull
    public static BloodPressureDataViewBinding bind(@NonNull View view) {
        int i8 = R.id.blood_pressure_display_view;
        BloodPressureDisplayView bloodPressureDisplayView = (BloodPressureDisplayView) ViewBindings.findChildViewById(view, R.id.blood_pressure_display_view);
        if (bloodPressureDisplayView != null) {
            i8 = R.id.tv_dbp;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_dbp);
            if (textView != null) {
                i8 = R.id.tv_sbp;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sbp);
                if (textView2 != null) {
                    i8 = R.id.tv_statistics_date;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_statistics_date);
                    if (textView3 != null) {
                        return new BloodPressureDataViewBinding((LinearLayout) view, bloodPressureDisplayView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static BloodPressureDataViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BloodPressureDataViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.blood_pressure_data_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
