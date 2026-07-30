package com.crrepa.band.my.home.health;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.d;
import com.crrepa.band.my.databinding.FragmentBandTodayDataBinding;
import com.crrepa.band.my.device.scan.BandScanActivity;
import com.crrepa.band.my.health.base.BaseBandStatisticsActivity;
import com.crrepa.band.my.health.base.j;
import com.crrepa.band.my.health.bloodoxygen.BandBoStatisticsActivity;
import com.crrepa.band.my.health.bloodoxygen.BandTimingBloodOxygenActivity;
import com.crrepa.band.my.health.bloodpressure.BandBpStatisticsActivity;
import com.crrepa.band.my.health.bodytemperature.BandOnceTempStatisticsActivity;
import com.crrepa.band.my.health.bodytemperature.BandTimingTempStatisticsActivity;
import com.crrepa.band.my.health.ecg.BandEcgStatisticsActivity;
import com.crrepa.band.my.health.heartrate.Band24HourHeartRateStatisticsActivity;
import com.crrepa.band.my.health.heartrate.BandActivieHeartRateActivity;
import com.crrepa.band.my.health.heartrate.BandOnceHeartRateStatisticsActivity;
import com.crrepa.band.my.health.hrv.BandHrvStatisticsActivity;
import com.crrepa.band.my.health.physiologicalcycle.PhysiologicalCalendarActivity;
import com.crrepa.band.my.health.physiologicalcycle.PhysiologicalGuideActivity;
import com.crrepa.band.my.health.pressure.BandStressStatisticsActivity;
import com.crrepa.band.my.health.sleep.BandSleepStatisticsActivity;
import com.crrepa.band.my.health.steps.BandStepStatisticsActivity;
import com.crrepa.band.my.health.water.WaterStatisticsActivity;
import com.crrepa.band.my.health.weight.WeightStatisticsActivity;
import com.crrepa.band.my.home.health.adapter.BandDataAdapter;
import com.crrepa.band.my.model.BandDataTypeModel;
import com.crrepa.band.my.training.GpsTrainingActivity;
import com.crrepa.band.my.training.TrainingHistoryActivity;
import com.crrepa.band.my.training.gomoresport.exercisecapacity.ExerciseCapacityMainActivity;
import com.crrepa.band.my.training.gomoresport.traininganalysis.TrainingAnalysisMainActivity;
import com.crrepa.band.my.training.gomoresport.trainingrecovery.TrainingRecoveryMainActivity;
import com.moyoung.dafit.module.common.baseui.BaseFragement;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s0;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class BandTodayDataFragment extends BaseFragement implements a, SwipeRefreshLayout.OnRefreshListener, OnItemClickListener, OnItemChildClickListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private BandDataAdapter bandDataAdapter;
    private FragmentBandTodayDataBinding binding;
    private final p3.a presenter = new p3.a();

    public static BandTodayDataFragment getInstance() {
        return new BandTodayDataFragment();
    }

    private void initRecyclerView() {
        this.binding.rcvBandData.setLayoutManager(new LinearLayoutManager(getContext()));
        this.binding.rcvBandData.setHasFixedSize(true);
        BandDataAdapter bandDataAdapter = new BandDataAdapter(getContext(), null);
        this.bandDataAdapter = bandDataAdapter;
        bandDataAdapter.setOnItemClickListener(this);
        this.bandDataAdapter.setOnItemChildClickListener(this);
        this.binding.rcvBandData.setAdapter(this.bandDataAdapter);
    }

    private void initSwipeRefresh() {
        this.binding.refreshLayout.setColorSchemeResources(R.color.color_refresh);
        this.binding.refreshLayout.setOnRefreshListener(this);
        this.presenter.getSwipeRefreshState();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void startStatisticsActivity(Activity activity, int i8) {
        Intent callingIntent;
        if (i8 < 2) {
            return;
        }
        if (i8 == 2) {
            d.getInstance().queryPerformanceInsights();
            callingIntent = BandStepStatisticsActivity.getCallingIntent(activity, new Date());
        } else if (i8 == 3) {
            callingIntent = BandSleepStatisticsActivity.getCallingIntent(activity, new Date());
        } else if (i8 == 4) {
            callingIntent = BaseBandStatisticsActivity.getCallingIntent(activity, BandBpStatisticsActivity.class);
        } else if (i8 == 5) {
            callingIntent = BaseBandStatisticsActivity.getCallingIntent(activity, BandBoStatisticsActivity.class);
        } else if (i8 == 6) {
            callingIntent = BaseBandStatisticsActivity.getCallingIntent(activity, BandEcgStatisticsActivity.class);
        } else if (i8 == 25) {
            callingIntent = BandStressStatisticsActivity.getCallingIntent(activity, new Date());
        } else if (i8 != 32) {
            switch (i8) {
                case 16:
                    callingIntent = BaseBandStatisticsActivity.getCallingIntent(activity, BandActivieHeartRateActivity.class);
                    break;
                case 17:
                case 19:
                    callingIntent = Band24HourHeartRateStatisticsActivity.getCallingIntent(activity, new Date());
                    break;
                case 18:
                    callingIntent = BaseBandStatisticsActivity.getCallingIntent(activity, BandOnceHeartRateStatisticsActivity.class);
                    break;
                case 20:
                    callingIntent = BandTimingTempStatisticsActivity.getCallingIntent(activity, new Date());
                    break;
                case 21:
                    callingIntent = BaseBandStatisticsActivity.getCallingIntent(activity, BandOnceTempStatisticsActivity.class);
                    break;
                case 22:
                    callingIntent = BandTimingBloodOxygenActivity.getCallingIntent(activity, new Date());
                    break;
                case 23:
                    callingIntent = BaseBandStatisticsActivity.getCallingIntent(activity, BandHrvStatisticsActivity.class);
                    break;
                default:
                    switch (i8) {
                        case 34:
                            callingIntent = WeightStatisticsActivity.getCallingIntent(getContext(), new Date());
                            break;
                        case 35:
                            if (!w2.b.isGuideComplete()) {
                                callingIntent = PhysiologicalGuideActivity.getCallingIntent(getContext(), true);
                                break;
                            } else {
                                callingIntent = PhysiologicalCalendarActivity.getCallingIntent(getContext(), true);
                                break;
                            }
                        case 36:
                            startActivity(WaterStatisticsActivity.getCallingIntent(getContext(), false));
                            callingIntent = null;
                            break;
                        case 37:
                            if (this.presenter.isTrainingRecordSyncCompleted()) {
                                startActivity(TrainingHistoryActivity.getCallingIntent(getContext(), 4));
                                this.presenter.hideTrainingRecordSyncCard();
                            }
                            callingIntent = null;
                            break;
                        case 38:
                            d.getInstance().queryPerformanceInsights();
                            ExerciseCapacityMainActivity.start(requireContext(), new Date());
                            callingIntent = null;
                            break;
                        case 39:
                            d.getInstance().queryPerformanceInsights();
                            TrainingAnalysisMainActivity.start(requireContext(), new Date());
                            callingIntent = null;
                            break;
                        case 40:
                            d.getInstance().queryPerformanceInsights();
                            TrainingRecoveryMainActivity.start(requireContext(), new Date());
                            callingIntent = null;
                            break;
                        default:
                            callingIntent = null;
                            break;
                    }
            }
        } else {
            callingIntent = GpsTrainingActivity.getCallingIntent(getContext());
        }
        if (callingIntent != null) {
            activity.startActivity(callingIntent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        this.binding = FragmentBandTodayDataBinding.inflate(layoutInflater, viewGroup, false);
        this.presenter.setView(this);
        initRecyclerView();
        return this.binding.getRoot();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.destroy();
        this.binding = null;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        if (view.getId() == R.id.btn_add_band) {
            startActivity(BandScanActivity.getCallingIntent(requireContext(), false));
            s0.logEvent("点击首页添加设备");
        }
        if (view.getId() == R.id.tv_not_display) {
            this.presenter.hideTrainingRecordSyncCard();
            this.presenter.disableTrainingRecordSyncCard();
        }
        if (view.getId() == R.id.iv_hide) {
            this.presenter.hideTrainingRecordSyncCard();
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        startStatisticsActivity(getActivity(), ((BandDataTypeModel) baseQuickAdapter.getItem(i8)).getItemType());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        this.presenter.updateTodayDate();
        this.presenter.getTodayDataList();
        initSwipeRefresh();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.presenter.pause();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        this.presenter.refreshBandData();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.presenter.resume();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.presenter.saveInstanceState();
    }

    @Override // com.crrepa.band.my.home.health.a
    public void renderDataList(List<BandDataTypeModel> list) {
        this.bandDataAdapter.setNewData(list);
    }

    @Override // com.crrepa.band.my.home.health.a
    public void renderSwipeRefresh(boolean z7) {
        this.binding.refreshLayout.setEnabled(z7);
    }

    @Override // com.crrepa.band.my.home.health.a
    public void renderSwipeRefreshComplete() {
        this.binding.refreshLayout.setRefreshing(false);
    }

    @Override // com.crrepa.band.my.home.health.a
    public void renderTodayDate(Date date) {
        this.binding.tvTodayDate.setText(m.format(date, j.getSyncTimeFormat(requireContext())));
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z7) {
        super.setUserVisibleHint(z7);
        if (z7) {
            s0.logFragmentView(this);
        }
    }
}
