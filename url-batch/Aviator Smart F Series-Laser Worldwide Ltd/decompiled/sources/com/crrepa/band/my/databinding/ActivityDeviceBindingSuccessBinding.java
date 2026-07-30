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
import com.moyoung.dafit.module.common.widgets.ShadowLayout;
import com.moyoung.dafit.module.common.widgets.SingleLineZoomTextView;

/* loaded from: classes2.dex */
public final class ActivityDeviceBindingSuccessBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBandBattery;

    @NonNull
    public final ImageView ivBandScreenshot;

    @NonNull
    public final RelativeLayout rlBandBattery;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout slAgain;

    @NonNull
    public final ShadowLayout slApply;

    @NonNull
    public final TextView tvAgain;

    @NonNull
    public final TextView tvApply;

    @NonNull
    public final TextView tvBandAddress;

    @NonNull
    public final TextView tvBandBattery;

    @NonNull
    public final TextView tvBandConnectState;

    @NonNull
    public final SingleLineZoomTextView tvBandName;

    @NonNull
    public final TextView tvTitle;

    private ActivityDeviceBindingSuccessBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull ShadowLayout shadowLayout, @NonNull ShadowLayout shadowLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull SingleLineZoomTextView singleLineZoomTextView, @NonNull TextView textView6) {
        this.rootView = relativeLayout;
        this.ivBandBattery = imageView;
        this.ivBandScreenshot = imageView2;
        this.rlBandBattery = relativeLayout2;
        this.slAgain = shadowLayout;
        this.slApply = shadowLayout2;
        this.tvAgain = textView;
        this.tvApply = textView2;
        this.tvBandAddress = textView3;
        this.tvBandBattery = textView4;
        this.tvBandConnectState = textView5;
        this.tvBandName = singleLineZoomTextView;
        this.tvTitle = textView6;
    }

    @NonNull
    public static ActivityDeviceBindingSuccessBinding bind(@NonNull View view) {
        int i8 = R.id.iv_band_battery;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_band_battery);
        if (imageView != null) {
            i8 = R.id.iv_band_screenshot;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_band_screenshot);
            if (imageView2 != null) {
                i8 = R.id.rl_band_battery;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_band_battery);
                if (relativeLayout != null) {
                    i8 = R.id.sl_again;
                    ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.sl_again);
                    if (shadowLayout != null) {
                        i8 = R.id.sl_apply;
                        ShadowLayout shadowLayout2 = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.sl_apply);
                        if (shadowLayout2 != null) {
                            i8 = R.id.tv_again;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_again);
                            if (textView != null) {
                                i8 = R.id.tv_apply;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_apply);
                                if (textView2 != null) {
                                    i8 = R.id.tv_band_address;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_band_address);
                                    if (textView3 != null) {
                                        i8 = R.id.tv_band_battery;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_band_battery);
                                        if (textView4 != null) {
                                            i8 = R.id.tv_band_connect_state;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_band_connect_state);
                                            if (textView5 != null) {
                                                i8 = R.id.tv_band_name;
                                                SingleLineZoomTextView singleLineZoomTextView = (SingleLineZoomTextView) ViewBindings.findChildViewById(view, R.id.tv_band_name);
                                                if (singleLineZoomTextView != null) {
                                                    i8 = R.id.tv_title;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                    if (textView6 != null) {
                                                        return new ActivityDeviceBindingSuccessBinding((RelativeLayout) view, imageView, imageView2, relativeLayout, shadowLayout, shadowLayout2, textView, textView2, textView3, textView4, textView5, singleLineZoomTextView, textView6);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityDeviceBindingSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityDeviceBindingSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_device_binding_success, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
