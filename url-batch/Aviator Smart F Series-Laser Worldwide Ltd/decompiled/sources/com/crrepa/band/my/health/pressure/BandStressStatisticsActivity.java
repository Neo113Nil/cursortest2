package com.crrepa.band.my.health.pressure;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.ble.band.cmd.d;
import com.crrepa.band.my.ble.band.connect.f;
import com.crrepa.band.my.databinding.ActivityBandStressStatisticsBinding;
import com.crrepa.band.my.health.base.BaseCalendarHistoryActivity;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.pressure.model.StressSegmentUtils;
import com.crrepa.band.my.health.widgets.chart.marker.MeasureDateMarkerView;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.crrepa.band.my.model.db.Stress;
import com.github.mikephil.charting.components.MarkerView;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseActivity;
import com.moyoung.dafit.module.common.utils.q0;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.y;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import com.moyoung.instructions.utils.InstructionsType;
import java.util.Date;
import java.util.List;
import m3.i;

/* loaded from: classes2.dex */
public class BandStressStatisticsActivity extends BaseActivity implements y2.a {
    private ActivityBandStressStatisticsBinding binding;
    private Date date;
    private com.crrepa.band.my.health.pressure.presenter.a presenter = new com.crrepa.band.my.health.pressure.presenter.a();
    private i segmentBarProxy = new i();
    private boolean measuring = false;

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getPosition() == 0) {
                s0.logEvent("点击压力_日");
            } else if (tab.getPosition() == 1) {
                s0.logEvent("点击压力_周");
            } else {
                s0.logEvent("点击压力_月");
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public static Intent getCallingIntent(Context context, long j8) {
        Intent intent = new Intent(context, (Class<?>) BandStressStatisticsActivity.class);
        intent.putExtra("statistics_id", j8);
        return intent;
    }

    private Date getStatisticsDate() {
        return (Date) getIntent().getSerializableExtra("statistics_date");
    }

    private void initMindsootheCard() {
        q0.setGradientColor(this.binding.includeMindsoothe.tvMindsootheTitle, new int[]{Color.parseColor("#545D8E"), Color.parseColor("#2A314C")});
        y.initMindsootheCard(this.binding.includeMindsoothe.llMindsoothe);
        this.binding.includeMindsoothe.cardMindsoothe.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.pressure.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandStressStatisticsActivity.this.lambda$initMindsootheCard$1(view);
            }
        });
    }

    private void initTabLayout() {
        this.binding.tlStressTab.setTabMode(1);
        ActivityBandStressStatisticsBinding activityBandStressStatisticsBinding = this.binding;
        activityBandStressStatisticsBinding.tlStressTab.setupWithViewPager(activityBandStressStatisticsBinding.vpStressContent);
        this.binding.tlStressTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initMindsootheCard$1(View view) {
        y.openMindsootheAppDetailPage(this);
        s0.logEvent("冥想引流入口", "meditation_entry_type", "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        onMeasureClicled();
    }

    private void setActionBar() {
        setSupportActionBar(this.binding.includeTitleBar.toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        this.binding.includeTitleBar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        this.binding.includeTitleBar.toolbar.setBackgroundResource(R.color.color_stress);
        this.binding.includeTitleBar.tvToolbarTitle.setText(getString(R.string.stress));
    }

    private void setTabLayoutContent() {
        String[] stringArray = getResources().getStringArray(R.array.statistics_period_array);
        int tabCount = this.binding.tlStressTab.getTabCount();
        for (int i8 = 0; i8 < stringArray.length && tabCount > i8; i8++) {
            TabLayout.Tab tabAt = this.binding.tlStressTab.getTabAt(i8);
            if (tabAt != null) {
                tabAt.setCustomView(R.layout.item_statistics_tab);
                ((TextView) tabAt.getCustomView().findViewById(R.id.tv_tictistics_name)).setText(stringArray[i8]);
            }
        }
    }

    private void showMeasureButtonText(boolean z7) {
        this.binding.btnBandMeasure.setText(z7 ? R.string.click_to_start_measure : R.string.click_to_stop_measure);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity
    protected int getStatusBarColor() {
        return ContextCompat.getColor(this, R.color.color_stress);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityBandStressStatisticsBinding inflate = ActivityBandStressStatisticsBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        this.presenter.setView(this);
        setActionBar();
        initTabLayout();
        showMeasureButtonText(true);
        this.binding.includeLast7TimesTrend.tvLast7TimesName.setText(R.string.last_7_times_stress);
        this.date = getStatisticsDate();
        this.presenter.getStressDetail(this.date, getIntent().getLongExtra("statistics_id", -1L));
        com.moyoung.instructions.c.hook(InstructionsType.STRESS, findViewById(R.id.iv_help));
        initMindsootheCard();
        this.binding.btnBandMeasure.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.pressure.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandStressStatisticsActivity.this.lambda$onCreate$0(view);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.band_stress_history_menu, menu);
        return true;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.presenter.destroy();
    }

    public void onMeasureClicled() {
        if (!f.getInstance().isConnected()) {
            r0.showLong(this, getString(R.string.band_setting_send_fail));
            return;
        }
        if (BandBatteryProvider.isMeasureLowBattery()) {
            r0.showLong(this, getString(R.string.measure_low_battery_hint));
            return;
        }
        if (this.measuring) {
            d.getInstance().stopMeasureStress();
            showMeasureButtonText(true);
            this.measuring = false;
        } else {
            d.getInstance().startMeasureStress();
            showMeasureButtonText(false);
            this.measuring = true;
            s0.logEvent("点击测量压力");
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                onBackPressedSupport();
                break;
            case R.id.menu_data_history /* 2131363113 */:
                startActivity(BaseCalendarHistoryActivity.getCallingIntent(this, BandTimingStressHistoryActivity.class, getStatisticsDate()));
                break;
            case R.id.menu_history /* 2131363114 */:
                startActivity(BandStressHistoryActivity.getCallingIntent(this));
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        showMeasureButton(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        showMeasureButton(true);
        s0.logPage(getClass(), "压力详情页");
    }

    @Override // y2.a
    public void renderLast7TimesStress(List<Float> list, Date[] dateArr) {
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setVisibility(0);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setup(7);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setMaxValue(100.0f);
        int color = ContextCompat.getColor(this, R.color.color_stress_bar_bg);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisValueFormatter(new f5.a(list));
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineColor(R.color.color_stress_bar_bg);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineWidth(2);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setData(false, new int[]{color}, color, 0.4f, list);
        this.binding.includeLast7TimesTrend.last7TimesTrendChart.setMarkerView((MarkerView) new MeasureDateMarkerView(this, dateArr, j.getSyncTimeFormat(this), color));
    }

    @Override // y2.a
    public void renderMeasureComplete() {
        showMeasureButtonText(true);
        this.measuring = false;
    }

    @Override // y2.a
    public void renderStatisticsFragment(List<Fragment> list) {
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(list);
        this.binding.vpStressContent.setAdapter(contentPagerAdapter);
        this.binding.vpStressContent.setOffscreenPageLimit(list.size());
        setTabLayoutContent();
    }

    @Override // y2.a
    public void renderStress(Stress stress) {
        int intValue;
        String valueOf;
        if (stress == null) {
            valueOf = getString(R.string.data_blank);
            intValue = -1;
        } else {
            this.date = stress.getDate();
            intValue = stress.getStress().intValue();
            valueOf = String.valueOf(intValue);
        }
        com.crrepa.band.my.health.base.d.setBandDataStatisticsDate(this, this.binding.tvStressDate, this.date);
        this.binding.tvLastStress.setText(valueOf);
        this.segmentBarProxy.createBarView(this.binding.stressSliderBar, StressSegmentUtils.getStressSegmentValueArray(), StressSegmentUtils.getStressSegmentColorArray(this));
        this.segmentBarProxy.setSlider(this.binding.stressSliderBar, intValue);
    }

    @Override // y2.a
    public void renderStressPercent(int[] iArr, int[] iArr2) {
        if (iArr.length < 4) {
            return;
        }
        this.binding.chartStressPercent.setVisibility(0);
        this.binding.chartStressPercent.setup();
        float[] fArr = new float[iArr.length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            fArr[i8] = iArr[i8];
        }
        this.binding.chartStressPercent.setData(fArr, iArr2);
        this.binding.tvRelaxedPercent.setText(getString(R.string.percent_format, String.valueOf(iArr[0])));
        this.binding.tvNormalPercent.setText(getString(R.string.percent_format, String.valueOf(iArr[1])));
        this.binding.tvMediumPercent.setText(getString(R.string.percent_format, String.valueOf(iArr[2])));
        this.binding.tvStressedPercent.setText(getString(R.string.percent_format, String.valueOf(iArr[3])));
    }

    public void showMeasureButton(boolean z7) {
        if (!f.getInstance().isConnected()) {
            this.binding.bandMeasureView.setVisibility(8);
        } else if (z7) {
            this.binding.bandMeasureView.setVisibility(0);
        } else {
            this.binding.bandMeasureView.setVisibility(8);
        }
    }

    public static Intent getCallingIntent(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) BandStressStatisticsActivity.class);
        intent.putExtra("statistics_date", date);
        return intent;
    }
}
