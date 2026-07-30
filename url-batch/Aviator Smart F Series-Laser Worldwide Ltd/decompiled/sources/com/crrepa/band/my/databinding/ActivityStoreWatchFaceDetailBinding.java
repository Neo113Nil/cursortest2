package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ActivityStoreWatchFaceDetailBinding implements ViewBinding {

    @NonNull
    public final Button btnRefresh;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final RoundedImageView ivWatchFacePreview;

    @NonNull
    public final LinearLayout llWatchFaceBase;

    @NonNull
    public final View noWifi;

    @NonNull
    public final ProgressBar pbWatchFace;

    @NonNull
    public final RecyclerView rcvWatchFace;

    @NonNull
    public final RelativeLayout rlNetError;

    @NonNull
    public final RelativeLayout rlOperation;

    @NonNull
    public final RelativeLayout rlTips;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ShadowLayout shadowApply;

    @NonNull
    public final ShadowLayout shadowSkipEditWatchFace;

    @NonNull
    public final TextView tvApply;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvDescriptionTitle;

    @NonNull
    public final TextView tvDesigner;

    @NonNull
    public final TextView tvDownloads;

    @NonNull
    public final TextView tvFileSize;

    @NonNull
    public final TextView tvIsDownloaded;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final TextView tvPrice;

    @NonNull
    public final TextView tvSimilarWatchFacesTitle;

    @NonNull
    public final TextView tvSkipEditWatchFace;

    @NonNull
    public final TextView tvTips;

    @NonNull
    public final TextView tvUploadProgress;

    private ActivityStoreWatchFaceDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RoundedImageView roundedImageView, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull ShadowLayout shadowLayout, @NonNull ShadowLayout shadowLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13) {
        this.rootView = relativeLayout;
        this.btnRefresh = button;
        this.ivIcon = imageView;
        this.ivTitleBack = imageView2;
        this.ivWatchFacePreview = roundedImageView;
        this.llWatchFaceBase = linearLayout;
        this.noWifi = view;
        this.pbWatchFace = progressBar;
        this.rcvWatchFace = recyclerView;
        this.rlNetError = relativeLayout2;
        this.rlOperation = relativeLayout3;
        this.rlTips = relativeLayout4;
        this.shadowApply = shadowLayout;
        this.shadowSkipEditWatchFace = shadowLayout2;
        this.tvApply = textView;
        this.tvDescription = textView2;
        this.tvDescriptionTitle = textView3;
        this.tvDesigner = textView4;
        this.tvDownloads = textView5;
        this.tvFileSize = textView6;
        this.tvIsDownloaded = textView7;
        this.tvName = textView8;
        this.tvPrice = textView9;
        this.tvSimilarWatchFacesTitle = textView10;
        this.tvSkipEditWatchFace = textView11;
        this.tvTips = textView12;
        this.tvUploadProgress = textView13;
    }

    @NonNull
    public static ActivityStoreWatchFaceDetailBinding bind(@NonNull View view) {
        int i8 = R.id.btn_refresh;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_refresh);
        if (button != null) {
            i8 = R.id.iv_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon);
            if (imageView != null) {
                i8 = R.id.iv_title_back;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                if (imageView2 != null) {
                    i8 = R.id.iv_watch_face_preview;
                    RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_watch_face_preview);
                    if (roundedImageView != null) {
                        i8 = R.id.ll_watch_face_base;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_watch_face_base);
                        if (linearLayout != null) {
                            i8 = R.id.no_wifi;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.no_wifi);
                            if (findChildViewById != null) {
                                i8 = R.id.pb_watch_face;
                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_watch_face);
                                if (progressBar != null) {
                                    i8 = R.id.rcv_watch_face;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_watch_face);
                                    if (recyclerView != null) {
                                        i8 = R.id.rl_net_error;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_net_error);
                                        if (relativeLayout != null) {
                                            i8 = R.id.rl_operation;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_operation);
                                            if (relativeLayout2 != null) {
                                                i8 = R.id.rl_tips;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_tips);
                                                if (relativeLayout3 != null) {
                                                    i8 = R.id.shadow_apply;
                                                    ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_apply);
                                                    if (shadowLayout != null) {
                                                        i8 = R.id.shadow_skip_edit_watch_face;
                                                        ShadowLayout shadowLayout2 = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_skip_edit_watch_face);
                                                        if (shadowLayout2 != null) {
                                                            i8 = R.id.tv_apply;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_apply);
                                                            if (textView != null) {
                                                                i8 = R.id.tv_description;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                                                                if (textView2 != null) {
                                                                    i8 = R.id.tv_description_title;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description_title);
                                                                    if (textView3 != null) {
                                                                        i8 = R.id.tv_designer;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_designer);
                                                                        if (textView4 != null) {
                                                                            i8 = R.id.tv_downloads;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_downloads);
                                                                            if (textView5 != null) {
                                                                                i8 = R.id.tv_file_size;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_file_size);
                                                                                if (textView6 != null) {
                                                                                    i8 = R.id.tv_is_downloaded;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_is_downloaded);
                                                                                    if (textView7 != null) {
                                                                                        i8 = R.id.tv_name;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                                                                                        if (textView8 != null) {
                                                                                            i8 = R.id.tv_price;
                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_price);
                                                                                            if (textView9 != null) {
                                                                                                i8 = R.id.tv_similar_watch_faces_title;
                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_similar_watch_faces_title);
                                                                                                if (textView10 != null) {
                                                                                                    i8 = R.id.tv_skip_edit_watch_face;
                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_skip_edit_watch_face);
                                                                                                    if (textView11 != null) {
                                                                                                        i8 = R.id.tv_tips;
                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_tips);
                                                                                                        if (textView12 != null) {
                                                                                                            i8 = R.id.tv_upload_progress;
                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_upload_progress);
                                                                                                            if (textView13 != null) {
                                                                                                                return new ActivityStoreWatchFaceDetailBinding((RelativeLayout) view, button, imageView, imageView2, roundedImageView, linearLayout, findChildViewById, progressBar, recyclerView, relativeLayout, relativeLayout2, relativeLayout3, shadowLayout, shadowLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
    public static ActivityStoreWatchFaceDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityStoreWatchFaceDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_store_watch_face_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
