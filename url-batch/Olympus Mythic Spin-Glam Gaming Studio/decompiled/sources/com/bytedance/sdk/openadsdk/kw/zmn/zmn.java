package com.bytedance.sdk.openadsdk.kw.zmn;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class zmn implements Cursor {
    String[] fs;
    Map<String, List<String>> zmn;
    int zn = 0;

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getType(int i) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public zmn(Map<String, List<String>> map) {
        if (map == null || map.keySet() == null) {
            this.zmn = new HashMap();
            return;
        }
        this.zmn = map;
        try {
            this.fs = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.fs;
            if (strArr != null && strArr.length != 0) {
                return this.zmn.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.zn;
    }

    @Override // android.database.Cursor
    public boolean move(int i) {
        if (this.zn + i >= getCount()) {
            return false;
        }
        this.zn += i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i) {
        if (i >= getCount()) {
            return false;
        }
        this.zn = i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.zn = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.zn = this.zmn.get(this.fs[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.zn + 1 >= getCount()) {
            return false;
        }
        this.zn++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i = this.zn;
        if (i - 1 < 0) {
            return false;
        }
        this.zn = i - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.zn == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.zn == getCount() - 1;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.fs;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i = 0;
        while (true) {
            String[] strArr2 = this.fs;
            if (i >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i])) {
                return i;
            }
            i++;
        }
    }

    @Override // android.database.Cursor
    public String getColumnName(int i) {
        if (i >= 0) {
            String[] strArr = this.fs;
            if (i < strArr.length) {
                return strArr[i];
            }
            return "";
        }
        return "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.fs;
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.fs;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public String getString(int i) {
        if (i < 0 || i >= getColumnCount()) {
            return "";
        }
        return this.zmn.get(this.fs[i]).get(getPosition());
    }

    @Override // android.database.Cursor
    public short getShort(int i) {
        try {
            return Short.parseShort(getString(i));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i) {
        try {
            return Integer.parseInt(getString(i));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i) {
        try {
            return Long.parseLong(getString(i));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public float getFloat(int i) {
        try {
            return Float.parseFloat(getString(i));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i) {
        try {
            return Double.parseDouble(getString(i));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public boolean isNull(int i) {
        return getString(i) == null;
    }
}
