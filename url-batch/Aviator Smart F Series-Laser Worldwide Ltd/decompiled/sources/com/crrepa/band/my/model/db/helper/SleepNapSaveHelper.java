package com.crrepa.band.my.model.db.helper;

import android.util.Log;
import com.crrepa.band.my.model.db.SleepNap;
import com.crrepa.band.my.model.db.proxy.SleepNapDaoProxy;
import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.Date;
import java.util.List;
import z2.a;

/* loaded from: classes2.dex */
public class SleepNapSaveHelper {
    private final SleepNapDaoProxy sleepNapDaoProxy = SleepNapDaoProxy.get();

    public void saveSleepNap(int i8, List<CRPNapSleepInfo> list) {
        Log.d("SleepNap", "offset=" + i8);
        if (x0.isEmpty(list)) {
            Log.d("SleepNap", "napList.isEmpty");
            return;
        }
        Date dateOfOffsetDay = m.getDateOfOffsetDay(a.getSleepSaveDate(), i8);
        Log.d("SleepNap", "date=" + m.format(dateOfOffsetDay, "yyyy/MM/dd HH:mm"));
        SleepNap sleepNap = this.sleepNapDaoProxy.getSleepNap(dateOfOffsetDay);
        if (sleepNap != null) {
            Log.d("SleepNap", "delete(savedSleepNap)");
            this.sleepNapDaoProxy.delete(sleepNap);
        }
        SleepNap sleepNap2 = new SleepNap();
        sleepNap2.setNapListJson(list);
        sleepNap2.setDate(dateOfOffsetDay);
        this.sleepNapDaoProxy.insert(sleepNap2);
    }
}
