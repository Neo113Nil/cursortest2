package com.crrepa.band.my.model;

import com.crrepa.band.my.model.band.provider.BandDoNotDisturbTimePrevider;

/* loaded from: classes2.dex */
public class DoNotDistrubPeriodModel extends BandPeriodTimeModel {
    public DoNotDistrubPeriodModel() {
        this.startHour = BandDoNotDisturbTimePrevider.getDoNotDistrubStartHour();
        this.startMinute = BandDoNotDisturbTimePrevider.getDoNotDistrubStartMinute();
        this.endHour = BandDoNotDisturbTimePrevider.getDoNotDistrubEndHour();
        this.endMinute = BandDoNotDisturbTimePrevider.getDoNotDistrubEndMinute();
    }

    @Override // com.crrepa.band.my.model.BandPeriodTimeModel
    public void savePeriodTime() {
        BandDoNotDisturbTimePrevider.saveDoNotDistrubStartHour(this.startHour);
        BandDoNotDisturbTimePrevider.saveDoNotDistrubStartMinute(this.startMinute);
        BandDoNotDisturbTimePrevider.saveDoNotDistrubEndHour(this.endHour);
        BandDoNotDisturbTimePrevider.saveDoNotDistrubEndMinute(this.endMinute);
    }
}
