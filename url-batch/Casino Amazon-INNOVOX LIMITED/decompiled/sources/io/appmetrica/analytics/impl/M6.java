package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class M6 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f950a;
    public final ReentrantReadWriteLock.WriteLock b;
    public final Z6 c;
    public final L6 d;
    public final Object e;
    public final ArrayList f;
    public final Context g;
    public final Y4 h;
    public final AtomicLong i;
    public final ArrayList j;
    public final I6 k;
    public final C0194g7 l;

    static {
        HashSet hashSet = new HashSet();
        EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public M6(Y4 y4, Z6 z6, I6 i6, C0194g7 c0194g7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f950a = reentrantReadWriteLock.readLock();
        this.b = reentrantReadWriteLock.writeLock();
        this.e = new Object();
        this.f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.i = atomicLong;
        this.j = new ArrayList();
        this.c = z6;
        this.g = y4.getContext();
        this.h = y4;
        this.k = i6;
        this.l = c0194g7;
        atomicLong.set(b());
        L6 l6 = new L6(this, y4);
        this.d = l6;
        l6.setName(a(y4));
    }

    public final long a() {
        this.f950a.lock();
        try {
            return this.i.get();
        } finally {
            this.f950a.unlock();
        }
    }

    public final long b() {
        long j;
        SQLiteDatabase readableDatabase;
        this.f950a.lock();
        try {
            readableDatabase = this.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j = DBUtils.queryRowsCount(readableDatabase, "events");
            this.f950a.unlock();
            return j;
        }
        j = 0;
        this.f950a.unlock();
        return j;
    }

    public final void c() {
        Cursor cursor;
        Cursor cursor2;
        this.f950a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor2 = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor2.moveToNext()) {
                        stringBuffer.append(cursor2.getString(0)).append(", ");
                    }
                    cursor3 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursor3.moveToNext()) {
                        stringBuffer2.append(cursor3.getString(0)).append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursor3;
                    cursor3 = cursor2;
                    cursor2 = cursor3;
                    cursor3 = cursor;
                    this.f950a.unlock();
                    mo.a(cursor2);
                    mo.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f950a.unlock();
        mo.a(cursor2);
        mo.a(cursor3);
    }

    public final void d() {
        this.d.start();
    }

    public final long a(Set set) {
        this.f950a.lock();
        Cursor cursor = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), null);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        mo.a(cursor);
        this.f950a.unlock();
        return j;
    }

    public final void a(T8 t8) {
        this.j.add(t8);
    }

    public static String a(Fa fa) {
        return "DatabaseWorker [" + fa.b().e() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j, Wk wk, long j2) {
        JSONObject jSONObject;
        boolean b;
        C0547u7 c0547u7 = new C0547u7(null, 1, 0 == true ? 1 : 0);
        C0333lh c0333lh = (C0333lh) this.h.k.a();
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j2);
        try {
            jSONObject = new JSONObject().put("dId", c0333lh.getDeviceId()).put("uId", c0333lh.getUuid()).put("appVer", c0333lh.getAppVersion()).put("appBuild", c0333lh.getAppBuildNumber()).put("kitBuildType", c0333lh.getAnalyticsSdkBuildType()).put("osVer", c0333lh.getOsVersion()).put("osApiLev", c0333lh.getOsApiLevel()).put("lang", c0333lh.getLocale()).put("root", c0333lh.getDeviceRootStatus()).put("app_debuggable", ((O5) c0333lh).f983a).put(CommonUrlParts.APP_FRAMEWORK, c0333lh.getAppFramework()).put("attribution_id", c0333lh.r).put("analyticsSdkVersionName", c0333lh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c0333lh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(Jn.a());
        Yj yj = Xj.f1118a;
        synchronized (yj) {
            b = yj.b.b(true);
        }
        ContentValues fromModel = c0547u7.fromModel(new C0522t7(valueOf, wk, jSONObject2, new C0497s7(valueOf2, valueOf3, Boolean.valueOf(b))));
        if (fromModel == null) {
            return;
        }
        this.b.lock();
        try {
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.e) {
            this.f.add(contentValues);
        }
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC0624x9.i), TextUtils.join(", ", AbstractC0624x9.j), 10), 2, this.h.b.b, true).b;
        } catch (Throwable th) {
            Rj rj = AbstractC0435pj.f1437a;
            rj.getClass();
            rj.a(new C0460qj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j, int i, int i2, boolean z) {
        if (i2 <= 0) {
            return;
        }
        this.b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j), "session_type", Integer.toString(i), "id", "events", Integer.toString(i2 - 1));
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            if (writableDatabase != null) {
                G6 a2 = this.k.a(writableDatabase, format, 1, this.h.b.b, z);
                if (a2.f856a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a2.f856a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((ContentValues) it.next()).getAsInteger(WebViewManager.EVENT_TYPE_KEY).intValue()));
                    }
                    Iterator it2 = this.j.iterator();
                    while (it2.hasNext()) {
                        ((T8) it2.next()).b(arrayList);
                    }
                }
                List list = a2.f856a;
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        a((ContentValues) list.get(i3), "Event removed from db");
                    }
                }
                this.i.addAndGet(-a2.b);
            }
        } catch (Throwable unused) {
        }
        this.b.unlock();
    }

    public final ContentValues a(long j, Wk wk) {
        ContentValues contentValues = new ContentValues();
        this.f950a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", Long.valueOf(j), Integer.valueOf(wk.f1108a)), null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        mo.a(cursor);
        this.f950a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger(WebViewManager.EVENT_TYPE_KEY);
        if (AbstractC0624x9.d.contains(EnumC0095cb.a(asInteger != null ? asInteger.intValue() : -1))) {
            C0168f7 model = new C0194g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.h.m;
            EnumC0095cb enumC0095cb = model.d;
            C0142e7 c0142e7 = model.g;
            publicLogger.info(Rf.a(str, enumC0095cb, c0142e7.b, c0142e7.c), new Object[0]);
        }
    }

    public static boolean a(M6 m6) {
        boolean isEmpty;
        synchronized (m6.e) {
            isEmpty = m6.f.isEmpty();
        }
        return isEmpty;
    }
}
