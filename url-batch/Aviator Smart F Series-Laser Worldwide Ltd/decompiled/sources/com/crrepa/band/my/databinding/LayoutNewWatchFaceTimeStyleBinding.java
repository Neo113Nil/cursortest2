package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutNewWatchFaceTimeStyleBinding implements ViewBinding {

    @NonNull
    public final LayoutNewWatchFaceTimeStyleNumberPickerBinding includeNumberPicker;

    @NonNull
    public final LinearLayout llRoot;

    @NonNull
    public final RadioButton rbTimeStyleClock;

    @NonNull
    public final RadioButton rbTimeStyleNumber;

    @NonNull
    public final RadioGroup rgTimeStyle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTitle;

    private LayoutNewWatchFaceTimeStyleBinding(@NonNull LinearLayout linearLayout, @NonNull LayoutNewWatchFaceTimeStyleNumberPickerBinding layoutNewWatchFaceTimeStyleNumberPickerBinding, @NonNull LinearLayout linearLayout2, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioGroup radioGroup, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.includeNumberPicker = layoutNewWatchFaceTimeStyleNumberPickerBinding;
        this.llRoot = linearLayout2;
        this.rbTimeStyleClock = radioButton;
        this.rbTimeStyleNumber = radioButton2;
        this.rgTimeStyle = radioGroup;
        this.tvTitle = textView;
    }

    @NonNull
    public static LayoutNewWatchFaceTimeStyleBinding bind(@NonNull View view) {
        int i8 = R.id.include_number_picker;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_number_picker);
        if (findChildViewById != null) {
            LayoutNewWatchFaceTimeStyleNumberPickerBinding bind = LayoutNewWatchFaceTimeStyleNumberPickerBinding.bind(findChildViewById);
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.rb_time_style_clock;
            RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_time_style_clock);
            if (radioButton != null) {
                i8 = R.id.rb_time_style_number;
                RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rb_time_style_number);
                if (radioButton2 != null) {
                    i8 = R.id.rg_time_style;
                    RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rg_time_style);
                    if (radioGroup != null) {
                        i8 = R.id.tv_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                        if (textView != null) {
                            return new LayoutNewWatchFaceTimeStyleBinding(linearLayout, bind, linearLayout, radioButton, radioButton2, radioGroup, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutNewWatchFaceTimeStyleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewWatchFaceTimeStyleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_watch_face_time_style, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
