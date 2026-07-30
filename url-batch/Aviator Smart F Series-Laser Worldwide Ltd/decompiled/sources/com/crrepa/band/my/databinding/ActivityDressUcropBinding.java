package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.yalantis.ucrop.view.UCropView;

/* loaded from: classes2.dex */
public final class ActivityDressUcropBinding implements ViewBinding {

    @NonNull
    public final Button btnCreateWatchFace;

    @NonNull
    public final Button btnTakePhoto;

    @NonNull
    public final FrameLayout controlsWrapper;

    @NonNull
    public final ImageView imageViewLogo;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final LinearLayout rlControl;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RelativeLayout toolbar;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final UCropView ucrop;

    @NonNull
    public final FrameLayout ucropFrame;

    @NonNull
    public final RelativeLayout ucropPhotobox;

    private ActivityDressUcropBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull UCropView uCropView, @NonNull FrameLayout frameLayout2, @NonNull RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.btnCreateWatchFace = button;
        this.btnTakePhoto = button2;
        this.controlsWrapper = frameLayout;
        this.imageViewLogo = imageView;
        this.ivTitleBack = imageView2;
        this.rlControl = linearLayout;
        this.toolbar = relativeLayout2;
        this.tvTitle = textView;
        this.ucrop = uCropView;
        this.ucropFrame = frameLayout2;
        this.ucropPhotobox = relativeLayout3;
    }

    @NonNull
    public static ActivityDressUcropBinding bind(@NonNull View view) {
        int i8 = R.id.btn_create_watch_face;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_create_watch_face);
        if (button != null) {
            i8 = R.id.btn_take_photo;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_take_photo);
            if (button2 != null) {
                i8 = R.id.controls_wrapper;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.controls_wrapper);
                if (frameLayout != null) {
                    i8 = R.id.image_view_logo;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.image_view_logo);
                    if (imageView != null) {
                        i8 = R.id.iv_title_back;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                        if (imageView2 != null) {
                            i8 = R.id.rl_control;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rl_control);
                            if (linearLayout != null) {
                                i8 = R.id.toolbar;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                if (relativeLayout != null) {
                                    i8 = R.id.tv_title;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                    if (textView != null) {
                                        i8 = R.id.ucrop;
                                        UCropView uCropView = (UCropView) ViewBindings.findChildViewById(view, R.id.ucrop);
                                        if (uCropView != null) {
                                            i8 = R.id.ucrop_frame;
                                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.ucrop_frame);
                                            if (frameLayout2 != null) {
                                                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                return new ActivityDressUcropBinding(relativeLayout2, button, button2, frameLayout, imageView, imageView2, linearLayout, relativeLayout, textView, uCropView, frameLayout2, relativeLayout2);
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
    public static ActivityDressUcropBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityDressUcropBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_dress_ucrop, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
