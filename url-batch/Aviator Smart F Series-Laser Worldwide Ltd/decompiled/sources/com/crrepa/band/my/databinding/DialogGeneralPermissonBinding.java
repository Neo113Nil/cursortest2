package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class DialogGeneralPermissonBinding implements ViewBinding {

    @NonNull
    public final Button btnPermit;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivPermissionLogo;

    @NonNull
    public final View lineDivider;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvPermissionHint;

    @NonNull
    public final TextView tvPermissionRequest;

    private DialogGeneralPermissonBinding(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = frameLayout;
        this.btnPermit = button;
        this.ivClose = imageView;
        this.ivPermissionLogo = imageView2;
        this.lineDivider = view;
        this.tvPermissionHint = textView;
        this.tvPermissionRequest = textView2;
    }

    @NonNull
    public static DialogGeneralPermissonBinding bind(@NonNull View view) {
        int i8 = R.id.btn_permit;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_permit);
        if (button != null) {
            i8 = R.id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
            if (imageView != null) {
                i8 = R.id.iv_permission_logo;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_permission_logo);
                if (imageView2 != null) {
                    i8 = R.id.line_divider;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_divider);
                    if (findChildViewById != null) {
                        i8 = R.id.tv_permission_hint;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_permission_hint);
                        if (textView != null) {
                            i8 = R.id.tv_permission_request;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_permission_request);
                            if (textView2 != null) {
                                return new DialogGeneralPermissonBinding((FrameLayout) view, button, imageView, imageView2, findChildViewById, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogGeneralPermissonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogGeneralPermissonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.dialog_general_permisson, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
