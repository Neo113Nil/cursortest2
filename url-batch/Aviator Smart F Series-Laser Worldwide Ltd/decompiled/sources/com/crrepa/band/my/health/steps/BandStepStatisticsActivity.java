package com.crrepa.band.my.health.steps;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import cn.hutool.core.text.l;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityStepStatisticsBinding;
import com.crrepa.band.my.health.base.BaseCalendarHistoryActivity;
import com.crrepa.band.my.health.base.LastWeekActivityStandardAdapter;
import com.crrepa.band.my.health.steps.model.LastWeekActivityStandardModel;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.github.mikephil.charting.components.MarkerView;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.h;
import com.moyoung.dafit.module.common.utils.h0;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import com.moyoung.dafit.module.common.widgets.chart.marker.SameGroupMarkerView;
import java.util.Date;
import java.util.List;
import k3.f;

/* loaded from: classes2.dex */
public class BandStepStatisticsActivity extends BaseActivity implements c3.a {
    private static final int EFFETIVE_ACTIVITY_MAX_VALUE = 150;
    private ActivityStepStatisticsBinding binding;
    private com.crrepa.band.my.health.steps.presenter.a stepStatisticsPresenter = new com.crrepa.band.my.health.steps.presenter.a();

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 0) {
                s0.logEvent("点击步数_日");
            } else if (tab.getPosition() == 1) {
                s0.logEvent("点击步数_周");
            } else {
                s0.logEvent("点击步数_月");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    class b implements Runnable {
        final /* synthetic */ int val$index;

        b(int i8) {
            this.val$index = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BandStepStatisticsActivity.this.setSameAgeGroupChartMarkView(this.val$index);
        }
    }

    public static Intent getCallingIntent(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) BandStepStatisticsActivity.class);
        intent.putExtra("statistics_date", date);
        return intent;
    }

    private Date getStatisticsDate() {
        return (Date) getIntent().getSerializableExtra("statistics_date");
    }

    private void initEffetiveActivityChart() {
        this.binding.includeEffectiveActivity.effectiveActivityChart.setup(7);
        this.binding.includeEffectiveActivity.effectiveActivityChart.setMaxValue(150.0f);
        this.binding.includeEffectiveActivity.effectiveActivityChart.setXAxisValueFormatter(new f(this));
        this.binding.includeEffectiveActivity.effectiveActivityChart.setDrawValueAboveBar(true);
        this.binding.includeEffectiveActivity.effectiveActivityChart.setXAxisLineColor(R.color.color_step);
        this.binding.includeEffectiveActivity.effectiveActivityChart.setXAxisLineWidth(1);
    }

    private void initSameGroupChart() {
        this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.setup(7);
        this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.setMaxValue(28.0f);
        this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.hideXAxisValue();
        this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.setXAxisLineColor(R.color.color_step_daily_completion);
        this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.setXAxisLineWidth(1);
    }

    private void initTabLayout() {
        this.binding.tlStepsStatisticsTab.setTabMode(1);
        ActivityStepStatisticsBinding activityStepStatisticsBinding = this.binding;
        activityStepStatisticsBinding.tlStepsStatisticsTab.setupWithViewPager(activityStepStatisticsBinding.vpStepsStatisticsContent);
        this.binding.tlStepsStatisticsTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    private void onHistoryClick() {
        startActivity(BaseCalendarHistoryActivity.getCallingIntent(this, BandStepHistoryActivity.class, getStatisticsDate()));
    }

    private void setActionBar() {
        setSupportActionBar(this.binding.includeTitleBar.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.binding.includeTitleBar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        this.binding.includeTitleBar.toolbar.setBackgroundResource(R.color.color_step);
        this.binding.includeTitleBar.tvToolbarTitle.setText(R.string.steps);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSameAgeGroupChartMarkView(int i8) {
        this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.setMarkerView((MarkerView) new SameGroupMarkerView(this, R$drawable.ic_user_step, R.drawable.step_same_group_vertical_line, this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.getHeight()));
        this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.showMarkerViewOfBar(i8);
    }

    private void setTabLayoutContent() {
        String[] stringArray = getResources().getStringArray(R.array.statistics_period_array);
        int tabCount = this.binding.tlStepsStatisticsTab.getTabCount();
        for (int i8 = 0; i8 < stringArray.length && tabCount > i8; i8++) {
            TabLayout.Tab tabAt = this.binding.tlStepsStatisticsTab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setCustomView(R.layout.item_statistics_tab);
                ((TextView) tabAt.getCustomView().findViewById(R.id.tv_tictistics_name)).setText(stringArray[i8]);
            }
        }
    }

    private void setUserGender() {
        String string = getString(R.string.male);
        if (UserGenderProvider.getUsetGender() == 0) {
            string = getString(R.string.female);
        }
        this.binding.includeSameAgeGroupChart.tvSameAgeGender.setText(getString(R.string.compared_same_age_group, string));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_step);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityStepStatisticsBinding inflate = ActivityStepStatisticsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.stepStatisticsPresenter.setView(this);
        setActionBar();
        initEffetiveActivityChart();
        initSameGroupChart();
        initTabLayout();
        setUserGender();
        Date statisticsDate = getStatisticsDate();
        com.orhanobut.logger.f.d("date: " + statisticsDate);
        this.stepStatisticsPresenter.getStatisticsFragment(statisticsDate);
        this.stepStatisticsPresenter.getStepsDetail(statisticsDate);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.band_calendar_menu, menu);
        return true;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressedSupport();
        } else if (itemId == R.id.menu_band_data_history) {
            onHistoryClick();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.stepStatisticsPresenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.stepStatisticsPresenter.resume();
        s0.logPage(getClass(), "步数详情页");
    }

    @Override // c3.a
    public void renderLast7DayActivityStandard(List<LastWeekActivityStandardModel> list, Date date) {
        this.binding.includeLastWeekActivityStandard.rcvLastWeekActivityStandard.setLayoutManager(new GridLayoutManager(this, 7));
        LastWeekActivityStandardAdapter lastWeekActivityStandardAdapter = new LastWeekActivityStandardAdapter();
        this.binding.includeLastWeekActivityStandard.rcvLastWeekActivityStandard.setAdapter(lastWeekActivityStandardAdapter);
        lastWeekActivityStandardAdapter.setData(list, date);
    }

    @Override // c3.a
    public void renderSameAgeGroupChart(int i8, int i9) {
        String string = getString(R.string.percent_unit);
        this.binding.includeSameAgeGroupChart.tvStepComparedPercentage.setText(h0.getBuilder(getString(R.string.comparison)).append(l.SPACE + i9 + string + l.SPACE).setBold().append(getString(R.string.go_more_steps)).create());
        int color = ContextCompat.getColor(this, R.color.color_step_same_age_group_bar_bg);
        this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.setData(false, new int[]{color}, ContextCompat.getColor(this, R.color.color_step_daily_completion), 0.4f, b3.b.getBarDatas());
        this.binding.includeSameAgeGroupChart.stepSameGroupComparedChart.post(new b(i8));
    }

    @Override // c3.a
    public void renderStatisticsFragment(List<Fragment> list) {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(list);
        this.binding.vpStepsStatisticsContent.setAdapter(contentPagerAdapter);
        this.binding.vpStepsStatisticsContent.setOffscreenPageLimit(list.size());
        setTabLayoutContent();
    }

    @Override // c3.a
    public void renderThisWeekEffetiveActivity(int i8) {
        this.binding.includeEffectiveActivity.tvWeekEffectiveActivityTime.setText(String.valueOf(i8));
    }

    @Override // c3.a
    public void renderThisWeekEffetiveActivityChart(List<Float> list) {
        int color = ContextCompat.getColor(this, R.color.color_step);
        this.binding.includeEffectiveActivity.effectiveActivityChart.setData(true, new int[]{color}, color, 0.4f, list);
    }

    @Override // c3.a
    public void renderTodayEffetiveActivity(int i8) {
        this.binding.includeEffectiveActivity.tvEffectiveActivityTime.setText(String.valueOf(i8));
    }

    @Override // c3.a
    public void renderTodayGomoreData(Integer num, Integer num2, Integer num3) {
        if (num2 == null && num == null && num3 == null) {
            this.binding.includeLastStatistics.llGomoreData.setVisibility(8);
        } else {
            this.binding.includeLastStatistics.llGomoreData.setVisibility(0);
        }
        if (num == null || num.intValue() == 0) {
            this.binding.includeLastStatistics.tvFat.setText(HttpClient.ENDFLAG);
        } else {
            this.binding.includeLastStatistics.tvFat.setText(String.valueOf(num));
        }
        if (num2 == null || num2.intValue() == 0) {
            this.binding.includeLastStatistics.tvCarb.setText(HttpClient.ENDFLAG);
        } else {
            this.binding.includeLastStatistics.tvCarb.setText(String.valueOf(num2));
        }
        if (num3 == null || num3.intValue() == 0) {
            this.binding.includeLastStatistics.tvMetabolism.setText(HttpClient.ENDFLAG);
        } else {
            this.binding.includeLastStatistics.tvMetabolism.setText(String.valueOf(num3));
        }
    }

    @Override // c3.a
    public void renderTodaySteps(Step step) {
        int i8;
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        if (step != null) {
            i8 = step.getDistance().intValue();
            String actionDistance = com.crrepa.band.my.health.base.a.getActionDistance(i8, unitSystem);
            String format = n.format(step.getCalory().floatValue());
            String format2 = n.format(h.getActiveTime(step.getSteps().intValue(), step.getTime()));
            this.binding.includeLastStatistics.tvActionDistance.setText(actionDistance);
            this.binding.includeLastStatistics.tvActionCalories.setText(format);
            this.binding.includeLastStatistics.tvActionTime.setText(format2);
        } else {
            i8 = 0;
        }
        this.binding.includeLastStatistics.tvDistanceUnit.setText(com.crrepa.band.my.health.base.a.getActionDistanceUnit(i8, unitSystem));
    }
}
