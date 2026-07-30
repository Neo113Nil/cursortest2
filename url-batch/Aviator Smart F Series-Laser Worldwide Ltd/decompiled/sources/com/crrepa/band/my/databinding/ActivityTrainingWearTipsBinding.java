package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityTrainingWearTipsBinding implements ViewBinding {

    @NonNull
    public final Button btnOk;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final LinearLayout llTips;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout slShoot;

    @NonNull
    public final View viewWearPocket;

    private ActivityTrainingWearTipsBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull ShadowLayout shadowLayout, @NonNull View view) {
        this.rootView = relativeLayout;
        this.btnOk = button;
        this.ivBack = imageView;
        this.llTips = linearLayout;
        this.slShoot = shadowLayout;
        this.viewWearPocket = view;
    }

    @NonNull
    public static ActivityTrainingWearTipsBinding bind(@NonNull View view) {
        int i8 = R.id.btn_ok;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_ok);
        if (button != null) {
            i8 = R.id.iv_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
            if (imageView != null) {
                i8 = R.id.ll_tips;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tips);
                if (linearLayout != null) {
                    i8 = R.id.sl_shoot;
                    ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.sl_shoot);
                    if (shadowLayout != null) {
                        i8 = R.id.view_wear_pocket;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_wear_pocket);
                        if (findChildViewById != null) {
                            return new ActivityTrainingWearTipsBinding((RelativeLayout) view, button, imageView, linearLayout, shadowLayout, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityTrainingWearTipsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTrainingWearTipsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_training_wear_tips, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
