package com.crrepa.band.my.device.ai.chat.model;

import android.database.Cursor;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.device.ai.chat.delegate.child.d;
import com.crrepa.band.my.model.db.greendao.AIChatRecordEntityDao;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.database.a;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class AIChatRecordProxy {
    private static final String TABLE_NAME = "AICHAT_RECORD_ENTITY";
    private final AIChatRecordEntityDao dao = c.getInstance().getDaoSession().getAIChatRecordEntityDao();

    private long getCountByMsgType(a aVar, String str) {
        String[] strArr;
        String str2;
        if (x0.isEmpty(str)) {
            str2 = "SELECT COUNT(*) FROM AICHAT_RECORD_ENTITY";
            strArr = null;
        } else {
            strArr = new String[]{str};
            str2 = "SELECT COUNT(*) FROM AICHAT_RECORD_ENTITY WHERE MSG_TYPE = ?";
        }
        Cursor rawQuery = aVar.rawQuery(str2, strArr);
        long j8 = rawQuery.moveToFirst() ? rawQuery.getLong(0) : 0L;
        rawQuery.close();
        return j8;
    }

    private void resetAutoIncrement(a aVar) {
        aVar.execSQL("DELETE FROM sqlite_sequence WHERE name = 'AICHAT_RECORD_ENTITY'");
    }

    public void delete(AIChatRecordEntity aIChatRecordEntity) {
        this.dao.delete(aIChatRecordEntity);
    }

    public void deleteAll() {
        this.dao.deleteAll();
        resetAutoIncrement(this.dao.getDatabase());
    }

    public void deleteAllByMsgType(String str) {
        if (x0.isEmpty(str)) {
            return;
        }
        Iterator<AIChatRecordEntity> it = queryAllByMsgType(str).iterator();
        while (it.hasNext()) {
            delete(it.next());
        }
    }

    public List<AIChatRecordEntity> queryAll() {
        List<AIChatRecordEntity> list = this.dao.queryBuilder().orderAsc(AIChatRecordEntityDao.Properties.TimeMillis).build().list();
        for (AIChatRecordEntity aIChatRecordEntity : list) {
            aIChatRecordEntity.setIsResponseEnded(true);
            aIChatRecordEntity.setIsTtsPlaying(false);
        }
        return list;
    }

    public List<AIChatRecordEntity> queryAllByMsgType(String str) {
        if (x0.isEmpty(str)) {
            return queryAll();
        }
        List<AIChatRecordEntity> list = this.dao.queryBuilder().where(AIChatRecordEntityDao.Properties.MsgType.eq(str), new m[0]).orderAsc(AIChatRecordEntityDao.Properties.TimeMillis).build().list();
        for (AIChatRecordEntity aIChatRecordEntity : list) {
            aIChatRecordEntity.setIsResponseEnded(true);
            aIChatRecordEntity.setIsTtsPlaying(false);
        }
        return list;
    }

    public void save(AIChatRecordEntity aIChatRecordEntity) {
        aIChatRecordEntity.setTimeMillis(System.currentTimeMillis());
        this.dao.insert(aIChatRecordEntity);
        a database = this.dao.getDatabase();
        if (getCountByMsgType(database, aIChatRecordEntity.getMsgType()) > 100) {
            database.execSQL("DELETE FROM AICHAT_RECORD_ENTITY WHERE _id IN (SELECT _id FROM AICHAT_RECORD_ENTITY WHERE MSG_TYPE = ? ORDER BY TIME_MILLIS ASC LIMIT 1)", new String[]{aIChatRecordEntity.getMsgType()});
        }
    }

    public void update(AIChatRecordEntity aIChatRecordEntity) {
        if (((AIChatRecordEntity) this.dao.queryBuilder().where(AIChatRecordEntityDao.Properties.Id.eq(aIChatRecordEntity.getId()), new m[0]).unique()) == null) {
            return;
        }
        this.dao.update(aIChatRecordEntity);
    }

    public void updateAllToDefaultLargeModel() {
        for (AIChatRecordEntity aIChatRecordEntity : queryAll()) {
            if (aIChatRecordEntity.getMsgType() == null) {
                aIChatRecordEntity.setMsgType(d.DEFAULT_LARGE_MODEL_TYPE);
                update(aIChatRecordEntity);
            }
        }
    }
}
