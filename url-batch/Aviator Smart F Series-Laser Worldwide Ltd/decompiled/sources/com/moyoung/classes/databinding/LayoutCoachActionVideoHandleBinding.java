package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;

/* loaded from: classes4.dex */
public final class LayoutCoachActionVideoHandleBinding implements ViewBinding {

    @NonNull
    public final TextView exoPosition;

    @NonNull
    public final ImageView ivNext;

    @NonNull
    public final ImageView ivPause;

    @NonNull
    public final ImageView ivPlay;

    @NonNull
    public final ImageView ivPrev;

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    public final RelativeLayout rlTimeBar;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final View viewFullScreen;

    @NonNull
    public final RelativeLayout viewHandle;

    private LayoutCoachActionVideoHandleBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout2, @NonNull View view, @NonNull RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.exoPosition = textView;
        this.ivNext = imageView;
        this.ivPause = imageView2;
        this.ivPlay = imageView3;
        this.ivPrev = imageView4;
        this.progressBar = progressBar;
        this.rlTimeBar = relativeLayout2;
        this.viewFullScreen = view;
        this.viewHandle = relativeLayout3;
    }

    @NonNull
    public static LayoutCoachActionVideoHandleBinding bind(@NonNull View view) {
        View findChildViewById;
        int i8 = R$id.exo_position;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
        if (textView != null) {
            i8 = R$id.iv_next;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView != null) {
                i8 = R$id.iv_pause;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                if (imageView2 != null) {
                    i8 = R$id.iv_play;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i8);
                    if (imageView3 != null) {
                        i8 = R$id.iv_prev;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i8);
                        if (imageView4 != null) {
                            i8 = R$id.progressBar;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i8);
                            if (progressBar != null) {
                                i8 = R$id.rl_time_bar;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                if (relativeLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.view_full_screen))) != null) {
                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                    return new LayoutCoachActionVideoHandleBinding(relativeLayout2, textView, imageView, imageView2, imageView3, imageView4, progressBar, relativeLayout, findChildViewById, relativeLayout2);
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
    public static LayoutCoachActionVideoHandleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static LayoutCoachActionVideoHandleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.layout_coach_action_video_handle, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
