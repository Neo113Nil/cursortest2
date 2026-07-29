package com.facebook.ads.internal.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5105a = new b(0, "token_id", "TEXT PRIMARY KEY");

    /* renamed from: b, reason: collision with root package name */
    public static final b f5106b = new b(1, "token", "TEXT");

    /* renamed from: c, reason: collision with root package name */
    public static final b[] f5107c = {f5105a, f5106b};

    /* renamed from: d, reason: collision with root package name */
    private static final String f5108d = h.class.getSimpleName();
    private static final String e = a("tokens", f5107c);
    private static final String f = a("tokens", f5107c, f5106b);
    private static final String g = "DELETE FROM tokens WHERE NOT EXISTS (SELECT 1 FROM events WHERE tokens." + f5105a.f5081b + " = events." + c.f5084b.f5081b + ")";

    public h(d dVar) {
        super(dVar);
    }

    @Override // com.facebook.ads.internal.e.g
    public String a() {
        return "tokens";
    }

    String a(String str) {
        Cursor cursor;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid token.");
        }
        try {
            cursor = f().rawQuery(f, new String[]{str});
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        try {
            String string = cursor.moveToNext() ? cursor.getString(f5105a.f5080a) : null;
            if (!TextUtils.isEmpty(string)) {
                if (cursor != null) {
                    cursor.close();
                }
                return string;
            }
            String uuid = UUID.randomUUID().toString();
            ContentValues contentValues = new ContentValues(2);
            contentValues.put(f5105a.f5081b, uuid);
            contentValues.put(f5106b.f5081b, str);
            f().insertOrThrow("tokens", null, contentValues);
            if (cursor != null) {
                cursor.close();
            }
            return uuid;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.internal.e.g
    public b[] b() {
        return f5107c;
    }

    Cursor c() {
        return f().rawQuery(e, null);
    }

    public void d() {
        try {
            f().execSQL(g);
        } catch (SQLException unused) {
        }
    }
}
