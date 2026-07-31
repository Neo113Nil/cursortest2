package com.bytedance.sdk.openadsdk.core.nps;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.utils.phc;
import com.bytedance.sdk.openadsdk.core.kgc;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
class zn {
    private static final Object zn = new Object();
    private Context fs;
    private C0176zn zmn;

    zn(Context context) {
        try {
            this.fs = context == null ? kgc.zmn() : context.getApplicationContext();
            if (this.zmn == null) {
                this.zmn = new C0176zn();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context zn() {
        Context context = this.fs;
        return context == null ? kgc.zmn() : context;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.nps.zn$zn, reason: collision with other inner class name */
    public class C0176zn {
        private SQLiteDatabase fs = null;

        public C0176zn() {
        }

        private synchronized void zmn() {
            zmn zmnVar;
            try {
                synchronized (zn.zn) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.fs;
                        if (sQLiteDatabase != null) {
                            if (!sQLiteDatabase.isOpen()) {
                            }
                        }
                        if (!phc.zmn(zn.this.zn())) {
                            zn znVar = zn.this;
                            zmnVar = znVar.new zmn(znVar.zn(), "pag_business_" + phc.zn(zn.this.zn()) + ".db");
                        } else {
                            zn znVar2 = zn.this;
                            zmnVar = znVar2.new zmn(znVar2.zn(), "pag_business.db");
                        }
                        SQLiteDatabase writableDatabase = zmnVar.getWritableDatabase();
                        this.fs = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
                if (fs()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor zmn(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursor;
            try {
                zmn();
                cursor = this.fs.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                th.getMessage();
                fs fsVar = new fs();
                if (fs()) {
                    throw th;
                }
                cursor = fsVar;
            }
            return cursor;
        }

        public synchronized int zmn(String str, ContentValues contentValues, String str2, String[] strArr) {
            int i;
            try {
                zmn();
                i = this.fs.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                e.getMessage();
                if (fs()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        public synchronized long zmn(String str, String str2, ContentValues contentValues) {
            long j;
            try {
                zmn();
                j = this.fs.replace(str, str2, contentValues);
            } catch (Exception e) {
                e.getMessage();
                if (fs()) {
                    throw e;
                }
                j = -1;
            }
            return j;
        }

        public long fs(String str, String str2, ContentValues contentValues) {
            try {
                zmn();
                SQLiteDatabase sQLiteDatabase = this.fs;
                if (sQLiteDatabase == null) {
                    return -1L;
                }
                return sQLiteDatabase.insertWithOnConflict(str, str2, contentValues, 5);
            } catch (Exception e) {
                e.getMessage();
                return -1L;
            }
        }

        public synchronized int zmn(String str, String str2, String[] strArr) {
            int i;
            try {
                zmn();
                i = this.fs.delete(str, str2, strArr);
            } catch (Exception e) {
                e.getMessage();
                if (fs()) {
                    throw e;
                }
                i = 0;
            }
            return i;
        }

        private synchronized boolean fs() {
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
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
            this.zmn = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                zmn(sQLiteDatabase, this.zmn);
            } catch (Throwable th) {
                th.getMessage();
            }
        }

        private void zmn(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.rt.zmn.zmn.fs.btk());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.rt.zmn.zmn.fs.hhw());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    zmn(sQLiteDatabase);
                    zmn(sQLiteDatabase, zn.this.fs);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            try {
                if (i <= i2) {
                    zmn(sQLiteDatabase, zn.this.fs);
                } else {
                    zmn(sQLiteDatabase);
                    zmn(sQLiteDatabase, zn.this.fs);
                }
            } catch (Throwable unused) {
            }
        }

        private void zmn(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> fs = fs(sQLiteDatabase);
            if (fs == null || fs.size() <= 0) {
                return;
            }
            Iterator<String> it = fs.iterator();
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
        private ArrayList<String> fs(SQLiteDatabase sQLiteDatabase) {
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

    public C0176zn zmn() {
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
