package com.crrepa.band.my.model.db.proxy;

import android.text.TextUtils;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.WatchFace;
import com.crrepa.band.my.model.db.greendao.WatchFaceDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class WatchFaceDaoProxy {
    private WatchFaceDao dao = c.getInstance().getDaoSession().getWatchFaceDao();

    public WatchFace getWatchFace(String str) {
        List<Object> list;
        if (TextUtils.isEmpty(str) || (list = this.dao.queryBuilder().where(WatchFaceDao.Properties.BroadcastName.eq(str), new m[0]).limit(1).list()) == null || list.isEmpty()) {
            return null;
        }
        return (WatchFace) list.get(0);
    }

    public long insert(WatchFace watchFace) {
        return this.dao.insertOrReplace(watchFace);
    }

    public void refresh(WatchFace watchFace) {
        this.dao.refresh(watchFace);
    }

    public void update(WatchFace watchFace) {
        this.dao.update(watchFace);
    }
}
