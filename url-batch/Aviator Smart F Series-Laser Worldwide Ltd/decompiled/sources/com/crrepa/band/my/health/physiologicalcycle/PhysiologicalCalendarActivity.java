package com.crrepa.band.my.health.physiologicalcycle;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.text.TextUtilsCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityPhysiologcalCalendarBinding;
import com.crrepa.band.my.health.physiologicalcycle.YearMonthDialog;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.CalendarView;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class PhysiologicalCalendarActivity extends BaseVBActivity<ActivityPhysiologcalCalendarBinding> implements x2.a, CalendarView.o, CalendarView.l {
    public static final String SHOW_SETTING = "show_setting";
    private final com.crrepa.band.my.health.physiologicalcycle.presenter.d physiologcalCalendarPresenter = new com.crrepa.band.my.health.physiologicalcycle.presenter.d();
    private boolean showSetting;

    class a implements YearMonthDialog.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.physiologicalcycle.YearMonthDialog.a
        public void onClick(int i8, int i9) {
            PhysiologicalCalendarActivity.this.scroll2Calendar(i8, i9);
        }
    }

    public static Intent getCallingIntent(Context context, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) PhysiologicalCalendarActivity.class);
        intent.putExtra(SHOW_SETTING, z7);
        return intent;
    }

    private void getPhysiologcalPeriod() {
        this.physiologcalCalendarPresenter.getPhysiologcalPeriod(this, ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.getMinRangeCalendar(), ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.getMaxRangeCalendar());
    }

    private void getYearMonth(int i8, int i9) {
        this.physiologcalCalendarPresenter.getTitleYearMonth(this, i8, i9);
    }

    private void initCalendar() {
        ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.setOnMonthChangeListener(this);
        ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.setOnCalendarSelectListener(this);
    }

    private void initView() {
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            ((ActivityPhysiologcalCalendarBinding) this.binding).ivLastMonth.setImageResource(R.drawable.ic_continue_right);
            ((ActivityPhysiologcalCalendarBinding) this.binding).ivNextMonth.setImageResource(R.drawable.ic_continue_left);
        } else {
            ((ActivityPhysiologcalCalendarBinding) this.binding).ivLastMonth.setImageResource(R.drawable.ic_continue_left);
            ((ActivityPhysiologcalCalendarBinding) this.binding).ivNextMonth.setImageResource(R.drawable.ic_continue_right);
        }
        boolean booleanExtra = getIntent().getBooleanExtra(SHOW_SETTING, true);
        this.showSetting = booleanExtra;
        if (booleanExtra) {
            ((ActivityPhysiologcalCalendarBinding) this.binding).llSetting.setVisibility(0);
        } else {
            ((ActivityPhysiologcalCalendarBinding) this.binding).llSetting.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        onTodayClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$2(View view) {
        onDateClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scroll2Calendar(int i8, int i9) {
        ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.scrollToCalendar(i8, i9, 1);
    }

    private void scrollToCalendar(int i8, int i9) {
        if (this.physiologcalCalendarPresenter.getMonthDays(i8, i9) < this.physiologcalCalendarPresenter.getDay()) {
            ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.scrollToCalendar(i8, i9, 1, true);
        } else {
            ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.scrollToCalendar(i8, i9, this.physiologcalCalendarPresenter.getDay(), true);
            ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.setSelected(true);
        }
    }

    private void setCurrentDate() {
        int curYear = ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.getCurYear();
        int curMonth = ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.getCurMonth();
        this.physiologcalCalendarPresenter.setCurrentDate(curYear, curMonth);
        getYearMonth(curYear, curMonth);
    }

    private void showTodayText(int i8, int i9) {
        Date date = new Date();
        int month = com.moyoung.dafit.module.common.utils.m.getMonth(date);
        if (i8 == com.moyoung.dafit.module.common.utils.m.getYear(date) && i9 == month) {
            ((ActivityPhysiologcalCalendarBinding) this.binding).tvTitleToday.setVisibility(8);
        } else {
            ((ActivityPhysiologcalCalendarBinding) this.binding).tvTitleToday.setVisibility(0);
        }
    }

    @Override // x2.a
    public void hidePhysiologcalPhase() {
        ((ActivityPhysiologcalCalendarBinding) this.binding).rlPhysiologicalPhase.setVisibility(8);
    }

    @Override // x2.a
    public void hidePregnancyChance() {
        ((ActivityPhysiologcalCalendarBinding) this.binding).rlPregnancyChance.setVisibility(8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        this.physiologcalCalendarPresenter.setView(this);
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.color_physiological_title_bg));
        initView();
        initCalendar();
        setCurrentDate();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityPhysiologcalCalendarBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalCalendarActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityPhysiologcalCalendarBinding) this.binding).tvTitleToday.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalCalendarActivity.this.lambda$initOnClickListener$1(view);
            }
        });
        ((ActivityPhysiologcalCalendarBinding) this.binding).ivLastMonth.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalCalendarActivity.this.onLastMonth(view);
            }
        });
        ((ActivityPhysiologcalCalendarBinding) this.binding).ivNextMonth.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalCalendarActivity.this.onNextMonth(view);
            }
        });
        ((ActivityPhysiologcalCalendarBinding) this.binding).tvYearMonth.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalCalendarActivity.this.lambda$initOnClickListener$2(view);
            }
        });
    }

    @Override // com.haibin.calendarview.CalendarView.l
    public void onCalendarOutOfRange(Calendar calendar) {
    }

    @Override // com.haibin.calendarview.CalendarView.l
    public void onCalendarSelect(Calendar calendar, boolean z7) {
        Date date = new Date();
        if (calendar.getMonth() == com.moyoung.dafit.module.common.utils.m.getMonth(date) || calendar.getYear() == com.moyoung.dafit.module.common.utils.m.getYear(date)) {
            this.physiologcalCalendarPresenter.getSelectedDayInfo(this, calendar);
        }
    }

    public void onCycleSettings(View view) {
        startActivity(PhysiologicalGuideActivity.getCallingIntent(this, false));
    }

    public void onDateClicked() {
        Calendar selectedCalendar = ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.getSelectedCalendar();
        int year = selectedCalendar.getYear();
        new YearMonthDialog(this).setCurrentYear(year).setCurrentMonth(selectedCalendar.getMonth()).setOnDoneClickListener(new a()).show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    public void onLastMonth(View view) {
        this.physiologcalCalendarPresenter.setLastMonth();
    }

    @Override // com.haibin.calendarview.CalendarView.o
    public void onMonthChange(int i8, int i9) {
        this.physiologcalCalendarPresenter.setYearMonth(i8, i9);
        showTodayText(i8, i9);
        getYearMonth(i8, i9);
    }

    public void onNextMonth(View view) {
        this.physiologcalCalendarPresenter.setNextMonth();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    public void onReminderModeClicked(View view) {
        startActivity(PhysiologicalReminderActivity.getCallingIntent(this, true));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        getPhysiologcalPeriod();
        s0.logPage(getClass(), "生理周期-详情页");
    }

    public void onTodayClicked() {
        ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.scrollToCurrent(true);
        this.physiologcalCalendarPresenter.setCurrentDate(((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.getCurYear(), ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.getCurMonth());
    }

    @Override // x2.a
    public void renderDescription(String str) {
        ((ActivityPhysiologcalCalendarBinding) this.binding).tvDescription.setText(str);
    }

    @Override // x2.a
    public void renderLastMonth(int i8, int i9) {
        scrollToCalendar(i8, i9);
    }

    @Override // x2.a
    public void renderNextMonth(int i8, int i9) {
        scrollToCalendar(i8, i9);
    }

    @Override // x2.a
    public void renderPhysiologcalPeriod(Map<String, Calendar> map) {
        ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.setSchemeDate(map);
        ((ActivityPhysiologcalCalendarBinding) this.binding).cvPhysiologcal.setSelectDefaultMode();
        onTodayClicked();
    }

    @Override // x2.a
    public void renderPhysiologcalPhase(String str) {
        ((ActivityPhysiologcalCalendarBinding) this.binding).tvPhysiologicalPhase.setText(str);
    }

    @Override // x2.a
    public void renderPregnancyChance(String str) {
        ((ActivityPhysiologcalCalendarBinding) this.binding).tvPregnancyChance.setText(str);
    }

    @Override // x2.a
    public void renderTitleYearMonth(String str) {
        ((ActivityPhysiologcalCalendarBinding) this.binding).tvYearMonth.setText(str);
    }
}
