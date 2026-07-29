package com.facebook.ads.internal.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends g {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5083a = new b(0, "event_id", "TEXT PRIMARY KEY");

    /* renamed from: b, reason: collision with root package name */
    public static final b f5084b = new b(1, "token_id", "TEXT REFERENCES tokens ON UPDATE CASCADE ON DELETE RESTRICT");

    /* renamed from: c, reason: collision with root package name */
    public static final b f5085c = new b(2, "priority", "INTEGER");

    /* renamed from: d, reason: collision with root package name */
    public static final b f5086d = new b(3, "type", "TEXT");
    public static final b e = new b(4, "time", "REAL");
    public static final b f = new b(5, "session_time", "REAL");
    public static final b g = new b(6, TapjoyConstants.TJC_SESSION_ID, "TEXT");
    public static final b h = new b(7, "data", "TEXT");
    public static final b i = new b(8, "attempt", "INTEGER");
    public static final b[] j = {f5083a, f5084b, f5085c, f5086d, e, f, g, h, i};
    private static final String l = a("events", j);

    public c(d dVar) {
        super(dVar);
    }

    @Override // com.facebook.ads.internal.e.g
    public String a() {
        return "events";
    }

    String a(String str, int i2, String str2, double d2, double d3, String str3, Map<String, String> map) {
        String uuid = UUID.randomUUID().toString();
        ContentValues contentValues = new ContentValues(9);
        contentValues.put(f5083a.f5081b, uuid);
        contentValues.put(f5084b.f5081b, str);
        contentValues.put(f5085c.f5081b, Integer.valueOf(i2));
        contentValues.put(f5086d.f5081b, str2);
        contentValues.put(e.f5081b, Double.valueOf(d2));
        contentValues.put(f.f5081b, Double.valueOf(d3));
        contentValues.put(g.f5081b, str3);
        contentValues.put(h.f5081b, map != null ? new JSONObject(map).toString() : null);
        contentValues.put(i.f5081b, (Integer) 0);
        f().insertOrThrow("events", null, contentValues);
        return uuid;
    }

    boolean a(String str) {
        SQLiteDatabase f2 = f();
        StringBuilder sb = new StringBuilder();
        sb.append(f5083a.f5081b);
        sb.append(" = ?");
        return f2.delete("events", sb.toString(), new String[]{str}) > 0;
    }

    @Override // com.facebook.ads.internal.e.g
    public b[] b() {
        return j;
    }

    Cursor c() {
        return f().rawQuery("SELECT count(*) FROM events", null);
    }

    Cursor d() {
        return f().rawQuery(l, null);
    }
}
