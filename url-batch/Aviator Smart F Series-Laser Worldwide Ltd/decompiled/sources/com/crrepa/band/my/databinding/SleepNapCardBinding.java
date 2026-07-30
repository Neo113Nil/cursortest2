package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.NoTouchRecyclerView;

/* loaded from: classes2.dex */
public final class SleepNapCardBinding implements ViewBinding {

    @NonNull
    public final ImageView ivLogo;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NoTouchRecyclerView rvNap;

    @NonNull
    public final TextView tvNapTimeHour;

    @NonNull
    public final TextView tvNapTimeMinute;

    private SleepNapCardBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull NoTouchRecyclerView noTouchRecyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.ivLogo = imageView;
        this.rvNap = noTouchRecyclerView;
        this.tvNapTimeHour = textView;
        this.tvNapTimeMinute = textView2;
    }

    @NonNull
    public static SleepNapCardBinding bind(@NonNull View view) {
        int i8 = R.id.iv_logo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo);
        if (imageView != null) {
            i8 = R.id.rv_nap;
            NoTouchRecyclerView noTouchRecyclerView = (NoTouchRecyclerView) ViewBindings.findChildViewById(view, R.id.rv_nap);
            if (noTouchRecyclerView != null) {
                i8 = R.id.tv_nap_time_hour;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nap_time_hour);
                if (textView != null) {
                    i8 = R.id.tv_nap_time_minute;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nap_time_minute);
                    if (textView2 != null) {
                        return new SleepNapCardBinding((LinearLayout) view, imageView, noTouchRecyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static SleepNapCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SleepNapCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sleep_nap_card, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
