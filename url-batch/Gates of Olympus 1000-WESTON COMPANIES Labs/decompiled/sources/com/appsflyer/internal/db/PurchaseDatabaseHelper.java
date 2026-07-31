package com.appsflyer.internal.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseDatabaseHelper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0014\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\u0014"}, d2 = {"Lcom/appsflyer/internal/db/PurchaseDatabaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getPurchasedTokens", "", "", "onCreate", "", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onOpen", "onUpgrade", "oldVersion", "", "newVersion", "savePurchaseTokens", "tokens", "Companion", "purchase_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class PurchaseDatabaseHelper extends SQLiteOpenHelper {
    public static final String COLUMN_NAME_TOKEN = "token";
    private static final String DATABASE_NAME = "afpurchases.db";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "purchases";

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(db, "db");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL("CREATE TABLE purchases (token TEXT PRIMARY KEY)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }

    public final Set<String> getPurchasedTokens() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Cursor query = getReadableDatabase().query(TABLE_NAME, new String[]{COLUMN_NAME_TOKEN}, null, null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(COLUMN_NAME_TOKEN));
                Intrinsics.checkNotNullExpressionValue(string, "it.getString(it.getColum…Throw(COLUMN_NAME_TOKEN))");
                linkedHashSet.add(string);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(query, null);
            return linkedHashSet;
        } finally {
        }
    }

    public final void savePurchaseTokens(Set<String> tokens) {
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            Iterator<String> it = tokens.iterator();
            while (it.hasNext()) {
                contentValues.put(COLUMN_NAME_TOKEN, it.next());
                writableDatabase.insertWithOnConflict(TABLE_NAME, null, contentValues, 4);
            }
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }
}
