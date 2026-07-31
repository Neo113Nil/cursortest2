package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ea {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f15986a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f15987b = new Object();

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Nullable
    public final SQLiteDatabase a(@NotNull SQLiteOpenHelper sqliteOpenHelper) {
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(ea eaVar, boolean z4, SQLiteOpenHelper sQLiteOpenHelper, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return eaVar.a(z4, sQLiteOpenHelper);
    }

    @Nullable
    public final SQLiteDatabase a(boolean z4, @NotNull SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase writableDatabase;
        Intrinsics.checkNotNullParameter(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f15987b) {
            try {
                writableDatabase = z4 ? sqliteOpenHelper.getWritableDatabase() : sqliteOpenHelper.getReadableDatabase();
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }
}
