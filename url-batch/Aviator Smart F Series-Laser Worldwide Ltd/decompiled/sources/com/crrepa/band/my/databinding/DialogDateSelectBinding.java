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
import com.crrepa.band.my.profile.userinfo.wheelpicker.widgets.WheelDatePicker;

/* loaded from: classes2.dex */
public final class DialogDateSelectBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvDone;

    @NonNull
    public final WheelDatePicker wpDate;

    private DialogDateSelectBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WheelDatePicker wheelDatePicker) {
        this.rootView = relativeLayout;
        this.tvCancel = textView;
        this.tvDone = textView2;
        this.wpDate = wheelDatePicker;
    }

    @NonNull
    public static DialogDateSelectBinding bind(@NonNull View view) {
        int i8 = R.id.tv_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cancel);
        if (textView != null) {
            i8 = R.id.tv_done;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_done);
            if (textView2 != null) {
                i8 = R.id.wp_date;
                WheelDatePicker wheelDatePicker = (WheelDatePicker) ViewBindings.findChildViewById(view, R.id.wp_date);
                if (wheelDatePicker != null) {
                    return new DialogDateSelectBinding((RelativeLayout) view, textView, textView2, wheelDatePicker);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogDateSelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogDateSelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_date_select, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
