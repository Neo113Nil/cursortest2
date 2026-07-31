package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class P7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final M7 f38119a;

    /* JADX WARN: Multi-variable type inference failed */
    public P7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(@NotNull O7 o7) {
        ContentValues contentValues = new ContentValues();
        Long l4 = o7.f38053a;
        if (l4 != null) {
            contentValues.put("id", Long.valueOf(l4.longValue()));
        }
        Wk wk = o7.f38054b;
        if (wk != null) {
            contentValues.put("type", Integer.valueOf(wk.f38487a));
        }
        String str = o7.f38055c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        M7 m7 = this.f38119a;
        contentValues.put("session_description", MessageNano.toByteArray(m7.f37970a.fromModel(o7.f38056d)));
        return contentValues;
    }

    public P7(@NotNull M7 m7) {
        this.f38119a = m7;
    }

    public /* synthetic */ P7(M7 m7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new M7(null, 1, null) : m7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O7 toModel(@NotNull ContentValues contentValues) {
        Wk wk;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int intValue = asInteger.intValue();
            wk = Wk.FOREGROUND;
            if (intValue != 0 && intValue == 1) {
                wk = Wk.BACKGROUND;
            }
        } else {
            wk = null;
        }
        return new O7(asLong, wk, contentValues.getAsString("report_request_parameters"), this.f38119a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
