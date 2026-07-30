package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityActionEditBinding implements ViewBinding {

    @NonNull
    public final Button btnActionAdd;

    @NonNull
    public final BandDataAppbarBinding includeTitle;

    @NonNull
    public final ImageView ivOpenValue;

    @NonNull
    public final ImageView ivOptionValue;

    @NonNull
    public final RelativeLayout rlAction;

    @NonNull
    public final RelativeLayout rlOpen;

    @NonNull
    public final RelativeLayout rlOption;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final TextView tvActionGoal;

    @NonNull
    public final TextView tvActionTitle;

    @NonNull
    public final TextView tvActionValue;

    @NonNull
    public final TextView tvOpenTitle;

    @NonNull
    public final TextView tvOpenValue;

    @NonNull
    public final TextView tvOptionTitle;

    @NonNull
    public final TextView tvOptionValue;

    private ActivityActionEditBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Button button, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = coordinatorLayout;
        this.btnActionAdd = button;
        this.includeTitle = bandDataAppbarBinding;
        this.ivOpenValue = imageView;
        this.ivOptionValue = imageView2;
        this.rlAction = relativeLayout;
        this.rlOpen = relativeLayout2;
        this.rlOption = relativeLayout3;
        this.tvActionGoal = textView;
        this.tvActionTitle = textView2;
        this.tvActionValue = textView3;
        this.tvOpenTitle = textView4;
        this.tvOpenValue = textView5;
        this.tvOptionTitle = textView6;
        this.tvOptionValue = textView7;
    }

    @NonNull
    public static ActivityActionEditBinding bind(@NonNull View view) {
        int i8 = R.id.btn_action_add;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_action_add);
        if (button != null) {
            i8 = R.id.include_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_title);
            if (findChildViewById != null) {
                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                i8 = R.id.iv_open_value;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_open_value);
                if (imageView != null) {
                    i8 = R.id.iv_option_value;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_option_value);
                    if (imageView2 != null) {
                        i8 = R.id.rl_action;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_action);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_open;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_open);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_option;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_option);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.tv_action_goal;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_goal);
                                    if (textView != null) {
                                        i8 = R.id.tv_action_title;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_title);
                                        if (textView2 != null) {
                                            i8 = R.id.tv_action_value;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_action_value);
                                            if (textView3 != null) {
                                                i8 = R.id.tv_open_title;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_title);
                                                if (textView4 != null) {
                                                    i8 = R.id.tv_open_value;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_open_value);
                                                    if (textView5 != null) {
                                                        i8 = R.id.tv_option_title;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_option_title);
                                                        if (textView6 != null) {
                                                            i8 = R.id.tv_option_value;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_option_value);
                                                            if (textView7 != null) {
                                                                return new ActivityActionEditBinding((CoordinatorLayout) view, button, bind, imageView, imageView2, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static ActivityActionEditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityActionEditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_action_edit, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
