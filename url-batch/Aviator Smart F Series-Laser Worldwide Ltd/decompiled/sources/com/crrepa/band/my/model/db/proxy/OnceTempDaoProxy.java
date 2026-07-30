package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.OnceTemp;
import com.crrepa.band.my.model.db.greendao.OnceTempDao;
import java.util.Date;
import java.util.List;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.query.k;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class OnceTempDaoProxy {
    private OnceTempDao onceTempDao = c.getInstance().getDaoSession().getOnceTempDao();

    public OnceTemp get(long j8) {
        List<Object> list = this.onceTempDao.queryBuilder().where(OnceTempDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OnceTemp) list.get(0);
    }

    public List<OnceTemp> getAll() {
        return this.onceTempDao.queryBuilder().orderDesc(OnceTempDao.Properties.Date).build().list();
    }

    public List<OnceTemp> getHistory(Date date, int i8) {
        k queryBuilder = this.onceTempDao.queryBuilder();
        f fVar = OnceTempDao.Properties.Date;
        return queryBuilder.where(fVar.le(date), new m[0]).orderDesc(fVar).limit(i8).build().list();
    }

    public OnceTemp getLastOnceTemp() {
        List<OnceTemp> history = getHistory(new Date(), 1);
        if (history == null || history.isEmpty()) {
            return null;
        }
        return history.get(0);
    }

    public void insert(OnceTemp onceTemp) {
        this.onceTempDao.insert(onceTemp);
    }
}
