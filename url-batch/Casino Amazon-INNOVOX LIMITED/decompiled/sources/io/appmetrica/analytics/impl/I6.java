package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class I6 {

    /* renamed from: a, reason: collision with root package name */
    public final CounterConfigurationReporterType f886a;

    public I6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f886a = counterConfigurationReporterType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|3|(3:63|64|(9:66|(2:69|67)|70|6|7|8|(2:15|(8:18|7a|26|27|(4:30|(5:34|35|(1:37)(1:41)|38|39)|40|28)|44|45|(2:49|50)))|59|60))|5|6|7|8|(4:10|12|15|(2:18|7a))|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005d, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final G6 a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z) {
        Cursor cursor;
        ArrayList<ContentValues> arrayList;
        C0385nj c0385nj;
        C0335lj c0335lj;
        N3 n3;
        Integer num;
        try {
            cursor = sQLiteDatabase.rawQuery(String.format("SELECT %s, %s, %s FROM %s WHERE %s", "global_number", WebViewManager.EVENT_TYPE_KEY, "event_description", "events", str), null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        if (cursor != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    Rj rj = AbstractC0435pj.f1437a;
                    rj.getClass();
                    rj.a(new C0460qj("select_rows_to_delete_exception", th));
                    mo.a(cursor);
                    arrayList = null;
                    int i2 = sQLiteDatabase.delete("events", str, null);
                    if (arrayList != null) {
                    }
                    return new G6(arrayList, i2);
                } finally {
                    mo.a(cursor);
                }
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i22 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i22 == arrayList.size() && z) {
                    c0385nj = C0401oa.I.f;
                    if (str2 != null && c0385nj != null) {
                        CounterConfigurationReporterType counterConfigurationReporterType = this.f886a;
                        synchronized (c0385nj) {
                            c0335lj = (C0335lj) c0385nj.c.get(str2);
                            if (c0335lj == null) {
                                c0335lj = new C0335lj(str2, c0385nj.b, counterConfigurationReporterType, c0385nj.f1399a);
                                c0385nj.c.put(str2, c0335lj);
                            }
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            JSONArray jSONArray2 = new JSONArray();
                            for (ContentValues contentValues2 : arrayList) {
                                Integer asInteger = contentValues2.getAsInteger("global_number");
                                Integer asInteger2 = contentValues2.getAsInteger(WebViewManager.EVENT_TYPE_KEY);
                                if (asInteger != null && asInteger2 != null) {
                                    jSONArray.put(asInteger);
                                    EnumC0095cb a2 = EnumC0095cb.a(asInteger2.intValue());
                                    if (a2 == null) {
                                        Map map = Qf.f1016a;
                                        num = null;
                                    } else {
                                        num = (Integer) Qf.c.get(a2);
                                    }
                                    jSONArray2.put(num);
                                }
                            }
                            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                            JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", H6.a(i)).put("cleared", jSONObject).put("actual_deleted_number", i22));
                            PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                            String jSONObject2 = put.toString();
                            Set set = AbstractC0624x9.f1563a;
                            EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_UNDEFINED;
                            n3 = new N3(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                        } catch (Throwable unused) {
                            n3 = null;
                        }
                        if (n3 != null && c0335lj.c != null) {
                            try {
                                CounterConfiguration counterConfiguration = new CounterConfiguration(c0335lj.f1361a);
                                counterConfiguration.setReporterType(c0335lj.c);
                                ((C1) c0335lj.d.f1418a).reportData(1, n3.d(new Gh(new Cf(c0335lj.b, (ResultReceiver) null), counterConfiguration, new E8(new C0511sl(LoggerStorage.getOrCreatePublicLogger(c0335lj.f1361a), "Crash Environment")), null).c()));
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                return new G6(arrayList, i22);
            }
        }
        arrayList = null;
        int i222 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            c0385nj = C0401oa.I.f;
            if (str2 != null) {
                CounterConfigurationReporterType counterConfigurationReporterType2 = this.f886a;
                synchronized (c0385nj) {
                }
            }
        }
        return new G6(arrayList, i222);
    }
}
