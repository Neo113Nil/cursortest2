package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Language;
import com.crrepa.band.my.model.db.greendao.LanguageDao;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class LanguageDaoProxy {
    private LanguageDao dao = c.getInstance().getDaoSession().getLanguageDao();

    public List<Language> getAll() {
        return this.dao.queryBuilder().orderAsc(LanguageDao.Properties.Cmd).build().list();
    }

    public byte getLanguageCmd(String str) {
        List<Object> list = this.dao.queryBuilder().where(LanguageDao.Properties.LanguageText.eq(str), new m[0]).build().list();
        if (list == null || list.size() <= 0) {
            return (byte) 0;
        }
        return ((Language) list.get(0)).getCmd().byteValue();
    }

    public String getLanguageCode(long j8) {
        List<Object> list = this.dao.queryBuilder().where(LanguageDao.Properties.Cmd.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (x0.isEmpty((List<?>) list)) {
            return "en";
        }
        String code = ((Language) list.get(0)).getCode();
        return x0.isEmpty(code) ? "en" : code;
    }

    public String getLanguageText(long j8) {
        List<Object> list = this.dao.queryBuilder().where(LanguageDao.Properties.Cmd.eq(Long.valueOf(j8)), new m[0]).build().list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return ((Language) list.get(0)).getLanguageText();
    }

    public void insert(Language language) {
        this.dao.insertOrReplace(language);
    }
}
