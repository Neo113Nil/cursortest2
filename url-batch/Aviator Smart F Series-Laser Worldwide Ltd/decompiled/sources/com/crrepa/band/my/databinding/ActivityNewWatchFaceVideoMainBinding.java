package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ActivityNewWatchFaceVideoMainBinding implements ViewBinding {

    @NonNull
    public final LayoutNewWatchFaceDisplayModeForVideoBinding includeDisplayMode;

    @NonNull
    public final LayoutNewWatchFaceTimePreviewBinding includeTimePreview;

    @NonNull
    public final LayoutNewWatchFaceTimeStyleBinding includeTimeStyle;

    @NonNull
    public final LayoutNewWatchFaceVideoVideoContainerBinding includeVideo;

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final RoundedImageView ivDefaultImg;

    @NonNull
    public final ImageView ivVideoMask;

    @NonNull
    public final RelativeLayout llTitle;

    @NonNull
    public final RelativeLayout rlVideo;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout shadowApply;

    @NonNull
    public final TextView tvApply;

    @NonNull
    public final VideoView videoView;

    private ActivityNewWatchFaceVideoMainBinding(@NonNull RelativeLayout relativeLayout, @NonNull LayoutNewWatchFaceDisplayModeForVideoBinding layoutNewWatchFaceDisplayModeForVideoBinding, @NonNull LayoutNewWatchFaceTimePreviewBinding layoutNewWatchFaceTimePreviewBinding, @NonNull LayoutNewWatchFaceTimeStyleBinding layoutNewWatchFaceTimeStyleBinding, @NonNull LayoutNewWatchFaceVideoVideoContainerBinding layoutNewWatchFaceVideoVideoContainerBinding, @NonNull ImageView imageView, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull VideoView videoView) {
        this.rootView = relativeLayout;
        this.includeDisplayMode = layoutNewWatchFaceDisplayModeForVideoBinding;
        this.includeTimePreview = layoutNewWatchFaceTimePreviewBinding;
        this.includeTimeStyle = layoutNewWatchFaceTimeStyleBinding;
        this.includeVideo = layoutNewWatchFaceVideoVideoContainerBinding;
        this.ivBack = imageView;
        this.ivDefaultImg = roundedImageView;
        this.ivVideoMask = imageView2;
        this.llTitle = relativeLayout2;
        this.rlVideo = relativeLayout3;
        this.shadowApply = shadowLayout;
        this.tvApply = textView;
        this.videoView = videoView;
    }

    @NonNull
    public static ActivityNewWatchFaceVideoMainBinding bind(@NonNull View view) {
        int i8 = R.id.include_display_mode;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_display_mode);
        if (findChildViewById != null) {
            LayoutNewWatchFaceDisplayModeForVideoBinding bind = LayoutNewWatchFaceDisplayModeForVideoBinding.bind(findChildViewById);
            i8 = R.id.include_time_preview;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_time_preview);
            if (findChildViewById2 != null) {
                LayoutNewWatchFaceTimePreviewBinding bind2 = LayoutNewWatchFaceTimePreviewBinding.bind(findChildViewById2);
                i8 = R.id.include_time_style;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_time_style);
                if (findChildViewById3 != null) {
                    LayoutNewWatchFaceTimeStyleBinding bind3 = LayoutNewWatchFaceTimeStyleBinding.bind(findChildViewById3);
                    i8 = R.id.include_video;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_video);
                    if (findChildViewById4 != null) {
                        LayoutNewWatchFaceVideoVideoContainerBinding bind4 = LayoutNewWatchFaceVideoVideoContainerBinding.bind(findChildViewById4);
                        i8 = R.id.iv_back;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
                        if (imageView != null) {
                            i8 = R.id.iv_default_img;
                            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_default_img);
                            if (roundedImageView != null) {
                                i8 = R.id.iv_video_mask;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_video_mask);
                                if (imageView2 != null) {
                                    i8 = R.id.ll_title;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.ll_title);
                                    if (relativeLayout != null) {
                                        i8 = R.id.rl_video;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_video);
                                        if (relativeLayout2 != null) {
                                            i8 = R.id.shadow_apply;
                                            ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_apply);
                                            if (shadowLayout != null) {
                                                i8 = R.id.tv_apply;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_apply);
                                                if (textView != null) {
                                                    i8 = R.id.video_view;
                                                    VideoView videoView = (VideoView) ViewBindings.findChildViewById(view, R.id.video_view);
                                                    if (videoView != null) {
                                                        return new ActivityNewWatchFaceVideoMainBinding((RelativeLayout) view, bind, bind2, bind3, bind4, imageView, roundedImageView, imageView2, relativeLayout, relativeLayout2, shadowLayout, textView, videoView);
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
    public static ActivityNewWatchFaceVideoMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityNewWatchFaceVideoMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_new_watch_face_video_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
