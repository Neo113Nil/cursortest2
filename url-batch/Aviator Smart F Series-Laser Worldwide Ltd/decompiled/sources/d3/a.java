package d3;

import com.crrepa.band.my.health.water.model.WaterIntakeChangeEvent;
import com.crrepa.band.my.health.water.model.WaterRecordDeleteEvent;
import com.crrepa.band.my.health.water.util.WaterProvider;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.proxy.WaterDaoProxy;
import com.crrepa.ble.conn.bean.CRPDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPNewDrinkWaterPeriodInfo;
import com.crrepa.ble.conn.bean.CRPWaterIntakeInfo;
import com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener;
import com.orhanobut.logger.f;
import java.util.Date;
import java.util.List;
import org.greenrobot.eventbus.c;

/* loaded from: classes2.dex */
public class a implements CRPDeviceDrinkWaterListener {
    @Override // com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener
    public void onDeleteWaterIntake(CRPWaterIntakeInfo.WaterIntakeType waterIntakeType, int i8) {
        f.d("watch-water ==> onDeleteWaterIntake type : " + waterIntakeType + "; id : " + i8);
        Water water = new WaterDaoProxy().getWater(waterIntakeType == CRPWaterIntakeInfo.WaterIntakeType.WATCH ? 0 : 1, i8);
        if (water != null) {
            int i9 = -water.getIntakeMl().intValue();
            int i10 = -water.getIntakeOz().intValue();
            new WaterDaoProxy().delete(water);
            com.crrepa.band.my.health.water.util.a.getInstance().updateCalendarWater(i9, i10, new WaterDaoProxy().getCalendarWater(new Date(), true, 9));
            c.getDefault().post(new WaterIntakeChangeEvent());
            c.getDefault().post(new WaterRecordDeleteEvent(water.getId().longValue()));
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener
    public void onDrinkWaterGoals(int i8) {
        f.d("watch-water ==> onDrinkWaterGoals goalMl : " + i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener
    public void onDrinkWaterPeriod(CRPDrinkWaterPeriodInfo cRPDrinkWaterPeriodInfo) {
        f.d("watch-water ==> onDrinkWaterPeriod old WaterSettingInfo : " + cRPDrinkWaterPeriodInfo.toString());
        WaterProvider.updateWaterConnectStatus(WaterProvider.WaterConnectStatus.CONNECT_OLD);
        com.crrepa.band.my.health.water.util.a.getInstance().sendSyncWaterData(true);
    }

    @Override // com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener
    public void onNewDrinkWaterPeriod(CRPNewDrinkWaterPeriodInfo cRPNewDrinkWaterPeriodInfo) {
        f.d("watch-water ==> onNewDrinkWaterPeriod WaterSettingInfo : " + cRPNewDrinkWaterPeriodInfo.toString());
        WaterProvider.updateWaterConnectStatus(WaterProvider.WaterConnectStatus.CONNECT_NEW);
        com.crrepa.band.my.health.water.util.a.getInstance().sendSyncWaterData(false);
    }

    @Override // com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener
    public void onTodayWaterIntake(int i8) {
        f.d("watch-water ==> onTodayWaterIntake todayIntakeMl : " + i8);
    }

    @Override // com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener
    public void onTodayWaterIntakeHistoryChange(List<CRPWaterIntakeInfo> list) {
        f.d("watch-water ==> onTodayWaterIntakeHistoryChange list : " + list);
        new WaterDaoProxy().deleteTodayWatchRecords();
        if (list != null && list.size() > 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                com.crrepa.band.my.health.water.util.a.getInstance().insertWatchRecord(list.get(size));
            }
        }
        com.crrepa.band.my.health.water.util.a.getInstance().updateWatchCalendarWater();
    }

    @Override // com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener
    public void onWaterIntakeChange(CRPWaterIntakeInfo cRPWaterIntakeInfo) {
        f.d("watch-water ==> onWaterIntakeChange info : " + cRPWaterIntakeInfo.toString());
        Water water = new WaterDaoProxy().getWater(cRPWaterIntakeInfo.getType() == CRPWaterIntakeInfo.WaterIntakeType.WATCH ? 0 : 1, cRPWaterIntakeInfo.getId());
        if (water == null) {
            Water insertWatchRecord = com.crrepa.band.my.health.water.util.a.getInstance().insertWatchRecord(cRPWaterIntakeInfo);
            com.crrepa.band.my.health.water.util.a.getInstance().updateCalendarWater(insertWatchRecord.getIntakeMl().intValue(), insertWatchRecord.getIntakeOz().intValue(), new WaterDaoProxy().getCalendarWater(new Date(), true, 8));
        } else {
            com.crrepa.band.my.health.water.util.a.getInstance().updateWatchRecord(water, cRPWaterIntakeInfo);
        }
        c.getDefault().post(new WaterIntakeChangeEvent());
    }

    @Override // com.crrepa.ble.conn.listener.CRPDeviceDrinkWaterListener
    public void requestWaterIntakeHistory() {
        f.d("watch-water ==> onRequestWaterIntakeHistory");
        com.crrepa.band.my.health.water.util.a.getInstance().sendWaterRecordList();
    }
}
