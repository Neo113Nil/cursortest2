package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityWebBinding implements ViewBinding {

    @NonNull
    public final ImageView ivBack;

    @NonNull
    public final LinearLayout llWeb;

    @NonNull
    public final RelativeLayout rlTitle;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvTitle;

    private ActivityWebBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.ivBack = imageView;
        this.llWeb = linearLayout2;
        this.rlTitle = relativeLayout;
        this.tvTitle = textView;
    }

    @NonNull
    public static ActivityWebBinding bind(@NonNull View view) {
        int i8 = R.id.iv_back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_back);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i8 = R.id.rl_title;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title);
            if (relativeLayout != null) {
                i8 = R.id.tv_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView != null) {
                    return new ActivityWebBinding(linearLayout, imageView, linearLayout, relativeLayout, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityWebBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWebBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_web, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
