package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.CricketGame;
import com.crrepa.band.my.model.db.greendao.CricketGameDao;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class CricketGameProxy {
    private CricketGameDao dao = c.getInstance().getDaoSession().getCricketGameDao();

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public CricketGame get(long j8) {
        List<Object> list = this.dao.queryBuilder().where(CricketGameDao.Properties.GameId.eq(Long.valueOf(j8)), new m[0]).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (CricketGame) list.get(0);
    }

    public List<CricketGame> getAll() {
        return this.dao.queryBuilder().orderAsc(CricketGameDao.Properties.GameId).build().list();
    }

    public List<CricketGame> getSubscribedGameList() {
        return this.dao.queryBuilder().where(CricketGameDao.Properties.Reserved.eq(Boolean.TRUE), new m[0]).orderAsc(CricketGameDao.Properties.StartTimestamp).build().list();
    }

    public List<CricketGame> getTodayGameList() {
        Date date = new Date();
        long time = com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(date).getTime();
        long time2 = com.moyoung.dafit.module.common.utils.m.getSameDayEndTime(date).getTime();
        k queryBuilder = this.dao.queryBuilder();
        f fVar = CricketGameDao.Properties.StartTimestamp;
        return queryBuilder.where(fVar.gt(Long.valueOf(time)), fVar.lt(Long.valueOf(time2)), CricketGameDao.Properties.Reserved.eq(Boolean.TRUE)).list();
    }

    public void save(CricketGame cricketGame) {
        this.dao.insertOrReplace(cricketGame);
    }

    public void update(CricketGame cricketGame) {
        this.dao.update(cricketGame);
    }
}
