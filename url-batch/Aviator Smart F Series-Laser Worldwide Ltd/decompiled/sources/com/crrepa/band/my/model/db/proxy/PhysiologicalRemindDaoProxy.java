package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.PhysiologicalRemind;
import com.crrepa.band.my.model.db.greendao.PhysiologicalRemindDao;
import java.util.List;

/* loaded from: classes2.dex */
public class PhysiologicalRemindDaoProxy {
    private static final long DEFAULT_ID = 0;
    public static final int DEFAULT_TIME_HOUR = 10;
    public static final int DEFAULT_TIME_MINUTE = 0;
    private PhysiologicalRemindDao dao = c.getInstance().getDaoSession().getPhysiologicalRemindDao();

    private PhysiologicalRemind getDefaultPhysiologicalRemind() {
        PhysiologicalRemind physiologicalRemind = new PhysiologicalRemind();
        physiologicalRemind.setId(0L);
        physiologicalRemind.setHour(10);
        physiologicalRemind.setMinute(0);
        return physiologicalRemind;
    }

    public static boolean isEnable(PhysiologicalRemind physiologicalRemind) {
        return physiologicalRemind.getEnable() == null || physiologicalRemind.getEnable().booleanValue();
    }

    public PhysiologicalRemind getPhysiologicalRemind() {
        List<Object> list = this.dao.queryBuilder().orderAsc(PhysiologicalRemindDao.Properties.Id).limit(1).list();
        if (list != null && !list.isEmpty()) {
            return (PhysiologicalRemind) list.get(0);
        }
        PhysiologicalRemind defaultPhysiologicalRemind = getDefaultPhysiologicalRemind();
        this.dao.insert(defaultPhysiologicalRemind);
        return defaultPhysiologicalRemind;
    }

    public void update(PhysiologicalRemind physiologicalRemind) {
        this.dao.insertOrReplace(physiologicalRemind);
    }
}
