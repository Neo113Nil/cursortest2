package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemPresetWatchFaceBinding implements ViewBinding {

    @NonNull
    public final Button btnWatchFaceEdit;

    @NonNull
    public final ImageView ivAddAlbum;

    @NonNull
    public final RoundedImageView ivPresetWatchFace;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvWatchFaceName;

    private ItemPresetWatchFaceBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull RoundedImageView roundedImageView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.btnWatchFaceEdit = button;
        this.ivAddAlbum = imageView;
        this.ivPresetWatchFace = roundedImageView;
        this.tvWatchFaceName = textView;
    }

    @NonNull
    public static ItemPresetWatchFaceBinding bind(@NonNull View view) {
        int i8 = R.id.btn_watch_face_edit;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_watch_face_edit);
        if (button != null) {
            i8 = R.id.iv_add_album;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_add_album);
            if (imageView != null) {
                i8 = R.id.iv_preset_watch_face;
                RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_preset_watch_face);
                if (roundedImageView != null) {
                    i8 = R.id.tv_watch_face_name;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_watch_face_name);
                    if (textView != null) {
                        return new ItemPresetWatchFaceBinding((LinearLayout) view, button, imageView, roundedImageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemPresetWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemPresetWatchFaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_preset_watch_face, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
