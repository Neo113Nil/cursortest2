package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.SleepNap;
import com.crrepa.band.my.model.db.greendao.SleepNapDao;
import com.crrepa.ble.conn.bean.CRPNapSleepInfo;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;

/* loaded from: classes2.dex */
public class SleepNapDaoProxy {
    private final SleepNapDao dao;

    private static class Holder {
        private static final SleepNapDaoProxy INSTANCE = new SleepNapDaoProxy();

        private Holder() {
        }
    }

    public static SleepNapDaoProxy get() {
        return Holder.INSTANCE;
    }

    public static int getNapTotalTime(List<CRPNapSleepInfo> list) {
        if (x0.isEmpty(list)) {
            return 0;
        }
        Iterator<CRPNapSleepInfo> it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            CRPNapSleepInfo next = it.next();
            i8 += next == null ? 0 : next.getTotalTime();
        }
        return i8;
    }

    public void delete(SleepNap sleepNap) {
        this.dao.delete(sleepNap);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public void deleteTodaySleepNap() {
        Date date = new Date();
        Date sameDayStartTime = m.getSameDayStartTime(date);
        Date sameDayEndTime = m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = SleepNapDao.Properties.Date;
        List<Object> list = queryBuilder.where(fVar.ge(sameDayStartTime), fVar.le(sameDayEndTime)).list();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.dao.deleteInTx(list);
    }

    public List<SleepNap> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = SleepNapDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new org.greenrobot.greendao.query.m[0]).orderAsc(fVar).build().list();
    }

    public SleepNap getSleepNap(Date date) {
        Date sameDayStartTime = m.getSameDayStartTime(date);
        Date sameDayEndTime = m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = SleepNapDao.Properties.Date;
        List<Object> list = queryBuilder.where(fVar.ge(sameDayStartTime), fVar.le(sameDayEndTime)).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (SleepNap) list.get(0);
    }

    public void insert(SleepNap sleepNap) {
        this.dao.insertOrReplace(sleepNap);
    }

    public void update(SleepNap sleepNap) {
        this.dao.update(sleepNap);
    }

    private SleepNapDaoProxy() {
        this.dao = c.getInstance().getDaoSession().getSleepNapDao();
    }
}
