package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.coach.widget.SegmentVideoTimeBar;
import com.moyoung.dafit.module.common.widgets.CircleDisplayView;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes4.dex */
public final class ActivityCoachCourseRestBinding implements ViewBinding {

    @NonNull
    public final CircleDisplayView cdvCountDown;

    @NonNull
    public final RoundedImageView ivNextActionCover;

    @Nullable
    public final RelativeLayout rlCountDown;

    @NonNull
    public final RelativeLayout rlNextAction;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SegmentVideoTimeBar segmentVideoTimeBar;

    @NonNull
    public final ShadowLayout slSkip;

    @NonNull
    public final TextView tvDelayed;

    @NonNull
    public final TextView tvNextAction;

    @NonNull
    public final TextView tvNextActionTitle;

    @NonNull
    public final TextView tvSkip;

    @Nullable
    public final View viewCenter;

    private ActivityCoachCourseRestBinding(@NonNull RelativeLayout relativeLayout, @NonNull CircleDisplayView circleDisplayView, @NonNull RoundedImageView roundedImageView, @Nullable RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull SegmentVideoTimeBar segmentVideoTimeBar, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @Nullable View view) {
        this.rootView = relativeLayout;
        this.cdvCountDown = circleDisplayView;
        this.ivNextActionCover = roundedImageView;
        this.rlCountDown = relativeLayout2;
        this.rlNextAction = relativeLayout3;
        this.segmentVideoTimeBar = segmentVideoTimeBar;
        this.slSkip = shadowLayout;
        this.tvDelayed = textView;
        this.tvNextAction = textView2;
        this.tvNextActionTitle = textView3;
        this.tvSkip = textView4;
        this.viewCenter = view;
    }

    @NonNull
    public static ActivityCoachCourseRestBinding bind(@NonNull View view) {
        int i8 = R$id.cdv_count_down;
        CircleDisplayView circleDisplayView = (CircleDisplayView) ViewBindings.findChildViewById(view, i8);
        if (circleDisplayView != null) {
            i8 = R$id.iv_next_action_cover;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i8);
            if (roundedImageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R$id.rl_count_down);
                i8 = R$id.rl_next_action;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                if (relativeLayout2 != null) {
                    i8 = R$id.segment_video_time_bar;
                    SegmentVideoTimeBar segmentVideoTimeBar = (SegmentVideoTimeBar) ViewBindings.findChildViewById(view, i8);
                    if (segmentVideoTimeBar != null) {
                        i8 = R$id.sl_skip;
                        ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, i8);
                        if (shadowLayout != null) {
                            i8 = R$id.tv_delayed;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                            if (textView != null) {
                                i8 = R$id.tv_next_action;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                                if (textView2 != null) {
                                    i8 = R$id.tv_next_action_title;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                                    if (textView3 != null) {
                                        i8 = R$id.tv_skip;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                        if (textView4 != null) {
                                            return new ActivityCoachCourseRestBinding((RelativeLayout) view, circleDisplayView, roundedImageView, relativeLayout, relativeLayout2, segmentVideoTimeBar, shadowLayout, textView, textView2, textView3, textView4, ViewBindings.findChildViewById(view, R$id.view_center));
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
    public static ActivityCoachCourseRestBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCoachCourseRestBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_coach_course_rest, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
