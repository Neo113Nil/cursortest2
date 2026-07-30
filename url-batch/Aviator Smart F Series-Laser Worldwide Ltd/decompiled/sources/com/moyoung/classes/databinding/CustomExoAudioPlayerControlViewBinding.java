package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.coach.widget.CustomExoPlayerTimeBar;

/* loaded from: classes4.dex */
public final class CustomExoAudioPlayerControlViewBinding implements ViewBinding {

    @NonNull
    public final FrameLayout exoController;

    @NonNull
    public final TextView exoDuration;

    @NonNull
    public final TextView exoFfwd;

    @NonNull
    public final ImageView exoPause;

    @NonNull
    public final ImageView exoPlay;

    @NonNull
    public final TextView exoPosition;

    @NonNull
    public final CustomExoPlayerTimeBar exoProgress;

    @NonNull
    public final TextView exoRew;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View viewCenter;

    private CustomExoAudioPlayerControlViewBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull CustomExoPlayerTimeBar customExoPlayerTimeBar, @NonNull TextView textView4, @NonNull View view) {
        this.rootView = frameLayout;
        this.exoController = frameLayout2;
        this.exoDuration = textView;
        this.exoFfwd = textView2;
        this.exoPause = imageView;
        this.exoPlay = imageView2;
        this.exoPosition = textView3;
        this.exoProgress = customExoPlayerTimeBar;
        this.exoRew = textView4;
        this.viewCenter = view;
    }

    @NonNull
    public static CustomExoAudioPlayerControlViewBinding bind(@NonNull View view) {
        View findChildViewById;
        FrameLayout frameLayout = (FrameLayout) view;
        int i8 = R$id.exo_duration;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
        if (textView != null) {
            i8 = R$id.exo_ffwd;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
            if (textView2 != null) {
                i8 = R$id.exo_pause;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
                if (imageView != null) {
                    i8 = R$id.exo_play;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                    if (imageView2 != null) {
                        i8 = R$id.exo_position;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView3 != null) {
                            i8 = R$id.exo_progress;
                            CustomExoPlayerTimeBar customExoPlayerTimeBar = (CustomExoPlayerTimeBar) ViewBindings.findChildViewById(view, i8);
                            if (customExoPlayerTimeBar != null) {
                                i8 = R$id.exo_rew;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.view_center))) != null) {
                                    return new CustomExoAudioPlayerControlViewBinding(frameLayout, frameLayout, textView, textView2, imageView, imageView2, textView3, customExoPlayerTimeBar, textView4, findChildViewById);
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
    public static CustomExoAudioPlayerControlViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static CustomExoAudioPlayerControlViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.custom_exo_audio_player_control_view, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
