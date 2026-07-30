package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityGsensorCalibrationBinding implements ViewBinding {

    @NonNull
    public final Button btnCalibration;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    private final CoordinatorLayout rootView;

    private ActivityGsensorCalibrationBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull BandDataAppbarBinding bandDataAppbarBinding) {
        this.rootView = coordinatorLayout;
        this.btnCalibration = button;
        this.includeTitle = bandDataAppbarBinding;
    }

    @NonNull
    public static ActivityGsensorCalibrationBinding bind(@NonNull View view) {
        int i8 = R.id.btn_calibration;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_calibration);
        if (button != null) {
            i8 = R.id.include_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
            if (findChildViewById != null) {
                return new ActivityGsensorCalibrationBinding((CoordinatorLayout) view, button, BandDataAppbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityGsensorCalibrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGsensorCalibrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_gsensor_calibration, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
