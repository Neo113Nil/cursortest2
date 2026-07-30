package com.crrepa.band.my.training;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityTrainingPathHistoryBinding;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.band.my.model.net.TrainingRecordsEntity;
import com.crrepa.band.my.training.adapter.TrainingHistoryAdapter;
import com.crrepa.band.my.training.map.BaseTrainingPathActivity;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.o0;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.List;

/* loaded from: classes3.dex */
public class TrainingHistoryActivity extends BaseVBActivity<ActivityTrainingPathHistoryBinding> implements OnItemClickListener, x3.b {
    public static final long DEFAULT_PATH_ID = -1;
    public static final String PATH_ID = "path_id";
    public static final String TAB_POSITION = "tab_position";
    protected com.crrepa.band.my.training.presenter.i trainingHistoryPresenter = new com.crrepa.band.my.training.presenter.i();
    TrainingHistoryAdapter trainingHistoryAdapter = new TrainingHistoryAdapter();

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            TrainingHistoryActivity.this.updateTrainingHistory(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, (Class<?>) TrainingHistoryActivity.class);
    }

    private void initTabLayout() {
        ((ActivityTrainingPathHistoryBinding) this.binding).tlTrainingRecordsTab.setTabMode(1);
        int[] iArr = {R.string.training_record_day, R.string.training_record_week, R.string.training_record_month, R.string.training_record_year, R.string.training_record_all};
        for (int i8 = 0; i8 < 5; i8++) {
            int i9 = iArr[i8];
            TabLayout.Tab newTab = ((ActivityTrainingPathHistoryBinding) this.binding).tlTrainingRecordsTab.newTab();
            newTab.setText(i9);
            ((ActivityTrainingPathHistoryBinding) this.binding).tlTrainingRecordsTab.addTab(newTab);
            o0.hideTabToast(newTab);
        }
        ((ActivityTrainingPathHistoryBinding) this.binding).tlTrainingRecordsTab.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    public static boolean isGpsTraining(Integer num) {
        return num.intValue() >= GpsTrainingModel.GpsTrainingType.INDOOR_WALKING.getValue() && num.intValue() <= GpsTrainingModel.GpsTrainingType.ON_FOOT.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrainingHistory(int i8) {
        this.trainingHistoryPresenter.updateTrainingHistory(this, i8);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColor(this, ContextCompat.getColor(this, R.color.color_gps_training), 0);
        initTabLayout();
        ((ActivityTrainingPathHistoryBinding) this.binding).rcvTrainingHistory.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityTrainingPathHistoryBinding) this.binding).rcvTrainingHistory.setHasFixedSize(true);
        ((ActivityTrainingPathHistoryBinding) this.binding).rcvTrainingHistory.setAdapter(this.trainingHistoryAdapter);
        this.trainingHistoryAdapter.setEmptyView(R.layout.view_empty_run_path);
        this.trainingHistoryAdapter.setOnItemClickListener(this);
        this.trainingHistoryPresenter.setView(this);
        int intExtra = getIntent().getIntExtra(TAB_POSITION, 0);
        TabLayout.Tab tabAt = ((ActivityTrainingPathHistoryBinding) this.binding).tlTrainingRecordsTab.getTabAt(intExtra);
        if (tabAt != null) {
            ((ActivityTrainingPathHistoryBinding) this.binding).tlTrainingRecordsTab.selectTab(tabAt);
            updateTrainingHistory(intExtra);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityTrainingPathHistoryBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.training.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingHistoryActivity.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        GpsTraining gpsTraining;
        TrainingRecordsEntity trainingRecordsEntity = (TrainingRecordsEntity) baseQuickAdapter.getData().get(i8);
        Integer trainingType = trainingRecordsEntity.getTrainingType();
        if ((!isGpsTraining(trainingType) && trainingType.intValue() != 131) || (gpsTraining = new GpsTrainingDaoProxy().get(trainingRecordsEntity.getStartDate())) == null) {
            startActivity(BandTrainingStatisticsActivity.getStatisticsCallingIntent(this, trainingRecordsEntity.getStartDate().getTime(), trainingType.intValue()));
            return;
        }
        Integer type = trainingRecordsEntity.getType();
        if (type == null) {
            type = Integer.valueOf(com.crrepa.band.my.training.utils.h.getMapType(this).getValue());
        }
        startActivity(BaseTrainingPathActivity.getCallingIntent(this, gpsTraining.getId().longValue(), type.intValue(), true));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        s0.logPage(getClass(), "历史锻炼记录");
    }

    @Override // x3.b
    public void renderMaxTimePerDay(boolean z7, String str) {
        ((ActivityTrainingPathHistoryBinding) this.binding).rlMaxTimePerDay.setVisibility(z7 ? 0 : 8);
        ((ActivityTrainingPathHistoryBinding) this.binding).tvMaxTimePerDay.setText(str);
    }

    @Override // x3.b
    public void renderTotalCalories(String str) {
        ((ActivityTrainingPathHistoryBinding) this.binding).tvTotalCalories.setText(str);
    }

    @Override // x3.b
    public void renderTotalTimes(String str) {
        ((ActivityTrainingPathHistoryBinding) this.binding).tvTotalTimes.setText(str);
    }

    @Override // x3.b
    public void renderTotalTrainingTime(String str) {
        ((ActivityTrainingPathHistoryBinding) this.binding).tvTotalExerciseTime.setText(str);
    }

    @Override // x3.b
    public void renderTrainingList(List<TrainingRecordsEntity> list) {
        this.trainingHistoryAdapter.setNewData(list);
    }

    public static Intent getCallingIntent(Context context, int i8) {
        Intent intent = new Intent(context, (Class<?>) TrainingHistoryActivity.class);
        intent.putExtra(TAB_POSITION, i8);
        return intent;
    }
}
