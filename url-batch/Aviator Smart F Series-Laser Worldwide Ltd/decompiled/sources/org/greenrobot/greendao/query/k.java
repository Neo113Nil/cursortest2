package org.greenrobot.greendao.query;

import android.database.sqlite.SQLiteDatabase;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ar.util.SystemInfoUtil;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.DaoException;

/* loaded from: classes5.dex */
public class k {
    public static boolean LOG_SQL;
    public static boolean LOG_VALUES;
    private final org.greenrobot.greendao.a dao;
    private boolean distinct;
    private final List<h> joins;
    private Integer limit;
    private Integer offset;
    private StringBuilder orderBuilder;
    private String stringOrderCollation;
    private final String tablePrefix;
    private final List<Object> values;
    private final l whereCollector;

    protected k(org.greenrobot.greendao.a aVar) {
        this(aVar, ExifInterface.GPS_DIRECTION_TRUE);
    }

    private <J> h addJoin(String str, org.greenrobot.greendao.f fVar, org.greenrobot.greendao.a aVar, org.greenrobot.greendao.f fVar2) {
        h hVar = new h(str, fVar, aVar, fVar2, "J" + (this.joins.size() + 1));
        this.joins.add(hVar);
        return hVar;
    }

    private void appendJoinsAndWheres(StringBuilder sb, String str) {
        this.values.clear();
        for (h hVar : this.joins) {
            sb.append(" JOIN ");
            sb.append('\"');
            sb.append(hVar.daoDestination.getTablename());
            sb.append('\"');
            sb.append(' ');
            sb.append(hVar.tablePrefix);
            sb.append(" ON ");
            org.greenrobot.greendao.internal.d.appendProperty(sb, hVar.sourceTablePrefix, hVar.joinPropertySource).append('=');
            org.greenrobot.greendao.internal.d.appendProperty(sb, hVar.tablePrefix, hVar.joinPropertyDestination);
        }
        boolean z7 = !this.whereCollector.isEmpty();
        if (z7) {
            sb.append(" WHERE ");
            this.whereCollector.appendWhereClause(sb, str, this.values);
        }
        for (h hVar2 : this.joins) {
            if (!hVar2.whereCollector.isEmpty()) {
                if (z7) {
                    sb.append(" AND ");
                } else {
                    sb.append(" WHERE ");
                    z7 = true;
                }
                hVar2.whereCollector.appendWhereClause(sb, hVar2.tablePrefix, this.values);
            }
        }
    }

    private int checkAddLimit(StringBuilder sb) {
        if (this.limit == null) {
            return -1;
        }
        sb.append(" LIMIT ?");
        this.values.add(this.limit);
        return this.values.size() - 1;
    }

    private int checkAddOffset(StringBuilder sb) {
        if (this.offset == null) {
            return -1;
        }
        if (this.limit == null) {
            throw new IllegalStateException("Offset cannot be set without limit");
        }
        sb.append(" OFFSET ?");
        this.values.add(this.offset);
        return this.values.size() - 1;
    }

    private void checkLog(String str) {
        if (LOG_SQL) {
            org.greenrobot.greendao.d.d("Built SQL for query: " + str);
        }
        if (LOG_VALUES) {
            org.greenrobot.greendao.d.d("Values for query: " + this.values);
        }
    }

    private void checkOrderBuilder() {
        StringBuilder sb = this.orderBuilder;
        if (sb == null) {
            this.orderBuilder = new StringBuilder();
        } else if (sb.length() > 0) {
            this.orderBuilder.append(SystemInfoUtil.COMMA);
        }
    }

    private StringBuilder createSelectBuilder() {
        StringBuilder sb = new StringBuilder(org.greenrobot.greendao.internal.d.createSqlSelect(this.dao.getTablename(), this.tablePrefix, this.dao.getAllColumns(), this.distinct));
        appendJoinsAndWheres(sb, this.tablePrefix);
        StringBuilder sb2 = this.orderBuilder;
        if (sb2 != null && sb2.length() > 0) {
            sb.append(" ORDER BY ");
            sb.append((CharSequence) this.orderBuilder);
        }
        return sb;
    }

    public static <T2> k internalCreate(org.greenrobot.greendao.a aVar) {
        return new k(aVar);
    }

    private void orderAscOrDesc(String str, org.greenrobot.greendao.f... fVarArr) {
        String str2;
        for (org.greenrobot.greendao.f fVar : fVarArr) {
            checkOrderBuilder();
            append(this.orderBuilder, fVar);
            if (String.class.equals(fVar.type) && (str2 = this.stringOrderCollation) != null) {
                this.orderBuilder.append(str2);
            }
            this.orderBuilder.append(str);
        }
    }

    public m and(m mVar, m mVar2, m... mVarArr) {
        return this.whereCollector.combineWhereConditions(" AND ", mVar, mVar2, mVarArr);
    }

    protected StringBuilder append(StringBuilder sb, org.greenrobot.greendao.f fVar) {
        this.whereCollector.checkProperty(fVar);
        sb.append(this.tablePrefix);
        sb.append('.');
        sb.append('\'');
        sb.append(fVar.columnName);
        sb.append('\'');
        return sb;
    }

    public j build() {
        StringBuilder createSelectBuilder = createSelectBuilder();
        int checkAddLimit = checkAddLimit(createSelectBuilder);
        int checkAddOffset = checkAddOffset(createSelectBuilder);
        String sb = createSelectBuilder.toString();
        checkLog(sb);
        return j.create(this.dao, sb, this.values.toArray(), checkAddLimit, checkAddOffset);
    }

    public e buildCount() {
        StringBuilder sb = new StringBuilder(org.greenrobot.greendao.internal.d.createSqlSelectCountStar(this.dao.getTablename(), this.tablePrefix));
        appendJoinsAndWheres(sb, this.tablePrefix);
        String sb2 = sb.toString();
        checkLog(sb2);
        return e.create(this.dao, sb2, this.values.toArray());
    }

    public f buildCursor() {
        StringBuilder createSelectBuilder = createSelectBuilder();
        int checkAddLimit = checkAddLimit(createSelectBuilder);
        int checkAddOffset = checkAddOffset(createSelectBuilder);
        String sb = createSelectBuilder.toString();
        checkLog(sb);
        return f.create(this.dao, sb, this.values.toArray(), checkAddLimit, checkAddOffset);
    }

    public g buildDelete() {
        if (!this.joins.isEmpty()) {
            throw new DaoException("JOINs are not supported for DELETE queries");
        }
        String tablename = this.dao.getTablename();
        StringBuilder sb = new StringBuilder(org.greenrobot.greendao.internal.d.createSqlDelete(tablename, null));
        appendJoinsAndWheres(sb, this.tablePrefix);
        String replace = sb.toString().replace(this.tablePrefix + ".\"", '\"' + tablename + "\".\"");
        checkLog(replace);
        return g.create(this.dao, replace, this.values.toArray());
    }

    public long count() {
        return buildCount().count();
    }

    public k distinct() {
        this.distinct = true;
        return this;
    }

    public <J> h join(Class<J> cls, org.greenrobot.greendao.f fVar) {
        return join(this.dao.getPkProperty(), cls, fVar);
    }

    public k limit(int i8) {
        this.limit = Integer.valueOf(i8);
        return this;
    }

    public List<Object> list() {
        return build().list();
    }

    public d listIterator() {
        return build().listIterator();
    }

    public i listLazy() {
        return build().listLazy();
    }

    public i listLazyUncached() {
        return build().listLazyUncached();
    }

    public k offset(int i8) {
        this.offset = Integer.valueOf(i8);
        return this;
    }

    public m or(m mVar, m mVar2, m... mVarArr) {
        return this.whereCollector.combineWhereConditions(" OR ", mVar, mVar2, mVarArr);
    }

    public k orderAsc(org.greenrobot.greendao.f... fVarArr) {
        orderAscOrDesc(" ASC", fVarArr);
        return this;
    }

    public k orderCustom(org.greenrobot.greendao.f fVar, String str) {
        checkOrderBuilder();
        append(this.orderBuilder, fVar).append(' ');
        this.orderBuilder.append(str);
        return this;
    }

    public k orderDesc(org.greenrobot.greendao.f... fVarArr) {
        orderAscOrDesc(" DESC", fVarArr);
        return this;
    }

    public k orderRaw(String str) {
        checkOrderBuilder();
        this.orderBuilder.append(str);
        return this;
    }

    public k preferLocalizedStringOrder() {
        if (this.dao.getDatabase().getRawDatabase() instanceof SQLiteDatabase) {
            this.stringOrderCollation = " COLLATE LOCALIZED";
        }
        return this;
    }

    public org.greenrobot.greendao.rx.c rx() {
        return build().__InternalRx();
    }

    public org.greenrobot.greendao.rx.c rxPlain() {
        return build().__internalRxPlain();
    }

    public k stringOrderCollation(String str) {
        if (str != null && !str.startsWith(cn.hutool.core.text.l.SPACE)) {
            str = cn.hutool.core.text.l.SPACE + str;
        }
        this.stringOrderCollation = str;
        return this;
    }

    public Object unique() {
        return build().unique();
    }

    public Object uniqueOrThrow() {
        return build().uniqueOrThrow();
    }

    public k where(m mVar, m... mVarArr) {
        this.whereCollector.add(mVar, mVarArr);
        return this;
    }

    public k whereOr(m mVar, m mVar2, m... mVarArr) {
        this.whereCollector.add(or(mVar, mVar2, mVarArr), new m[0]);
        return this;
    }

    protected k(org.greenrobot.greendao.a aVar, String str) {
        this.dao = aVar;
        this.tablePrefix = str;
        this.values = new ArrayList();
        this.joins = new ArrayList();
        this.whereCollector = new l(aVar, str);
        this.stringOrderCollation = " COLLATE NOCASE";
    }

    public <J> h join(org.greenrobot.greendao.f fVar, Class<J> cls) {
        org.greenrobot.greendao.a dao = this.dao.getSession().getDao(cls);
        return addJoin(this.tablePrefix, fVar, dao, dao.getPkProperty());
    }

    public <J> h join(org.greenrobot.greendao.f fVar, Class<J> cls, org.greenrobot.greendao.f fVar2) {
        return addJoin(this.tablePrefix, fVar, this.dao.getSession().getDao(cls), fVar2);
    }

    public <J> h join(h hVar, org.greenrobot.greendao.f fVar, Class<J> cls, org.greenrobot.greendao.f fVar2) {
        return addJoin(hVar.tablePrefix, fVar, this.dao.getSession().getDao(cls), fVar2);
    }
}
