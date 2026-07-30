package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.widgets.WaveView;

/* loaded from: classes2.dex */
public final class DialogWaterAddBinding implements ViewBinding {

    @NonNull
    public final ImageView ivDialogClose;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvAddWater;

    @NonNull
    public final TextView tvWaterIntake;

    @NonNull
    public final WaveView wvWaterIntake;

    private DialogWaterAddBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WaveView waveView) {
        this.rootView = relativeLayout;
        this.ivDialogClose = imageView;
        this.tvAddWater = textView;
        this.tvWaterIntake = textView2;
        this.wvWaterIntake = waveView;
    }

    @NonNull
    public static DialogWaterAddBinding bind(@NonNull View view) {
        int i8 = R.id.iv_dialog_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_dialog_close);
        if (imageView != null) {
            i8 = R.id.tv_add_water;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_add_water);
            if (textView != null) {
                i8 = R.id.tv_water_intake;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_water_intake);
                if (textView2 != null) {
                    i8 = R.id.wv_water_intake;
                    WaveView waveView = (WaveView) ViewBindings.findChildViewById(view, R.id.wv_water_intake);
                    if (waveView != null) {
                        return new DialogWaterAddBinding((RelativeLayout) view, imageView, textView, textView2, waveView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogWaterAddBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogWaterAddBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_water_add, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
