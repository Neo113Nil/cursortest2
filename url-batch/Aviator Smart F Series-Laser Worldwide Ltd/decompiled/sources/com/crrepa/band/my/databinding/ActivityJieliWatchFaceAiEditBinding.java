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
public final class ActivityJieliWatchFaceAiEditBinding implements ViewBinding {

    @NonNull
    public final LayoutNewWatchFacePointerPreviewBinding includePointerPreview;

    @NonNull
    public final LayoutNewWatchFacePointerStyleBinding includePointerStyle;

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

    private ActivityJieliWatchFaceAiEditBinding(@NonNull RelativeLayout relativeLayout, @NonNull LayoutNewWatchFacePointerPreviewBinding layoutNewWatchFacePointerPreviewBinding, @NonNull LayoutNewWatchFacePointerStyleBinding layoutNewWatchFacePointerStyleBinding, @NonNull ImageView imageView, @NonNull RoundedImageView roundedImageView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.includePointerPreview = layoutNewWatchFacePointerPreviewBinding;
        this.includePointerStyle = layoutNewWatchFacePointerStyleBinding;
        this.ivBack = imageView;
        this.ivWatchFacePreview = roundedImageView;
        this.llTitle = relativeLayout2;
        this.rlImg = relativeLayout3;
        this.shadowApply = shadowLayout;
        this.tvApply = textView;
    }

    @NonNull
    public static ActivityJieliWatchFaceAiEditBinding bind(@NonNull View view) {
        int i8 = R.id.include_pointer_preview;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_pointer_preview);
        if (findChildViewById != null) {
            LayoutNewWatchFacePointerPreviewBinding bind = LayoutNewWatchFacePointerPreviewBinding.bind(findChildViewById);
            i8 = R.id.include_pointer_style;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_pointer_style);
            if (findChildViewById2 != null) {
                LayoutNewWatchFacePointerStyleBinding bind2 = LayoutNewWatchFacePointerStyleBinding.bind(findChildViewById2);
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
                                        return new ActivityJieliWatchFaceAiEditBinding((RelativeLayout) view, bind, bind2, imageView, roundedImageView, relativeLayout, relativeLayout2, shadowLayout, textView);
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
    public static ActivityJieliWatchFaceAiEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityJieliWatchFaceAiEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_jieli_watch_face_ai_edit, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
