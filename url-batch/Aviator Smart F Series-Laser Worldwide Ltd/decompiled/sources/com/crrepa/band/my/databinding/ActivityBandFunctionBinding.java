package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityBandFunctionBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    public final RecyclerView rcvBandFunction;

    @NonNull
    private final CoordinatorLayout rootView;

    private ActivityBandFunctionBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull RecyclerView recyclerView) {
        this.rootView = coordinatorLayout;
        this.includeTitle = bandDataAppbarBinding;
        this.rcvBandFunction = recyclerView;
    }

    @NonNull
    public static ActivityBandFunctionBinding bind(@NonNull View view) {
        int i8 = R.id.include_title;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_band_function);
            if (recyclerView != null) {
                return new ActivityBandFunctionBinding((CoordinatorLayout) view, bind, recyclerView);
            }
            i8 = R.id.rcv_band_function;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityBandFunctionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBandFunctionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_band_function, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
