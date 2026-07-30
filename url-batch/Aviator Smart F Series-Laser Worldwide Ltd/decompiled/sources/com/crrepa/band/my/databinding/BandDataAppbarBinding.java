package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes2.dex */
public final class BandDataAppbarBinding implements ViewBinding {

    @NonNull
    public final AppBarLayout appbar;

    @NonNull
    public final ImageView ivHistory;

    @NonNull
    public final ImageView ivHistory2;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    private final AppBarLayout rootView;

    @NonNull
    public final Toolbar toolbar;

    @NonNull
    public final CollapsingToolbarLayout toolbarLayout;

    @NonNull
    public final TextView tvEdit;

    @NonNull
    public final TextView tvExpandedTitle;

    @NonNull
    public final TextView tvTitle;

    private BandDataAppbarBinding(@NonNull AppBarLayout appBarLayout, @NonNull AppBarLayout appBarLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull Toolbar toolbar, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = appBarLayout;
        this.appbar = appBarLayout2;
        this.ivHistory = imageView;
        this.ivHistory2 = imageView2;
        this.ivTitleBack = imageView3;
        this.toolbar = toolbar;
        this.toolbarLayout = collapsingToolbarLayout;
        this.tvEdit = textView;
        this.tvExpandedTitle = textView2;
        this.tvTitle = textView3;
    }

    @NonNull
    public static BandDataAppbarBinding bind(@NonNull View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i8 = R.id.iv_history;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_history);
        if (imageView != null) {
            i8 = R.id.iv_history_2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_history_2);
            if (imageView2 != null) {
                i8 = R.id.iv_title_back;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                if (imageView3 != null) {
                    i8 = R.id.toolbar;
                    Toolbar toolbar = (Toolbar) ViewBindings.findChildViewById(view, R.id.toolbar);
                    if (toolbar != null) {
                        i8 = R.id.toolbar_layout;
                        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, R.id.toolbar_layout);
                        if (collapsingToolbarLayout != null) {
                            i8 = R.id.tv_edit;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_edit);
                            if (textView != null) {
                                i8 = R.id.tv_expanded_title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_expanded_title);
                                if (textView2 != null) {
                                    i8 = R.id.tv_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                    if (textView3 != null) {
                                        return new BandDataAppbarBinding(appBarLayout, appBarLayout, imageView, imageView2, imageView3, toolbar, collapsingToolbarLayout, textView, textView2, textView3);
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
    public static BandDataAppbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppBarLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BandDataAppbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.band_data_appbar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
