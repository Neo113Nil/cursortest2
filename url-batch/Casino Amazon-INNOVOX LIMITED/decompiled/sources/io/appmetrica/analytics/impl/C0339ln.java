package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0339ln implements InterfaceC0313kn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1363a;

    public C0339ln(String str, HashMap<String, List<String>> hashMap) {
        this.f1363a = hashMap;
    }

    public final HashMap<String, List<String>> a() {
        return this.f1363a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0313kn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z = true;
            for (Map.Entry entry : this.f1363a.entrySet()) {
                try {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    Cursor query = sQLiteDatabase2.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        mo.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z &= list.equals(asList);
                    mo.a(query);
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (Throwable th) {
                    mo.a((Cursor) null);
                    throw th;
                }
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
