package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.pillreminder.picker.MyWheelPicker;

/* loaded from: classes2.dex */
public final class ViewTimePickerBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llTimePicker;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvColon;

    @NonNull
    public final TextView tvTimeHour;

    @NonNull
    public final TextView tvTimeMinute;

    @NonNull
    public final MyWheelPicker wpTimeHour;

    @NonNull
    public final MyWheelPicker wpTimeMinute;

    private ViewTimePickerBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MyWheelPicker myWheelPicker, @NonNull MyWheelPicker myWheelPicker2) {
        this.rootView = linearLayout;
        this.llTimePicker = linearLayout2;
        this.tvColon = textView;
        this.tvTimeHour = textView2;
        this.tvTimeMinute = textView3;
        this.wpTimeHour = myWheelPicker;
        this.wpTimeMinute = myWheelPicker2;
    }

    @NonNull
    public static ViewTimePickerBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.tv_colon;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_colon);
        if (textView != null) {
            i8 = R.id.tv_time_hour;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_hour);
            if (textView2 != null) {
                i8 = R.id.tv_time_minute;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time_minute);
                if (textView3 != null) {
                    i8 = R.id.wp_time_hour;
                    MyWheelPicker myWheelPicker = (MyWheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_hour);
                    if (myWheelPicker != null) {
                        i8 = R.id.wp_time_minute;
                        MyWheelPicker myWheelPicker2 = (MyWheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_minute);
                        if (myWheelPicker2 != null) {
                            return new ViewTimePickerBinding(linearLayout, linearLayout, textView, textView2, textView3, myWheelPicker, myWheelPicker2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewTimePickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewTimePickerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_time_picker, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
