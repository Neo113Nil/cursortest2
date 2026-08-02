package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0708nn implements InterfaceC0682mn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7979a;

    public C0708nn(String str, HashMap<String, List<String>> hashMap) {
        this.f7979a = hashMap;
    }

    public final HashMap<String, List<String>> a() {
        return this.f7979a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0682mn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z = true;
            for (Map.Entry entry : this.f7979a.entrySet()) {
                try {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    Cursor query = sQLiteDatabase2.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        AbstractC0709no.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z &= list.equals(asList);
                    AbstractC0709no.a(query);
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (Throwable th) {
                    AbstractC0709no.a((Cursor) null);
                    throw th;
                }
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
