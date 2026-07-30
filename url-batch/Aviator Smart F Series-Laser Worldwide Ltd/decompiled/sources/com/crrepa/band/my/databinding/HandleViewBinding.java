package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class HandleViewBinding implements ViewBinding {

    @NonNull
    public final ImageView ivHandle;

    @NonNull
    public final ImageView ivHandleLine;

    @NonNull
    private final LinearLayout rootView;

    private HandleViewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = linearLayout;
        this.ivHandle = imageView;
        this.ivHandleLine = imageView2;
    }

    @NonNull
    public static HandleViewBinding bind(@NonNull View view) {
        int i8 = R.id.iv_handle;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_handle);
        if (imageView != null) {
            i8 = R.id.iv_handle_line;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_handle_line);
            if (imageView2 != null) {
                return new HandleViewBinding((LinearLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static HandleViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HandleViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.handle_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
