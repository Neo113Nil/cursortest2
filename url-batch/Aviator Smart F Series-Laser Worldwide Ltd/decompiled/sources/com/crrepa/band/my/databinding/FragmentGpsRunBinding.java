package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentGpsRunBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvGpsState;

    @NonNull
    public final TextView tvRunCountdown;

    @NonNull
    public final TextView tvRunStart;

    private FragmentGpsRunBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.tvGpsState = textView;
        this.tvRunCountdown = textView2;
        this.tvRunStart = textView3;
    }

    @NonNull
    public static FragmentGpsRunBinding bind(@NonNull View view) {
        int i8 = R.id.tv_gps_state;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_gps_state);
        if (textView != null) {
            i8 = R.id.tv_run_countdown;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_countdown);
            if (textView2 != null) {
                i8 = R.id.tv_run_start;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_run_start);
                if (textView3 != null) {
                    return new FragmentGpsRunBinding((RelativeLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentGpsRunBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentGpsRunBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gps_run, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
