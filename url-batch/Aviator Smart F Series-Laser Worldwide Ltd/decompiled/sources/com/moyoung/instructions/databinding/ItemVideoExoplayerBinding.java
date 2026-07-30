package com.moyoung.instructions.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.instructions.R$id;
import com.moyoung.instructions.R$layout;

/* loaded from: classes4.dex */
public final class ItemVideoExoplayerBinding implements ViewBinding {

    @NonNull
    public final TextureView playerView;

    @NonNull
    private final RelativeLayout rootView;

    private ItemVideoExoplayerBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextureView textureView) {
        this.rootView = relativeLayout;
        this.playerView = textureView;
    }

    @NonNull
    public static ItemVideoExoplayerBinding bind(@NonNull View view) {
        int i8 = R$id.player_view;
        TextureView textureView = (TextureView) ViewBindings.findChildViewById(view, i8);
        if (textureView != null) {
            return new ItemVideoExoplayerBinding((RelativeLayout) view, textureView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ItemVideoExoplayerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ItemVideoExoplayerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.item_video_exoplayer, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
