package org.greenrobot.greendao.query;

/* loaded from: classes5.dex */
public class h {
    final org.greenrobot.greendao.a daoDestination;
    final org.greenrobot.greendao.f joinPropertyDestination;
    final org.greenrobot.greendao.f joinPropertySource;
    final String sourceTablePrefix;
    final String tablePrefix;
    final l whereCollector;

    public h(String str, org.greenrobot.greendao.f fVar, org.greenrobot.greendao.a aVar, org.greenrobot.greendao.f fVar2, String str2) {
        this.sourceTablePrefix = str;
        this.joinPropertySource = fVar;
        this.daoDestination = aVar;
        this.joinPropertyDestination = fVar2;
        this.tablePrefix = str2;
        this.whereCollector = new l(aVar, str2);
    }

    public m and(m mVar, m mVar2, m... mVarArr) {
        return this.whereCollector.combineWhereConditions(" AND ", mVar, mVar2, mVarArr);
    }

    public String getTablePrefix() {
        return this.tablePrefix;
    }

    public m or(m mVar, m mVar2, m... mVarArr) {
        return this.whereCollector.combineWhereConditions(" OR ", mVar, mVar2, mVarArr);
    }

    public h where(m mVar, m... mVarArr) {
        this.whereCollector.add(mVar, mVarArr);
        return this;
    }

    public h whereOr(m mVar, m mVar2, m... mVarArr) {
        this.whereCollector.add(or(mVar, mVar2, mVarArr), new m[0]);
        return this;
    }
}
