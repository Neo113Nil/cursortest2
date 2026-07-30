package com.crrepa.band.my.training.gomoresport.traininganalysis;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityTrainingAnalysisStatisticsBinding;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import com.crrepa.band.my.training.gomoresport.GomoreSportCalendarActivity;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.widgets.ContentPagerAdapter;
import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class TrainingAnalysisStatisticsActivity extends BaseVBActivity<ActivityTrainingAnalysisStatisticsBinding> {
    private String monthAvgValue;
    private List<PerformanceInsights> monthDataList;
    private String monthMaxValue;
    private Date selectDate;
    private String weekAvgValue;
    private List<PerformanceInsights> weekDataList;
    private String weekMaxValue;
    private String yearAvgValue;
    private List<PerformanceInsights> yearDataList;
    private String yearMaxValue;
    private final CompositeDisposable disposableList = new CompositeDisposable();
    private final List<Fragment> fragmentList = new ArrayList();
    private int selectedTabIndex = 0;

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            TrainingAnalysisStatisticsActivity.this.selectedTabIndex = tab.getPosition();
            TrainingAnalysisStatisticsActivity.this.renderDataByType();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    private void initTabListener() {
        ((ActivityTrainingAnalysisStatisticsBinding) this.binding).tlTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        GomoreSportCalendarActivity.start(this, this.selectDate, 1, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$2() {
        List<PerformanceInsights> thisWeek = PerformanceInsightsDaoProxy.getInstance().getThisWeek(this.selectDate);
        this.weekDataList = thisWeek;
        this.weekMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxTrainingLoad(thisWeek);
        this.weekAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgTrainingLoad(this.weekDataList);
        List<PerformanceInsights> thisMonth = PerformanceInsightsDaoProxy.getInstance().getThisMonth(this.selectDate);
        this.monthDataList = thisMonth;
        this.monthMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxTrainingLoad(thisMonth);
        this.monthAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgTrainingLoad(this.monthDataList);
        List<PerformanceInsights> thisYear = PerformanceInsightsDaoProxy.getInstance().getThisYear(this.selectDate);
        this.yearDataList = thisYear;
        this.yearMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxTrainingLoad(thisYear);
        this.yearAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgTrainingLoad(this.yearDataList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$3() {
        renderDataByType();
        renderChartDataByType(this.weekDataList, 0);
        renderChartDataByType(this.monthDataList, 1);
        renderChartDataByType(this.yearDataList, 2);
        initTabListener();
    }

    private void renderChartDataByType(final List<PerformanceInsights> list, int i8) {
        final TrainingAnalysisStatisticsFragment trainingAnalysisStatisticsFragment = (TrainingAnalysisStatisticsFragment) this.fragmentList.get(i8);
        ((ActivityTrainingAnalysisStatisticsBinding) this.binding).tvTitle.postDelayed(new Runnable() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.i
            @Override // java.lang.Runnable
            public final void run() {
                TrainingAnalysisStatisticsFragment.this.renderChartData(list);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderDataByType() {
        String str;
        String str2;
        int i8 = this.selectedTabIndex;
        if (i8 == 0) {
            str = this.weekMaxValue;
            str2 = this.weekAvgValue;
        } else if (i8 == 1) {
            str = this.monthMaxValue;
            str2 = this.monthAvgValue;
        } else {
            str = this.yearMaxValue;
            str2 = this.yearAvgValue;
        }
        if ("0".equals(str)) {
            str = HttpClient.ENDFLAG;
        }
        if ("0".equals(str2)) {
            str2 = HttpClient.ENDFLAG;
        }
        ((ActivityTrainingAnalysisStatisticsBinding) this.binding).tvMaxValue.setText(str);
        ((ActivityTrainingAnalysisStatisticsBinding) this.binding).tvAvgValue.setText(str2);
    }

    private void showTabLayout(Date date) {
        TabLayout.Tab tabAt;
        ((ActivityTrainingAnalysisStatisticsBinding) this.binding).tlTab.setTabMode(1);
        VB vb = this.binding;
        ((ActivityTrainingAnalysisStatisticsBinding) vb).tlTab.setupWithViewPager(((ActivityTrainingAnalysisStatisticsBinding) vb).vpContent);
        this.fragmentList.clear();
        this.fragmentList.add(TrainingAnalysisStatisticsFragment.newInstance(1, 3, date));
        this.fragmentList.add(TrainingAnalysisStatisticsFragment.newInstance(2, 3, date));
        this.fragmentList.add(TrainingAnalysisStatisticsFragment.newInstance(3, 3, date));
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(this.fragmentList);
        ((ActivityTrainingAnalysisStatisticsBinding) this.binding).vpContent.setAdapter(contentPagerAdapter);
        ((ActivityTrainingAnalysisStatisticsBinding) this.binding).vpContent.setOffscreenPageLimit(2);
        String[] stringArray = getResources().getStringArray(R.array.weight_tab_array);
        int tabCount = ((ActivityTrainingAnalysisStatisticsBinding) this.binding).tlTab.getTabCount();
        for (int i8 = 0; i8 < stringArray.length; i8++) {
            if (i8 < tabCount && (tabAt = ((ActivityTrainingAnalysisStatisticsBinding) this.binding).tlTab.getTabAt(i8)) != null) {
                tabAt.setCustomView(R.layout.item_statistics_tab);
                ((TextView) tabAt.getCustomView().findViewById(R.id.tv_tictistics_name)).setText(stringArray[i8]);
            }
        }
    }

    public static void start(Context context, Date date) {
        Intent intent = new Intent(context, (Class<?>) TrainingAnalysisStatisticsActivity.class);
        intent.putExtra("selected_date", date);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.analysis_bg_2_nav));
        ((ActivityTrainingAnalysisStatisticsBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingAnalysisStatisticsActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityTrainingAnalysisStatisticsBinding) this.binding).ivCalendar.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingAnalysisStatisticsActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        Date date = (Date) getIntent().getSerializableExtra("selected_date");
        this.selectDate = date;
        showTabLayout(date);
        this.disposableList.add(Completable.fromRunnable(new Runnable() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.j
            @Override // java.lang.Runnable
            public final void run() {
                TrainingAnalysisStatisticsActivity.this.lambda$loadData$2();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: com.crrepa.band.my.training.gomoresport.traininganalysis.k
            @Override // io.reactivex.functions.Action
            public final void run() {
                TrainingAnalysisStatisticsActivity.this.lambda$loadData$3();
            }
        }));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.disposableList.clear();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        loadData();
    }
}
