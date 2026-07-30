package com.crrepa.band.my.health.ecg;

import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.ecg.alg.a;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class d implements com.moyoung.dafit.module.common.baseui.f {
    private static final int MEASURE_DATA_LENGTH = 20;
    private static final int MIN_DISPLAY_TIME = 1000;
    private static final int NOT_HEART_RATE_DATA = 32;
    private e bandEcgMeasureView;
    private com.crrepa.band.my.health.ecg.alg.a ecgAlgorithm = com.crrepa.band.my.health.ecg.alg.b.create();
    private com.crrepa.band.my.health.ecg.diagnosis.a ecgDiagnosisHelper = new com.crrepa.band.my.health.ecg.diagnosis.a();
    private boolean startMeasureEcg = false;
    private boolean prepareMeasure = false;
    private ArrayList<Integer> ecgMeasureData = new ArrayList<>();
    private boolean wearBand = false;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            d.this.showPressElectrodeView();
        }
    }

    class b implements Consumer {
        b() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Long l8) {
            d.this.showEcgMeasureView();
        }
    }

    class c implements Consumer {
        c() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(String str) {
            d.this.bandEcgMeasureView.renderHeartRate(str);
        }
    }

    /* renamed from: com.crrepa.band.my.health.ecg.d$d, reason: collision with other inner class name */
    private static class C0200d implements a.InterfaceC0199a {
        private WeakReference<d> weakReference;

        public C0200d(d dVar) {
            this.weakReference = new WeakReference<>(dVar);
        }

        @Override // com.crrepa.band.my.health.ecg.alg.a.InterfaceC0199a
        public void onEcgChange(List<Integer> list) {
            com.orhanobut.logger.f.d("onEcgChange: " + list.toString());
            d dVar = this.weakReference.get();
            if (dVar != null) {
                dVar.showEcgChange(list);
            }
        }

        @Override // com.crrepa.band.my.health.ecg.alg.a.InterfaceC0199a
        public void onEcgResult(com.crrepa.band.my.health.ecg.alg.c cVar) {
        }
    }

    public d() {
        org.greenrobot.eventbus.c.getDefault().register(this);
        this.ecgAlgorithm.setEcgChangeListener(new C0200d(this));
    }

    private void addEcgMeasureData(int[] iArr) {
        for (int i8 : iArr) {
            if (checkBandWear(i8)) {
                this.ecgMeasureData.add(Integer.valueOf(i8));
            }
        }
        if (20 <= this.ecgMeasureData.size()) {
            filterEcgMeasureData(this.ecgMeasureData);
            reset();
        }
    }

    private boolean checkBandWear(int i8) {
        boolean isValidData = this.ecgAlgorithm.isValidData(i8);
        com.orhanobut.logger.f.d("checkBandWear: " + isValidData);
        if (isValidData == this.wearBand) {
            return isValidData;
        }
        this.wearBand = isValidData;
        if (isValidData) {
            showPrepareMeasureView();
        } else {
            notWearBand();
        }
        return isValidData;
    }

    private void ecgDiagnosis(List<Integer> list, long j8) {
        int[] iArr = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr[i8] = list.get(i8).intValue();
        }
        this.ecgDiagnosisHelper.ecgDiagnosis(iArr, j8);
    }

    private void ecgMeasureComplete() {
        com.orhanobut.logger.f.d("ecgMeasureComplete");
        showEcgAnalysisView();
        stopEcgMeasure();
    }

    private void filterEcgMeasureData(ArrayList<Integer> arrayList) {
        this.ecgAlgorithm.filter(new ArrayList(arrayList));
    }

    private void notWearBand() {
        showPressElectrodeView();
        com.crrepa.band.my.ble.band.cmd.d.getInstance().sendNotWearBand();
    }

    private void reset() {
        this.ecgMeasureData.clear();
    }

    private void sendEcgHeartRtae(int i8) {
        com.orhanobut.logger.f.d("real time heart rate: " + i8);
        if (i8 > 0) {
            com.crrepa.band.my.ble.band.cmd.d.getInstance().sendEcgHeartRate(i8);
        }
    }

    private void showConnectBandView() {
        this.bandEcgMeasureView.renderConnectBandView();
        this.prepareMeasure = false;
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            Observable.timer(1000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
        }
    }

    private void showEcgAnalysisView() {
        this.bandEcgMeasureView.renderEcgAnalysisView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEcgChange(List<Integer> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.bandEcgMeasureView.renderEcgMeasureData(list);
        int realTimeHeartRate = this.ecgAlgorithm.getRealTimeHeartRate();
        com.orhanobut.logger.f.d("heartRate: " + realTimeHeartRate);
        sendEcgHeartRtae(realTimeHeartRate);
        showRealTimeHeartRate(String.valueOf(realTimeHeartRate));
        com.orhanobut.logger.f.d("signalType: " + this.ecgAlgorithm.getSignalType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showEcgMeasureView() {
        com.orhanobut.logger.f.d("showEcgMeasureView");
        e eVar = this.bandEcgMeasureView;
        if (eVar != null && this.prepareMeasure) {
            eVar.renderEcgMeasureView();
            sendEcgHeartRtae(32);
        }
    }

    private void showMeasureFail() {
        this.bandEcgMeasureView.renderMeasureFail();
    }

    private void showPrepareMeasureView() {
        com.orhanobut.logger.f.d("showPrepareMeasureView");
        this.prepareMeasure = true;
        this.bandEcgMeasureView.renderPrepareMeasureView();
        Observable.timer(1000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPressElectrodeView() {
        e eVar = this.bandEcgMeasureView;
        if (eVar == null) {
            return;
        }
        eVar.renderPressElectrodeView();
        this.prepareMeasure = false;
        startEcgMeasure();
    }

    private void showRealTimeHeartRate(String str) {
        if (this.bandEcgMeasureView == null) {
            return;
        }
        Observable.just(str).observeOn(AndroidSchedulers.mainThread()).subscribe(new c());
    }

    private void startEcgMeasure() {
        if (this.startMeasureEcg) {
            return;
        }
        this.startMeasureEcg = true;
        com.orhanobut.logger.f.d("startEcgMeasure");
        com.crrepa.band.my.ble.band.cmd.d.getInstance().startEcgMeasure();
    }

    private void stopEcgMeasure() {
        com.orhanobut.logger.f.d("stopEcgMeasure");
        this.startMeasureEcg = false;
        com.crrepa.band.my.ble.band.cmd.d.getInstance().stopEcgMeasure();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.bandEcgMeasureView = null;
        stopEcgMeasure();
        this.ecgAlgorithm.writeLog();
        this.ecgAlgorithm.release();
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        int state = aVar.getState();
        if (state == 0) {
            showConnectBandView();
        } else {
            if (state != 2) {
                return;
            }
            showPressElectrodeView();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandEcgMeasureChangeEvent(com.crrepa.band.my.health.ecg.b bVar) {
        int type = bVar.getType();
        if (type == 1) {
            addEcgMeasureData(bVar.getEcgData());
        } else if (type == 2) {
            ecgMeasureComplete();
        } else {
            if (type != 3) {
                return;
            }
            showMeasureFail();
        }
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onEcgMeasureCompleteEvent(com.crrepa.band.my.health.ecg.c cVar) {
        if (this.bandEcgMeasureView != null) {
            long id = cVar.getId();
            if (id == -1) {
                showMeasureFail();
            }
            this.bandEcgMeasureView.renderEcgStatisticsView(id);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(e eVar) {
        this.bandEcgMeasureView = eVar;
    }

    public void startMeasureEcg(Context context) {
        showRealTimeHeartRate(context.getString(R.string.data_blank));
        startEcgMeasure();
        showConnectBandView();
    }
}
