package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.pillreminder.picker.MyNumberPicker;

/* loaded from: classes2.dex */
public final class ActivityAddNewPillBinding implements ViewBinding {

    @NonNull
    public final Button btnDeleteReminder;

    @NonNull
    public final EditText etPillName;

    @NonNull
    public final MyNumberPicker pillRepeatPicker;

    @NonNull
    public final MyNumberPicker pillTimesPicker;

    @NonNull
    public final RecyclerView rcvReminderTimeList;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvSave;

    private ActivityAddNewPillBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull EditText editText, @NonNull MyNumberPicker myNumberPicker, @NonNull MyNumberPicker myNumberPicker2, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.btnDeleteReminder = button;
        this.etPillName = editText;
        this.pillRepeatPicker = myNumberPicker;
        this.pillTimesPicker = myNumberPicker2;
        this.rcvReminderTimeList = recyclerView;
        this.tvCancel = textView;
        this.tvSave = textView2;
    }

    @NonNull
    public static ActivityAddNewPillBinding bind(@NonNull View view) {
        int i8 = R.id.btn_delete_reminder;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_delete_reminder);
        if (button != null) {
            i8 = R.id.et_pill_name;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_pill_name);
            if (editText != null) {
                i8 = R.id.pill_repeat_picker;
                MyNumberPicker myNumberPicker = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.pill_repeat_picker);
                if (myNumberPicker != null) {
                    i8 = R.id.pill_times_picker;
                    MyNumberPicker myNumberPicker2 = (MyNumberPicker) ViewBindings.findChildViewById(view, R.id.pill_times_picker);
                    if (myNumberPicker2 != null) {
                        i8 = R.id.rcv_reminder_time_list;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_reminder_time_list);
                        if (recyclerView != null) {
                            i8 = R.id.tv_cancel;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
                            if (textView != null) {
                                i8 = R.id.tv_save;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_save);
                                if (textView2 != null) {
                                    return new ActivityAddNewPillBinding((LinearLayout) view, button, editText, myNumberPicker, myNumberPicker2, recyclerView, textView, textView2);
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
    public static ActivityAddNewPillBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAddNewPillBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_add_new_pill, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
