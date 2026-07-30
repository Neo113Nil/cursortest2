package com.crrepa.band.my.databinding;

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
import com.crrepa.band.aviator.R;
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ActivityTrainingSettingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final ImageView ivTipsFrequency;

    @NonNull
    public final ImageView ivTrainingAttention;

    @NonNull
    public final View lineVoiceTips;

    @NonNull
    public final RelativeLayout rlDataSync;

    @NonNull
    public final RelativeLayout rlTipsFrequency;

    @NonNull
    public final RelativeLayout rlTrainingAttention;

    @NonNull
    public final RelativeLayout rlVoiceTips;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwitchButton sbOnScreen;

    @NonNull
    public final SwitchButton sbTrainingSyncCard;

    @NonNull
    public final SwitchButton sbVibrationTips;

    @NonNull
    public final SwitchButton sbVoiceTips;

    @NonNull
    public final TextView tvDistance;

    @NonNull
    public final TextView tvTitle;

    private ActivityTrainingSettingBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull SwitchButton switchButton, @NonNull SwitchButton switchButton2, @NonNull SwitchButton switchButton3, @NonNull SwitchButton switchButton4, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.ivBack = imageView;
        this.ivTipsFrequency = imageView2;
        this.ivTrainingAttention = imageView3;
        this.lineVoiceTips = view;
        this.rlDataSync = relativeLayout;
        this.rlTipsFrequency = relativeLayout2;
        this.rlTrainingAttention = relativeLayout3;
        this.rlVoiceTips = relativeLayout4;
        this.sbOnScreen = switchButton;
        this.sbTrainingSyncCard = switchButton2;
        this.sbVibrationTips = switchButton3;
        this.sbVoiceTips = switchButton4;
        this.tvDistance = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static ActivityTrainingSettingBinding bind(@NonNull View view) {
        int i8 = R.id.iv_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
        if (imageView != null) {
            i8 = R.id.iv_tips_frequency;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_tips_frequency);
            if (imageView2 != null) {
                i8 = R.id.iv_training_attention;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_training_attention);
                if (imageView3 != null) {
                    i8 = R.id.line_voice_tips;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_voice_tips);
                    if (findChildViewById != null) {
                        i8 = R.id.rl_data_sync;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_data_sync);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_tips_frequency;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_tips_frequency);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_training_attention;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_training_attention);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.rl_voice_tips;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_voice_tips);
                                    if (relativeLayout4 != null) {
                                        i8 = R.id.sb_on_screen;
                                        SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sb_on_screen);
                                        if (switchButton != null) {
                                            i8 = R.id.sb_training_sync_card;
                                            SwitchButton switchButton2 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sb_training_sync_card);
                                            if (switchButton2 != null) {
                                                i8 = R.id.sb_vibration_tips;
                                                SwitchButton switchButton3 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sb_vibration_tips);
                                                if (switchButton3 != null) {
                                                    i8 = R.id.sb_voice_tips;
                                                    SwitchButton switchButton4 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sb_voice_tips);
                                                    if (switchButton4 != null) {
                                                        i8 = R.id.tv_distance;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_distance);
                                                        if (textView != null) {
                                                            i8 = R.id.tv_title;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                            if (textView2 != null) {
                                                                return new ActivityTrainingSettingBinding((LinearLayout) view, imageView, imageView2, imageView3, findChildViewById, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, switchButton, switchButton2, switchButton3, switchButton4, textView, textView2);
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
    public static ActivityTrainingSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTrainingSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_training_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
