package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.view.SwitchButton;

/* loaded from: classes2.dex */
public final class ActivityPrayTimingSettingBinding implements ViewBinding {

    @NonNull
    public final ImageView ivAsrContinue;

    @NonNull
    public final ImageView ivContinue;

    @NonNull
    public final ImageView ivPrayerCompensationContinue;

    @NonNull
    public final RecyclerView rcvMuslimTime;

    @NonNull
    public final RelativeLayout rlAsrJuristicMethod;

    @NonNull
    public final RelativeLayout rlCalculateMethod;

    @NonNull
    public final RelativeLayout rlPrayerCompensation;

    @NonNull
    public final RelativeLayout rlReminder;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final SwitchButton sbtnPrayerReminder;

    @NonNull
    public final BandDataAppbarBinding topBar;

    @NonNull
    public final TextView tvAsrJuristicMethod;

    @NonNull
    public final TextView tvAsrJuristicMethodTitle;

    @NonNull
    public final TextView tvCalculateMethod;

    @NonNull
    public final TextView tvCalculateMethodTitle;

    @NonNull
    public final TextView tvFunctionName;

    @NonNull
    public final TextView tvPrayerCompensationTitle;

    @NonNull
    public final TextView tvPrayerCompensationValue;

    private ActivityPrayTimingSettingBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull SwitchButton switchButton, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = coordinatorLayout;
        this.ivAsrContinue = imageView;
        this.ivContinue = imageView2;
        this.ivPrayerCompensationContinue = imageView3;
        this.rcvMuslimTime = recyclerView;
        this.rlAsrJuristicMethod = relativeLayout;
        this.rlCalculateMethod = relativeLayout2;
        this.rlPrayerCompensation = relativeLayout3;
        this.rlReminder = relativeLayout4;
        this.sbtnPrayerReminder = switchButton;
        this.topBar = bandDataAppbarBinding;
        this.tvAsrJuristicMethod = textView;
        this.tvAsrJuristicMethodTitle = textView2;
        this.tvCalculateMethod = textView3;
        this.tvCalculateMethodTitle = textView4;
        this.tvFunctionName = textView5;
        this.tvPrayerCompensationTitle = textView6;
        this.tvPrayerCompensationValue = textView7;
    }

    @NonNull
    public static ActivityPrayTimingSettingBinding bind(@NonNull View view) {
        int i8 = R.id.iv_asr_continue;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_asr_continue);
        if (imageView != null) {
            i8 = R.id.iv_continue;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_continue);
            if (imageView2 != null) {
                i8 = R.id.iv_prayer_compensation_continue;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_prayer_compensation_continue);
                if (imageView3 != null) {
                    i8 = R.id.rcv_muslim_time;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rcv_muslim_time);
                    if (recyclerView != null) {
                        i8 = R.id.rl_asr_juristic_method;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_asr_juristic_method);
                        if (relativeLayout != null) {
                            i8 = R.id.rl_calculate_method;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_calculate_method);
                            if (relativeLayout2 != null) {
                                i8 = R.id.rl_prayer_compensation;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_prayer_compensation);
                                if (relativeLayout3 != null) {
                                    i8 = R.id.rl_reminder;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder);
                                    if (relativeLayout4 != null) {
                                        i8 = R.id.sbtn_prayer_reminder;
                                        SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_prayer_reminder);
                                        if (switchButton != null) {
                                            i8 = R.id.top_bar;
                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.top_bar);
                                            if (findChildViewById != null) {
                                                BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                                                i8 = R.id.tv_asr_juristic_method;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_asr_juristic_method);
                                                if (textView != null) {
                                                    i8 = R.id.tv_asr_juristic_method_title;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_asr_juristic_method_title);
                                                    if (textView2 != null) {
                                                        i8 = R.id.tv_calculate_method;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calculate_method);
                                                        if (textView3 != null) {
                                                            i8 = R.id.tv_calculate_method_title;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_calculate_method_title);
                                                            if (textView4 != null) {
                                                                i8 = R.id.tv_function_name;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_function_name);
                                                                if (textView5 != null) {
                                                                    i8 = R.id.tv_prayer_compensation_title;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_prayer_compensation_title);
                                                                    if (textView6 != null) {
                                                                        i8 = R.id.tv_prayer_compensation_value;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_prayer_compensation_value);
                                                                        if (textView7 != null) {
                                                                            return new ActivityPrayTimingSettingBinding((CoordinatorLayout) view, imageView, imageView2, imageView3, recyclerView, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, switchButton, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static ActivityPrayTimingSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityPrayTimingSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_pray_timing_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
