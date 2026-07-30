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

/* loaded from: classes2.dex */
public final class ViewAboutTemperatureBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvFeverGrade;

    @NonNull
    public final TextView tvNormalTemperature;

    private ViewAboutTemperatureBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.tvFeverGrade = textView;
        this.tvNormalTemperature = textView2;
    }

    @NonNull
    public static ViewAboutTemperatureBinding bind(@NonNull View view) {
        int i8 = R.id.tv_fever_grade;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_fever_grade);
        if (textView != null) {
            i8 = R.id.tv_normal_temperature;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_normal_temperature);
            if (textView2 != null) {
                return new ViewAboutTemperatureBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ViewAboutTemperatureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewAboutTemperatureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_about_temperature, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
