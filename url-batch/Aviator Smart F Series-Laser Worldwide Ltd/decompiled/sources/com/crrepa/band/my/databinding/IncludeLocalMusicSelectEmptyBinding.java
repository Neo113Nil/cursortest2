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
public final class IncludeLocalMusicSelectEmptyBinding implements ViewBinding {

    @NonNull
    public final ImageView ivEmpty;

    @NonNull
    public final RelativeLayout rlEmpty;

    @NonNull
    private final RelativeLayout rootView;

    private IncludeLocalMusicSelectEmptyBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.ivEmpty = imageView;
        this.rlEmpty = relativeLayout2;
    }

    @NonNull
    public static IncludeLocalMusicSelectEmptyBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_empty);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.iv_empty)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new IncludeLocalMusicSelectEmptyBinding(relativeLayout, imageView, relativeLayout);
    }

    @NonNull
    public static IncludeLocalMusicSelectEmptyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static IncludeLocalMusicSelectEmptyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.include_local_music_select_empty, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
