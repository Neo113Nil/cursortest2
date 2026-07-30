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
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.dafit.module.common.widgets.ShadowLayout;

/* loaded from: classes4.dex */
public final class ActivityCoachCourseDetailBinding implements ViewBinding {

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivCover;

    @NonNull
    public final ProgressBar pbAudio;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvCoachAction;

    @NonNull
    public final RecyclerView rvRelatedCourses;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final ShadowLayout slStart;

    @NonNull
    public final TextView tvCoachActionCount;

    @NonNull
    public final TextView tvCoachActionTitle;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvDownload;

    @NonNull
    public final TextView tvDuration;

    @NonNull
    public final TextView tvKcal;

    @NonNull
    public final TextView tvLevel;

    @NonNull
    public final TextView tvProgress;

    @NonNull
    public final TextView tvRelatedCoursesTitle;

    @NonNull
    public final TextView tvStart;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvViewMore;

    @NonNull
    public final View viewBottom;

    @NonNull
    public final View viewContinue;

    private ActivityCoachCourseDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull NestedScrollView nestedScrollView, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull View view, @NonNull View view2) {
        this.rootView = relativeLayout;
        this.ivClose = imageView;
        this.ivCover = imageView2;
        this.pbAudio = progressBar;
        this.rvCoachAction = recyclerView;
        this.rvRelatedCourses = recyclerView2;
        this.scrollView = nestedScrollView;
        this.slStart = shadowLayout;
        this.tvCoachActionCount = textView;
        this.tvCoachActionTitle = textView2;
        this.tvDescription = textView3;
        this.tvDownload = textView4;
        this.tvDuration = textView5;
        this.tvKcal = textView6;
        this.tvLevel = textView7;
        this.tvProgress = textView8;
        this.tvRelatedCoursesTitle = textView9;
        this.tvStart = textView10;
        this.tvTitle = textView11;
        this.tvViewMore = textView12;
        this.viewBottom = view;
        this.viewContinue = view2;
    }

    @NonNull
    public static ActivityCoachCourseDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i8 = R$id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.iv_cover;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView2 != null) {
                i8 = R$id.pb_audio;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i8);
                if (progressBar != null) {
                    i8 = R$id.rv_coach_action;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
                    if (recyclerView != null) {
                        i8 = R$id.rv_related_courses;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i8);
                        if (recyclerView2 != null) {
                            i8 = R$id.scrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i8);
                            if (nestedScrollView != null) {
                                i8 = R$id.sl_start;
                                ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, i8);
                                if (shadowLayout != null) {
                                    i8 = R$id.tv_coach_action_count;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                                    if (textView != null) {
                                        i8 = R$id.tv_coach_action_title;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                                        if (textView2 != null) {
                                            i8 = R$id.tv_description;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                                            if (textView3 != null) {
                                                i8 = R$id.tv_download;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                if (textView4 != null) {
                                                    i8 = R$id.tv_duration;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                    if (textView5 != null) {
                                                        i8 = R$id.tv_kcal;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                        if (textView6 != null) {
                                                            i8 = R$id.tv_level;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                            if (textView7 != null) {
                                                                i8 = R$id.tv_progress;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                if (textView8 != null) {
                                                                    i8 = R$id.tv_related_courses_title;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                    if (textView9 != null) {
                                                                        i8 = R$id.tv_start;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                        if (textView10 != null) {
                                                                            i8 = R$id.tv_title;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                            if (textView11 != null) {
                                                                                i8 = R$id.tv_view_more;
                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                                if (textView12 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.view_bottom))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i8 = R$id.view_continue))) != null) {
                                                                                    return new ActivityCoachCourseDetailBinding((RelativeLayout) view, imageView, imageView2, progressBar, recyclerView, recyclerView2, nestedScrollView, shadowLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, findChildViewById, findChildViewById2);
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
    public static ActivityCoachCourseDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCoachCourseDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_coach_course_detail, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
