package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class SleepNapDayBinding implements ViewBinding {

    @NonNull
    public final View border;

    @NonNull
    public final ImageView ivTips;

    @NonNull
    public final LinearLayout llNapTotalDuration;

    @NonNull
    public final RelativeLayout rlNap;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvNap;

    @NonNull
    public final TextView tvNapTimeHour;

    @NonNull
    public final TextView tvNapTimeMinute;

    @NonNull
    public final TextView tvTitle;

    private SleepNapDayBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.border = view;
        this.ivTips = imageView;
        this.llNapTotalDuration = linearLayout;
        this.rlNap = relativeLayout2;
        this.rvNap = recyclerView;
        this.tvNapTimeHour = textView;
        this.tvNapTimeMinute = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static SleepNapDayBinding bind(@NonNull View view) {
        int i8 = R.id.border;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.border);
        if (findChildViewById != null) {
            i8 = R.id.iv_tips;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_tips);
            if (imageView != null) {
                i8 = R.id.ll_nap_total_duration;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_nap_total_duration);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i8 = R.id.rv_nap;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_nap);
                    if (recyclerView != null) {
                        i8 = R.id.tv_nap_time_hour;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nap_time_hour);
                        if (textView != null) {
                            i8 = R.id.tv_nap_time_minute;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nap_time_minute);
                            if (textView2 != null) {
                                i8 = R.id.tv_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                if (textView3 != null) {
                                    return new SleepNapDayBinding(relativeLayout, findChildViewById, imageView, linearLayout, relativeLayout, recyclerView, textView, textView2, textView3);
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
    public static SleepNapDayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SleepNapDayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sleep_nap_day, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
