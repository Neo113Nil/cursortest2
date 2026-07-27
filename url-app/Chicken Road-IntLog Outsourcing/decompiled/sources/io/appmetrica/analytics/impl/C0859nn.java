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
public final class C0859nn implements InterfaceC0833mn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8899a;

    public C0859nn(String str, HashMap<String, List<String>> hashMap) {
        this.f8899a = hashMap;
    }

    public final HashMap<String, List<String>> a() {
        return this.f8899a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0833mn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z = true;
            for (Map.Entry entry : this.f8899a.entrySet()) {
                try {
                    Cursor query = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        AbstractC0860no.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z &= list.equals(asList);
                    AbstractC0860no.a(query);
                } catch (Throwable th) {
                    AbstractC0860no.a((Cursor) null);
                    throw th;
                }
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
