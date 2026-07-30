package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Alarm;
import com.crrepa.band.my.model.db.greendao.AlarmDao;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class BandAlarmDaoProxy {
    private AlarmDao dao = c.getInstance().getDaoSession().getAlarmDao();

    public void delete(Alarm alarm) {
        this.dao.delete(alarm);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public Alarm getAlarm(int i8) {
        List<Object> list = this.dao.queryBuilder().where(AlarmDao.Properties.Alarm_id.eq(Integer.valueOf(i8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Alarm) list.get(0);
    }

    public List<Alarm> getAll() {
        return this.dao.queryBuilder().orderAsc(AlarmDao.Properties.Alarm_id).build().list();
    }

    public int getNextAlarmId(int i8) {
        if (i8 <= 0) {
            return -1;
        }
        List<Alarm> all = getAll();
        if (all == null || all.isEmpty()) {
            return 0;
        }
        boolean[] zArr = new boolean[i8];
        Iterator<Alarm> it = all.iterator();
        while (it.hasNext()) {
            zArr[it.next().getAlarm_id()] = true;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!zArr[i9]) {
                return i9;
            }
        }
        return -1;
    }

    public void save(Alarm alarm) {
        Alarm alarm2 = getAlarm(alarm.getAlarm_id());
        if (alarm2 == null) {
            this.dao.insert(alarm);
        } else {
            alarm.setId(alarm2.getId());
            this.dao.update(alarm);
        }
    }
}
