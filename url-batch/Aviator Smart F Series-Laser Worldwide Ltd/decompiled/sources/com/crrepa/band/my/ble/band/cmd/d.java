package com.crrepa.band.my.ble.band.cmd;

import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandTimingHeartRateProvider;
import com.crrepa.band.my.model.band.provider.BandTimingTempProvider;
import com.crrepa.ble.conn.CRPBleConnection;
import com.crrepa.ble.conn.type.CRPBloodOxygenTimeType;
import com.crrepa.ble.conn.type.CRPCategoryHistoryDay;
import com.crrepa.ble.conn.type.CRPEcgMeasureType;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import com.crrepa.ble.conn.type.CRPHistoryDynamicRateType;
import com.crrepa.ble.conn.type.CRPStressDate;
import com.crrepa.ble.conn.type.CRPTempTimeType;
import java.util.Date;

/* loaded from: classes2.dex */
public class d {
    private static final int ECG_NOT_WORN = 16;
    private static final long SYNC_PERIOD = 120000;
    private CRPBleConnection bleConnection;
    private Date lastRefreshDate;
    private long lastSyncHeartRateTime;
    private long lastSyncTempTime;

    class a implements j4 {
        a() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startMeasureBloodPressure();
        }
    }

    class a0 implements j4 {
        final /* synthetic */ int val$id;

        a0(int i8) {
            this.val$id = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryTraining(this.val$id);
        }
    }

    class b implements j4 {
        b() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.stopMeasureBloodPressure();
        }
    }

    class b0 implements j4 {
        b0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.querySupportNewHrv();
        }
    }

    class c implements j4 {
        c() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startMeasureBloodOxygen();
        }
    }

    class c0 implements j4 {
        c0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startMeasureNewHrv();
        }
    }

    /* renamed from: com.crrepa.band.my.ble.band.cmd.d$d, reason: collision with other inner class name */
    class C0151d implements j4 {
        C0151d() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.stopMeasureBloodOxygen();
        }
    }

    class d0 implements j4 {
        d0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.stopMeasureNewHrv();
        }
    }

    class e implements j4 {
        final /* synthetic */ CRPHistoryDay val$historyDay;

        e(CRPHistoryDay cRPHistoryDay) {
            this.val$historyDay = cRPHistoryDay;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryHistoryTimingHeartRate(this.val$historyDay);
        }
    }

    class e0 implements j4 {
        e0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryHistoryNewHrv();
        }
    }

    class f implements j4 {
        final /* synthetic */ int val$type;

        f(int i8) {
            this.val$type = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryTodayHeartRate(this.val$type);
        }
    }

    class f0 implements j4 {
        f0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.querySupportStress();
        }
    }

    class g implements j4 {
        g() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryMovementHeartRate();
        }
    }

    class g0 implements j4 {
        g0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.syncStep();
        }
    }

    class h implements j4 {
        final /* synthetic */ int val$interval;

        h(int i8) {
            this.val$interval = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            if (this.val$interval > 0) {
                d.this.bleConnection.enableTimingMeasureHeartRate(this.val$interval);
            } else {
                d.this.bleConnection.disableTimingMeasureHeartRate();
            }
        }
    }

    class h0 implements j4 {
        h0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startMeasureStress();
        }
    }

    class i implements j4 {
        i() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startECGMeasure();
        }
    }

    class i0 implements j4 {
        i0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.stopMeasureStress();
        }
    }

    class j implements j4 {
        j() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.stopECGMeasure();
        }
    }

    class j0 implements j4 {
        j0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryHistoryStress();
        }
    }

    class k implements j4 {
        k() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryTimingMeasureTemp(CRPTempTimeType.TODAY);
        }
    }

    class k0 implements j4 {
        final /* synthetic */ CRPStressDate val$date;

        k0(CRPStressDate cRPStressDate) {
            this.val$date = cRPStressDate;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryTimingStress(this.val$date);
        }
    }

    class l implements j4 {
        final /* synthetic */ int val$heartRate;

        l(int i8) {
            this.val$heartRate = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.sendECGHeartRate(this.val$heartRate);
        }
    }

    class l0 implements j4 {
        l0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryHistoryGps();
        }
    }

    class m implements j4 {
        m() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryLastMeasureECGData();
        }
    }

    class m0 implements j4 {
        final /* synthetic */ int val$time;

        m0(int i8) {
            this.val$time = i8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryGpsDetail(this.val$time);
        }
    }

    class n implements j4 {
        final /* synthetic */ CRPCategoryHistoryDay val$historyDay;

        n(CRPCategoryHistoryDay cRPCategoryHistoryDay) {
            this.val$historyDay = cRPCategoryHistoryDay;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryStepsCategory(this.val$historyDay);
        }
    }

    class n0 implements j4 {
        n0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.syncSleep();
        }
    }

    class o implements j4 {
        final /* synthetic */ byte val$type;

        o(byte b8) {
            this.val$type = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startMovement(this.val$type);
        }
    }

    class o0 implements j4 {
        o0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startMeasureDynamicRate();
        }
    }

    class p implements j4 {
        final /* synthetic */ byte val$state;

        p(byte b8) {
            this.val$state = b8;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startMovement(this.val$state);
        }
    }

    class p0 implements j4 {
        p0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.stopMeasureDynamicRtae();
        }
    }

    class q implements j4 {
        q() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.enableTimingMeasureTemp();
        }
    }

    class q0 implements j4 {
        final /* synthetic */ CRPHistoryDynamicRateType val$type;

        q0(CRPHistoryDynamicRateType cRPHistoryDynamicRateType) {
            this.val$type = cRPHistoryDynamicRateType;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryLastDynamicRate(this.val$type);
        }
    }

    class r implements j4 {
        r() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.disableTimingMeasureTemp();
        }
    }

    class r0 implements j4 {
        r0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startMeasureOnceHeartRate();
        }
    }

    class s implements j4 {
        s() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.startMeasureTemp();
        }
    }

    class s0 implements j4 {
        s0() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.stopMeasureOnceHeartRate();
        }
    }

    class t implements j4 {
        t() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.stopMeasureTemp();
        }
    }

    private static class t0 {
        private static d INSTANCE = new d(null);

        private t0() {
        }
    }

    class u implements j4 {
        final /* synthetic */ CRPBloodOxygenTimeType val$type;

        u(CRPBloodOxygenTimeType cRPBloodOxygenTimeType) {
            this.val$type = cRPBloodOxygenTimeType;
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryTimingBloodOxygen(this.val$type);
        }
    }

    class v implements j4 {
        v() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryTimingMeasureTemp(CRPTempTimeType.YESTERDAY);
        }
    }

    class w implements j4 {
        w() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryHistoryHeartRate();
        }
    }

    class x implements j4 {
        x() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryHistoryBloodPressure();
        }
    }

    class y implements j4 {
        y() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryHistoryBloodOxygen();
        }
    }

    class z implements j4 {
        z() {
        }

        @Override // com.crrepa.band.my.ble.band.cmd.j4
        public void call() {
            d.this.bleConnection.queryHistoryTraining();
        }
    }

    /* synthetic */ d(k kVar) {
        this();
    }

    private boolean disableTempTimingMeasure() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new r());
    }

    private boolean enableTempTimingMeasure() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new q());
    }

    public static d getInstance() {
        return t0.INSTANCE;
    }

    private boolean isNewEcgMeasurementVersion() {
        return this.bleConnection.isNewECGMeasurementVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryHistoryNapSleep$0(CRPHistoryDay cRPHistoryDay) {
        this.bleConnection.queryHistoryNapSleep(cRPHistoryDay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$queryPerformanceInsights$1() {
        this.bleConnection.queryPerformanceInsights();
    }

    private boolean queryHistoryBloodOxygen() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new y());
    }

    private boolean queryHistoryBloodPressure() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new x());
    }

    private boolean queryHistoryOnceHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new w());
    }

    private void syncHeartRate() {
        syncTodayHeartRate();
        if (com.moyoung.dafit.module.common.utils.m.isSameDay(new Date(), this.lastRefreshDate)) {
            return;
        }
        queryHistoryTimingHeartRate(CRPHistoryDay.YESTERDAY);
    }

    private void syncStepsCategory(boolean z7) {
        queryStepsCategory(CRPCategoryHistoryDay.TODAY);
        if (z7 || !com.moyoung.dafit.module.common.utils.m.isSameDay(new Date(), this.lastRefreshDate)) {
            queryStepsCategory(CRPCategoryHistoryDay.YESTERDAY);
        }
    }

    private void syncTimingBloodOxygen() {
        syncTodayBloodOxyge();
        if (com.moyoung.dafit.module.common.utils.m.isSameDay(new Date(), this.lastRefreshDate)) {
            return;
        }
        syncYesterdayBloodOxyge();
    }

    public void init() {
        if (this.bleConnection == null) {
            return;
        }
        syncTodaySteps();
        syncTodaySleep();
        CRPHistoryDay cRPHistoryDay = CRPHistoryDay.YESTERDAY;
        queryHistorySteps(cRPHistoryDay);
        queryHistorySleep(cRPHistoryDay);
        queryHistoryNapSleep(CRPHistoryDay.TODAY);
        syncLastDynamicHeartRate(CRPHistoryDynamicRateType.FIRST_HEART_RATE);
        syncTodayHeartRate();
        queryLastECGData();
        syncStepsCategory(true);
        queryHistoryOnceHeartRate();
        queryHistoryBloodPressure();
        queryHistoryBloodOxygen();
        queryHistoryTraining();
        queryPerformanceInsights();
        querySupportHrv();
        querySupportStress();
        queryHistoryGps();
        i4.getInstance().sendWorldClockList();
    }

    public boolean queryGpsDetail(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new m0(i8));
    }

    public boolean queryHistoryGps() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new l0());
    }

    public boolean queryHistoryHrv() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new e0());
    }

    public void queryHistoryNapSleep(final CRPHistoryDay cRPHistoryDay) {
        com.orhanobut.logger.f.d("queryHistoryNapSleep: " + cRPHistoryDay);
        if (cRPHistoryDay != null) {
            com.crrepa.band.my.ble.band.cmd.a.execute(new j4() { // from class: com.crrepa.band.my.ble.band.cmd.b
                @Override // com.crrepa.band.my.ble.band.cmd.j4
                public final void call() {
                    d.this.lambda$queryHistoryNapSleep$0(cRPHistoryDay);
                }
            });
        }
    }

    public void queryHistorySleep(CRPHistoryDay cRPHistoryDay) {
        if (cRPHistoryDay != null) {
            this.bleConnection.queryHistorySleep(cRPHistoryDay);
        }
    }

    public void queryHistorySteps(CRPHistoryDay cRPHistoryDay) {
        if (cRPHistoryDay != null) {
            this.bleConnection.queryHistoryStep(cRPHistoryDay);
        }
    }

    public boolean queryHistoryStress() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new j0());
    }

    public boolean queryHistoryTimingHeartRate(CRPHistoryDay cRPHistoryDay) {
        if (cRPHistoryDay == null || !BandTimingHeartRateProvider.getTimingHeartRateState()) {
            return false;
        }
        com.orhanobut.logger.f.d("queryHistoryTimingHeartRate: " + cRPHistoryDay);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new e(cRPHistoryDay));
    }

    public boolean queryHistoryTraining() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new z());
    }

    public boolean queryLastECGData() {
        if (isNewEcgMeasurementVersion()) {
            return com.crrepa.band.my.ble.band.cmd.a.execute(new m());
        }
        return false;
    }

    public boolean queryPerformanceInsights() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new j4() { // from class: com.crrepa.band.my.ble.band.cmd.c
            @Override // com.crrepa.band.my.ble.band.cmd.j4
            public final void call() {
                d.this.lambda$queryPerformanceInsights$1();
            }
        });
    }

    public boolean queryStepsCategory(CRPCategoryHistoryDay cRPCategoryHistoryDay) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new n(cRPCategoryHistoryDay));
    }

    public boolean querySupportHrv() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new b0());
    }

    public boolean querySupportStress() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new f0());
    }

    public boolean queryTimingStress(CRPStressDate cRPStressDate) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new k0(cRPStressDate));
    }

    public boolean queryTodayHeartRate(int i8) {
        com.orhanobut.logger.f.d("queryTodayHourHeartRate: " + i8);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new f(i8));
    }

    public boolean queryTraining(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new a0(i8));
    }

    public void refreshBandData() {
        if (this.bleConnection == null) {
            return;
        }
        syncTodaySteps();
        syncTodaySleep();
        queryHistoryNapSleep(CRPHistoryDay.TODAY);
        syncTodayTemp();
        syncStepsCategory(false);
        syncHeartRate();
        syncTimingBloodOxygen();
        queryTimingStress(CRPStressDate.TODAY);
        queryPerformanceInsights();
        this.lastRefreshDate = new Date();
    }

    public boolean sendEcgHeartRate(int i8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new l(i8));
    }

    public boolean sendNotWearBand() {
        return sendEcgHeartRate(16);
    }

    public boolean sendTempTimingMeasureState(boolean z7) {
        return z7 ? enableTempTimingMeasure() : disableTempTimingMeasure();
    }

    public boolean sendTimingHeartRateInterval(int i8) {
        com.orhanobut.logger.f.d("sendTimingHeartRateInterval: " + i8);
        return com.crrepa.band.my.ble.band.cmd.a.execute(new h(i8));
    }

    public void setBleConnection(CRPBleConnection cRPBleConnection) {
        this.bleConnection = cRPBleConnection;
        if (cRPBleConnection != null) {
            cRPBleConnection.setStepChangeListener(new com.crrepa.band.my.ble.band.cmd.listener.m());
            this.bleConnection.setSleepChangeListener(new com.crrepa.band.my.health.sleep.a());
            this.bleConnection.setHeartRateChangeListener(new com.crrepa.band.my.ble.band.cmd.listener.i());
            this.bleConnection.setBloodPressureChangeListener(new com.crrepa.band.my.health.bloodpressure.a());
            this.bleConnection.setBloodOxygenChangeListener(new com.crrepa.band.my.ble.band.cmd.listener.d());
            this.bleConnection.setStepsCategoryListener(new com.crrepa.band.my.health.steps.a());
            this.bleConnection.setMovementStateListener(new com.crrepa.band.my.ble.band.cmd.listener.j());
            setEcgChangeListener();
            this.bleConnection.setTempChangeListener(new com.crrepa.band.my.health.bodytemperature.a());
            this.bleConnection.setTrainingListener(new com.crrepa.band.my.ble.band.cmd.listener.n());
            this.bleConnection.setNewHrvListener(new com.crrepa.band.my.health.hrv.a());
            this.bleConnection.setStressListener(new com.crrepa.band.my.health.pressure.a());
            this.bleConnection.setGpsChangeListener(new com.crrepa.band.my.training.c());
        }
        this.lastSyncHeartRateTime = 0L;
        this.lastSyncTempTime = 0L;
    }

    public void setEcgChangeListener() {
        if (com.crrepa.band.my.ble.band.utils.a.getInstance().hasECG()) {
            com.crrepa.band.my.ble.band.cmd.listener.h hVar = new com.crrepa.band.my.ble.band.cmd.listener.h();
            CRPEcgMeasureType ecgType = com.crrepa.band.my.ble.band.utils.a.getInstance().getEcgType();
            com.orhanobut.logger.f.d("setEcgChangeListener: " + ecgType);
            if (ecgType != null) {
                this.bleConnection.setECGChangeListener(hVar, ecgType);
            }
        }
    }

    public boolean setTrainingState(byte b8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new p(b8));
    }

    public boolean startEcgMeasure() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new i());
    }

    public boolean startMeasureBloodOxygen() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new c());
    }

    public boolean startMeasureBloodPressure() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new a());
    }

    public boolean startMeasureHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new o0());
    }

    public boolean startMeasureHrv() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new c0());
    }

    public boolean startMeasureOnceHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new r0());
    }

    public boolean startMeasureStress() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new h0());
    }

    public boolean startMeasureTemp() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new s());
    }

    public boolean startTraining(byte b8) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new o(b8));
    }

    public boolean stopEcgMeasure() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new j());
    }

    public boolean stopMeasureBloodOxygen() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new C0151d());
    }

    public boolean stopMeasureBloodPressure() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new b());
    }

    public boolean stopMeasureHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new p0());
    }

    public boolean stopMeasureHrv() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new d0());
    }

    public boolean stopMeasureOnceHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new s0());
    }

    public boolean stopMeasureStress() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new i0());
    }

    public boolean stopMeasureTemp() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new t());
    }

    public void syncLastDynamicHeartRate(CRPHistoryDynamicRateType cRPHistoryDynamicRateType) {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null) {
            return;
        }
        if (connectBand.hasMovementHeartRate() || connectBand.hasDynamicHeartRate()) {
            com.crrepa.band.my.ble.band.cmd.a.execute(new q0(cRPHistoryDynamicRateType));
        }
    }

    public boolean syncMovementHeartRate() {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new g());
    }

    public boolean syncTodayBloodOxyge() {
        return syncTimingBloodOxygen(CRPBloodOxygenTimeType.TODAY);
    }

    public boolean syncTodayHeartRate() {
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.lastSyncHeartRateTime) < SYNC_PERIOD) {
            return false;
        }
        queryTodayHeartRate(1);
        boolean queryTodayHeartRate = queryTodayHeartRate(2);
        if (queryTodayHeartRate) {
            this.lastSyncHeartRateTime = currentTimeMillis;
        }
        return queryTodayHeartRate;
    }

    public void syncTodaySleep() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new n0());
    }

    public void syncTodaySteps() {
        com.crrepa.band.my.ble.band.cmd.a.execute(new g0());
    }

    public void syncTodayTemp() {
        if (!BandTimingTempProvider.getTimingTempState()) {
            com.orhanobut.logger.f.d("disable temp timing measure");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - this.lastSyncTempTime) < SYNC_PERIOD) {
            return;
        }
        this.lastSyncTempTime = currentTimeMillis;
        com.orhanobut.logger.f.d("syncTodayTemp");
        com.crrepa.band.my.ble.band.cmd.a.execute(new k());
    }

    public boolean syncYesterdayBloodOxyge() {
        return syncTimingBloodOxygen(CRPBloodOxygenTimeType.YESTERDAY);
    }

    public void syncYesterdayTemp() {
        com.orhanobut.logger.f.d("syncYesterdayTemp");
        com.crrepa.band.my.ble.band.cmd.a.execute(new v());
    }

    private d() {
        this.lastSyncHeartRateTime = 0L;
        this.lastSyncTempTime = 0L;
        this.lastRefreshDate = new Date();
    }

    private boolean syncTimingBloodOxygen(CRPBloodOxygenTimeType cRPBloodOxygenTimeType) {
        return com.crrepa.band.my.ble.band.cmd.a.execute(new u(cRPBloodOxygenTimeType));
    }
}
