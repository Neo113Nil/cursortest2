package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;

/* loaded from: classes2.dex */
public final class ActivityBandAlarmEditBinding implements ViewBinding {

    @NonNull
    public final CheckBox cbFriday;

    @NonNull
    public final CheckBox cbMonday;

    @NonNull
    public final CheckBox cbSaturday;

    @NonNull
    public final CheckBox cbSunday;

    @NonNull
    public final CheckBox cbThursday;

    @NonNull
    public final CheckBox cbTuesday;

    @NonNull
    public final CheckBox cbWednesday;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvAlarmEditBack;

    @NonNull
    public final TextView tvAlarmEditSave;

    @NonNull
    public final WheelPicker wpTimeHour;

    @NonNull
    public final WheelPicker wpTimeMinute;

    private ActivityBandAlarmEditBinding(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull CheckBox checkBox3, @NonNull CheckBox checkBox4, @NonNull CheckBox checkBox5, @NonNull CheckBox checkBox6, @NonNull CheckBox checkBox7, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WheelPicker wheelPicker, @NonNull WheelPicker wheelPicker2) {
        this.rootView = linearLayout;
        this.cbFriday = checkBox;
        this.cbMonday = checkBox2;
        this.cbSaturday = checkBox3;
        this.cbSunday = checkBox4;
        this.cbThursday = checkBox5;
        this.cbTuesday = checkBox6;
        this.cbWednesday = checkBox7;
        this.tvAlarmEditBack = textView;
        this.tvAlarmEditSave = textView2;
        this.wpTimeHour = wheelPicker;
        this.wpTimeMinute = wheelPicker2;
    }

    @NonNull
    public static ActivityBandAlarmEditBinding bind(@NonNull View view) {
        int i8 = R.id.cb_friday;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_friday);
        if (checkBox != null) {
            i8 = R.id.cb_monday;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_monday);
            if (checkBox2 != null) {
                i8 = R.id.cb_saturday;
                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_saturday);
                if (checkBox3 != null) {
                    i8 = R.id.cb_sunday;
                    CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_sunday);
                    if (checkBox4 != null) {
                        i8 = R.id.cb_thursday;
                        CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_thursday);
                        if (checkBox5 != null) {
                            i8 = R.id.cb_tuesday;
                            CheckBox checkBox6 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_tuesday);
                            if (checkBox6 != null) {
                                i8 = R.id.cb_wednesday;
                                CheckBox checkBox7 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_wednesday);
                                if (checkBox7 != null) {
                                    i8 = R.id.tv_alarm_edit_back;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_alarm_edit_back);
                                    if (textView != null) {
                                        i8 = R.id.tv_alarm_edit_save;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_alarm_edit_save);
                                        if (textView2 != null) {
                                            i8 = R.id.wp_time_hour;
                                            WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_hour);
                                            if (wheelPicker != null) {
                                                i8 = R.id.wp_time_minute;
                                                WheelPicker wheelPicker2 = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wp_time_minute);
                                                if (wheelPicker2 != null) {
                                                    return new ActivityBandAlarmEditBinding((LinearLayout) view, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, textView, textView2, wheelPicker, wheelPicker2);
                                                }
                                            }
                                        }
                                    }
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
    public static ActivityBandAlarmEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityBandAlarmEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_band_alarm_edit, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
