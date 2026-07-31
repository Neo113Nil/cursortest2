package X1;

import android.database.Cursor;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a implements W1.a {
    private final Cursor _cursor;

    public a(Cursor _cursor) {
        i.e(_cursor, "_cursor");
        this._cursor = _cursor;
    }

    @Override // W1.a
    public int getCount() {
        return this._cursor.getCount();
    }

    @Override // W1.a
    public float getFloat(String column) {
        i.e(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getFloat(cursor.getColumnIndex(column));
    }

    @Override // W1.a
    public int getInt(String column) {
        i.e(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getInt(cursor.getColumnIndex(column));
    }

    @Override // W1.a
    public long getLong(String column) {
        i.e(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getLong(cursor.getColumnIndex(column));
    }

    @Override // W1.a
    public Float getOptFloat(String column) {
        i.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Float.valueOf(this._cursor.getFloat(columnIndex));
    }

    @Override // W1.a
    public Integer getOptInt(String column) {
        i.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(this._cursor.getInt(columnIndex));
    }

    @Override // W1.a
    public Long getOptLong(String column) {
        i.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this._cursor.getLong(columnIndex));
    }

    @Override // W1.a
    public String getOptString(String column) {
        i.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return this._cursor.getString(columnIndex);
    }

    @Override // W1.a
    public String getString(String column) {
        i.e(column, "column");
        Cursor cursor = this._cursor;
        String string = cursor.getString(cursor.getColumnIndex(column));
        i.d(string, "getString(...)");
        return string;
    }

    @Override // W1.a
    public boolean moveToFirst() {
        return this._cursor.moveToFirst();
    }

    @Override // W1.a
    public boolean moveToNext() {
        return this._cursor.moveToNext();
    }
}
