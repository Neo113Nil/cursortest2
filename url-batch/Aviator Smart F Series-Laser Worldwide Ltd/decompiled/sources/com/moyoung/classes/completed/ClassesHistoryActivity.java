package com.moyoung.classes.completed;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.google.android.material.tabs.TabLayout;
import com.moyoung.classes.R$color;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.R$string;
import com.moyoung.classes.coach.CoachCourseDoneActivity;
import com.moyoung.classes.completed.model.ClassesHistoryModel;
import com.moyoung.classes.completed.model.ClassesType;
import com.moyoung.classes.databinding.ActivityClassesHistoryBinding;
import com.moyoung.classes.db.ClassesHistory;
import com.moyoung.classes.meditation.onlineclass.OnlineClassDoneActivity;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.o0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ClassesHistoryActivity extends BaseVBActivity<ActivityClassesHistoryBinding> {
    ClassesHistoryAdapter historyAdapter;

    class a implements TabLayout.OnTabSelectedListener {
        a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ClassesHistoryActivity.this.updateHistory(tab.getPosition());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    private void initTabLayout() {
        ((ActivityClassesHistoryBinding) this.binding).tbRecords.setTabMode(1);
        int[] iArr = {R$string.classes_record_day, R$string.classes_record_week, R$string.classes_record_month, R$string.classes_record_year, R$string.classes_record_all};
        for (int i8 = 0; i8 < 5; i8++) {
            int i9 = iArr[i8];
            TabLayout.Tab newTab = ((ActivityClassesHistoryBinding) this.binding).tbRecords.newTab();
            newTab.setText(i9);
            ((ActivityClassesHistoryBinding) this.binding).tbRecords.addTab(newTab);
            o0.hideTabToast(newTab);
        }
        ((ActivityClassesHistoryBinding) this.binding).tbRecords.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        ClassesHistory classesHistory = (ClassesHistory) baseQuickAdapter.getData().get(i8);
        if (ClassesType.isCoachType(classesHistory)) {
            CoachCourseDoneActivity.startFromHistory(this, classesHistory);
        } else {
            OnlineClassDoneActivity.startFromHistory(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateHistory$2(List list) {
        this.historyAdapter.setNewData(list);
        renderTotalInfo(list);
    }

    private void renderTotalInfo(List<ClassesHistory> list) {
        Map<String, Integer> calculateTotalInfo = ClassesHistoryModel.calculateTotalInfo(list);
        ((ActivityClassesHistoryBinding) this.binding).tvTotalSpentTime.setText(String.valueOf(calculateTotalInfo.get("totalSpentTime")));
        ((ActivityClassesHistoryBinding) this.binding).tvTotalSpentKcal.setText(String.valueOf(calculateTotalInfo.get("totalSpentKcal")));
        ((ActivityClassesHistoryBinding) this.binding).tvTotalTimes.setText(String.valueOf(calculateTotalInfo.get("totalTimes")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    public void updateHistory(int i8) {
        Observable.just(ClassesHistoryModel.queryClassesHistoryList(i8)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.moyoung.classes.completed.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ClassesHistoryActivity.this.lambda$updateHistory$2((List) obj);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(this);
        k0.setColor(this, ContextCompat.getColor(this, R$color.class_assist_1), 0);
        initTabLayout();
        ((ActivityClassesHistoryBinding) this.binding).rvHistory.setLayoutManager(new LinearLayoutManager(this));
        ((ActivityClassesHistoryBinding) this.binding).rvHistory.setHasFixedSize(true);
        ClassesHistoryAdapter classesHistoryAdapter = new ClassesHistoryAdapter();
        this.historyAdapter = classesHistoryAdapter;
        ((ActivityClassesHistoryBinding) this.binding).rvHistory.setAdapter(classesHistoryAdapter);
        this.historyAdapter.setEmptyView(R$layout.view_empty_classes_history);
        this.historyAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.moyoung.classes.completed.b
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                ClassesHistoryActivity.this.lambda$initBinding$0(baseQuickAdapter, view, i8);
            }
        });
        ((ActivityClassesHistoryBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.completed.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClassesHistoryActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        updateHistory(0);
    }
}
