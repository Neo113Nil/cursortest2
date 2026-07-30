package com.crrepa.band.my.health.heartrate;

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
import com.crrepa.band.my.databinding.Activity24HourHeartRateStatisticsBinding;
import com.crrepa.band.my.health.base.BaseCalendarHistoryActivity;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import com.orhanobut.logger.f;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class Band24HourHeartRateStatisticsActivity extends BaseActivity implements r2.a {
    private Activity24HourHeartRateStatisticsBinding binding;
    private com.crrepa.band.my.health.heartrate.presenter.a presenter = new com.crrepa.band.my.health.heartrate.presenter.a();

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 0) {
                s0.logEvent("点击全天心率_日");
            } else if (tab.getPosition() == 1) {
                s0.logEvent("点击全天心率_周");
            } else {
                s0.logEvent("点击全天心率_月");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public static Intent getCallingIntent(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) Band24HourHeartRateStatisticsActivity.class);
        intent.putExtra("statistics_date", date);
        return intent;
    }

    private void getHrStatisticsData() {
        Date statisticsDate = getStatisticsDate();
        f.d("date: " + statisticsDate);
        this.presenter.getHrStatisticsFragment(statisticsDate);
        this.presenter.getHrStatisticsData(statisticsDate);
    }

    private Date getStatisticsDate() {
        return (Date) getIntent().getSerializableExtra("statistics_date");
    }

    private void initTabLayout() {
        this.binding.tlHrStatisticsTab.setTabMode(1);
        Activity24HourHeartRateStatisticsBinding activity24HourHeartRateStatisticsBinding = this.binding;
        activity24HourHeartRateStatisticsBinding.tlHrStatisticsTab.setupWithViewPager(activity24HourHeartRateStatisticsBinding.vpHrStatisticsContent);
        this.binding.tlHrStatisticsTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    private void onHistoryClick() {
        startActivity(BaseCalendarHistoryActivity.getCallingIntent(this, Band24HourHeartRateHistoryActivity.class, getStatisticsDate()));
    }

    private void setActionBar() {
        setSupportActionBar(this.binding.includeTitleBar.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.binding.includeTitleBar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        this.binding.includeTitleBar.toolbar.setBackgroundResource(R.color.color_heart_rate);
        this.binding.includeTitleBar.tvToolbarTitle.setText(getString(R.string.continuous_heart_rate));
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

    private void showTotalTimes(int[] iArr) {
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        q2.a.setAnalysisTime(this, this.binding.includeHeartRateAnalysis.tvTotalMeasureTime, i8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_heart_rate);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Activity24HourHeartRateStatisticsBinding inflate = Activity24HourHeartRateStatisticsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        setActionBar();
        initTabLayout();
        getHrStatisticsData();
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
        s0.logPage(getClass(), "全天心率详情页");
    }

    @Override // r2.a
    public void renderHeartRateAnalysis(int... iArr) {
        this.binding.includeHeartRateAnalysis.heartRateRangeAnalysis.setHeartRateRangeData(60, iArr);
        showTotalTimes(iArr);
    }

    @Override // r2.a
    public void renderHrStatisticsFragment(List<Fragment> list) {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(list);
        this.binding.vpHrStatisticsContent.setAdapter(contentPagerAdapter);
        this.binding.vpHrStatisticsContent.setOffscreenPageLimit(list.size());
        setTabLayoutContent();
    }
}
