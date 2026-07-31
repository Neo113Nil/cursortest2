package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public class nps {
    private static final Object zn = new Object();
    private Context fs;
    private zn zmn;

    nps(Context context) {
        try {
            this.fs = context == null ? kgc.zmn() : context.getApplicationContext();
            if (this.zmn == null) {
                this.zmn = new zn();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context zn() {
        Context context = this.fs;
        return context == null ? kgc.zmn() : context;
    }

    public class zn {
        private SQLiteDatabase fs = null;

        public zn() {
        }

        private synchronized void fs() {
            zmn zmnVar;
            try {
                synchronized (nps.zn) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.fs;
                        if (sQLiteDatabase != null) {
                            if (!sQLiteDatabase.isOpen()) {
                            }
                        }
                        if (!com.bytedance.sdk.component.utils.phc.zmn(nps.this.zn())) {
                            nps npsVar = nps.this;
                            zmnVar = npsVar.new zmn(npsVar.zn(), "ttopensdk_" + com.bytedance.sdk.component.utils.phc.zn(nps.this.zn()) + ".db");
                        } else {
                            nps npsVar2 = nps.this;
                            zmnVar = npsVar2.new zmn(npsVar2.zn(), "ttopensdk.db");
                        }
                        SQLiteDatabase writableDatabase = zmnVar.getWritableDatabase();
                        this.fs = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("DBHelper", th.getMessage());
                if (zn()) {
                    throw th;
                }
            }
        }

        public SQLiteDatabase zmn() {
            fs();
            return this.fs;
        }

        public synchronized Cursor zmn(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                fs();
                cursor = this.fs.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("DBHelper", th.getMessage());
                fs fsVar = new fs();
                if (zn()) {
                    throw th;
                }
                cursor = fsVar;
            }
            return cursor;
        }

        public synchronized int zmn(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                fs();
                i = this.fs.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.iqz.zn("DBHelper", e.getMessage());
                if (zn()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        public synchronized long zmn(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                fs();
                j = this.fs.replace(str, str2, contentValues);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.iqz.zn("DBHelper", e.getMessage());
                if (zn()) {
                    throw e;
                }
                j = -1;
            }
            return j;
        }

        public synchronized int zmn(String str, String str2, String[] strArr) {
            int i;
            try {
                fs();
                i = this.fs.delete(str, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.iqz.zn("DBHelper", e.getMessage());
                if (zn()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        private synchronized boolean zn() {
            SQLiteDatabase sQLiteDatabase = this.fs;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }
    }

    private class zmn extends SQLiteOpenHelper {
        final Context zmn;

        public zmn(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 11);
            this.zmn = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                zmn(sQLiteDatabase, this.zmn);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("DBHelper", th.getMessage());
            }
        }

        private void zmn(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.fb.zmn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.rc.zn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.cyb.zmn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.cn.zmn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.bjh.fs.zmn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.kgc.zn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.zmn.fs.fs.zn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.mw.zmn.zn.zn());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.olo.zmn());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    zn(sQLiteDatabase);
                    zmn(sQLiteDatabase, nps.this.fs);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.iqz.zn(th.getMessage(), new Object[0]);
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    zn(sQLiteDatabase);
                } catch (Throwable unused) {
                }
            }
            zmn(sQLiteDatabase, nps.this.fs);
            switch (i) {
                case 1:
                    zmn(sQLiteDatabase);
                    break;
                case 2:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                    zmn(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.cyb.zmn());
                    zmn(sQLiteDatabase);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.zmn.fs.fs.zn());
                    zmn(sQLiteDatabase);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.cn.zmn());
                    zmn(sQLiteDatabase);
                    break;
                case 6:
                    zmn(sQLiteDatabase);
                    break;
            }
            if (i < 11) {
                try {
                    fs(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.bjh.fs.zmn(sQLiteDatabase);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.iqz.zn("DBHelper", th.getMessage());
                }
            }
        }

        private void zmn(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.fb.fs());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.rc.fb());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.cyb.fs());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.fb.cn.fs());
        }

        private void fs(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.mw.zmn.zn.fb());
        }

        private void zn(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> fb = fb(sQLiteDatabase);
            if (fb == null || fb.size() <= 0) {
                return;
            }
            Iterator<String> it = fb.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
        
            if (r1 != null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        
            r1.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
        
            if (r1 != null) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private ArrayList<String> fb(SQLiteDatabase sQLiteDatabase) {
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

    public zn zmn() {
        return this.zmn;
    }

    private class fs extends AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return 0.0d;
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

        private fs() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }
    }
}
