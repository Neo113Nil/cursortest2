package com.crrepa.band.my.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class ViewPhysiologicalPeriodBinding implements ViewBinding {

    @NonNull
    public final ContinueArrowBinding arrowLastMenstrualDate;

    @NonNull
    public final ContinueArrowBinding arrowMenstrualPeriod;

    @NonNull
    public final ContinueArrowBinding arrowPhysiologicalCycle;

    @NonNull
    public final ContinueArrowBinding arrowPhysiologicalCycleCalendar;

    @NonNull
    public final ContinueArrowBinding arrowReminderMode;

    @NonNull
    public final ContinueArrowBinding arrowReminderTime;

    @NonNull
    public final LinearLayout llPhysiologicalPeriodContent;

    @NonNull
    public final RelativeLayout rlLastMenstrualDate;

    @NonNull
    public final RelativeLayout rlMenstrualPeriod;

    @NonNull
    public final RelativeLayout rlPhysiologicalCycle;

    @NonNull
    public final RelativeLayout rlPhysiologicalCycleCalendar;

    @NonNull
    public final LinearLayout rlPhysiologicalPeriodRemind;

    @NonNull
    public final RelativeLayout rlReminderMode;

    @NonNull
    public final RelativeLayout rlReminderTime;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final SwitchButton sbtnPhysiologicalPeriod;

    @NonNull
    public final TextView tvLastMenstrualPeriodDate;

    @NonNull
    public final TextView tvMenstrualPeriod;

    @NonNull
    public final TextView tvPhysiologicalCycle;

    @NonNull
    public final TextView tvReminderTime;

    private ViewPhysiologicalPeriodBinding(@NonNull LinearLayout linearLayout, @NonNull ContinueArrowBinding continueArrowBinding, @NonNull ContinueArrowBinding continueArrowBinding2, @NonNull ContinueArrowBinding continueArrowBinding3, @NonNull ContinueArrowBinding continueArrowBinding4, @NonNull ContinueArrowBinding continueArrowBinding5, @NonNull ContinueArrowBinding continueArrowBinding6, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout5, @NonNull RelativeLayout relativeLayout6, @NonNull SwitchButton switchButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = linearLayout;
        this.arrowLastMenstrualDate = continueArrowBinding;
        this.arrowMenstrualPeriod = continueArrowBinding2;
        this.arrowPhysiologicalCycle = continueArrowBinding3;
        this.arrowPhysiologicalCycleCalendar = continueArrowBinding4;
        this.arrowReminderMode = continueArrowBinding5;
        this.arrowReminderTime = continueArrowBinding6;
        this.llPhysiologicalPeriodContent = linearLayout2;
        this.rlLastMenstrualDate = relativeLayout;
        this.rlMenstrualPeriod = relativeLayout2;
        this.rlPhysiologicalCycle = relativeLayout3;
        this.rlPhysiologicalCycleCalendar = relativeLayout4;
        this.rlPhysiologicalPeriodRemind = linearLayout3;
        this.rlReminderMode = relativeLayout5;
        this.rlReminderTime = relativeLayout6;
        this.sbtnPhysiologicalPeriod = switchButton;
        this.tvLastMenstrualPeriodDate = textView;
        this.tvMenstrualPeriod = textView2;
        this.tvPhysiologicalCycle = textView3;
        this.tvReminderTime = textView4;
    }

    @NonNull
    public static ViewPhysiologicalPeriodBinding bind(@NonNull View view) {
        int i8 = R.id.arrow_last_menstrual_date;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.arrow_last_menstrual_date);
        if (findChildViewById != null) {
            ContinueArrowBinding bind = ContinueArrowBinding.bind(findChildViewById);
            i8 = R.id.arrow_menstrual_period;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.arrow_menstrual_period);
            if (findChildViewById2 != null) {
                ContinueArrowBinding bind2 = ContinueArrowBinding.bind(findChildViewById2);
                i8 = R.id.arrow_physiological_cycle;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.arrow_physiological_cycle);
                if (findChildViewById3 != null) {
                    ContinueArrowBinding bind3 = ContinueArrowBinding.bind(findChildViewById3);
                    i8 = R.id.arrow_physiological_cycle_calendar;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.arrow_physiological_cycle_calendar);
                    if (findChildViewById4 != null) {
                        ContinueArrowBinding bind4 = ContinueArrowBinding.bind(findChildViewById4);
                        i8 = R.id.arrow_reminder_mode;
                        View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.arrow_reminder_mode);
                        if (findChildViewById5 != null) {
                            ContinueArrowBinding bind5 = ContinueArrowBinding.bind(findChildViewById5);
                            i8 = R.id.arrow_reminder_time;
                            View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.arrow_reminder_time);
                            if (findChildViewById6 != null) {
                                ContinueArrowBinding bind6 = ContinueArrowBinding.bind(findChildViewById6);
                                i8 = R.id.ll_physiological_period_content;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_physiological_period_content);
                                if (linearLayout != null) {
                                    i8 = R.id.rl_last_menstrual_date;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_last_menstrual_date);
                                    if (relativeLayout != null) {
                                        i8 = R.id.rl_menstrual_period;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_menstrual_period);
                                        if (relativeLayout2 != null) {
                                            i8 = R.id.rl_physiological_cycle;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_physiological_cycle);
                                            if (relativeLayout3 != null) {
                                                i8 = R.id.rl_physiological_cycle_calendar;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_physiological_cycle_calendar);
                                                if (relativeLayout4 != null) {
                                                    LinearLayout linearLayout2 = (LinearLayout) view;
                                                    i8 = R.id.rl_reminder_mode;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder_mode);
                                                    if (relativeLayout5 != null) {
                                                        i8 = R.id.rl_reminder_time;
                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder_time);
                                                        if (relativeLayout6 != null) {
                                                            i8 = R.id.sbtn_physiological_period;
                                                            SwitchButton switchButton = (SwitchButton) ViewBindings.findChildViewById(view, R.id.sbtn_physiological_period);
                                                            if (switchButton != null) {
                                                                i8 = R.id.tv_last_menstrual_period_date;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_last_menstrual_period_date);
                                                                if (textView != null) {
                                                                    i8 = R.id.tv_menstrual_period;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_menstrual_period);
                                                                    if (textView2 != null) {
                                                                        i8 = R.id.tv_physiological_cycle;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_physiological_cycle);
                                                                        if (textView3 != null) {
                                                                            i8 = R.id.tv_reminder_time;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reminder_time);
                                                                            if (textView4 != null) {
                                                                                return new ViewPhysiologicalPeriodBinding(linearLayout2, bind, bind2, bind3, bind4, bind5, bind6, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout2, relativeLayout5, relativeLayout6, switchButton, textView, textView2, textView3, textView4);
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
    public static ViewPhysiologicalPeriodBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ViewPhysiologicalPeriodBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.view_physiological_period, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
