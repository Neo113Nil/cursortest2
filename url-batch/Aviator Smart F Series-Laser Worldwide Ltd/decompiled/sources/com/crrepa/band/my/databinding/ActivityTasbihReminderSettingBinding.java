package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.muslim.view.SwitchButton;

/* loaded from: classes2.dex */
public final class ActivityTasbihReminderSettingBinding implements ViewBinding {

    @NonNull
    public final CheckBox cbFriday;

    @NonNull
    public final CheckBox cbMonday;

    @NonNull
    public final CheckBox cbSaturday;

    @NonNull
    public final CheckBox cbSunday;

    @NonNull
    public final CheckBox cbThursday;

    @NonNull
    public final CheckBox cbTuesday;

    @NonNull
    public final CheckBox cbWednesday;

    @NonNull
    public final CoordinatorLayout clTasbihSetting;

    @NonNull
    public final ImageView ivEndContinue;

    @NonNull
    public final ImageView ivStartContinue;

    @NonNull
    public final ImageView ivTimeContinue;

    @NonNull
    public final LinearLayout llConfigReminder;

    @NonNull
    public final RelativeLayout rlIntervalTime;

    @NonNull
    public final RelativeLayout rlReminder;

    @NonNull
    public final RelativeLayout rlReminderEndTime;

    @NonNull
    public final RelativeLayout rlReminderStartTime;

    @NonNull
    private final CoordinatorLayout rootView;

    @NonNull
    public final SwitchButton sbtnTasbihReminder;

    @NonNull
    public final BandDataAppbarBinding topBar;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvEndTime;

    @NonNull
    public final TextView tvIntervalTime;

    @NonNull
    public final TextView tvStartTime;

    @NonNull
    public final View viewSplit;

    private ActivityTasbihReminderSettingBinding(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull CheckBox checkBox3, @NonNull CheckBox checkBox4, @NonNull CheckBox checkBox5, @NonNull CheckBox checkBox6, @NonNull CheckBox checkBox7, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull SwitchButton switchButton, @NonNull BandDataAppbarBinding bandDataAppbarBinding, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view) {
        this.rootView = coordinatorLayout;
        this.cbFriday = checkBox;
        this.cbMonday = checkBox2;
        this.cbSaturday = checkBox3;
        this.cbSunday = checkBox4;
        this.cbThursday = checkBox5;
        this.cbTuesday = checkBox6;
        this.cbWednesday = checkBox7;
        this.clTasbihSetting = coordinatorLayout2;
        this.ivEndContinue = imageView;
        this.ivStartContinue = imageView2;
        this.ivTimeContinue = imageView3;
        this.llConfigReminder = linearLayout;
        this.rlIntervalTime = relativeLayout;
        this.rlReminder = relativeLayout2;
        this.rlReminderEndTime = relativeLayout3;
        this.rlReminderStartTime = relativeLayout4;
        this.sbtnTasbihReminder = switchButton;
        this.topBar = bandDataAppbarBinding;
        this.tvDescription = textView;
        this.tvEndTime = textView2;
        this.tvIntervalTime = textView3;
        this.tvStartTime = textView4;
        this.viewSplit = view;
    }

    @NonNull
    public static ActivityTasbihReminderSettingBinding bind(@NonNull View view) {
        int i8 = R.id.cb_friday;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_friday);
        if (checkBox != null) {
            i8 = R.id.cb_monday;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_monday);
            if (checkBox2 != null) {
                i8 = R.id.cb_saturday;
                CheckBox checkBox3 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_saturday);
                if (checkBox3 != null) {
                    i8 = R.id.cb_sunday;
                    CheckBox checkBox4 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_sunday);
                    if (checkBox4 != null) {
                        i8 = R.id.cb_thursday;
                        CheckBox checkBox5 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_thursday);
                        if (checkBox5 != null) {
                            i8 = R.id.cb_tuesday;
                            CheckBox checkBox6 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_tuesday);
                            if (checkBox6 != null) {
                                i8 = R.id.cb_wednesday;
                                CheckBox checkBox7 = (CheckBox) ViewBindings.findChildViewById(view, R.id.cb_wednesday);
                                if (checkBox7 != null) {
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                                    i8 = R.id.iv_end_continue;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_end_continue);
                                    if (imageView != null) {
                                        i8 = R.id.iv_start_continue;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_start_continue);
                                        if (imageView2 != null) {
                                            i8 = R.id.iv_time_continue;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_time_continue);
                                            if (imageView3 != null) {
                                                i8 = R.id.ll_config_reminder;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_config_reminder);
                                                if (linearLayout != null) {
                                                    i8 = R.id.rl_interval_time;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_interval_time);
                                                    if (relativeLayout != null) {
                                                        i8 = R.id.rl_reminder;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder);
                                                        if (relativeLayout2 != null) {
                                                            i8 = R.id.rl_reminder_end_time;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder_end_time);
                                                            if (relativeLayout3 != null) {
                                                                i8 = R.id.rl_reminder_start_time;
                                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder_start_time);
                                                                if (relativeLayout4 != null) {
                                                                    i8 = R.id.sbtn_tasbih_reminder;
                                                                    SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_tasbih_reminder);
                                                                    if (switchButton != null) {
                                                                        i8 = R.id.top_bar;
                                                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.top_bar);
                                                                        if (findChildViewById != null) {
                                                                            BandDataAppbarBinding bind = BandDataAppbarBinding.bind(findChildViewById);
                                                                            i8 = R.id.tv_description;
                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                                                                            if (textView != null) {
                                                                                i8 = R.id.tv_end_time;
                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_end_time);
                                                                                if (textView2 != null) {
                                                                                    i8 = R.id.tv_interval_time;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_interval_time);
                                                                                    if (textView3 != null) {
                                                                                        i8 = R.id.tv_start_time;
                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_start_time);
                                                                                        if (textView4 != null) {
                                                                                            i8 = R.id.view_split;
                                                                                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view_split);
                                                                                            if (findChildViewById2 != null) {
                                                                                                return new ActivityTasbihReminderSettingBinding(coordinatorLayout, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, coordinatorLayout, imageView, imageView2, imageView3, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, switchButton, bind, textView, textView2, textView3, textView4, findChildViewById2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityTasbihReminderSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityTasbihReminderSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_tasbih_reminder_setting, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
