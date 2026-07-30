package com.crrepa.band.my.model.db.proxy;

import android.text.TextUtils;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.QuickContartConfig;
import com.crrepa.band.my.model.db.greendao.QuickContartConfigDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class QuickContartConfigDaoProxy {
    private QuickContartConfigDao dao = c.getInstance().getDaoSession().getQuickContartConfigDao();

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public QuickContartConfig get(String str) {
        List<Object> list;
        if (TextUtils.isEmpty(str) || (list = this.dao.queryBuilder().where(QuickContartConfigDao.Properties.Name.eq(str), new m[0]).list()) == null || list.isEmpty()) {
            return null;
        }
        return (QuickContartConfig) list.get(0);
    }

    public int getMaxNameLength() {
        QuickContartConfig quickContartConfig = get(com.crrepa.band.my.ble.band.utils.a.getInstance().getName());
        if (quickContartConfig == null) {
            return 0;
        }
        return quickContartConfig.getMaxNameLength().intValue();
    }

    public long insert(QuickContartConfig quickContartConfig) {
        if (quickContartConfig == null) {
            return -1L;
        }
        QuickContartConfig quickContartConfig2 = get(quickContartConfig.getName());
        if (quickContartConfig2 == null) {
            return this.dao.insert(quickContartConfig);
        }
        Long id = quickContartConfig2.getId();
        quickContartConfig.setId(id);
        this.dao.update(quickContartConfig);
        return id.longValue();
    }
}
