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
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;

/* loaded from: classes2.dex */
public final class DialogTimeSelectBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvDone;

    @NonNull
    public final WheelPicker wpTimeHour;

    @NonNull
    public final WheelPicker wpTimeHourType;

    @NonNull
    public final WheelPicker wpTimeHourTypeEn;

    @NonNull
    public final WheelPicker wpTimeMinute;

    private DialogTimeSelectBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WheelPicker wheelPicker, @NonNull WheelPicker wheelPicker2, @NonNull WheelPicker wheelPicker3, @NonNull WheelPicker wheelPicker4) {
        this.rootView = relativeLayout;
        this.tvCancel = textView;
        this.tvDone = textView2;
        this.wpTimeHour = wheelPicker;
        this.wpTimeHourType = wheelPicker2;
        this.wpTimeHourTypeEn = wheelPicker3;
        this.wpTimeMinute = wheelPicker4;
    }

    @NonNull
    public static DialogTimeSelectBinding bind(@NonNull View view) {
        int i8 = R.id.tv_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
        if (textView != null) {
            i8 = R.id.tv_done;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_done);
            if (textView2 != null) {
                i8 = R.id.wp_time_hour;
                WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_hour);
                if (wheelPicker != null) {
                    i8 = R.id.wp_time_hour_type;
                    WheelPicker wheelPicker2 = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_hour_type);
                    if (wheelPicker2 != null) {
                        i8 = R.id.wp_time_hour_type_en;
                        WheelPicker wheelPicker3 = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_hour_type_en);
                        if (wheelPicker3 != null) {
                            i8 = R.id.wp_time_minute;
                            WheelPicker wheelPicker4 = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_minute);
                            if (wheelPicker4 != null) {
                                return new DialogTimeSelectBinding((RelativeLayout) view, textView, textView2, wheelPicker, wheelPicker2, wheelPicker3, wheelPicker4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogTimeSelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogTimeSelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_time_select, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
