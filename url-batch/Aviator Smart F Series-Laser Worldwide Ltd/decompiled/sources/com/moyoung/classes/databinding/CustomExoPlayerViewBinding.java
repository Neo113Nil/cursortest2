package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class CustomExoPlayerViewBinding implements ViewBinding {

    @NonNull
    public final FrameLayout exoAdOverlay;

    @NonNull
    public final ImageView exoArtwork;

    @NonNull
    public final ProgressBar exoBuffering;

    @NonNull
    public final AspectRatioFrameLayout exoContentFrame;

    @NonNull
    public final View exoControllerPlaceholder;

    @NonNull
    public final TextView exoErrorMessage;

    @NonNull
    public final FrameLayout exoOverlay;

    @NonNull
    public final View exoShutter;

    @NonNull
    public final SubtitleView exoSubtitles;

    @NonNull
    private final View rootView;

    private CustomExoPlayerViewBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ProgressBar progressBar, @NonNull AspectRatioFrameLayout aspectRatioFrameLayout, @NonNull View view2, @NonNull TextView textView, @NonNull FrameLayout frameLayout2, @NonNull View view3, @NonNull SubtitleView subtitleView) {
        this.rootView = view;
        this.exoAdOverlay = frameLayout;
        this.exoArtwork = imageView;
        this.exoBuffering = progressBar;
        this.exoContentFrame = aspectRatioFrameLayout;
        this.exoControllerPlaceholder = view2;
        this.exoErrorMessage = textView;
        this.exoOverlay = frameLayout2;
        this.exoShutter = view3;
        this.exoSubtitles = subtitleView;
    }

    @NonNull
    public static CustomExoPlayerViewBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i8 = R$id.exo_ad_overlay;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
        if (frameLayout != null) {
            i8 = R$id.exo_artwork;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView != null) {
                i8 = R$id.exo_buffering;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i8);
                if (progressBar != null) {
                    i8 = R$id.exo_content_frame;
                    AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) ViewBindings.findChildViewById(view, i8);
                    if (aspectRatioFrameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.exo_controller_placeholder))) != null) {
                        i8 = R$id.exo_error_message;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView != null) {
                            i8 = R$id.exo_overlay;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i8);
                            if (frameLayout2 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i8 = R$id.exo_shutter))) != null) {
                                i8 = R$id.exo_subtitles;
                                SubtitleView subtitleView = (SubtitleView) ViewBindings.findChildViewById(view, i8);
                                if (subtitleView != null) {
                                    return new CustomExoPlayerViewBinding(view, frameLayout, imageView, progressBar, aspectRatioFrameLayout, findChildViewById, textView, frameLayout2, findChildViewById2, subtitleView);
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
    public static CustomExoPlayerViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.custom_exo_player_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
