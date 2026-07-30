package com.crrepa.band.my.health.sleep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentSleepDayStatisticsBinding;
import com.crrepa.band.my.health.widgets.HandleView;
import com.crrepa.band.my.health.widgets.h;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.m;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class SleepDayStatisticsFragment extends BaseFragement implements h {
    private static final int DELAY_DISPLAY_TIME = 3;
    private FragmentSleepDayStatisticsBinding binding;
    private Disposable displaySubscribe;
    private int lastSelectedSegmentId = -1;
    private com.crrepa.band.my.health.sleep.presenter.d presenter = new com.crrepa.band.my.health.sleep.presenter.d();
    private Date sameDayDate;
    private int totalSleepTime;

    class a implements HandleView.a {
        a() {
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onCompleted() {
            SleepDayStatisticsFragment.this.redisplayTotalSleep();
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onDragChange(int i8, int i9) {
            SleepDayStatisticsFragment.this.updateHandleViewPosition(i8, i9);
            SleepDayStatisticsFragment.this.showScrollHighlight(i8, i9);
        }

        @Override // com.crrepa.band.my.health.widgets.HandleView.a
        public void onStarted() {
            SleepDayStatisticsFragment.this.cancelRedisplayTotalSleep();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            SleepDayStatisticsFragment sleepDayStatisticsFragment = SleepDayStatisticsFragment.this;
            sleepDayStatisticsFragment.setStatisticsDate(sleepDayStatisticsFragment.sameDayDate);
            SleepDayStatisticsFragment sleepDayStatisticsFragment2 = SleepDayStatisticsFragment.this;
            sleepDayStatisticsFragment2.setSleepTime(sleepDayStatisticsFragment2.totalSleepTime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelRedisplayTotalSleep() {
        Disposable disposable = this.displaySubscribe;
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    private void initHandleView() {
        this.binding.sleepHandleView.setHandleLine(R$drawable.line_handle_sleep);
        this.binding.sleepHandleView.setHandleView(R$drawable.handle_sleep);
        this.binding.sleepHandleView.setOnHandleDrawChangeListener(new a());
    }

    public static SleepDayStatisticsFragment newInstance(Date date) {
        SleepDayStatisticsFragment sleepDayStatisticsFragment = new SleepDayStatisticsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("statistics_date", date);
        sleepDayStatisticsFragment.setArguments(bundle);
        return sleepDayStatisticsFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void redisplayTotalSleep() {
        this.displaySubscribe = Observable.timer(3L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    private void setDateText(String str) {
        this.binding.tvDate.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepTime(int i8) {
        FragmentSleepDayStatisticsBinding fragmentSleepDayStatisticsBinding = this.binding;
        e.bindTotalSleepTimeView(i8, fragmentSleepDayStatisticsBinding.tvSleepTimeHour, fragmentSleepDayStatisticsBinding.tvSleepTimeMinute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatisticsDate(Date date) {
        setDateText(m.format(date, getString(R.string.statistics_date_format)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showScrollHighlight(int i8, int i9) {
        int segmentIDByTouchPoint = this.binding.sleepSegmentedView.getSegmentIDByTouchPoint((i8 + i9) / 2, 1.0f);
        f.d("segment id: " + segmentIDByTouchPoint);
        com.crrepa.band.my.health.widgets.segmentedview.a segmentByID = this.binding.sleepSegmentedView.getSegmentByID(segmentIDByTouchPoint);
        if (segmentByID == null || segmentIDByTouchPoint == this.lastSelectedSegmentId) {
            return;
        }
        this.binding.sleepSegmentedView.highlightValue(segmentIDByTouchPoint);
        updateSleepDate(segmentByID);
        setSleepTime(segmentByID.getTime());
        this.lastSelectedSegmentId = segmentIDByTouchPoint;
    }

    private void statisticsDataCenter() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.binding.llStatisticsData.getLayoutParams();
        layoutParams.removeRule(14);
        layoutParams.addRule(13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateHandleViewPosition(int i8, int i9) {
        this.binding.sleepHandleView.updatePosition(i8, i9);
    }

    private void updateSleepDate(com.crrepa.band.my.health.widgets.segmentedview.a aVar) {
        setDateText(aVar.getStartTime() + "-" + aVar.getEndTime());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.binding = FragmentSleepDayStatisticsBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
        this.presenter.destroy();
        cancelRedisplayTotalSleep();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        initHandleView();
        this.presenter.getSleepDetail((Date) getArguments().getSerializable("statistics_date"));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // com.crrepa.band.my.health.widgets.h
    public void renderDate(Date date) {
        this.sameDayDate = date;
        setStatisticsDate(date);
    }

    @Override // com.crrepa.band.my.health.widgets.h
    public void renderEmptySleep() {
        statisticsDataCenter();
        this.binding.includeSleepStateDescription.llSleepStateDescription.setVisibility(4);
        this.binding.sleepSegmentedView.setVisibility(4);
        this.binding.sleepHandleView.setVisibility(4);
    }

    @Override // com.crrepa.band.my.health.widgets.h
    public void renderEndSleepTime(Date date) {
        this.binding.tvWakeUpTime.setText(e.getSleepStartEndTime(getContext(), date, getString(R.string.wake_up)));
    }

    @Override // com.crrepa.band.my.health.widgets.h
    public void renderSleepDetail(List<com.crrepa.band.my.health.widgets.segmentedview.a> list) {
        this.binding.sleepSegmentedView.setSegmentList(list);
    }

    @Override // com.crrepa.band.my.health.widgets.h
    public void renderSleepTime(int i8) {
        this.totalSleepTime = i8;
        setSleepTime(i8);
    }

    @Override // com.crrepa.band.my.health.widgets.h
    public void renderStartSleepTime(Date date) {
        this.binding.tvFallAsleepTime.setText(e.getSleepStartEndTime(getContext(), date, getString(R.string.fall_asleep)));
    }
}
