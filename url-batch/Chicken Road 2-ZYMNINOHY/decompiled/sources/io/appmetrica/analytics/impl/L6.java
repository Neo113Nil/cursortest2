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
public final class L6 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f10566a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f10567b;

    /* renamed from: c, reason: collision with root package name */
    public final Y6 f10568c;

    /* renamed from: d, reason: collision with root package name */
    public final K6 f10569d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10570e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f10571f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f10572g;

    /* renamed from: h, reason: collision with root package name */
    public final X4 f10573h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f10574i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f10575j;

    /* renamed from: k, reason: collision with root package name */
    public final H6 f10576k;

    /* renamed from: l, reason: collision with root package name */
    public final C0607f7 f10577l;

    static {
        HashSet hashSet = new HashSet();
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public L6(X4 x4, Y6 y6, H6 h6, C0607f7 c0607f7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f10566a = reentrantReadWriteLock.readLock();
        this.f10567b = reentrantReadWriteLock.writeLock();
        this.f10570e = new Object();
        this.f10571f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f10574i = atomicLong;
        this.f10575j = new ArrayList();
        this.f10568c = y6;
        this.f10572g = x4.getContext();
        this.f10573h = x4;
        this.f10576k = h6;
        this.f10577l = c0607f7;
        atomicLong.set(b());
        K6 k6 = new K6(this, x4);
        this.f10569d = k6;
        k6.setName(a(x4));
    }

    public final long a() {
        this.f10566a.lock();
        try {
            return this.f10574i.get();
        } finally {
            this.f10566a.unlock();
        }
    }

    public final long b() {
        long j4;
        SQLiteDatabase readableDatabase;
        this.f10566a.lock();
        try {
            readableDatabase = this.f10568c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j4 = DBUtils.queryRowsCount(readableDatabase, "events");
            this.f10566a.unlock();
            return j4;
        }
        j4 = 0;
        this.f10566a.unlock();
        return j4;
    }

    public final void c() {
        Cursor cursor;
        Cursor cursor2;
        this.f10566a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.f10568c.getReadableDatabase();
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
                    this.f10566a.unlock();
                    AbstractC0779lo.a(cursor2);
                    AbstractC0779lo.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f10566a.unlock();
        AbstractC0779lo.a(cursor2);
        AbstractC0779lo.a(cursor3);
    }

    public final void d() {
        this.f10569d.start();
    }

    public final long a(Set set) {
        this.f10566a.lock();
        Cursor cursor = null;
        long j4 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f10568c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i4 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i4 > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i4++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), null);
                if (cursor.moveToFirst()) {
                    j4 = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC0779lo.a(cursor);
        this.f10566a.unlock();
        return j4;
    }

    public final void a(S8 s8) {
        this.f10575j.add(s8);
    }

    public static String a(Ea ea) {
        return "DatabaseWorker [" + ea.b().e() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j4, Vk vk, long j5) {
        JSONObject jSONObject;
        boolean b4;
        C0969t7 c0969t7 = new C0969t7(null, 1, 0 == true ? 1 : 0);
        C0746kh c0746kh = (C0746kh) this.f10573h.f11232k.a();
        Long valueOf = Long.valueOf(j4);
        Long valueOf2 = Long.valueOf(j5);
        try {
            jSONObject = new JSONObject().put("dId", c0746kh.getDeviceId()).put("uId", c0746kh.getUuid()).put("appVer", c0746kh.getAppVersion()).put("appBuild", c0746kh.getAppBuildNumber()).put("kitBuildType", c0746kh.getAnalyticsSdkBuildType()).put("osVer", c0746kh.getOsVersion()).put("osApiLev", c0746kh.getOsApiLevel()).put("lang", c0746kh.getLocale()).put("root", c0746kh.getDeviceRootStatus()).put("app_debuggable", ((N5) c0746kh).f10689a).put(CommonUrlParts.APP_FRAMEWORK, c0746kh.getAppFramework()).put("attribution_id", c0746kh.f12234r).put("analyticsSdkVersionName", c0746kh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c0746kh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(In.a());
        Xj xj = Wj.f11193a;
        synchronized (xj) {
            b4 = xj.f11273b.b(true);
        }
        ContentValues fromModel = c0969t7.fromModel(new C0943s7(valueOf, vk, jSONObject2, new C0917r7(valueOf2, valueOf3, Boolean.valueOf(b4))));
        if (fromModel == null) {
            return;
        }
        this.f10567b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f10568c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f10567b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f10570e) {
            this.f10571f.add(contentValues);
        }
        synchronized (this.f10569d) {
            this.f10569d.notifyAll();
        }
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f10576k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC1049w9.f12932i), TextUtils.join(", ", AbstractC1049w9.f12933j), 10), 2, this.f10573h.f11223b.f10837b, true).f10274b;
        } catch (Throwable th) {
            Qj qj = AbstractC0852oj.f12527a;
            qj.getClass();
            qj.a(new C0878pj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j4, int i4, int i5, boolean z) {
        if (i5 <= 0) {
            return;
        }
        this.f10567b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j4), "session_type", Integer.toString(i4), "id", "events", Integer.toString(i5 - 1));
            SQLiteDatabase writableDatabase = this.f10568c.getWritableDatabase();
            if (writableDatabase != null) {
                F6 a3 = this.f10576k.a(writableDatabase, format, 1, this.f10573h.f11223b.f10837b, z);
                if (a3.f10273a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a3.f10273a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    ArrayList arrayList2 = this.f10575j;
                    int size = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList2.get(i6);
                        i6++;
                        ((S8) obj).b(arrayList);
                    }
                }
                List list = a3.f10273a;
                if (list != null) {
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        a((ContentValues) list.get(i7), "Event removed from db");
                    }
                }
                this.f10574i.addAndGet(-a3.f10274b);
            }
        } catch (Throwable unused) {
        }
        this.f10567b.unlock();
    }

    public final ContentValues a(long j4, Vk vk) {
        ContentValues contentValues = new ContentValues();
        this.f10566a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f10568c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j4 + " AND type = " + vk.f11151a + " ORDER BY id DESC LIMIT 1", null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC0779lo.a(cursor);
        this.f10566a.unlock();
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
        if (AbstractC1049w9.f12927d.contains(EnumC0508bb.a(asInteger != null ? asInteger.intValue() : -1))) {
            C0581e7 model = new C0607f7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f10573h.f11234m;
            EnumC0508bb enumC0508bb = model.f11732d;
            C0556d7 c0556d7 = model.f11735g;
            publicLogger.info(Qf.a(str, enumC0508bb, c0556d7.f11654b, c0556d7.f11655c), new Object[0]);
        }
    }

    public static boolean a(L6 l6) {
        boolean isEmpty;
        synchronized (l6.f10570e) {
            isEmpty = l6.f10571f.isEmpty();
        }
        return isEmpty;
    }
}
