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
public final class DialogTrainingSettingTipsFrequencyBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvDone;

    @NonNull
    public final WheelPicker wheelPicker;

    private DialogTrainingSettingTipsFrequencyBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WheelPicker wheelPicker) {
        this.rootView = relativeLayout;
        this.tvCancel = textView;
        this.tvDone = textView2;
        this.wheelPicker = wheelPicker;
    }

    @NonNull
    public static DialogTrainingSettingTipsFrequencyBinding bind(@NonNull View view) {
        int i8 = R.id.tv_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
        if (textView != null) {
            i8 = R.id.tv_done;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_done);
            if (textView2 != null) {
                i8 = R.id.wheel_picker;
                WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, R.id.wheel_picker);
                if (wheelPicker != null) {
                    return new DialogTrainingSettingTipsFrequencyBinding((RelativeLayout) view, textView, textView2, wheelPicker);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogTrainingSettingTipsFrequencyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogTrainingSettingTipsFrequencyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_training_setting_tips_frequency, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
