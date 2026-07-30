package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemCustomizedDeleteSearchHistoryBinding implements ViewBinding {

    @NonNull
    public final ImageView ivDeleteHistory;

    @NonNull
    public final RelativeLayout rlDeleteHistory;

    @NonNull
    private final RelativeLayout rootView;

    private ItemCustomizedDeleteSearchHistoryBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.ivDeleteHistory = imageView;
        this.rlDeleteHistory = relativeLayout2;
    }

    @NonNull
    public static ItemCustomizedDeleteSearchHistoryBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_delete_history);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.iv_delete_history)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new ItemCustomizedDeleteSearchHistoryBinding(relativeLayout, imageView, relativeLayout);
    }

    @NonNull
    public static ItemCustomizedDeleteSearchHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemCustomizedDeleteSearchHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_customized_delete_search_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
