package org.greenrobot.greendao.query;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.query.m;

/* loaded from: classes5.dex */
class l {
    private final org.greenrobot.greendao.a dao;
    private final String tablePrefix;
    private final List<m> whereConditions = new ArrayList();

    l(org.greenrobot.greendao.a aVar, String str) {
        this.dao = aVar;
        this.tablePrefix = str;
    }

    void add(m mVar, m... mVarArr) {
        checkCondition(mVar);
        this.whereConditions.add(mVar);
        for (m mVar2 : mVarArr) {
            checkCondition(mVar2);
            this.whereConditions.add(mVar2);
        }
    }

    void addCondition(StringBuilder sb, List<Object> list, m mVar) {
        checkCondition(mVar);
        mVar.appendTo(sb, this.tablePrefix);
        mVar.appendValuesTo(list);
    }

    void appendWhereClause(StringBuilder sb, String str, List<Object> list) {
        ListIterator<m> listIterator = this.whereConditions.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            m next = listIterator.next();
            next.appendTo(sb, str);
            next.appendValuesTo(list);
        }
    }

    void checkCondition(m mVar) {
        if (mVar instanceof m.b) {
            checkProperty(((m.b) mVar).property);
        }
    }

    void checkProperty(org.greenrobot.greendao.f fVar) {
        org.greenrobot.greendao.a aVar = this.dao;
        if (aVar != null) {
            for (org.greenrobot.greendao.f fVar2 : aVar.getProperties()) {
                if (fVar == fVar2) {
                    return;
                }
            }
            throw new DaoException("Property '" + fVar.name + "' is not part of " + this.dao);
        }
    }

    m combineWhereConditions(String str, m mVar, m mVar2, m... mVarArr) {
        StringBuilder sb = new StringBuilder("(");
        ArrayList arrayList = new ArrayList();
        addCondition(sb, arrayList, mVar);
        sb.append(str);
        addCondition(sb, arrayList, mVar2);
        for (m mVar3 : mVarArr) {
            sb.append(str);
            addCondition(sb, arrayList, mVar3);
        }
        sb.append(')');
        return new m.c(sb.toString(), arrayList.toArray());
    }

    boolean isEmpty() {
        return this.whereConditions.isEmpty();
    }
}
