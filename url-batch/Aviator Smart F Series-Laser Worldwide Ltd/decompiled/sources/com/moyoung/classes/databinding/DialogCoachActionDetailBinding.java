package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.coach.widget.CustomPlayerView;

/* loaded from: classes4.dex */
public final class DialogCoachActionDetailBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flGraphic;

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final View ivCover;

    @NonNull
    private final View rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final CustomPlayerView videoView;

    private DialogCoachActionDetailBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull View view2, @NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull CustomPlayerView customPlayerView) {
        this.rootView = view;
        this.flGraphic = frameLayout;
        this.ivClose = imageView;
        this.ivCover = view2;
        this.scrollView = nestedScrollView;
        this.tvDescription = textView;
        this.tvTitle = textView2;
        this.videoView = customPlayerView;
    }

    @NonNull
    public static DialogCoachActionDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i8 = R$id.fl_graphic;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i8);
        if (frameLayout != null) {
            i8 = R$id.iv_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.iv_cover))) != null) {
                i8 = R$id.scrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i8);
                if (nestedScrollView != null) {
                    i8 = R$id.tv_description;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView != null) {
                        i8 = R$id.tv_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView2 != null) {
                            i8 = R$id.video_view;
                            CustomPlayerView customPlayerView = (CustomPlayerView) ViewBindings.findChildViewById(view, i8);
                            if (customPlayerView != null) {
                                return new DialogCoachActionDetailBinding(view, frameLayout, imageView, findChildViewById, nestedScrollView, textView, textView2, customPlayerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogCoachActionDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogCoachActionDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.dialog_coach_action_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
