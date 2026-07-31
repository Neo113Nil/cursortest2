package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ironsource.b9;
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

/* renamed from: io.appmetrica.analytics.impl.g7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2645g7 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f39042a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f39043b;

    /* renamed from: c, reason: collision with root package name */
    public final C2981t7 f39044c;

    /* renamed from: d, reason: collision with root package name */
    public final C2618f7 f39045d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f39046e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f39047f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f39048g;

    /* renamed from: h, reason: collision with root package name */
    public final C2953s5 f39049h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f39050i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f39051j;

    /* renamed from: k, reason: collision with root package name */
    public final C2538c7 f39052k;

    /* renamed from: l, reason: collision with root package name */
    public final B7 f39053l;

    static {
        HashSet hashSet = new HashSet();
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public C2645g7(C2953s5 c2953s5, C2981t7 c2981t7, C2538c7 c2538c7, B7 b7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f39042a = reentrantReadWriteLock.readLock();
        this.f39043b = reentrantReadWriteLock.writeLock();
        this.f39046e = new Object();
        this.f39047f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f39050i = atomicLong;
        this.f39051j = new ArrayList();
        this.f39044c = c2981t7;
        this.f39048g = c2953s5.getContext();
        this.f39049h = c2953s5;
        this.f39052k = c2538c7;
        this.f39053l = b7;
        atomicLong.set(c());
        C2618f7 c2618f7 = new C2618f7(this, c2953s5);
        this.f39045d = c2618f7;
        c2618f7.setName(a(c2953s5));
    }

    public final long a(Set set) {
        this.f39042a.lock();
        Cursor cursor = null;
        long j4 = 0;
        try {
            SQLiteDatabase readableDatabase = this.f39044c.getReadableDatabase();
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
        AbstractC2713io.a(cursor);
        this.f39042a.unlock();
        return j4;
    }

    public final long b() {
        this.f39042a.lock();
        try {
            return this.f39050i.get();
        } finally {
            this.f39042a.unlock();
        }
    }

    public final long c() {
        long j4;
        SQLiteDatabase readableDatabase;
        this.f39042a.lock();
        try {
            readableDatabase = this.f39044c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j4 = DBUtils.queryRowsCount(readableDatabase, "events");
            this.f39042a.unlock();
            return j4;
        }
        j4 = 0;
        this.f39042a.unlock();
        return j4;
    }

    public final void d() {
        Cursor cursor;
        Cursor cursor2;
        this.f39042a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.f39044c.getReadableDatabase();
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
                    this.f39042a.unlock();
                    AbstractC2713io.a(cursor2);
                    AbstractC2713io.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f39042a.unlock();
        AbstractC2713io.a(cursor2);
        AbstractC2713io.a(cursor3);
    }

    public final void e() {
        this.f39045d.start();
    }

    public final void a(InterfaceC2776l9 interfaceC2776l9) {
        this.f39051j.add(interfaceC2776l9);
    }

    public static String a(Za za) {
        return "DatabaseWorker [" + za.b().e() + b9.i.f15552e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j4, Wk wk, long j5) {
        JSONObject jSONObject;
        boolean b4;
        P7 p7 = new P7(null, 1, 0 == true ? 1 : 0);
        C3095xh c3095xh = (C3095xh) this.f39049h.f39775k.a();
        Long valueOf = Long.valueOf(j4);
        Long valueOf2 = Long.valueOf(j5);
        try {
            jSONObject = new JSONObject().put("dId", c3095xh.getDeviceId()).put("uId", c3095xh.getUuid()).put("appVer", c3095xh.getAppVersion()).put("appBuild", c3095xh.getAppBuildNumber()).put("kitBuildType", c3095xh.getAnalyticsSdkBuildType()).put("osVer", c3095xh.getOsVersion()).put("osApiLev", c3095xh.getOsApiLevel()).put(com.ironsource.ge.f16487q, c3095xh.getLocale()).put("root", c3095xh.getDeviceRootStatus()).put("app_debuggable", ((C2721j6) c3095xh).f39261a).put(CommonUrlParts.APP_FRAMEWORK, c3095xh.getAppFramework()).put("attribution_id", c3095xh.f40191r).put("analyticsSdkVersionName", c3095xh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c3095xh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(Fn.a());
        C2684hk c2684hk = AbstractC2658gk.f39100a;
        synchronized (c2684hk) {
            b4 = c2684hk.f39156b.b(true);
        }
        ContentValues fromModel = p7.fromModel(new O7(valueOf, wk, jSONObject2, new N7(valueOf2, valueOf3, Boolean.valueOf(b4))));
        if (fromModel == null) {
            return;
        }
        this.f39043b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f39044c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f39043b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f39046e) {
            this.f39047f.add(contentValues);
        }
        synchronized (this.f39045d) {
            this.f39045d.notifyAll();
        }
    }

    public final void a() {
        SQLiteDatabase writableDatabase;
        try {
            this.f39043b.lock();
            if (this.f39050i.get() > ((C3095xh) this.f39049h.f39775k.a()).f40195v && (writableDatabase = this.f39044c.getWritableDatabase()) != null) {
                int a4 = a(writableDatabase);
                this.f39050i.addAndGet(-a4);
                if (a4 != 0) {
                    ArrayList arrayList = this.f39051j;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((InterfaceC2776l9) obj).a();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f39043b.unlock();
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f39052k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", R9.f38194i), TextUtils.join(", ", R9.f38195j), 10), 2, this.f39049h.f39766b.f39375b, true).f38665b;
        } catch (Throwable th) {
            C2551ck c2551ck = Bj.f37257a;
            c2551ck.getClass();
            c2551ck.a(new Cj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j4, int i4, int i5, boolean z4) {
        if (i5 <= 0) {
            return;
        }
        this.f39043b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j4), "session_type", Integer.toString(i4), "id", "events", Integer.toString(i5 - 1));
            SQLiteDatabase writableDatabase = this.f39044c.getWritableDatabase();
            if (writableDatabase != null) {
                C2484a7 a4 = this.f39052k.a(writableDatabase, format, 1, this.f39049h.f39766b.f39375b, z4);
                if (a4.f38664a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a4.f38664a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    ArrayList arrayList2 = this.f39051j;
                    int size = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList2.get(i6);
                        i6++;
                        ((InterfaceC2776l9) obj).b(arrayList);
                    }
                }
                List list = a4.f38664a;
                if (list != null) {
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        a((ContentValues) list.get(i7), "Event removed from db");
                    }
                }
                this.f39050i.addAndGet(-a4.f38665b);
            }
        } catch (Throwable unused) {
        }
        this.f39043b.unlock();
    }

    public final ContentValues a(long j4, Wk wk) {
        ContentValues contentValues = new ContentValues();
        this.f39042a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f39044c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", Long.valueOf(j4), Integer.valueOf(wk.f38487a)), null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        AbstractC2713io.a(cursor);
        this.f39042a.unlock();
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
        if (R9.f38189d.contains(EnumC3063wb.a(asInteger != null ? asInteger.intValue() : -1))) {
            A7 model = new B7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f39049h.f39777m;
            EnumC3063wb enumC3063wb = model.f37160d;
            C3137z7 c3137z7 = model.f37163g;
            publicLogger.info(AbstractC2574dg.a(str, enumC3063wb, c3137z7.f40305b, c3137z7.f40306c), new Object[0]);
        }
    }

    public static boolean a(C2645g7 c2645g7) {
        boolean isEmpty;
        synchronized (c2645g7.f39046e) {
            isEmpty = c2645g7.f39047f.isEmpty();
        }
        return isEmpty;
    }
}
