package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public final class ActivityWaterReminderBinding implements ViewBinding {

    @NonNull
    public final LottieAnimationView lavDrinkCirculateAnimation;

    @NonNull
    public final LottieAnimationView lavDrinkOnceAnimation;

    @NonNull
    public final RelativeLayout rlWaterRemind;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvDrinkGoal;

    @NonNull
    public final TextView tvDrinkTip;

    @NonNull
    public final TextView tvDrinkTotal;

    @NonNull
    public final TextView tvGoDrink;

    @NonNull
    public final TextView tvGotIt;

    private ActivityWaterReminderBinding(@NonNull RelativeLayout relativeLayout, @NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.rootView = relativeLayout;
        this.lavDrinkCirculateAnimation = lottieAnimationView;
        this.lavDrinkOnceAnimation = lottieAnimationView2;
        this.rlWaterRemind = relativeLayout2;
        this.tvDrinkGoal = textView;
        this.tvDrinkTip = textView2;
        this.tvDrinkTotal = textView3;
        this.tvGoDrink = textView4;
        this.tvGotIt = textView5;
    }

    @NonNull
    public static ActivityWaterReminderBinding bind(@NonNull View view) {
        int i8 = R.id.lav_drink_circulate_animation;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lav_drink_circulate_animation);
        if (lottieAnimationView != null) {
            i8 = R.id.lav_drink_once_animation;
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, R.id.lav_drink_once_animation);
            if (lottieAnimationView2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i8 = R.id.tv_drink_goal;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_drink_goal);
                if (textView != null) {
                    i8 = R.id.tv_drink_tip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_drink_tip);
                    if (textView2 != null) {
                        i8 = R.id.tv_drink_total;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_drink_total);
                        if (textView3 != null) {
                            i8 = R.id.tv_go_drink;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_go_drink);
                            if (textView4 != null) {
                                i8 = R.id.tv_got_it;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_got_it);
                                if (textView5 != null) {
                                    return new ActivityWaterReminderBinding(relativeLayout, lottieAnimationView, lottieAnimationView2, relativeLayout, textView, textView2, textView3, textView4, textView5);
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
    public static ActivityWaterReminderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityWaterReminderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_water_reminder, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
