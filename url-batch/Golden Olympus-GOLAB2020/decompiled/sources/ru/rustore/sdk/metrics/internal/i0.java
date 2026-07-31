package ru.rustore.sdk.metrics.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.rustore.sdk.metrics.MetricsException;
import ru.rustore.sdk.metrics.internal.w0;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f43711a;

    /* renamed from: b, reason: collision with root package name */
    public final W1.h f43712b;

    public static final class a extends kotlin.jvm.internal.s implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f43713a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.f43713a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f43713a;
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements Function0<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j0 f43714a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j0 j0Var) {
            super(0);
            this.f43714a = j0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            StringBuilder sb = new StringBuilder("Create row in storage ");
            sb.append((Object) ("MetricsEventUuid(value=" + this.f43714a.f43716a + ')'));
            return sb.toString();
        }
    }

    public i0(o metricsEventDataBaseHelper, w0.b logger) {
        Intrinsics.checkNotNullParameter(metricsEventDataBaseHelper, "metricsEventDataBaseHelper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f43711a = metricsEventDataBaseHelper;
        this.f43712b = W1.i.b(new e0(this));
    }

    public final void a(j0 persistentMetricsEventDto) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventDto, "persistentMetricsEventDto");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.UUID, persistentMetricsEventDto.f43716a);
        contentValues.put("metrics_event", persistentMetricsEventDto.f43717b);
        try {
            ((SQLiteDatabase) this.f43712b.getValue()).beginTransactionNonExclusive();
            long insert = ((SQLiteDatabase) this.f43712b.getValue()).insert("metrics_event_table", null, contentValues);
            ((SQLiteDatabase) this.f43712b.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) this.f43712b.getValue()).endTransaction();
            if (insert != -1) {
                b messageBuilder = new b(persistentMetricsEventDto);
                Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
                return;
            }
            StringBuilder sb = new StringBuilder("Saving error ");
            sb.append((Object) ("MetricsEventUuid(value=" + persistentMetricsEventDto.f43716a + ')'));
            String sb2 = sb.toString();
            a messageBuilder2 = new a(sb2);
            Intrinsics.checkNotNullParameter(messageBuilder2, "messageBuilder");
            throw new MetricsException.SaveMetricsEventError(sb2);
        } finally {
        }
    }

    public final void a(ArrayList persistentMetricsEventsDto) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventsDto, "persistentMetricsEventsDto");
        String joinToString$default = CollectionsKt.joinToString$default(persistentMetricsEventsDto, null, null, null, 0, null, g0.f43707a, 31, null);
        String f4 = StringsKt.f("\n            DELETE FROM metrics_event_table\n            WHERE _id IN (\n                SELECT _id FROM metrics_event_table\n                WHERE uuid IN (" + joinToString$default + ")\n            )\n        ");
        try {
            ((SQLiteDatabase) this.f43712b.getValue()).beginTransactionNonExclusive();
            ((SQLiteDatabase) this.f43712b.getValue()).execSQL(f4);
            ((SQLiteDatabase) this.f43712b.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) this.f43712b.getValue()).endTransaction();
            f0 messageBuilder = new f0(joinToString$default);
            Intrinsics.checkNotNullParameter(messageBuilder, "messageBuilder");
        } finally {
        }
    }
}
