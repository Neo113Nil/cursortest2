package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.WorldClock;
import com.crrepa.band.my.model.db.greendao.WorldClockDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class WorldClockDaoProxy {
    private WorldClockDao dao = c.getInstance().getDaoSession().getWorldClockDao();

    public void delete(int i8) {
        List<Object> list = this.dao.queryBuilder().where(WorldClockDao.Properties.ClockId.eq(Integer.valueOf(i8)), new m[0]).list();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.dao.deleteInTx(list);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public WorldClock get(int i8) {
        List<Object> list = this.dao.queryBuilder().where(WorldClockDao.Properties.ClockId.eq(Integer.valueOf(i8)), new m[0]).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (WorldClock) list.get(0);
    }

    public List<WorldClock> getAll() {
        return this.dao.queryBuilder().orderAsc(WorldClockDao.Properties.Id).list();
    }

    public long insert(WorldClock worldClock) {
        return this.dao.insertOrReplace(worldClock);
    }
}
