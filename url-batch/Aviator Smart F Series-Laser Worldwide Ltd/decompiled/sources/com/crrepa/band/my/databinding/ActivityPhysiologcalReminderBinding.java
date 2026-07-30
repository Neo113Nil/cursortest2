package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.kyleduo.switchbutton.SwitchButton;

/* loaded from: classes2.dex */
public final class ActivityPhysiologcalReminderBinding implements ViewBinding {

    @NonNull
    public final ContinueArrowBinding arrowReminderTime;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final RelativeLayout rlReminderTime;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwitchButton sbtnAll;

    @NonNull
    public final SwitchButton sbtnEndOfOvulation;

    @NonNull
    public final SwitchButton sbtnMenstrualReminder;

    @NonNull
    public final SwitchButton sbtnOvulationDayReminder;

    @NonNull
    public final SwitchButton sbtnOvulationReminder;

    @NonNull
    public final TextView tvReminderTime;

    private ActivityPhysiologcalReminderBinding(@NonNull LinearLayout linearLayout, @NonNull ContinueArrowBinding continueArrowBinding, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull SwitchButton switchButton, @NonNull SwitchButton switchButton2, @NonNull SwitchButton switchButton3, @NonNull SwitchButton switchButton4, @NonNull SwitchButton switchButton5, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.arrowReminderTime = continueArrowBinding;
        this.ivTitleBack = imageView;
        this.rlReminderTime = relativeLayout;
        this.sbtnAll = switchButton;
        this.sbtnEndOfOvulation = switchButton2;
        this.sbtnMenstrualReminder = switchButton3;
        this.sbtnOvulationDayReminder = switchButton4;
        this.sbtnOvulationReminder = switchButton5;
        this.tvReminderTime = textView;
    }

    @NonNull
    public static ActivityPhysiologcalReminderBinding bind(@NonNull View view) {
        int i8 = R.id.arrow_reminder_time;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.arrow_reminder_time);
        if (findChildViewById != null) {
            ContinueArrowBinding bind = ContinueArrowBinding.bind(findChildViewById);
            i8 = R.id.iv_title_back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
            if (imageView != null) {
                i8 = R.id.rl_reminder_time;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder_time);
                if (relativeLayout != null) {
                    i8 = R.id.sbtn_all;
                    SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_all);
                    if (switchButton != null) {
                        i8 = R.id.sbtn_end_of_ovulation;
                        SwitchButton switchButton2 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_end_of_ovulation);
                        if (switchButton2 != null) {
                            i8 = R.id.sbtn_menstrual_reminder;
                            SwitchButton switchButton3 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_menstrual_reminder);
                            if (switchButton3 != null) {
                                i8 = R.id.sbtn_ovulation_day_reminder;
                                SwitchButton switchButton4 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_ovulation_day_reminder);
                                if (switchButton4 != null) {
                                    i8 = R.id.sbtn_ovulation_reminder;
                                    SwitchButton switchButton5 = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_ovulation_reminder);
                                    if (switchButton5 != null) {
                                        i8 = R.id.tv_reminder_time;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reminder_time);
                                        if (textView != null) {
                                            return new ActivityPhysiologcalReminderBinding((LinearLayout) view, bind, imageView, relativeLayout, switchButton, switchButton2, switchButton3, switchButton4, switchButton5, textView);
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
    public static ActivityPhysiologcalReminderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityPhysiologcalReminderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_physiologcal_reminder, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
