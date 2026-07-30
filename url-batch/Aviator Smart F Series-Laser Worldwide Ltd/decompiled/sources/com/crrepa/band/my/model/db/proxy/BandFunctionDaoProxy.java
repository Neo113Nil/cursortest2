package com.crrepa.band.my.model.db.proxy;

import android.text.TextUtils;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.BandFunction;
import com.crrepa.band.my.model.db.greendao.BandFunctionDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class BandFunctionDaoProxy {
    private BandFunctionDao dao = c.getInstance().getDaoSession().getBandFunctionDao();

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public BandFunction get(String str) {
        List<Object> list;
        if (TextUtils.isEmpty(str) || (list = this.dao.queryBuilder().where(BandFunctionDao.Properties.Name.eq(str), new m[0]).limit(1).list()) == null || list.isEmpty()) {
            return null;
        }
        return (BandFunction) list.get(0);
    }

    public long save(BandFunction bandFunction) {
        return this.dao.insertOrReplace(bandFunction);
    }
}
