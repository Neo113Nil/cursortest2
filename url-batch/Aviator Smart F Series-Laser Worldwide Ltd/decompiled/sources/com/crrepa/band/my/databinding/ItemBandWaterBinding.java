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

/* loaded from: classes2.dex */
public final class ItemBandWaterBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvWaterCardNote;

    @NonNull
    public final TextView tvWaterCardTitle;

    private ItemBandWaterBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.tvWaterCardNote = textView;
        this.tvWaterCardTitle = textView2;
    }

    @NonNull
    public static ItemBandWaterBinding bind(@NonNull View view) {
        int i8 = R.id.tv_water_card_note;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_card_note);
        if (textView != null) {
            i8 = R.id.tv_water_card_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_card_title);
            if (textView2 != null) {
                return new ItemBandWaterBinding((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemBandWaterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemBandWaterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_band_water, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
