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
public final class ViewNumberPickerBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llNumberPicker;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvNumber;

    @NonNull
    public final MyWheelPicker wpNumber;

    private ViewNumberPickerBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull MyWheelPicker myWheelPicker) {
        this.rootView = linearLayout;
        this.llNumberPicker = linearLayout2;
        this.tvNumber = textView;
        this.wpNumber = myWheelPicker;
    }

    @NonNull
    public static ViewNumberPickerBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i8 = R.id.tv_number;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number);
        if (textView != null) {
            i8 = R.id.wp_number;
            MyWheelPicker myWheelPicker = (MyWheelPicker) ViewBindings.findChildViewById(view, R.id.wp_number);
            if (myWheelPicker != null) {
                return new ViewNumberPickerBinding(linearLayout, linearLayout, textView, myWheelPicker);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewNumberPickerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewNumberPickerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_number_picker, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
