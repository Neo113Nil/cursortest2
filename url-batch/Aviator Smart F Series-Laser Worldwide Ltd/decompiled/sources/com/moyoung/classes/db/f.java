package com.moyoung.classes.db;

import java.util.Map;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* loaded from: classes4.dex */
public class f extends org.greenrobot.greendao.c {
    private final ClassesHistoryDao classesHistoryDao;
    private final org.greenrobot.greendao.internal.a classesHistoryDaoConfig;

    public f(org.greenrobot.greendao.database.a aVar, IdentityScopeType identityScopeType, Map<Class<? extends org.greenrobot.greendao.a>, org.greenrobot.greendao.internal.a> map) {
        super(aVar);
        org.greenrobot.greendao.internal.a clone = map.get(ClassesHistoryDao.class).clone();
        this.classesHistoryDaoConfig = clone;
        clone.initIdentityScope(identityScopeType);
        ClassesHistoryDao classesHistoryDao = new ClassesHistoryDao(clone, this);
        this.classesHistoryDao = classesHistoryDao;
        registerDao(ClassesHistory.class, classesHistoryDao);
    }

    public void clear() {
        this.classesHistoryDaoConfig.clearIdentityScope();
    }

    public ClassesHistoryDao getClassesHistoryDao() {
        return this.classesHistoryDao;
    }
}
