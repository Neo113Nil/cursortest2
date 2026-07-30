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
import com.crrepa.band.my.health.widgets.BloodPressureHorizontalDisplayView;

/* loaded from: classes2.dex */
public final class ItemBandBloodPressureBinding implements ViewBinding {

    @NonNull
    public final BloodPressureHorizontalDisplayView bpHorizontalDisplayView;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvEightyFive;

    @NonNull
    public final TextView tvHundred;

    @NonNull
    public final TextView tvNinety;

    @NonNull
    public final TextView tvNinetyFive;

    private ItemBandBloodPressureBinding(@NonNull RelativeLayout relativeLayout, @NonNull BloodPressureHorizontalDisplayView bloodPressureHorizontalDisplayView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.bpHorizontalDisplayView = bloodPressureHorizontalDisplayView;
        this.tvEightyFive = textView;
        this.tvHundred = textView2;
        this.tvNinety = textView3;
        this.tvNinetyFive = textView4;
    }

    @NonNull
    public static ItemBandBloodPressureBinding bind(@NonNull View view) {
        int i8 = R.id.bp_horizontal_display_view;
        BloodPressureHorizontalDisplayView bloodPressureHorizontalDisplayView = (BloodPressureHorizontalDisplayView) ViewBindings.findChildViewById(view, R.id.bp_horizontal_display_view);
        if (bloodPressureHorizontalDisplayView != null) {
            i8 = R.id.tv_eighty_five;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_eighty_five);
            if (textView != null) {
                i8 = R.id.tv_hundred;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hundred);
                if (textView2 != null) {
                    i8 = R.id.tv_ninety;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ninety);
                    if (textView3 != null) {
                        i8 = R.id.tv_ninety_five;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ninety_five);
                        if (textView4 != null) {
                            return new ItemBandBloodPressureBinding((RelativeLayout) view, bloodPressureHorizontalDisplayView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandBloodPressureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandBloodPressureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_blood_pressure, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
