package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.band.my.health.steps.model.BandStepChangeEvent;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.helper.StepsSaveHelper;
import com.crrepa.ble.conn.bean.CRPStepInfo;
import com.crrepa.ble.conn.listener.CRPStepChangeListener;
import com.crrepa.ble.conn.type.CRPHistoryDay;
import java.util.Date;

/* loaded from: classes2.dex */
public class m implements CRPStepChangeListener {
    private StepsSaveHelper stepsSaveHelper = new StepsSaveHelper();

    private boolean isValidSteps(int i8) {
        return i8 >= 0 && i8 <= 100000;
    }

    @Override // com.crrepa.ble.conn.listener.CRPStepChangeListener
    public void onHistoryStepChange(CRPHistoryDay cRPHistoryDay, CRPStepInfo cRPStepInfo) {
        int steps = cRPStepInfo.getSteps();
        com.orhanobut.logger.f.d("onHistoryStepChange: " + ((int) cRPHistoryDay.getValue()) + "-" + cRPStepInfo.toString());
        if (isValidSteps(steps)) {
            this.stepsSaveHelper.saveHistorySteps(-cRPHistoryDay.getValue(), b3.a.convert(cRPStepInfo));
            com.crrepa.band.my.ble.band.cmd.d.getInstance().queryHistorySteps(cRPHistoryDay.nextDay());
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPStepChangeListener
    public void onStepChange(CRPStepInfo cRPStepInfo) {
        if (cRPStepInfo == null) {
            com.orhanobut.logger.f.d("stepInfo is null");
            return;
        }
        int steps = cRPStepInfo.getSteps();
        if (!isValidSteps(steps) || com.moyoung.dafit.module.common.utils.m.isLastMinuteOfDay()) {
            com.orhanobut.logger.f.d("ignore this steps: " + new Date());
            return;
        }
        Step convert = b3.a.convert(cRPStepInfo);
        org.greenrobot.eventbus.c.getDefault().post(new BandStepChangeEvent(convert));
        this.stepsSaveHelper.saveTodaySteps(convert);
        com.crrepa.band.my.health.base.c.getInstance().uploadBandSteps(convert);
        m1.a.showStepsNotification(com.moyoung.dafit.module.common.utils.d.get(), convert.getSteps().intValue());
        com.crrepa.band.my.profile.googlefit.c.getInstance().updateSteps(steps);
    }
}
