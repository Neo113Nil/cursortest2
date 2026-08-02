package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* loaded from: classes.dex */
public final class P4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f6429a = 2000;

    /* renamed from: b, reason: collision with root package name */
    public final String f6430b = "number";

    /* renamed from: c, reason: collision with root package name */
    public final String f6431c = "global_number";

    /* renamed from: d, reason: collision with root package name */
    public final String f6432d = "number_of_type";

    /* renamed from: e, reason: collision with root package name */
    public final String f6433e = "name";
    public final String f = "value";

    /* renamed from: g, reason: collision with root package name */
    public final String f6434g = "type";

    /* renamed from: h, reason: collision with root package name */
    public final String f6435h = "time";

    /* renamed from: i, reason: collision with root package name */
    public final String f6436i = "session_id";

    /* renamed from: j, reason: collision with root package name */
    public final String f6437j = "error_environment";

    /* renamed from: k, reason: collision with root package name */
    public final String f6438k = "session_type";

    /* renamed from: l, reason: collision with root package name */
    public final String f6439l = "app_environment";

    /* renamed from: m, reason: collision with root package name */
    public final String f6440m = "app_environment_revision";

    /* renamed from: n, reason: collision with root package name */
    public final String f6441n = "truncated";
    public final String o = "custom_type";

    /* renamed from: p, reason: collision with root package name */
    public final String f6442p = "encrypting_mode";

    /* renamed from: q, reason: collision with root package name */
    public final String f6443q = "profile_id";

    /* renamed from: r, reason: collision with root package name */
    public final String f6444r = "first_occurrence_status";

    /* renamed from: s, reason: collision with root package name */
    public final String f6445s = AdRevenueConstants.SOURCE_KEY;

    /* renamed from: t, reason: collision with root package name */
    public final String f6446t = "attribution_id_changed";

    /* renamed from: u, reason: collision with root package name */
    public final String f6447u = "open_id";
    public final String v = "extras";

    /* renamed from: w, reason: collision with root package name */
    public final String f6448w = "reports";

    /* renamed from: x, reason: collision with root package name */
    public final C0692n7 f6449x = new C0692n7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C0666m7 c0666m7) {
        Long l3;
        EnumC0567ib enumC0567ib;
        Long l4;
        Long l5;
        Long l6 = c0666m7.f7858a;
        if (l6 == null || l6.longValue() < 10000000000L || c0666m7.f7859b == null || (l3 = c0666m7.f7860c) == null || l3.longValue() < 0 || (enumC0567ib = c0666m7.f7861d) == null || enumC0567ib == EnumC0567ib.EVENT_TYPE_UNDEFINED || (l4 = c0666m7.f7862e) == null || l4.longValue() < 0 || (l5 = c0666m7.f) == null || l5.longValue() < 0) {
            return false;
        }
        Long l7 = c0666m7.f7863g.f7760d;
        if (l7 != null && l7.longValue() < 0) {
            return false;
        }
        Integer num = c0666m7.f7863g.f7764i;
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
                cursor = sQLiteDatabase2.query(this.f6448w, null, null, null, null, null, null, String.valueOf(this.f6429a));
                while (cursor.moveToNext()) {
                    try {
                        C0666m7 a3 = a(cursor);
                        if (a3 != null && a(a3)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.f6449x.fromModel(a3));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor = cursor2;
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f6448w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f6448w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:2|3|(2:57|(1:59)(15:60|6|(2:50|(1:52)(2:53|(1:55)(12:56|9|10|11|(2:43|(1:45)(2:46|47))|13|14|15|(2:38|(3:40|18|19))|17|18|19)))|8|9|10|11|(0)|13|14|15|(0)|17|18|19))|5|6|(0)|8|9|10|11|(0)|13|14|15|(0)|17|18|19|(3:(9:21|22|23|24|25|(1:27)(1:33)|28|29|30)|(0)|(5:25|(0)(0)|28|29|30))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012d, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.f6446t)) != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r4 = io.appmetrica.analytics.impl.EnumC0849t9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC0617ka.UNKNOWN;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118 A[Catch: all -> 0x0120, TRY_LEAVE, TryCatch #2 {all -> 0x0120, blocks: (B:15:0x0107, B:38:0x0118), top: B:14:0x0107, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb A[Catch: all -> 0x0104, TryCatch #3 {all -> 0x0104, blocks: (B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:10:0x00ea, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[Catch: all -> 0x0167, TryCatch #4 {all -> 0x0167, blocks: (B:3:0x0005, B:6:0x002a, B:9:0x00e0, B:22:0x0131, B:25:0x0141, B:28:0x0156, B:33:0x0150, B:42:0x0120, B:49:0x0104, B:50:0x00d4, B:53:0x00d9, B:57:0x0024, B:15:0x0107, B:38:0x0118, B:11:0x00ea, B:43:0x00fb, B:46:0x0100), top: B:2:0x0005, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0666m7 a(Cursor cursor) {
        EnumC0370al enumC0370al;
        int i3;
        N8 n8;
        EnumC0849t9 enumC0849t9;
        int i4;
        int i5;
        int i6;
        try {
            Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6436i)));
            int i7 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6438k));
            EnumC0370al enumC0370al2 = EnumC0370al.FOREGROUND;
            boolean z = true;
            try {
                if (i7 != 0) {
                    enumC0370al2 = EnumC0370al.BACKGROUND;
                    if (i7 != 1) {
                        enumC0370al = null;
                        Long valueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6430b)));
                        EnumC0567ib a3 = EnumC0567ib.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6434g)));
                        Long valueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6431c)));
                        Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6435h)));
                        Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
                        String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f6433e));
                        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
                        Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6432d)));
                        String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6437j));
                        String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6439l));
                        Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6440m)));
                        Integer valueOf8 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6441n)));
                        i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6442p));
                        N8 n82 = N8.NONE;
                        if (i3 != 0) {
                            n82 = N8.AES_VALUE_ENCRYPTION;
                            if (i3 != 2) {
                                n82 = N8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                                if (i3 != 1) {
                                    n8 = null;
                                    String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6443q));
                                    i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6444r));
                                    EnumC0617ka enumC0617ka = EnumC0617ka.FIRST_OCCURRENCE;
                                    if (i6 != 1) {
                                        enumC0617ka = EnumC0617ka.NON_FIRST_OCCURENCE;
                                        if (i6 != 2) {
                                            EnumC0617ka enumC0617ka2 = EnumC0617ka.UNKNOWN;
                                            enumC0617ka = enumC0617ka2;
                                        }
                                    }
                                    EnumC0617ka enumC0617ka3 = enumC0617ka;
                                    i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6445s));
                                    EnumC0849t9 enumC0849t92 = EnumC0849t9.NATIVE;
                                    if (i5 != 0) {
                                        enumC0849t92 = EnumC0849t9.JS;
                                        if (i5 != 1) {
                                            enumC0849t9 = null;
                                        }
                                    }
                                    enumC0849t9 = enumC0849t92;
                                }
                            }
                        }
                        n8 = n82;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6443q));
                        i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6444r));
                        EnumC0617ka enumC0617ka4 = EnumC0617ka.FIRST_OCCURRENCE;
                        if (i6 != 1) {
                        }
                        EnumC0617ka enumC0617ka32 = enumC0617ka4;
                        i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6445s));
                        EnumC0849t9 enumC0849t922 = EnumC0849t9.NATIVE;
                        if (i5 != 0) {
                        }
                        enumC0849t9 = enumC0849t922;
                    }
                }
            } catch (Throwable unused) {
            }
            enumC0370al = enumC0370al2;
            Long valueOf22 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6430b)));
            EnumC0567ib a32 = EnumC0567ib.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6434g)));
            Long valueOf32 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6431c)));
            Long valueOf42 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6435h)));
            Integer valueOf52 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6433e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6432d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6437j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6439l));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f6440m)));
            Integer valueOf82 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f6441n)));
            i3 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6442p));
            N8 n822 = N8.NONE;
            if (i3 != 0) {
            }
            n8 = n822;
            String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.f6443q));
            i6 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6444r));
            EnumC0617ka enumC0617ka42 = EnumC0617ka.FIRST_OCCURRENCE;
            if (i6 != 1) {
            }
            EnumC0617ka enumC0617ka322 = enumC0617ka42;
            i5 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6445s));
            EnumC0849t9 enumC0849t9222 = EnumC0849t9.NATIVE;
            if (i5 != 0) {
            }
            enumC0849t9 = enumC0849t9222;
            z = false;
            Boolean valueOf9 = Boolean.valueOf(z);
            try {
                i4 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f6447u));
            } catch (Throwable unused2) {
                i4 = -1;
            }
            Integer valueOf10 = Integer.valueOf(i4);
            int columnIndex = cursor.getColumnIndex(this.v);
            return new C0666m7(valueOf, enumC0370al, valueOf22, a32, valueOf32, valueOf42, new C0640l7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, n8, string522, enumC0617ka322, enumC0849t9, valueOf9, valueOf10, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf102 = Integer.valueOf(i4);
            int columnIndex2 = cursor.getColumnIndex(this.v);
            return new C0666m7(valueOf, enumC0370al, valueOf22, a32, valueOf32, valueOf42, new C0640l7(valueOf52, string6, string22, valueOf62, null, string32, string42, valueOf72, valueOf82, null, null, n8, string522, enumC0617ka322, enumC0849t9, valueOf9, valueOf102, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}
