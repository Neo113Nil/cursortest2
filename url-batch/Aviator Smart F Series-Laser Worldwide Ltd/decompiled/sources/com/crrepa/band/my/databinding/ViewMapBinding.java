package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.google.android.gms.maps.MapView;

/* loaded from: classes2.dex */
public final class ViewMapBinding implements ViewBinding {

    @NonNull
    public final MapView googleMapView;

    @NonNull
    private final RelativeLayout rootView;

    private ViewMapBinding(@NonNull RelativeLayout relativeLayout, @NonNull MapView mapView) {
        this.rootView = relativeLayout;
        this.googleMapView = mapView;
    }

    @NonNull
    public static ViewMapBinding bind(@NonNull View view) {
        MapView mapView = (MapView) ViewBindings.findChildViewById(view, R.id.google_map_view);
        if (mapView != null) {
            return new ViewMapBinding((RelativeLayout) view, mapView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.google_map_view)));
    }

    @NonNull
    public static ViewMapBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewMapBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_map, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
