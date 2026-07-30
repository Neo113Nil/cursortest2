package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class LayoutNewCustomWatchFaceImgBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivAddImg;

    @NonNull
    public final RecyclerView rcvPresetList;

    @NonNull
    public final RelativeLayout rlAddImg;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvFaceEdit;

    @NonNull
    public final TextView tvTips;

    @NonNull
    public final TextView tvWatchFaceNum;

    private LayoutNewCustomWatchFaceImgBinding(@NonNull LinearLayout linearLayout, @NonNull RoundedImageView roundedImageView, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.ivAddImg = roundedImageView;
        this.rcvPresetList = recyclerView;
        this.rlAddImg = relativeLayout;
        this.tvFaceEdit = textView;
        this.tvTips = textView2;
        this.tvWatchFaceNum = textView3;
    }

    @NonNull
    public static LayoutNewCustomWatchFaceImgBinding bind(@NonNull View view) {
        int i8 = R.id.iv_add_img;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_add_img);
        if (roundedImageView != null) {
            i8 = R.id.rcv_preset_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_preset_list);
            if (recyclerView != null) {
                i8 = R.id.rl_add_img;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_add_img);
                if (relativeLayout != null) {
                    i8 = R.id.tv_face_edit;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_face_edit);
                    if (textView != null) {
                        i8 = R.id.tv_tips;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_tips);
                        if (textView2 != null) {
                            i8 = R.id.tv_watch_face_num;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_face_num);
                            if (textView3 != null) {
                                return new LayoutNewCustomWatchFaceImgBinding((LinearLayout) view, roundedImageView, recyclerView, relativeLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static LayoutNewCustomWatchFaceImgBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutNewCustomWatchFaceImgBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.layout_new_custom_watch_face_img, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
