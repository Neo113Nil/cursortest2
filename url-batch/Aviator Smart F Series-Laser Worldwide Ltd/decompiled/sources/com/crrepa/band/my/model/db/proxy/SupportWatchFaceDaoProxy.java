package com.crrepa.band.my.model.db.proxy;

import android.text.TextUtils;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.SupportWatchFace;
import com.crrepa.band.my.model.db.greendao.SupportWatchFaceDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class SupportWatchFaceDaoProxy {
    private SupportWatchFaceDao dao = c.getInstance().getDaoSession().getSupportWatchFaceDao();

    public void delete(SupportWatchFace supportWatchFace) {
        if (supportWatchFace == null) {
            return;
        }
        this.dao.delete(supportWatchFace);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public SupportWatchFace get(String str) {
        List<Object> list;
        if (TextUtils.isEmpty(str) || (list = this.dao.queryBuilder().where(SupportWatchFaceDao.Properties.BroadcastName.eq(str), new m[0]).build().list()) == null || list.size() <= 0) {
            return null;
        }
        return (SupportWatchFace) list.get(0);
    }

    public void save(SupportWatchFace supportWatchFace) {
        this.dao.save(supportWatchFace);
    }
}
