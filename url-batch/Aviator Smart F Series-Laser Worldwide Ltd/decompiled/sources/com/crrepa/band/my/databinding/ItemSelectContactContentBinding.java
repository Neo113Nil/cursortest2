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
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes2.dex */
public final class ItemSelectContactContentBinding implements ViewBinding {

    @NonNull
    public final RoundedImageView ivAvatar;

    @NonNull
    public final ImageView ivAvatarLine;

    @NonNull
    public final ImageView ivChecked;

    @NonNull
    public final RelativeLayout rlAvatar;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvAvatar;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final TextView tvNumber;

    @NonNull
    public final View viewLevel1;

    @NonNull
    public final View viewLevel2;

    private ItemSelectContactContentBinding(@NonNull RelativeLayout relativeLayout, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view, @NonNull View view2) {
        this.rootView = relativeLayout;
        this.ivAvatar = roundedImageView;
        this.ivAvatarLine = imageView;
        this.ivChecked = imageView2;
        this.rlAvatar = relativeLayout2;
        this.tvAvatar = textView;
        this.tvName = textView2;
        this.tvNumber = textView3;
        this.viewLevel1 = view;
        this.viewLevel2 = view2;
    }

    @NonNull
    public static ItemSelectContactContentBinding bind(@NonNull View view) {
        int i8 = R.id.iv_avatar;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar);
        if (roundedImageView != null) {
            i8 = R.id.iv_avatar_line;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_avatar_line);
            if (imageView != null) {
                i8 = R.id.iv_checked;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_checked);
                if (imageView2 != null) {
                    i8 = R.id.rl_avatar;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_avatar);
                    if (relativeLayout != null) {
                        i8 = R.id.tv_avatar;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_avatar);
                        if (textView != null) {
                            i8 = R.id.tv_name;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                            if (textView2 != null) {
                                i8 = R.id.tv_number;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_number);
                                if (textView3 != null) {
                                    i8 = R.id.view_level1;
                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_level1);
                                    if (findChildViewById != null) {
                                        i8 = R.id.view_level2;
                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view_level2);
                                        if (findChildViewById2 != null) {
                                            return new ItemSelectContactContentBinding((RelativeLayout) view, roundedImageView, imageView, imageView2, relativeLayout, textView, textView2, textView3, findChildViewById, findChildViewById2);
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
    public static ItemSelectContactContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemSelectContactContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_select_contact_content, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
