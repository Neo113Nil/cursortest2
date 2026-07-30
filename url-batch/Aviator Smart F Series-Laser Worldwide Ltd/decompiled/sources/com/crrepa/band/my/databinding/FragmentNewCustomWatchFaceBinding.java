package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class FragmentNewCustomWatchFaceBinding implements ViewBinding {

    @NonNull
    public final View border;

    @NonNull
    public final Button btnSetWatchFace;

    @NonNull
    public final LayoutNewWatchFaceDisplayModeForCustomPhotoBinding includeDisplayMode;

    @NonNull
    public final LayoutNewCustomWatchFaceImgBinding includeImg;

    @NonNull
    public final LayoutNewWatchFacePointerPreviewBinding includePointerPreview;

    @NonNull
    public final LayoutNewWatchFacePointerStyleBinding includePointerStyle;

    @NonNull
    public final LayoutNewWatchFaceTimePreviewBinding includeTimePreview;

    @NonNull
    public final LayoutNewWatchFaceTimeStyleBinding includeTimeStyle;

    @NonNull
    public final RoundedImageView ivImgPreview;

    @NonNull
    public final RelativeLayout rlPreview;

    @NonNull
    private final RelativeLayout rootView;

    private FragmentNewCustomWatchFaceBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull Button button, @NonNull LayoutNewWatchFaceDisplayModeForCustomPhotoBinding layoutNewWatchFaceDisplayModeForCustomPhotoBinding, @NonNull LayoutNewCustomWatchFaceImgBinding layoutNewCustomWatchFaceImgBinding, @NonNull LayoutNewWatchFacePointerPreviewBinding layoutNewWatchFacePointerPreviewBinding, @NonNull LayoutNewWatchFacePointerStyleBinding layoutNewWatchFacePointerStyleBinding, @NonNull LayoutNewWatchFaceTimePreviewBinding layoutNewWatchFaceTimePreviewBinding, @NonNull LayoutNewWatchFaceTimeStyleBinding layoutNewWatchFaceTimeStyleBinding, @NonNull RoundedImageView roundedImageView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.border = view;
        this.btnSetWatchFace = button;
        this.includeDisplayMode = layoutNewWatchFaceDisplayModeForCustomPhotoBinding;
        this.includeImg = layoutNewCustomWatchFaceImgBinding;
        this.includePointerPreview = layoutNewWatchFacePointerPreviewBinding;
        this.includePointerStyle = layoutNewWatchFacePointerStyleBinding;
        this.includeTimePreview = layoutNewWatchFaceTimePreviewBinding;
        this.includeTimeStyle = layoutNewWatchFaceTimeStyleBinding;
        this.ivImgPreview = roundedImageView;
        this.rlPreview = relativeLayout2;
    }

    @NonNull
    public static FragmentNewCustomWatchFaceBinding bind(@NonNull View view) {
        int i8 = R.id.border;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.border);
        if (findChildViewById != null) {
            i8 = R.id.btn_set_watch_face;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_set_watch_face);
            if (button != null) {
                i8 = R.id.include_display_mode;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_display_mode);
                if (findChildViewById2 != null) {
                    LayoutNewWatchFaceDisplayModeForCustomPhotoBinding bind = LayoutNewWatchFaceDisplayModeForCustomPhotoBinding.bind(findChildViewById2);
                    i8 = R.id.include_img;
                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_img);
                    if (findChildViewById3 != null) {
                        LayoutNewCustomWatchFaceImgBinding bind2 = LayoutNewCustomWatchFaceImgBinding.bind(findChildViewById3);
                        i8 = R.id.include_pointer_preview;
                        View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_pointer_preview);
                        if (findChildViewById4 != null) {
                            LayoutNewWatchFacePointerPreviewBinding bind3 = LayoutNewWatchFacePointerPreviewBinding.bind(findChildViewById4);
                            i8 = R.id.include_pointer_style;
                            View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_pointer_style);
                            if (findChildViewById5 != null) {
                                LayoutNewWatchFacePointerStyleBinding bind4 = LayoutNewWatchFacePointerStyleBinding.bind(findChildViewById5);
                                i8 = R.id.include_time_preview;
                                View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.include_time_preview);
                                if (findChildViewById6 != null) {
                                    LayoutNewWatchFaceTimePreviewBinding bind5 = LayoutNewWatchFaceTimePreviewBinding.bind(findChildViewById6);
                                    i8 = R.id.include_time_style;
                                    View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.include_time_style);
                                    if (findChildViewById7 != null) {
                                        LayoutNewWatchFaceTimeStyleBinding bind6 = LayoutNewWatchFaceTimeStyleBinding.bind(findChildViewById7);
                                        i8 = R.id.iv_img_preview;
                                        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_img_preview);
                                        if (roundedImageView != null) {
                                            i8 = R.id.rl_preview;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_preview);
                                            if (relativeLayout != null) {
                                                return new FragmentNewCustomWatchFaceBinding((RelativeLayout) view, findChildViewById, button, bind, bind2, bind3, bind4, bind5, bind6, roundedImageView, relativeLayout);
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
    public static FragmentNewCustomWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentNewCustomWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_new_custom_watch_face, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
