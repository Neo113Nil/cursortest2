package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2538c7 {

    /* renamed from: a, reason: collision with root package name */
    public final CounterConfigurationReporterType f38769a;

    /* renamed from: b, reason: collision with root package name */
    public final C3149zj f38770b;

    public C2538c7(CounterConfigurationReporterType counterConfigurationReporterType) {
        this(counterConfigurationReporterType, Ia.j().v());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|2|3|(3:63|64|(10:66|(2:69|67)|70|6|7|8|9|(8:19|7a|27|28|(3:30|(5:34|35|(1:37)(1:41)|38|39)|40)|44|45|(2:49|50))|59|60))|5|6|7|8|9|(5:11|13|17|19|7a)|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005f, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2484a7 a(SQLiteDatabase sQLiteDatabase, String str, int i4, String str2, boolean z4) {
        Cursor cursor;
        ArrayList arrayList;
        C3149zj c3149zj;
        C3097xj c3097xj;
        C2694i4 c2694i4;
        Integer num;
        try {
            cursor = sQLiteDatabase.rawQuery(String.format("SELECT %s, %s, %s FROM %s WHERE %s", "global_number", "type", "event_description", "events", str), null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        if (cursor != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    C2551ck c2551ck = Bj.f37257a;
                    c2551ck.getClass();
                    c2551ck.a(new Cj("select_rows_to_delete_exception", th));
                    AbstractC2713io.a(cursor);
                    arrayList = null;
                    int i5 = 0;
                    int i6 = sQLiteDatabase.delete("events", str, null);
                    if (arrayList != null) {
                    }
                    return new C2484a7(arrayList, i6);
                } finally {
                    AbstractC2713io.a(cursor);
                }
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i52 = 0;
                int i62 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i62 == arrayList.size() && z4 && str2 != null && (c3149zj = this.f38770b) != null) {
                    CounterConfigurationReporterType counterConfigurationReporterType = this.f38769a;
                    synchronized (c3149zj) {
                        c3097xj = (C3097xj) c3149zj.f40397c.get(str2);
                        if (c3097xj == null) {
                            c3097xj = new C3097xj(str2, c3149zj.f40396b, counterConfigurationReporterType, c3149zj.f40395a);
                            c3149zj.f40397c.put(str2, c3097xj);
                        }
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        int size = arrayList.size();
                        while (i52 < size) {
                            Object obj = arrayList.get(i52);
                            i52++;
                            ContentValues contentValues2 = (ContentValues) obj;
                            Integer asInteger = contentValues2.getAsInteger("global_number");
                            Integer asInteger2 = contentValues2.getAsInteger("type");
                            if (asInteger != null && asInteger2 != null) {
                                jSONArray.put(asInteger);
                                EnumC3063wb a4 = EnumC3063wb.a(asInteger2.intValue());
                                if (a4 == null) {
                                    Map map = AbstractC2547cg.f38778a;
                                    num = null;
                                } else {
                                    num = (Integer) AbstractC2547cg.f38780c.get(a4);
                                }
                                jSONArray2.put(num);
                            }
                        }
                        jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                        JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", AbstractC2511b7.a(i4)).put("cleared", jSONObject).put("actual_deleted_number", i62));
                        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                        String jSONObject2 = put.toString();
                        Set set = R9.f38186a;
                        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
                        c2694i4 = new C2694i4(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                    } catch (Throwable unused) {
                        c2694i4 = null;
                    }
                    if (c2694i4 != null && c3097xj.f40199c != null) {
                        try {
                            CounterConfiguration counterConfiguration = new CounterConfiguration(c3097xj.f40197a);
                            counterConfiguration.setReporterType(c3097xj.f40199c);
                            c3097xj.f40200d.f37188a.reportData(1, c2694i4.d(new Sh(new Pf(c3097xj.f40198b, (ResultReceiver) null), counterConfiguration, new W8(new C2943rl(LoggerStorage.getOrCreatePublicLogger(c3097xj.f40197a), "Crash Environment")), null).c()));
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return new C2484a7(arrayList, i62);
            }
        }
        arrayList = null;
        int i522 = 0;
        int i622 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            CounterConfigurationReporterType counterConfigurationReporterType2 = this.f38769a;
            synchronized (c3149zj) {
            }
        }
        return new C2484a7(arrayList, i622);
    }

    public C2538c7(CounterConfigurationReporterType counterConfigurationReporterType, C3149zj c3149zj) {
        this.f38769a = counterConfigurationReporterType;
        this.f38770b = c3149zj;
    }
}
