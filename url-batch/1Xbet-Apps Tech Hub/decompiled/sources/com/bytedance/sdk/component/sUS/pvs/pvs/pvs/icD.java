package com.bytedance.sdk.component.sUS.pvs.pvs.pvs;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.sUS.pvs.so;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DBHelper.java */
/* loaded from: classes.dex */
class icD {
    private Context icD;
    private C0053icD pvs;

    icD(Context context) {
        try {
            this.icD = context.getApplicationContext();
            if (this.pvs == null) {
                this.pvs = new C0053icD();
            }
        } catch (Throwable unused) {
        }
    }

    /* compiled from: DBHelper.java */
    /* renamed from: com.bytedance.sdk.component.sUS.pvs.pvs.pvs.icD$icD, reason: collision with other inner class name */
    public class C0053icD {
        private volatile SQLiteDatabase icD = null;

        public C0053icD() {
        }

        private void pvs() {
            try {
                if (this.icD != null && this.icD.isOpen()) {
                    return;
                }
                synchronized (this) {
                    if (this.icD == null || !this.icD.isOpen()) {
                        this.icD = so.yiw().Jd().pvs(so.yiw().sUS());
                        this.icD.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                if (icD()) {
                    throw th;
                }
            }
        }

        public void pvs(String str) throws SQLException {
            try {
                pvs();
                this.icD.execSQL(str);
            } catch (Throwable th) {
                if (icD()) {
                    throw th;
                }
            }
        }

        public Cursor pvs(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                pvs();
                return this.icD.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                pvs pvsVar = new pvs();
                if (icD()) {
                    throw th;
                }
                return pvsVar;
            }
        }

        public int pvs(String str, ContentValues contentValues, String str2, String[] strArr) {
            try {
                pvs();
                return this.icD.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                if (icD()) {
                    throw e;
                }
                return 0;
            }
        }

        public long pvs(String str, String str2, ContentValues contentValues) {
            try {
                pvs();
                return this.icD.insert(str, str2, contentValues);
            } catch (Exception e) {
                if (icD()) {
                    throw e;
                }
                return -1L;
            }
        }

        public synchronized void pvs(String str, String str2, List<com.bytedance.sdk.component.sUS.pvs.Jd.pvs> list) {
            JSONObject yiw;
            try {
                try {
                    pvs();
                    this.icD.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i = 0; i < list.size(); i++) {
                        com.bytedance.sdk.component.sUS.pvs.Jd.pvs pvsVar = list.get(i);
                        if (pvsVar != null && (yiw = pvsVar.yiw()) != null) {
                            contentValues.put(FacebookMediationAdapter.KEY_ID, pvsVar.vG());
                            String icD = so.yiw().mnm().icD(yiw.toString());
                            if (!TextUtils.isEmpty(icD)) {
                                contentValues.put("value", icD);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.sUS.pvs.vG.pvs.Jd() && pvsVar.Wyp() > 0 && (pvsVar.Jd() == 0 || pvsVar.Jd() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(pvsVar.Wyp()));
                                }
                                this.icD.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.icD.setTransactionSuccessful();
                    new StringBuilder().append(str).append(" insert list size=");
                    list.size();
                    if (this.icD != null) {
                        this.icD.endTransaction();
                    }
                } catch (Exception e) {
                    new StringBuilder().append(str).append(" insert list error=");
                    list.size();
                    if (icD()) {
                        throw e;
                    }
                    if (this.icD != null) {
                        this.icD.endTransaction();
                    }
                }
            } catch (Throwable th) {
                if (this.icD != null) {
                    this.icD.endTransaction();
                }
                throw th;
            }
        }

        public int pvs(String str, String str2, String[] strArr) {
            try {
                pvs();
                return this.icD.delete(str, str2, strArr);
            } catch (Exception e) {
                if (icD()) {
                    throw e;
                }
                return 0;
            }
        }

        private boolean icD() {
            SQLiteDatabase sQLiteDatabase = this.icD;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }
    }

    public C0053icD pvs() {
        return this.pvs;
    }

    /* compiled from: DBHelper.java */
    private class pvs extends AbstractCursor {
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

        private pvs() {
        }
    }
}
