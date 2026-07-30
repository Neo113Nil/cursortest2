package com.crrepa.band.my.model.db.proxy;

import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.Contact;
import com.crrepa.band.my.model.db.greendao.ContactDao;
import java.util.List;
import org.greenrobot.greendao.query.m;

/* loaded from: classes2.dex */
public class ContactDaoProxy {
    private ContactDao dao = c.getInstance().getDaoSession().getContactDao();

    public void delete(String str) {
        List<Object> list = this.dao.queryBuilder().where(ContactDao.Properties.Number.eq(str), new m[0]).list();
        if (list == null || list.isEmpty()) {
            return;
        }
        this.dao.deleteInTx(list);
    }

    public void deleteAll() {
        this.dao.deleteAll();
    }

    public Contact get(String str) {
        List<Object> list = this.dao.queryBuilder().where(ContactDao.Properties.Number.eq(str), new m[0]).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Contact) list.get(0);
    }

    public List<Contact> getAll() {
        return this.dao.queryBuilder().orderAsc(ContactDao.Properties.Id).list();
    }

    public long insert(Contact contact) {
        return this.dao.insertOrReplace(contact);
    }
}
