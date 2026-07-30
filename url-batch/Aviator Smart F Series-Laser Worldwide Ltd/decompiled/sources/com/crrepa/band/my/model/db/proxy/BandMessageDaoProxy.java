package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.MessagePush;
import com.crrepa.band.my.model.db.greendao.MessagePushDao;

/* loaded from: classes2.dex */
public class BandMessageDaoProxy {
    private static final long DEFAULT_ID = 0;
    private MessagePushDao dao = c.getInstance().getDaoSession().getMessagePushDao();

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public MessagePush get() {
        return (MessagePush) this.dao.load(0L);
    }

    public void save(MessagePush messagePush) {
        messagePush.setId(0L);
        this.dao.insertOrReplace(messagePush);
    }
}
