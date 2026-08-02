package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
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

/* loaded from: classes.dex */
public final class S6 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f6598a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f6599b;

    /* renamed from: c, reason: collision with root package name */
    public final C0485f7 f6600c;

    /* renamed from: d, reason: collision with root package name */
    public final R6 f6601d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6602e;
    public final ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f6603g;

    /* renamed from: h, reason: collision with root package name */
    public final C0457e5 f6604h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f6605i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f6606j;

    /* renamed from: k, reason: collision with root package name */
    public final O6 f6607k;

    /* renamed from: l, reason: collision with root package name */
    public final C0692n7 f6608l;

    static {
        HashSet hashSet = new HashSet();
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public S6(C0457e5 c0457e5, C0485f7 c0485f7, O6 o6, C0692n7 c0692n7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f6598a = reentrantReadWriteLock.readLock();
        this.f6599b = reentrantReadWriteLock.writeLock();
        this.f6602e = new Object();
        this.f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f6605i = atomicLong;
        this.f6606j = new ArrayList();
        this.f6600c = c0485f7;
        this.f6603g = c0457e5.getContext();
        this.f6604h = c0457e5;
        this.f6607k = o6;
        this.f6608l = c0692n7;
        atomicLong.set(c());
        R6 r6 = new R6(this, c0457e5);
        this.f6601d = r6;
        r6.setName(a(c0457e5));
    }

    public final long a(Set set) {
        this.f6598a.lock();
        Cursor cursor = null;
        long j3 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f6600c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i3 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i3++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), null);
                if (cursor.moveToFirst()) {
                    j3 = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC0709no.a(cursor);
        this.f6598a.unlock();
        return j3;
    }

    public final long b() {
        this.f6598a.lock();
        try {
            return this.f6605i.get();
        } finally {
            this.f6598a.unlock();
        }
    }

    public final long c() {
        long j3;
        SQLiteDatabase readableDatabase;
        this.f6598a.lock();
        try {
            readableDatabase = this.f6600c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j3 = DBUtils.queryRowsCount(readableDatabase, "events");
            this.f6598a.unlock();
            return j3;
        }
        j3 = 0;
        this.f6598a.unlock();
        return j3;
    }

    public final void d() {
        Cursor cursor;
        Cursor cursor2;
        this.f6598a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.f6600c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor2 = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor2.moveToNext()) {
                        stringBuffer.append(cursor2.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursor3 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursor3.moveToNext()) {
                        stringBuffer2.append(cursor3.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursor3;
                    cursor3 = cursor2;
                    cursor2 = cursor3;
                    cursor3 = cursor;
                    this.f6598a.unlock();
                    AbstractC0709no.a(cursor2);
                    AbstractC0709no.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f6598a.unlock();
        AbstractC0709no.a(cursor2);
        AbstractC0709no.a(cursor3);
    }

    public final void e() {
        this.f6601d.start();
    }

    public final void a(X8 x8) {
        this.f6606j.add(x8);
    }

    public static String a(La la) {
        return "DatabaseWorker [" + la.b().e() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j3, EnumC0370al enumC0370al, long j4) {
        JSONObject jSONObject;
        boolean b3;
        B7 b7 = new B7(null, 1, 0 == true ? 1 : 0);
        C0754ph c0754ph = (C0754ph) this.f6604h.f7234k.a();
        Long valueOf = Long.valueOf(j3);
        Long valueOf2 = Long.valueOf(j4);
        try {
            jSONObject = new JSONObject().put("dId", c0754ph.getDeviceId()).put("uId", c0754ph.getUuid()).put("appVer", c0754ph.getAppVersion()).put("appBuild", c0754ph.getAppBuildNumber()).put("kitBuildType", c0754ph.getAnalyticsSdkBuildType()).put("osVer", c0754ph.getOsVersion()).put("osApiLev", c0754ph.getOsApiLevel()).put("lang", c0754ph.getLocale()).put("root", c0754ph.getDeviceRootStatus()).put("app_debuggable", ((U5) c0754ph).f6755a).put(CommonUrlParts.APP_FRAMEWORK, c0754ph.getAppFramework()).put("attribution_id", c0754ph.f8094r).put("analyticsSdkVersionName", c0754ph.getAnalyticsSdkVersionName()).put("kitBuildNumber", c0754ph.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(Kn.a());
        C0421ck c0421ck = AbstractC0395bk.f7096a;
        synchronized (c0421ck) {
            b3 = c0421ck.f7150b.b(true);
        }
        ContentValues fromModel = b7.fromModel(new A7(valueOf, enumC0370al, jSONObject2, new C1001z7(valueOf2, valueOf3, Boolean.valueOf(b3))));
        if (fromModel == null) {
            return;
        }
        this.f6599b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f6600c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f6599b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f6602e) {
            this.f.add(contentValues);
        }
        synchronized (this.f6601d) {
            this.f6601d.notifyAll();
        }
    }

    public final void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f6599b.lock();
            if (this.f6605i.get() > ((C0754ph) this.f6604h.f7234k.a()).v && (writableDatabase = this.f6600c.getWritableDatabase()) != null) {
                int a3 = a(writableDatabase);
                this.f6605i.addAndGet(-a3);
                if (a3 != 0) {
                    Iterator it = this.f6606j.iterator();
                    while (it.hasNext()) {
                        ((X8) it.next()).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f6599b.unlock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f6607k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", D9.f5893i), TextUtils.join(", ", D9.f5894j), 10), 2, this.f6604h.f7226b.f6861b, true).f6324b;
        } catch (Throwable th) {
            Vj vj = AbstractC0859tj.f8379a;
            vj.getClass();
            vj.a(new C0885uj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j3, int i3, int i4, boolean z) {
        if (i4 <= 0) {
            return;
        }
        this.f6599b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j3), "session_type", Integer.toString(i3), "id", "events", Integer.toString(i4 - 1));
            SQLiteDatabase writableDatabase = this.f6600c.getWritableDatabase();
            if (writableDatabase != null) {
                M6 a3 = this.f6607k.a(writableDatabase, format, 1, this.f6604h.f7226b.f6861b, z);
                if (a3.f6323a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a3.f6323a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.f6606j.iterator();
                    while (it2.hasNext()) {
                        ((X8) it2.next()).b(arrayList);
                    }
                }
                List list = a3.f6323a;
                if (list != null) {
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        a((ContentValues) list.get(i5), "Event removed from db");
                    }
                }
                this.f6605i.addAndGet(-a3.f6324b);
            }
        } catch (Throwable unused) {
        }
        this.f6599b.unlock();
    }

    public final ContentValues a(long j3, EnumC0370al enumC0370al) {
        ContentValues contentValues = new ContentValues();
        this.f6598a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f6600c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j3 + " AND type = " + enumC0370al.f7037a + " ORDER BY id DESC LIMIT 1", null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC0709no.a(cursor);
        this.f6598a.unlock();
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
        Integer asInteger = contentValues.getAsInteger("type");
        if (D9.f5889d.contains(EnumC0567ib.a(asInteger != null ? asInteger.intValue() : -1))) {
            C0666m7 model = new C0692n7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f6604h.f7236m;
            EnumC0567ib enumC0567ib = model.f7861d;
            C0640l7 c0640l7 = model.f7863g;
            publicLogger.info(Vf.a(str, enumC0567ib, c0640l7.f7758b, c0640l7.f7759c), new Object[0]);
        }
    }

    public static boolean a(S6 s6) {
        boolean isEmpty;
        synchronized (s6.f6602e) {
            isEmpty = s6.f.isEmpty();
        }
        return isEmpty;
    }
}
