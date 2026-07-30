package com.crrepa.band.my.health.bodytemperature;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.databinding.ActivityTempStatisticsBinding;
import com.crrepa.band.my.health.base.BaseCalendarHistoryActivity;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import com.orhanobut.logger.f;
import java.util.Date;
import java.util.List;
import k3.d;
import l2.c;

/* loaded from: classes2.dex */
public class BandTimingTempStatisticsActivity extends BaseActivity implements m2.b {
    private ActivityTempStatisticsBinding binding;
    private com.crrepa.band.my.health.bodytemperature.presenter.b presenter = new com.crrepa.band.my.health.bodytemperature.presenter.b();

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 0) {
                s0.logEvent("点击全天体温_日");
            } else if (tab.getPosition() == 1) {
                s0.logEvent("点击全天体温_周");
            } else {
                s0.logEvent("点击全天体温_月");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public static Intent getCallingIntent(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) BandTimingTempStatisticsActivity.class);
        intent.putExtra("statistics_date", date);
        return intent;
    }

    private void getStatisticsData() {
        Date statisticsDate = getStatisticsDate();
        f.d("date: " + statisticsDate);
        this.presenter.getStatisticsFragment(statisticsDate);
        this.presenter.getLast7DaysAverageTemp(statisticsDate);
    }

    private Date getStatisticsDate() {
        return (Date) getIntent().getSerializableExtra("statistics_date");
    }

    private void initTabLayout() {
        this.binding.tlHrStatisticsTab.setTabMode(1);
        ActivityTempStatisticsBinding activityTempStatisticsBinding = this.binding;
        activityTempStatisticsBinding.tlHrStatisticsTab.setupWithViewPager(activityTempStatisticsBinding.vpHrStatisticsContent);
        this.binding.tlHrStatisticsTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    private void onHistoryClick() {
        startActivity(BaseCalendarHistoryActivity.getCallingIntent(this, BandTimingTempHistoryActivity.class, getStatisticsDate()));
    }

    private void setActionBar() {
        setSupportActionBar(this.binding.includeTitleBar.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.binding.includeTitleBar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        this.binding.includeTitleBar.toolbar.setBackgroundResource(R.color.color_temperature);
        this.binding.includeTitleBar.tvToolbarTitle.setText(getString(R.string.continuous_temperature));
    }

    private void setTabLayoutContent() {
        String[] stringArray = getResources().getStringArray(R.array.statistics_period_array);
        int tabCount = this.binding.tlHrStatisticsTab.getTabCount();
        for (int i8 = 0; i8 < stringArray.length && tabCount > i8; i8++) {
            TabLayout.Tab tabAt = this.binding.tlHrStatisticsTab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setCustomView(R.layout.item_statistics_tab);
                ((TextView) tabAt.getCustomView().findViewById(R.id.tv_tictistics_name)).setText(stringArray[i8]);
            }
        }
    }

    private void setTemperatureDescription() {
        boolean isFahrenheit = BandTempSystemProvider.isFahrenheit();
        this.binding.includeAboutTemperature.tvNormalTemperature.setText(c.getNormalTemperatureText(this, isFahrenheit));
        this.binding.includeAboutTemperature.tvFeverGrade.setText(c.getFeverGradeText(this, isFahrenheit));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_temperature);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityTempStatisticsBinding inflate = ActivityTempStatisticsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        setActionBar();
        setTemperatureDescription();
        initTabLayout();
        getStatisticsData();
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
        s0.logPage(getClass(), "全天体温详情页");
    }

    @Override // m2.b
    public void renderLast7DaysAverageTemp(Date date, List<Float> list) {
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setVisibility(0);
        this.binding.includeLast7TimesTrend.tvLast7TimesName.setText(R.string.last_7_days_average_temperature);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setup(7);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setMaxValue(50.0f);
        int color = ContextCompat.getColor(this, R.color.color_temperature);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisValueFormatter(new d(this, date));
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineColor(R.color.color_temperature);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineWidth(1);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setData(false, new int[]{color}, color, 0.4f, list);
    }

    @Override // m2.b
    public void renderStatisticsFragment(List<Fragment> list) {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(list);
        this.binding.vpHrStatisticsContent.setAdapter(contentPagerAdapter);
        this.binding.vpHrStatisticsContent.setOffscreenPageLimit(list.size());
        setTabLayoutContent();
    }
}
