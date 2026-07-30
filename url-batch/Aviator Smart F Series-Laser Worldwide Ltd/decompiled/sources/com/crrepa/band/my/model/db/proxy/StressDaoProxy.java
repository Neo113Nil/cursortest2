package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Stress;
import com.crrepa.band.my.model.db.greendao.StressDao;
import com.crrepa.ble.conn.bean.CRPHistoryStressInfo;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class StressDaoProxy {
    private static final long SAVED_MIN_TIME = 15000;
    private StressDao dao = c.getInstance().getDaoSession().getStressDao();

    private boolean hasStress(CRPHistoryStressInfo cRPHistoryStressInfo) {
        List<Object> list = this.dao.queryBuilder().where(StressDao.Properties.Stress.eq(Integer.valueOf(cRPHistoryStressInfo.getStress())), new m[0]).orderDesc(StressDao.Properties.Date).list();
        if (list != null && !list.isEmpty()) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                if (Math.abs(((Stress) it.next()).getDate().getTime() - cRPHistoryStressInfo.getDate().getTime()) < 15000) {
                    return true;
                }
            }
        }
        return false;
    }

    public Stress get(long j8) {
        List<Object> list = this.dao.queryBuilder().where(StressDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Stress) list.get(0);
    }

    public List<Stress> getAll() {
        return this.dao.queryBuilder().orderDesc(StressDao.Properties.Date).build().list();
    }

    public List<Stress> getHistoryList(Date date, int i8) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = StressDao.Properties.Date;
        return queryBuilder.where(fVar.le(date), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public Stress getLastStress(Date date) {
        List<Stress> historyList = getHistoryList(date, 1);
        if (historyList == null || historyList.isEmpty()) {
            return null;
        }
        return historyList.get(0);
    }

    public void insert(Stress stress) {
        this.dao.insert(stress);
    }

    public void saveHistoryList(List<CRPHistoryStressInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CRPHistoryStressInfo cRPHistoryStressInfo : list) {
            if (cRPHistoryStressInfo.getStress() > 0 && !hasStress(cRPHistoryStressInfo)) {
                Stress stress = new Stress();
                stress.setStress(Integer.valueOf(cRPHistoryStressInfo.getStress()));
                stress.setDate(cRPHistoryStressInfo.getDate());
                insert(stress);
            }
        }
    }
}
