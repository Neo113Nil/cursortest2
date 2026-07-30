package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ItemNavigationSearchHistoryBinding implements ViewBinding {

    @NonNull
    public final ImageView ivGoLocation;

    @NonNull
    public final ImageView ivHistoryType;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvHistoryName;

    private ItemNavigationSearchHistoryBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.rootView = relativeLayout;
        this.ivGoLocation = imageView;
        this.ivHistoryType = imageView2;
        this.tvHistoryName = textView;
    }

    @NonNull
    public static ItemNavigationSearchHistoryBinding bind(@NonNull View view) {
        int i8 = R.id.iv_go_location;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_go_location);
        if (imageView != null) {
            i8 = R.id.iv_history_type;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_history_type);
            if (imageView2 != null) {
                i8 = R.id.tv_history_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_history_name);
                if (textView != null) {
                    return new ItemNavigationSearchHistoryBinding((RelativeLayout) view, imageView, imageView2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemNavigationSearchHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemNavigationSearchHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.item_navigation_search_history, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
