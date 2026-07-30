package com.crrepa.band.my.health.ecg.alg;

import android.text.TextUtils;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.orhanobut.logger.f;
import com.xinyan.algorithm.MrAlgorithm;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends com.crrepa.band.my.health.ecg.alg.a {
    private String ecgDiagnosisType;
    private int realTimeHR;
    private MrAlgorithm algorithm = new MrAlgorithm();
    private a callBack = new a(this);
    private List<Integer> measureHrList = new ArrayList();

    public static class a implements MrAlgorithm.CallBack {
        private WeakReference<d> weakReference;

        public a(d dVar) {
            this.weakReference = new WeakReference<>(dVar);
        }

        @Override // com.xinyan.algorithm.MrAlgorithm.CallBack
        public void onECGData(int[] iArr) {
            f.d("MrCallBack onECGData: " + Arrays.toString(iArr));
            d dVar = this.weakReference.get();
            if (dVar != null) {
                dVar.onEcgData(iArr);
            }
        }

        @Override // com.xinyan.algorithm.MrAlgorithm.CallBack
        public void onEvent(int i8, int i9, String str, boolean z7) {
            f.d("MrCallBack onEvent: " + i8);
            f.d("MrCallBack onEvent: " + i9);
            f.d("MrCallBack onEvent: " + str);
            f.d("MrCallBack onEvent: " + z7);
            d dVar = this.weakReference.get();
            if (dVar != null) {
                if (TextUtils.isEmpty(dVar.ecgDiagnosisType)) {
                    dVar.ecgDiagnosisType = str;
                    return;
                }
                dVar.ecgDiagnosisType += "/" + str;
            }
        }

        @Override // com.xinyan.algorithm.MrAlgorithm.CallBack
        public void onHR(int i8) {
            f.d("MrCallBack onHR: " + i8);
            d dVar = this.weakReference.get();
            if (dVar != null) {
                dVar.setRealTimeHR(i8);
            }
        }

        @Override // com.xinyan.algorithm.MrAlgorithm.CallBack
        public void onSummaryInfo(r5.a aVar) {
            f.d("MrCallBack onSummaryInfo: " + aVar);
        }
    }

    public d() {
        enableLog();
    }

    private void clearHrList() {
        this.measureHrList.clear();
        this.ecgDiagnosisType = null;
    }

    private void enableLog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onEcgData(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            arrayList.add(Integer.valueOf(i8));
        }
        this.filterList.addAll(arrayList);
    }

    private void onEcgFilterInfo() {
        c cVar = new c();
        int i8 = 0;
        if (this.measureHrList.size() > 0) {
            Iterator<Integer> it = this.measureHrList.iterator();
            while (it.hasNext()) {
                i8 += it.next().intValue();
            }
            i8 /= this.measureHrList.size();
        }
        cVar.setAverageHeartRate(i8);
        f.d("arrType: " + this.ecgDiagnosisType);
        cVar.setDiagnosisType(p2.a.getTiDiagnosisType(this.ecgDiagnosisType));
        cVar.setEcgList(this.inputList);
        onEcgResult(cVar);
        clearHrList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRealTimeHR(int i8) {
        if (i8 < 40 || 200 < i8) {
            return;
        }
        this.realTimeHR = i8;
        this.measureHrList.add(Integer.valueOf(i8));
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public void complete() {
        onEcgFilterInfo();
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public void filter(List<Integer> list) {
        this.inputList.addAll(list);
        int[] iArr = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            Integer num = list.get(i8);
            iArr[i8] = (num == null ? 0 : num.intValue()) * 5;
        }
        this.algorithm.pushWaveData(iArr);
        onEcgChange(list);
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public int getRealTimeHeartRate() {
        return this.realTimeHR;
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public int getSignalType() {
        return 0;
    }

    public String getToken() {
        return g.getInstance().getString(BaseParamNames.TI_ECG_ALGORITHM_TOKEN, "");
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public void init() {
        String token = getToken();
        f.d("token: " + token);
        if (TextUtils.isEmpty(token)) {
            f.d("create new token");
            token = this.algorithm.getToken("dfN07rms1KnCAl8MwbKCI8Q0", "g6xjMKHCMYBgpbwugGCBAXr9Bvf2PIQE");
            f.d("getToken: " + token);
        }
        if (!TextUtils.isEmpty(token)) {
            token = this.algorithm.init(token, this.callBack);
            f.d("newToken: " + token);
        }
        f.d("remainCount: " + this.algorithm.getRemainCount());
        saveToken(token);
        clearHrList();
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public boolean isValidData(int i8) {
        return i8 < 20000000;
    }

    public void saveToken(String str) {
        g.getInstance().putString(BaseParamNames.TI_ECG_ALGORITHM_TOKEN, str);
    }
}
