package com.moyoung.dafit.module.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.dafit.module.common.R$id;
import com.moyoung.dafit.module.common.R$layout;

/* loaded from: classes4.dex */
public final class DialogCustomUploadingBinding implements ViewBinding {

    @NonNull
    public final LinearLayout ll;

    @NonNull
    public final ProgressBar pb;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvCancel;

    @NonNull
    public final TextView tvProgress;

    @NonNull
    public final TextView tvTitle;

    private DialogCustomUploadingBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = frameLayout;
        this.ll = linearLayout;
        this.pb = progressBar;
        this.tvCancel = textView;
        this.tvProgress = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static DialogCustomUploadingBinding bind(@NonNull View view) {
        int i8 = R$id.ll;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
        if (linearLayout != null) {
            i8 = R$id.pb;
            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i8);
            if (progressBar != null) {
                i8 = R$id.tv_cancel;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                if (textView != null) {
                    i8 = R$id.tv_progress;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView2 != null) {
                        i8 = R$id.tv_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView3 != null) {
                            return new DialogCustomUploadingBinding((FrameLayout) view, linearLayout, progressBar, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogCustomUploadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogCustomUploadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.dialog_custom_uploading, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
