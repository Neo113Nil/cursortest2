package ru.rustore.sdk.metrics.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import f2.AbstractC2420c;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b0 {

    public static final class a extends kotlin.jvm.internal.s implements Function1<String, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43693a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            String it = (String) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return "'" + it + '\'';
        }
    }

    public b0(w migrationDtoVer1Factory, x migrationDtoVer1Serializer, z migrationDtoVer2Mapper, a0 migrationDtoVer2Serializer) {
        Intrinsics.checkNotNullParameter(migrationDtoVer1Factory, "migrationDtoVer1Factory");
        Intrinsics.checkNotNullParameter(migrationDtoVer1Serializer, "migrationDtoVer1Serializer");
        Intrinsics.checkNotNullParameter(migrationDtoVer2Mapper, "migrationDtoVer2Mapper");
        Intrinsics.checkNotNullParameter(migrationDtoVer2Serializer, "migrationDtoVer2Serializer");
    }

    public final void a(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        Cursor rawQuery = db.rawQuery("\n                SELECT * FROM metrics_event_table\n                ", new String[0]);
        try {
            int columnIndexOrThrow = rawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
            int columnIndexOrThrow2 = rawQuery.getColumnIndexOrThrow("metrics_event");
            while (rawQuery.moveToNext()) {
                String value = rawQuery.getString(columnIndexOrThrow);
                Intrinsics.checkNotNullExpressionValue(value, "cursor.getString(uuidColumnIndex)");
                Intrinsics.checkNotNullParameter(value, "value");
                byte[] blob = rawQuery.getBlob(columnIndexOrThrow2);
                Intrinsics.checkNotNullExpressionValue(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                arrayList.add(w.a(value, StringsKt.t(blob)));
            }
            Unit unit = Unit.f41027a;
            AbstractC2420c.a(rawQuery, null);
            if (arrayList.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder("\n                UPDATE metrics_event_table\n                SET metrics_event = CASE\n             ");
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                v dto = (v) obj;
                Intrinsics.checkNotNullParameter(dto, "dto");
                y dto2 = new y(dto.f43770a, dto.f43771b, dto.f43772c, System.currentTimeMillis());
                Intrinsics.checkNotNullParameter(dto, "dto");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", dto.f43771b);
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, String> entry : dto.f43772c.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("data", jSONObject2);
                String jSONObject3 = jSONObject.toString(i4);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "jsonObject.toString(0)");
                byte[] bytes = jSONObject3.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                Intrinsics.checkNotNullParameter(bytes, "<this>");
                String i02 = AbstractC3219i.i0(bytes, "", null, null, 0, null, ru.rustore.sdk.metrics.internal.a.f43689a, 30, null);
                Intrinsics.checkNotNullParameter(dto2, "dto");
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("name", dto2.f43781b);
                JSONObject jSONObject5 = new JSONObject();
                for (Map.Entry<String, String> entry2 : dto2.f43782c.entrySet()) {
                    jSONObject5.put(entry2.getKey(), entry2.getValue());
                    size = size;
                    arrayList = arrayList;
                }
                jSONObject4.put("data", jSONObject5);
                jSONObject4.put(CrashHianalyticsData.TIME, dto2.f43783d);
                String jSONObject6 = jSONObject4.toString(0);
                Intrinsics.checkNotNullExpressionValue(jSONObject6, "jsonObject.toString(0)");
                byte[] bytes2 = jSONObject6.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                Intrinsics.checkNotNullParameter(bytes2, "<this>");
                String str = "\n                WHEN metrics_event = x'" + i02 + "' THEN x'" + AbstractC3219i.i0(bytes2, "", null, null, 0, null, ru.rustore.sdk.metrics.internal.a.f43689a, 30, null) + "'\n            ";
                arrayList2.add(dto.f43770a);
                sb.append(str);
                i4 = 0;
                size = size;
                arrayList = arrayList;
            }
            sb.append("\n                END\n                WHERE uuid IN (" + CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, a.f43693a, 31, null) + ")\n            ");
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "updateQuery.toString()");
            db.execSQL(StringsKt.f(sb2));
        } finally {
        }
    }
}
