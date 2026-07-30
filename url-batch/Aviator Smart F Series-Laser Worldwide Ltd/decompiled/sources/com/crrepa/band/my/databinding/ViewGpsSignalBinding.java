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
public final class ViewGpsSignalBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final View viewGpsSignal1;

    @NonNull
    public final View viewGpsSignal2;

    @NonNull
    public final View viewGpsSignal3;

    @NonNull
    public final View viewGpsSignal4;

    @NonNull
    public final View viewGpsSignal5;

    private ViewGpsSignalBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5) {
        this.rootView = linearLayout;
        this.viewGpsSignal1 = view;
        this.viewGpsSignal2 = view2;
        this.viewGpsSignal3 = view3;
        this.viewGpsSignal4 = view4;
        this.viewGpsSignal5 = view5;
    }

    @NonNull
    public static ViewGpsSignalBinding bind(@NonNull View view) {
        int i8 = R.id.view_gps_signal_1;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_gps_signal_1);
        if (findChildViewById != null) {
            i8 = R.id.view_gps_signal_2;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view_gps_signal_2);
            if (findChildViewById2 != null) {
                i8 = R.id.view_gps_signal_3;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.view_gps_signal_3);
                if (findChildViewById3 != null) {
                    i8 = R.id.view_gps_signal_4;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.view_gps_signal_4);
                    if (findChildViewById4 != null) {
                        i8 = R.id.view_gps_signal_5;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.view_gps_signal_5);
                        if (findChildViewById5 != null) {
                            return new ViewGpsSignalBinding((LinearLayout) view, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4, findChildViewById5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewGpsSignalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewGpsSignalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_gps_signal, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
