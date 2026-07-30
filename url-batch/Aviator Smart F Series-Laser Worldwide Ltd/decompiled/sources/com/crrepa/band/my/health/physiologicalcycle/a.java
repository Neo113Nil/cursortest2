package com.crrepa.band.my.health.physiologicalcycle;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.db.PhysiologicalPeriod;
import com.crrepa.band.my.model.db.PhysiologicalRemind;
import com.crrepa.band.my.model.db.proxy.PhysiologicalPeriodDaoProxy;
import com.crrepa.band.my.model.db.proxy.PhysiologicalRemindDaoProxy;
import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import java.util.Date;

/* loaded from: classes2.dex */
public class a implements com.moyoung.dafit.module.common.baseui.f {
    private b physiologcalReminderView;
    PhysiologicalRemind physiologicalRemind;
    PhysiologicalRemindDaoProxy physiologicalRemindDaoProxy;

    public a() {
        PhysiologicalRemindDaoProxy physiologicalRemindDaoProxy = new PhysiologicalRemindDaoProxy();
        this.physiologicalRemindDaoProxy = physiologicalRemindDaoProxy;
        this.physiologicalRemind = physiologicalRemindDaoProxy.getPhysiologicalRemind();
    }

    private PhysiologicalPeriod getLastPhysiologicalPeriod() {
        return new PhysiologicalPeriodDaoProxy().getLastPhysiologcalPeriod();
    }

    private boolean isPhysiologicalRemindEnable(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    private void sendPhysiologicalPeriod() {
        PhysiologicalPeriod lastPhysiologicalPeriod = getLastPhysiologicalPeriod();
        if (lastPhysiologicalPeriod == null) {
            return;
        }
        Date lastMenstrualDate = lastPhysiologicalPeriod.getLastMenstrualDate();
        CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo = new CRPPhysiologcalPeriodInfo();
        cRPPhysiologcalPeriodInfo.setPhysiologcalPeriod(lastPhysiologicalPeriod.getPhysiologicalPeriod().intValue());
        cRPPhysiologcalPeriodInfo.setMenstrualPeriod(lastPhysiologicalPeriod.getMenstrualPeriod().intValue());
        cRPPhysiologcalPeriodInfo.setStartDate(lastMenstrualDate);
        com.orhanobut.logger.f.d("startDate: " + lastMenstrualDate);
        cRPPhysiologcalPeriodInfo.setReminderHour(this.physiologicalRemind.getHour().intValue());
        cRPPhysiologcalPeriodInfo.setReminderMinute(this.physiologicalRemind.getMinute().intValue());
        PhysiologicalRemind physiologicalRemind = new PhysiologicalRemindDaoProxy().getPhysiologicalRemind();
        if (PhysiologicalRemindDaoProxy.isEnable(physiologicalRemind)) {
            cRPPhysiologcalPeriodInfo.setMenstrualReminder(isPhysiologicalRemindEnable(physiologicalRemind.getMenstrual()));
            cRPPhysiologcalPeriodInfo.setOvulationReminder(isPhysiologicalRemindEnable(physiologicalRemind.getOvulation()));
            cRPPhysiologcalPeriodInfo.setOvulationDayReminder(isPhysiologicalRemindEnable(physiologicalRemind.getOvulationDay()));
            cRPPhysiologcalPeriodInfo.setOvulationEndReminder(isPhysiologicalRemindEnable(physiologicalRemind.getOvulationEnd()));
        }
        i4.getInstance().sendPhysiologcalPeriod(cRPPhysiologcalPeriodInfo);
    }

    private void showEndOfOvulatio(Boolean bool) {
        if (bool == null) {
            return;
        }
        this.physiologcalReminderView.renderEndOfOvulatio(bool.booleanValue());
    }

    private void showMenstrualReminder(Boolean bool) {
        if (bool == null) {
            return;
        }
        this.physiologcalReminderView.renderMenstrualReminder(bool.booleanValue());
    }

    private void showOvulationDayReminder(Boolean bool) {
        if (bool == null) {
            return;
        }
        this.physiologcalReminderView.renderOvulationDayReminder(bool.booleanValue());
    }

    private void showOvulationReminder(Boolean bool) {
        if (bool == null) {
            return;
        }
        this.physiologcalReminderView.renderOvulationReminder(bool.booleanValue());
    }

    private void showPhysiologcalReminderTime() {
        if (this.physiologicalRemind.getMinute() == null || this.physiologicalRemind.getHour() == null) {
            return;
        }
        this.physiologcalReminderView.renderReminderTime(this.physiologicalRemind.getHour().intValue(), this.physiologicalRemind.getMinute().intValue());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.physiologcalReminderView = null;
        try {
            sendPhysiologicalPeriod();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void getPhysiologcalReminder() {
        showMenstrualReminder(this.physiologicalRemind.getMenstrual());
        showOvulationReminder(this.physiologicalRemind.getOvulation());
        showOvulationDayReminder(this.physiologicalRemind.getOvulationDay());
        showEndOfOvulatio(this.physiologicalRemind.getOvulationEnd());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
        showPhysiologcalReminderTime();
    }

    public void savePhysiologcalReminder(boolean z7, boolean z8, boolean z9, boolean z10) {
        this.physiologicalRemind.setMenstrual(Boolean.valueOf(z7));
        this.physiologicalRemind.setOvulation(Boolean.valueOf(z8));
        this.physiologicalRemind.setOvulationDay(Boolean.valueOf(z9));
        this.physiologicalRemind.setOvulationEnd(Boolean.valueOf(z10));
        this.physiologicalRemindDaoProxy.update(this.physiologicalRemind);
    }

    public void savePhysiologicalEnable(boolean z7) {
        this.physiologicalRemind.setEnable(Boolean.valueOf(z7));
    }

    public void savePhysiologicalReminderTime(int i8, int i9) {
        this.physiologicalRemind.setHour(Integer.valueOf(i8));
        this.physiologicalRemind.setMinute(Integer.valueOf(i9));
        this.physiologcalReminderView.renderReminderTime(i8, i9);
    }

    public void selectPhysiologicalReminderTime() {
        this.physiologcalReminderView.renderReminderTimeDialog(this.physiologicalRemind.getHour() != null ? this.physiologicalRemind.getHour().intValue() : 10, this.physiologicalRemind.getMinute() != null ? this.physiologicalRemind.getMinute().intValue() : 0);
    }

    public void setView(b bVar) {
        this.physiologcalReminderView = bVar;
    }
}
