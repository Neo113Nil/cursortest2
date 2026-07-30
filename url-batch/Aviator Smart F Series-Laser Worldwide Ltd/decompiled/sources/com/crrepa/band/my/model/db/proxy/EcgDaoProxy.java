package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Ecg;
import com.crrepa.band.my.model.db.greendao.EcgDao;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class EcgDaoProxy {
    private EcgDao dao = c.getInstance().getDaoSession().getEcgDao();

    private static class Holder {
        private static EcgDaoProxy INSTANCE = new EcgDaoProxy();

        private Holder() {
        }
    }

    public static EcgDaoProxy getInstance() {
        return Holder.INSTANCE;
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<Ecg> getAll() {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = EcgDao.Properties.Date;
        return queryBuilder.where(fVar.le(new Date()), new m[0]).orderDesc(fVar).build().list();
    }

    public Ecg getEcg(long j8) {
        List<Object> list = this.dao.queryBuilder().where(EcgDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Ecg) list.get(0);
    }

    public Ecg getLastTimeEcg() {
        List<Ecg> lastTimesEcg = getLastTimesEcg(new Date(), 1);
        if (lastTimesEcg == null || lastTimesEcg.isEmpty()) {
            return null;
        }
        return lastTimesEcg.get(0);
    }

    public List<Ecg> getLastTimesEcg(Date date, int i8) {
        k queryBuilder = this.dao.queryBuilder();
        f fVar = EcgDao.Properties.Date;
        return queryBuilder.where(fVar.le(date), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public long insert(Ecg ecg) {
        return this.dao.insertOrReplace(ecg);
    }
}
