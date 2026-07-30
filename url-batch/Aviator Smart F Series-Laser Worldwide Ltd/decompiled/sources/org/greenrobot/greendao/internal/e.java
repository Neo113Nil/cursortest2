package org.greenrobot.greendao.internal;

import androidx.exifinterface.media.ExifInterface;

/* loaded from: classes5.dex */
public class e {
    private final String[] allColumns;
    private org.greenrobot.greendao.database.c countStatement;
    private final org.greenrobot.greendao.database.a db;
    private org.greenrobot.greendao.database.c deleteStatement;
    private org.greenrobot.greendao.database.c insertOrReplaceStatement;
    private org.greenrobot.greendao.database.c insertStatement;
    private final String[] pkColumns;
    private volatile String selectAll;
    private volatile String selectByKey;
    private volatile String selectByRowId;
    private volatile String selectKeys;
    private final String tablename;
    private org.greenrobot.greendao.database.c updateStatement;

    public e(org.greenrobot.greendao.database.a aVar, String str, String[] strArr, String[] strArr2) {
        this.db = aVar;
        this.tablename = str;
        this.allColumns = strArr;
        this.pkColumns = strArr2;
    }

    public org.greenrobot.greendao.database.c getCountStatement() {
        if (this.countStatement == null) {
            this.countStatement = this.db.compileStatement(d.createSqlCount(this.tablename));
        }
        return this.countStatement;
    }

    public org.greenrobot.greendao.database.c getDeleteStatement() {
        if (this.deleteStatement == null) {
            org.greenrobot.greendao.database.c compileStatement = this.db.compileStatement(d.createSqlDelete(this.tablename, this.pkColumns));
            synchronized (this) {
                try {
                    if (this.deleteStatement == null) {
                        this.deleteStatement = compileStatement;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.deleteStatement != compileStatement) {
                compileStatement.close();
            }
        }
        return this.deleteStatement;
    }

    public org.greenrobot.greendao.database.c getInsertOrReplaceStatement() {
        if (this.insertOrReplaceStatement == null) {
            org.greenrobot.greendao.database.c compileStatement = this.db.compileStatement(d.createSqlInsert("INSERT OR REPLACE INTO ", this.tablename, this.allColumns));
            synchronized (this) {
                try {
                    if (this.insertOrReplaceStatement == null) {
                        this.insertOrReplaceStatement = compileStatement;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.insertOrReplaceStatement != compileStatement) {
                compileStatement.close();
            }
        }
        return this.insertOrReplaceStatement;
    }

    public org.greenrobot.greendao.database.c getInsertStatement() {
        if (this.insertStatement == null) {
            org.greenrobot.greendao.database.c compileStatement = this.db.compileStatement(d.createSqlInsert("INSERT INTO ", this.tablename, this.allColumns));
            synchronized (this) {
                try {
                    if (this.insertStatement == null) {
                        this.insertStatement = compileStatement;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.insertStatement != compileStatement) {
                compileStatement.close();
            }
        }
        return this.insertStatement;
    }

    public String getSelectAll() {
        if (this.selectAll == null) {
            this.selectAll = d.createSqlSelect(this.tablename, ExifInterface.GPS_DIRECTION_TRUE, this.allColumns, false);
        }
        return this.selectAll;
    }

    public String getSelectByKey() {
        if (this.selectByKey == null) {
            StringBuilder sb = new StringBuilder(getSelectAll());
            sb.append("WHERE ");
            d.appendColumnsEqValue(sb, ExifInterface.GPS_DIRECTION_TRUE, this.pkColumns);
            this.selectByKey = sb.toString();
        }
        return this.selectByKey;
    }

    public String getSelectByRowId() {
        if (this.selectByRowId == null) {
            this.selectByRowId = getSelectAll() + "WHERE ROWID=?";
        }
        return this.selectByRowId;
    }

    public String getSelectKeys() {
        if (this.selectKeys == null) {
            this.selectKeys = d.createSqlSelect(this.tablename, ExifInterface.GPS_DIRECTION_TRUE, this.pkColumns, false);
        }
        return this.selectKeys;
    }

    public org.greenrobot.greendao.database.c getUpdateStatement() {
        if (this.updateStatement == null) {
            org.greenrobot.greendao.database.c compileStatement = this.db.compileStatement(d.createSqlUpdate(this.tablename, this.allColumns, this.pkColumns));
            synchronized (this) {
                try {
                    if (this.updateStatement == null) {
                        this.updateStatement = compileStatement;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.updateStatement != compileStatement) {
                compileStatement.close();
            }
        }
        return this.updateStatement;
    }
}
