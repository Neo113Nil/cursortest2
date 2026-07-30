package com.crrepa.band.my.model.db.proxy;

import android.text.TextUtils;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.ECardConfig;
import com.crrepa.band.my.model.db.greendao.ECardConfigDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class ECardConfigDaoProxy {
    private ECardConfigDao dao = c.getInstance().getDaoSession().getECardConfigDao();

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public ECardConfig get(String str) {
        List<Object> list;
        if (TextUtils.isEmpty(str) || (list = this.dao.queryBuilder().where(ECardConfigDao.Properties.Name.eq(str), new m[0]).list()) == null || list.isEmpty()) {
            return null;
        }
        return (ECardConfig) list.get(0);
    }

    public long insert(ECardConfig eCardConfig) {
        return this.dao.insertOrReplace(eCardConfig);
    }
}
