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
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ActivityHisiliconWatchFaceAiEditBinding implements ViewBinding {

    @NonNull
    public final LayoutNewWatchFaceTimePreviewBinding includeTimePreview;

    @NonNull
    public final LayoutNewWatchFaceTimeStyleBinding includeTimeStyle;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final RoundedImageView ivWatchFacePreview;

    @NonNull
    public final RelativeLayout llTitle;

    @NonNull
    public final RelativeLayout rlImg;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout shadowApply;

    @NonNull
    public final TextView tvApply;

    private ActivityHisiliconWatchFaceAiEditBinding(@NonNull RelativeLayout relativeLayout, @NonNull LayoutNewWatchFaceTimePreviewBinding layoutNewWatchFaceTimePreviewBinding, @NonNull LayoutNewWatchFaceTimeStyleBinding layoutNewWatchFaceTimeStyleBinding, @NonNull ImageView imageView, @NonNull RoundedImageView roundedImageView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.includeTimePreview = layoutNewWatchFaceTimePreviewBinding;
        this.includeTimeStyle = layoutNewWatchFaceTimeStyleBinding;
        this.ivBack = imageView;
        this.ivWatchFacePreview = roundedImageView;
        this.llTitle = relativeLayout2;
        this.rlImg = relativeLayout3;
        this.shadowApply = shadowLayout;
        this.tvApply = textView;
    }

    @NonNull
    public static ActivityHisiliconWatchFaceAiEditBinding bind(@NonNull View view) {
        int i8 = R.id.include_time_preview;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_time_preview);
        if (findChildViewById != null) {
            LayoutNewWatchFaceTimePreviewBinding bind = LayoutNewWatchFaceTimePreviewBinding.bind(findChildViewById);
            i8 = R.id.include_time_style;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_time_style);
            if (findChildViewById2 != null) {
                LayoutNewWatchFaceTimeStyleBinding bind2 = LayoutNewWatchFaceTimeStyleBinding.bind(findChildViewById2);
                i8 = R.id.iv_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                if (imageView != null) {
                    i8 = R.id.iv_watch_face_preview;
                    RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_preview);
                    if (roundedImageView != null) {
                        i8 = R.id.ll_title;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_title);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_img;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_img);
                            if (relativeLayout2 != null) {
                                i8 = R.id.shadow_apply;
                                ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_apply);
                                if (shadowLayout != null) {
                                    i8 = R.id.tv_apply;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_apply);
                                    if (textView != null) {
                                        return new ActivityHisiliconWatchFaceAiEditBinding((RelativeLayout) view, bind, bind2, imageView, roundedImageView, relativeLayout, relativeLayout2, shadowLayout, textView);
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
    public static ActivityHisiliconWatchFaceAiEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityHisiliconWatchFaceAiEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_hisilicon_watch_face_ai_edit, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
