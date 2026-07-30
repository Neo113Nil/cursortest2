package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.coach.widget.CustomExoPlayerTimeBar;

/* loaded from: classes4.dex */
public final class CustomExoVideoPlayerControlViewBinding implements ViewBinding {

    @NonNull
    public final FrameLayout exoController;

    @NonNull
    public final TextView exoDuration;

    @NonNull
    public final ImageView exoNext;

    @NonNull
    public final ImageView exoPause;

    @NonNull
    public final ImageView exoPlay;

    @NonNull
    public final TextView exoPosition;

    @NonNull
    public final ImageView exoPrev;

    @NonNull
    public final CustomExoPlayerTimeBar exoProgress;

    @NonNull
    public final RelativeLayout rlExoController;

    @NonNull
    public final RelativeLayout rlTimeBar;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View viewClose;

    @NonNull
    public final View viewFullScreen;

    private CustomExoVideoPlayerControlViewBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull ImageView imageView4, @NonNull CustomExoPlayerTimeBar customExoPlayerTimeBar, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull View view, @NonNull View view2) {
        this.rootView = frameLayout;
        this.exoController = frameLayout2;
        this.exoDuration = textView;
        this.exoNext = imageView;
        this.exoPause = imageView2;
        this.exoPlay = imageView3;
        this.exoPosition = textView2;
        this.exoPrev = imageView4;
        this.exoProgress = customExoPlayerTimeBar;
        this.rlExoController = relativeLayout;
        this.rlTimeBar = relativeLayout2;
        this.viewClose = view;
        this.viewFullScreen = view2;
    }

    @NonNull
    public static CustomExoVideoPlayerControlViewBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        FrameLayout frameLayout = (FrameLayout) view;
        int i8 = R$id.exo_duration;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
        if (textView != null) {
            i8 = R$id.exo_next;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView != null) {
                i8 = R$id.exo_pause;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                if (imageView2 != null) {
                    i8 = R$id.exo_play;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i8);
                    if (imageView3 != null) {
                        i8 = R$id.exo_position;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView2 != null) {
                            i8 = R$id.exo_prev;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i8);
                            if (imageView4 != null) {
                                i8 = R$id.exo_progress;
                                CustomExoPlayerTimeBar customExoPlayerTimeBar = (CustomExoPlayerTimeBar) ViewBindings.findChildViewById(view, i8);
                                if (customExoPlayerTimeBar != null) {
                                    i8 = R$id.rl_exo_controller;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                    if (relativeLayout != null) {
                                        i8 = R$id.rl_time_bar;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                        if (relativeLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.view_close))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i8 = R$id.view_full_screen))) != null) {
                                            return new CustomExoVideoPlayerControlViewBinding(frameLayout, frameLayout, textView, imageView, imageView2, imageView3, textView2, imageView4, customExoPlayerTimeBar, relativeLayout, relativeLayout2, findChildViewById, findChildViewById2);
                                        }
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
    public static CustomExoVideoPlayerControlViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static CustomExoVideoPlayerControlViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.custom_exo_video_player_control_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
