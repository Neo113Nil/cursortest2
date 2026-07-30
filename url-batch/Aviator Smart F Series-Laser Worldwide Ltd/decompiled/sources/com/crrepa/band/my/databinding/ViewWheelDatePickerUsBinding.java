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
import com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelDayPicker;
import com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelMonthPicker;
import com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelYearPicker;

/* loaded from: classes2.dex */
public final class ViewWheelDatePickerUsBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final WheelDayPicker wheelDatePickerDay;

    @NonNull
    public final WheelMonthPicker wheelDatePickerMonth;

    @NonNull
    public final WheelYearPicker wheelDatePickerYear;

    private ViewWheelDatePickerUsBinding(@NonNull LinearLayout linearLayout, @NonNull WheelDayPicker wheelDayPicker, @NonNull WheelMonthPicker wheelMonthPicker, @NonNull WheelYearPicker wheelYearPicker) {
        this.rootView = linearLayout;
        this.wheelDatePickerDay = wheelDayPicker;
        this.wheelDatePickerMonth = wheelMonthPicker;
        this.wheelDatePickerYear = wheelYearPicker;
    }

    @NonNull
    public static ViewWheelDatePickerUsBinding bind(@NonNull View view) {
        int i8 = R.id.wheel_date_picker_day;
        WheelDayPicker wheelDayPicker = (WheelDayPicker) ViewBindings.findChildViewById(view, R.id.wheel_date_picker_day);
        if (wheelDayPicker != null) {
            i8 = R.id.wheel_date_picker_month;
            WheelMonthPicker wheelMonthPicker = (WheelMonthPicker) ViewBindings.findChildViewById(view, R.id.wheel_date_picker_month);
            if (wheelMonthPicker != null) {
                i8 = R.id.wheel_date_picker_year;
                WheelYearPicker wheelYearPicker = (WheelYearPicker) ViewBindings.findChildViewById(view, R.id.wheel_date_picker_year);
                if (wheelYearPicker != null) {
                    return new ViewWheelDatePickerUsBinding((LinearLayout) view, wheelDayPicker, wheelMonthPicker, wheelYearPicker);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewWheelDatePickerUsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewWheelDatePickerUsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_wheel_date_picker_us, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
