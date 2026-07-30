package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityBandUpgradeBinding implements ViewBinding {

    @NonNull
    public final FrameLayout bandUpgradeContent;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final BandDataAppbarBinding titleBar;

    private ActivityBandUpgradeBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding) {
        this.rootView = coordinatorLayout;
        this.bandUpgradeContent = frameLayout;
        this.titleBar = bandDataAppbarBinding;
    }

    @NonNull
    public static ActivityBandUpgradeBinding bind(@NonNull View view) {
        int i8 = R.id.band_upgrade_content;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.band_upgrade_content);
        if (frameLayout != null) {
            i8 = R.id.title_bar;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar);
            if (findChildViewById != null) {
                return new ActivityBandUpgradeBinding((CoordinatorLayout) view, frameLayout, BandDataAppbarBinding.bind(findChildViewById));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityBandUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBandUpgradeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_band_upgrade, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
