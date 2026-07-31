package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2563d5 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f38819a = 2000;

    /* renamed from: b, reason: collision with root package name */
    public final String f38820b = "number";

    /* renamed from: c, reason: collision with root package name */
    public final String f38821c = "global_number";

    /* renamed from: d, reason: collision with root package name */
    public final String f38822d = "number_of_type";

    /* renamed from: e, reason: collision with root package name */
    public final String f38823e = "name";

    /* renamed from: f, reason: collision with root package name */
    public final String f38824f = "value";

    /* renamed from: g, reason: collision with root package name */
    public final String f38825g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f38826h = CrashHianalyticsData.TIME;

    /* renamed from: i, reason: collision with root package name */
    public final String f38827i = "session_id";

    /* renamed from: j, reason: collision with root package name */
    public final String f38828j = "error_environment";

    /* renamed from: k, reason: collision with root package name */
    public final String f38829k = "session_type";

    /* renamed from: l, reason: collision with root package name */
    public final String f38830l = "app_environment";

    /* renamed from: m, reason: collision with root package name */
    public final String f38831m = "app_environment_revision";

    /* renamed from: n, reason: collision with root package name */
    public final String f38832n = "truncated";

    /* renamed from: o, reason: collision with root package name */
    public final String f38833o = "custom_type";

    /* renamed from: p, reason: collision with root package name */
    public final String f38834p = "encrypting_mode";

    /* renamed from: q, reason: collision with root package name */
    public final String f38835q = "profile_id";

    /* renamed from: r, reason: collision with root package name */
    public final String f38836r = "first_occurrence_status";

    /* renamed from: s, reason: collision with root package name */
    public final String f38837s = "source";

    /* renamed from: t, reason: collision with root package name */
    public final String f38838t = "attribution_id_changed";

    /* renamed from: u, reason: collision with root package name */
    public final String f38839u = "open_id";

    /* renamed from: v, reason: collision with root package name */
    public final String f38840v = "extras";

    /* renamed from: w, reason: collision with root package name */
    public final String f38841w = "reports";

    /* renamed from: x, reason: collision with root package name */
    public final B7 f38842x = new B7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(A7 a7) {
        Long l4;
        EnumC3063wb enumC3063wb;
        Long l5;
        Long l6;
        Long l7 = a7.f37157a;
        if (l7 == null || l7.longValue() < 10000000000L || a7.f37158b == null || (l4 = a7.f37159c) == null || l4.longValue() < 0 || (enumC3063wb = a7.f37160d) == null || enumC3063wb == EnumC3063wb.EVENT_TYPE_UNDEFINED || (l5 = a7.f37161e) == null || l5.longValue() < 0 || (l6 = a7.f37162f) == null || l6.longValue() < 0) {
            return false;
        }
        Long l8 = a7.f37163g.f40307d;
        if (l8 != null && l8.longValue() < 0) {
            return false;
        }
        Integer num = a7.f37163g.f40312i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursor = sQLiteDatabase2.query(this.f38841w, null, null, null, null, null, null, String.valueOf(this.f38819a));
                while (cursor.moveToNext()) {
                    try {
                        A7 a4 = a(cursor);
                        if (a4 != null && a(a4)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.f38842x.fromModel(a4));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor = cursor2;
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f38841w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f38841w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:57|(1:59)(15:60|6|(2:50|(1:52)(2:53|(1:55)(12:56|9|10|11|(2:43|(1:45)(2:46|47))|13|14|15|(2:38|(3:40|18|19))|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(0)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012d, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.f38838t)) != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r4 = io.appmetrica.analytics.impl.H9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC3114ya.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #2 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final A7 a(Cursor cursor) {
        Wk wk;
        int i4;
        EnumC2513b9 enumC2513b9;
        H9 h9;
        int i5;
        int i6;
        int i7;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38827i)));
            int i8 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38829k));
            Wk wk2 = Wk.FOREGROUND;
            boolean z4 = true;
            try {
                if (i8 != 0) {
                    wk2 = Wk.BACKGROUND;
                    if (i8 != 1) {
                        wk = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38820b)));
                        EnumC3063wb a4 = EnumC3063wb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f38825g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38821c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38826h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f38833o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f38823e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38824f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38822d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38828j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38830l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38831m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f38832n)));
                        i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38834p));
                        EnumC2513b9 enumC2513b92 = EnumC2513b9.NONE;
                        if (i4 != 0) {
                            enumC2513b92 = EnumC2513b9.AES_VALUE_ENCRYPTION;
                            if (i4 != 2) {
                                enumC2513b92 = EnumC2513b9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i4 != 1) {
                                    enumC2513b9 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38835q));
                                    i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38836r));
                                    EnumC3114ya enumC3114ya = EnumC3114ya.FIRST_OCCURRENCE;
                                    if (i7 != 1) {
                                        enumC3114ya = EnumC3114ya.NON_FIRST_OCCURENCE;
                                        if (i7 != 2) {
                                            EnumC3114ya enumC3114ya2 = EnumC3114ya.UNKNOWN;
                                            enumC3114ya = enumC3114ya2;
                                        }
                                    }
                                    EnumC3114ya enumC3114ya3 = enumC3114ya;
                                    i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38837s));
                                    H9 h92 = H9.NATIVE;
                                    if (i6 != 0) {
                                        h92 = H9.JS;
                                        if (i6 != 1) {
                                            h9 = null;
                                        }
                                    }
                                    h9 = h92;
                                }
                            }
                        }
                        enumC2513b9 = enumC2513b92;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38835q));
                        i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38836r));
                        EnumC3114ya enumC3114ya4 = EnumC3114ya.FIRST_OCCURRENCE;
                        if (i7 != 1) {
                        }
                        EnumC3114ya enumC3114ya32 = enumC3114ya4;
                        i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38837s));
                        H9 h922 = H9.NATIVE;
                        if (i6 != 0) {
                        }
                        h9 = h922;
                    }
                }
            } catch (Throwable unused) {
            }
            wk = wk2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38820b)));
            EnumC3063wb a42 = EnumC3063wb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f38825g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38821c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38826h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f38833o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38823e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38824f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38822d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38828j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38830l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f38831m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f38832n)));
            i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38834p));
            EnumC2513b9 enumC2513b922 = EnumC2513b9.NONE;
            if (i4 != 0) {
            }
            enumC2513b9 = enumC2513b922;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.f38835q));
            i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38836r));
            EnumC3114ya enumC3114ya42 = EnumC3114ya.FIRST_OCCURRENCE;
            if (i7 != 1) {
            }
            EnumC3114ya enumC3114ya322 = enumC3114ya42;
            i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38837s));
            H9 h9222 = H9.NATIVE;
            if (i6 != 0) {
            }
            h9 = h9222;
            z4 = false;
            Boolean valueOf9 = Boolean.valueOf(z4);
            try {
                i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f38839u));
            } catch (Throwable unused2) {
                i5 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i5);
            int columnIndex = cursor.getColumnIndex(this.f38840v);
            return new A7(valueOf, wk, valueOf22, a42, valueOf32, valueOf42, new C3137z7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, enumC2513b9, string522, enumC3114ya322, h9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i5);
            int columnIndex2 = cursor.getColumnIndex(this.f38840v);
            return new A7(valueOf, wk, valueOf22, a42, valueOf32, valueOf42, new C3137z7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, enumC2513b9, string522, enumC3114ya322, h9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}
