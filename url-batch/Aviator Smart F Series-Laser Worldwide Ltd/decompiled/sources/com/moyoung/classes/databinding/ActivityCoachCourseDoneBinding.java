package com.moyoung.classes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
public final class ActivityCoachCourseDoneBinding implements ViewBinding {

    @NonNull
    public final ImageView ivClose;

    @NonNull
    public final ImageView ivCover;

    @NonNull
    public final LinearLayout llMsg;

    @NonNull
    public final LinearLayout llSpent;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final RecyclerView rvPlayedAction;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final ShadowLayout slDone;

    @NonNull
    public final TextView tvCompletedTime;

    @NonNull
    public final TextView tvDone;

    @NonNull
    public final TextView tvDuration;

    @NonNull
    public final TextView tvFinishActionTitle;

    @NonNull
    public final TextView tvKcal;

    @NonNull
    public final TextView tvLevel;

    @NonNull
    public final TextView tvSpentKcal;

    @NonNull
    public final TextView tvSpentTime;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final View viewBottom;

    private ActivityCoachCourseDoneBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull NestedScrollView nestedScrollView, @NonNull ShadowLayout shadowLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull View view) {
        this.rootView = relativeLayout;
        this.ivClose = imageView;
        this.ivCover = imageView2;
        this.llMsg = linearLayout;
        this.llSpent = linearLayout2;
        this.rvPlayedAction = recyclerView;
        this.scrollView = nestedScrollView;
        this.slDone = shadowLayout;
        this.tvCompletedTime = textView;
        this.tvDone = textView2;
        this.tvDuration = textView3;
        this.tvFinishActionTitle = textView4;
        this.tvKcal = textView5;
        this.tvLevel = textView6;
        this.tvSpentKcal = textView7;
        this.tvSpentTime = textView8;
        this.tvTitle = textView9;
        this.viewBottom = view;
    }

    @NonNull
    public static ActivityCoachCourseDoneBinding bind(@NonNull View view) {
        View findChildViewById;
        int i8 = R$id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i8);
        if (imageView != null) {
            i8 = R$id.iv_cover;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i8);
            if (imageView2 != null) {
                i8 = R$id.ll_msg;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                if (linearLayout != null) {
                    i8 = R$id.ll_spent;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i8);
                    if (linearLayout2 != null) {
                        i8 = R$id.rv_played_action;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i8);
                        if (recyclerView != null) {
                            i8 = R$id.scrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i8);
                            if (nestedScrollView != null) {
                                i8 = R$id.sl_done;
                                ShadowLayout shadowLayout = (ShadowLayout) ViewBindings.findChildViewById(view, i8);
                                if (shadowLayout != null) {
                                    i8 = R$id.tv_completed_time;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i8);
                                    if (textView != null) {
                                        i8 = R$id.tv_done;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i8);
                                        if (textView2 != null) {
                                            i8 = R$id.tv_duration;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i8);
                                            if (textView3 != null) {
                                                i8 = R$id.tv_finish_action_title;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                if (textView4 != null) {
                                                    i8 = R$id.tv_kcal;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                    if (textView5 != null) {
                                                        i8 = R$id.tv_level;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                        if (textView6 != null) {
                                                            i8 = R$id.tv_spent_kcal;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                            if (textView7 != null) {
                                                                i8 = R$id.tv_spent_time;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                if (textView8 != null) {
                                                                    i8 = R$id.tv_title;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i8);
                                                                    if (textView9 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i8 = R$id.view_bottom))) != null) {
                                                                        return new ActivityCoachCourseDoneBinding((RelativeLayout) view, imageView, imageView2, linearLayout, linearLayout2, recyclerView, nestedScrollView, shadowLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, findChildViewById);
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
    public static ActivityCoachCourseDoneBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityCoachCourseDoneBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R$layout.activity_coach_course_done, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
