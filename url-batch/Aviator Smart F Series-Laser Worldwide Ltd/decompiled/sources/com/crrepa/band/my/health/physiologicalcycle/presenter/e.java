package com.crrepa.band.my.health.physiologicalcycle.presenter;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.model.db.PhysiologicalPeriod;
import com.crrepa.band.my.model.db.PhysiologicalRemind;
import com.crrepa.band.my.model.db.proxy.PhysiologicalPeriodDaoProxy;
import com.crrepa.band.my.model.db.proxy.PhysiologicalRemindDaoProxy;
import com.crrepa.band.my.model.user.provider.PhysiologicalPeriodProvider;
import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class e implements com.moyoung.dafit.module.common.baseui.f {
    private Integer displayMenstrualPeriod;
    private Integer displayPhysiologicalPeriod;
    private Date displayStartDate;
    private x2.b view;
    private final int DEFAULT_HOUR = 20;
    private final int DEFAULT_MINUTE = 0;
    private PhysiologicalPeriod lastPhysiologicalPeriod = new PhysiologicalPeriodDaoProxy().getLastPhysiologcalPeriod();

    private boolean isPhysiologicalRemindEnable(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    private void showLastMenstrualDate(Date date) {
        this.view.renderLastMenstrualDate(date);
    }

    private void showMenstrualPeriod(int i8) {
        this.view.renderMenstrualPeriod(String.valueOf(i8));
    }

    private void showPhysiologicalPeriod(int i8) {
        this.view.renderPhysiologicalCycle(String.valueOf(i8));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    public boolean isSelectFinish() {
        return (this.displayPhysiologicalPeriod == null || this.displayMenstrualPeriod == null || this.displayStartDate == null) ? false : true;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void saveLastMenstrualDate(Date date) {
        this.displayStartDate = date;
        showLastMenstrualDate(date);
    }

    public void saveMenstrualPeriod(int i8) {
        this.displayMenstrualPeriod = Integer.valueOf(i8);
        showMenstrualPeriod(i8);
    }

    public void savePhysiologicalPeriod(int i8) {
        this.displayPhysiologicalPeriod = Integer.valueOf(i8);
        showPhysiologicalPeriod(i8);
    }

    public void selectLastMenstrualDate() {
        Date date = this.displayStartDate;
        if (date == null) {
            date = new Date();
        }
        this.view.renderSelectedLastMenstrualDate(date);
    }

    public void selectMenstrualPeriod() {
        List<Integer> menstrualPeriodList = PhysiologicalPeriodProvider.getMenstrualPeriodList();
        PhysiologicalPeriod physiologicalPeriod = this.lastPhysiologicalPeriod;
        this.view.renderSelectedMenstrualPeriod(menstrualPeriodList, PhysiologicalPeriodProvider.getMenstrualPeriodSelectedPosition((physiologicalPeriod == null || physiologicalPeriod.getMenstrualPeriod() == null) ? 5 : this.lastPhysiologicalPeriod.getMenstrualPeriod().intValue()));
    }

    public void selectPhysiologicalCycle() {
        List<Integer> physiologicalCycleList = PhysiologicalPeriodProvider.getPhysiologicalCycleList();
        PhysiologicalPeriod physiologicalPeriod = this.lastPhysiologicalPeriod;
        this.view.renderSelectedPhysiologicalCycle(physiologicalCycleList, PhysiologicalPeriodProvider.getPhysiologicalCycleSelectedPosition((physiologicalPeriod == null || physiologicalPeriod.getPhysiologicalPeriod() == null) ? 28 : this.lastPhysiologicalPeriod.getPhysiologicalPeriod().intValue()));
    }

    public void sendPhysiologicalPeriod() {
        PhysiologicalPeriod lastPhysiologcalPeriod = new PhysiologicalPeriodDaoProxy().getLastPhysiologcalPeriod();
        if (lastPhysiologcalPeriod == null) {
            return;
        }
        Date lastMenstrualDate = lastPhysiologcalPeriod.getLastMenstrualDate();
        CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo = new CRPPhysiologcalPeriodInfo();
        cRPPhysiologcalPeriodInfo.setPhysiologcalPeriod(lastPhysiologcalPeriod.getPhysiologicalPeriod().intValue());
        cRPPhysiologcalPeriodInfo.setMenstrualPeriod(lastPhysiologcalPeriod.getMenstrualPeriod().intValue());
        cRPPhysiologcalPeriodInfo.setStartDate(lastMenstrualDate);
        com.orhanobut.logger.f.d("startDate: " + lastMenstrualDate);
        PhysiologicalRemind physiologicalRemind = new PhysiologicalRemindDaoProxy().getPhysiologicalRemind();
        if (physiologicalRemind != null) {
            cRPPhysiologcalPeriodInfo.setReminderHour(physiologicalRemind.getHour().intValue());
            cRPPhysiologcalPeriodInfo.setReminderMinute(physiologicalRemind.getMinute().intValue());
            if (PhysiologicalRemindDaoProxy.isEnable(physiologicalRemind)) {
                cRPPhysiologcalPeriodInfo.setMenstrualReminder(isPhysiologicalRemindEnable(physiologicalRemind.getMenstrual()));
                cRPPhysiologcalPeriodInfo.setOvulationReminder(isPhysiologicalRemindEnable(physiologicalRemind.getOvulation()));
                cRPPhysiologcalPeriodInfo.setOvulationDayReminder(isPhysiologicalRemindEnable(physiologicalRemind.getOvulationDay()));
                cRPPhysiologcalPeriodInfo.setOvulationEndReminder(isPhysiologicalRemindEnable(physiologicalRemind.getOvulationEnd()));
            }
            i4.getInstance().sendPhysiologcalPeriod(cRPPhysiologcalPeriodInfo);
        }
    }

    public void setView(x2.b bVar) {
        this.view = bVar;
    }

    public void showPhysiologicalPeriodData() {
        if (this.lastPhysiologicalPeriod == null) {
            return;
        }
        com.orhanobut.logger.f.d("id: " + this.lastPhysiologicalPeriod.getId());
        Integer physiologicalPeriod = this.lastPhysiologicalPeriod.getPhysiologicalPeriod();
        this.displayPhysiologicalPeriod = physiologicalPeriod;
        if (physiologicalPeriod != null) {
            showPhysiologicalPeriod(physiologicalPeriod.intValue());
        }
        Integer menstrualPeriod = this.lastPhysiologicalPeriod.getMenstrualPeriod();
        this.displayMenstrualPeriod = menstrualPeriod;
        if (menstrualPeriod != null) {
            showMenstrualPeriod(menstrualPeriod.intValue());
        }
        Date lastMenstrualDate = this.lastPhysiologicalPeriod.getLastMenstrualDate();
        this.displayStartDate = lastMenstrualDate;
        if (lastMenstrualDate != null) {
            showLastMenstrualDate(lastMenstrualDate);
        }
    }

    public void savePhysiologicalPeriod() {
        PhysiologicalPeriod physiologicalPeriod = new PhysiologicalPeriod();
        physiologicalPeriod.setPhysiologicalPeriod(this.displayPhysiologicalPeriod);
        physiologicalPeriod.setMenstrualPeriod(this.displayMenstrualPeriod);
        physiologicalPeriod.setLastMenstrualDate(this.displayStartDate);
        com.orhanobut.logger.f.d("savePhysiologicalPeriod: " + new PhysiologicalPeriodDaoProxy().insert(physiologicalPeriod));
        w2.b.guideComplete();
    }
}
