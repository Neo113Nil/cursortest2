package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.BandConfig;
import com.crrepa.band.my.model.db.greendao.BandConfigDao;
import com.orhanobut.logger.f;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class BandConfigDaoProxy {
    private final BandConfigDao dao = c.getInstance().getDaoSession().getBandConfigDao();

    private BandConfig get(List<BandConfig> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void delete(int i8) {
        List<Object> list = this.dao.queryBuilder().where(BandConfigDao.Properties.BandId.eq(Integer.valueOf(i8)), new m[0]).list();
        if (list == null || list.isEmpty()) {
            return;
        }
        f.d("delete band name: " + list.get(0));
        this.dao.deleteInTx(list);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public List<BandConfig> getAll() {
        return this.dao.queryBuilder().build().list();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BandConfig getByFirmwareType(String str) {
        return get(this.dao.queryBuilder().where(BandConfigDao.Properties.FirmwareType.eq(str), new m[0]).build().list());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BandConfig getByName(String str) {
        return get(this.dao.queryBuilder().where(BandConfigDao.Properties.BroadcastName.eq(str), new m[0]).build().list());
    }

    public void save(BandConfig bandConfig) {
        this.dao.insertOrReplace(bandConfig);
    }
}
