package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class B7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C3111y7 f37210a;

    /* JADX WARN: Multi-variable type inference failed */
    public B7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull A7 a7) {
        ContentValues contentValues = new ContentValues();
        Long l4 = a7.f37157a;
        if (l4 != null) {
            contentValues.put("session_id", Long.valueOf(l4.longValue()));
        }
        Wk wk = a7.f37158b;
        if (wk != null) {
            contentValues.put("session_type", Integer.valueOf(wk.f38487a));
        }
        Long l5 = a7.f37159c;
        if (l5 != null) {
            contentValues.put("number_in_session", Long.valueOf(l5.longValue()));
        }
        EnumC3063wb enumC3063wb = a7.f37160d;
        if (enumC3063wb != null) {
            contentValues.put("type", Integer.valueOf(enumC3063wb.f40073a));
        }
        Long l6 = a7.f37161e;
        if (l6 != null) {
            contentValues.put("global_number", Long.valueOf(l6.longValue()));
        }
        Long l7 = a7.f37162f;
        if (l7 != null) {
            contentValues.put(CrashHianalyticsData.TIME, Long.valueOf(l7.longValue()));
        }
        C3111y7 c3111y7 = this.f37210a;
        contentValues.put("event_description", MessageNano.toByteArray(c3111y7.f40261a.fromModel(a7.f37163g)));
        return contentValues;
    }

    public B7(@NotNull C3111y7 c3111y7) {
        this.f37210a = c3111y7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ B7(C3111y7 c3111y7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new C3111y7(null, 1, 0 == true ? 1 : 0) : c3111y7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A7 toModel(@NotNull ContentValues contentValues) {
        Wk wk;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            wk = Wk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                wk = Wk.BACKGROUND;
            }
        } else {
            wk = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new A7(asLong, wk, asLong2, asInteger2 != null ? EnumC3063wb.a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong(CrashHianalyticsData.TIME), this.f37210a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
