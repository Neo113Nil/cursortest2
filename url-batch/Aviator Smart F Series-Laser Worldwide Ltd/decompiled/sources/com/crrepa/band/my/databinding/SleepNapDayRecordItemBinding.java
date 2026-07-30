package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class SleepNapDayRecordItemBinding implements ViewBinding {

    @NonNull
    public final ImageView ivLogo;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDate;

    @NonNull
    public final TextView tvNapTimeHour;

    @NonNull
    public final TextView tvNapTimeMinute;

    private SleepNapDayRecordItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.ivLogo = imageView;
        this.tvDate = textView;
        this.tvNapTimeHour = textView2;
        this.tvNapTimeMinute = textView3;
    }

    @NonNull
    public static SleepNapDayRecordItemBinding bind(@NonNull View view) {
        int i8 = R.id.iv_logo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo);
        if (imageView != null) {
            i8 = R.id.tv_date;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date);
            if (textView != null) {
                i8 = R.id.tv_nap_time_hour;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nap_time_hour);
                if (textView2 != null) {
                    i8 = R.id.tv_nap_time_minute;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_nap_time_minute);
                    if (textView3 != null) {
                        return new SleepNapDayRecordItemBinding((RelativeLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static SleepNapDayRecordItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static SleepNapDayRecordItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.sleep_nap_day_record_item, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
