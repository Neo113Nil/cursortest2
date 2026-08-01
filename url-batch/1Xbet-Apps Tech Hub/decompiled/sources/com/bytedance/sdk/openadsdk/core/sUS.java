package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DBHelper.java */
/* loaded from: classes2.dex */
public class sUS {
    private static final Object vG = new Object();
    private Context icD;
    private vG pvs;

    sUS(Context context) {
        try {
            this.icD = context == null ? mnm.pvs() : context.getApplicationContext();
            if (this.pvs == null) {
                this.pvs = new vG();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context vG() {
        Context context = this.icD;
        return context == null ? mnm.pvs() : context;
    }

    /* compiled from: DBHelper.java */
    public class vG {
        private SQLiteDatabase icD = null;

        public vG() {
        }

        private synchronized void NB() {
            try {
                synchronized (sUS.vG) {
                    SQLiteDatabase sQLiteDatabase = this.icD;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        sUS sus = sUS.this;
                        SQLiteDatabase writableDatabase = sus.new pvs(sus.vG()).getWritableDatabase();
                        this.icD = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("DBHelper", th.getMessage());
                if (sUS()) {
                    throw th;
                }
            }
        }

        public SQLiteDatabase pvs() {
            NB();
            return this.icD;
        }

        public synchronized void pvs(String str) throws SQLException {
            try {
                NB();
                this.icD.execSQL(str);
            } catch (Throwable th) {
                if (sUS()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor pvs(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                NB();
                cursor = this.icD.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("DBHelper", th.getMessage());
                icD icd = new icD();
                if (sUS()) {
                    throw th;
                }
                cursor = icd;
            }
            return cursor;
        }

        public synchronized int pvs(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                NB();
                i = this.icD.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("DBHelper", e.getMessage());
                if (sUS()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        public synchronized long pvs(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                NB();
                j = this.icD.replace(str, str2, contentValues);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("DBHelper", e.getMessage());
                if (sUS()) {
                    throw e;
                }
                j = -1;
            }
            return j;
        }

        public synchronized int pvs(String str, String str2, String[] strArr) {
            int i;
            try {
                NB();
                i = this.icD.delete(str, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.Ju.pvs("DBHelper", e.getMessage());
                if (sUS()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        public synchronized void icD() {
            NB();
            SQLiteDatabase sQLiteDatabase = this.icD;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void vG() {
            NB();
            SQLiteDatabase sQLiteDatabase = this.icD;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void Jd() {
            NB();
            SQLiteDatabase sQLiteDatabase = this.icD;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        private synchronized boolean sUS() {
            SQLiteDatabase sQLiteDatabase = this.icD;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: DBHelper.java */
    private class pvs extends SQLiteOpenHelper {
        final Context pvs;

        public pvs(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.pvs = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                pvs(sQLiteDatabase, this.pvs);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("DBHelper", th.getMessage());
            }
        }

        private void pvs(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.Jd.pvs());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.Mxy.vG());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.IP.pvs());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.Ju.pvs());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mnm.icD.pvs());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.mnm.vG());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.pvs.icD.icD.vG());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ugen.pvs.vG.vG());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.bNS.pvs());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    vG(sQLiteDatabase);
                    pvs(sQLiteDatabase, sUS.this.icD);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.icD(th.getMessage());
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    vG(sQLiteDatabase);
                } catch (Throwable unused) {
                }
            }
            pvs(sQLiteDatabase, sUS.this.icD);
            switch (i) {
                case 1:
                    pvs(sQLiteDatabase);
                    break;
                case 2:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                    pvs(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.IP.pvs());
                    pvs(sQLiteDatabase);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.pvs.icD.icD.vG());
                    pvs(sQLiteDatabase);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.Ju.pvs());
                    pvs(sQLiteDatabase);
                    break;
                case 6:
                    pvs(sQLiteDatabase);
                    break;
            }
            if (i < 11) {
                try {
                    icD(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.mnm.icD.pvs(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.Ju.pvs("DBHelper", th.getMessage());
                }
            }
        }

        private void pvs(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.Jd.icD());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.Mxy.Jd());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.IP.icD());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.icD.Ju.icD());
        }

        private void icD(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ugen.pvs.vG.Jd());
        }

        private void vG(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> Jd = Jd(sQLiteDatabase);
            if (Jd == null || Jd.size() <= 0) {
                return;
            }
            Iterator<String> it = Jd.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        
            if (r1 != null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        
            r1.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0037, code lost:
        
            if (r1 != null) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ArrayList<String> Jd(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public vG pvs() {
        return this.pvs;
    }

    /* compiled from: DBHelper.java */
    private class icD extends AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }

        private icD() {
        }
    }
}
