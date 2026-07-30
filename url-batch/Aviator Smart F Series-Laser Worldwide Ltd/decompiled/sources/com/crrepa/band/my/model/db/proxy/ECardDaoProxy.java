package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.ECard;
import com.crrepa.band.my.model.db.ECardConfig;
import com.crrepa.band.my.model.db.greendao.ECardDao;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class ECardDaoProxy {
    private ECardDao dao = c.getInstance().getDaoSession().getECardDao();

    public void delete(long j8) {
        this.dao.deleteByKey(Long.valueOf(j8));
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public ECard get(long j8) {
        List<Object> list = this.dao.queryBuilder().where(ECardDao.Properties.Id.eq(Long.valueOf(j8)), new m[0]).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ECard) list.get(0);
    }

    public List<ECard> getAll() {
        return this.dao.queryBuilder().orderAsc(ECardDao.Properties.Index).build().list();
    }

    public long getNextECardId() {
        int intValue;
        ECardConfig eCardConfig = new ECardConfigDaoProxy().get(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (eCardConfig == null || (intValue = eCardConfig.getCount().intValue()) <= 0) {
            return -1L;
        }
        List<ECard> all = getAll();
        if (all == null || all.isEmpty()) {
            return 0L;
        }
        boolean[] zArr = new boolean[intValue];
        Iterator<ECard> it = all.iterator();
        while (it.hasNext()) {
            zArr[it.next().getId().intValue()] = true;
        }
        for (int i8 = 0; i8 < intValue; i8++) {
            if (!zArr[i8]) {
                return i8;
            }
        }
        return -1L;
    }

    public int getNextECardIndex() {
        List<ECard> all = getAll();
        if (all == null || all.isEmpty()) {
            return 0;
        }
        return all.get(all.size() - 1).getIndex().intValue() + 1;
    }

    public long insert(ECard eCard) {
        return this.dao.insertOrReplace(eCard);
    }

    public void insert(List<ECard> list) {
        this.dao.insertInTx(list);
    }
}
