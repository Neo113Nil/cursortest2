package z2;

import android.database.Cursor;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC1024a;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055a implements InterfaceC1024a {
    private final Cursor _cursor;

    public C1055a(Cursor _cursor) {
        Intrinsics.checkNotNullParameter(_cursor, "_cursor");
        this._cursor = _cursor;
    }

    @Override // y2.InterfaceC1024a
    public int getCount() {
        return this._cursor.getCount();
    }

    @Override // y2.InterfaceC1024a
    public float getFloat(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getFloat(cursor.getColumnIndex(column));
    }

    @Override // y2.InterfaceC1024a
    public int getInt(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getInt(cursor.getColumnIndex(column));
    }

    @Override // y2.InterfaceC1024a
    public long getLong(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        Cursor cursor = this._cursor;
        return cursor.getLong(cursor.getColumnIndex(column));
    }

    @Override // y2.InterfaceC1024a
    public Float getOptFloat(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Float.valueOf(this._cursor.getFloat(columnIndex));
    }

    @Override // y2.InterfaceC1024a
    public Integer getOptInt(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Integer.valueOf(this._cursor.getInt(columnIndex));
    }

    @Override // y2.InterfaceC1024a
    public Long getOptLong(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return Long.valueOf(this._cursor.getLong(columnIndex));
    }

    @Override // y2.InterfaceC1024a
    public String getOptString(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int columnIndex = this._cursor.getColumnIndex(column);
        if (this._cursor.isNull(columnIndex)) {
            return null;
        }
        return this._cursor.getString(columnIndex);
    }

    @Override // y2.InterfaceC1024a
    public String getString(String column) {
        Intrinsics.checkNotNullParameter(column, "column");
        Cursor cursor = this._cursor;
        String string = cursor.getString(cursor.getColumnIndex(column));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // y2.InterfaceC1024a
    public boolean moveToFirst() {
        return this._cursor.moveToFirst();
    }

    @Override // y2.InterfaceC1024a
    public boolean moveToNext() {
        return this._cursor.moveToNext();
    }
}
