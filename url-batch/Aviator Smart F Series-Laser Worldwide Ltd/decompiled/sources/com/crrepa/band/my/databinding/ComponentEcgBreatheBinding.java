package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.widget.Space;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ComponentEcgBreatheBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBottom;

    @NonNull
    public final ImageView ivLeft;

    @NonNull
    public final ImageView ivRight;

    @NonNull
    public final ImageView ivTop;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final Space viewCenter;

    private ComponentEcgBreatheBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull Space space) {
        this.rootView = relativeLayout;
        this.ivBottom = imageView;
        this.ivLeft = imageView2;
        this.ivRight = imageView3;
        this.ivTop = imageView4;
        this.viewCenter = space;
    }

    @NonNull
    public static ComponentEcgBreatheBinding bind(@NonNull View view) {
        int i8 = R.id.iv_bottom;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_bottom);
        if (imageView != null) {
            i8 = R.id.iv_left;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_left);
            if (imageView2 != null) {
                i8 = R.id.iv_right;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_right);
                if (imageView3 != null) {
                    i8 = R.id.iv_top;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_top);
                    if (imageView4 != null) {
                        i8 = R.id.view_center;
                        Space space = (Space) ViewBindings.findChildViewById(view, R.id.view_center);
                        if (space != null) {
                            return new ComponentEcgBreatheBinding((RelativeLayout) view, imageView, imageView2, imageView3, imageView4, space);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ComponentEcgBreatheBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ComponentEcgBreatheBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.component_ecg_breathe, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
