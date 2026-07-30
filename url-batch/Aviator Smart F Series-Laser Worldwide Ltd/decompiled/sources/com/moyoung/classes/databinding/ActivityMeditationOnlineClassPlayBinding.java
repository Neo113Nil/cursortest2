package com.moyoung.classes.databinding;

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
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class ActivityMeditationOnlineClassPlayBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView animLoading;

    @NonNull
    public final LottieAnimationView animPlaying;

    @NonNull
    public final ImageView ivBg;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final PlayerControlView playerController;

    @NonNull
    public final RelativeLayout rlTitle;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvLoadingTips;

    @NonNull
    public final TextView tvTitle;

    private ActivityMeditationOnlineClassPlayBinding(@NonNull RelativeLayout relativeLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull PlayerControlView playerControlView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = relativeLayout;
        this.animLoading = lottieAnimationView;
        this.animPlaying = lottieAnimationView2;
        this.ivBg = imageView;
        this.ivClose = imageView2;
        this.playerController = playerControlView;
        this.rlTitle = relativeLayout2;
        this.tvLoadingTips = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static ActivityMeditationOnlineClassPlayBinding bind(@NonNull View view) {
        int i8 = R$id.anim_loading;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i8);
        if (lottieAnimationView != null) {
            i8 = R$id.anim_playing;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i8);
            if (lottieAnimationView2 != null) {
                i8 = R$id.iv_bg;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
                if (imageView != null) {
                    i8 = R$id.iv_close;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                    if (imageView2 != null) {
                        i8 = R$id.player_controller;
                        PlayerControlView playerControlView = (PlayerControlView) ViewBindings.findChildViewById(view, i8);
                        if (playerControlView != null) {
                            i8 = R$id.rl_title;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                            if (relativeLayout != null) {
                                i8 = R$id.tv_loading_tips;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView != null) {
                                    i8 = R$id.tv_title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                                    if (textView2 != null) {
                                        return new ActivityMeditationOnlineClassPlayBinding((RelativeLayout) view, lottieAnimationView, lottieAnimationView2, imageView, imageView2, playerControlView, relativeLayout, textView, textView2);
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
    public static ActivityMeditationOnlineClassPlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMeditationOnlineClassPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_meditation_online_class_play, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
