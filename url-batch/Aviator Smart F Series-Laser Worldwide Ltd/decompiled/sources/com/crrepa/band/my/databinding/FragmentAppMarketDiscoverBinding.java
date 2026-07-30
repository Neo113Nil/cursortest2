package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class FragmentAppMarketDiscoverBinding implements ViewBinding {

    @NonNull
    public final ImageView ivOpenharmonyBanner;

    @NonNull
    private final NestedScrollView rootView;

    @NonNull
    public final RecyclerView rvAllApps;

    @NonNull
    public final RecyclerView rvTags;

    @NonNull
    public final TextView tvAllAppTitle;

    private FragmentAppMarketDiscoverBinding(@NonNull NestedScrollView nestedScrollView, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull TextView textView) {
        this.rootView = nestedScrollView;
        this.ivOpenharmonyBanner = imageView;
        this.rvAllApps = recyclerView;
        this.rvTags = recyclerView2;
        this.tvAllAppTitle = textView;
    }

    @NonNull
    public static FragmentAppMarketDiscoverBinding bind(@NonNull View view) {
        int i8 = R.id.iv_openharmony_banner;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_openharmony_banner);
        if (imageView != null) {
            i8 = R.id.rv_all_apps;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_all_apps);
            if (recyclerView != null) {
                i8 = R.id.rv_tags;
                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_tags);
                if (recyclerView2 != null) {
                    i8 = R.id.tv_all_app_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_all_app_title);
                    if (textView != null) {
                        return new FragmentAppMarketDiscoverBinding((NestedScrollView) view, imageView, recyclerView, recyclerView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static FragmentAppMarketDiscoverBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FragmentAppMarketDiscoverBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.fragment_app_market_discover, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
