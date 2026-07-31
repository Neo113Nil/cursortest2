package com.bytedance.sdk.component.hhw.zmn.zmn.zmn;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.hhw.zmn.nps;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
class fs {
    private Context fs;
    private C0133fs zmn;

    fs(Context context) {
        try {
            this.fs = context.getApplicationContext();
            if (this.zmn == null) {
                this.zmn = new C0133fs();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.bytedance.sdk.component.hhw.zmn.zmn.zmn.fs$fs, reason: collision with other inner class name */
    public class C0133fs {
        private volatile SQLiteDatabase fs = null;

        public C0133fs() {
        }

        private void zmn() {
            try {
                if (this.fs != null && this.fs.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.fs != null) {
                            if (!this.fs.isOpen()) {
                            }
                        }
                        this.fs = nps.hhw().zn().zmn(nps.hhw().btk());
                        this.fs.setLockingEnabled(false);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                if (fs()) {
                    throw th;
                }
            }
        }

        public void zmn(String str) throws SQLException {
            try {
                zmn();
                this.fs.execSQL(str);
            } catch (Throwable th) {
                if (fs()) {
                    throw th;
                }
            }
        }

        public Cursor zmn(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                zmn();
                return this.fs.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                zmn zmnVar = new zmn();
                if (fs()) {
                    throw th;
                }
                return zmnVar;
            }
        }

        public int zmn(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                zmn();
                return this.fs.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (fs()) {
                    throw e;
                }
                return 0;
            }
        }

        public long zmn(String str, String str2, ContentValues contentValues) {
            try {
                zmn();
                return this.fs.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (fs()) {
                    throw e;
                }
                return -1L;
            }
        }

        public synchronized void zmn(String str, String str2, List<com.bytedance.sdk.component.hhw.zmn.fb.zmn> list) {
            JSONObject hhw;
            try {
                try {
                    zmn();
                    this.fs.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        com.bytedance.sdk.component.hhw.zmn.fb.zmn zmnVar = list.get(i);
                        if (zmnVar != null && (hhw = zmnVar.hhw()) != null) {
                            contentValues.put("id", zmnVar.zn());
                            String fs = nps.hhw().cn().fs(hhw.toString());
                            if (!TextUtils.isEmpty(fs)) {
                                contentValues.put("value", fs);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.hhw.zmn.zn.zmn.fb()) {
                                    if (zmnVar.bvs() > 0) {
                                        if (zmnVar.fb() != 0) {
                                            if (zmnVar.fb() == 3) {
                                            }
                                        }
                                        contentValues.put("channel", Integer.valueOf(zmnVar.bvs()));
                                    }
                                }
                                this.fs.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.fs.setTransactionSuccessful();
                    list.size();
                    if (this.fs != null) {
                        this.fs.endTransaction();
                    }
                } catch (Exception e) {
                    list.size();
                    if (fs()) {
                        throw e;
                    }
                    if (this.fs != null) {
                        this.fs.endTransaction();
                    }
                }
            } catch (Throwable th) {
                if (this.fs != null) {
                    this.fs.endTransaction();
                }
                throw th;
            }
        }

        public int zmn(String str, String str2, String[] strArr) {
            try {
                zmn();
                return this.fs.delete(str, str2, strArr);
            } catch (Exception e) {
                if (fs()) {
                    throw e;
                }
                return 0;
            }
        }

        private boolean fs() {
            SQLiteDatabase sQLiteDatabase = this.fs;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }
    }

    public C0133fs zmn() {
        return this.zmn;
    }

    private class zmn extends AbstractCursor {
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

        private zmn() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }
    }
}
