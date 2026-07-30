package com.moyoung.dafit.module.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.dafit.module.common.R$id;
import com.moyoung.dafit.module.common.R$layout;

/* loaded from: classes4.dex */
public final class DialogCustomConfirmBinding implements ViewBinding {

    @NonNull
    public final View border;

    @NonNull
    public final ImageView ivIcon;

    @NonNull
    public final LinearLayout ll;

    @NonNull
    public final LinearLayout llOperation;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvContent;

    @NonNull
    public final TextView tvContentOnly;

    @NonNull
    public final TextView tvOk;

    @NonNull
    public final TextView tvTitle;

    private DialogCustomConfirmBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = frameLayout;
        this.border = view;
        this.ivIcon = imageView;
        this.ll = linearLayout;
        this.llOperation = linearLayout2;
        this.tvCancel = textView;
        this.tvContent = textView2;
        this.tvContentOnly = textView3;
        this.tvOk = textView4;
        this.tvTitle = textView5;
    }

    @NonNull
    public static DialogCustomConfirmBinding bind(@NonNull View view) {
        int i8 = R$id.border;
        View findChildViewById = ViewBindings.findChildViewById(view, i8);
        if (findChildViewById != null) {
            i8 = R$id.iv_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView != null) {
                i8 = R$id.ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                if (linearLayout != null) {
                    i8 = R$id.ll_operation;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                    if (linearLayout2 != null) {
                        i8 = R$id.tv_cancel;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView != null) {
                            i8 = R$id.tv_content;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                            if (textView2 != null) {
                                i8 = R$id.tv_content_only;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView3 != null) {
                                    i8 = R$id.tv_ok;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                    if (textView4 != null) {
                                        i8 = R$id.tv_title;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i8);
                                        if (textView5 != null) {
                                            return new DialogCustomConfirmBinding((FrameLayout) view, findChildViewById, imageView, linearLayout, linearLayout2, textView, textView2, textView3, textView4, textView5);
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
    public static DialogCustomConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogCustomConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.dialog_custom_confirm, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
