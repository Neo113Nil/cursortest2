package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes2.dex */
public final class ActivityGuidanceLocationPermissionBinding implements ViewBinding {

    @NonNull
    public final TextView btnEnable;

    @NonNull
    public final ShadowLayout llEnable;

    @NonNull
    public final TextureView playerView;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvNoThanks;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final View vTextTop;

    @NonNull
    public final View viewBottom;

    @NonNull
    public final View viewCenter;

    private ActivityGuidanceLocationPermissionBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ShadowLayout shadowLayout, @NonNull TextureView textureView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.rootView = relativeLayout;
        this.btnEnable = textView;
        this.llEnable = shadowLayout;
        this.playerView = textureView;
        this.tvContent = textView2;
        this.tvNoThanks = textView3;
        this.tvTitle = textView4;
        this.vTextTop = view;
        this.viewBottom = view2;
        this.viewCenter = view3;
    }

    @NonNull
    public static ActivityGuidanceLocationPermissionBinding bind(@NonNull View view) {
        int i8 = R.id.btn_enable;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btn_enable);
        if (textView != null) {
            i8 = R.id.ll_enable;
            ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.ll_enable);
            if (shadowLayout != null) {
                i8 = R.id.player_view;
                TextureView textureView = (TextureView) ViewBindings.findChildViewById(view, R.id.player_view);
                if (textureView != null) {
                    i8 = R.id.tv_content;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                    if (textView2 != null) {
                        i8 = R.id.tv_no_thanks;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_no_thanks);
                        if (textView3 != null) {
                            i8 = R.id.tv_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                            if (textView4 != null) {
                                i8 = R.id.v_text_top;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_text_top);
                                if (findChildViewById != null) {
                                    i8 = R.id.view_bottom;
                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view_bottom);
                                    if (findChildViewById2 != null) {
                                        i8 = R.id.view_center;
                                        View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.view_center);
                                        if (findChildViewById3 != null) {
                                            return new ActivityGuidanceLocationPermissionBinding((RelativeLayout) view, textView, shadowLayout, textureView, textView2, textView3, textView4, findChildViewById, findChildViewById2, findChildViewById3);
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
    public static ActivityGuidanceLocationPermissionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityGuidanceLocationPermissionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_guidance_location_permission, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
