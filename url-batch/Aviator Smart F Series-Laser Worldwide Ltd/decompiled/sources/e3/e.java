package e3;

import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.proxy.WaterDaoProxy;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.u0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e implements f {
    private Date currentDate;
    private g3.b view;
    private final WaterDaoProxy waterDaoProxy = new WaterDaoProxy();
    private List<Water> waterRecordList = new ArrayList();
    private Water calendarWater = null;
    private boolean isToday = true;
    private long clickTime = 0;
    private boolean is12HourTime = false;

    private void getWaterData(boolean z7) {
        boolean z8 = BandUnitSystemProvider.getUnitSystem() == 0;
        Water water = this.calendarWater;
        if (water == null) {
            this.view.showTotalIntake(-1);
            this.view.showGoal(z8 ? 2000 : u0.ml2Ozs(2000));
            this.view.showPercentage(-1, z7);
        } else if (z8) {
            this.view.showTotalIntake(water.getTotalIntakeMl().intValue());
            this.view.showGoal(this.calendarWater.getGoalMl().intValue());
            this.view.showPercentage(WaterProvider.getWaterPercentage(this.calendarWater.getTotalIntakeMl().intValue(), this.calendarWater.getGoalMl().intValue()), z7);
        } else {
            this.view.showTotalIntake(water.getTotalIntakeOz().intValue());
            this.view.showGoal(this.calendarWater.getGoalOz().intValue());
            this.view.showPercentage(WaterProvider.getWaterPercentage(this.calendarWater.getTotalIntakeOz().intValue(), this.calendarWater.getGoalOz().intValue()), z7);
        }
    }

    public void deleteWater(Water water) {
        com.crrepa.band.my.health.water.util.a.getInstance().deleteWaterRecord(water, this.calendarWater);
        getWaterData(false);
        if (this.waterRecordList.size() == 0) {
            this.view.renderWaterRecord(null);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
    }

    public Date getCurrentDate() {
        return this.currentDate;
    }

    public int getPositionByWater(Water water) {
        for (int i8 = 0; i8 < this.waterRecordList.size(); i8++) {
            if (Objects.equals(this.waterRecordList.get(i8).getId(), water.getId())) {
                return i8;
            }
        }
        return -1;
    }

    public int getRecordListSize() {
        return this.waterRecordList.size();
    }

    public void getTodayWaterRecordList() {
        List<Water> sortWaterRecordList = this.waterDaoProxy.getSortWaterRecordList(this.currentDate, 2);
        this.waterRecordList = sortWaterRecordList;
        this.view.renderWaterRecord(sortWaterRecordList);
    }

    public Water getWaterByPosition(int i8) {
        if (i8 < this.waterRecordList.size()) {
            return this.waterRecordList.get(i8);
        }
        return null;
    }

    public void insertIntakeWater(int i8) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.clickTime > 1000) {
            this.clickTime = currentTimeMillis;
            com.crrepa.band.my.health.water.util.a.getInstance().insertWaterRecord(i8, this.calendarWater);
            updateWaterData(false);
        }
    }

    public boolean is12HourTime() {
        return this.is12HourTime;
    }

    public boolean isToday() {
        return this.isToday;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void set12HourTime(boolean z7) {
        if (z7 != this.is12HourTime) {
            this.is12HourTime = z7;
            getTodayWaterRecordList();
        }
    }

    public void setCurrentDate(Date date) {
        com.orhanobut.logger.f.d("water ==> current-Date : " + date);
        this.currentDate = date;
        this.is12HourTime = BandTimeSystemProvider.is12HourTime();
        boolean isSameDay = i3.a.isSameDay(date, new Date());
        this.isToday = isSameDay;
        this.calendarWater = this.waterDaoProxy.getCalendarWater(date, isSameDay, 0);
    }

    public void setView(g3.b bVar) {
        this.view = bVar;
    }

    public void updateWaterData(boolean z7) {
        getWaterData(z7);
        getTodayWaterRecordList();
    }
}
