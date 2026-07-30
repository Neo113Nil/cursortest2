package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemWatchFaceBinding implements ViewBinding {

    @NonNull
    public final Button btnWatchFaceEdit;

    @NonNull
    public final LayoutItemWatchFaceHisiliconLabelBinding includeHisiliconLabel;

    @NonNull
    public final LayoutNewWatchFacePointerPreviewBinding includeJieliPointerPreview;

    @NonNull
    public final ImageView ivAddWatchFace;

    @NonNull
    public final ImageView ivCenterLogo;

    @NonNull
    public final ImageView ivPhotoPicture;

    @NonNull
    public final RoundedImageView ivWatchFace;

    @NonNull
    public final ImageView ivWatchFaceTime;

    @NonNull
    public final ImageView ivWatchFaceTimeBottom;

    @NonNull
    public final ImageView ivWatchFaceTimeTop;

    @NonNull
    public final LinearLayout llWatchFaceContent;

    @NonNull
    public final RelativeLayout rlWatchFace;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvWatchFaceName;

    private ItemWatchFaceBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull LayoutItemWatchFaceHisiliconLabelBinding layoutItemWatchFaceHisiliconLabelBinding, @NonNull LayoutNewWatchFacePointerPreviewBinding layoutNewWatchFacePointerPreviewBinding, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.btnWatchFaceEdit = button;
        this.includeHisiliconLabel = layoutItemWatchFaceHisiliconLabelBinding;
        this.includeJieliPointerPreview = layoutNewWatchFacePointerPreviewBinding;
        this.ivAddWatchFace = imageView;
        this.ivCenterLogo = imageView2;
        this.ivPhotoPicture = imageView3;
        this.ivWatchFace = roundedImageView;
        this.ivWatchFaceTime = imageView4;
        this.ivWatchFaceTimeBottom = imageView5;
        this.ivWatchFaceTimeTop = imageView6;
        this.llWatchFaceContent = linearLayout2;
        this.rlWatchFace = relativeLayout;
        this.tvWatchFaceName = textView;
    }

    @NonNull
    public static ItemWatchFaceBinding bind(@NonNull View view) {
        int i8 = R.id.btn_watch_face_edit;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_watch_face_edit);
        if (button != null) {
            i8 = R.id.include_hisilicon_label;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_hisilicon_label);
            if (findChildViewById != null) {
                LayoutItemWatchFaceHisiliconLabelBinding bind = LayoutItemWatchFaceHisiliconLabelBinding.bind(findChildViewById);
                i8 = R.id.include_jieli_pointer_preview;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_jieli_pointer_preview);
                if (findChildViewById2 != null) {
                    LayoutNewWatchFacePointerPreviewBinding bind2 = LayoutNewWatchFacePointerPreviewBinding.bind(findChildViewById2);
                    i8 = R.id.iv_add_watch_face;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_add_watch_face);
                    if (imageView != null) {
                        i8 = R.id.iv_center_logo;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_center_logo);
                        if (imageView2 != null) {
                            i8 = R.id.iv_photo_picture;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_photo_picture);
                            if (imageView3 != null) {
                                i8 = R.id.iv_watch_face;
                                RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face);
                                if (roundedImageView != null) {
                                    i8 = R.id.iv_watch_face_time;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time);
                                    if (imageView4 != null) {
                                        i8 = R.id.iv_watch_face_time_bottom;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_bottom);
                                        if (imageView5 != null) {
                                            i8 = R.id.iv_watch_face_time_top;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_time_top);
                                            if (imageView6 != null) {
                                                i8 = R.id.ll_watch_face_content;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_watch_face_content);
                                                if (linearLayout != null) {
                                                    i8 = R.id.rl_watch_face;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_watch_face);
                                                    if (relativeLayout != null) {
                                                        i8 = R.id.tv_watch_face_name;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_face_name);
                                                        if (textView != null) {
                                                            return new ItemWatchFaceBinding((LinearLayout) view, button, bind, bind2, imageView, imageView2, imageView3, roundedImageView, imageView4, imageView5, imageView6, linearLayout, relativeLayout, textView);
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
    public static ItemWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_watch_face, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
