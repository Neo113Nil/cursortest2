package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Hrv;
import com.crrepa.band.my.model.db.greendao.HrvDao;
import com.crrepa.ble.conn.bean.CRPHistoryHrvInfo;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class HrvDaoProxy {
    private static final long SAVED_MIN_TIME = 15000;
    private HrvDao dao = c.getInstance().getDaoSession().getHrvDao();

    private boolean hasHrv(CRPHistoryHrvInfo cRPHistoryHrvInfo) {
        List<Object> list = this.dao.queryBuilder().where(HrvDao.Properties.Hrv.eq(Integer.valueOf(cRPHistoryHrvInfo.getHrv())), new m[0]).orderDesc(HrvDao.Properties.Date).list();
        if (list != null && !list.isEmpty()) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                if (Math.abs(((Hrv) it.next()).getDate().getTime() - cRPHistoryHrvInfo.getDate().getTime()) < 15000) {
                    return true;
                }
            }
        }
        return false;
    }

    public Hrv get(long j8) {
        List<Object> list = this.dao.queryBuilder().where(HrvDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Hrv) list.get(0);
    }

    public List<Hrv> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = HrvDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new m[0]).orderDesc(fVar).list();
    }

    public List<Hrv> getHistoryList(Date date, int i8) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = HrvDao.Properties.Date;
        return queryBuilder.where(fVar.le(date), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public Hrv getLastHrv() {
        List<Hrv> historyList = getHistoryList(new Date(), 1);
        if (historyList == null || historyList.isEmpty()) {
            return null;
        }
        return historyList.get(0);
    }

    public List<Hrv> getTodatHrv() {
        Date date = new Date();
        Date sameDayStartTime = com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date);
        Date sameDayEndTime = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date);
        k queryBuilder = this.dao.queryBuilder();
        f fVar = HrvDao.Properties.Date;
        return queryBuilder.where(fVar.gt(sameDayStartTime), fVar.lt(sameDayEndTime)).list();
    }

    public long insert(Hrv hrv) {
        return this.dao.insertOrReplace(hrv);
    }

    public void saveHistoryList(List<CRPHistoryHrvInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (CRPHistoryHrvInfo cRPHistoryHrvInfo : list) {
            if (cRPHistoryHrvInfo.getHrv() > 0 && !hasHrv(cRPHistoryHrvInfo)) {
                Hrv hrv = new Hrv();
                hrv.setHrv(Integer.valueOf(cRPHistoryHrvInfo.getHrv()));
                hrv.setDate(cRPHistoryHrvInfo.getDate());
                insert(hrv);
            }
        }
    }
}
