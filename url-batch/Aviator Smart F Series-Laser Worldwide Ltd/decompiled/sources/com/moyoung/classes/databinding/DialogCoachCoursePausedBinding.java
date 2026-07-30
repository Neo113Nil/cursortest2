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
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes4.dex */
public final class DialogCoachCoursePausedBinding implements ViewBinding {

    @NonNull
    public final ImageView ivContinue;

    @NonNull
    public final RoundedImageView ivCover;

    @NonNull
    public final ImageView ivStop;

    @Nullable
    public final RelativeLayout rlCourseMsg;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvActionDetail;

    @NonNull
    public final TextView tvProgress;

    @NonNull
    public final TextView tvTitle;

    @Nullable
    public final View viewCenter;

    private DialogCoachCoursePausedBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull RoundedImageView roundedImageView, @NonNull ImageView imageView2, @Nullable RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @Nullable View view) {
        this.rootView = frameLayout;
        this.ivContinue = imageView;
        this.ivCover = roundedImageView;
        this.ivStop = imageView2;
        this.rlCourseMsg = relativeLayout;
        this.tvActionDetail = textView;
        this.tvProgress = textView2;
        this.tvTitle = textView3;
        this.viewCenter = view;
    }

    @NonNull
    public static DialogCoachCoursePausedBinding bind(@NonNull View view) {
        int i8 = R$id.iv_continue;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.iv_cover;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i8);
            if (roundedImageView != null) {
                i8 = R$id.iv_stop;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                if (imageView2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R$id.rl_course_msg);
                    i8 = R$id.tv_action_detail;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                    if (textView != null) {
                        i8 = R$id.tv_progress;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                        if (textView2 != null) {
                            i8 = R$id.tv_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                            if (textView3 != null) {
                                return new DialogCoachCoursePausedBinding((FrameLayout) view, imageView, roundedImageView, imageView2, relativeLayout, textView, textView2, textView3, ViewBindings.findChildViewById(view, R$id.view_center));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static DialogCoachCoursePausedBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DialogCoachCoursePausedBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.dialog_coach_course_paused, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
