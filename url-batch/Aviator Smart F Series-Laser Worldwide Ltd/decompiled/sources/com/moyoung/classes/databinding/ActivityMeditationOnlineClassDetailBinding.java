package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes4.dex */
public final class ActivityMeditationOnlineClassDetailBinding implements ViewBinding {

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivThumb;

    @NonNull
    public final ProgressBar pbAudio;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout slStart;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvDownload;

    @NonNull
    public final TextView tvDuration;

    @NonNull
    public final TextView tvProgress;

    @NonNull
    public final TextView tvSkill;

    @NonNull
    public final TextView tvSkillTitle;

    @NonNull
    public final TextView tvStart;

    @NonNull
    public final TextView tvTitle;

    private ActivityMeditationOnlineClassDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.rootView = relativeLayout;
        this.ivClose = imageView;
        this.ivThumb = imageView2;
        this.pbAudio = progressBar;
        this.slStart = shadowLayout;
        this.tvDescription = textView;
        this.tvDownload = textView2;
        this.tvDuration = textView3;
        this.tvProgress = textView4;
        this.tvSkill = textView5;
        this.tvSkillTitle = textView6;
        this.tvStart = textView7;
        this.tvTitle = textView8;
    }

    @NonNull
    public static ActivityMeditationOnlineClassDetailBinding bind(@NonNull View view) {
        int i8 = R$id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.iv_thumb;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView2 != null) {
                i8 = R$id.pb_audio;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i8);
                if (progressBar != null) {
                    i8 = R$id.sl_start;
                    ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, i8);
                    if (shadowLayout != null) {
                        i8 = R$id.tv_description;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView != null) {
                            i8 = R$id.tv_download;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                            if (textView2 != null) {
                                i8 = R$id.tv_duration;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView3 != null) {
                                    i8 = R$id.tv_progress;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                    if (textView4 != null) {
                                        i8 = R$id.tv_skill;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i8);
                                        if (textView5 != null) {
                                            i8 = R$id.tv_skill_title;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i8);
                                            if (textView6 != null) {
                                                i8 = R$id.tv_start;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                if (textView7 != null) {
                                                    i8 = R$id.tv_title;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                    if (textView8 != null) {
                                                        return new ActivityMeditationOnlineClassDetailBinding((RelativeLayout) view, imageView, imageView2, progressBar, shadowLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static ActivityMeditationOnlineClassDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityMeditationOnlineClassDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_meditation_online_class_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
