package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityLocalPhotoMainBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding appbar;

    @NonNull
    public final CheckBox cbSelectAll;

    @NonNull
    public final ImageView ivEmpty;

    @NonNull
    public final RelativeLayout rlEmpty;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final RecyclerView rvPhoto;

    @NonNull
    public final ShadowLayout shadowAdd;

    @NonNull
    public final ShadowLayout shadowDelete;

    @NonNull
    public final TextView tvAdd;

    @NonNull
    public final TextView tvDelete;

    @NonNull
    public final TextView tvLimitTips;

    @NonNull
    public final TextView tvSelectAll;

    private ActivityLocalPhotoMainBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull CheckBox checkBox, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView, @NonNull ShadowLayout shadowLayout, @NonNull ShadowLayout shadowLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = coordinatorLayout;
        this.appbar = bandDataAppbarBinding;
        this.cbSelectAll = checkBox;
        this.ivEmpty = imageView;
        this.rlEmpty = relativeLayout;
        this.rvPhoto = recyclerView;
        this.shadowAdd = shadowLayout;
        this.shadowDelete = shadowLayout2;
        this.tvAdd = textView;
        this.tvDelete = textView2;
        this.tvLimitTips = textView3;
        this.tvSelectAll = textView4;
    }

    @NonNull
    public static ActivityLocalPhotoMainBinding bind(@NonNull View view) {
        int i8 = R.id.appbar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.appbar);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            i8 = R.id.cb_select_all;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_select_all);
            if (checkBox != null) {
                i8 = R.id.iv_empty;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_empty);
                if (imageView != null) {
                    i8 = R.id.rl_empty;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_empty);
                    if (relativeLayout != null) {
                        i8 = R.id.rv_photo;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_photo);
                        if (recyclerView != null) {
                            i8 = R.id.shadow_add;
                            ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_add);
                            if (shadowLayout != null) {
                                i8 = R.id.shadow_delete;
                                ShadowLayout shadowLayout2 = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_delete);
                                if (shadowLayout2 != null) {
                                    i8 = R.id.tv_add;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_add);
                                    if (textView != null) {
                                        i8 = R.id.tv_delete;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_delete);
                                        if (textView2 != null) {
                                            i8 = R.id.tv_limit_tips;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_limit_tips);
                                            if (textView3 != null) {
                                                i8 = R.id.tv_select_all;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_select_all);
                                                if (textView4 != null) {
                                                    return new ActivityLocalPhotoMainBinding((CoordinatorLayout) view, bind, checkBox, imageView, relativeLayout, recyclerView, shadowLayout, shadowLayout2, textView, textView2, textView3, textView4);
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
    public static ActivityLocalPhotoMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityLocalPhotoMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_local_photo_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
