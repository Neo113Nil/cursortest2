package com.appsflyer.internal.connector.purcahse;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import f2.AbstractC2420c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AFPurchaseConnectorA1l extends SQLiteOpenHelper {
    public static final AFPurchaseConnectorA1w AFPurchaseConnectorA1w = new AFPurchaseConnectorA1w(null);
    private static final int InAppPurchaseEvent = 1;
    public static final String getPackageName = "purchases";
    private static final String getQuantity = "afpurchases.db";
    public static final String toJsonMap = "token";

    @Metadata
    public static final class AFPurchaseConnectorA1w {
        private AFPurchaseConnectorA1w() {
        }

        public /* synthetic */ AFPurchaseConnectorA1w(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFPurchaseConnectorA1l(Context context) {
        super(context, getQuantity, (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final Set<String> getQuantity() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Cursor query = getReadableDatabase().query(getPackageName, new String[]{"token"}, null, null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow("token"));
                Intrinsics.checkNotNullExpressionValue(string, "");
                linkedHashSet.add(string);
            }
            Unit unit = Unit.f41027a;
            AbstractC2420c.a(query, null);
            return linkedHashSet;
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        sQLiteDatabase.execSQL("CREATE TABLE purchases (token TEXT PRIMARY KEY)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
    }

    public final void toJsonMap(Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                contentValues.put("token", it.next());
                writableDatabase.insertWithOnConflict(getPackageName, null, contentValues, 4);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }
}
