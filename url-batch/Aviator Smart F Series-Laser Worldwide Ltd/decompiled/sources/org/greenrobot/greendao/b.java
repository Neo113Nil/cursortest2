package org.greenrobot.greendao;

import java.util.HashMap;
import java.util.Map;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* loaded from: classes5.dex */
public abstract class b {
    protected final Map<Class<? extends a>, org.greenrobot.greendao.internal.a> daoConfigMap = new HashMap();
    protected final org.greenrobot.greendao.database.a db;
    protected final int schemaVersion;

    public b(org.greenrobot.greendao.database.a aVar, int i8) {
        this.db = aVar;
        this.schemaVersion = i8;
    }

    public org.greenrobot.greendao.database.a getDatabase() {
        return this.db;
    }

    public int getSchemaVersion() {
        return this.schemaVersion;
    }

    public abstract c newSession();

    public abstract c newSession(IdentityScopeType identityScopeType);

    protected void registerDaoClass(Class<? extends a> cls) {
        this.daoConfigMap.put(cls, new org.greenrobot.greendao.internal.a(this.db, cls));
    }
}
