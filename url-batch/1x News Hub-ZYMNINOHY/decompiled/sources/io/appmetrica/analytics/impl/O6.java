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

/* loaded from: classes.dex */
public final class O6 {

    /* renamed from: a, reason: collision with root package name */
    public final CounterConfigurationReporterType f6399a;

    /* renamed from: b, reason: collision with root package name */
    public final C0807rj f6400b;

    public O6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this(counterConfigurationReporterType, C0876ua.k().w());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:2|3)|(3:63|64|(9:66|(2:69|67)|70|6|7|8|(8:18|74|26|27|(4:30|(5:34|35|(1:37)(1:41)|38|39)|40|28)|44|45|(2:49|50))|59|60))|5|6|7|8|(5:10|12|16|18|74)|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0059, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M6 a(SQLiteDatabase sQLiteDatabase, String str, int i3, String str2, boolean z) {
        Cursor cursor;
        ArrayList<ContentValues> arrayList;
        C0807rj c0807rj;
        C0756pj c0756pj;
        U3 u3;
        Integer num;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT global_number, type, event_description FROM events WHERE " + str, null);
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        if (cursor != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                try {
                    Vj vj = AbstractC0859tj.f8379a;
                    vj.getClass();
                    vj.a(new C0885uj("select_rows_to_delete_exception", th));
                    AbstractC0709no.a(cursor);
                    arrayList = null;
                    int i4 = sQLiteDatabase.delete("events", str, null);
                    if (arrayList != null) {
                    }
                    return new M6(arrayList, i4);
                } finally {
                    AbstractC0709no.a(cursor);
                }
            }
            if (cursor.getCount() > 0) {
                arrayList = new ArrayList(cursor.getCount());
                while (cursor.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                    arrayList.add(contentValues);
                }
                int i42 = sQLiteDatabase.delete("events", str, null);
                if (arrayList != null && arrayList.size() != 0 && i42 == arrayList.size() && z && str2 != null && (c0807rj = this.f6400b) != null) {
                    CounterConfigurationReporterType counterConfigurationReporterType = this.f6399a;
                    synchronized (c0807rj) {
                        c0756pj = (C0756pj) c0807rj.f8251c.get(str2);
                        if (c0756pj == null) {
                            c0756pj = new C0756pj(str2, c0807rj.f8250b, counterConfigurationReporterType, c0807rj.f8249a);
                            c0807rj.f8251c.put(str2, c0756pj);
                        }
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        for (ContentValues contentValues2 : arrayList) {
                            Integer asInteger = contentValues2.getAsInteger("global_number");
                            Integer asInteger2 = contentValues2.getAsInteger("type");
                            if (asInteger != null && asInteger2 != null) {
                                jSONArray.put(asInteger);
                                EnumC0567ib a3 = EnumC0567ib.a(asInteger2.intValue());
                                if (a3 == null) {
                                    Map map = Uf.f6759a;
                                    num = null;
                                } else {
                                    num = (Integer) Uf.f6761c.get(a3);
                                }
                                jSONArray2.put(num);
                            }
                        }
                        jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                        JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", N6.a(i3)).put("cleared", jSONObject).put("actual_deleted_number", i42));
                        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                        String jSONObject2 = put.toString();
                        Set set = D9.f5886a;
                        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
                        u3 = new U3(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                    } catch (Throwable unused) {
                        u3 = null;
                    }
                    if (u3 != null && c0756pj.f8102c != null) {
                        try {
                            CounterConfiguration counterConfiguration = new CounterConfiguration(c0756pj.f8100a);
                            counterConfiguration.setReporterType(c0756pj.f8102c);
                            c0756pj.f8103d.f8320a.reportData(1, u3.d(new Kh(new Gf(c0756pj.f8101b, (ResultReceiver) null), counterConfiguration, new I8(new C0913vl(LoggerStorage.getOrCreatePublicLogger(c0756pj.f8100a), "Crash Environment")), null).c()));
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return new M6(arrayList, i42);
            }
        }
        arrayList = null;
        int i422 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            CounterConfigurationReporterType counterConfigurationReporterType2 = this.f6399a;
            synchronized (c0807rj) {
            }
        }
        return new M6(arrayList, i422);
    }

    public O6(CounterConfigurationReporterType counterConfigurationReporterType, C0807rj c0807rj) {
        this.f6399a = counterConfigurationReporterType;
        this.f6400b = c0807rj;
    }
}
