package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.in, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2712in {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f39244a;

    public C2712in(@NonNull String str, @NonNull HashMap<String, List<String>> hashMap) {
        this.f39244a = hashMap;
    }

    public final HashMap<String, List<String>> a() {
        return this.f39244a;
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z4 = true;
            for (Map.Entry entry : this.f39244a.entrySet()) {
                try {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    Cursor query = sQLiteDatabase2.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        AbstractC2713io.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z4 &= list.equals(asList);
                    AbstractC2713io.a(query);
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (Throwable th) {
                    AbstractC2713io.a((Cursor) null);
                    throw th;
                }
            }
            return z4;
        } catch (Throwable unused) {
            return false;
        }
    }
}
