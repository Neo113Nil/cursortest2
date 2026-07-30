package com.crrepa.band.my.ble.band.cmd.listener;

import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.worldclock.WorldClockActivity;
import com.crrepa.band.my.device.worldclock.model.BandWorldClockSupportChangeEvent;
import com.crrepa.band.my.model.db.WorldClock;
import com.crrepa.band.my.model.db.proxy.WorldClockDaoProxy;
import com.crrepa.ble.conn.bean.CRPSupportWorldClockInfo;
import com.crrepa.ble.conn.bean.CRPWorldClockInfo;
import com.crrepa.ble.conn.listener.CRPWorldClockListener;
import java.util.List;

/* loaded from: classes2.dex */
public class o implements CRPWorldClockListener {
    @Override // com.crrepa.ble.conn.listener.CRPWorldClockListener
    public void onSupportWorldClock(CRPSupportWorldClockInfo cRPSupportWorldClockInfo) {
        com.orhanobut.logger.f.d("onSupportWorldClock max num: " + cRPSupportWorldClockInfo.getMaxCount());
        com.crrepa.band.my.device.worldclock.a.saveWorldClockNumber(cRPSupportWorldClockInfo.getMaxCount());
        org.greenrobot.eventbus.c.getDefault().post(new BandWorldClockSupportChangeEvent());
        e2.b.checkSavedWorldClockTimeZone();
        if (com.moyoung.dafit.module.common.baseui.a.getInstance().getClassNameList().contains(WorldClockActivity.class.getName())) {
            return;
        }
        List<Integer> idList = cRPSupportWorldClockInfo.getIdList();
        List<WorldClock> all = new WorldClockDaoProxy().getAll();
        if (all.size() == idList.size()) {
            boolean z7 = false;
            for (int i8 = 0; i8 < idList.size(); i8++) {
                if (!all.get(i8).getClockId().equals(idList.get(i8))) {
                    z7 = true;
                }
            }
            if (!z7) {
                return;
            }
        }
        for (int i9 = 0; i9 < idList.size(); i9++) {
            i4.getInstance().deleteWorldClock(idList.get(i9).byteValue());
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPWorldClockListener
    public void onWorldClock(CRPWorldClockInfo cRPWorldClockInfo) {
    }
}
