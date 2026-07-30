package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.coach.widget.CustomPlayerView;
import com.moyoung.classes.coach.widget.SegmentVideoTimeBar;
import com.moyoung.dafit.module.common.widgets.CircleDisplayView;

/* loaded from: classes4.dex */
public final class ActivityCoachCoursePlayingBinding implements ViewBinding {

    @NonNull
    public final CircleDisplayView circleProgressBar;

    @NonNull
    public final ImageView ivNextLand;

    @NonNull
    public final ImageView ivPauseLand;

    @NonNull
    public final ImageView ivPlayLand;

    @NonNull
    public final ImageView ivPrevLand;

    @NonNull
    public final PlayerControlView playerController;

    @NonNull
    public final RelativeLayout rlActionProgress;

    @NonNull
    public final RelativeLayout rlVideoHandleLand;

    @NonNull
    public final RelativeLayout rlVideoHandleLandBtn;

    @NonNull
    public final RelativeLayout rlVideoHandlePort;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final SegmentVideoTimeBar segmentVideoTimeBar;

    @NonNull
    public final TextView tvActionDetail;

    @NonNull
    public final TextView tvActionTitle;

    @NonNull
    public final TextView tvCountdown;

    @NonNull
    public final TextView tvCourseActionIndex;

    @NonNull
    public final TextView tvCurrentActionPlayedCount;

    @NonNull
    public final TextView tvCurrentActionTotal;

    @NonNull
    public final TextView tvPosition;

    @NonNull
    public final LayoutCoachActionVideoHandleBinding videoHandlePort;

    @NonNull
    public final CustomPlayerView videoView;

    @NonNull
    public final View viewSwitchToLand;

    @NonNull
    public final View viewSwitchToPort;

    private ActivityCoachCoursePlayingBinding(@NonNull RelativeLayout relativeLayout, @NonNull CircleDisplayView circleDisplayView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull PlayerControlView playerControlView, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull SegmentVideoTimeBar segmentVideoTimeBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull LayoutCoachActionVideoHandleBinding layoutCoachActionVideoHandleBinding, @NonNull CustomPlayerView customPlayerView, @NonNull View view, @NonNull View view2) {
        this.rootView = relativeLayout;
        this.circleProgressBar = circleDisplayView;
        this.ivNextLand = imageView;
        this.ivPauseLand = imageView2;
        this.ivPlayLand = imageView3;
        this.ivPrevLand = imageView4;
        this.playerController = playerControlView;
        this.rlActionProgress = relativeLayout2;
        this.rlVideoHandleLand = relativeLayout3;
        this.rlVideoHandleLandBtn = relativeLayout4;
        this.rlVideoHandlePort = relativeLayout5;
        this.segmentVideoTimeBar = segmentVideoTimeBar;
        this.tvActionDetail = textView;
        this.tvActionTitle = textView2;
        this.tvCountdown = textView3;
        this.tvCourseActionIndex = textView4;
        this.tvCurrentActionPlayedCount = textView5;
        this.tvCurrentActionTotal = textView6;
        this.tvPosition = textView7;
        this.videoHandlePort = layoutCoachActionVideoHandleBinding;
        this.videoView = customPlayerView;
        this.viewSwitchToLand = view;
        this.viewSwitchToPort = view2;
    }

    @NonNull
    public static ActivityCoachCoursePlayingBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i8 = R$id.circle_progressBar;
        CircleDisplayView circleDisplayView = (CircleDisplayView) ViewBindings.findChildViewById(view, i8);
        if (circleDisplayView != null) {
            i8 = R$id.iv_next_land;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView != null) {
                i8 = R$id.iv_pause_land;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
                if (imageView2 != null) {
                    i8 = R$id.iv_play_land;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i8);
                    if (imageView3 != null) {
                        i8 = R$id.iv_prev_land;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i8);
                        if (imageView4 != null) {
                            i8 = R$id.player_controller;
                            PlayerControlView playerControlView = (PlayerControlView) ViewBindings.findChildViewById(view, i8);
                            if (playerControlView != null) {
                                i8 = R$id.rl_action_progress;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                if (relativeLayout != null) {
                                    i8 = R$id.rl_video_handle_land;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                    if (relativeLayout2 != null) {
                                        i8 = R$id.rl_video_handle_land_btn;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                        if (relativeLayout3 != null) {
                                            i8 = R$id.rl_video_handle_port;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i8);
                                            if (relativeLayout4 != null) {
                                                i8 = R$id.segment_video_time_bar;
                                                SegmentVideoTimeBar segmentVideoTimeBar = (SegmentVideoTimeBar) ViewBindings.findChildViewById(view, i8);
                                                if (segmentVideoTimeBar != null) {
                                                    i8 = R$id.tv_action_detail;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                                                    if (textView != null) {
                                                        i8 = R$id.tv_action_title;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                        if (textView2 != null) {
                                                            i8 = R$id.tv_countdown;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                            if (textView3 != null) {
                                                                i8 = R$id.tv_course_action_index;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                if (textView4 != null) {
                                                                    i8 = R$id.tv_current_action_played_count;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                    if (textView5 != null) {
                                                                        i8 = R$id.tv_current_action_total;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                        if (textView6 != null) {
                                                                            i8 = R$id.tv_position;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                            if (textView7 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.video_handle_port))) != null) {
                                                                                LayoutCoachActionVideoHandleBinding bind = LayoutCoachActionVideoHandleBinding.bind(findChildViewById);
                                                                                i8 = R$id.video_view;
                                                                                CustomPlayerView customPlayerView = (CustomPlayerView) ViewBindings.findChildViewById(view, i8);
                                                                                if (customPlayerView != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i8 = R$id.view_switch_to_land))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i8 = R$id.view_switch_to_port))) != null) {
                                                                                    return new ActivityCoachCoursePlayingBinding((RelativeLayout) view, circleDisplayView, imageView, imageView2, imageView3, imageView4, playerControlView, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, segmentVideoTimeBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, bind, customPlayerView, findChildViewById2, findChildViewById3);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static ActivityCoachCoursePlayingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCoachCoursePlayingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_coach_course_playing, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
