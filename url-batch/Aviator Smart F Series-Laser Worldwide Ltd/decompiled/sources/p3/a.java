package p3;

import android.text.TextUtils;
import com.crrepa.band.my.device.ota.model.BandFirmwareVersionEvent;
import com.crrepa.band.my.device.setting.other.model.PhysiologicalReminderStateEvent;
import com.crrepa.band.my.health.bloodoxygen.model.BandTimingBloodOxygenStateChangeEvent;
import com.crrepa.band.my.health.bodytemperature.model.BandTimingTempStateChangeEvent;
import com.crrepa.band.my.health.heartrate.model.BandTimingHeartRateStateChangeEvent;
import com.crrepa.band.my.health.hrv.model.BandHrvSupportStateEvent;
import com.crrepa.band.my.health.pressure.model.BandStressSupportStateEvent;
import com.crrepa.band.my.health.water.model.BandWaterSupportEvent;
import com.crrepa.band.my.health.weight.model.WeightChangeEvent;
import com.crrepa.band.my.home.health.model.DailyQuotesStateChangeEvent;
import com.crrepa.band.my.home.health.model.SystemDateChangeEvent;
import com.crrepa.band.my.model.BandDataTypeModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandHrvProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.BandPhysiologcalPeriodProvider;
import com.crrepa.band.my.model.band.provider.BandStressProvider;
import com.crrepa.band.my.model.band.provider.BandTimingBloodOxygenProvider;
import com.crrepa.band.my.model.band.provider.BandTimingHeartRateProvider;
import com.crrepa.band.my.model.band.provider.BandTimingTempProvider;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.training.gomoresport.g;
import com.crrepa.band.my.training.model.BandMovementHeartRateChangeEvent;
import com.crrepa.band.my.training.model.TrainingRecordSyncEvent;
import com.crrepa.band.my.training.utils.o;
import com.moyoung.dafit.module.common.baseui.f;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import l0.d;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;
import v2.b;

/* loaded from: classes2.dex */
public class a implements f {
    private com.crrepa.band.my.home.health.a view;
    private boolean saveInstance = false;
    private boolean addMeasureType = false;
    private boolean showTrainingRecordSyncCard = false;
    private boolean trainingRecordSyncCompleted = false;
    private long startSyncRecordCount = 0;
    private final MovementHeartRateDaoProxy daoProxy = new MovementHeartRateDaoProxy();

    public a() {
        c.getDefault().register(this);
    }

    private void addDataList(List<BandDataTypeModel> list, List<BandDataTypeModel> list2) {
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        list.addAll(list2);
    }

    private List<BandDataTypeModel> getMeasureList() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null || this.view == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasTimingHeartRate()) {
            if (BandTimingHeartRateProvider.getTimingHeartRateState()) {
                arrayList.add(new BandDataTypeModel(19));
            }
        } else if (connectBand.has24HoursHeartRate()) {
            arrayList.add(new BandDataTypeModel(17));
        }
        if (connectBand.hasOnceHeartRate()) {
            arrayList.add(new BandDataTypeModel(18));
        }
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasTemp()) {
            if (BandTimingTempProvider.getTimingTempState()) {
                arrayList.add(new BandDataTypeModel(20));
            }
            arrayList.add(new BandDataTypeModel(21));
        }
        if (connectBand.hasBloodPressure()) {
            arrayList.add(new BandDataTypeModel(4));
        }
        if (hasTimingBloodOxygen()) {
            arrayList.add(new BandDataTypeModel(22));
        }
        if (connectBand.hasBloodOxygen()) {
            arrayList.add(new BandDataTypeModel(5));
        }
        if (connectBand.hasEcg()) {
            arrayList.add(new BandDataTypeModel(6));
        }
        if (BandHrvProvider.hasHrv()) {
            arrayList.add(new BandDataTypeModel(23));
        }
        if (BandStressProvider.hasStress()) {
            arrayList.add(new BandDataTypeModel(25));
        }
        if (hasPhysiologcalPeriod()) {
            arrayList.add(new BandDataTypeModel(35));
        }
        return arrayList;
    }

    private boolean hasPhysiologcalPeriod() {
        return BandPhysiologcalPeriodProvider.isSupportPhysiologcalPeriod() && BandPhysiologcalPeriodProvider.showPhysiologcalPeriod();
    }

    private boolean hasTimingBloodOxygen() {
        return BandTimingBloodOxygenProvider.supportTimingBloodOxygen() && BandTimingBloodOxygenProvider.isDayTimingBloodOxygen();
    }

    private void showSwipeRefresh(boolean z7) {
        com.crrepa.band.my.home.health.a aVar = this.view;
        if (aVar != null) {
            aVar.renderSwipeRefresh(z7);
        }
    }

    private void showTodayDataList(List<BandDataTypeModel> list) {
        com.crrepa.band.my.home.health.a aVar = this.view;
        if (aVar != null) {
            aVar.renderDataList(list);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
        c.getDefault().unregister(this);
    }

    public void disableTrainingRecordSyncCard() {
        o.setEnabled(false);
    }

    public void getSwipeRefreshState() {
        showSwipeRefresh(com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected());
    }

    public void getTodayDataList() {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(BandInfoManager.getAddress())) {
            arrayList.add(new BandDataTypeModel(1));
        }
        if (this.showTrainingRecordSyncCard) {
            arrayList.add(new BandDataTypeModel(37));
        }
        arrayList.add(new BandDataTypeModel(2));
        arrayList.add(new BandDataTypeModel(3));
        addDataList(arrayList, getMeasureList());
        arrayList.add(new BandDataTypeModel(34));
        arrayList.add(new BandDataTypeModel(36));
        if (com.crrepa.band.my.training.gomoresport.f.isSupportGomoreSport()) {
            arrayList.add(new BandDataTypeModel(38));
            arrayList.add(new BandDataTypeModel(39));
            arrayList.add(new BandDataTypeModel(40));
        }
        showTodayDataList(arrayList);
    }

    public void hideTrainingRecordSyncCard() {
        this.showTrainingRecordSyncCard = false;
        getTodayDataList();
    }

    public boolean isTrainingRecordSyncCompleted() {
        return this.trainingRecordSyncCompleted;
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandBoundStateChangeEvent(d dVar) {
        getTodayDataList();
        if (this.trainingRecordSyncCompleted) {
            return;
        }
        this.showTrainingRecordSyncCard = false;
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        int state = aVar.getState();
        showSwipeRefresh(state == 2);
        if (state == 0) {
            if (!this.trainingRecordSyncCompleted) {
                this.showTrainingRecordSyncCard = false;
            }
            getTodayDataList();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandFirmwareVersion(BandFirmwareVersionEvent bandFirmwareVersionEvent) {
        if (this.saveInstance) {
            this.addMeasureType = true;
        } else {
            getTodayDataList();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandHeartRateTimingMeasureStateChangeEvent(BandTimingHeartRateStateChangeEvent bandTimingHeartRateStateChangeEvent) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandHrvStateEvent(BandHrvSupportStateEvent bandHrvSupportStateEvent) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandMovementHeartRateChangeEvent(BandMovementHeartRateChangeEvent bandMovementHeartRateChangeEvent) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandPhysiologicalStateEvent(b bVar) {
        if (bVar.isSupport()) {
            getTodayDataList();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandStressStateEvent(BandStressSupportStateEvent bandStressSupportStateEvent) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandTempTimingMeasureStateChangeEvent(BandTimingTempStateChangeEvent bandTimingTempStateChangeEvent) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandTimingBloodOxygenChangeEvent(BandTimingBloodOxygenStateChangeEvent bandTimingBloodOxygenStateChangeEvent) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandWaterSupportEvent(BandWaterSupportEvent bandWaterSupportEvent) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onDailyQuotesStateChangeEvent(DailyQuotesStateChangeEvent dailyQuotesStateChangeEvent) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(g gVar) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onPhysiologicalReminderStateEvent(PhysiologicalReminderStateEvent physiologicalReminderStateEvent) {
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onSystemDateChangeEvent(SystemDateChangeEvent systemDateChangeEvent) {
        updateTodayDate();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onTrainingRecordSyncEvent(TrainingRecordSyncEvent trainingRecordSyncEvent) {
        com.crrepa.band.my.ble.band.cmd.d.getInstance().queryPerformanceInsights();
        if (trainingRecordSyncEvent.getSyncStatus() == TrainingRecordSyncEvent.SyncStatus.START) {
            if (o.isEnabled()) {
                this.showTrainingRecordSyncCard = true;
                this.trainingRecordSyncCompleted = false;
                this.startSyncRecordCount = this.daoProxy.getTotalCount();
            }
        } else if (trainingRecordSyncEvent.getSyncStatus() == TrainingRecordSyncEvent.SyncStatus.COMPLETED) {
            this.trainingRecordSyncCompleted = true;
            if (this.startSyncRecordCount == this.daoProxy.getTotalCount()) {
                this.showTrainingRecordSyncCard = false;
            }
        } else if (trainingRecordSyncEvent.getSyncStatus() == TrainingRecordSyncEvent.SyncStatus.HIDE) {
            this.showTrainingRecordSyncCard = false;
        }
        getTodayDataList();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onWeightChangeEvent(WeightChangeEvent weightChangeEvent) {
        getTodayDataList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void refreshBandData() {
        com.crrepa.band.my.ble.band.cmd.d.getInstance().refreshBandData();
        this.view.renderSwipeRefreshComplete();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        this.saveInstance = false;
        if (this.addMeasureType) {
            this.addMeasureType = false;
            getTodayDataList();
        }
    }

    public void saveInstanceState() {
        this.saveInstance = true;
    }

    public void setView(com.crrepa.band.my.home.health.a aVar) {
        this.view = aVar;
    }

    public void updateTodayDate() {
        this.view.renderTodayDate(new Date());
    }
}
