package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import f6.l;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z7, l lVar) {
        if (z7) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T t7 = (T) lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return t7;
        } finally {
            r.finallyStart(1);
            sQLiteDatabase.endTransaction();
            r.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z7, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = true;
        }
        if (z7) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = lVar.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            r.finallyStart(1);
            sQLiteDatabase.endTransaction();
            r.finallyEnd(1);
        }
    }
}
