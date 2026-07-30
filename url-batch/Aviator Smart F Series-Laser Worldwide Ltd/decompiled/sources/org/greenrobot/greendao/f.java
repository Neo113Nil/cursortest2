package org.greenrobot.greendao;

import java.util.Collection;
import org.greenrobot.greendao.query.m;

/* loaded from: classes5.dex */
public class f {
    public final String columnName;
    public final String name;
    public final int ordinal;
    public final boolean primaryKey;
    public final Class<?> type;

    public f(int i8, Class<?> cls, String str, boolean z7, String str2) {
        this.ordinal = i8;
        this.type = cls;
        this.name = str;
        this.primaryKey = z7;
        this.columnName = str2;
    }

    public m between(Object obj, Object obj2) {
        return new m.b(this, " BETWEEN ? AND ?", new Object[]{obj, obj2});
    }

    public m eq(Object obj) {
        return new m.b(this, "=?", obj);
    }

    public m ge(Object obj) {
        return new m.b(this, ">=?", obj);
    }

    public m gt(Object obj) {
        return new m.b(this, ">?", obj);
    }

    public m in(Object... objArr) {
        StringBuilder sb = new StringBuilder(" IN (");
        org.greenrobot.greendao.internal.d.appendPlaceholders(sb, objArr.length).append(')');
        return new m.b(this, sb.toString(), objArr);
    }

    public m isNotNull() {
        return new m.b(this, " IS NOT NULL");
    }

    public m isNull() {
        return new m.b(this, " IS NULL");
    }

    public m le(Object obj) {
        return new m.b(this, "<=?", obj);
    }

    public m like(String str) {
        return new m.b(this, " LIKE ?", str);
    }

    public m lt(Object obj) {
        return new m.b(this, "<?", obj);
    }

    public m notEq(Object obj) {
        return new m.b(this, "<>?", obj);
    }

    public m notIn(Object... objArr) {
        StringBuilder sb = new StringBuilder(" NOT IN (");
        org.greenrobot.greendao.internal.d.appendPlaceholders(sb, objArr.length).append(')');
        return new m.b(this, sb.toString(), objArr);
    }

    public m in(Collection<?> collection) {
        return in(collection.toArray());
    }

    public m notIn(Collection<?> collection) {
        return notIn(collection.toArray());
    }
}
