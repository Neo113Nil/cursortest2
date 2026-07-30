package x4;

import android.database.Cursor;
import kotlin.jvm.internal.h;
import w4.InterfaceC5170a;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5212a implements InterfaceC5170a {
    private final Cursor _cursor;

    public C5212a(Cursor _cursor) {
        h.e(_cursor, "_cursor");
        this._cursor = _cursor;
    }

    @Override // w4.InterfaceC5170a
    public int getCount() {
        return this._cursor.getCount();
    }

    @Override // w4.InterfaceC5170a
    public float getFloat(String column) {
        h.e(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getFloat(cursor.getColumnIndex(column));
    }

    @Override // w4.InterfaceC5170a
    public int getInt(String column) {
        h.e(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getInt(cursor.getColumnIndex(column));
    }

    @Override // w4.InterfaceC5170a
    public long getLong(String column) {
        h.e(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getLong(cursor.getColumnIndex(column));
    }

    @Override // w4.InterfaceC5170a
    public Float getOptFloat(String column) {
        h.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Float.valueOf(this._cursor.getFloat(columnIndex));
    }

    @Override // w4.InterfaceC5170a
    public Integer getOptInt(String column) {
        h.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(this._cursor.getInt(columnIndex));
    }

    @Override // w4.InterfaceC5170a
    public Long getOptLong(String column) {
        h.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this._cursor.getLong(columnIndex));
    }

    @Override // w4.InterfaceC5170a
    public String getOptString(String column) {
        h.e(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return this._cursor.getString(columnIndex);
    }

    @Override // w4.InterfaceC5170a
    public String getString(String column) {
        h.e(column, "column");
        Cursor cursor = this._cursor;
        String string = cursor.getString(cursor.getColumnIndex(column));
        h.d(string, "getString(...)");
        return string;
    }

    @Override // w4.InterfaceC5170a
    public boolean moveToFirst() {
        return this._cursor.moveToFirst();
    }

    @Override // w4.InterfaceC5170a
    public boolean moveToNext() {
        return this._cursor.moveToNext();
    }
}
