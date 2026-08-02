package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final String f10462a = "sessions";

    /* renamed from: b, reason: collision with root package name */
    public final int f10463b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final String f10464c = "id";

    /* renamed from: d, reason: collision with root package name */
    public final String f10465d = "start_time";

    /* renamed from: e, reason: collision with root package name */
    public final String f10466e = "report_request_parameters";

    /* renamed from: f, reason: collision with root package name */
    public final String f10467f = "server_time_offset";

    /* renamed from: g, reason: collision with root package name */
    public final String f10468g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f10469h = "obtained_before_first_sync";

    /* renamed from: i, reason: collision with root package name */
    public final C0969t7 f10470i = new C0969t7(null, 1, 0 == true ? 1 : 0);

    public final C0943s7 a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10464c)));
            int i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10468g));
            Vk vk = Vk.FOREGROUND;
            boolean z = true;
            if (i4 != 0) {
                vk = Vk.BACKGROUND;
                if (i4 != 1) {
                    vk = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f10466e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10465d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10467f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f10469h)) != 1) {
                z = false;
            }
            return new C0943s7(valueOf, vk, string, new C0917r7(valueOf2, valueOf3, Boolean.valueOf(z)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x005c, code lost:
    
        if (r12 != null) goto L30;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        Long l4;
        String str;
        Long l5;
        ArrayList arrayList = new ArrayList();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
        } catch (Throwable unused) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        try {
            cursor = sQLiteDatabase2.query(this.f10462a, null, null, null, null, null, null, String.valueOf(this.f10463b));
            while (cursor.moveToNext()) {
                try {
                    C0943s7 a3 = a(cursor);
                    if (a3 != null && (l4 = a3.f12718a) != null && l4.longValue() >= 0 && a3.f12719b != null && (str = a3.f12720c) != null && str.length() != 0 && (l5 = a3.f12721d.f12650a) != null && l5.longValue() > 0) {
                        arrayList.add(this.f10470i.fromModel(a3));
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f10462a);
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                sQLiteDatabase2.insertOrThrow("sessions", null, (ContentValues) obj);
            } catch (Throwable unused4) {
            }
        }
    }
}
