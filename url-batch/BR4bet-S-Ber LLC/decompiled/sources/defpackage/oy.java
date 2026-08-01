package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.moontiko.really.admiralcasino.data.Note;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class oy extends SQLiteOpenHelper {
    public static final ky f = new ky(1);
    public static volatile oy g;

    public static ContentValues f(Note note) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", note.getTitle());
        contentValues.put("content", note.getContent());
        contentValues.put("colorHex", note.getColorHex());
        contentValues.put("category", note.getCategory());
        contentValues.put("isPinned", Integer.valueOf(note.isPinned() ? 1 : 0));
        contentValues.put("createdAt", Long.valueOf(note.getCreatedAt()));
        contentValues.put("updatedAt", Long.valueOf(note.getUpdatedAt()));
        return contentValues;
    }

    public static ArrayList g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(cursor.getColumnIndexOrThrow("id"));
            String string = cursor.getString(cursor.getColumnIndexOrThrow("title"));
            string.getClass();
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("content"));
            string2.getClass();
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow("colorHex"));
            string3.getClass();
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow("category"));
            string4.getClass();
            boolean z = true;
            if (cursor.getInt(cursor.getColumnIndexOrThrow("isPinned")) != 1) {
                z = false;
            }
            arrayList.add(new Note(i, string, string2, string3, string4, z, cursor.getLong(cursor.getColumnIndexOrThrow("createdAt")), cursor.getLong(cursor.getColumnIndexOrThrow("updatedAt"))));
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("CREATE TABLE notes (\n    id      INTEGER PRIMARY KEY AUTOINCREMENT,\n    title   TEXT    NOT NULL DEFAULT '',\n    content TEXT    NOT NULL DEFAULT '',\n    colorHex   TEXT    NOT NULL DEFAULT '#FAFAFA',\n    category TEXT   NOT NULL DEFAULT 'Personal',\n    isPinned  INTEGER NOT NULL DEFAULT 0,\n    createdAt INTEGER NOT NULL,\n    updatedAt INTEGER NOT NULL\n)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS notes");
        sQLiteDatabase.execSQL("CREATE TABLE notes (\n    id      INTEGER PRIMARY KEY AUTOINCREMENT,\n    title   TEXT    NOT NULL DEFAULT '',\n    content TEXT    NOT NULL DEFAULT '',\n    colorHex   TEXT    NOT NULL DEFAULT '#FAFAFA',\n    category TEXT   NOT NULL DEFAULT 'Personal',\n    isPinned  INTEGER NOT NULL DEFAULT 0,\n    createdAt INTEGER NOT NULL,\n    updatedAt INTEGER NOT NULL\n)");
    }
}
