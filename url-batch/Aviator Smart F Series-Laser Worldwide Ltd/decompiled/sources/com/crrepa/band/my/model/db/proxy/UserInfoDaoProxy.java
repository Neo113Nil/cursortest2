package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.UserInfo;
import com.crrepa.band.my.model.db.greendao.UserInfoDao;
import java.util.List;

/* loaded from: classes2.dex */
public class UserInfoDaoProxy {
    private UserInfoDao dao = c.getInstance().getDaoSession().getUserInfoDao();

    public UserInfo get() {
        List<Object> list = this.dao.queryBuilder().orderAsc(UserInfoDao.Properties.Id).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (UserInfo) list.get(0);
    }

    public void save(UserInfo userInfo) {
        this.dao.save(userInfo);
    }
}
