package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.google.android.gms.maps.MapView;

/* loaded from: classes2.dex */
public final class ActivityRunMapBinding implements ViewBinding {

    @NonNull
    public final MapView googleMapView;

    @NonNull
    public final ImageView ivLocation;

    @NonNull
    private final RelativeLayout rootView;

    private ActivityRunMapBinding(@NonNull RelativeLayout relativeLayout, @NonNull MapView mapView, @NonNull ImageView imageView) {
        this.rootView = relativeLayout;
        this.googleMapView = mapView;
        this.ivLocation = imageView;
    }

    @NonNull
    public static ActivityRunMapBinding bind(@NonNull View view) {
        int i8 = R.id.google_map_view;
        MapView mapView = (MapView) ViewBindings.findChildViewById(view, R.id.google_map_view);
        if (mapView != null) {
            i8 = R.id.iv_location;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_location);
            if (imageView != null) {
                return new ActivityRunMapBinding((RelativeLayout) view, mapView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityRunMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityRunMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_run_map, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
