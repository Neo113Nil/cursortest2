package com.crrepa.band.my.ble.band.cmd.listener;

import android.text.TextUtils;
import com.crrepa.band.my.health.ecg.alg.a;
import com.crrepa.band.my.model.db.Ecg;
import com.crrepa.band.my.model.db.proxy.EcgDaoProxy;
import com.crrepa.ble.conn.listener.CRPBleECGChangeListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class h implements CRPBleECGChangeListener {
    private static final int CALCULATE_SIZE = 300;
    private static final int MIN_ECG_DATA_SIZE = 3000;
    private a ecgChangeListener;
    private Date measureDate;
    private ArrayList<Integer> ecgList = new ArrayList<>();
    private com.crrepa.band.my.health.ecg.alg.a ecgAlgorithm = com.crrepa.band.my.health.ecg.alg.b.create();

    private static class a implements a.InterfaceC0199a {
        private WeakReference<h> weakReference;

        public a(h hVar) {
            this.weakReference = new WeakReference<>(hVar);
        }

        @Override // com.crrepa.band.my.health.ecg.alg.a.InterfaceC0199a
        public void onEcgChange(List<Integer> list) {
        }

        @Override // com.crrepa.band.my.health.ecg.alg.a.InterfaceC0199a
        public void onEcgResult(com.crrepa.band.my.health.ecg.alg.c cVar) {
            h hVar = this.weakReference.get();
            if (hVar != null) {
                hVar.saveECGData(cVar);
            }
        }
    }

    public h() {
        a aVar = new a(this);
        this.ecgChangeListener = aVar;
        this.ecgAlgorithm.setEcgChangeListener(aVar);
    }

    private void addECG(ArrayList<Integer> arrayList) {
        int size = arrayList.size();
        int i8 = size / 300;
        int i9 = 0;
        while (i9 < i8) {
            int i10 = i9 * 300;
            i9++;
            filterECG(arrayList, i10, i9 * 300);
        }
        int i11 = i8 * 300;
        if (i11 < size) {
            filterECG(arrayList, i11, size);
        }
    }

    private void addEcgList(int[] iArr) {
        for (int i8 : iArr) {
            if (this.ecgAlgorithm.isValidData(i8)) {
                this.ecgList.add(Integer.valueOf(i8));
            }
        }
    }

    private void calculateECG(Date date) {
        com.orhanobut.logger.f.d("onTransCpmplete: " + this.ecgList.size());
        if (!isCalculateECG()) {
            onFail();
            return;
        }
        this.measureDate = date;
        try {
            try {
                this.ecgAlgorithm.init();
                addECG(this.ecgList);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        } finally {
            this.ecgAlgorithm.complete();
        }
    }

    private void filterECG(ArrayList<Integer> arrayList, int i8, int i9) {
        this.ecgAlgorithm.filter(new ArrayList(arrayList.subList(i8, i9)));
    }

    private boolean isCalculateECG() {
        return !this.ecgList.isEmpty() && this.ecgList.size() >= 3000;
    }

    private void release() {
        this.ecgList.clear();
        this.measureDate = null;
        this.ecgAlgorithm.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveECGData(com.crrepa.band.my.health.ecg.alg.c cVar) {
        long j8;
        String write = new n2.b().write(cVar.getEcgList());
        com.orhanobut.logger.f.d("path: " + write);
        if (TextUtils.isEmpty(write)) {
            j8 = -1;
        } else {
            com.orhanobut.logger.f.d("date: " + this.measureDate);
            Ecg heartRateEntity2ECG = p2.a.heartRateEntity2ECG(cVar, write, this.ecgAlgorithm instanceof com.crrepa.band.my.health.ecg.alg.e);
            Date date = this.measureDate;
            if (date != null) {
                heartRateEntity2ECG.setDate(date);
            }
            j8 = EcgDaoProxy.getInstance().insert(heartRateEntity2ECG);
        }
        com.orhanobut.logger.f.d("ecg id: " + j8);
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.health.ecg.c(j8));
        release();
    }

    private void sendEcgMeasureComplete() {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.health.ecg.b(2));
    }

    private void sendEcgMeasureData(int[] iArr) {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.health.ecg.b(1, iArr));
    }

    private void sendEcgMeasureFail() {
        org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.health.ecg.b(3));
    }

    @Override // com.crrepa.ble.conn.listener.CRPBleECGChangeListener
    public void onCancel() {
        com.orhanobut.logger.f.d("BandEcgChangeListener onCancel");
        sendEcgMeasureFail();
        release();
    }

    @Override // com.crrepa.ble.conn.listener.CRPBleECGChangeListener
    public void onECGChange(int[] iArr) {
        com.orhanobut.logger.f.d("BandEcgChangeListener onEcgChange: " + Arrays.toString(iArr));
        sendEcgMeasureData(iArr);
        addEcgList(iArr);
    }

    @Override // com.crrepa.ble.conn.listener.CRPBleECGChangeListener
    public void onFail() {
        com.orhanobut.logger.f.d("BandEcgChangeListener onCancel");
        sendEcgMeasureFail();
        release();
    }

    @Override // com.crrepa.ble.conn.listener.CRPBleECGChangeListener
    public void onMeasureComplete() {
        com.orhanobut.logger.f.d("BandEcgChangeListener onMeasureComplete");
        sendEcgMeasureComplete();
        calculateECG(new Date());
    }

    @Override // com.crrepa.ble.conn.listener.CRPBleECGChangeListener
    public void onTransCpmplete(Date date) {
        if (date != null) {
            com.orhanobut.logger.f.d("onTransCpmplete: " + date.toString());
            calculateECG(date);
        }
    }
}
