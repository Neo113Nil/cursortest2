package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2589e5 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final String f38904a = "sessions";

    /* renamed from: b, reason: collision with root package name */
    public final int f38905b = 200;

    /* renamed from: c, reason: collision with root package name */
    public final String f38906c = "id";

    /* renamed from: d, reason: collision with root package name */
    public final String f38907d = "start_time";

    /* renamed from: e, reason: collision with root package name */
    public final String f38908e = "report_request_parameters";

    /* renamed from: f, reason: collision with root package name */
    public final String f38909f = "server_time_offset";

    /* renamed from: g, reason: collision with root package name */
    public final String f38910g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f38911h = "obtained_before_first_sync";

    /* renamed from: i, reason: collision with root package name */
    public final P7 f38912i = new P7(null, 1, 0 == true ? 1 : 0);

    public final O7 a(Cursor cursor) {
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38906c)));
            int i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38910g));
            Wk wk = Wk.FOREGROUND;
            boolean z4 = true;
            if (i4 != 0) {
                wk = Wk.BACKGROUND;
                if (i4 != 1) {
                    wk = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f38908e));
            Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38907d)));
            Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38909f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f38911h)) != 1) {
                z4 = false;
            }
            return new O7(valueOf, wk, string, new N7(valueOf2, valueOf3, Boolean.valueOf(z4)));
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
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
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
            cursor = sQLiteDatabase2.query(this.f38904a, null, null, null, null, null, null, String.valueOf(this.f38905b));
            while (cursor.moveToNext()) {
                try {
                    O7 a4 = a(cursor);
                    if (a4 != null && (l4 = a4.f38053a) != null && l4.longValue() >= 0 && a4.f38054b != null && (str = a4.f38055c) != null && str.length() != 0 && (l5 = a4.f38056d.f37994a) != null && l5.longValue() > 0) {
                        arrayList.add(this.f38912i.fromModel(a4));
                    }
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f38904a);
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
