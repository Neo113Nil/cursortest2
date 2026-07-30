package com.crrepa.band.my.health.sleep;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivitySleepStatisticsBinding;
import com.crrepa.band.my.databinding.SleepNapDayBinding;
import com.crrepa.band.my.databinding.SleepRatioBinding;
import com.crrepa.band.my.health.base.BaseCalendarHistoryActivity;
import com.crrepa.band.my.health.widgets.chart.marker.SleepTimeMarkerView;
import com.crrepa.band.my.model.db.SleepNap;
import com.crrepa.band.my.model.db.proxy.SleepNapDaoProxy;
import com.crrepa.band.my.model.user.provider.UserGenderProvider;
import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import com.github.mikephil.charting.components.MarkerView;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.h0;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.q0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.utils.y;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import com.moyoung.dafit.module.common.widgets.chart.CrpBarChart;
import com.moyoung.dafit.module.common.widgets.chart.marker.SameGroupMarkerView;
import com.moyoung.instructions.utils.InstructionsType;
import java.util.Date;
import java.util.List;
import m3.j;

/* loaded from: classes2.dex */
public class BandSleepStatisticsActivity extends BaseActivity implements a3.a {
    private static final float PIECHART_TEXT_BIG_PROPORTION = 1.2f;
    private static final float PIECHART_TEXT_SMALL_PROPORTION = 0.7f;
    ActivitySleepStatisticsBinding binding;
    private final com.crrepa.band.my.health.sleep.presenter.a presenter = new com.crrepa.band.my.health.sleep.presenter.a();
    private final j sleepQualitySegmentBarFormat = new j();

    class a implements Runnable {
        final /* synthetic */ CrpBarChart val$chart;
        final /* synthetic */ int val$index;

        a(CrpBarChart crpBarChart, int i8) {
            this.val$chart = crpBarChart;
            this.val$index = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            BandSleepStatisticsActivity.this.setSameAgeGroupChartMarkView(this.val$chart, this.val$index);
        }
    }

    class b implements TabLayout.OnTabSelectedListener {
        b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 0) {
                s0.logEvent("点击睡眠_日");
            } else if (tab.getPosition() == 1) {
                s0.logEvent("点击睡眠_周");
            } else {
                s0.logEvent("点击睡眠_月");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public static Intent getCallingIntent(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) BandSleepStatisticsActivity.class);
        intent.putExtra("statistics_date", date);
        return intent;
    }

    private Date getStatisticsDate() {
        return (Date) getIntent().getSerializableExtra("statistics_date");
    }

    private void getTodaySleep() {
        Date statisticsDate = getStatisticsDate();
        this.presenter.getStepStatisticsFragment(statisticsDate);
        this.presenter.getSleepDetail(statisticsDate);
        this.presenter.getSleepNapDetail(statisticsDate);
    }

    private void initLast7DaySleepTrendChart() {
        this.binding.includeLastWeekSleepTrend.last7daySleepTrendChart.setXAxisLineColor(R.color.sleep_assist_9);
        this.binding.includeLastWeekSleepTrend.last7daySleepTrendChart.setup(7);
        this.binding.includeLastWeekSleepTrend.last7daySleepTrendChart.setXAxisLineWidth(1);
    }

    private void initMindsootheCard() {
        q0.setGradientColor(this.binding.includeMindsoothe.tvMindsootheTitle, new int[]{Color.parseColor("#3E66A9"), Color.parseColor("#27416C")});
        y.initMindsootheCard(this.binding.includeMindsoothe.llMindsoothe);
        this.binding.includeMindsoothe.cardMindsoothe.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.sleep.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandSleepStatisticsActivity.this.lambda$initMindsootheCard$1(view);
            }
        });
    }

    private void initSameAgeGroupChart(CrpBarChart crpBarChart, int i8) {
        crpBarChart.setXAxisLineColor(R.color.sleep_assist_9);
        crpBarChart.setup(7);
        crpBarChart.setMaxValue(i8);
        crpBarChart.hideXAxisValue();
    }

    private void initTabLayout() {
        this.binding.tlSleepStatisticsTab.setTabMode(1);
        ActivitySleepStatisticsBinding activitySleepStatisticsBinding = this.binding;
        activitySleepStatisticsBinding.tlSleepStatisticsTab.setupWithViewPager(activitySleepStatisticsBinding.vpSleepStatisticsContent);
        this.binding.tlSleepStatisticsTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMindsootheCard$1(View view) {
        y.openMindsootheAppDetailPage(this);
        s0.logEvent("冥想引流入口", "meditation_entry_type", "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderSleepNapData$0(View view) {
        new SleepNapTipsDialog(this).show();
    }

    private void onHistoryClick() {
        startActivity(BaseCalendarHistoryActivity.getCallingIntent(this, BandSleepHistoryActivity.class, getStatisticsDate()));
    }

    private void setActionBar() {
        setSupportActionBar(this.binding.includeTitleBar.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.binding.includeTitleBar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        this.binding.includeTitleBar.toolbar.setBackgroundResource(R.color.color_sleep);
        this.binding.includeTitleBar.tvToolbarTitle.setText(R.string.sleep);
    }

    private void setRemTime(int i8) {
        if (i8 <= 0) {
            return;
        }
        this.binding.includeSleepRatio.llSleepRem.setVisibility(0);
        SleepRatioBinding sleepRatioBinding = this.binding.includeSleepRatio;
        setSleepTime(sleepRatioBinding.tvRemHour, sleepRatioBinding.tvRemMinute, i8);
    }

    private void setSameAgeGroupChartData(CrpBarChart crpBarChart, int i8, List<Float> list) {
        crpBarChart.setData(false, new int[]{ContextCompat.getColor(this, R.color.color_sleep_same_age_group_bar_bg)}, ContextCompat.getColor(this, R.color.color_sleep_same_age_group_bar_high_light_bg), 0.4f, list);
        crpBarChart.post(new a(crpBarChart, i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSameAgeGroupChartMarkView(CrpBarChart crpBarChart, int i8) {
        crpBarChart.setMarkerView((MarkerView) new SameGroupMarkerView(this, R$drawable.ic_user_sleep, R.drawable.sleep_same_group_vertical_line, crpBarChart.getHeight()));
        crpBarChart.showMarkerViewOfBar(i8);
    }

    private void setSameAgeTitle(int i8, int i9, TextView textView) {
        String string = getString(R.string.percent_unit);
        textView.setText(h0.getBuilder(getString(R.string.comparison)).append(l.SPACE + i8 + string + l.SPACE).setBold().append(getString(i9)).create());
    }

    private void setSleepRatio(float... fArr) {
        if (fArr == null) {
            return;
        }
        this.binding.includeSleepRatio.rlSleepRatio.setVisibility(0);
        this.binding.includeSleepRatio.pcSleepRatio.setup();
        this.binding.includeSleepRatio.pcSleepRatio.setData(fArr, new int[]{ContextCompat.getColor(this, R.color.color_restful), ContextCompat.getColor(this, R.color.color_light), ContextCompat.getColor(this, R.color.color_rem)});
    }

    private void setSleepTime(TextView textView, TextView textView2, int i8) {
        textView.setText(String.valueOf(i8 / 60));
        textView2.setText(n.format(i8 % 60, n.TWO_INTEGERS_PATTERN));
    }

    private void setTabLayoutContent() {
        String[] stringArray = getResources().getStringArray(R.array.statistics_period_array);
        int tabCount = this.binding.tlSleepStatisticsTab.getTabCount();
        for (int i8 = 0; i8 < stringArray.length && tabCount > i8; i8++) {
            TabLayout.Tab tabAt = this.binding.tlSleepStatisticsTab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setCustomView(R.layout.item_statistics_tab);
                ((TextView) tabAt.getCustomView().findViewById(R.id.tv_tictistics_name)).setText(stringArray[i8]);
            }
        }
    }

    private void setTotalSleepTime(int i8) {
        this.binding.includeSleepRatio.pcSleepRatio.setCenterText(h0.getBuilder(String.valueOf(i8 / 60)).setProportion(PIECHART_TEXT_BIG_PROPORTION).setBold().append(l.SPACE).append(getString(R.string.hour)).setProportion(0.7f).append(l.SPACE).append(n.format(i8 % 60, n.TWO_INTEGERS_PATTERN)).setProportion(PIECHART_TEXT_BIG_PROPORTION).setBold().append(l.SPACE).append(getString(R.string.minute)).setProportion(0.7f).append("\n").append(getString(R.string.total_sleep)).setProportion(PIECHART_TEXT_BIG_PROPORTION).setAlign(Layout.Alignment.ALIGN_CENTER).create());
    }

    private void setUserGender() {
        String string = getString(R.string.male);
        if (UserGenderProvider.getUsetGender() == 0) {
            string = getString(R.string.female);
        }
        String string2 = getString(R.string.compared_same_age_group, string);
        this.binding.includeSleepEarlyChart.tvSleepEarlySameAgeGender.setText(string2);
        this.binding.includeGetUpChart.tvGetUpSameAgeGender.setText(string2);
        this.binding.includeLessSleepChart.tvLessSleepSameAgeGender.setText(string2);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_sleep);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivitySleepStatisticsBinding inflate = ActivitySleepStatisticsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        setActionBar();
        initTabLayout();
        this.sleepQualitySegmentBarFormat.createBarView(this, this.binding.includeSleepQuality.includeSleepQualitySegment.sleepQualitySliderBar);
        initLast7DaySleepTrendChart();
        initSameAgeGroupChart(this.binding.includeSleepEarlyChart.sleepEarlySameGroupComparedChart, 32);
        initSameAgeGroupChart(this.binding.includeGetUpChart.getUpSameGroupComparedChart, 35);
        initSameAgeGroupChart(this.binding.includeLessSleepChart.lessSleepSameGroupComparedChart, 32);
        setUserGender();
        getTodaySleep();
        ImageView imageView = (ImageView) findViewById(R.id.iv_help);
        imageView.setVisibility(0);
        com.moyoung.instructions.c.hook(InstructionsType.SLEEP, imageView);
        initMindsootheCard();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.band_calendar_menu, menu);
        return true;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
        this.binding = null;
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
        this.presenter.pause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.presenter.resume();
        s0.logPage(getClass(), "睡眠详情页");
    }

    @Override // a3.a
    public void renderAverageBloodOxygen(int i8) {
        this.binding.includeBloodOxygen.tvSleepAverageBo.setText(String.valueOf(i8));
    }

    @Override // a3.a
    public void renderAverageHeartRate(int i8) {
        com.crrepa.band.my.health.base.d.setBandMeasureData(this, this.binding.includeHeartRate.tvSleepAverageHr, i8);
    }

    @Override // a3.a
    public void renderGetUpSameAgeGroup(int i8, int i9) {
        this.binding.includeGetUpChart.llGetUpChart.setVisibility(0);
        setSameAgeGroupChartData(this.binding.includeGetUpChart.getUpSameGroupComparedChart, i8, z2.b.getBarList());
        setSameAgeTitle(i9, R.string.get_up_early, this.binding.includeGetUpChart.tvGetUpComparedPercent);
    }

    @Override // a3.a
    public void renderHighestHeartRate(int i8) {
        com.crrepa.band.my.health.base.d.setBandMeasureData(this, this.binding.includeHeartRate.includeHrExtremes.tvHighestHeartRate, i8);
    }

    @Override // a3.a
    public void renderLast7DaySleepTrend(List<Float> list, List<Float> list2, List<Float> list3, Date date) {
        this.binding.includeLastWeekSleepTrend.rlLastWeekSleepTrend.setVisibility(0);
        this.binding.includeLastWeekSleepTrend.last7daySleepTrendChart.setMaxValue(g5.c.getSleepTimeMaxValue(list, list2, list3));
        this.binding.includeLastWeekSleepTrend.last7daySleepTrendChart.setXAxisValueFormatter(new k3.d(this, date));
        int color = ContextCompat.getColor(this, R.color.color_restful);
        int[] iArr = {color, ContextCompat.getColor(this, R.color.color_light), ContextCompat.getColor(this, R.color.color_rem)};
        this.binding.includeLastWeekSleepTrend.last7daySleepTrendChart.setMarkerView((MarkerView) new SleepTimeMarkerView(this, color));
        this.binding.includeLastWeekSleepTrend.last7daySleepTrendChart.setData(false, iArr, color, 0.4f, list, list2, list3);
    }

    @Override // a3.a
    public void renderLessSleepSameAgeGroup(int i8, int i9) {
        this.binding.includeLessSleepChart.llLessSleepChart.setVisibility(0);
        setSameAgeGroupChartData(this.binding.includeLessSleepChart.lessSleepSameGroupComparedChart, i8, z2.c.getBarList());
        setSameAgeTitle(i9, R.string.less_sleep, this.binding.includeLessSleepChart.tvLessSleepComparedPercent);
    }

    @Override // a3.a
    public void renderLowestHeartRate(int i8) {
        com.crrepa.band.my.health.base.d.setBandMeasureData(this, this.binding.includeHeartRate.includeHrExtremes.tvLowestHeartRate, i8);
    }

    @Override // a3.a
    public void renderMaxBloodOxygen(int i8) {
        this.binding.includeBloodOxygen.includeBloodOxygenStatistics.tvMaxBo.setText(String.valueOf(i8));
    }

    @Override // a3.a
    public void renderMinBloodOxygen(int i8) {
        this.binding.includeBloodOxygen.includeBloodOxygenStatistics.tvMinBo.setText(String.valueOf(i8));
    }

    @Override // a3.a
    public void renderSleepBloodOxygenChart(List<Float> list) {
        this.binding.includeBloodOxygen.llSleepBo.setVisibility(0);
        this.binding.includeBloodOxygen.bloodOxygenChart.init(1);
        this.binding.includeBloodOxygen.bloodOxygenChart.setXAxisLineColor(R.color.color_blood_oxygen);
        this.binding.includeBloodOxygen.bloodOxygenChart.setXAxisLineWidth(1);
        this.binding.includeBloodOxygen.bloodOxygenChart.setXAxisTextColor(R.color.black);
        this.binding.includeBloodOxygen.bloodOxygenChart.hideXAxisLabels();
        this.binding.includeBloodOxygen.bloodOxygenChart.setMaxValue(100.0f);
        this.binding.includeBloodOxygen.bloodOxygenChart.setData(list, ContextCompat.getDrawable(this, R.drawable.fade_blood_oxygen_chart), ContextCompat.getColor(this, R.color.color_blood_oxygen), 1.8f);
    }

    @Override // a3.a
    public void renderSleepEarlySameAgeGroup(int i8, int i9) {
        this.binding.includeSleepEarlyChart.llSleepEarlyChart.setVisibility(0);
        setSameAgeGroupChartData(this.binding.includeSleepEarlyChart.sleepEarlySameGroupComparedChart, i8, z2.e.getBarList());
        setSameAgeTitle(i9, R.string.sleep_early, this.binding.includeSleepEarlyChart.tvSleepEarlyComparedPercent);
    }

    @Override // a3.a
    public void renderSleepHeartRateChart(List<Float> list) {
        this.binding.includeHeartRate.llSleepHr.setVisibility(0);
        this.binding.includeHeartRate.heartRateChart.init(1);
        this.binding.includeHeartRate.heartRateChart.setXAxisLineColor(R.color.color_heart_rate);
        this.binding.includeHeartRate.heartRateChart.setXAxisLineWidth(1);
        this.binding.includeHeartRate.heartRateChart.setXAxisTextColor(R.color.black);
        this.binding.includeHeartRate.heartRateChart.hideXAxisLabels();
        this.binding.includeHeartRate.heartRateChart.setMaxValue(210.0f);
        this.binding.includeHeartRate.heartRateChart.setData(list, ContextCompat.getDrawable(this, R.drawable.fade_heart_rate_chart), ContextCompat.getColor(this, R.color.color_heart_rate), 1.8f);
    }

    @Override // a3.a
    public void renderSleepNapData(SleepNap sleepNap) {
        List<CRPNapSleepInfo> napList = sleepNap.getNapList();
        if (x0.isEmpty(napList)) {
            return;
        }
        this.binding.includeNap.rlNap.setVisibility(0);
        int napTotalTime = SleepNapDaoProxy.getNapTotalTime(napList);
        SleepNapDayBinding sleepNapDayBinding = this.binding.includeNap;
        e.bindTotalSleepTimeView(napTotalTime, sleepNapDayBinding.tvNapTimeHour, sleepNapDayBinding.tvNapTimeMinute);
        this.binding.includeNap.rvNap.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        SleepNapAdapter sleepNapAdapter = new SleepNapAdapter();
        this.binding.includeNap.rvNap.setAdapter(sleepNapAdapter);
        sleepNapAdapter.setNewData(napList);
        this.binding.includeNap.ivTips.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.sleep.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandSleepStatisticsActivity.this.lambda$renderSleepNapData$0(view);
            }
        });
    }

    @Override // a3.a
    public void renderSleepQuality(int i8) {
        String string = getString(R.string.data_blank);
        if (i8 > 0) {
            string = String.valueOf(i8);
        } else {
            i8 = -1;
        }
        this.binding.includeSleepQuality.tvSleepQuality.setText(string);
        this.binding.includeSleepQuality.includeSleepQualitySegment.sleepQualitySliderBar.setValue(Float.valueOf(i8));
    }

    @Override // a3.a
    public void renderSleepStatisticsFragment(List<Fragment> list) {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(list);
        this.binding.vpSleepStatisticsContent.setAdapter(contentPagerAdapter);
        this.binding.vpSleepStatisticsContent.setOffscreenPageLimit(list.size());
        setTabLayoutContent();
    }

    @Override // a3.a
    public void renderSleepTime(int i8, int i9, int i10) {
        setTotalSleepTime(i8 + i9 + i10);
        SleepRatioBinding sleepRatioBinding = this.binding.includeSleepRatio;
        setSleepTime(sleepRatioBinding.tvRestfulHour, sleepRatioBinding.tvRestfulMinute, i8);
        SleepRatioBinding sleepRatioBinding2 = this.binding.includeSleepRatio;
        setSleepTime(sleepRatioBinding2.tvLightHour, sleepRatioBinding2.tvLightMinute, i9);
        setRemTime(i10);
        setSleepRatio(i8, i9, i10);
    }

    @Override // a3.a
    public void renderSleepTime(Date date, String str, String str2) {
        Date[] sleepDate = e.getSleepDate(date, str, str2);
        if (sleepDate == null) {
            return;
        }
        String sleepStartEndTime = e.getSleepStartEndTime(this, sleepDate[0], getString(R.string.fall_asleep));
        String sleepStartEndTime2 = e.getSleepStartEndTime(this, sleepDate[1], getString(R.string.wake_up));
        this.binding.includeHeartRate.tvStartMeasureTime.setText(sleepStartEndTime);
        this.binding.includeHeartRate.tvStopMeasureTime.setText(sleepStartEndTime2);
        this.binding.includeBloodOxygen.tvBoStartTime.setText(sleepStartEndTime);
        this.binding.includeBloodOxygen.tvBoEndTime.setText(sleepStartEndTime2);
    }
}
