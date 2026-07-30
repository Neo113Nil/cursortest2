package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;
import com.yanzhenjie.recyclerview.SwipeRecyclerView;

/* loaded from: classes2.dex */
public final class ActivityLocalMusicMainBinding implements ViewBinding {

    @NonNull
    public final BandDataAppbarBinding appbar;

    @NonNull
    public final ImageView ivEmpty;

    @NonNull
    public final RelativeLayout rlEmpty;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final SwipeRecyclerView rvSongs;

    @NonNull
    public final ShadowLayout shadowAdd;

    @NonNull
    public final TextView tvAdd;

    @NonNull
    public final TextView tvDescription;

    private ActivityLocalMusicMainBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull SwipeRecyclerView swipeRecyclerView, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = coordinatorLayout;
        this.appbar = bandDataAppbarBinding;
        this.ivEmpty = imageView;
        this.rlEmpty = relativeLayout;
        this.rvSongs = swipeRecyclerView;
        this.shadowAdd = shadowLayout;
        this.tvAdd = textView;
        this.tvDescription = textView2;
    }

    @NonNull
    public static ActivityLocalMusicMainBinding bind(@NonNull View view) {
        int i8 = R.id.appbar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.appbar);
        if (findChildViewById != null) {
            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
            i8 = R.id.iv_empty;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_empty);
            if (imageView != null) {
                i8 = R.id.rl_empty;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_empty);
                if (relativeLayout != null) {
                    i8 = R.id.rv_songs;
                    SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) ViewBindings.findChildViewById(view, R.id.rv_songs);
                    if (swipeRecyclerView != null) {
                        i8 = R.id.shadow_add;
                        ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, R.id.shadow_add);
                        if (shadowLayout != null) {
                            i8 = R.id.tv_add;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_add);
                            if (textView != null) {
                                i8 = R.id.tv_description;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                                if (textView2 != null) {
                                    return new ActivityLocalMusicMainBinding((CoordinatorLayout) view, bind, imageView, relativeLayout, swipeRecyclerView, shadowLayout, textView, textView2);
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
    public static ActivityLocalMusicMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityLocalMusicMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_local_music_main, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
