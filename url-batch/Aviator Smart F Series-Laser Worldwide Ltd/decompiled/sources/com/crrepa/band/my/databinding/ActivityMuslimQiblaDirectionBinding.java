package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.view.CompassView;

/* loaded from: classes2.dex */
public final class ActivityMuslimQiblaDirectionBinding implements ViewBinding {

    @NonNull
    public final CompassView compass;

    @NonNull
    public final ImageView ivDeviceAngle;

    @NonNull
    public final ImageView ivMuslimAngle;

    @NonNull
    public final LinearLayout llAngle;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final BandDataAppbarBinding topBar;

    @NonNull
    public final TextView tvDeviceAngle;

    @NonNull
    public final LayoutLocationOffBinding tvGpsOffHint;

    @NonNull
    public final TextView tvMuslimAngle;

    private ActivityMuslimQiblaDirectionBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CompassView compassView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView, @NonNull LayoutLocationOffBinding layoutLocationOffBinding, @NonNull TextView textView2) {
        this.rootView = coordinatorLayout;
        this.compass = compassView;
        this.ivDeviceAngle = imageView;
        this.ivMuslimAngle = imageView2;
        this.llAngle = linearLayout;
        this.topBar = bandDataAppbarBinding;
        this.tvDeviceAngle = textView;
        this.tvGpsOffHint = layoutLocationOffBinding;
        this.tvMuslimAngle = textView2;
    }

    @NonNull
    public static ActivityMuslimQiblaDirectionBinding bind(@NonNull View view) {
        int i8 = R.id.compass;
        CompassView compassView = (CompassView) ViewBindings.findChildViewById(view, R.id.compass);
        if (compassView != null) {
            i8 = R.id.iv_device_angle;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_device_angle);
            if (imageView != null) {
                i8 = R.id.iv_muslim_angle;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_muslim_angle);
                if (imageView2 != null) {
                    i8 = R.id.ll_angle;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_angle);
                    if (linearLayout != null) {
                        i8 = R.id.top_bar;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.top_bar);
                        if (findChildViewById != null) {
                            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                            i8 = R.id.tv_device_angle;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_device_angle);
                            if (textView != null) {
                                i8 = R.id.tv_gps_off_hint;
                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.tv_gps_off_hint);
                                if (findChildViewById2 != null) {
                                    LayoutLocationOffBinding bind2 = LayoutLocationOffBinding.bind(findChildViewById2);
                                    i8 = R.id.tv_muslim_angle;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_muslim_angle);
                                    if (textView2 != null) {
                                        return new ActivityMuslimQiblaDirectionBinding((CoordinatorLayout) view, compassView, imageView, imageView2, linearLayout, bind, textView, bind2, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityMuslimQiblaDirectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMuslimQiblaDirectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_muslim_qibla_direction, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
