package com.squareup.cash.treehouse.sqldelight;

import android.content.Context;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import com.squareup.cash.storage.context.KeyedStorageContextWrapper;
import java.util.LinkedHashSet;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.Exchange;

/* loaded from: classes.dex */
public final class AndroidSqlDelightBridgeHolder {
    public final Context context;
    public final LinkedHashSet openTreehouseDatabases = new LinkedHashSet();

    /* loaded from: classes7.dex */
    public final class DatabasePathParts {
        public final String databaseFileName;
        public final String relativePath;

        public DatabasePathParts(String str, String str2) {
            this.relativePath = str;
            this.databaseFileName = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DatabasePathParts)) {
                return false;
            }
            DatabasePathParts databasePathParts = (DatabasePathParts) obj;
            return Intrinsics.areEqual(this.relativePath, databasePathParts.relativePath) && this.databaseFileName.equals(databasePathParts.databaseFileName);
        }

        public final String getDatabaseFileName() {
            return this.databaseFileName;
        }

        public final String getRelativePath() {
            return this.relativePath;
        }

        public final int hashCode() {
            String str = this.relativePath;
            return this.databaseFileName.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("DatabasePathParts(relativePath=", this.relativePath, ", databaseFileName=", this.databaseFileName, ")");
        }
    }

    public AndroidSqlDelightBridgeHolder(Context context) {
        this.context = context;
    }

    public final AndroidSqlDelightBridge createSqlDelightBridge(String str, String str2, CoroutineContext coroutineContext) {
        Context context = this.context;
        Exchange exchange = new Exchange(str2 != null ? new KeyedStorageContextWrapper(context, str2) : context, str, new SupportSQLiteOpenHelper.Callback() { // from class: com.squareup.cash.treehouse.sqldelight.AndroidSqlDelightBridgeHolder$createSqlDelightBridge$config$1
            @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
            public final void onCreate(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            }

            @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
            public final void onUpgrade(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
            }
        }, false, false);
        SupportSQLiteDatabase writableDatabase = new FrameworkSQLiteOpenHelper((Context) exchange.call, (String) exchange.finder, (SupportSQLiteOpenHelper.Callback) exchange.codec, false, false).getWritableDatabase();
        this.openTreehouseDatabases.add(new DatabasePathParts(str2, str));
        return new AndroidSqlDelightBridge(writableDatabase, coroutineContext);
    }
}
