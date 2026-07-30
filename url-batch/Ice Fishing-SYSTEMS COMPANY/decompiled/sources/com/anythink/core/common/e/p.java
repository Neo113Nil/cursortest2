package com.anythink.core.common.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.anythink.core.common.h.bo;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class p extends c<bo> {

    /* renamed from: b, reason: collision with root package name */
    private static volatile p f13231b;

    /* renamed from: a, reason: collision with root package name */
    private final String f13232a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f13233a = "placement_ad_impression";

        /* renamed from: b, reason: collision with root package name */
        public static final String f13234b = "format";

        /* renamed from: c, reason: collision with root package name */
        public static final String f13235c = "placement_id";

        /* renamed from: d, reason: collision with root package name */
        public static final String f13236d = "adsource_id";

        /* renamed from: e, reason: collision with root package name */
        public static final String f13237e = "hour_time";

        /* renamed from: f, reason: collision with root package name */
        public static final String f13238f = "hour_imp";

        /* renamed from: g, reason: collision with root package name */
        public static final String f13239g = "date_time";

        /* renamed from: h, reason: collision with root package name */
        public static final String f13240h = "date_imp";
        public static final String i = "show_time";

        /* renamed from: j, reason: collision with root package name */
        public static final String f13241j = "CREATE TABLE IF NOT EXISTS placement_ad_impression(format INTEGER ,placement_id TEXT ,adsource_id TEXT ,hour_time TEXT ,hour_imp INTEGER ,date_time TEXT ,date_imp INTEGER , show_time INTEGER)";
    }

    private p(d dVar) {
        super(dVar);
        this.f13232a = p.class.getName();
    }

    public static p a(d dVar) {
        if (f13231b == null) {
            synchronized (p.class) {
                try {
                    if (f13231b == null) {
                        f13231b = new p(dVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13231b;
    }

    private boolean b(String str) {
        Cursor query = c().query(a.f13233a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{str}, "adsource_id", null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query == null) {
            return false;
        }
        query.close();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r2 = c().query(com.anythink.core.common.e.p.a.f13233a, new java.lang.String[]{"sum(hour_imp)"}, "format=? AND hour_time=?", new java.lang.String[]{java.lang.String.valueOf(r12), r14}, null, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r2.getCount() <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r2.moveToNext();
        r0[1] = r2.getInt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r2.getCount() <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r2 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        java.lang.System.gc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r2 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if (r2 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005a, code lost:
    
        if (r2 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004f, code lost:
    
        if (r2 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0049, code lost:
    
        if (r2 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int[] a(int i, String str, String str2) {
        int[] iArr;
        iArr = new int[2];
        Cursor cursor = null;
        try {
            try {
                cursor = c().query(a.f13233a, new String[]{"sum(date_imp)"}, "format=? AND date_time=?", new String[]{String.valueOf(i), str}, null, null, null);
                if (cursor != null && cursor.getCount() > 0) {
                    cursor.moveToNext();
                    iArr[0] = cursor.getInt(0);
                }
                if (cursor != null && cursor.getCount() > 0) {
                    cursor.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        } catch (OutOfMemoryError unused2) {
            System.gc();
        } catch (Throwable unused3) {
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e2, code lost:
    
        if (r10 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        if (r10 == null) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized bo a(String str, String str2, String str3) {
        Cursor cursor;
        bo boVar;
        try {
            cursor = c().query(a.f13233a, null, "placement_id=? AND date_time=?", new String[]{str, str2}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        boVar = new bo();
                        boVar.f13884h = new ConcurrentHashMap<>();
                        while (cursor.moveToNext()) {
                            boVar.f13877a = cursor.getInt(cursor.getColumnIndex("format"));
                            boVar.f13878b = cursor.getString(cursor.getColumnIndex("placement_id"));
                            bo.a aVar = new bo.a();
                            aVar.f13885a = cursor.getString(cursor.getColumnIndex("adsource_id"));
                            aVar.f13886b = cursor.getString(cursor.getColumnIndex(a.f13237e));
                            aVar.f13887c = cursor.getString(cursor.getColumnIndex(a.f13239g));
                            if (!TextUtils.equals(aVar.f13886b, str3)) {
                                aVar.f13889e = 0;
                            } else {
                                aVar.f13889e = cursor.getInt(cursor.getColumnIndex(a.f13238f));
                            }
                            boVar.f13880d += aVar.f13889e;
                            if (!TextUtils.equals(aVar.f13887c, str2)) {
                                aVar.f13888d = 0;
                            } else {
                                aVar.f13888d = cursor.getInt(cursor.getColumnIndex(a.f13240h));
                            }
                            boVar.f13879c += aVar.f13888d;
                            long j9 = cursor.getLong(cursor.getColumnIndex("show_time"));
                            aVar.f13890f = j9;
                            if (j9 >= boVar.f13881e) {
                                boVar.f13881e = j9;
                            }
                            boVar.f13884h.put(aVar.f13885a, aVar);
                        }
                        cursor.close();
                        cursor.close();
                        return boVar;
                    }
                } catch (Exception unused) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                } catch (OutOfMemoryError unused2) {
                    try {
                        System.gc();
                    } finally {
                    }
                } catch (Throwable unused3) {
                }
            }
            boVar = null;
            cursor.close();
            cursor.close();
            return boVar;
        } catch (Exception unused4) {
            cursor = null;
        } catch (OutOfMemoryError unused5) {
            cursor = null;
        } catch (Throwable unused6) {
            cursor = null;
        }
    }

    private synchronized long a(int i, String str, bo.a aVar) {
        if (d() == null || aVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("format", Integer.valueOf(i));
            contentValues.put("placement_id", str);
            contentValues.put("adsource_id", aVar.f13885a);
            contentValues.put(a.f13237e, aVar.f13886b);
            contentValues.put(a.f13238f, Integer.valueOf(aVar.f13889e));
            contentValues.put(a.f13239g, aVar.f13887c);
            contentValues.put(a.f13240h, Integer.valueOf(aVar.f13888d));
            contentValues.put("show_time", Long.valueOf(aVar.f13890f));
            Cursor query = c().query(a.f13233a, new String[]{"adsource_id"}, "adsource_id=?", new String[]{aVar.f13885a}, "adsource_id", null, null);
            if (query != null && query.getCount() > 0) {
                query.close();
                return d().update(a.f13233a, contentValues, "adsource_id = ? ", new String[]{aVar.f13885a});
            }
            if (query != null) {
                query.close();
            }
            return d().insert(a.f13233a, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private static bo a(Cursor cursor, String str, String str2) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        bo boVar = new bo();
        boVar.f13884h = new ConcurrentHashMap<>();
        while (cursor.moveToNext()) {
            boVar.f13877a = cursor.getInt(cursor.getColumnIndex("format"));
            boVar.f13878b = cursor.getString(cursor.getColumnIndex("placement_id"));
            bo.a aVar = new bo.a();
            aVar.f13885a = cursor.getString(cursor.getColumnIndex("adsource_id"));
            aVar.f13886b = cursor.getString(cursor.getColumnIndex(a.f13237e));
            aVar.f13887c = cursor.getString(cursor.getColumnIndex(a.f13239g));
            if (!TextUtils.equals(aVar.f13886b, str2)) {
                aVar.f13889e = 0;
            } else {
                aVar.f13889e = cursor.getInt(cursor.getColumnIndex(a.f13238f));
            }
            boVar.f13880d += aVar.f13889e;
            if (!TextUtils.equals(aVar.f13887c, str)) {
                aVar.f13888d = 0;
            } else {
                aVar.f13888d = cursor.getInt(cursor.getColumnIndex(a.f13240h));
            }
            boVar.f13879c += aVar.f13888d;
            long j9 = cursor.getLong(cursor.getColumnIndex("show_time"));
            aVar.f13890f = j9;
            if (j9 >= boVar.f13881e) {
                boVar.f13881e = j9;
            }
            boVar.f13884h.put(aVar.f13885a, aVar);
        }
        return boVar;
    }

    public final void a(String str) {
        String str2;
        synchronized (this) {
            try {
                str2 = "date_time!='" + str + "'";
            } catch (Exception unused) {
            }
            if (d() == null) {
                return;
            }
            d().delete(a.f13233a, str2, null);
        }
    }
}
