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
import com.moyoung.dafit.module.common.widgets.GifImageView;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ActivityAiPictureReslutBinding implements ViewBinding {

    @NonNull
    public final Button btnEditWatchFace;

    @NonNull
    public final Button btnRetry;

    @NonNull
    public final Button btnSave;

    @NonNull
    public final Button btnSaveDisable;

    @NonNull
    public final GifImageView gifLoading;

    @NonNull
    public final RoundedImageView ivAiPicture;

    @NonNull
    public final ImageView ivAiServiceError;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final LinearLayout llAiServiceError;

    @NonNull
    public final LinearLayout llOperation;

    @NonNull
    public final RelativeLayout rlRootView;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout shadowEditWatchFace;

    @NonNull
    public final ShadowLayout shadowRetry;

    @NonNull
    public final ShadowLayout shadowSave;

    @NonNull
    public final ShadowLayout shadowSaveDisable;

    @NonNull
    public final RelativeLayout titleBar;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvDrawingStyle;

    @NonNull
    public final TextView tvHistory;

    @NonNull
    public final TextView tvTitle;

    private ActivityAiPictureReslutBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull GifImageView gifImageView, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2, @NonNull ShadowLayout shadowLayout, @NonNull ShadowLayout shadowLayout2, @NonNull ShadowLayout shadowLayout3, @NonNull ShadowLayout shadowLayout4, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = relativeLayout;
        this.btnEditWatchFace = button;
        this.btnRetry = button2;
        this.btnSave = button3;
        this.btnSaveDisable = button4;
        this.gifLoading = gifImageView;
        this.ivAiPicture = roundedImageView;
        this.ivAiServiceError = imageView;
        this.ivTitleBack = imageView2;
        this.llAiServiceError = linearLayout;
        this.llOperation = linearLayout2;
        this.rlRootView = relativeLayout2;
        this.shadowEditWatchFace = shadowLayout;
        this.shadowRetry = shadowLayout2;
        this.shadowSave = shadowLayout3;
        this.shadowSaveDisable = shadowLayout4;
        this.titleBar = relativeLayout3;
        this.tvDescription = textView;
        this.tvDrawingStyle = textView2;
        this.tvHistory = textView3;
        this.tvTitle = textView4;
    }

    @NonNull
    public static ActivityAiPictureReslutBinding bind(@NonNull View view) {
        int i8 = R.id.btn_edit_watch_face;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_edit_watch_face);
        if (button != null) {
            i8 = R.id.btn_retry;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btn_retry);
            if (button2 != null) {
                i8 = R.id.btn_save;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.btn_save);
                if (button3 != null) {
                    i8 = R.id.btn_save_disable;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.btn_save_disable);
                    if (button4 != null) {
                        i8 = R.id.gif_loading;
                        GifImageView gifImageView = (GifImageView) ViewBindings.findChildViewById(view, R.id.gif_loading);
                        if (gifImageView != null) {
                            i8 = R.id.iv_ai_picture;
                            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_ai_picture);
                            if (roundedImageView != null) {
                                i8 = R.id.iv_ai_service_error;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_ai_service_error);
                                if (imageView != null) {
                                    i8 = R.id.iv_title_back;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                                    if (imageView2 != null) {
                                        i8 = R.id.ll_ai_service_error;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_ai_service_error);
                                        if (linearLayout != null) {
                                            i8 = R.id.ll_operation;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_operation);
                                            if (linearLayout2 != null) {
                                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                                i8 = R.id.shadow_edit_watch_face;
                                                ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_edit_watch_face);
                                                if (shadowLayout != null) {
                                                    i8 = R.id.shadow_retry;
                                                    ShadowLayout shadowLayout2 = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_retry);
                                                    if (shadowLayout2 != null) {
                                                        i8 = R.id.shadow_save;
                                                        ShadowLayout shadowLayout3 = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_save);
                                                        if (shadowLayout3 != null) {
                                                            i8 = R.id.shadow_save_disable;
                                                            ShadowLayout shadowLayout4 = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_save_disable);
                                                            if (shadowLayout4 != null) {
                                                                i8 = R.id.title_bar;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.title_bar);
                                                                if (relativeLayout2 != null) {
                                                                    i8 = R.id.tv_description;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                                                                    if (textView != null) {
                                                                        i8 = R.id.tv_drawing_style;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_drawing_style);
                                                                        if (textView2 != null) {
                                                                            i8 = R.id.tv_history;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_history);
                                                                            if (textView3 != null) {
                                                                                i8 = R.id.tv_title;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                                if (textView4 != null) {
                                                                                    return new ActivityAiPictureReslutBinding(relativeLayout, button, button2, button3, button4, gifImageView, roundedImageView, imageView, imageView2, linearLayout, linearLayout2, relativeLayout, shadowLayout, shadowLayout2, shadowLayout3, shadowLayout4, relativeLayout2, textView, textView2, textView3, textView4);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityAiPictureReslutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityAiPictureReslutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_ai_picture_reslut, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
