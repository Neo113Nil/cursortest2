package com.crrepa.band.my.model.db.proxy;

import android.text.TextUtils;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Recover;
import com.crrepa.band.my.model.db.greendao.RecoverDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class RecoverDaoProxy {
    public static final int PLATFORM_HUNTERSUN = 2;
    public static final int PLATFORM_SIFLI = 5;
    private RecoverDao dao = c.getInstance().getDaoSession().getRecoverDao();

    public void delete(String str) {
        List<Object> list;
        if (TextUtils.isEmpty(str) || (list = this.dao.queryBuilder().where(RecoverDao.Properties.Address.eq(str), new m[0]).list()) == null || list.isEmpty()) {
            return;
        }
        this.dao.deleteInTx(list);
    }

    public List<Recover> getAll() {
        return this.dao.queryBuilder().orderDesc(RecoverDao.Properties.Id).build().list();
    }

    public boolean hasRecoverBand() {
        List<Recover> all = new RecoverDaoProxy().getAll();
        return (all == null || all.isEmpty()) ? false : true;
    }

    public long insert(String str, int i8) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Recover recover = new Recover();
        recover.setName(com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().getBandName());
        recover.setAddress(str);
        recover.setFirmwareVersion(com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().getFirmwareVersion());
        recover.setMcu(Integer.valueOf(i8));
        return this.dao.insert(recover);
    }
}
