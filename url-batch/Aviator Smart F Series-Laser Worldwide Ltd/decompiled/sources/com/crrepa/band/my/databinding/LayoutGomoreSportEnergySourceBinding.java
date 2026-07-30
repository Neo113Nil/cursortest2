package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class LayoutGomoreSportEnergySourceBinding implements ViewBinding {

    @NonNull
    public final Space centerSpace;

    @NonNull
    public final LinearLayout llGomoreSportEnergySource;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvEnergyCarb;

    @NonNull
    public final TextView tvEnergyFat;

    @NonNull
    public final TextView tvEnergySourceTitle;

    private LayoutGomoreSportEnergySourceBinding(@NonNull LinearLayout linearLayout, @NonNull Space space, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.centerSpace = space;
        this.llGomoreSportEnergySource = linearLayout2;
        this.tvEnergyCarb = textView;
        this.tvEnergyFat = textView2;
        this.tvEnergySourceTitle = textView3;
    }

    @NonNull
    public static LayoutGomoreSportEnergySourceBinding bind(@NonNull View view) {
        int i8 = R.id.center_space;
        Space space = (Space) ViewBindings.findChildViewById(view, R.id.center_space);
        if (space != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.tv_energy_carb;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_energy_carb);
            if (textView != null) {
                i8 = R.id.tv_energy_fat;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_energy_fat);
                if (textView2 != null) {
                    i8 = R.id.tv_energy_source_title;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_energy_source_title);
                    if (textView3 != null) {
                        return new LayoutGomoreSportEnergySourceBinding(linearLayout, space, linearLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutGomoreSportEnergySourceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutGomoreSportEnergySourceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_gomore_sport_energy_source, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
