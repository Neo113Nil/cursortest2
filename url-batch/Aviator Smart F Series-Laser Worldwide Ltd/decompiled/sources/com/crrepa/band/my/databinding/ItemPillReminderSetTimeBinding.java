package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.pillreminder.picker.MyNumberPicker;
import com.crrepa.band.my.device.pillreminder.picker.MyTimePicker;

/* loaded from: classes2.dex */
public final class ItemPillReminderSetTimeBinding implements ViewBinding {

    @NonNull
    public final MyNumberPicker pillCountPicker;

    @NonNull
    public final RadioButton rbtnAm;

    @NonNull
    public final RadioButton rbtnPm;

    @NonNull
    public final MyTimePicker reminderTimePicker;

    @NonNull
    public final RadioGroup rgTimeSystem;

    @NonNull
    private final RelativeLayout rootView;

    private ItemPillReminderSetTimeBinding(@NonNull RelativeLayout relativeLayout, @NonNull MyNumberPicker myNumberPicker, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull MyTimePicker myTimePicker, @NonNull RadioGroup radioGroup) {
        this.rootView = relativeLayout;
        this.pillCountPicker = myNumberPicker;
        this.rbtnAm = radioButton;
        this.rbtnPm = radioButton2;
        this.reminderTimePicker = myTimePicker;
        this.rgTimeSystem = radioGroup;
    }

    @NonNull
    public static ItemPillReminderSetTimeBinding bind(@NonNull View view) {
        int i8 = R.id.pill_count_picker;
        MyNumberPicker myNumberPicker = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.pill_count_picker);
        if (myNumberPicker != null) {
            i8 = R.id.rbtn_am;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbtn_am);
            if (radioButton != null) {
                i8 = R.id.rbtn_pm;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbtn_pm);
                if (radioButton2 != null) {
                    i8 = R.id.reminder_time_picker;
                    MyTimePicker myTimePicker = (MyTimePicker) ViewBindings.findChildViewById(view, R.id.reminder_time_picker);
                    if (myTimePicker != null) {
                        i8 = R.id.rg_time_system;
                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_time_system);
                        if (radioGroup != null) {
                            return new ItemPillReminderSetTimeBinding((RelativeLayout) view, myNumberPicker, radioButton, radioButton2, myTimePicker, radioGroup);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemPillReminderSetTimeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemPillReminderSetTimeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_pill_reminder_set_time, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
