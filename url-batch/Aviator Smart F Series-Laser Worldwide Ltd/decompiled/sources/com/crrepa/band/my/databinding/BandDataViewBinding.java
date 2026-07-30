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
public final class BandDataViewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDateFirstPart;

    @NonNull
    public final TextView tvDateFirstPartUnit;

    @NonNull
    public final TextView tvDateSecondPart;

    @NonNull
    public final TextView tvDateSecondPartUnit;

    private BandDataViewBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.tvDateFirstPart = textView;
        this.tvDateFirstPartUnit = textView2;
        this.tvDateSecondPart = textView3;
        this.tvDateSecondPartUnit = textView4;
    }

    @NonNull
    public static BandDataViewBinding bind(@NonNull View view) {
        int i8 = R.id.tv_date_first_part;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_first_part);
        if (textView != null) {
            i8 = R.id.tv_date_first_part_unit;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_first_part_unit);
            if (textView2 != null) {
                i8 = R.id.tv_date_second_part;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_second_part);
                if (textView3 != null) {
                    i8 = R.id.tv_date_second_part_unit;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_date_second_part_unit);
                    if (textView4 != null) {
                        return new BandDataViewBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static BandDataViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BandDataViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.band_data_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
