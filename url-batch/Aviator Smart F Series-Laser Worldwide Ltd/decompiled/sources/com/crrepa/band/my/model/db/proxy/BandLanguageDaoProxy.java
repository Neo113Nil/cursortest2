package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.BandLanguage;
import com.crrepa.band.my.model.db.greendao.BandLanguageDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class BandLanguageDaoProxy {
    private BandLanguageDao dao = c.getInstance().getDaoSession().getBandLanguageDao();

    public void delete(String str) {
        List<BandLanguage> list = get(str);
        if (list != null) {
            this.dao.deleteInTx(list);
        }
    }

    public List<BandLanguage> get(String str) {
        return this.dao.queryBuilder().where(BandLanguageDao.Properties.BandName.eq(str), new m[0]).list();
    }

    public void insert(BandLanguage bandLanguage) {
        this.dao.insertOrReplace(bandLanguage);
    }
}
