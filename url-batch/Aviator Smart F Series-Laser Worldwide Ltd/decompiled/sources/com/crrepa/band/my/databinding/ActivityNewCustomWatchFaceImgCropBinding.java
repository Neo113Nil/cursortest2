package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.watchfacenew.photo.widgets.CropImageView;

/* loaded from: classes2.dex */
public final class ActivityNewCustomWatchFaceImgCropBinding implements ViewBinding {

    @NonNull
    public final CropImageView cvCropImage;

    @NonNull
    public final RelativeLayout footerBar;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final RecyclerView rcvPreview;

    @NonNull
    public final RelativeLayout rlTop;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvCompletion;

    @NonNull
    public final TextView tvNext;

    @NonNull
    public final TextView tvSpace;

    private ActivityNewCustomWatchFaceImgCropBinding(@NonNull RelativeLayout relativeLayout, @NonNull CropImageView cropImageView, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = relativeLayout;
        this.cvCropImage = cropImageView;
        this.footerBar = relativeLayout2;
        this.ivTitleBack = imageView;
        this.rcvPreview = recyclerView;
        this.rlTop = relativeLayout3;
        this.tvCompletion = textView;
        this.tvNext = textView2;
        this.tvSpace = textView3;
    }

    @NonNull
    public static ActivityNewCustomWatchFaceImgCropBinding bind(@NonNull View view) {
        int i8 = R.id.cv_crop_image;
        CropImageView cropImageView = (CropImageView) ViewBindings.findChildViewById(view, R.id.cv_crop_image);
        if (cropImageView != null) {
            i8 = R.id.footer_bar;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.footer_bar);
            if (relativeLayout != null) {
                i8 = R.id.iv_title_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                if (imageView != null) {
                    i8 = R.id.rcv_preview;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_preview);
                    if (recyclerView != null) {
                        i8 = R.id.rl_top;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_top);
                        if (relativeLayout2 != null) {
                            i8 = R.id.tv_completion;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_completion);
                            if (textView != null) {
                                i8 = R.id.tv_next;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_next);
                                if (textView2 != null) {
                                    i8 = R.id.tv_space;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_space);
                                    if (textView3 != null) {
                                        return new ActivityNewCustomWatchFaceImgCropBinding((RelativeLayout) view, cropImageView, relativeLayout, imageView, recyclerView, relativeLayout2, textView, textView2, textView3);
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
    public static ActivityNewCustomWatchFaceImgCropBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityNewCustomWatchFaceImgCropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_new_custom_watch_face_img_crop, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
