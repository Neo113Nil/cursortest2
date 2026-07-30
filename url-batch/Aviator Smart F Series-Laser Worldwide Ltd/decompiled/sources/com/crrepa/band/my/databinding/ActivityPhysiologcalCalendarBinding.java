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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crrepa.band.aviator.R;
import com.haibin.calendarview.CalendarLayout;
import com.haibin.calendarview.CalendarView;

/* loaded from: classes2.dex */
public final class ActivityPhysiologcalCalendarBinding implements ViewBinding {

    @NonNull
    public final CalendarLayout clPhysiologcal;

    @NonNull
    public final CalendarView cvPhysiologcal;

    @NonNull
    public final ImageView ivLastMonth;

    @NonNull
    public final ImageView ivNextMonth;

    @NonNull
    public final ImageView ivTitleBack;

    @NonNull
    public final LinearLayout llPhysiologicalMessage;

    @NonNull
    public final LinearLayout llSetting;

    @NonNull
    public final RelativeLayout rlCycleSetting;

    @NonNull
    public final RelativeLayout rlDateYearMonth;

    @NonNull
    public final ConstraintLayout rlPhysiologcalDateset1;

    @NonNull
    public final RelativeLayout rlPhysiologicalPhase;

    @NonNull
    public final RelativeLayout rlPregnancyChance;

    @NonNull
    public final RelativeLayout rlReminderMode;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView tvDescription;

    @NonNull
    public final TextView tvMenstruation;

    @NonNull
    public final TextView tvOvulation;

    @NonNull
    public final TextView tvOvulationDay;

    @NonNull
    public final TextView tvPhysiologicalPhase;

    @NonNull
    public final TextView tvPredictionMenstruation;

    @NonNull
    public final TextView tvPregnancyChance;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvTitleToday;

    @NonNull
    public final TextView tvYearMonth;

    private ActivityPhysiologcalCalendarBinding(@NonNull LinearLayout linearLayout, @NonNull CalendarLayout calendarLayout, @NonNull CalendarView calendarView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10) {
        this.rootView = linearLayout;
        this.clPhysiologcal = calendarLayout;
        this.cvPhysiologcal = calendarView;
        this.ivLastMonth = imageView;
        this.ivNextMonth = imageView2;
        this.ivTitleBack = imageView3;
        this.llPhysiologicalMessage = linearLayout2;
        this.llSetting = linearLayout3;
        this.rlCycleSetting = relativeLayout;
        this.rlDateYearMonth = relativeLayout2;
        this.rlPhysiologcalDateset1 = constraintLayout;
        this.rlPhysiologicalPhase = relativeLayout3;
        this.rlPregnancyChance = relativeLayout4;
        this.rlReminderMode = relativeLayout5;
        this.tvDescription = textView;
        this.tvMenstruation = textView2;
        this.tvOvulation = textView3;
        this.tvOvulationDay = textView4;
        this.tvPhysiologicalPhase = textView5;
        this.tvPredictionMenstruation = textView6;
        this.tvPregnancyChance = textView7;
        this.tvTitle = textView8;
        this.tvTitleToday = textView9;
        this.tvYearMonth = textView10;
    }

    @NonNull
    public static ActivityPhysiologcalCalendarBinding bind(@NonNull View view) {
        int i8 = R.id.cl_physiologcal;
        CalendarLayout calendarLayout = (CalendarLayout) ViewBindings.findChildViewById(view, R.id.cl_physiologcal);
        if (calendarLayout != null) {
            i8 = R.id.cv_physiologcal;
            CalendarView calendarView = (CalendarView) ViewBindings.findChildViewById(view, R.id.cv_physiologcal);
            if (calendarView != null) {
                i8 = R.id.iv_last_month;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_last_month);
                if (imageView != null) {
                    i8 = R.id.iv_next_month;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_next_month);
                    if (imageView2 != null) {
                        i8 = R.id.iv_title_back;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_title_back);
                        if (imageView3 != null) {
                            i8 = R.id.ll_physiological_message;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_physiological_message);
                            if (linearLayout != null) {
                                i8 = R.id.ll_setting;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_setting);
                                if (linearLayout2 != null) {
                                    i8 = R.id.rl_cycle_setting;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_cycle_setting);
                                    if (relativeLayout != null) {
                                        i8 = R.id.rl_date_year_month;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_date_year_month);
                                        if (relativeLayout2 != null) {
                                            i8 = R.id.rl_physiologcal_dateset1;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.rl_physiologcal_dateset1);
                                            if (constraintLayout != null) {
                                                i8 = R.id.rl_physiological_phase;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_physiological_phase);
                                                if (relativeLayout3 != null) {
                                                    i8 = R.id.rl_pregnancy_chance;
                                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_pregnancy_chance);
                                                    if (relativeLayout4 != null) {
                                                        i8 = R.id.rl_reminder_mode;
                                                        RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_reminder_mode);
                                                        if (relativeLayout5 != null) {
                                                            i8 = R.id.tv_description;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_description);
                                                            if (textView != null) {
                                                                i8 = R.id.tv_menstruation;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_menstruation);
                                                                if (textView2 != null) {
                                                                    i8 = R.id.tv_ovulation;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ovulation);
                                                                    if (textView3 != null) {
                                                                        i8 = R.id.tv_ovulation_day;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_ovulation_day);
                                                                        if (textView4 != null) {
                                                                            i8 = R.id.tv_physiological_phase;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_physiological_phase);
                                                                            if (textView5 != null) {
                                                                                i8 = R.id.tv_prediction_menstruation;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_prediction_menstruation);
                                                                                if (textView6 != null) {
                                                                                    i8 = R.id.tv_pregnancy_chance;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_pregnancy_chance);
                                                                                    if (textView7 != null) {
                                                                                        i8 = R.id.tv_title;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                                                                        if (textView8 != null) {
                                                                                            i8 = R.id.tv_title_today;
                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_today);
                                                                                            if (textView9 != null) {
                                                                                                i8 = R.id.tv_year_month;
                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_year_month);
                                                                                                if (textView10 != null) {
                                                                                                    return new ActivityPhysiologcalCalendarBinding((LinearLayout) view, calendarLayout, calendarView, imageView, imageView2, imageView3, linearLayout, linearLayout2, relativeLayout, relativeLayout2, constraintLayout, relativeLayout3, relativeLayout4, relativeLayout5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i8)));
    }

    @NonNull
    public static ActivityPhysiologcalCalendarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static ActivityPhysiologcalCalendarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z7) {
        View inflate = layoutInflater.inflate(R.layout.activity_physiologcal_calendar, viewGroup, false);
        if (z7) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
