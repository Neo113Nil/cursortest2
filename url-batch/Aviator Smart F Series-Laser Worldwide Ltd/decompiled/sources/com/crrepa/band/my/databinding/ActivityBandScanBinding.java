package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityBandScanBinding implements ViewBinding {

    @NonNull
    public final RecyclerView rcvScanBand;

    @NonNull
    public final RelativeLayout rlDeviceList;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final ShadowLayout slSkip;

    @NonNull
    public final BandDataAppbarBinding titleBar;

    @NonNull
    public final TextView tvHint;

    @NonNull
    public final TextView tvSkip;

    private ActivityBandScanBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull ShadowLayout shadowLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = coordinatorLayout;
        this.rcvScanBand = recyclerView;
        this.rlDeviceList = relativeLayout;
        this.slSkip = shadowLayout;
        this.titleBar = bandDataAppbarBinding;
        this.tvHint = textView;
        this.tvSkip = textView2;
    }

    @NonNull
    public static ActivityBandScanBinding bind(@NonNull View view) {
        int i8 = R.id.rcv_scan_band;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_scan_band);
        if (recyclerView != null) {
            i8 = R.id.rl_device_list;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_device_list);
            if (relativeLayout != null) {
                i8 = R.id.sl_skip;
                ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.sl_skip);
                if (shadowLayout != null) {
                    i8 = R.id.title_bar;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar);
                    if (findChildViewById != null) {
                        BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                        i8 = R.id.tv_hint;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hint);
                        if (textView != null) {
                            i8 = R.id.tv_skip;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_skip);
                            if (textView2 != null) {
                                return new ActivityBandScanBinding((CoordinatorLayout) view, recyclerView, relativeLayout, shadowLayout, bind, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityBandScanBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBandScanBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_band_scan, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
