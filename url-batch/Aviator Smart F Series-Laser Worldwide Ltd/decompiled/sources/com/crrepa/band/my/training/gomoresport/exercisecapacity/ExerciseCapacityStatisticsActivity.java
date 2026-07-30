package com.crrepa.band.my.training.gomoresport.exercisecapacity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityExerciseCapacityStatisticsBinding;
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
public class ExerciseCapacityStatisticsActivity extends BaseVBActivity<ActivityExerciseCapacityStatisticsBinding> {
    private int dataType;
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
            ExerciseCapacityStatisticsActivity.this.selectedTabIndex = tab.getPosition();
            ExerciseCapacityStatisticsActivity.this.renderDataByType();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    private void initTabListener() {
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tlTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        GomoreSportCalendarActivity.start(this, this.selectDate, 0, this.dataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadData$2() {
        List<PerformanceInsights> thisWeek = PerformanceInsightsDaoProxy.getInstance().getThisWeek(this.selectDate);
        this.weekDataList = thisWeek;
        int i8 = this.dataType;
        if (i8 == 0) {
            this.weekMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxVo2Max(thisWeek);
            this.weekAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgVo2Max(this.weekDataList);
        } else if (i8 == 1) {
            this.weekMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxHr(thisWeek);
            this.weekAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgHr(this.weekDataList);
        } else {
            this.weekMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxPace(thisWeek);
            this.weekAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgPace(this.weekDataList);
        }
        List<PerformanceInsights> thisMonth = PerformanceInsightsDaoProxy.getInstance().getThisMonth(this.selectDate);
        this.monthDataList = thisMonth;
        int i9 = this.dataType;
        if (i9 == 0) {
            this.monthMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxVo2Max(thisMonth);
            this.monthAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgVo2Max(this.monthDataList);
        } else if (i9 == 1) {
            this.monthMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxHr(thisMonth);
            this.monthAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgHr(this.monthDataList);
        } else {
            this.monthMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxPace(thisMonth);
            this.monthAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgPace(this.monthDataList);
        }
        List<PerformanceInsights> thisYear = PerformanceInsightsDaoProxy.getInstance().getThisYear(this.selectDate);
        this.yearDataList = thisYear;
        int i10 = this.dataType;
        if (i10 == 0) {
            this.yearMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxVo2Max(thisYear);
            this.yearAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgVo2Max(this.yearDataList);
        } else if (i10 == 1) {
            this.yearMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxHr(thisYear);
            this.yearAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgHr(this.yearDataList);
        } else {
            this.yearMaxValue = com.crrepa.band.my.training.gomoresport.e.getMaxPace(thisYear);
            this.yearAvgValue = com.crrepa.band.my.training.gomoresport.e.getAvgPace(this.yearDataList);
        }
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
        final ExerciseCapacityStatisticsFragment exerciseCapacityStatisticsFragment = (ExerciseCapacityStatisticsFragment) this.fragmentList.get(i8);
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvTitle.postDelayed(new Runnable() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.k
            @Override // java.lang.Runnable
            public final void run() {
                ExerciseCapacityStatisticsFragment.this.renderChartData(list);
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
        if ("0.0".equals(str) || "0".equals(str)) {
            str = HttpClient.ENDFLAG;
        }
        if ("0.0".equals(str2) || "0".equals(str2)) {
            str2 = HttpClient.ENDFLAG;
        }
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvMaxValue.setText(str);
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvAvgValue.setText(str2);
    }

    private void renderDescByType() {
        int i8 = this.dataType;
        if (i8 == 0) {
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvTitle.setText(R.string.vo2max);
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvMaxValueUnit.setText(com.crrepa.band.my.training.gomoresport.e.getVo2MaxUnit());
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvAvgValueUnit.setText(com.crrepa.band.my.training.gomoresport.e.getVo2MaxUnit());
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvAbout.setText(R.string.vo2max_about);
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvDescTitle.setText(R.string.vo2max_understand);
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvDesc.setText(R.string.vo2max_desc);
            return;
        }
        if (i8 != 1) {
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvTitle.setText(R.string.lactate_threshold_pace_title);
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvAbout.setText(R.string.lactate_threshold_pace_about);
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvDescTitle.setText(R.string.lactate_threshold_pace_understand);
            ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvDesc.setText(R.string.lactate_threshold_pace_content);
            return;
        }
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvTitle.setText(R.string.lactate_threshold_hr_title);
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvMaxValueUnit.setText(com.crrepa.band.my.training.gomoresport.e.getHrUnit());
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvAvgValueUnit.setText(com.crrepa.band.my.training.gomoresport.e.getHrUnit());
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvAbout.setText(R.string.lactate_threshold_hr_about);
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvDescTitle.setText(R.string.lactate_threshold_hr_understand);
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tvDesc.setText(R.string.lactate_threshold_hr_content);
    }

    private void showTabLayout(Date date) {
        TabLayout.Tab tabAt;
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).tlTab.setTabMode(1);
        VB vb = this.binding;
        ((ActivityExerciseCapacityStatisticsBinding) vb).tlTab.setupWithViewPager(((ActivityExerciseCapacityStatisticsBinding) vb).vpContent);
        this.fragmentList.clear();
        this.fragmentList.add(ExerciseCapacityStatisticsFragment.newInstance(1, this.dataType, date));
        this.fragmentList.add(ExerciseCapacityStatisticsFragment.newInstance(2, this.dataType, date));
        this.fragmentList.add(ExerciseCapacityStatisticsFragment.newInstance(3, this.dataType, date));
        ContentPagerAdapter contentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());
        contentPagerAdapter.setContentFragments(this.fragmentList);
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).vpContent.setAdapter(contentPagerAdapter);
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).vpContent.setOffscreenPageLimit(2);
        String[] stringArray = getResources().getStringArray(R.array.weight_tab_array);
        int tabCount = ((ActivityExerciseCapacityStatisticsBinding) this.binding).tlTab.getTabCount();
        for (int i8 = 0; i8 < stringArray.length; i8++) {
            if (i8 < tabCount && (tabAt = ((ActivityExerciseCapacityStatisticsBinding) this.binding).tlTab.getTabAt(i8)) != null) {
                tabAt.setCustomView(R.layout.item_statistics_tab);
                ((TextView) tabAt.getCustomView().findViewById(R.id.tv_tictistics_name)).setText(stringArray[i8]);
            }
        }
    }

    public static void start(Context context, Date date, int i8) {
        Intent intent = new Intent(context, (Class<?>) ExerciseCapacityStatisticsActivity.class);
        intent.putExtra("selected_date", date);
        intent.putExtra("data_type", i8);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.physicalt_bg_2_nav));
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseCapacityStatisticsActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityExerciseCapacityStatisticsBinding) this.binding).ivCalendar.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExerciseCapacityStatisticsActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        this.dataType = getIntent().getIntExtra("data_type", 0);
        renderDescByType();
        Date date = (Date) getIntent().getSerializableExtra("selected_date");
        this.selectDate = date;
        showTabLayout(date);
        this.disposableList.add(Completable.fromRunnable(new Runnable() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.i
            @Override // java.lang.Runnable
            public final void run() {
                ExerciseCapacityStatisticsActivity.this.lambda$loadData$2();
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Action() { // from class: com.crrepa.band.my.training.gomoresport.exercisecapacity.j
            @Override // io.reactivex.functions.Action
            public final void run() {
                ExerciseCapacityStatisticsActivity.this.lambda$loadData$3();
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
