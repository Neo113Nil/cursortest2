package com.crrepa.band.my.health.steps;

import androidx.annotation.NonNull;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import com.crrepa.ble.conn.bean.CRPStepsCategoryInfo;
import com.crrepa.ble.conn.listener.CRPStepsCategoryChangeListener;
import com.crrepa.ble.conn.type.CRPCategoryHistoryDay;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.s;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import l0.f;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class a implements CRPStepsCategoryChangeListener {
    private Date getDate(CRPCategoryHistoryDay cRPCategoryHistoryDay) {
        Date date = new Date();
        if (cRPCategoryHistoryDay == CRPCategoryHistoryDay.TODAY) {
            return date;
        }
        Calendar calendar = k.getCalendar();
        calendar.setTime(date);
        calendar.add(5, -1);
        return calendar.getTime();
    }

    @NonNull
    private List<Integer> getStepsList(CRPStepsCategoryInfo cRPStepsCategoryInfo) {
        int timeInterval = cRPStepsCategoryInfo.getTimeInterval();
        List<Integer> stepsList = cRPStepsCategoryInfo.getStepsList();
        int i8 = 1440 / timeInterval;
        int size = stepsList.size();
        if (i8 < size) {
            return stepsList.subList(0, i8);
        }
        if (size >= i8) {
            return stepsList;
        }
        int i9 = i8 - size;
        for (int i10 = 0; i10 < i9; i10++) {
            stepsList.add(0);
        }
        return stepsList;
    }

    private void postStepsCategoryChangeEvent(CRPCategoryHistoryDay cRPCategoryHistoryDay, List<Integer> list) {
        if (cRPCategoryHistoryDay == CRPCategoryHistoryDay.TODAY) {
            c.getDefault().post(new f(list));
        }
    }

    private void saveStepsCategory(CRPCategoryHistoryDay cRPCategoryHistoryDay, int i8, List<Integer> list) {
        Date date = getDate(cRPCategoryHistoryDay);
        com.orhanobut.logger.f.d("date: " + date);
        StepsDaoProxy stepsDaoProxy = StepsDaoProxy.getInstance();
        Step step = stepsDaoProxy.getStep(date);
        if (step != null && updateSteps(list, step)) {
            String bean2Json = s.bean2Json(list);
            com.orhanobut.logger.f.d("stepsJson: " + bean2Json);
            step.setStepsCategory(bean2Json);
            step.setTimeInterval(i8);
            stepsDaoProxy.updateStep(step);
        }
    }

    private boolean updateSteps(List<Integer> list, Step step) {
        Iterator<Integer> it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += it.next().intValue();
        }
        return step.getSteps().intValue() == 0 || i8 > 0;
    }

    @Override // com.crrepa.ble.conn.listener.CRPStepsCategoryChangeListener
    public void onStepsCategoryChange(CRPStepsCategoryInfo cRPStepsCategoryInfo) {
        CRPCategoryHistoryDay dateType = cRPStepsCategoryInfo.getDateType();
        List<Integer> stepsList = getStepsList(cRPStepsCategoryInfo);
        saveStepsCategory(dateType, cRPStepsCategoryInfo.getTimeInterval(), stepsList);
        postStepsCategoryChangeEvent(dateType, stepsList);
    }
}
