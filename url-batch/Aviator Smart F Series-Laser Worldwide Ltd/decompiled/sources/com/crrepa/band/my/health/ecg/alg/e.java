package com.crrepa.band.my.health.ecg.alg;

import com.orhanobut.logger.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class e extends a {
    private static final int MAX_SIGNAL_VALUE = 40000;
    private example.a algLib = new example.a();
    private int totalCalculateDataCount = 0;

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public void complete() {
        onEcgResult(getHeartRateInfo());
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public void filter(List<Integer> list) {
        f.d("filter: " + list.size());
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.inputList.addAll(list);
        try {
            this.totalCalculateDataCount = this.algLib.GetFilterData(this.inputList, arrayList, 40000.0d);
            int GetNextSendGroup = this.algLib.GetNextSendGroup();
            f.d("totalCalculateDataSize: " + this.totalCalculateDataCount);
            f.d("nextSendGroup: " + GetNextSendGroup);
            onEcgChange(arrayList);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public c getHeartRateInfo() {
        f.d("total input list: " + this.inputList.size());
        this.algLib.AlgCalculate_HRV(this.inputList, this.filterList, this.totalCalculateDataCount, 40000.0d);
        int GetHrmValue = this.algLib.GetHrmValue();
        f.d("hrm: " + GetHrmValue);
        int GetTiredValue = this.algLib.GetTiredValue();
        int GetSpiritValue = this.algLib.GetSpiritValue();
        int GetPmValue = this.algLib.GetPmValue();
        int GetCardiacTestValue = this.algLib.GetCardiacTestValue();
        int GetHrEarlyValue = this.algLib.GetHrEarlyValue();
        int GetHrStopValue = this.algLib.GetHrStopValue();
        int GetHrMissValue = this.algLib.GetHrMissValue();
        boolean z7 = this.algLib.GetHrSlowValue() == 1;
        boolean z8 = this.algLib.GetHrFastalue() == 1;
        boolean z9 = this.algLib.GetArrhythmiaValue() == 1;
        c cVar = new c();
        cVar.setAverageHeartRate(GetHrmValue);
        cVar.setFatigue(GetTiredValue);
        cVar.setHeartLoad(GetPmValue);
        cVar.setMentalStress(GetSpiritValue);
        cVar.setHeartRateStrength(GetCardiacTestValue);
        cVar.setPrematureBeat(GetHrEarlyValue);
        cVar.setHeartRateStop(GetHrStopValue);
        cVar.setLeakage(GetHrMissValue);
        cVar.setHeartRateSlow(z7);
        cVar.setHeartRateFast(z8);
        cVar.setHeartRateMisaligned(z9);
        cVar.setEcgList(this.filterList);
        return cVar;
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public int getRealTimeHeartRate() {
        return this.algLib.GetHrsRealtimeValue();
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public int getSignalType() {
        return this.algLib.GetErrorSignal();
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public void init() {
        this.algLib.AlgInit();
    }

    @Override // com.crrepa.band.my.health.ecg.alg.a
    public boolean isValidData(int i8) {
        return i8 < 20000000 && i8 != 0;
    }
}
