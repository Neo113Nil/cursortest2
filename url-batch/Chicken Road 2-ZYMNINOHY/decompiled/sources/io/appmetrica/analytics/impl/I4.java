package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* loaded from: classes.dex */
public final class I4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f10402a = 2000;

    /* renamed from: b, reason: collision with root package name */
    public final String f10403b = "number";

    /* renamed from: c, reason: collision with root package name */
    public final String f10404c = "global_number";

    /* renamed from: d, reason: collision with root package name */
    public final String f10405d = "number_of_type";

    /* renamed from: e, reason: collision with root package name */
    public final String f10406e = "name";

    /* renamed from: f, reason: collision with root package name */
    public final String f10407f = "value";

    /* renamed from: g, reason: collision with root package name */
    public final String f10408g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f10409h = "time";

    /* renamed from: i, reason: collision with root package name */
    public final String f10410i = "session_id";

    /* renamed from: j, reason: collision with root package name */
    public final String f10411j = "error_environment";

    /* renamed from: k, reason: collision with root package name */
    public final String f10412k = "session_type";

    /* renamed from: l, reason: collision with root package name */
    public final String f10413l = "app_environment";

    /* renamed from: m, reason: collision with root package name */
    public final String f10414m = "app_environment_revision";
    public final String n = "truncated";
    public final String o = "custom_type";

    /* renamed from: p, reason: collision with root package name */
    public final String f10415p = "encrypting_mode";

    /* renamed from: q, reason: collision with root package name */
    public final String f10416q = "profile_id";

    /* renamed from: r, reason: collision with root package name */
    public final String f10417r = "first_occurrence_status";

    /* renamed from: s, reason: collision with root package name */
    public final String f10418s = AdRevenueConstants.SOURCE_KEY;

    /* renamed from: t, reason: collision with root package name */
    public final String f10419t = "attribution_id_changed";

    /* renamed from: u, reason: collision with root package name */
    public final String f10420u = "open_id";
    public final String v = "extras";

    /* renamed from: w, reason: collision with root package name */
    public final String f10421w = "reports";

    /* renamed from: x, reason: collision with root package name */
    public final C0607f7 f10422x = new C0607f7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C0581e7 c0581e7) {
        Long l4;
        EnumC0508bb enumC0508bb;
        Long l5;
        Long l6;
        Long l7 = c0581e7.f11729a;
        if (l7 == null || l7.longValue() < 10000000000L || c0581e7.f11730b == null || (l4 = c0581e7.f11731c) == null || l4.longValue() < 0 || (enumC0508bb = c0581e7.f11732d) == null || enumC0508bb == EnumC0508bb.EVENT_TYPE_UNDEFINED || (l5 = c0581e7.f11733e) == null || l5.longValue() < 0 || (l6 = c0581e7.f11734f) == null || l6.longValue() < 0) {
            return false;
        }
        Long l8 = c0581e7.f11735g.f11656d;
        if (l8 != null && l8.longValue() < 0) {
            return false;
        }
        Integer num = c0581e7.f11735g.f11661i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor2 = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursor = sQLiteDatabase2.query(this.f10421w, null, null, null, null, null, null, String.valueOf(this.f10402a));
                while (cursor.moveToNext()) {
                    try {
                        C0581e7 a3 = a(cursor);
                        if (a3 != null && a(a3)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.f10422x.fromModel(a3));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor = cursor2;
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f10421w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f10421w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:57|(1:59)(15:60|6|(2:50|(1:52)(2:53|(1:55)(12:56|9|10|11|(2:43|(1:45)(2:46|47))|13|14|15|(2:38|(3:40|18|19))|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(0)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012d, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.f10419t)) != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r4 = io.appmetrica.analytics.impl.EnumC0790m9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC0559da.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #2 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0581e7 a(Cursor cursor) {
        Vk vk;
        int i4;
        I8 i8;
        EnumC0790m9 enumC0790m9;
        int i5;
        int i6;
        int i7;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10410i)));
            int i9 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10412k));
            Vk vk2 = Vk.FOREGROUND;
            boolean z = true;
            try {
                if (i9 != 0) {
                    vk2 = Vk.BACKGROUND;
                    if (i9 != 1) {
                        vk = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10403b)));
                        EnumC0508bb a3 = EnumC0508bb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f10408g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10404c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10409h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f10406e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10407f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10405d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10411j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10413l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10414m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
                        i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10415p));
                        I8 i82 = I8.NONE;
                        if (i4 != 0) {
                            i82 = I8.AES_VALUE_ENCRYPTION;
                            if (i4 != 2) {
                                i82 = I8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i4 != 1) {
                                    i8 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10416q));
                                    i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10417r));
                                    EnumC0559da enumC0559da = EnumC0559da.FIRST_OCCURRENCE;
                                    if (i7 != 1) {
                                        enumC0559da = EnumC0559da.NON_FIRST_OCCURENCE;
                                        if (i7 != 2) {
                                            EnumC0559da enumC0559da2 = EnumC0559da.UNKNOWN;
                                            enumC0559da = enumC0559da2;
                                        }
                                    }
                                    EnumC0559da enumC0559da3 = enumC0559da;
                                    i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10418s));
                                    EnumC0790m9 enumC0790m92 = EnumC0790m9.NATIVE;
                                    if (i6 != 0) {
                                        enumC0790m92 = EnumC0790m9.JS;
                                        if (i6 != 1) {
                                            enumC0790m9 = null;
                                        }
                                    }
                                    enumC0790m9 = enumC0790m92;
                                }
                            }
                        }
                        i8 = i82;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10416q));
                        i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10417r));
                        EnumC0559da enumC0559da4 = EnumC0559da.FIRST_OCCURRENCE;
                        if (i7 != 1) {
                        }
                        EnumC0559da enumC0559da32 = enumC0559da4;
                        i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10418s));
                        EnumC0790m9 enumC0790m922 = EnumC0790m9.NATIVE;
                        if (i6 != 0) {
                        }
                        enumC0790m9 = enumC0790m922;
                    }
                }
            } catch (Throwable unused) {
            }
            vk = vk2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10403b)));
            EnumC0508bb a32 = EnumC0508bb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f10408g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10404c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10409h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10406e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10407f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10405d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10411j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10413l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f10414m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
            i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10415p));
            I8 i822 = I8.NONE;
            if (i4 != 0) {
            }
            i8 = i822;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.f10416q));
            i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10417r));
            EnumC0559da enumC0559da42 = EnumC0559da.FIRST_OCCURRENCE;
            if (i7 != 1) {
            }
            EnumC0559da enumC0559da322 = enumC0559da42;
            i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10418s));
            EnumC0790m9 enumC0790m9222 = EnumC0790m9.NATIVE;
            if (i6 != 0) {
            }
            enumC0790m9 = enumC0790m9222;
            z = false;
            Boolean valueOf9 = Boolean.valueOf(z);
            try {
                i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f10420u));
            } catch (Throwable unused2) {
                i5 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i5);
            int columnIndex = cursor.getColumnIndex(this.v);
            return new C0581e7(valueOf, vk, valueOf22, a32, valueOf32, valueOf42, new C0556d7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, i8, string522, enumC0559da322, enumC0790m9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i5);
            int columnIndex2 = cursor.getColumnIndex(this.v);
            return new C0581e7(valueOf, vk, valueOf22, a32, valueOf32, valueOf42, new C0556d7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, i8, string522, enumC0559da322, enumC0790m9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}
