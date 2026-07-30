package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityScanHelpBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding bar;

    @NonNull
    private final LinearLayout rootView;

    private ActivityScanHelpBinding(@NonNull LinearLayout linearLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding) {
        this.rootView = linearLayout;
        this.bar = bandDataAppbarBinding;
    }

    @NonNull
    public static ActivityScanHelpBinding bind(@NonNull View view) {
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.bar);
        if (findChildViewById == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.bar)));
        }
        return new ActivityScanHelpBinding((LinearLayout) view, BandDataAppbarBinding.bind(findChildViewById));
    }

    @NonNull
    public static ActivityScanHelpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityScanHelpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_scan_help, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
