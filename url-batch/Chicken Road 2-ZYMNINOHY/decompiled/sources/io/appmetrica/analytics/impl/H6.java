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
public final class H6 {

    /* renamed from: a, reason: collision with root package name */
    public final CounterConfigurationReporterType f10359a;

    public H6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f10359a = counterConfigurationReporterType;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:2|3)|(3:63|64|(10:66|(2:69|67)|70|6|7|8|9|(2:16|(8:19|77|27|28|(3:30|(5:34|35|(1:37)(1:41)|38|39)|40)|44|45|(2:49|50)))|59|60))|5|6|7|8|9|(4:11|13|16|(2:19|77))|59|60|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005a, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final F6 a(SQLiteDatabase sQLiteDatabase, String str, int i4, String str2, boolean z) {
        Cursor cursor;
        ArrayList arrayList;
        C0800mj c0800mj;
        C0748kj c0748kj;
        M3 m32;
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
                    Qj qj = AbstractC0852oj.f12527a;
                    qj.getClass();
                    qj.a(new C0878pj("select_rows_to_delete_exception", th));
                    AbstractC0779lo.a(cursor);
                    arrayList = null;
                    int i5 = 0;
                    int i6 = sQLiteDatabase.delete("events", str, null);
                    if (arrayList != null) {
                    }
                    return new F6(arrayList, i6);
                } finally {
                    AbstractC0779lo.a(cursor);
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
                if (arrayList != null && arrayList.size() != 0 && i62 == arrayList.size() && z) {
                    c0800mj = C0817na.f12417I.f12431f;
                    if (str2 != null && c0800mj != null) {
                        CounterConfigurationReporterType counterConfigurationReporterType = this.f10359a;
                        synchronized (c0800mj) {
                            c0748kj = (C0748kj) c0800mj.f12374c.get(str2);
                            if (c0748kj == null) {
                                c0748kj = new C0748kj(str2, c0800mj.f12373b, counterConfigurationReporterType, c0800mj.f12372a);
                                c0800mj.f12374c.put(str2, c0748kj);
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
                                    EnumC0508bb a3 = EnumC0508bb.a(asInteger2.intValue());
                                    if (a3 == null) {
                                        Map map = Pf.f10817a;
                                        num = null;
                                    } else {
                                        num = (Integer) Pf.f10819c.get(a3);
                                    }
                                    jSONArray2.put(num);
                                }
                            }
                            jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2);
                            JSONObject put = new JSONObject().put("details", new JSONObject().put("reason", G6.a(i4)).put("cleared", jSONObject).put("actual_deleted_number", i62));
                            PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                            String jSONObject2 = put.toString();
                            Set set = AbstractC1049w9.f12924a;
                            EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
                            m32 = new M3(jSONObject2, "", 12290, 0, orCreatePublicLogger);
                        } catch (Throwable unused) {
                            m32 = null;
                        }
                        if (m32 != null && c0748kj.f12242c != null) {
                            try {
                                CounterConfiguration counterConfiguration = new CounterConfiguration(c0748kj.f12240a);
                                counterConfiguration.setReporterType(c0748kj.f12242c);
                                ((B1) c0748kj.f12243d.f12469a).reportData(1, m32.d(new Fh(new Bf(c0748kj.f12241b, (ResultReceiver) null), counterConfiguration, new D8(new C0931rl(LoggerStorage.getOrCreatePublicLogger(c0748kj.f12240a), "Crash Environment")), null).c()));
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
                return new F6(arrayList, i62);
            }
        }
        arrayList = null;
        int i522 = 0;
        int i622 = sQLiteDatabase.delete("events", str, null);
        if (arrayList != null) {
            c0800mj = C0817na.f12417I.f12431f;
            if (str2 != null) {
                CounterConfigurationReporterType counterConfigurationReporterType2 = this.f10359a;
                synchronized (c0800mj) {
                }
            }
        }
        return new F6(arrayList, i622);
    }
}
