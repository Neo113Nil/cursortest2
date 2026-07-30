package com.crrepa.band.my.model.db.helper;

import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Date;

/* loaded from: classes2.dex */
public class StepsSaveHelper {
    private StepsDaoProxy stepsDaoProxy = StepsDaoProxy.getInstance();

    private void saveSteps(Step step, Step step2, boolean z7) {
        if (step2 == null) {
            this.stepsDaoProxy.insert(step);
            return;
        }
        if (z7 || step2.getSteps().intValue() < step.getSteps().intValue()) {
            step.setId(step2.getId());
            step.setDate(step2.getDate());
            if (step.getSteps().intValue() == step2.getSteps().intValue()) {
                step.setStepsCategory(step2.getStepsCategory());
            }
            this.stepsDaoProxy.updateStep(step);
        }
    }

    public void saveHistorySteps(int i8, Step step) {
        Date dateOfOffsetDay = m.getDateOfOffsetDay(new Date(), i8);
        step.setDate(dateOfOffsetDay);
        saveSteps(step, this.stepsDaoProxy.getStep(dateOfOffsetDay), false);
    }

    public void saveTodaySteps(Step step) {
        saveSteps(step, this.stepsDaoProxy.getStep(new Date()), true);
    }
}
