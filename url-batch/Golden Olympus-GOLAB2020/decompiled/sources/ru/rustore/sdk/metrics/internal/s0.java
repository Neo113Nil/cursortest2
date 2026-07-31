package ru.rustore.sdk.metrics.internal;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import f2.AbstractC2420c;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import ru.rustore.sdk.metrics.MetricsEvent;
import ru.rustore.sdk.metrics.internal.v0;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f43762a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f43763b;

    public s0(n0 persistentMetricsEventRepository, r0 remoteMetricsEventRepository) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventRepository, "persistentMetricsEventRepository");
        Intrinsics.checkNotNullParameter(remoteMetricsEventRepository, "remoteMetricsEventRepository");
        this.f43762a = persistentMetricsEventRepository;
        this.f43763b = remoteMetricsEventRepository;
    }

    public final v0 a() {
        String str;
        String a4;
        i0 i0Var = this.f43762a.f43729a;
        String f4 = StringsKt.f("\n            SELECT * FROM metrics_event_table\n            LIMIT 10\n        ");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        Cursor rawQuery = ((SQLiteDatabase) i0Var.f43712b.getValue()).rawQuery(f4, new String[0]);
        try {
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
            int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("metrics_event");
            while (rawQuery.moveToNext()) {
                String value = rawQuery.getString(columnIndexOrThrow);
                Intrinsics.checkNotNullExpressionValue(value, "cursor.getString(uuidColumnIndex)");
                Intrinsics.checkNotNullParameter(value, "value");
                byte[] blob = rawQuery.getBlob(columnIndexOrThrow2);
                Intrinsics.checkNotNullExpressionValue(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                arrayList.add(new j0(value, blob));
            }
            Unit unit = Unit.f41027a;
            AbstractC2420c.a(rawQuery, null);
            List<j0> list = CollectionsKt.toList(arrayList);
            h0 messageBuilder = new h0(list);
            Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
            ArrayList values = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (j0 dto : list) {
                Intrinsics.checkNotNullParameter(dto, "dto");
                String str2 = dto.f43716a;
                String jsonString = StringsKt.t(dto.f43717b);
                Intrinsics.checkNotNullParameter(jsonString, "jsonString");
                JSONObject jSONObject = new JSONObject(jsonString);
                String string = jSONObject.getString("name");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(NAME_KEY)");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
                Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> keys = jSONObject2.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList2.add(TuplesKt.to(next, jSONObject2.get(next).toString()));
                }
                values.add(new d0(str2, new MetricsEvent(string, MapsKt.toMap(arrayList2), jSONObject.getLong(CrashHianalyticsData.TIME))));
            }
            if (values.isEmpty()) {
                return v0.a.f43773a;
            }
            r0 r0Var = this.f43763b;
            Intrinsics.checkNotNullParameter(values, "values");
            String value2 = r0Var.f43757b.f43695a.getPackageName();
            Intrinsics.checkNotNullExpressionValue(value2, "context.packageName");
            Intrinsics.checkNotNullParameter(value2, "value");
            a1 a1Var = r0Var.f43756a;
            SharedPreferences sharedPreferences = a1Var.f43691a.f43779a;
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
            String value3 = sharedPreferences.getString("USER_ID_KEY", null);
            if (value3 != null) {
                Intrinsics.checkNotNullParameter(value3, "value");
            } else {
                value3 = null;
            }
            if (value3 == null) {
                synchronized (a1.f43690c) {
                    try {
                        SharedPreferences sharedPreferences2 = a1Var.f43691a.f43779a;
                        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "sharedPreferences");
                        String value4 = sharedPreferences2.getString("USER_ID_KEY", null);
                        if (value4 != null) {
                            Intrinsics.checkNotNullParameter(value4, "value");
                        } else {
                            value4 = null;
                        }
                        a4 = value4 == null ? a1Var.a() : value4;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                str = a4;
            } else {
                str = value3;
            }
            c1 c1Var = (c1) r0Var.f43759d.f43701b.getValue();
            String str3 = c1Var != null ? c1Var.f43696a : null;
            ArrayList values2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
            int size = values.size();
            while (i4 < size) {
                Object obj = values.get(i4);
                i4++;
                d0 d0Var = (d0) obj;
                values2.add(new p0(value2, d0Var.f43698a, str, str3, d0Var.f43699b));
            }
            o0 o0Var = r0Var.f43758c;
            Intrinsics.checkNotNullParameter(values2, "values");
            o0Var.f43733a.b(values2);
            return new v0.b(values);
        } finally {
        }
    }
}
