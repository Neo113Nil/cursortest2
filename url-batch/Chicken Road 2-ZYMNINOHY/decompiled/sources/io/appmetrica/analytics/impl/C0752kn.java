package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.kn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752kn implements InterfaceC0726jn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12252a;

    public C0752kn(String str, HashMap<String, List<String>> hashMap) {
        this.f12252a = hashMap;
    }

    public final HashMap<String, List<String>> a() {
        return this.f12252a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0726jn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z = true;
            for (Map.Entry entry : this.f12252a.entrySet()) {
                try {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    Cursor query = sQLiteDatabase2.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (query == null) {
                        AbstractC0779lo.a(query);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List asList = Arrays.asList(query.getColumnNames());
                    Collections.sort(asList);
                    z &= list.equals(asList);
                    AbstractC0779lo.a(query);
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (Throwable th) {
                    AbstractC0779lo.a((Cursor) null);
                    throw th;
                }
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
