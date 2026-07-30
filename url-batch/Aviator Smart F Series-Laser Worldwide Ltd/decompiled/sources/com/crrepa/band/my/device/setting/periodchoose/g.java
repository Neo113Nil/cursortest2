package com.crrepa.band.my.device.setting.periodchoose;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.BandPeriodTimeModel;
import com.crrepa.band.my.model.DoNotDistrubPeriodModel;
import com.crrepa.band.my.model.QuickViewPeriodModel;

/* loaded from: classes2.dex */
public class g implements com.moyoung.dafit.module.common.baseui.f {
    private BandPeriodTimeModel bandPeriodTimeModel;
    private h periodChooceView;

    private boolean isCrossDays() {
        return ((this.bandPeriodTimeModel.getStartHour() * 60) + this.bandPeriodTimeModel.getStartMinute()) - ((this.bandPeriodTimeModel.getEndHour() * 60) + this.bandPeriodTimeModel.getEndMinute()) > 0;
    }

    private void renderPeriodTime() {
        BandPeriodTimeModel bandPeriodTimeModel = this.bandPeriodTimeModel;
        if (bandPeriodTimeModel != null) {
            this.periodChooceView.renderStartTime(bandPeriodTimeModel.getStartHour(), this.bandPeriodTimeModel.getStartMinute());
            this.periodChooceView.renderEndTime(this.bandPeriodTimeModel.getEndHour(), this.bandPeriodTimeModel.getEndMinute());
        }
    }

    private boolean sendPeriodTime(int i8) {
        if (i8 == 1) {
            return i4.getInstance().sendDoNotDistrubTime(this.bandPeriodTimeModel);
        }
        if (i8 != 2) {
            return false;
        }
        return i4.getInstance().sendQuickViewTime(this.bandPeriodTimeModel);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    public void loadPeriodTime(int i8) {
        if (i8 == 1) {
            this.bandPeriodTimeModel = new DoNotDistrubPeriodModel();
        } else if (i8 == 2) {
            this.bandPeriodTimeModel = new QuickViewPeriodModel();
            this.periodChooceView.hideDoNotDistrubHint();
        }
        renderPeriodTime();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void sendBandPeriodTimeInfo(int i8) {
        if (i8 == 2 && isCrossDays()) {
            this.periodChooceView.quickViewPeriodCrossDays();
        } else if (!sendPeriodTime(i8)) {
            this.periodChooceView.saveFail();
        } else {
            this.bandPeriodTimeModel.savePeriodTime();
            this.periodChooceView.saveSuccess();
        }
    }

    public void setPeriodEndTime(int i8, int i9) {
        this.bandPeriodTimeModel.setEndHour(i8);
        this.bandPeriodTimeModel.setEndMinute(i9);
    }

    public void setPeriodStartTime(int i8, int i9) {
        this.bandPeriodTimeModel.setStartHour(i8);
        this.bandPeriodTimeModel.setStartMinute(i9);
    }

    public void setView(h hVar) {
        this.periodChooceView = hVar;
    }
}
