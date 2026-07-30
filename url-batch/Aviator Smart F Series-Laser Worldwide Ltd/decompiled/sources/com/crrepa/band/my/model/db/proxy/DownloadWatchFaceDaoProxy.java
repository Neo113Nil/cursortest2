package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.DownloadWatchFace;
import com.crrepa.band.my.model.db.greendao.DownloadWatchFaceDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class DownloadWatchFaceDaoProxy {
    private DownloadWatchFaceDao dao = c.getInstance().getDaoSession().getDownloadWatchFaceDao();

    public void delete(int... iArr) {
        if (iArr == null || iArr.length < 1) {
            return;
        }
        for (int i8 : iArr) {
            DownloadWatchFace downloadWatchFace = get(i8);
            if (downloadWatchFace != null) {
                this.dao.delete(downloadWatchFace);
            }
        }
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public DownloadWatchFace get(long j8) {
        List<Object> list = this.dao.queryBuilder().where(DownloadWatchFaceDao.Properties.WatchFaceId.eq(Long.valueOf(j8)), new m[0]).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (DownloadWatchFace) list.get(0);
    }

    public List<DownloadWatchFace> getAll() {
        return this.dao.loadAll();
    }

    public long insert(DownloadWatchFace downloadWatchFace) {
        return this.dao.insertOrReplace(downloadWatchFace);
    }
}
