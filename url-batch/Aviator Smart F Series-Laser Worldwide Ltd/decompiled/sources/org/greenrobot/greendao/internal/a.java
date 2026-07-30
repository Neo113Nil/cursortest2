package org.greenrobot.greendao.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.f;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* loaded from: classes5.dex */
public final class a implements Cloneable {
    public final String[] allColumns;
    public final org.greenrobot.greendao.database.a db;
    private o7.a identityScope;
    public final boolean keyIsNumeric;
    public final String[] nonPkColumns;
    public final String[] pkColumns;
    public final f pkProperty;
    public final f[] properties;
    public final e statements;
    public final String tablename;

    public a(org.greenrobot.greendao.database.a aVar, Class<? extends org.greenrobot.greendao.a> cls) {
        this.db = aVar;
        try {
            this.tablename = (String) cls.getField("TABLENAME").get(null);
            f[] reflectProperties = reflectProperties(cls);
            this.properties = reflectProperties;
            this.allColumns = new String[reflectProperties.length];
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f fVar = null;
            for (int i8 = 0; i8 < reflectProperties.length; i8++) {
                f fVar2 = reflectProperties[i8];
                String str = fVar2.columnName;
                this.allColumns[i8] = str;
                if (fVar2.primaryKey) {
                    arrayList.add(str);
                    fVar = fVar2;
                } else {
                    arrayList2.add(str);
                }
            }
            this.nonPkColumns = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            this.pkColumns = strArr;
            f fVar3 = strArr.length == 1 ? fVar : null;
            this.pkProperty = fVar3;
            this.statements = new e(aVar, this.tablename, this.allColumns, strArr);
            if (fVar3 == null) {
                this.keyIsNumeric = false;
            } else {
                Class<?> cls2 = fVar3.type;
                this.keyIsNumeric = cls2.equals(Long.TYPE) || cls2.equals(Long.class) || cls2.equals(Integer.TYPE) || cls2.equals(Integer.class) || cls2.equals(Short.TYPE) || cls2.equals(Short.class) || cls2.equals(Byte.TYPE) || cls2.equals(Byte.class);
            }
        } catch (Exception e8) {
            throw new DaoException("Could not init DAOConfig", e8);
        }
    }

    private static f[] reflectProperties(Class<? extends org.greenrobot.greendao.a> cls) {
        Field[] declaredFields = Class.forName(cls.getName() + "$Properties").getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 9) == 9) {
                Object obj = field.get(null);
                if (obj instanceof f) {
                    arrayList.add((f) obj);
                }
            }
        }
        f[] fVarArr = new f[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            int i8 = fVar.ordinal;
            if (fVarArr[i8] != null) {
                throw new DaoException("Duplicate property ordinals");
            }
            fVarArr[i8] = fVar;
        }
        return fVarArr;
    }

    public void clearIdentityScope() {
        o7.a aVar = this.identityScope;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public o7.a getIdentityScope() {
        return this.identityScope;
    }

    public void initIdentityScope(IdentityScopeType identityScopeType) {
        if (identityScopeType == IdentityScopeType.None) {
            this.identityScope = null;
            return;
        }
        if (identityScopeType != IdentityScopeType.Session) {
            throw new IllegalArgumentException("Unsupported type: " + identityScopeType);
        }
        if (this.keyIsNumeric) {
            this.identityScope = new o7.b();
        } else {
            this.identityScope = new o7.c();
        }
    }

    public void setIdentityScope(o7.a aVar) {
        this.identityScope = aVar;
    }

    public a clone() {
        return new a(this);
    }

    public a(a aVar) {
        this.db = aVar.db;
        this.tablename = aVar.tablename;
        this.properties = aVar.properties;
        this.allColumns = aVar.allColumns;
        this.pkColumns = aVar.pkColumns;
        this.nonPkColumns = aVar.nonPkColumns;
        this.pkProperty = aVar.pkProperty;
        this.statements = aVar.statements;
        this.keyIsNumeric = aVar.keyIsNumeric;
    }
}
