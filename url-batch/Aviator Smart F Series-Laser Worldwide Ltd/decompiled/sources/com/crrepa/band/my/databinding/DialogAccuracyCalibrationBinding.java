package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.GifImageView;

/* loaded from: classes2.dex */
public final class DialogAccuracyCalibrationBinding implements ViewBinding {

    @NonNull
    public final GifImageView givGif;

    @NonNull
    public final LinearLayout llDone;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCurrentAccuracy;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvSensorState;

    @NonNull
    public final TextView tvTitle;

    private DialogAccuracyCalibrationBinding(@NonNull RelativeLayout relativeLayout, @NonNull GifImageView gifImageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.givGif = gifImageView;
        this.llDone = linearLayout;
        this.tvCurrentAccuracy = textView;
        this.tvDescription = textView2;
        this.tvSensorState = textView3;
        this.tvTitle = textView4;
    }

    @NonNull
    public static DialogAccuracyCalibrationBinding bind(@NonNull View view) {
        int i8 = R.id.giv_gif;
        GifImageView gifImageView = (GifImageView) ViewBindings.findChildViewById(view, R.id.giv_gif);
        if (gifImageView != null) {
            i8 = R.id.ll_done;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_done);
            if (linearLayout != null) {
                i8 = R.id.tv_current_accuracy;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_current_accuracy);
                if (textView != null) {
                    i8 = R.id.tv_description;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                    if (textView2 != null) {
                        i8 = R.id.tv_sensor_state;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sensor_state);
                        if (textView3 != null) {
                            i8 = R.id.tv_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                            if (textView4 != null) {
                                return new DialogAccuracyCalibrationBinding((RelativeLayout) view, gifImageView, linearLayout, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogAccuracyCalibrationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogAccuracyCalibrationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_accuracy_calibration, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
