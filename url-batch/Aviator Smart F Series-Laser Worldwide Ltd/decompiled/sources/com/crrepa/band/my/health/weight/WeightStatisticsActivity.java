package com.crrepa.band.my.health.weight;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.databinding.ActivityWeightStatisticsBinding;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.weight.model.WeightChangeEvent;
import com.crrepa.band.my.health.weight.model.WeightConst;
import com.crrepa.band.my.health.widgets.chart.marker.MeasureDateMarkerView;
import com.crrepa.band.my.health.widgets.dialog.o0;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.github.mikephil.charting.components.MarkerView;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import m3.i;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class WeightStatisticsActivity extends BaseVBActivity<ActivityWeightStatisticsBinding> implements j3.c {
    private static final float[] WEIGHT_SEGMENT_VALUES = {10.0f, 18.5f, 24.0f, 28.0f, 40.0f};
    private static final float[] WEIGHT_SEGMENT_RATIO = {0.283f, 0.183f, 0.133f, 0.4f};
    private final i segmentBarProxy = new i();
    private final h3.c presenter = new h3.c();

    public static Intent getCallingIntent(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) WeightStatisticsActivity.class);
        intent.putExtra(WeightConst.WEIGHT_DATE, date);
        return intent;
    }

    private void initActionBar() {
        setSupportActionBar(((ActivityWeightStatisticsBinding) this.binding).includeAppToolbar.toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        ((ActivityWeightStatisticsBinding) this.binding).includeAppToolbar.toolbar.setNavigationIcon(R.drawable.selector_title_close_w);
        ((ActivityWeightStatisticsBinding) this.binding).includeAppToolbar.toolbar.setBackgroundResource(R.color.color_weight);
        ((ActivityWeightStatisticsBinding) this.binding).includeAppToolbar.tvToolbarTitle.setText(getString(R.string.weight));
    }

    private void initBmiData() {
        this.segmentBarProxy.createBarView(((ActivityWeightStatisticsBinding) this.binding).sbvWeightSliderBar, WEIGHT_SEGMENT_VALUES, this.segmentBarProxy.getWeightSegmentColors(this));
        ((ActivityWeightStatisticsBinding) this.binding).cavWeightStatistics.setTextColor(R.color.black);
        ((ActivityWeightStatisticsBinding) this.binding).cavWeightStatistics.setTextSize(10);
        ((ActivityWeightStatisticsBinding) this.binding).cavWeightStatistics.setTypeface(Typeface.DEFAULT_BOLD);
        ((ActivityWeightStatisticsBinding) this.binding).cavWeightStatistics.setTextAlignment(4);
        ((ActivityWeightStatisticsBinding) this.binding).cavWeightStatistics.setData(Arrays.asList(getResources().getStringArray(R.array.weight_bmi_array)), WEIGHT_SEGMENT_RATIO);
    }

    private void initChart() {
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.tvLast7TimesName.setText(R.string.last_7_times_weight_records);
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setVisibility(0);
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setup(7);
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineColor(R.color.color_weight);
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setXAxisLineWidth(2);
    }

    private void initData(Date date, boolean z7) {
        this.presenter.setCurrentDate(date);
        if (z7) {
            initView();
            initListener();
        }
        updateWeight();
    }

    private void initListener() {
        ((ActivityWeightStatisticsBinding) this.binding).btnWeightRecord.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.weight.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightStatisticsActivity.this.lambda$initListener$0(view);
            }
        });
    }

    private void initTabLayout() {
        ((ActivityWeightStatisticsBinding) this.binding).tlWeightTab.setTabMode(1);
        VB vb = this.binding;
        ((ActivityWeightStatisticsBinding) vb).tlWeightTab.setupWithViewPager(((ActivityWeightStatisticsBinding) vb).vpWeightContent);
    }

    private void initView() {
        initActionBar();
        initTabLayout();
        initBmiData();
        initChart();
        ((ActivityWeightStatisticsBinding) this.binding).btnWeightRecord.setText(R.string.btn_weight_record);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initListener$0(View view) {
        o0 defaultNum = new o0(this).setDefaultNum(UserWeightProvider.getLastSaveWeight());
        final h3.c cVar = this.presenter;
        Objects.requireNonNull(cVar);
        defaultNum.setOnSaveClickListener(new o0.a() { // from class: com.crrepa.band.my.health.weight.e
            @Override // com.crrepa.band.my.health.widgets.dialog.o0.a
            public final void onSave(float f8) {
                h3.c.this.insertWeight(f8);
            }
        }).show();
    }

    private void updateWeight() {
        this.presenter.getTabLayout();
        this.presenter.getWeightData();
        this.presenter.getChartData();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.color_weight));
        this.presenter.setView(this);
        initData((Date) getIntent().getSerializableExtra(WeightConst.WEIGHT_DATE), true);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, me.yokeyword.fragmentation.c
    public void onBackPressedSupport() {
        startActivity(MainActivity.getCallingIntent(this));
        finish();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.band_history_menu, menu);
        return true;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        initData((Date) intent.getSerializableExtra(WeightConst.WEIGHT_DATE), false);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            onBackPressedSupport();
        } else if (itemId == R.id.menu_band_data_history) {
            startActivity(new Intent(this, (Class<?>) WeightHistoryActivity.class));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "体重详情页");
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onWeightChangeEvent(WeightChangeEvent weightChangeEvent) {
        updateWeight();
        this.presenter.updateUserWeightInfo();
    }

    @Override // j3.c
    public void renderWeightChart(List<Float> list, float f8, float f9) {
        int color = ContextCompat.getColor(this, R.color.color_weight);
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setXAxisValueFormatter(new f5.d(list, 0));
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMaxValue(f8);
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMinValue(f9);
        MeasureDateMarkerView measureDateMarkerView = new MeasureDateMarkerView(this, this.presenter.getWeightDateArray(), j.getSyncTimeFormat(this));
        measureDateMarkerView.setBgColor(color);
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setMarkerView((MarkerView) measureDateMarkerView);
        com.orhanobut.logger.f.d("weight ==> barChart-XYData : " + list);
        ((ActivityWeightStatisticsBinding) this.binding).includeLast7TimesTrend.last7TimesTrendChart.setData(false, new int[]{color}, color, 0.4f, list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r6 > r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (r6 < r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        r5.segmentBarProxy.setSlider(((com.crrepa.band.my.databinding.ActivityWeightStatisticsBinding) r5.binding).sbvWeightSliderBar, r6);
     */
    @Override // j3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showBmiData(float f8) {
        float f9;
        com.orhanobut.logger.f.d("weight ==> current-bmi : " + f8);
        ((ActivityWeightStatisticsBinding) this.binding).tvWeightBmi.setText(f8 == 0.0f ? getString(R.string.data_blank) : n.formatWeight(f8, 1));
        if (f8 > 0.0f) {
            f9 = WEIGHT_SEGMENT_VALUES[0];
        }
        f9 = WEIGHT_SEGMENT_VALUES[4];
    }

    @Override // j3.c
    public void showTabLayout(List<Fragment> list) {
        TabLayout.Tab tabAt;
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(list);
        ((ActivityWeightStatisticsBinding) this.binding).vpWeightContent.setAdapter(contentPagerAdapter);
        ((ActivityWeightStatisticsBinding) this.binding).vpWeightContent.setOffscreenPageLimit(2);
        String[] stringArray = getResources().getStringArray(R.array.weight_tab_array);
        int tabCount = ((ActivityWeightStatisticsBinding) this.binding).tlWeightTab.getTabCount();
        for (int i8 = 0; i8 < stringArray.length; i8++) {
            if (i8 < tabCount && (tabAt = ((ActivityWeightStatisticsBinding) this.binding).tlWeightTab.getTabAt(i8)) != null) {
                tabAt.setCustomView(R.layout.item_statistics_tab);
                ((TextView) tabAt.getCustomView().findViewById(R.id.tv_tictistics_name)).setText(stringArray[i8]);
            }
        }
    }

    @Override // j3.c
    public void showWeightData(float f8, Date date) {
        com.orhanobut.logger.f.d("weight ==> current-weight : " + f8);
        ((ActivityWeightStatisticsBinding) this.binding).tvWeightNum.setText(f8 == 0.0f ? getString(R.string.data_blank) : n.formatWeight(f8, 1));
        ((ActivityWeightStatisticsBinding) this.binding).tvWeightUnit.setText(BandUnitSystemProvider.getUnitSystem() == 0 ? R.string.weight_kg : R.string.weight_lb);
        ((ActivityWeightStatisticsBinding) this.binding).tvWeightDate.setText(m.format(date, getString(R.string.statistics_date_and_time_format_24)));
    }
}
