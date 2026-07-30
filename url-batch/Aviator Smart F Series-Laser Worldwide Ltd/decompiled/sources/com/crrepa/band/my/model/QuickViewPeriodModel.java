package com.crrepa.band.my.model;

import com.crrepa.band.my.model.band.provider.BandQuickViewTimeProvider;

/* loaded from: classes2.dex */
public class QuickViewPeriodModel extends BandPeriodTimeModel {
    public QuickViewPeriodModel() {
        this.startHour = BandQuickViewTimeProvider.getQuickViewStartHour();
        this.startMinute = BandQuickViewTimeProvider.getQuickViewStartMinute();
        this.endHour = BandQuickViewTimeProvider.getQuickViewEndHour();
        this.endMinute = BandQuickViewTimeProvider.getQuickViewEndMinute();
    }

    @Override // com.crrepa.band.my.model.BandPeriodTimeModel
    public void savePeriodTime() {
        BandQuickViewTimeProvider.saveQuickViewStartHour(this.startHour);
        BandQuickViewTimeProvider.saveQuickViewStartMinute(this.startMinute);
        BandQuickViewTimeProvider.saveQuickViewEndHour(this.endHour);
        BandQuickViewTimeProvider.saveQuickViewEndMinute(this.endMinute);
    }
}
