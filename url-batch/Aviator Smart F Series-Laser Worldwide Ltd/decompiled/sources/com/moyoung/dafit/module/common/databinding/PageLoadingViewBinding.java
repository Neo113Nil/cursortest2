package com.moyoung.dafit.module.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.dafit.module.common.R$id;
import com.moyoung.dafit.module.common.R$layout;

/* loaded from: classes4.dex */
public final class PageLoadingViewBinding implements ViewBinding {

    @NonNull
    public final ProgressBar progress;

    @NonNull
    private final FrameLayout rootView;

    private PageLoadingViewBinding(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.progress = progressBar;
    }

    @NonNull
    public static PageLoadingViewBinding bind(@NonNull View view) {
        int i8 = R$id.progress;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i8);
        if (progressBar != null) {
            return new PageLoadingViewBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static PageLoadingViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static PageLoadingViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.page_loading_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
