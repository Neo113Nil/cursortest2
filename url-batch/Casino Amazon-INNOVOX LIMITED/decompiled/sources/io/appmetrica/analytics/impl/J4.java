package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.opentelemetry.sdk.metrics.internal.state.MetricStorage;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes3.dex */
public final class J4 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final int f900a = MetricStorage.DEFAULT_MAX_CARDINALITY;
    public final String b = "number";
    public final String c = "global_number";
    public final String d = "number_of_type";
    public final String e = "name";
    public final String f = "value";
    public final String g = WebViewManager.EVENT_TYPE_KEY;
    public final String h = InfluenceConstants.TIME;
    public final String i = "session_id";
    public final String j = "error_environment";
    public final String k = "session_type";
    public final String l = "app_environment";
    public final String m = "app_environment_revision";
    public final String n = "truncated";
    public final String o = "custom_type";
    public final String p = "encrypting_mode";
    public final String q = "profile_id";
    public final String r = "first_occurrence_status";
    public final String s = "source";
    public final String t = "attribution_id_changed";
    public final String u = "open_id";
    public final String v = "extras";
    public final String w = "reports";
    public final C0194g7 x = new C0194g7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C0168f7 c0168f7) {
        Long l;
        EnumC0095cb enumC0095cb;
        Long l2;
        Long l3;
        Long l4 = c0168f7.f1252a;
        if (l4 == null || l4.longValue() < RealConnection.IDLE_CONNECTION_HEALTHY_NS || c0168f7.b == null || (l = c0168f7.c) == null || l.longValue() < 0 || (enumC0095cb = c0168f7.d) == null || enumC0095cb == EnumC0095cb.EVENT_TYPE_UNDEFINED || (l2 = c0168f7.e) == null || l2.longValue() < 0 || (l3 = c0168f7.f) == null || l3.longValue() < 0) {
            return false;
        }
        Long l5 = c0168f7.g.d;
        if (l5 != null && l5.longValue() < 0) {
            return false;
        }
        Integer num = c0168f7.g.i;
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
                cursor = sQLiteDatabase2.query(this.w, null, null, null, null, null, null, String.valueOf(this.f900a));
                while (cursor.moveToNext()) {
                    try {
                        C0168f7 a2 = a(cursor);
                        if (a2 != null && a(a2)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.x.fromModel(a2));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            cursor = cursor2;
                            cursor.close();
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursor.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.w);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:2|3|(1:88)(1:5)|6|(5:(26:86|87|10|(1:82)(1:12)|13|(19:81|78|20|21|22|(10:73|30|31|32|(4:65|61|39|40)|35|(1:37)(1:59)|38|39|40)|25|(10:70|30|31|32|(1:34)(5:63|65|61|39|40)|35|(0)(0)|38|39|40)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|16|(19:77|78|20|21|22|(1:24)(11:71|73|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|25|(1:27)(11:68|70|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|19|20|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|(1:15)(20:79|81|78|20|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|(1:18)(20:75|77|78|20|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|39|40)|39|40)|9|10|(0)(0)|13|16|19|20|21|22|(0)(0)|25|(0)(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|38|(3:(0)|(9:42|43|44|45|46|(1:48)(1:54)|49|50|51)|(5:46|(0)(0)|49|50|51))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0179, code lost:
    
        if (r32.getInt(r32.getColumnIndexOrThrow(r31.t)) != 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0165, code lost:
    
        if (r2.intValue() == 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x016b, code lost:
    
        r3 = io.appmetrica.analytics.impl.EnumC0375n9.NATIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013d, code lost:
    
        r2 = io.appmetrica.analytics.impl.EnumC0145ea.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00eb, code lost:
    
        if (r3.intValue() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x002a, code lost:
    
        if (r3.intValue() != 0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019c A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:3:0x0004, B:6:0x002e, B:10:0x003b, B:13:0x00f0, B:16:0x00fc, B:20:0x010a, B:43:0x017d, B:46:0x018d, B:49:0x01a2, B:54:0x019c, B:66:0x016b, B:74:0x013d, B:75:0x0101, B:79:0x00f5, B:82:0x00e7, B:84:0x0033, B:88:0x0026, B:32:0x0142, B:35:0x015c, B:59:0x0161, B:63:0x0155, B:22:0x0114, B:25:0x012e, B:28:0x013a, B:68:0x0133, B:71:0x0127), top: B:2:0x0004, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161 A[Catch: all -> 0x016b, TRY_LEAVE, TryCatch #1 {all -> 0x016b, blocks: (B:32:0x0142, B:35:0x015c, B:59:0x0161, B:63:0x0155), top: B:31:0x0142, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155 A[Catch: all -> 0x016b, TryCatch #1 {all -> 0x016b, blocks: (B:32:0x0142, B:35:0x015c, B:59:0x0161, B:63:0x0155), top: B:31:0x0142, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0133 A[Catch: all -> 0x013d, TryCatch #4 {all -> 0x013d, blocks: (B:22:0x0114, B:25:0x012e, B:28:0x013a, B:68:0x0133, B:71:0x0127), top: B:21:0x0114, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127 A[Catch: all -> 0x013d, TryCatch #4 {all -> 0x013d, blocks: (B:22:0x0114, B:25:0x012e, B:28:0x013a, B:68:0x0133, B:71:0x0127), top: B:21:0x0114, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7 A[Catch: all -> 0x01b4, TryCatch #0 {all -> 0x01b4, blocks: (B:3:0x0004, B:6:0x002e, B:10:0x003b, B:13:0x00f0, B:16:0x00fc, B:20:0x010a, B:43:0x017d, B:46:0x018d, B:49:0x01a2, B:54:0x019c, B:66:0x016b, B:74:0x013d, B:75:0x0101, B:79:0x00f5, B:82:0x00e7, B:84:0x0033, B:88:0x0026, B:32:0x0142, B:35:0x015c, B:59:0x0161, B:63:0x0155, B:22:0x0114, B:25:0x012e, B:28:0x013a, B:68:0x0133, B:71:0x0127), top: B:2:0x0004, inners: #1, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0168f7 a(Cursor cursor) {
        Wk wk;
        Integer valueOf;
        J8 j8;
        J8 j82;
        EnumC0375n9 enumC0375n9;
        int i;
        Integer valueOf2;
        Integer valueOf3;
        try {
            Long valueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.i)));
            Integer valueOf5 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.k)));
            Wk wk2 = Wk.FOREGROUND;
            boolean z = true;
            if (valueOf5 != null) {
            }
            wk2 = Wk.BACKGROUND;
            try {
                if (valueOf5 != null && valueOf5.intValue() == 1) {
                    wk = wk2;
                    Long valueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.b)));
                    EnumC0095cb a2 = EnumC0095cb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.g)));
                    Long valueOf7 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
                    Long valueOf8 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.h)));
                    Integer valueOf9 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
                    String string = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
                    String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
                    Long valueOf10 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
                    String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
                    String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.l));
                    Long valueOf11 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.m)));
                    Integer valueOf12 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
                    valueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.p)));
                    j8 = J8.NONE;
                    if (valueOf != null) {
                    }
                    j8 = J8.AES_VALUE_ENCRYPTION;
                    if (valueOf != null && valueOf.intValue() == 2) {
                        j82 = j8;
                        String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                        valueOf3 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.r)));
                        EnumC0145ea enumC0145ea = EnumC0145ea.FIRST_OCCURRENCE;
                        if (valueOf3 != null && valueOf3.intValue() == 1) {
                            EnumC0145ea enumC0145ea2 = enumC0145ea;
                            valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
                            EnumC0375n9 enumC0375n92 = EnumC0375n9.NATIVE;
                            enumC0375n9 = (valueOf2 == null && valueOf2.intValue() == 0) ? enumC0375n92 : null;
                            enumC0375n92 = EnumC0375n9.JS;
                            if (valueOf2 != null) {
                            }
                        }
                        enumC0145ea = EnumC0145ea.NON_FIRST_OCCURENCE;
                        if (valueOf3 != null && valueOf3.intValue() == 2) {
                            EnumC0145ea enumC0145ea22 = enumC0145ea;
                            valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
                            EnumC0375n9 enumC0375n922 = EnumC0375n9.NATIVE;
                            if (valueOf2 == null) {
                            }
                            enumC0375n922 = EnumC0375n9.JS;
                            if (valueOf2 != null) {
                            }
                        }
                        EnumC0145ea enumC0145ea3 = EnumC0145ea.UNKNOWN;
                        enumC0145ea = enumC0145ea3;
                        EnumC0145ea enumC0145ea222 = enumC0145ea;
                        valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
                        EnumC0375n9 enumC0375n9222 = EnumC0375n9.NATIVE;
                        if (valueOf2 == null) {
                        }
                        enumC0375n9222 = EnumC0375n9.JS;
                        if (valueOf2 != null) {
                        }
                    }
                    j8 = J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                    if (valueOf != null && valueOf.intValue() == 1) {
                        j82 = j8;
                        String string52 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                        valueOf3 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.r)));
                        EnumC0145ea enumC0145ea4 = EnumC0145ea.FIRST_OCCURRENCE;
                        if (valueOf3 != null) {
                            EnumC0145ea enumC0145ea2222 = enumC0145ea4;
                            valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
                            EnumC0375n9 enumC0375n92222 = EnumC0375n9.NATIVE;
                            if (valueOf2 == null) {
                            }
                            enumC0375n92222 = EnumC0375n9.JS;
                            if (valueOf2 != null) {
                            }
                        }
                        enumC0145ea4 = EnumC0145ea.NON_FIRST_OCCURENCE;
                        if (valueOf3 != null) {
                            EnumC0145ea enumC0145ea22222 = enumC0145ea4;
                            valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
                            EnumC0375n9 enumC0375n922222 = EnumC0375n9.NATIVE;
                            if (valueOf2 == null) {
                            }
                            enumC0375n922222 = EnumC0375n9.JS;
                            if (valueOf2 != null) {
                            }
                        }
                        EnumC0145ea enumC0145ea32 = EnumC0145ea.UNKNOWN;
                        enumC0145ea4 = enumC0145ea32;
                        EnumC0145ea enumC0145ea222222 = enumC0145ea4;
                        valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
                        EnumC0375n9 enumC0375n9222222 = EnumC0375n9.NATIVE;
                        if (valueOf2 == null) {
                        }
                        enumC0375n9222222 = EnumC0375n9.JS;
                        if (valueOf2 != null) {
                        }
                    }
                    j82 = null;
                    String string522 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                    valueOf3 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.r)));
                    EnumC0145ea enumC0145ea42 = EnumC0145ea.FIRST_OCCURRENCE;
                    if (valueOf3 != null) {
                    }
                    enumC0145ea42 = EnumC0145ea.NON_FIRST_OCCURENCE;
                    if (valueOf3 != null) {
                    }
                    EnumC0145ea enumC0145ea322 = EnumC0145ea.UNKNOWN;
                    enumC0145ea42 = enumC0145ea322;
                    EnumC0145ea enumC0145ea2222222 = enumC0145ea42;
                    valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
                    EnumC0375n9 enumC0375n92222222 = EnumC0375n9.NATIVE;
                    if (valueOf2 == null) {
                    }
                    enumC0375n92222222 = EnumC0375n9.JS;
                    if (valueOf2 != null) {
                    }
                }
                if (valueOf != null) {
                    j82 = j8;
                    String string5222 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                    valueOf3 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.r)));
                    EnumC0145ea enumC0145ea422 = EnumC0145ea.FIRST_OCCURRENCE;
                    if (valueOf3 != null) {
                    }
                    enumC0145ea422 = EnumC0145ea.NON_FIRST_OCCURENCE;
                    if (valueOf3 != null) {
                    }
                    EnumC0145ea enumC0145ea3222 = EnumC0145ea.UNKNOWN;
                    enumC0145ea422 = enumC0145ea3222;
                    EnumC0145ea enumC0145ea22222222 = enumC0145ea422;
                    valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
                    EnumC0375n9 enumC0375n922222222 = EnumC0375n9.NATIVE;
                    if (valueOf2 == null) {
                    }
                    enumC0375n922222222 = EnumC0375n9.JS;
                    if (valueOf2 != null) {
                    }
                }
                if (valueOf != null) {
                    j82 = j8;
                    String string52222 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
                    valueOf3 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.r)));
                    EnumC0145ea enumC0145ea4222 = EnumC0145ea.FIRST_OCCURRENCE;
                    if (valueOf3 != null) {
                    }
                    enumC0145ea4222 = EnumC0145ea.NON_FIRST_OCCURENCE;
                    if (valueOf3 != null) {
                    }
                    EnumC0145ea enumC0145ea32222 = EnumC0145ea.UNKNOWN;
                    enumC0145ea4222 = enumC0145ea32222;
                    EnumC0145ea enumC0145ea222222222 = enumC0145ea4222;
                    valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
                    EnumC0375n9 enumC0375n9222222222 = EnumC0375n9.NATIVE;
                    if (valueOf2 == null) {
                    }
                    enumC0375n9222222222 = EnumC0375n9.JS;
                    if (valueOf2 != null) {
                    }
                }
            } catch (Throwable unused) {
            }
            wk = null;
            Long valueOf62 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.b)));
            EnumC0095cb a22 = EnumC0095cb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.g)));
            Long valueOf72 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.c)));
            Long valueOf82 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.h)));
            Integer valueOf92 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.o)));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow(this.e));
            String string22 = cursor.getString(cursor.getColumnIndexOrThrow(this.f));
            Long valueOf102 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.d)));
            String string32 = cursor.getString(cursor.getColumnIndexOrThrow(this.j));
            String string42 = cursor.getString(cursor.getColumnIndexOrThrow(this.l));
            Long valueOf112 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.m)));
            Integer valueOf122 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.n)));
            valueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.p)));
            j8 = J8.NONE;
            if (valueOf != null) {
            }
            j8 = J8.AES_VALUE_ENCRYPTION;
            j8 = J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
            j82 = null;
            String string522222 = cursor.getString(cursor.getColumnIndexOrThrow(this.q));
            valueOf3 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.r)));
            EnumC0145ea enumC0145ea42222 = EnumC0145ea.FIRST_OCCURRENCE;
            if (valueOf3 != null) {
            }
            enumC0145ea42222 = EnumC0145ea.NON_FIRST_OCCURENCE;
            if (valueOf3 != null) {
            }
            EnumC0145ea enumC0145ea322222 = EnumC0145ea.UNKNOWN;
            enumC0145ea42222 = enumC0145ea322222;
            EnumC0145ea enumC0145ea2222222222 = enumC0145ea42222;
            valueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.s)));
            EnumC0375n9 enumC0375n92222222222 = EnumC0375n9.NATIVE;
            if (valueOf2 == null) {
            }
            enumC0375n92222222222 = EnumC0375n9.JS;
            if (valueOf2 != null) {
            }
            z = false;
            Boolean valueOf13 = Boolean.valueOf(z);
            try {
                i = cursor.getInt(cursor.getColumnIndexOrThrow(this.u));
            } catch (Throwable unused2) {
                i = -1;
            }
            Integer valueOf14 = Integer.valueOf(i);
            int columnIndex = cursor.getColumnIndex(this.v);
            return new C0168f7(valueOf4, wk, valueOf62, a22, valueOf72, valueOf82, new C0142e7(valueOf92, string6, string22, valueOf102, null, string32, string42, valueOf112, valueOf122, null, null, j82, string522222, enumC0145ea2222222222, enumC0375n9, valueOf13, valueOf14, columnIndex >= 0 ? null : cursor.getBlob(columnIndex)));
            Integer valueOf142 = Integer.valueOf(i);
            int columnIndex2 = cursor.getColumnIndex(this.v);
            return new C0168f7(valueOf4, wk, valueOf62, a22, valueOf72, valueOf82, new C0142e7(valueOf92, string6, string22, valueOf102, null, string32, string42, valueOf112, valueOf122, null, null, j82, string522222, enumC0145ea2222222222, enumC0375n9, valueOf13, valueOf142, columnIndex2 >= 0 ? null : cursor.getBlob(columnIndex2)));
        } catch (Throwable unused3) {
            return null;
        }
    }
}
