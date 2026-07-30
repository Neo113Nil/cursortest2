package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.band.provider.BandPillReminderProvider;
import com.crrepa.band.my.model.db.PillReminder;
import com.crrepa.band.my.model.db.greendao.PillReminderDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class PillReminderDaoProxy {
    private PillReminderDao dao = c.getInstance().getDaoSession().getPillReminderDao();

    public void delete(PillReminder pillReminder) {
        this.dao.delete(pillReminder);
    }

    public PillReminder get(long j8) {
        List<Object> list = this.dao.queryBuilder().where(PillReminderDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (PillReminder) list.get(0);
    }

    public List<PillReminder> getAll() {
        return this.dao.queryBuilder().orderAsc(PillReminderDao.Properties.Id).build().list();
    }

    public List<PillReminder> getEnableList() {
        return this.dao.queryBuilder().where(PillReminderDao.Properties.Enable.eq(Boolean.TRUE), new m[0]).orderAsc(PillReminderDao.Properties.Id).build().list();
    }

    public int getNextPillReminderIndex() {
        int pillReminderCount = BandPillReminderProvider.getPillReminderCount();
        if (pillReminderCount <= 0) {
            return -1;
        }
        List<PillReminder> all = getAll();
        if (all == null || all.isEmpty()) {
            return 0;
        }
        boolean[] zArr = new boolean[pillReminderCount];
        for (PillReminder pillReminder : all) {
            if (pillReminder.getEnable().booleanValue()) {
                zArr[pillReminder.getIndex().intValue()] = true;
            }
        }
        for (int i8 = 0; i8 < pillReminderCount; i8++) {
            if (!zArr[i8]) {
                return i8;
            }
        }
        return -1;
    }

    public void save(PillReminder pillReminder) {
        this.dao.save(pillReminder);
    }

    public PillReminder get(String str) {
        List<Object> list = this.dao.queryBuilder().where(PillReminderDao.Properties.Name.eq(str), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (PillReminder) list.get(0);
    }
}
