package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.dafit.module.common.widgets.wheelpicker.WheelPicker;

/* loaded from: classes4.dex */
public final class ActivityMeditationLocalClassPlayBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView animBreath;

    @NonNull
    public final LottieAnimationView animCountDown;

    @NonNull
    public final LottieAnimationView animTimePicker;

    @NonNull
    public final ImageView ivBlur;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final LinearLayout llCountDown;

    @NonNull
    public final RelativeLayout rlBreath;

    @NonNull
    public final RelativeLayout rlPicker;

    @NonNull
    public final RelativeLayout rlTitle;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvBreathStatus;

    @NonNull
    public final TextView tvBreathTimes;

    @NonNull
    public final TextView tvEnd;

    @NonNull
    public final TextView tvStart;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvWhiteNoise;

    @NonNull
    public final WheelPicker wheelPicker;

    private ActivityMeditationLocalClassPlayBinding(@NonNull RelativeLayout relativeLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull LottieAnimationView lottieAnimationView3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull WheelPicker wheelPicker) {
        this.rootView = relativeLayout;
        this.animBreath = lottieAnimationView;
        this.animCountDown = lottieAnimationView2;
        this.animTimePicker = lottieAnimationView3;
        this.ivBlur = imageView;
        this.ivClose = imageView2;
        this.llCountDown = linearLayout;
        this.rlBreath = relativeLayout2;
        this.rlPicker = relativeLayout3;
        this.rlTitle = relativeLayout4;
        this.tvBreathStatus = textView;
        this.tvBreathTimes = textView2;
        this.tvEnd = textView3;
        this.tvStart = textView4;
        this.tvTitle = textView5;
        this.tvWhiteNoise = textView6;
        this.wheelPicker = wheelPicker;
    }

    @NonNull
    public static ActivityMeditationLocalClassPlayBinding bind(@NonNull View view) {
        int i8 = R$id.anim_breath;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i8);
        if (lottieAnimationView != null) {
            i8 = R$id.anim_count_down;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i8);
            if (lottieAnimationView2 != null) {
                i8 = R$id.anim_time_picker;
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) ViewBindings.findChildViewById(view, i8);
                if (lottieAnimationView3 != null) {
                    i8 = R$id.iv_blur;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
                    if (imageView != null) {
                        i8 = R$id.iv_close;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                        if (imageView2 != null) {
                            i8 = R$id.ll_count_down;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                            if (linearLayout != null) {
                                i8 = R$id.rl_breath;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                if (relativeLayout != null) {
                                    i8 = R$id.rl_picker;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                    if (relativeLayout2 != null) {
                                        i8 = R$id.rl_title;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                        if (relativeLayout3 != null) {
                                            i8 = R$id.tv_breath_status;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                                            if (textView != null) {
                                                i8 = R$id.tv_breath_times;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                if (textView2 != null) {
                                                    i8 = R$id.tv_end;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                    if (textView3 != null) {
                                                        i8 = R$id.tv_start;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                        if (textView4 != null) {
                                                            i8 = R$id.tv_title;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                            if (textView5 != null) {
                                                                i8 = R$id.tv_white_noise;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                if (textView6 != null) {
                                                                    i8 = R$id.wheel_picker;
                                                                    WheelPicker wheelPicker = (WheelPicker) ViewBindings.findChildViewById(view, i8);
                                                                    if (wheelPicker != null) {
                                                                        return new ActivityMeditationLocalClassPlayBinding((RelativeLayout) view, lottieAnimationView, lottieAnimationView2, lottieAnimationView3, imageView, imageView2, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3, textView4, textView5, textView6, wheelPicker);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityMeditationLocalClassPlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMeditationLocalClassPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_meditation_local_class_play, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
