package ia;

import android.database.Cursor;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ha.a {
    private final Cursor _cursor;

    public a(Cursor cursor) {
        cursor.getClass();
        this._cursor = cursor;
    }

    @Override // ha.a
    public int getCount() {
        return this._cursor.getCount();
    }

    @Override // ha.a
    public float getFloat(String str) {
        str.getClass();
        Cursor cursor = this._cursor;
        return cursor.getFloat(cursor.getColumnIndex(str));
    }

    @Override // ha.a
    public int getInt(String str) {
        str.getClass();
        Cursor cursor = this._cursor;
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    @Override // ha.a
    public long getLong(String str) {
        str.getClass();
        Cursor cursor = this._cursor;
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    @Override // ha.a
    public Float getOptFloat(String str) {
        str.getClass();
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Float.valueOf(this._cursor.getFloat(columnIndex));
    }

    @Override // ha.a
    public Integer getOptInt(String str) {
        str.getClass();
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(this._cursor.getInt(columnIndex));
    }

    @Override // ha.a
    public Long getOptLong(String str) {
        str.getClass();
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this._cursor.getLong(columnIndex));
    }

    @Override // ha.a
    public String getOptString(String str) {
        str.getClass();
        int columnIndex = this._cursor.getColumnIndex(str);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return this._cursor.getString(columnIndex);
    }

    @Override // ha.a
    public String getString(String str) {
        str.getClass();
        Cursor cursor = this._cursor;
        String string = cursor.getString(cursor.getColumnIndex(str));
        string.getClass();
        return string;
    }

    @Override // ha.a
    public boolean moveToFirst() {
        return this._cursor.moveToFirst();
    }

    @Override // ha.a
    public boolean moveToNext() {
        return this._cursor.moveToNext();
    }
}
