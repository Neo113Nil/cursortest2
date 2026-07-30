package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogPermissionExplainBinding implements ViewBinding {

    @NonNull
    public final TextView btnEnable;

    @NonNull
    public final TextView btnNotNow;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvContent1;

    @NonNull
    public final TextView tvTips;

    @NonNull
    public final TextView tvTitle;

    private DialogPermissionExplainBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = frameLayout;
        this.btnEnable = textView;
        this.btnNotNow = textView2;
        this.ivIcon = imageView;
        this.tvContent1 = textView3;
        this.tvTips = textView4;
        this.tvTitle = textView5;
    }

    @NonNull
    public static DialogPermissionExplainBinding bind(@NonNull View view) {
        int i8 = R.id.btn_enable;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btn_enable);
        if (textView != null) {
            i8 = R.id.btn_not_now;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.btn_not_now);
            if (textView2 != null) {
                i8 = R.id.iv_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon);
                if (imageView != null) {
                    i8 = R.id.tv_content_1;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content_1);
                    if (textView3 != null) {
                        i8 = R.id.tv_tips;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_tips);
                        if (textView4 != null) {
                            i8 = R.id.tv_title;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                            if (textView5 != null) {
                                return new DialogPermissionExplainBinding((FrameLayout) view, textView, textView2, imageView, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogPermissionExplainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogPermissionExplainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_permission_explain, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
